public class Persona {
    private String nombre; //nombre de la persona
    private String apellido; //apellido de la persona
    private String genero; //género de la persona
    private int edad; //edad de la persona

    //Constructor de la clase Persona
    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    //Método getters para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

}
