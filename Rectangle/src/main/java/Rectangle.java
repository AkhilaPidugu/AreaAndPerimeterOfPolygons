public class Rectangle {
    int length,breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(int side) {
        this.length=side;
        this.breadth=side;
    }

    public int areaOfRectangle() {
        if (length != breadth){
        if(length < 0 && breadth < 0){ throw new RuntimeException("Length and Breadth of the Rectangle cannot be Negative Values"); }
        else if(length < 0){  throw new RuntimeException("Length of the Rectangle cannot be Negative Value");}
        else if(breadth < 0){  throw new RuntimeException("Breadth of the Rectangle cannot be Negative Value");}
        else if(length == 0 ){ throw new RuntimeException("Length of the Rectangle cannot be Zero");}
        else if(breadth == 0){ throw new RuntimeException("Breadth of the Rectangle cannot be Zero");}
        }
        else {
            if(length < 0){ throw new RuntimeException("Side of a Square cannot be Negative Value"); }
            else if(length == 0){ throw new RuntimeException("Side of a Square cannot be Zero");}
        }
        return length*breadth;

    }

    public int perimeterOfRectangle() {
        if(length < 0 && breadth < 0){ throw new RuntimeException("Length and Breadth of the Rectangle cannot be Negative Values"); }
        else if(length < 0){  throw new RuntimeException("Length of the Rectangle cannot be Negative Value");}
        else if(breadth < 0){  throw new RuntimeException("Breadth of the Rectangle cannot be Negative Value");}
        else if(length == 0 && breadth == 0){ throw new RuntimeException("Length and Breadth of the Rectangle cannot be Zero");}
        else if(length == 0 ){ throw new RuntimeException("Length of the Rectangle cannot be Zero");}
        else if(breadth == 0){ throw new RuntimeException("Breadth of the Rectangle cannot be Zero");}
        return 2*(length+breadth);
    }



}