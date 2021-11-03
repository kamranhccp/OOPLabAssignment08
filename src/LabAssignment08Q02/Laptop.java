package LabAssignment08Q02;

public class Laptop extends Computer{
    protected int length;
    protected int width;
    protected int height;
    protected int weight;

    public Laptop(int length, int width, int height, int weight, int wordSize,
                  int memorySize,int storageSize, int speed){
        super(wordSize, memorySize, storageSize, speed);
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public void setLength(int ln){
        length = ln;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int wd) {
        this.width = wd;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int ht) {
        this.height = ht;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int wg) {
        this.weight = wg;
    }

    public int getWeight() {
        return weight;
    }

    public void LaptopDisplay(){
        super.ComputerDisplay();
        System.out.println("Length: " + length + "\n" +
                "Width: " + width + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight);
    }
}
