public class switch1 {
    public static void main(String[] args) {
        String operacao = "soma";
        double a = 1;
        double b = 2;

        switch (operacao) {
            case "soma":
                System.out.println("Resultado da soma: " + (a + b));
                break;
            case "subtracao":
                System.out.println("Resultado da subtração: " + (a - b));
                break;
            case "multiplicacao":
                System.out.println("Resultado da multiplicação: " + (a * b));
                break;
            case "divisao":
                if (b != 0) {
                    System.out.println("Resultado da divisão: " + (a / b));
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}