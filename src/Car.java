public class Car {
    private String brand;
    private long price;

    public Car(){
        brand = "no name";
        price= 0;
    }

    public Car(String brandName){
        brand = brandName;
        price= 0;
    }


    public Car(String brandName, long priceVal){
        brand = brandName;
        price= priceVal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Car C1= new Car();
        System.out.println(C1.getBrand());
        Car C2= new Car("BMW");
        System.out.println(C2.getBrand());
        Car C3= new Car("BMW", 100000);
        System.out.println(C3.getBrand());
        System.out.println(C3.getPrice());

        FordCar mustang = new FordCar();

    }
}
