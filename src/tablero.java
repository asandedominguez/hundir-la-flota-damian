/**
 * Representa el tablero del juego.
 * Contiene una matriz de casillas donde se colocan las naves
 * y se gestionan los disparos del jugador.
 * @author Adrián Sande Domínguez
 * @version 1.0
 */
public class tablero {

    /**
     * Constante que representa agua (sin impacto).
     */
    public static final int agua = 0;

    /**
     * Constante que representa un impacto en una nave.
     */
    public static final int tocado = 1;

    /**
     * Constante que representa una nave hundida.
     */
    public static final int hundido = 2;

    /**
     * Matriz de casillas que forman el tablero.
     */
    private casilla[][] casillero;

    /**
     * Constructor del tablero.
     *
     * Inicializa el tablero 10x10, crea las casillas
     * y coloca las naves en posiciones fijas.
     */
    public tablero() {

        // NAVES
        nave port1 = new nave("Destructor", "portaaviones", 5);
        nave frag1 = new nave("La pinta", "fragata", 3);
        nave frag2 = new nave("La niña", "fragata", 3);
        nave frag3 = new nave("La Santa María", "fragata", 3);

        nave sub1 = new nave("titanic", "submarino", 1);
        nave sub2 = new nave("coloso", "submarino", 1);
        nave sub3 = new nave("La perla", "submarino", 1);
        nave sub4 = new nave("Isaac", "submarino", 1);

        // Casillero 10x10
        casillero = new casilla[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                casillero[i][j] = new casilla();
            }
        }

        // pos-portaaviones
        casillero[1][1].setNave(port1);
        casillero[2][2].setNave(port1);

        // pos-fragatas
        casillero[5][3].setNave(frag1);
        casillero[4][1].setNave(frag1);
        casillero[1][2].setNave(frag1);

        // pos-submarinos
        casillero[6][4].setNave(sub1);
    }

    /**
     * Comprueba el impacto de un disparo en una posición del tablero.
     *
     * @param x coordenada horizontal
     * @param y coordenada vertical
     * @return resultado del disparo:
     *         agua, tocado o hundido
     */
    public Integer comprobar_impacto(int x, int y) {
        return casillero[x][y].disparar();
    }
}