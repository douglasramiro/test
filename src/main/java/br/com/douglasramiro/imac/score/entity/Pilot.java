package br.com.douglasramiro.imac.score.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_pilot")
@NamedQueries({
        @NamedQuery(name = "pilot.findAll", query = "Select p from Pilot p order by p.name")
})
public class Pilot implements Serializable{

    @Id
    @GeneratedValue
    private Short id;

    private String name;

    private String bra;

    private String address;

    private String airplane;

    private String comments;

    private String frequency;

    private Boolean missingPilotPanel;

    @ManyToOne
    private Class pilotClass;


    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBra() {
        return bra;
    }

    public void setBra(String bra) {
        this.bra = bra;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAirplane() {
        return airplane;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Class getPilotClass() {
        return pilotClass;
    }

    public void setPilotClass(Class pilotClass) {
        this.pilotClass = pilotClass;
    }

    public Boolean getMissingPilotPanel() {
        return missingPilotPanel;
    }

    public void setMissingPilotPanel(Boolean missingPilotPanel) {
        this.missingPilotPanel = missingPilotPanel;
    }
}
