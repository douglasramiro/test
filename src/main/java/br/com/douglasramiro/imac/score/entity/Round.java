package br.com.douglasramiro.imac.score.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table("tb_round")
public class Round implements Serializable{

    @Id
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private Sequence sequence;

    @ManyToMany
    private List<User> judges;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public List<User> getJudges() {
        return judges;
    }

    public void setJudges(List<User> judges) {
        this.judges = judges;
    }
}
