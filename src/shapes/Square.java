package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }


    @Override
    public void setLength(int length) {
        this.length =length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    @Override
    public double getArea() {
        return (length * width);
    }

////    public Square(int side) {
////        super(side, side);
////        }
//    protected int side;
//    public int getArea() {
//        return (side * side);
//    }
//
//    public int getPerimeter() {
//
//        return (4 * side);
//    }
//
//    public Square(int side) {
//        this.side = side;
//    }





}
