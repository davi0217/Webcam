package tarea;

public class Webcam {

    private String resolucion;
    private int fps;
    private boolean encendida;
    private double tamaño;

    public Webcam(String resolucion, int fps) {
        this.resolucion = resolucion;
        this.fps = fps;
        this.encendida = false;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String res) {
        this.resolucion = res;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int f) {
        this.fps = f;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(boolean enc) {
        this.encendida = enc;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tam) {
        this.tamaño = tam;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void tomarFoto() {
        if (this.encendida) {
            int ancho = Integer.parseInt(this.resolucion.split("x")[0]);
            int alto = Integer.parseInt(this.resolucion.split("x")[1]);
            this.tamaño = (ancho * alto / this.fps);
            System.out.println(
                    "La foto fue tomada con resolución " + resolucion + " y tendrá un tamaño de " + tamaño + " kb");

        } else {
            System.out.println("La cámara está apagada");
        }
    }

    public static void main(String[] args) throws Exception {
        Webcam camara1 = new Webcam("1920x1080", 30);
        camara1.tomarFoto();
        camara1.encender();
        camara1.tomarFoto();
        camara1.apagar();
        System.out.println(camara1.getTamaño());
        System.out.println(camara1.getResolucion());
    }
}
