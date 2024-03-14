import java.util.ArrayList;

public class SuperMarket extends Shop{
    private double sq;
    private ArrayList<String> Category = new ArrayList<String>();

    public SuperMarket(double area){
        sq=area;
    }
    public SuperMarket(){
        this(12.5);
    }
    public void setCategory(ArrayList<String> catt){
        Category=catt;
    }
    public void setSqare(double ar){
        sq=ar;
    }
    public double effective(){
        // Например, берется отношение  площадь магазина к количеству категорий и умножается на эффективность кассы.
        return (sq/Category.size())*workplace_ef();
    }
}
