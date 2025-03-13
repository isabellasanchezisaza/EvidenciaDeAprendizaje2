import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Llamar al método para capturar personas
        Metodos.capturarPersonas();

        System.out.println("-----------------------------");


        // Obtener y mostrar la lista de PersonaInfo
        List<String> listaPersonaInfo = Metodos.obtenerListaPersonaInfo();
        for (String personaInfo : listaPersonaInfo) {
            System.out.println(personaInfo);
        }

        System.out.println("-----------------------------");


        //Mostrar promedio de edad
       Metodos.promediarEdad();

        System.out.println("-----------------------------");

       //Mostrar cantidad de personas por género
       Metodos.dividirGenero();

    }
}
