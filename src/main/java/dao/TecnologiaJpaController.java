/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.exceptions.NonexistentEntityException;
import dto.Tecnologia;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author rodrious
 */
public class TecnologiaJpaController implements Serializable {

    public TecnologiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_SistemaVentas_jar_1.0-SNAPSHOTPU");

    public TecnologiaJpaController() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tecnologia tecnologia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tecnologia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tecnologia tecnologia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tecnologia = em.merge(tecnologia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tecnologia.getIdproducto();
                if (findTecnologia(id) == null) {
                    throw new NonexistentEntityException("The tecnologia with id " + id + " no longer exists.");
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
            Tecnologia tecnologia;
            try {
                tecnologia = em.getReference(Tecnologia.class, id);
                tecnologia.getIdproducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tecnologia with id " + id + " no longer exists.", enfe);
            }
            em.remove(tecnologia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tecnologia> findTecnologiaEntities() {
        return findTecnologiaEntities(true, -1, -1);
    }

    public List<Tecnologia> findTecnologiaEntities(int maxResults, int firstResult) {
        return findTecnologiaEntities(false, maxResults, firstResult);
    }

    private List<Tecnologia> findTecnologiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tecnologia.class));
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

    public Tecnologia findTecnologia(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tecnologia.class, id);
        } finally {
            em.close();
        }
    }

    public int getTecnologiaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tecnologia> rt = cq.from(Tecnologia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Tecnologia> buscarClientes(String nombre){
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("Tecnologia.buscarPorNombre");
            String nombrepro = "%"+nombre+"%";
            q.setParameter("nombreproducto", nombrepro);
            List<Tecnologia> lista = q.getResultList();
            return lista;
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }
    
}
