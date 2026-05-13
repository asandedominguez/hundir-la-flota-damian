/**
 * Representa una nave dentro del juego.
 * Cada nave tiene un nombre, tipo, puntos de vida y un estado
 * que indica si ha sido hundida.
 */
public class nave {

    /**
     * Nombre de la nave.
     */
    private String nombre;

    /**
     * Tipo de la nave (por ejemplo: destructor, submarino, etc.).
     */
    private String tipo;

    /**
     * Vida restante de la nave.
     * Cuando llega a 0, la nave se considera hundida.
     */
    private int vida;

    /**
     * Indica si la nave ha sido hundida.
     */
    private boolean hundido;

    /**
     * Constante que indica que la nave ha sido tocada pero no hundida.
     */
    public static final int TOCADO = 1;

    /**
     * Constante que indica que la nave ha sido hundida.
     */
    public static final int HUNDIDO = 2;

    /**
     * Constructor de la clase nave.
     * @param nombre nombre de la nave
     * @param tipo tipo de nave
     * @param vida puntos de vida iniciales
     */
    public nave(String nombre, String tipo, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.hundido = false;
    }

    /**
     * Recibe un disparo sobre la nave.
     * Reduce la vida en 1 y devuelve el estado del impacto.
     * @return TOCADO si aún tiene vida,
     *         HUNDIDO si la vida llega a 0 o menos
     */
    public int recibirDisparo() {
        vida--;

        if (vida <= 0) {
            hundido = true;
            System.out.println(nombre + ". Navio hundido");
            return HUNDIDO;
        } else {
            System.out.println(nombre + ". Navio tocado. Te quedan...: " + vida);
            return TOCADO;
        }
    }

    /**
     * Obtiene el nombre de la nave.
     * @return nombre de la nave
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * Obtiene el tipo de la nave.
     * @return tipo de nave
     */
    public String getTipo() {

        return tipo;
    }

    /**
     * Obtiene la vida restante de la nave.
     * @return puntos de vida actuales
     */
    public int getVida() {

        return vida;
    }

    /**
     * Indica si la nave está hundida.
     * @return true si está hundida, false en caso contrario
     */
    public boolean isHundido() {

        return hundido;
    }
}