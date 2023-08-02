public class Punto_18 {

    public static void main(String[] args) {
        int longitud = 8; // Longitud de la contraseña

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = (int) (Math.random() * caracteres.length());
            contraseña.append(caracteres.charAt(index));
        }

        System.out.println("Contraseña aleatoria generada: " + contraseña);
    }

}
