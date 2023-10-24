package Project;
class Pizza {
    
//Instance Data
    private String size;
    private int slices;
    private boolean toppings;
    private String toppingType;
    private boolean toGo;
    private boolean crustFill;
    private double cost=0;
    //Static count variable
    private static int count = 0;
    private int pizzaID;
    private static double totalCost = 0;

//Constructors
//Parameterized Constructor
public Pizza(String size, int slices, boolean toppings, String toppingType, boolean toGo, boolean crustFill, double cost)
{
    setSize(size);
    setSlices(slices);
    setToppings(toppings);
    setToGo(toGo);
    setCrustFill(crustFill);
    setCost(cost);
    setToppingType(toppingType);
    count++;
    pizzaID=count;
    totalCost+=cost;
    if (crustFill)
    {
        setCost(cost+1.00);
        totalCost++;
    }

}

//Default Constructor
public Pizza()
{
    this.size="small";
    this.slices=5;
    this.toppings=false;
    this.toppingType="no";
    this.toGo=false;
    this.crustFill=false;
    this.cost=6.00;
    
    count++;
    this.pizzaID = count;
    totalCost+=cost;
}


//Accessor methods (getters)
    public String getSize()
    {
        return size;
    }

    public int getSlices()
    {
        return slices;
    }

    public boolean getToppings()
    {
        return toppings;
    }

    public String getToppingType()
    {
        return toppingType;
    }

    public boolean getToGo()
    {
        return toGo;
    }

    public boolean getCrustFill()
    {
        return crustFill;
    }

    public double getCost()
    {
        return cost;
    }

    public static int getCount()
    {
        return count;
    }

//Mutator methods (setters)
    public void setSize(String newSize)
    {
        this.size = newSize;
    }

    public void setSlices(int newSlices)
    {
        this.slices = newSlices;
    }

    public void setToppings(boolean newToppings)
    {
        this.toppings = newToppings;
    }

    public void setToppingType(String newToppingType)
    {
        this.toppingType = newToppingType;
    }

    public void setToGo(boolean newToGo)
    {
        this.toGo = newToGo;
    }

    public void setCrustFill(boolean newCrustFill)
    {
        this.crustFill = newCrustFill;
    }

    public void setCost(double newCost)
    {
        this.cost = newCost;
    }

    

//Other method. Evaluates final cost with all pizzas + 6% tax.
    public double finalCost()
    {
        double lastCost = totalCost+(0.06*totalCost);
        return lastCost;
    }


//toString Method
    public String toString()
    {
        String toppingsBool="with";
        
        String eatingStatus=null;
        if (toGo)
        {
            eatingStatus="to-go";
        }
        else
        {
            eatingStatus="for-here";
        }

        String crustStatus=null;
        if (crustFill)
        {
            crustStatus="filled";
        }
        else
        {
            crustStatus="not filled";
        }

        return pizzaID+": You ordered a "+size+" pizza that is cut into "+slices+" slices, "+toppingsBool+" "+toppingType+" toppings, and a "+ crustStatus +" crust. Your pizza is "+eatingStatus+" and it costs $"+cost;
        
        }


}
