package controlescuela;
import java.util.ArrayList; 
import java.util.Arrays;

public class ControlEscuela {

    public static void main(String[] args) {
    //---------------- abrir grupos ---------------------------      
    //LISTADO DE GRUPOS: IDgrupo | semestre | turno | carrera
    Grupo G1 = new Grupo ("22-SC","3","M","sistemas computacionales");
    Grupo G2 = new Grupo ("18-IA","3","M","sistemas computacionales");
    Grupo G3 = new Grupo ("07-BD","3","M","sistemas computacionales");

    //---------------- registrar docentes ---------------------------      
    //LISTA DE DOCENTES: ID | Nombre | telefono | correo | | cargo | sueldo | turno       
    Docentes d1 = new Docentes("5724","Ivan","Garcia ","55658714","hotmail","titular","15,000","M");
    Docentes d2 = new Docentes ("6835","Julio","Martinez ","55694051","gmail","auxiliar","15,000","M");
    Docentes d3 = new Docentes("9515","Raquel","Torres ","55529521","yahoo","coordinador","15,000","M");              

    //---------------- crear materias ---------------------------      
    //TIRA DE MATERIAS: ID | Nombre | Carrera | Creditos       
    Materia P = new Materia("123","Programacion","SC",30.5);
    Materia E = new Materia("456","Estadistica","SC",25.8);
    Materia C = new Materia("789","Circuitos","SC",28.2);

    //---------------- registrar alumnos ---------------------------
    //LISTADO DE ALUMNOS: NoBoleta | Nombre | Apellidos | Direccion
    Alumno a1 = new Alumno ("2021753","Ana","Marquez ","Cuajimalpa",0);  
    Alumno a2 = new Alumno ("2021361","Francisco","Luna ","Ecatepec",0);
    Alumno a3 = new Alumno ("2021584","Daniela","Aguilar ","La Paz",0);
    Alumno a4 = new Alumno ("2021348","Leonardo","Cortez ","Chimalhuacan",0);
    Alumno a5 = new Alumno ("2021463","Genaro","Tapia ","Condesa",0);

//Asignar docentes a grupos
    G1.agregarProfesor(d1);
    G1.agregarProfesor(d2);
    G1.agregarProfesor(d3);
    
    G2.agregarProfesor(d1);
    G2.agregarProfesor(d2);
    G2.agregarProfesor(d3);
    
    G3.agregarProfesor(d1);
    G3.agregarProfesor(d2);
    G3.agregarProfesor(d3);

//Asignar materias a docentes 
    d1.agregarMateria(P);
    d1.agregarMateria(E);
    d2.agregarMateria(E);
    d3.agregarMateria(C);
    
//Incribir alumnos a materias
    P.agregarAlumno(a1,G1);
    P.agregarAlumno(a2,G1);
    P.agregarAlumno(a3,G1);
    P.agregarAlumno(a4,G2);
    P.agregarAlumno(a5,G3);
    
    E.agregarAlumno(a1,G2);
    E.agregarAlumno(a2,G2);
    E.agregarAlumno(a4,G2);
    E.agregarAlumno(a5,G3);
    
    C.agregarAlumno(a1,G2);
    C.agregarAlumno(a2,G1);
    C.agregarAlumno(a3,G1);
    C.agregarAlumno(a4,G1);
    C.agregarAlumno(a5,G3);
    
    //C.darDeBajaMateria(a4,G2);

//referencia a la clase    
    //Docentes docAux;
    //Materia matAux;        

    //System.out.println(P);
 
//Asignar materias 
    /*P.agregarGrupo(G1);
    E.agregarGrupo(G1);
    C.agregarGrupo(G1);
    
    P.agregarGrupo(G2);
    E.agregarGrupo(G2);
    C.agregarGrupo(G2);
    
    P.agregarGrupo(G3);
    E.agregarGrupo(G3);
    C.agregarGrupo(G3);
    */
//imprimir consentrado    
    
    System.out.println("\n\nConcentrado de los grupos: \n");
    G1.imprimirDatosGrupos();
    
    System.out.println("\n\nConcentrado del grupo G1: \n");
    G1.imprimirDatosGrupo();
    System.out.println("\n\nConcentrado del grupo G2: ");
    G2.imprimirDatosGrupo();
    System.out.println("\n\nConcentrado del grupo G3: ");
    G3.imprimirDatosGrupo();
    
    System.out.println("\n\n*****Dar de baja alumna Ana Marquez del grupo 1 y 3*****");
    G1.darbajaAlumno(a1);
    G3.darbajaAlumno(a1);
    System.out.println("\n\nConcentrado del grupo G1: ");
    G1.imprimirListaGrupo();
    System.out.println("\n\nConcentrado del grupo G3: ");
    G3.imprimirListaGrupo();
    System.out.println("\n\n*****Inscribir alumno Francisco Luna al grupo grupo 1*****");
    G1.agregarAlumno(a2);
    System.out.println("\n\nConcentrado del grupo G2: ");
    G1.imprimirListaGrupo();
    
    //.califAlumnoEnMateria().obtenerCalifMateria().registrarCalifAlum(9.11);
    Calificaciones a1c1 = new Calificaciones(0);
    a1.establecerCalificacion(a1c1);
    P.establecerAlumno(a1);
    P.obtenerAlumno().obtenerCalif().registrarCalifAlum(9.11);
    
    Calificaciones a2c1 = new Calificaciones(0);
    a2.establecerCalificacion(a2c1);
    E.establecerAlumno(a2);
    E.obtenerAlumno().obtenerCalif().registrarCalifAlum(6.17);
    
    d1.imprimirAlumnos();
    
    Calificaciones a4c1 = new Calificaciones(0);
    a4.establecerCalificacion(a4c1);
    E.establecerAlumno(a4);
    E.obtenerAlumno().obtenerCalif().registrarCalifAlum(10.0);
    
    Calificaciones a1c2 = new Calificaciones(0);
    a1.establecerCalificacion(a1c2);
    E.establecerAlumno(a1);
    E.obtenerAlumno().obtenerCalif().registrarCalifAlum(7.46);
    
    d2.imprimirAlumnos();
    
    Calificaciones a5c1 = new Calificaciones(0);
    a5.establecerCalificacion(a5c1);
    C.establecerAlumno(a5);
    C.obtenerAlumno().obtenerCalif().registrarCalifAlum(9.58);
    
    d3.imprimirAlumnos();
    
    }
}
