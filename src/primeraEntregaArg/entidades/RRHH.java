
package primeraEntregaArg.entidades;

import java.util.List;
import primeraEntregaArg.persistencia.EspecialidadDAO;
import primeraEntregaArg.persistencia.TecnicoDAO;


public class RRHH {
    
    
    //El área de RRHH se encarga de realizar las altas, bajas y modificaciones de los técnicos que se
    //encargan de resolver los incidentes reportados.
    //Es una servicio para tecnicos tecnicos
    
     private final EspecialidadDAO especialidadDao;
     private final TecnicoDAO tecnicoDao;
     
    public RRHH() {
        this.especialidadDao = new EspecialidadDAO();
        this.tecnicoDao = new TecnicoDAO();
    }

    
    public Tecnico altaTecnico(String nombreTecnico,  List<Especialidad> especialidades, String telefono,String email){
        
        Tecnico tecnico = new Tecnico();
        
        tecnico.setEmail(email);
        tecnico.setTelefono(telefono);
        tecnico.setEspecialidades(especialidades);
        tecnico.setNombre(nombreTecnico);
        
        tecnicoDao.guardar(tecnico);
        
        return tecnico;
    }
    
    
    public void bajaTecnico(String id){
        
        Tecnico tecnicoEliminar = buscarTecnicoPorId(id);
        
        tecnicoDao.eliminar(tecnicoEliminar);
        
        System.out.println("El tecnico se ha eliminado correctamente");
    }
    
    public void modificarTenico(String id, List<Especialidad> especialidades,String email,String telefono){
        
        Tecnico tecnicoModificar = buscarTecnicoPorId(id);
        
        tecnicoModificar.setEmail(email);
        tecnicoModificar.setTelefono(telefono);
        tecnicoModificar.setEspecialidades(especialidades);
        
        tecnicoDao.guardar(tecnicoModificar);
    }
   
    
    public Tecnico buscarTecnicoPorId(String id){
        
        Tecnico tecnico = tecnicoDao.buscarPorId(id);
        
        return tecnico;
    }
    
    
        public void emitirReportes(){
        
            
      
        
    } 
    
    
    
}
