package controlescuela;
import java.util.ArrayList; 

public class Alumno {
    
    private String No_Boleta;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private double Creditos_Acumulados;
    
    private Calificaciones calif;
    //private Registro registro;

    //Constructor 
    public Alumno(String No_Boleta, String Nombre, String Apellidos, String Direccion,double Creditos_Acumulados){
        this.No_Boleta = No_Boleta;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Creditos_Acumulados = Creditos_Acumulados;
    }
    //Métodos ---------------------------------------------------
    public String obtenerNombreAlumno( ){ 
        return Apellidos + Nombre;
    }
    public String obtenerNoBoleta( ){ 
        return No_Boleta;
    }
    
    public Calificaciones obtenerCalif(){
        return calif;
    }
    
    public String imprimirDatosAlumno(){
        return "                  Boleta : " + No_Boleta + 
                "     Nombre : " + Nombre + Apellidos +
                "     Direccion : " + Direccion;
    } 
    
    public void establecerCalificacion(Calificaciones cal){
        calif = cal;
    }
    
    /*
    public void establecerInscripcion(Registro reg ){ //setter
        registro = reg;
    }
    //devuelve el objeto de la clase Materia
    public Registro obtenerRegistro( ){
        return registro;
    }  
    //establece el objeto de la clase materia        //la referencia cta apunta a una cuenta
  /*  public void inscribirMateria(Materia m){ //setter
        mat = m;
    } */
}

