import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("España", "Madrid");
        diccionario.put("Portugal", "Lisboa");
        diccionario.put("Francia", "París");

        while (true) {
            String paisUsuario = System.console().readLine("Escribe el nombre de un país y te diré su capital: ");

            if (paisUsuario.equals("salir")) {
                break;
            }

            if (diccionario.containsKey(paisUsuario)) {
                String capitalUsuario = diccionario.get(paisUsuario);
                System.out.println("La capital de "+paisUsuario+" es "+capitalUsuario);
            } else {
                String nuevaCapital = System.console().readLine("No conozco esa capital, cuál es la capital de "+paisUsuario+": ");
                diccionario.put(paisUsuario, nuevaCapital);
                System.out.println("Gracias por enseñarme nuevas capitales.");
            }
        }
    }
}
