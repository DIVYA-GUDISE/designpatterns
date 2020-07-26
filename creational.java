public class SClass {
    
    private static SClass instance = new SClass();
   
    private SClass() {}
    
    public static SClass getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("I'm a singleton object!");   
    }
}
public class Main {
    public static void main(String[] args) {
        SClass sClass = SClass.getInstance();
        sClass.showMessage();
    }
}
