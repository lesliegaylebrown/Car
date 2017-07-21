public class Car {

    private String Make;
    private String Model;
    private int Year;
    private double Price;

    //constructors

    // no argument constructor

    public Car () {

        Make = "";
        Model = "";
        Year = 2017;
        Price = 0.00;
    }

    public Car (String mk, String mod, int yr, double p){

        Make = mk;
        Model = mod;
        Year = yr;
        Price = p;
    }

    //getters


    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public double getPrice() {
        return Price;
    }

    // setters

    public void setMake(String make) {
        this.Make = Make;
    }

    public void setModel(String model) {
        this.Model = Model;
    }

    public void setYear(int year) {
        this.Year = Year;
    }

    public void setPrice(double price) {
        this.Price = Price;
    }
}
