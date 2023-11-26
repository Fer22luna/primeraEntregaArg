
package primeraEntregaArg.entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import primeraEntregaArg.enums.EstadoIncidente;
import primeraEntregaArg.persistencia.ClienteDAO;
import primeraEntregaArg.persistencia.EspecialidadDAO;
import primeraEntregaArg.persistencia.TecnicoDAO;


public class MesaDeAyuda {

    //Esta mesa de Ayuda va a funcionar como un servicio en la creacion de la clases Incidente
    
    private final TecnicoDAO tecnicoDao;
    private final EspecialidadDAO especialidadDao;
    private final ClienteDAO clienteDao;

    public MesaDeAyuda() {
        this.tecnicoDao = new TecnicoDAO();
        this.especialidadDao = new EspecialidadDAO();
        this.clienteDao = new ClienteDAO();
    }
    

    public Incidente ingresarIncidente(String cuit,TipoProblema problema,Date fechaCreacion, String nombreServicio){
        
         Cliente cliente = identificarClientePorCuit(cuit);
         
         List<Servicio> serviciosContratados = cliente.getServiciosContratados();
         
         Servicio servicioElegido = null;
         
         if (serviciosContratados != null) {
            for (Servicio servicio : serviciosContratados) {
                if (nombreServicio.equals(servicio.getNombre())) {
                    servicioElegido = servicio;
            break; 
                }
            }
         }   
        // Aca ya tenemos el servicioElegido, ahora le seteamos el problema
        
        servicioElegido.getTipoProblemas().add(problema);
        
        // busquemos los tecnicos que tienen en especialidad por el tipo de problema asociado a un servicio
        
         List<Tecnico> listaDisponible = tecnicosDisponibles(problema);
        
        // Elegimos el primero
        
         Tecnico tecnicoElegido = listaDisponible.get(0);
        
        Incidente incidente = new Incidente();
        
          incidente.setCliente(cliente);
          incidente.setTecnicoAsignado(tecnicoElegido);
          incidente.setFechaCreacion(fechaCreacion);
          incidente.setFechaResolucion(fechaResolucion(fechaCreacion));
          incidente.setEstado(EstadoIncidente.asignado);

          // Le asignamos al tecnicoElegido el incidente
          tecnicoElegido.setIncidenteAsignado(incidente);
          // Asigna al Cliente que el incidente esta en proceso
          cliente.getIncidente().add(incidente);
          
          
          
        return incidente;
    }
   
       
    public List<Tecnico> tecnicosDisponibles(TipoProblema tipoProblema){
        
        
            Especialidad especialidad = especialidadDao.buscarEspecialidadPorProblema(tipoProblema);        
            List<Tecnico> tecnicosDisponibles = tecnicoDao.buscarTecnicosPorEspecialidad(especialidad);
                        
            return tecnicosDisponibles;
            
    }
    
    
    public Date fechaResolucion(Date fechaInicio){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaInicio);
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        return calendar.getTime();
       
    }
    
    
    public Cliente identificarClientePorCuit(String cuit){
        
        Cliente cliente = clienteDao.buscarClientePorCuit(cuit);        
        return cliente;
    }
    
    
    public void resolverIncidente(Incidente incidente){
        
        incidente.setEstado(EstadoIncidente.resuelto);
        
    }
    
    public void mandarEmail(Cliente cliente){
        
        System.out.println("Mensaje enviado al numero "+ cliente.getCuit());
        
        
    }
    
    
    
}
