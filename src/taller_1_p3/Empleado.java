
package taller_1_p3;

public class Empleado {
    
    private String employee_name;
    private String employee_code;
    private double employee_salary;
    private String employee_tel;
    private String employee_dir;
    private String supervisor;
    private String rol;
    private String años;

    public Empleado() {
    }

    public Empleado(String employee_name, String employee_code, double employee_salary, String employee_tel, String employee_dir, String supervisor, String rol, String años) {
        this.employee_name = employee_name;
        this.employee_code = employee_code;
        this.employee_salary = employee_salary;
        this.employee_tel = employee_tel;
        this.employee_dir = employee_dir;
        this.supervisor = supervisor;
        this.rol = rol;
        this.años = años;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_code() {
        return employee_code;
    }

    public void setEmployee_code(String employee_code) {
        this.employee_code = employee_code;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_tel() {
        return employee_tel;
    }

    public void setEmployee_tel(String employee_tel) {
        this.employee_tel = employee_tel;
    }

    public String getEmployee_dir() {
        return employee_dir;
    }

    public void setEmployee_dir(String employee_dir) {
        this.employee_dir = employee_dir;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String superbisor) {
        this.supervisor = superbisor;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }
    
    

    
    public String Vs() {
        return "Empleado{" + "employee_name=" + employee_name + ", employee_code=" + employee_code + ", employee_salary=" + employee_salary + ", employee_tel=" + employee_tel + ", employee_dir=" + employee_dir + ", supervisor=" + supervisor + ", rol=" + rol + ", a\u00f1os=" + años + '}';
    }
    
    
    
    
}
