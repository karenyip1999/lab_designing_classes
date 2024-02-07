public class Computer {
    private int storage;
    private String modelOfPrinter;

    public Computer (int inputStorage)
    {
        this.storage = inputStorage;
        this.modelOfPrinter = "";
    }

    public int getStorage(){
        return this.storage;
    }

    public void addStorage(int extraStorage)
    {
        this.storage = this.storage + extraStorage;
    }

    public void setModelOfPrinter(String modelOfPrinter) {
        this.modelOfPrinter = modelOfPrinter;
    }

    public String getModelOfPrinter() {
        return modelOfPrinter;
    }

    public void printMessage(String inputMessage)
    {
        if (this.modelOfPrinter != "") {
            System.out.println(inputMessage);
        }
    }

}
