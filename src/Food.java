public class Food{
    private double price;
    private int fat, carb, fiber;

    public Food(double prc, int ft, int crbs,int fbr){
        price=prc;
        fat=ft;
        carb=crbs;
        fiber=fbr;
    }

    public String getFoodname(int count){  
   
        switch (count) {
             case 1:
                return "hamburger";

             case 2:
                return "salad";          
            case 3 :
                return "french fries";

            case 4 :
                 return "soda";
             
             default: 
                return "Default";
        }
        
                           
       
    }

    public int getFat(){
        return(fat);
    }
    
    public int getCarb(){
        return(carb);
    }
    
    public int getFiber(){
        return(fiber);
    }

    public double getPrice(){
        return(price);
    }

}