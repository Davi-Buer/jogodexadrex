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

        new Rei("K0b");
        new Rei("K0p");

        new Rainha("Q0b");
        new Rainha("Q0p");

        new Torre("T1b");
        new Torre("T2b");
        new Torre("T1p");
        new Torre("T2p");

        new Bispo("B1b");
        new Bispo("B2b");
        new Bispo("B1p");
        new Bispo("B2p");

        new Cavalo("C1b");
        new Cavalo("C2b");
        new Cavalo("C1p");
        new Cavalo("C2p");

        for (int i = 0; i < 8; i++) {
            new Peao("P" + (i + 1) + "b");
            new Peao("P" + (i + 1) + "p");
        }
    }

    public void mostrar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println("|" + casas[i][j] + "|");
            }
        }
    }

    public boolean acabouOJogo() {
        return true;
    }
}
