
package primeraEntregaArg.entidades;

import java.util.List;


public class RRHH {
    
    
    //El área de RRHH se encarga de realizar las altas, bajas y modificaciones de los técnicos que se
    //encargan de resolver los incidentes reportados.
    //Es una servicio de tecnicos
    
      

    
    public Tecnico altaTecnico(String nombre,  List<String> especialidades, Contacto contacto ){
        
        Tecnico tecnico = new Tecnico();
        
        tecnico.setNombre(nombre);
        tecnico.setEspecialidades(especialidades);
        tecnico.setContacto(contacto);
        
        //repositorioTecnico.save(tecnico);
        
        return tecnico;
    }
    
    
    public void bajaTecnico(String id){
        
        // le doy de baja por ID
    }
    
    public void modificarTenico(String id, String nombre,  List<String> especialidades, Contacto contacto ){
        
        // repositorio buscar por id
        
        // luego modifico
        
    }
    
    public void emitirReportes(){
        
        //  List<Incidente> listaIncidente = repositorioIncidente.findAll();
        
       
        

        
    } 
    
    
    
    
    
}
