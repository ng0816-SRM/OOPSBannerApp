public class OOPSBannerUC5 {
    class HelloArgs {
    public static void main(String[] args) {
        
       
        if (args.length > 0) {
         
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        } else {
            
            System.out.println("Hello User");
        }
    }
}
}
