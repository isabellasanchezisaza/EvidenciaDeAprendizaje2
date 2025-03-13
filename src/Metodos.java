import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {
    private static List<Persona> personas = new ArrayList<>(); //lista de personas

    //Método para capturar personas
    public static void capturarPersonas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido de la persona " + (i + 1) + ":");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el género de la persona " + (i + 1) + ":");
            String genero = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            int edad = Integer.parseInt(scanner.nextLine());

            Persona persona = new Persona(nombre, apellido, genero, edad);
            personas.add(persona);

            System.out.println("¡Usuario registrado correctamente!");
        }
        scanner.close();
    }

    //Método para obtener una lista con solo el nombre, el apellido y el género de las personas
    public static List<String> obtenerListaPersonaInfo() {
        List<String> listaPersonaInfo = new ArrayList<>();
        for (Persona persona : personas) {
            listaPersonaInfo.add("Nombre: " + persona.getNombre() + " / Apellido: " + persona.getApellido() + " / Género: " + persona.getGenero());
        }
        return listaPersonaInfo;
    }

    //Método para calcular el promedio de edad de las personas
    public static void promediarEdad() {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.getEdad();
        }
        double promedio = (double) sumaEdades / personas.size();
        System.out.println("Promedio de edades: " + promedio);
    }

    //Método para dividir las personas por género
    public static void dividirGenero() {
        int masculino = 0;
        int femenino = 0;
        for (Persona persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("Masculino")) {
                masculino++;
            } else if (persona.getGenero().equalsIgnoreCase("Femenino")) {
                femenino++;
            }
        }
        System.out.println("Cantidad de personas de género Masculino: " + masculino);
        System.out.println("Cantidad de personas de género Femenino: " + femenino);
    }

}
