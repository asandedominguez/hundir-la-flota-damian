public class casilla {
    private nave nave;
    private boolean usada;

    public casilla() {
        this.nave = null;
        this.usada = false;
    }
a
    public Integer disparar() {
        // Si ya fue usada
        if (usada) {
            System.out.println("Ya disparaste aquí");
            return null;
        }

        // Marcar como usada
        usada = true;

        // Si no hay nave
        if (nave == null) {
            System.out.println("Agua");
            return 0;
        }

        // Si hay nave, delegar el disparo
        return nave.recibirDisparo();
    }

    // Getter y setter para nave
    public nave getNave() {
        return nave;
    }

    public void setNave(nave nave) {
        this.nave = nave;
    }

    public boolean isUsada() {
        return usada;
    }
}
