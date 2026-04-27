public class juego {

    private tablero tablero;

    public juego() {
        tablero = new tablero();

        lanzar_ataque(1, 1);
        lanzar_ataque(1, 2);
        lanzar_ataque(1, 3);
        lanzar_ataque(1, 4);
        lanzar_ataque(1, 5);
    }

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

    public void lanzar_ataque(int x, int y) {
        System.out.println("Ataque a " + x + "," + y);
        Integer resultado = tablero.comprobar_impacto(x, y);
        mostrar_resultado(resultado);
    }

    public static void main(String[] args) {
        new juego();
    }
}