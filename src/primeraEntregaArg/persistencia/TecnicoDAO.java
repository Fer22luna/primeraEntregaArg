
package primeraEntregaArg.persistencia;

import java.util.List;
import primeraEntregaArg.entidades.Tecnico;


public class TecnicoDAO extends DAO<Tecnico> {

    @Override
    protected void eliminar(Tecnico tecnico) {
        super.eliminar(tecnico); 
    }

    @Override
    protected void guardar(Tecnico tecnico) {
        super.guardar(tecnico); 
    }
    
    
    public List<Tecnico> listarTodos(){
        
        conectar();      
        List<Tecnico> listaTecnicos = em.createQuery("SELECT t FROM Tecnico t")
                .getResultList();
        
        desconectar();
        return listaTecnicos;
    }
    
    
    
}
