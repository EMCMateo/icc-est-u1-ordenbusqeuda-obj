package Views;
import Models.Persona;
public class ViewConsole {
    
        public void printArray(Persona [] personas){
            System.out.println("[ ");
            for (int i = 0; i<personas.length; i++){
                System.out.println(personas[i]+" ,");
            }
            System.out.println(" ]");
        }

        public void showMessage(String message){
            System.out.println(message);
        }
}