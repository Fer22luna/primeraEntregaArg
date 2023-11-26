
package primeraEntregaArg.persistencia;

import java.util.List;
import primeraEntregaArg.entidades.Especialidad;
import primeraEntregaArg.entidades.Tecnico;
import primeraEntregaArg.entidades.TipoProblema;


public class EspecialidadDAO extends DAO<Especialidad>{

    @Override
    public void eliminar(Especialidad especialidad) {
        super.eliminar(especialidad); 
    }

    @Override
    public void guardar(Especialidad especialidad) {
        super.guardar(especialidad);
    }
    
    
    public List<Especialidad> encontrarTodas(){
        conectar();

        List<Especialidad> listaEspecialidad = em.createQuery("SELECT e FROM Especialidad e ")
                .getResultList();    
        desconectar();
        return listaEspecialidad;
    }
    
        public Especialidad buscarEspecialidadPorProblema(TipoProblema tipoProblema){
        
        conectar();
        Especialidad especialidad  = (Especialidad) em.createQuery("SELECT e FROM Especialidad e JOIN e.problemasResueltos t WHERE t = :tipoProblema")
                .setParameter("tipoProblema", tipoProblema).getSingleResult();
        desconectar();
        
        return especialidad;
    }
    
    
    
    
}
