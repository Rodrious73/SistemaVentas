package dao;

import dao.exceptions.NonexistentEntityException;
import dto.Empleados;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class EmpleadosJpaController implements Serializable {

    public EmpleadosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_SistemaVentas_jar_1.0-SNAPSHOTPU");

    public EmpleadosJpaController() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Empleados empleados) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(empleados);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Empleados empleados) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            empleados = em.merge(empleados);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = empleados.getId();
                if (findEmpleados(id) == null) {
                    throw new NonexistentEntityException("The empleados with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empleados empleados;
            try {
                empleados = em.getReference(Empleados.class, id);
                empleados.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The empleados with id " + id + " no longer exists.", enfe);
            }
            em.remove(empleados);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Empleados> findEmpleadosEntities() {
        return findEmpleadosEntities(true, -1, -1);
    }

    public List<Empleados> findEmpleadosEntities(int maxResults, int firstResult) {
        return findEmpleadosEntities(false, maxResults, firstResult);
    }

    private List<Empleados> findEmpleadosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Empleados.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Empleados findEmpleados(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Empleados.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmpleadosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Empleados> rt = cq.from(Empleados.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public Empleados iniciarSesion(String correo, String pass) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Empleados.validarInicio");
            q.setParameter("correoEmple", correo);
            q.setParameter("passEmple", pass);
            Empleados emple = (Empleados) q.getSingleResult();
            if (emple != null) {
                return emple;
            }
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }

    public Empleados findEmpleadoByCorreo(String correo) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Empleados.findByCorreoEmple");
            q.setParameter("correoEmple", correo);
            Empleados empleado = (Empleados) q.getSingleResult();
            return empleado;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }
    
    public Empleados findEmpleadoByDniEmple(String dni) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Empleados.findByDniEmple");
            q.setParameter("dniEmple", dni);
            Empleados empleado = (Empleados) q.getSingleResult();
            return empleado;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }

    public int cambiarContrasenia(String correo, String nuevaContrasenia) {
        EntityManager em = getEntityManager();
        try {
            Empleados empleado = findEmpleadoByCorreo(correo);

            if (empleado != null) {
                empleado.setPassEmple(nuevaContrasenia);
                try {
                    edit(empleado);
                    return 1;
                } catch (Exception e) {
                    return 0;
                }
            } else {
                return 0;
            }
        }catch(Exception e){
            return 0;
        }finally{
            em.close();
        }

    }
    
    public List<Empleados> buscarEmpleados(String dni){
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Empleados.busquedaDNI");
            String ndni = dni+"%";
            q.setParameter("dniEmple", ndni);
            List<Empleados> lista = q.getResultList();
            return lista;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }

}
