
package taller_1_p3;

import java.util.ArrayList;

public class JefeDeZona extends Empleado {
    
    private String Secretario;
    private ArrayList <String>ListVendedor;
    private Carro MyCarro;
    private String Despacho;

    public JefeDeZona() {
    }


    public JefeDeZona(String Secretario, ArrayList<String> ListVendedor, Carro MyCarro, String Despacho, String employee_name, String employee_code, double employee_salary, String employee_tel, String employee_dir, String supervisor, String rol, String años) {
        super(employee_name, employee_code, employee_salary, employee_tel, employee_dir, supervisor, rol, años);
        this.Secretario = Secretario;
        this.ListVendedor = ListVendedor;
        this.MyCarro = MyCarro;
        this.Despacho = Despacho;
    }

    public String getSecretario() {
        return Secretario;
    }

    public void setSecretario(String Secretario) {
        this.Secretario = Secretario;
    }

    public ArrayList<String> getListVendedor() {
        return ListVendedor;
    }

    public void setListVendedor(ArrayList<String> ListVendedor) {
        this.ListVendedor = ListVendedor;
    }

    public Carro getMyCarro() {
        return MyCarro;
    }

    public void setMyCarro(Carro MyCarro) {
        this.MyCarro = MyCarro;
    }

    public String getDespacho() {
        return Despacho;
    }

    public void setDespacho(String Despacho) {
        this.Despacho = Despacho;
    }

    @Override
    public String toString() {
        return "JefeDeZona{" + "Secretario=" + Secretario + ", ListVendedor=" + ListVendedor + ", MyCarro=" + MyCarro + ", Despacho=" + Despacho + '}';
    }
    
    
    
}
