
package primeraEntregaArg.entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Especialidad {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Column
    private String nombre;
    
    @ManyToMany(mappedBy = "especialidades")
    private List<Tecnico> tecnicos;
    
    @ManyToMany
      @JoinTable(
      name = "especialidad_tipoproblema", 
      joinColumns = @JoinColumn(name = "especialidad_id"), 
      inverseJoinColumns = @JoinColumn(name = "tipoproblema_id"))
    private List<TipoProblema> problemasResueltos;

    public Especialidad() {
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public List<TipoProblema> getProblemasResueltos() {
        return problemasResueltos;
    }

    public void setProblemasResueltos(List<TipoProblema> problemasResueltos) {
        this.problemasResueltos = problemasResueltos;
    }
    
    
    
    
}
