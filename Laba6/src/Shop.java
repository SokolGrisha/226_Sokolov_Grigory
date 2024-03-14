public class Shop {
    class Product {
        private double wage;
        private double price;
        private String name;
        public Product (double w, double p,String label){
            wage = w;
            price = p;
            name = label;
        }
        public Product() {

            this(0, 0,"");
        }
        public double getW(){
            return wage;
        }
        public double getP(){
            return price;
        }
        public String getN(){
            return name;
        }
    }
    private int workers;
    private int w_places;
    Product[] products= {new Product(10,127,"1")} ;

    public Shop(int wrk, int w_pl){
        workers=wrk;
        w_places=w_pl;
    }
    public Shop(){
        this(1,2);
    }

    public void setWorkers(int w){
        workers=w;
    }
    public int getWorkers(){
        return workers;
    }

    public void setWP(int wp){
        w_places=wp;
    }
    public int getWP() {
        return w_places;
    }

    public void set_P(Product[] prd){
        products=prd;
    }
    public Product[] get_P(){return products;}

    public double workplace_ef(){
        return (double) workers/w_places;
    }
    public double avarageW(){
        double aw=0;
        for(int i=0;i<products.length;i++){
            aw=aw+products[i].getW();
        }
        return (double) aw/products.length;
    }
    public double ef(){
        return workplace_ef()/avarageW();
    }

}
