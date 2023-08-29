package mundo;

/**
 *
 * @author Sistemas
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private float cedula;
    private String correo;
    private float celular;
    private int semestre;


    public Alumno() {
        
    }
    
    public Alumno(String nombre, String apellido, float cedula, String correo, float celular, int semestre) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.celular = celular;
        this.semestre = semestre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getCedula() {
        return cedula;
    }

    public void setCedula(float cedula) {
        this.cedula = cedula;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float getCelular() {
        return celular;
    }

    public void setCelular(float celular) {
        this.celular = celular;
    }

     public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}