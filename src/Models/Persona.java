package Models;

public class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion){
        this.direccion= direccion;
        this.edad= edad;
        this.nombre = nombre;

    }

    public Persona(){}

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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCodigoDireccion(){
        return direccion.getCodigo();
    }

    public boolean CompareToPersonaCodigoDireccion(Persona otraPersona){
        if(this.getCodigoDireccion() < otraPersona.getCodigoDireccion()){
            return true;
        }
        else{
            return false;
        }

        }

        public boolean CompareToPersonaCodigoDireccion(int codigo){
            if(this.getCodigoDireccion() > codigo){
                return true;
            }
            return false;
            }
    

    public String toString(){
        return"Persona: \n"
                +"\n Nombre: "+nombre
                +"\n Edad: : "+edad
                +"\n Direccion: "+direccion;
    }
    
}
