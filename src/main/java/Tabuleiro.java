public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();
        mostrar();
    }

    public void colocarPecas() {

        new Rei('b');
        new Rei('p');

        new Rainha('b');
        new Rainha('p');

        new Torre('b');
        new Torre('p');

        new Bispo('b');
        new Bispo('p');

        new Cavalo('b');
        new Cavalo('p');

        new Peao('b');
        new Peao('p');
    }

    public void mostrar() {
        System.out.println("Tabuleiro criado");
    }

    public boolean acabouOJogo() {
        return true;
    }
}