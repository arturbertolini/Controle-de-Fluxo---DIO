import java.util.Scanner;

// Classe que representa a exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message); // Chama o construtor da classe Exception
    }
}

// Classe principal Contador
public class Contador {
    public static void main(String[] args) {
        // Scanner para receber entradas do terminal
        Scanner terminal = new Scanner(System.in);
        
        // Solicitar o primeiro parâmetro ao usuário
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Leitura do primeiro número
        
        // Solicitar o segundo parâmetro ao usuário
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Leitura do segundo número
        
        try {
            // Chama o método que irá processar os números
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Caso a exceção seja lançada, exibe a mensagem de erro
            System.out.println(exception.getMessage());
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verificação se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lançamento da exceção com a mensagem de erro
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de interações (quantidade de números a serem impressos)
        int contagem = parametroDois - parametroUm;
        
        // Loop for que irá imprimir a quantidade de números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
