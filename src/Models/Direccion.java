package Models;

public class Direccion {
    private String calle;
    private int numCalle;
    private int codigo;

    public Direccion(String calle, int numCalle, int codigo) {
        this.calle = calle;
        this.numCalle = numCalle;
        this.codigo = codigo;
    }
    public Direccion(){}

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return"\n Calle: "+calle
                +"\n numero de calle: : "+numCalle
                +"\n Codigo de Calle: "+codigo;
    }
    
}
