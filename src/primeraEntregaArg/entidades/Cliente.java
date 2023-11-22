package primeraEntregaArg.entidades;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Cliente {
    
    @Id
    @GeneratedValue()
    private String id;
    
    private String cuit;
    private String razonSocial;
    private List<Servicios> serviciosContratados;

    public Cliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Servicios> getServiciosContratados() {
        return serviciosContratados;
    }

    public void setServiciosContratados(List<Servicios> serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }
    
    
    
}
