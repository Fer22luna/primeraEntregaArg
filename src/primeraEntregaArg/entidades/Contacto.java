
package primeraEntregaArg.entidades;

import java.util.List;


public class Contacto {
    
    private List<String> telefonos;
    private String emails;

    public Contacto() {
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }
    
}
