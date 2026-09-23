public class D26 {
    public static void main(String[] args){
        int dish =2;

        String dishName;
        switch(dish){
            case 1:
                dishName = "Pasta";
                break;
            case 2:
                dishName = "Pizza";
                break;
            case 3: 
                dishName = "Burger";
                break;
            case 4: 
                dishName = "Salad";
                break;
            default:
                dishName = "Invalid Dish";
                break;
        }
        System.out.println("Selected Dish: " + dishName);
    }
    
}
