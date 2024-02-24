import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    private String ciudad;
    
    public Persona(String nombre, int edad, String genero, String direccion, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Ciudad: " + ciudad);
    }
    
    public static void comer(String comida, String nombre) {
        System.out.println(nombre + " esta comiendo " + comida);
    }
    
    public void dormir(int horas) {
        System.out.println(nombre + " se va a dormir " + horas + " horas");
    }
    
    public void hacerEjercicio(String tipoEjercicio) {
        System.out.println(nombre + " está haciendo " + tipoEjercicio);
    }
    public void infofinal(String comida, int horas, String tipoEjercicio)
    {
        System.out.println(nombre +" de " + edad +" años "+"vive en " + direccion + " en la ciudad de " + ciudad +  " y el esta comiendo " + comida + ", despues de comer se puso a dormir " + horas + " horas" + ", ya que mañana tiene que hacer " + tipoEjercicio);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Ingrese el género:");
        String genero = scanner.nextLine();
        
        System.out.println("Ingrese la dirección:");
        String direccion = scanner.nextLine();
        
        System.out.println("Ingrese la ciudad:");
        String ciudad = scanner.nextLine();
        
        Persona persona = new Persona(nombre, edad, genero, direccion, ciudad);
        
        System.out.println("\n-------------------------------------------");
        
        System.out.println("¿Qué está comiendo " + persona.getNombre() + "?");
        String comida = scanner.nextLine();
        Persona.comer(comida,nombre);
        
        System.out.println("¿Cuántas horas va a dormir " + persona.getNombre() + "?");
        int horas = scanner.nextInt();
        persona.dormir(horas);
        
        scanner.nextLine(); 
        System.out.println("¿Qué tipo de ejercicio va a hacer " + persona.getNombre() + "?");
        String tipoEjercicio = scanner.nextLine();
        persona.hacerEjercicio(tipoEjercicio);

        System.out.println("\n-------------------------------------------");

        persona.infofinal( comida,  horas, tipoEjercicio);

        scanner.close();
    }
}
