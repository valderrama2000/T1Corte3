
package taller_1_p3;

public class Carro {
    
    private String Matriculo;
    private String Marca;
    private String Modelo;

    public Carro() {
    }

    public Carro(String Matriculo, String Marca, String Modelo) {
        this.Matriculo = Matriculo;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMatriculo() {
        return Matriculo;
    }

    public void setMatriculo(String Matriculo) {
        this.Matriculo = Matriculo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Carro{" + "Matriculo=" + Matriculo + ", Marca=" + Marca + ", Modelo=" + Modelo + '}';
    }
    
    
    
}
