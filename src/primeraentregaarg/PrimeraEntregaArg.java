
package primeraentregaarg;

import primeraEntregaArg.entidades.Especialidad;
import primeraEntregaArg.servicios.EspecialidadServicio;


public class PrimeraEntregaArg {


    public static void main(String[] args) {

        
        EspecialidadServicio es = new EspecialidadServicio(); 
        
        Especialidad e = es.crearEspecialidad("Caminar");
        
        
    }
    
}
