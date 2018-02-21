package br.com.douglasramiro.imac.score.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_class")
@NamedQueries({
        @NamedQuery(name = "class.findAll", query = "Select c from Class c order by id")
})
public class Class implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;
    private String name;
    private Boolean active;

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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
