
package primeraEntregaArg.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import primeraEntregaArg.persistencia.TecnicoDAO;


public class MesaDeAyuda {

    //Esta mesa de Ayuda va a funcionar como un servicio en la creacion de la clases Incidente
    
    private final TecnicoDAO tecnicoDao;

    public MesaDeAyuda() {
        this.tecnicoDao = new TecnicoDAO();
    }
    
    

    public Incidente ingresarIncidente(Cliente cliente,Servicios servicio,String descripcionProblema,Date fechaCreacion){
        
        
        
        Incidente incidente = new Incidente();
        
        return incidente;
    }
    
    public  List<Servicios>  mostrarServiciosCliente(Cliente cliente){
        
        return cliente.getServiciosContratados();

    }
    
    
    public List<Tecnico> tecnicosDisponibles(String especialidad){
        
            List<Tecnico> tecnicosDisponibles = new ArrayList<>();

             List<Tecnico> tecnicosTodos = tecnicoDao.listarTodos();
            
            for(Tecnico aux : tecnicosTodos){
                if(aux.getEspecialidades().contains(especialidad)){
                    tecnicosDisponibles.add(aux);
                }
            }
        
            return tecnicosDisponibles;
            
    }
    
    
    
    
    
}
