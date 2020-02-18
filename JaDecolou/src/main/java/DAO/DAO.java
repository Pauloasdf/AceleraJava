package DAO;

import domain.BaseEntity;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public abstract class DAO<T extends BaseEntity> {
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public DAO() {
    }

    protected abstract String getSqlString();

    protected abstract Class getClassName();

    private void begin() {
        this.emf = Persistence.createEntityManagerFactory("reserva-pu");
        this.em = this.emf.createEntityManager();
        this.em.getTransaction().begin();
    }

    private void close() {
        if (Objects.nonNull(this.em)) {
            if (this.em.getTransaction().isActive()) {
                this.em.getTransaction().commit();
            }

            this.em.close();
        }

        if (Objects.nonNull(this.emf)) {
            this.emf.close();
        }

    }

    public void salvar(T domain) {
        this.begin();
        this.em.persist(domain);
        this.close();
    }

    public void atualizar(T domain) {
        this.begin();
        this.em.persist(domain);
        this.close();
    }

    public void deletar(T domain) {
        this.begin();
        this.em.remove(domain);
        this.close();
    }

    public List<T> listarTodos() {
        this.begin();
        Query query = this.em.createQuery(this.getSqlString());
        List<T> list = query.getResultList();
        this.close();
        return list;
    }

    public T findById(T domain) {
        this.begin();
        T value = (BaseEntity)this.em.find(this.getClassName(), domain.getId());
        this.close();
        return value;
    }
}
