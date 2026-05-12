public class nave {

    private String nombre;
    private String tipo;
    private int vida;
    private boolean hundido;

    public static final int TOCADO = 1;
    public static final int HUNDIDO = 2;

    public nave(String nombre, String tipo, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.hundido = false;
    }

    public int recibirDisparo() {
        vida--;
        if (vida <= 0) {
            hundido = true;
            System.out.println(nombre + " hundido");
            return HUNDIDO;
        } else {
            System.out.println(nombre + " tocado. Vida restante: " + vida);
            return TOCADO;
        }
    }
a
    // Getters y setters opcionales
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public boolean isHundido() {
        return hundido;
    }
}
