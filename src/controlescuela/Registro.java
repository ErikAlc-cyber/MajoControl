package controlescuela;

public class Registro {
        private String modalidad;
        private int Creditos_Acumulados;
        Materia matAux; //referencia a la clase     
       //Constructor: inicializa objetos de la clase Registro
        public Registro(String modalidad){
                this.modalidad = modalidad;
        }
       //Métodos ---------------------------------------------------
        // Consultar: devuelve el saldo actual, es un getter
        public double consultarCred( ){
              return Creditos_Acumulados;
        }
        //Aumentar creditos
        public void CredInscribirMat(int creditos){
            Creditos_Acumulados = Creditos_Acumulados + creditos;
            System.out.println("Se ha realizado tu inscripcion\nCreditos actuales: " + Creditos_Acumulados);
        }
        //Restar creditos
        public void CredBajaMat(int creditos){
            Creditos_Acumulados = Creditos_Acumulados - creditos;
            System.out.println("Se ha realizado tu baja\nCreditos actuales: "+Creditos_Acumulados);
        }
        public void inscribirMateria(String materia){
            //Creditos_Acumulados = Creditos_Acumulados + creditos;
            System.out.println("Se ha realizado tu inscripcion\nCreditos actuales: "+Creditos_Acumulados);
        }
        
}
