package br.com.douglasramiro.imac.score.repository;


import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GenericRepository<T> {


    @PersistenceContext
    protected EntityManager entityManager;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public T save(T t){
        return entityManager.merge(t);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void delete(T t){
        entityManager.remove(t);
    }

}
