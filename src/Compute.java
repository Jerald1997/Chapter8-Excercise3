public class Compute{
   private double totalPrice;
    
    public void addTotal(int item, int userinp, double price){
     //   double duserinp=Double.valueOf(userinp);
        double tPrice=userinp*price;
        totalPrice=totalPrice+tPrice;
    }

    public double getTotal(){
        return(totalPrice);
    }

    public void resetTotal(){
        totalPrice=0;
    }

}