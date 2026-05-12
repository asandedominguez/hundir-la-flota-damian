public class tablero {

    public static final int agua = 0;
    public static final int tocado = 1;
    public static final int hundido = 2;

    private casilla[][] casillero;

    public tablero() {
a
        // NAVES
        nave por1 = new nave("Destructor", "portaaviones", 5);
        nave fra1 = new nave("Bismarck", "fragata", 3);
        nave fra2 = new nave("Prince of Wales", "fragata", 3);
        nave fra3 = new nave("Graf Spee", "fragata", 3);

        nave sub1 = new nave("U-47", "submarino", 1);
        nave sub2 = new nave("U-96", "submarino", 1);
        nave sub3 = new nave("U-505", "submarino", 1);
        nave sub4 = new nave("U-534", "submarino", 1);

        // CASILLERO 10x10
        casillero = new casilla[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                casillero[i][j] = new casilla();
            }
        }

        // portaaviones
        casillero[1][1].setNave(por1);
        casillero[1][2].setNave(por1);

        // fragatas
        casillero[3][3].setNave(fra1);
        casillero[4][3].setNave(fra1);
        casillero[5][3].setNave(fra1);

        // submarinos
        casillero[4][6].setNave(sub1);
    }

    // DISPARO
    public Integer comprobar_impacto(int x, int y) {
        System.out.println("Impacto en (" + x + "," + y + ")");
        return casillero[x][y].disparar();
    }
}
