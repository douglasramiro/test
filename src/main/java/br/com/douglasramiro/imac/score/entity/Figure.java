package br.com.douglasramiro.imac.score.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_figure")
public class Figure implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String description;
    private String imageBase64;
    private Short kValue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public Short getkValue() {
        return kValue;
    }

    public void setkValue(Short kValue) {
        this.kValue = kValue;
    }
}
