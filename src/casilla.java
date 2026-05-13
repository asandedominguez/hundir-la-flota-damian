/**
 * Representa una casilla del tablero.
 * Cada casilla puede contener una nave y almacenar si ya ha sido
 * atacada anteriormente.
 */
public class casilla {

    /**
     * Nave ubicada en la casilla.
     * Puede ser null si la casilla está vacía.
     */
    private nave nave;

    /**
     * Indica si la casilla ya recibió un disparo.
     */
    private boolean usada;

    /**
     * Constructor de la clase casilla.
     * Inicializa la casilla vacía y sin usar.
     */
    public casilla() {
        this.nave = null;
        this.usada = false;
    }

    /**
     * Realiza un disparo sobre la casilla.
     * @return null si la casilla ya fue usada,
     *         0 si el disparo cae en agua,
     *         o el resultado devuelto por la nave al recibir el disparo
     */
    public Integer disparar() {

        if (usada) {
            System.out.println("Ya disparaste aquí");
            return null;
        }

        usada = true;

        if (nave == null) {
            return 0;
        }

        // Si hay nave, delegar el disparo
        return nave.recibirDisparo();
    }

    /**
     * Obtiene la nave situada en la casilla.
     *
     * @return nave asociada a la casilla
     */
    public nave getNave() {

        return nave;
    }

    /**
     * Asigna una nave a la casilla.
     * @param nave nave que se colocará en la casilla
     */
    public void setNave(nave nave) {
        this.nave = nave;
    }

    /**
     * Indica si la casilla ya fue utilizada.
     * @return true si ya recibió un disparo, false en caso contrario
     */
    public boolean isUsada() {
        return usada;
    }
}