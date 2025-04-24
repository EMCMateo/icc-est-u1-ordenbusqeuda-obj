package Controllers;
import Models.Persona;
public class PersonaControlles {

    public void sortByDireccionCodigo(Persona [] personas){
        Persona aux;
        int indiceMax = 0;
        for (int i = 0; i<personas.length-1; i++){
            indiceMax = i;
            for (int j=i+1; j<personas.length;j++){
                if(personas[indiceMax].CompareToPersonaCodigoDireccion(personas[j]) == true){
                    indiceMax = j;
                }
            }
            if (indiceMax != i ){
                aux = personas[indiceMax];
                personas[indiceMax] = personas[i];
                personas[i] = aux;
            }
            
        }

        }

        
    


    public int findByCodigo(Persona [] personas, int codigo){
        int inicio = 0;
        int fin = personas.length-1;
        while (inicio <= fin){
            int centro = (inicio + fin)/2;
            int valorC =  personas[centro].getCodigoDireccion();
            if ( valorC == codigo){
                return centro;
            }
            else if ( personas[centro].CompareToPersonaCodigoDireccion(codigo)){
                inicio = centro + 1;
            }
            else{
                fin = centro-1;
            }

        }
        return -1 ;

    }
    public void buscarPersonaPorNombre(Persona[] personas, int codigo) {
        int index = findByCodigo(personas, codigo);
        
        if (index != -1) {
            System.out.println("Persona encontrada, índice: " + index);
             System.out.println(personas[index].toString());
        } else {
            System.out.println(("No encontrado."));
        }
    }
    }
    

