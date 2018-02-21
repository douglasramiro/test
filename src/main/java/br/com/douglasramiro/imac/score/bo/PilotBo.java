package br.com.douglasramiro.imac.score.bo;

import br.com.douglasramiro.imac.score.entity.Pilot;
import br.com.douglasramiro.imac.score.repository.PilotRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class PilotBo {

    @EJB
    private PilotRepository pilotRepository;

    public Pilot save(Pilot pilot){
        return pilotRepository.save(pilot);
    }


    public List<Pilot> listAll() {
        return pilotRepository.listAll();
    }
}
