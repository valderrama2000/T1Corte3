
package taller_1_p3;

public class Secretario extends Empleado {
    
    private String NumFax;

    public Secretario(String NumFax, String employee_name, String employee_code, double employee_salary, String employee_tel, String employee_dir, String superbisor, String rol, String años) {
        super(employee_name, employee_code, employee_salary, employee_tel, employee_dir, superbisor, rol, años);
        this.NumFax = NumFax;
    }

    
    
    public Secretario() {
    }

    public Secretario(String NumFax) {
        this.NumFax = NumFax;
    }

    public String getNumFax() {
        return NumFax;
    }

    public void setNumFax(String NumFax) {
        this.NumFax = NumFax;
    }

    @Override
    public String toString() {
        return "Secretario{"+ super.Vs() + "NumFax=" + NumFax + '}';
    }
    
}
