
package primeraEntregaArg.persistencia;

import primeraEntregaArg.entidades.Cliente;


public class ClienteDAO extends DAO<Cliente>{

    @Override
    public void eliminar(Cliente cliente) {
        super.eliminar(cliente); 
    }

    @Override
    public void guardar(Cliente cliente) {
        super.guardar(cliente); 
    }
    
    
    public Cliente buscarClientePorCuit(String cuit){
        conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.cuit LIKE :cuit")
                .setParameter("cuit", cuit).getSingleResult();
        desconectar();
        return cliente;
        
    }
    
    
    
    
}
