
package primeraEntregaArg.persistencia;

import java.util.List;
import primeraEntregaArg.entidades.Especialidad;
import primeraEntregaArg.entidades.Tecnico;


public class TecnicoDAO extends DAO<Tecnico> {

    @Override
    public void eliminar(Tecnico tecnico) {
        super.eliminar(tecnico); 
    }

    @Override
    public void guardar(Tecnico tecnico) {
        super.guardar(tecnico); 
    }
    
    
    public List<Tecnico> listarTodos(){
        
        conectar();      
        List<Tecnico> listaTecnicos = em.createQuery("SELECT t FROM Tecnico t")
                .getResultList();
        
        desconectar();
        return listaTecnicos;
    }
    
    
    public Tecnico buscarPorId(String id){
        conectar();
        Tecnico tecnico  = (Tecnico) em.createQuery("SELECT t FROM Tecnico t where t.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return  tecnico;
    }
    
    
    public List<Tecnico> buscarTecnicosPorEspecialidad(Especialidad especialidad){
        
        conectar();
        List<Tecnico> tecnicos  =  em.createQuery("SELECT t FROM Tecnico t JOIN t.especialidades e WHERE e = :especialidad")
                .setParameter("especialidad", especialidad).getResultList();
        desconectar();
        
        return tecnicos;
    }
    
    
}
