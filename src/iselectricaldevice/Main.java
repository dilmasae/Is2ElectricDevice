package iselectricaldevice;

public class Main {
    public static void main(String[] args) {
        
         Fan fan = new Fan();
         
         Switch s1 = Switch.getInstance(fan);
         
         System.out.println(s1.getDevice().getState());
         
         s1.push();
         
         System.out.println(s1.getDevice().getState());
         
         s1.push();
         
         System.out.println(s1.getDevice().getState());
         
    }
    
}
