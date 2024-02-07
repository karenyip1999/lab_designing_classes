public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }

    public int area() {
        return this.length * this.width;
    }

    public boolean checkIfSquare()
    {
        if (this.length == this.width) {
            return true;
        }
        else {
            return false;
        }
    }


}
