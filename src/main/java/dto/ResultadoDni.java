package dto;

public class ResultadoDni {
    private String dni;
    private String nombre_completo;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;

    public ResultadoDni() {
    }

    public ResultadoDni(String dni, String nombre_completo, String nombres, String apellido_paterno, String apellido_materno) {
        this.dni = dni;
        this.nombre_completo = nombre_completo;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }
    
}
