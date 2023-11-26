
package primeraEntregaArg.persistencia;

import java.util.List;
import primeraEntregaArg.entidades.TipoProblema;


public class TipoProblemaDAO extends DAO<TipoProblema>{

    @Override
    public void eliminar(TipoProblema tipoProblema) {
        super.eliminar(tipoProblema); 
    }

    @Override
    public void guardar(TipoProblema tipoProblema) {
        super.guardar(tipoProblema); 
    }
    
    
    public List<TipoProblema> listarTodos(){
        
        conectar();      
        List<TipoProblema> listaProblemas = em.createQuery("SELECT p FROM TipoProblema p")
                .getResultList();
        
        desconectar();
        return listaProblemas;
    }
    
    
    
}
