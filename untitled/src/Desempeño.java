public class Desempeño {
    private String fechaGeneracion;
    private int puntaje;
    private String observaciones;

    public Desempeño(String fechaGeneracion, int puntaje, String observaciones) {
        this.fechaGeneracion = fechaGeneracion;
        this.puntaje = puntaje;
        this.observaciones = observaciones;
    }

    public void generarReporteIndividual(Empleado empleado) {
        System.out.println("Generando reporte para " + empleado.getNombre());
        // Lógica para generar reporte
    }

    public void generarReporteDepartamento(Departamento departamento) {
        System.out.println("Generando reporte para el departamento " + departamento.getNombre());
        // Lógica para generar reporte
    }

    // Getters y Setters

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}