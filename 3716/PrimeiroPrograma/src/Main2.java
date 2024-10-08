import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Toda implementação vai aqui */
        // int n1, n2, somaDoisNumeros;
        // double real1, real2, quoc;
        String cadeia1, cadeia2;
        Scanner leitor = new Scanner(System.in); // criação do elemento responsável pela leitura dos dados
        /*
        System.out.print("Insira um número: ");
        n1 = leitor.nextInt(); // scanf("%d", &n1); // leia(n1)

        System.out.print("Insira outro número: ");
        n2 = leitor.nextInt(); // leia(n2)

        somaDoisNumeros = n1 + n2;

        System.out.println("O valor da soma é: " + somaDoisNumeros);
        */
        /*
        System.out.print("Insira um número real: ");
        real1 = leitor.nextDouble();

        System.out.print("Insira outro número real: ");
        real2 = leitor.nextDouble();

        quoc = (3.98 * real1) / real2;

        System.out.println("O valor do quociente é: " + quoc);
        */

        System.out.print("Insira uma cadeia de caracteres: ");
        cadeia1 = leitor.nextLine();

        // leitor.nextLine(); // <E>

        System.out.print("Insira outra cadeia de caracteres: ");
        cadeia2 = leitor.nextLine();

        System.out.println("Cadeia 1: " + cadeia1);
        System.out.println("Cadeia 2: " + cadeia2);













        // System.out.println("Hello world!");
        // System.out.println("Boa noite!");

        // int -> inteiro -> %d
        // float/double -> real -> %f / %lf
        // char -> caracter -> %c
        // String -> cadeia de caracter .: "Wesley", "Construção de Algoritmos" -> %s
        // boolean -> logico .: true/false -> %b

        // Op. Aritméticos
        // Adição -> +
        // Subtração -> -
        // Produto -> *
        // Quociente -> /
        // Resto da Divisão -> %
/*
        int a;
        a = -1;

        System.out.println("a = " + a);
        System.out.println("O conteúdo da variável a é: " + a);

        String disciplina; // declaração de variável do tipo String (cadeia de caracter)

        disciplina = "Construção de Algoritmos II";
        System.out.println("Hoje é dia de " + disciplina);

        a = 59;
        System.out.printf("(printf) a = %d\n", a);

        double valor = 7.85596;
        System.out.printf("Sua nota foi: %.1f\n", valor);
*/
    }
}