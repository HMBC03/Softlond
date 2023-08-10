public class Habitaciones {
    private String ocupante;
    private boolean disponible;

    public Habitaciones(){
        this.disponible=true;
        this.ocupante="";

    }
    public boolean isDisponible() {
        return disponible;
    }

    public String getOcupante() {
        return ocupante;
    }

    public void reservar(String ocupante, int numeroHabitacion6
    ) {
        this.disponible = false;
        this.ocupante = ocupante;
    }

    public void cancelarReserva(int numeroHabitacion) {
        this.disponible = true;
        this.ocupante = "";
    }



}
