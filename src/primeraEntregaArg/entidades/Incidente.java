
package primeraEntregaArg.entidades;

import java.util.Date;
import primeraEntregaArg.enums.EstadoIncidente;


public class Incidente {
    
    
    private Cliente cliente;
    private Servicios servicio;
    private String descripcionProblema;
    //private TipoProblema tipoProblema;
    private EstadoIncidente estado;
    private Date fechaCreacion;
    private Date fechaPosibleResolucion;
    private Tecnico tecnicoAsignado;
    private boolean complejo;
    
    
// if isComplejo entonces colchon de horas

    public Incidente() {
        this.complejo = false;
    }
    
    
    
    
    
}
