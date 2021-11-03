package LabAssignment08Q02;

public class Computer {
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected int speed;

    // Constructor
    public Computer(int wordSize, int memorySize, int storageSize, int speed){
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void setWordSize(int wSize){
        wordSize = wSize;
    }

    public void setMemorySize(int mSize){
        memorySize = mSize;
    }

    public void setStorageSize(int sSize){
        storageSize = sSize;
    }

    public void setSpeed(int spd){
        speed = spd;
    }

    public int getWordSize(){
        return wordSize;
    }

    public int getMemorySize(){
        return memorySize;
    }

    public int getStorageSize(){
        return storageSize;
    }

    public int getSpeed(){
        return speed;
    }

    public void ComputerDisplay(){
        System.out.println("\r");
        System.out.println("====================");
        System.out.println("  COMPUTER DETAILS   ");
        System.out.println("====================");
        System.out.println(
                "Word Size(in bits): " + wordSize + "\n" +
                "Memory Size(in Megabytes): " + memorySize + "\n" +
                "Storage Size(in Megabytes): " + storageSize + "\n" +
                "Speed Size(in Megahertz): " + speed);
    }
}
