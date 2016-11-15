/**
 * Created by Marcel on 15.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        MicroDVD microDVD = new MicroDVD();
        try{
            microDVD.delay(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        }
        catch (NumberFormatException e){
            System.out.println("Wrong value in frames");
        }
        catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }
}
