package br.com.douglasramiro.imac.score.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
public class User implements Serializable{

    private static final long serialVersionUID = -419776859208515437L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String cpf;
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(name = "TB_USER_ROLE")
    private List<Role> roles;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        if (roles == null){
            roles = new ArrayList<>();
        }
        return roles;
    }

    public void addRole(Role role){
        getRoles().add(role);
    }

    public void removeRole(Role role){
        getRoles().remove(role);
    }
}
