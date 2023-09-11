package dao;

import dao.exceptions.NonexistentEntityException;
import dto.Despedidos;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DespedidosJpaController implements Serializable {

    public DespedidosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_SistemaVentas_jar_1.0-SNAPSHOTPU");

    public DespedidosJpaController() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Despedidos despedidos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(despedidos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Despedidos despedidos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            despedidos = em.merge(despedidos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = despedidos.getIdEmp();
                if (findDespedidos(id) == null) {
                    throw new NonexistentEntityException("The despedidos with id " + id + " no longer exists.");
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
            Despedidos despedidos;
            try {
                despedidos = em.getReference(Despedidos.class, id);
                despedidos.getIdEmp();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The despedidos with id " + id + " no longer exists.", enfe);
            }
            em.remove(despedidos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Despedidos> findDespedidosEntities() {
        return findDespedidosEntities(true, -1, -1);
    }

    public List<Despedidos> findDespedidosEntities(int maxResults, int firstResult) {
        return findDespedidosEntities(false, maxResults, firstResult);
    }

    private List<Despedidos> findDespedidosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Despedidos.class));
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

    public Despedidos findDespedidos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Despedidos.class, id);
        } finally {
            em.close();
        }
    }

    public int getDespedidosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Despedidos> rt = cq.from(Despedidos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Despedidos> buscarEmpleadosDespedidos(String dni){
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Despedidos.buscarEmpleDni");
            String ndni = dni+"%";
            q.setParameter("dniEmple", ndni);
            List<Despedidos> lista = q.getResultList();
            return lista;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }
    
}
