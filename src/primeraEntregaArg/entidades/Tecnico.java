
package primeraEntregaArg.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
//import org.hibernate.annotations.GenericGenerator;

@Entity
public class Tecnico {
    
    @Id
    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @Column(nullable = false)
    private String nombre;
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
      name = "tecnico_especialidad", 
      joinColumns = @JoinColumn(name = "tecnico_id"), 
      inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private List<Especialidad> especialidades;
    
    @Column
    private String telefono;
    @Column
    private String email;
    
   @OneToOne(mappedBy = "tecnicoAsignado", cascade = CascadeType.ALL, orphanRemoval = true)
    private Incidente incidenteAsignado;
    

    public Tecnico() {
        this.incidenteAsignado = null;
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

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Incidente getIncidenteAsignado() {
        return incidenteAsignado;
    }

    public void setIncidenteAsignado(Incidente incidenteAsignado) {
        this.incidenteAsignado = incidenteAsignado;
    }

    
    
    

    
    
    
    
    
}
