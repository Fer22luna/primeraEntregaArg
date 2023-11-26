
package primeraEntregaArg.servicios;

import primeraEntregaArg.entidades.Especialidad;
import primeraEntregaArg.persistencia.EspecialidadDAO;


public class EspecialidadServicio {

    private final EspecialidadDAO especialidadDao;
    
    
    public EspecialidadServicio() {
        this.especialidadDao = new EspecialidadDAO();
    }
    
    
    public Especialidad crearEspecialidad(String nombre){
        
        Especialidad especialidad = new Especialidad();
        
        especialidad.setNombre(nombre);
        
        especialidadDao.guardar(especialidad);
        
        return especialidad;
    }
    
    
}
