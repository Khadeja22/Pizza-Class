package Project;

public class Main {
    public static void main(String[]args)
    {
        
        System.out.println("Hello and welcome to Khadeja's Pizzeria!\nYour pizzas: ");
        
    //Creating three objects

        //Using default constructor
        Pizza p1 = new Pizza();
        
        //Using parameterized constructor
        Pizza p2 = new Pizza("medium", 8, true, "pepperoni", true, false, 10.00);
        
        //Using parameterized constructor
        Pizza p3 = new Pizza("large", 12, true, "veggie", true, true, 12.00);
        
        //To String
        System.out.println(p1+"\n" + p2+"\n"+ p3);

        //Print number of objects created in the tester program referring to static variable.
        System.out.println("You ordered a total of "+ Pizza.getCount() +" pizzas. For all pizzas, you owe us $"+ p3.finalCost());
        

        System.out.println("Enjoy your meal :--)");

    
    }
}
   


