import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) throws Exception {
        /*
         * Cabeçalho.
         */
        System.out.println("-------------------------");
        System.out.println("|   ADVINHE O NÚMERO    |");
        System.out.println("-------------------------");

        System.out.println("\nEncontre o número aleatório secreto!!.\n");

        /*
         * Instâncias de classes.
         */

        mathClass matematica = new mathClass();
        Scanner input = new Scanner(System.in);

        /*
         * Variáveis que serão usadas.
         */
        int numTentativas = 5;
        int numEscolhido = -1;
        int numAleatorio = matematica.gerarNum();
        String parImpar = matematica.verificarPar(numAleatorio);
        String multiplo = matematica.encontrarMúltiplo(numAleatorio);

        /*
         * Informações sobre o número aleatório gerado.
         */
        System.out.println("\nO número " + parImpar);
        System.out.println("O número " + multiplo);

        /*
         * Loop para executar cada tentativa 
         */
        while (numTentativas > 0) {
            System.out.println("Você tem " + numTentativas + " tentativas.");
            numEscolhido = input.nextInt();

            if (numEscolhido == numAleatorio) {
                System.out.println("Você acertou o número!");
                break;
            } else {
                System.out.println("Não foi o número certo...");
                numTentativas--;
            }
        }

        input.close();

        /*
         * Mensagem em caso de derrota no jogo.
         */
        if(numTentativas <= 0){
            System.out.println("Você não conseguiu acertar o número. O número é:" + numAleatorio + ". Tente mais uma vez!");
        }
    }
}
