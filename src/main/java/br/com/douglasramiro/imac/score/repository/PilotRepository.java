package br.com.douglasramiro.imac.score.repository;

import br.com.douglasramiro.imac.score.entity.Pilot;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class PilotRepository extends GenericRepository<Pilot> {

    public List<Pilot> listAll() {
        return entityManager.createNamedQuery("pilot.findAll",Pilot.class)
                .getResultList();
    }
}
