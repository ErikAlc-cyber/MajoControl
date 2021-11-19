package controlescuela;

import java.util.ArrayList;

public class Docentes {
    private String IDprofesor;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private String cargo;
    private String sueldo;
    private String turno;
    
    private Alumno alumnoCalif;
    private Grupo grup;
    
    private ArrayList <Materia> materiaImpartida;

    //Constructor
     public Docentes(String IDprofesor,String nombre,String apellidos,String telefono,String correo,String cargo,String sueldo,String turno){
            this.IDprofesor = IDprofesor;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.telefono = telefono;
            this.correo = correo;
            this.cargo = cargo;
            this.sueldo = sueldo;
            this.turno = turno;
            materiaImpartida = new ArrayList<>();
    }
    //Metodos
    public String imprimirDatosProfesor(){
        Grupo a = obtenerGrupo();
        
        for (Materia aux: materiaImpartida) {
            System.out.println(aux.imprimirDatosMateria());
        }
        
        return "      ID: " + IDprofesor +
                "     Nombre: " + nombre + apellidos +
                "     Telefono: " + telefono +
                "     Correo: " + correo +
                "     Turno: " + turno + "\n";
        //System.out.println("\n      Materias que imparte" + materiaImpartida.imprimirDatosMateria());
    }  
    
    public Alumno obtenerAlumno(){
        return alumnoCalif;
    }
    
    public String obtenerNom( ){ 
        return nombre + apellidos;
    }
    
    public Grupo obtenerGrupo(){
        return grup;
    }
    
    public void agregarMateria(Materia m){
        materiaImpartida.add(m);
    }
    
    public void imprimirAlumnos(){
        System.out.println("\nProfesor :" + nombre + apellidos + "\n");
        
        for(Materia aux : materiaImpartida){
            System.out.println("Nombre del Alumno : " + aux.obtenerAlumno().obtenerNombreAlumno());
            System.out.println("Materia           : " + aux.obtenerNombreMateria());
            System.out.println("Calificación      : " + aux.obtenerAlumno().obtenerCalif().consultar());
            System.out.println();
        }
    }
}
