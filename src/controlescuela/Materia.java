package controlescuela;
import java.util.ArrayList;

public class Materia {
    private String IDmateria;
    private String Nombre_Materia;
    private String Carrera;
    private double Creditos_Otorga; //int
    
    private Alumno alum;
    private Docentes docente;
    
    private ArrayList <Grupo> grupos;
    
    private ArrayList <Alumno> alumnoQueCursaLaMateria;
    //private ArrayList <Alumno> alumnoQueCursaLaMateria;
    //private ArrayList<Alumno> alumnos; 
    //Constructor 
    public Materia(String IDmateria, String Nombre_Materia, String Carrera, double Creditos_Otorga){
        this.IDmateria = IDmateria;
        this.Nombre_Materia = Nombre_Materia;
        this.Carrera = Carrera;
        this.Creditos_Otorga = Creditos_Otorga;
        //se construye la clase agregada
        grupos = new ArrayList<>();
        alumnoQueCursaLaMateria = new ArrayList<>();
        //alumnos = new ArrayList<>();
    }
    
    //el grupo ya debe estar creado
    public void agregarGrupo(Grupo grp){
        grupos.add(grp);
    }
    /*public void agregarAlumno(Alumno alum){
        alumnos.add(alum);
    }*/
    public String imprimirDatosMateria(){
        for(Alumno aux: alumnoQueCursaLaMateria){
            System.out.println(aux.imprimirDatosAlumno());
        }
            
        return "\n            IDmateria: " + IDmateria + 
                "     Nombre Materia: " + Nombre_Materia + 
                "     Carrera: " + Carrera + "\n";
        /*for(Grupo aux: grupos){
            aux.imprimirDatosGrupo();
        }*/
        /*for(Alumno aux: alumnos){
            aux.consultarAlumno();
        }*/
    }
    
    public String obtenerNombreMateria( ){ 
        return Nombre_Materia;
    }
    
    public void establecerAlumno(Alumno al){
        alum = al;
    }
    
   /* public String imprimirDatosAlum(int cont){
        
        if(cont <= alumnoQueCursaLaMateria.size()){
            System.out.println("Index: "+ (cont+1) + alumnoQueCursaLaMateria.get(cont).imprimirDatosAlumno());
            cont++;
            return imprimirDatosAlum(cont);
        }
        else
            
        for (Alumno aux: alumnoQueCursaLaMateria) {
            return aux.imprimirDatosAlumno();
        }
            
        return null;
        //System.out.println("\n      Materias que imparte" + materiaImpartida.imprimirDatosMateria());
        
    }  */
    
    public Docentes obtenerDocenteo(){
        return docente;
    }
    
    public Alumno obtenerAlumno(){
        return alum;
    }
    
    public void agregarAlumno(Alumno al,Grupo g){
        int contAux = g.conteoAlumnos();
        if(contAux <= 2){
            alumnoQueCursaLaMateria.add(al);
            g.agregarAlumno(al);
            System.out.println("Inscripcion realizada con exito");
        }
        else
            System.out.println("Ya no hay cupo en este grupo");
    }
    
    public void darDeBajaMateria(Alumno al, Grupo g){
        alumnoQueCursaLaMateria = null;
        g.darbajaAlumno(al);
        System.out.println("Se dio de baja de forma exitosa");
    }
    
/*    
    public int obtenerCredMateria(String materia ){ //getter
        if( materia == "Programacion"){
            return 25;}
        else if (materia == "Ecuaciones"){
            return 20;}
        else if (materia == "Circuitos"){
            return 25;}
        else return 0;
    }
    
    
    public void imprimirAlumnos(){
        System.out.println("\n\nIDmateria: "+IDmateria+"\nNombre Materia: "+Nombre_Materia+"\nCarrera: " + Carrera + "\n");
        for(Alumno aux: alumnos){//barrido de alumnos
            System.out.println("Nombre: " + aux.obtenerNombreAlumno());
            System.out.println("Numero de boleta: " + aux.obtenerNoBoleta());
            //consulta a su promedio
            //System.out.println("Promedio: " + aux.obtenerPromedio().consultar());
            System.out.println();
        }
    }
 */   
    
/*-------------------------------------    
    public Materia(){ 
    } 
 
    public void setIDmateria(String ID){
        IDmateria = ID;    }
    public void setNombre_Materia(String NOM){
        Nombre_Materia = NOM;    }
    public void setCarrera(String CAR){
        Carrera = CAR;    }
    public void setCreditos_Otorga(String CRED){
        Creditos_Otorga = CRED;    }

    public String toString(){
        return "("+IDmateria+", "+Nombre_Materia+", "+Carrera+", "+Creditos_Otorga+") ";
    }
----------------------------------------
*/

}
