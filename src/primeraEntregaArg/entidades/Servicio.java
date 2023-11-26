
package primeraEntregaArg.entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
//import org.hibernate.annotations.GenericGenerator;

@Entity
public class Servicio {
    
    @Id
    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Column 
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private int horasSoporte;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
      name = "servicio_tipoProblema", 
      joinColumns = @JoinColumn(name = "servicio_id"), 
      inverseJoinColumns = @JoinColumn(name = "tipoProblema_id"))
    private List<TipoProblema> tipoProblemas;
    

    public Servicio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHorasSoporte() {
        return horasSoporte;
    }

    public void setHorasSoporte(int horasSoporte) {
        this.horasSoporte = horasSoporte;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<TipoProblema> getTipoProblemas() {
        return tipoProblemas;
    }

    public void setTipoProblemas(List<TipoProblema> tipoProblemas) {
        this.tipoProblemas = tipoProblemas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    
    
}
