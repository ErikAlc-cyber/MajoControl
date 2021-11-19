package controlescuela;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

public class Grupo {
    private String IDgrupo;
    private String Semestre;
    private String Turno;
    private String Carrera;
    private Docentes doc;

    private ArrayList <Alumno> alumnos;
    private ArrayList <Alumno> listAux;
    //referencia a la clase    
    private ArrayList <Docentes> docAux;
    
    //Constructor
    public Grupo(String IDgrupo,String semestre,String turno,String carrera){
        this.IDgrupo = IDgrupo;
        this.Semestre = semestre;
        this.Turno = turno;
        this.Carrera = carrera;
        alumnos = new ArrayList<>();
        listAux = new ArrayList<>();
        docAux = new ArrayList<>();
    }
    //Metodos
    public  void agregarAlumno(Alumno a){
        listAux.add(a);
        
        for (Alumno element : listAux)
            if (!alumnos.contains(element))
                alumnos.add(element);
        //if(re1 == true)
          //  alumnos.add(a);
    }
    
    public int conteoAlumnos(){
        return alumnos.size();
    }
    
    public void darbajaAlumno(Alumno a){
        alumnos.remove(a);
    }
    
    public void agregarProfesor(Docentes p){
        docAux.add(p);
    }
    
    public Docentes obtenerDocente(){
        return doc;
    }
    
    public void imprimirDatosGrupo(){
        System.out.println("IDgrupo: "+IDgrupo+
                           "\nSemestre: "+Semestre+
                           "\nTurno: "+Turno+
                           "\nCarrera: "+Carrera + "\n");
        //matAux.obtenerMateria();
        //docAux.obtenerDatosProfesor();
        
        System.out.println("   Alumnos Inscritos : " + alumnos.size());
        for (Alumno aux: alumnos) {
            System.out.println(aux.imprimirDatosAlumno());
        }
    }
    
    public void imprimirDatosGrupos(){
        for (Docentes aux: docAux) {
            System.out.println(aux.imprimirDatosProfesor());
        }
    }
    
    public void imprimirListaGrupo(){
        System.out.println("IDgrupo: "+IDgrupo);
        //matAux.obtenerMateria();
        //docAux.obtenerDatosProfesor();
        System.out.println("\n   Alumnos inscritos: " + alumnos.size() + "\n");
        
        for (Alumno aux: alumnos) {
            System.out.println(aux.obtenerNombreAlumno());
        }
        
        
    }
}
