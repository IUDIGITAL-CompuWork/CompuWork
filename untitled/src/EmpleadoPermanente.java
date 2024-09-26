import javax.swing.*;

public class EmpleadoPermanente extends Empleado {
    private String beneficios;
    private double salarioBase;

    public EmpleadoPermanente(int id, String nombre, int edad, String sexo, String fechaContratacion, String beneficios, double salarioBase) {
        super(id, nombre, edad, sexo, fechaContratacion);
        this.beneficios = beneficios;
        this.salarioBase = salarioBase;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Permanente: " + getNombre());
        // Mostrar detalles específicos
    }

    @Override
    protected void mostrarDetalles(JTextArea displayArea) {

    }

    @Override
    protected String getId() {
        return "";
    }

    @Override
    protected void setNombre(String nuevoNombre) {

    }

    // Getters y Setters

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
