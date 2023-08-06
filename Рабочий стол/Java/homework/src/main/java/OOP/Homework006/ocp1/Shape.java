package OOP.Homework006.ocp1;

public abstract class Shape {

    private ShapeType shapeType;

    public ShapeType getShapeType() {
        return shapeType;
    }

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
