import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.firstInt(app);
    }

    public void firstInt(App app){
        Food info = new Food(1.85, 9, 33, 1);
        Compute total=new Compute();

        for(int x = 1; x < 5; x ++){

            //submit argument for Hamburger
            if(x == 1){
                 info = new Food(1.85, 9, 33, 1);
            }

            //sumbit argument for Salad
            else if(x == 2){
                 info = new Food(2, 1, 11, 5);
            }

            //submit argument for french fries
            else if(x == 3){
                 info = new Food(1.30, 11, 36, 4);
            }

            //submit argument for soda
            else if(x == 4){
                 info = new Food(0.95, 0, 38, 0);
            }

            System.out.print("Enter number of " + info.getFoodname(x)+" : ");
            int userinp = app.askforInput();
            total.addTotal(x, userinp, info.getPrice());

            //return Food Information
            System.out.println("Each " + info.getFoodname(x) + " has a "+info.getFat()+ " of fat," + info.getCarb()+" of carbs, and " + info.getFiber()+" of fiber.");                    
            System.out.println();
        }
        DecimalFormat numberFormat= new DecimalFormat("#.00");
        System.out.println("Your order comes to : $" + numberFormat.format(total.getTotal()));

        // ask if user want to repeat the program
        System.out.print("Repeat Program [Y/N] ? ");         
        char scanChar=sc.next().charAt(0);

        if(scanChar == 'y'||scanChar == 'Y'){
            System.out.println();
            total.resetTotal();
            System.out.println();   
            firstInt(app);
        }
        
        else if(scanChar == 'n'||scanChar == 'N'){
            System.exit(0);
        }

    }

    public int askforInput(){
        int userinp=sc.nextInt();
        return userinp;
    }
}
