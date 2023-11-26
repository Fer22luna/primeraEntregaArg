
package primeraEntregaArg.entidades;

import primeraEntregaArg.persistencia.ClienteDAO;


public class Comercial {

    private final ClienteDAO clienteDao;

    public Comercial() {
        
        this.clienteDao = new ClienteDAO();
    }
    
    // Va a funcionar como la clase servicio de Cliente
    
    public Cliente darAltaCliente(String cuit,String razonSocial){   
        
        Cliente cliente = new Cliente();
        
        cliente.setCuit(cuit);
        cliente.setRazonSocial(razonSocial); 
        
        clienteDao.guardar(cliente);
        
        return cliente;
    }
    
    public void darBajaCliente(String cuit){
        
        Cliente cliente = clienteDao.buscarClientePorCuit(cuit);
        
        clienteDao.eliminar(cliente);
        
        System.out.println("El cliente se a dado de baja del sistema");
    }
    
    public void modificarCliente(String cuit){
          
        Cliente cliente = clienteDao.buscarClientePorCuit(cuit);
        
        //No tiene sentido casi modificar
        
    }
    
    
    
    
}
