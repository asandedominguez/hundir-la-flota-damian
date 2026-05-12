/**
 * Clase principal del juego.
 *
 * Se encarga de iniciar la partida, lanzar ataques sobre el tablero
 * y mostrar el resultado de cada ataque realizado.
 */
public class juego {

    /**
     * Tablero donde se realizan los ataques.
     */
    private tablero tablero;

    /**
     * Constructor de la clase juego.
     *
     * Inicializa el tablero y ejecuta varios ataques de prueba.
     */
    public juego() {
        tablero = new tablero();

        lanzar_ataque(1, 1);
        lanzar_ataque(1, 2);
        lanzar_ataque(1, 3);
        lanzar_ataque(1, 4);
        lanzar_ataque(1, 5);
    }

    /**
     * Muestra por consola el resultado de un ataque.
     *
     * @param resultado valor que indica el estado del ataque:
     *                  0 = Agua,
     *                  1 = Tocado,
     *                  2 = Hundido
     */
    public void mostrar_resultado(Integer resultado) {
        if (resultado == null) {
            return;
        }

        if (resultado == 0) {
            System.out.println("Agua");
        } else if (resultado == 1) {
            System.out.println("Tocado");
        } else if (resultado == 2) {
            System.out.println("Hundido");
        }
    }

    /**
     * Realiza un ataque sobre una posición del tablero.
     *
     * @param x coordenada horizontal del ataque
     * @param y coordenada vertical del ataque
     */
    public void lanzar_ataque(int x, int y) {
        System.out.println("Ataque a " + x + "," + y);
        Integer resultado = tablero.comprobar_impacto(x, y);
        mostrar_resultado(resultado);
    }

    /**
     * Método principal del programa.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        new juego();
    }
}