
package taller_1_p3;

import java.util.ArrayList;

public class Vendedor extends Empleado {
    
    private String NumMovil;
    private String AreaVentas;
    private ArrayList<String>ListaDeClientes;
    private Carro  MyCarro;

    public Vendedor() {
    }

    public Vendedor(String NumMovil, String AreaVentas, ArrayList<String> ListaDeClientes, Carro MyCarro, String employee_name, String employee_code, double employee_salary, String employee_tel, String employee_dir, String supervisor, String rol, String años) {
        super(employee_name, employee_code, employee_salary, employee_tel, employee_dir, supervisor, rol, años);
        this.NumMovil = NumMovil;
        this.AreaVentas = AreaVentas;
        this.ListaDeClientes = ListaDeClientes;
        this.MyCarro = MyCarro;
    }

    public String getNumMovil() {
        return NumMovil;
    }

    public void setNumMovil(String NumMovil) {
        this.NumMovil = NumMovil;
    }

    public String getAreaVentas() {
        return AreaVentas;
    }

    public void setAreaVentas(String AreaVentas) {
        this.AreaVentas = AreaVentas;
    }

    public ArrayList<String> getListaDeClientes() {
        return ListaDeClientes;
    }

    public void setListaDeClientes(ArrayList<String> ListaDeClientes) {
        this.ListaDeClientes = ListaDeClientes;
    }

    public Carro getMyCarro() {
        return MyCarro;
    }

    public void setMyCarro(Carro MyCarro) {
        this.MyCarro = MyCarro;
    }

    @Override
    public String toString() {
        return "Vendedor{" +super.Vs() + "NumMovil=" + NumMovil + ", AreaVentas=" + AreaVentas + ", ListaDeClientes=" + ListaDeClientes + ", MyCarro=" + MyCarro + '}';
    }
    
    
}
