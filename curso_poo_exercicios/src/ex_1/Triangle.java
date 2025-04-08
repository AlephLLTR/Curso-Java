package ex_1;

public class Triangle {

    public double width, height; 
    
    public void setMeasurements(double width, double height){
        this.width = width;
        this.height = height;
    }

    private double getWidth(){
        return this.width;
    }
    private double getHeigth(){
        return this.height;
    }

    public double calculateArea(){
        return getHeigth()*getWidth();
    }

    public double calculatePerimeter(){
        return 2 * (getHeigth() + getWidth());
    }

    public double calculateDiagonal(){
        return Math.sqrt((getHeigth()*getHeigth()) + (getWidth()*getWidth()));
    }


    public String toString(){
        return "AREA = " + calculateArea() + "\nPERIMETER = " + calculatePerimeter() + "\nDIAGONAL = " + calculateDiagonal();
    }

}
