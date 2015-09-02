import java.util.*;

public class pet() {
    
    System.out.print("PetID v0.1 made by aedan9\n\n");
    
    System.out.println("Welcome to PetId. It is used as a database containing information about different pets. Please follow the instructions.")
    
    private static String name;
    private static byte age;
    private static boolean hasOwner;
    private static String owner;
    private static int uniqueID;
    
    protected numberOfPets = 0;
    
    static Scanner.nameInput = new Scanner(System.in);
    
    public pet() {
        
        numberOfPets++;
        
        System.out.print("Enter the name: \n");
        
        if(nameInput.hasnextLine()) {
            
            this.setName(nameInput.nextline());
            System.out.println("Name set to" + name);
        }
        
    }
    
    public static class main(String[] args) {
        
        pet dog = new pet();
        
    }
}