package br.com.douglasramiro.imac.score.repository;

import br.com.douglasramiro.imac.score.entity.Class;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ClassRepository extends GenericRepository<Class> {

    public List<Class> listAll(){
        return entityManager.createNamedQuery("class.findAll",Class.class)
                .getResultList();
    }
}
