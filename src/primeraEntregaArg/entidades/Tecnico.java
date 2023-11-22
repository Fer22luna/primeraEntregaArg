
package primeraEntregaArg.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tecnico {
    
    @Id
    @GeneratedValue(generator = "uuid")
    //@GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombre;
    @OneToMany(fetch=FetchType.EAGER)
    private List<String> especialidades;
    @OneToOne
    private Contacto contacto;

    public Tecnico() {
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

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    
    
    
}
