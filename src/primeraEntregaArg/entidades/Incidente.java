
package primeraEntregaArg.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import org.hibernate.annotations.GenericGenerator;
import primeraEntregaArg.enums.EstadoIncidente;

@Entity
public class Incidente {
    
    @Id
    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @ManyToMany
    @JoinTable( name = "incidente_tipoProblema",
    joinColumns = @JoinColumn(name = "incidente_id"),
    inverseJoinColumns = @JoinColumn(name = "tipoProblema_id"))
    private List<TipoProblema> tipoProblema;
    @Column
    private EstadoIncidente estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    private Date fechaResolucion;
    
    @OneToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnicoAsignado;
    
    @Column
    private boolean complejo;
    
    
    public Incidente() {
        this.complejo = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<TipoProblema> getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(List<TipoProblema> tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

  

    public EstadoIncidente getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidente estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public boolean isComplejo() {
        return complejo;
    }

    public void setComplejo(boolean complejo) {
        this.complejo = complejo;
    }
    
    
    
}
