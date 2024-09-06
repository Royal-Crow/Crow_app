
public class Principal1 {
    public static void main(String[] args) {
        // Define o número de iterações e o intervalo de tempo em milissegundos
        int numeroDeIteracoes = 10;
        int intervaloEmMilissegundos = 1000; // 1 segundo

        for (int i = 0; i < numeroDeIteracoes; i++) {
            // Executa a ação desejada
            System.out.println("Iteração " + (i + 1));

            // Pausa o loop pelo intervalo de tempo determinado
            try {
                Thread.sleep(intervaloEmMilissegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
