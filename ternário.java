public class ternário {
    
        public static void main(String[] args) {
            int nota = 60;
             
            String resultado = (nota >= 60) ? "Aprovado" : "Reprovado";
            System.out.println(resultado);
    
            String letra = (nota >= 90) ? "A" : (nota >= 80) ? "B" : (nota >= 70) ? "C" : (nota >= 60) ? "D" : "F";
            System.out.println(letra);
        }
    }
    
    

