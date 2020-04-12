//write a persion class 
public class Persion {
    private String name;
    private double height;
    private double weight;
    private String address;
    private String color;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWeight(double weight) {
        this.weight = weight;   
    }
    public double getWeight() {
        return this.weight;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String fullName() {
        return "Name is = "+ name + "and height = "+ height + "weight= "+ weight+ "address is= "+ address+"color is "+color;
    }


    public static void main(String[] args) {
        Persion rajan = new Persion();
        rajan.setName("rajan singh");
        rajan.setHeight(5.11);
        rajan.setWeight(88.8);
        rajan.setAddress("allahabad mau");
        rajan.setColor("fear");
        System.out.println(rajan.fullName());
        Persion rohit = new Persion();
        System.out.println(rohit.fullName());
    }
}