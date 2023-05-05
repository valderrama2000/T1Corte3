
package taller_1_p3;

public class Cliente {
    
    private String NomCliente;
    private String Codigo;
    private String NumMovil;
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String NomCliente, String Codigo, String NumMovil, String Direccion) {
        this.NomCliente = NomCliente;
        this.Codigo = Codigo;
        this.NumMovil = NumMovil;
        this.Direccion = Direccion;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNumMovil() {
        return NumMovil;
    }

    public void setNumMovil(String NumMovil) {
        this.NumMovil = NumMovil;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "NomCliente=" + NomCliente + ", Codigo=" + Codigo + ", NumMovil=" + NumMovil + ", Direccion=" + Direccion + '}';
    }
    
    
    
}
