package builder;

class Point {

    private double x, y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class Factory {
        // factory method encapsulated in a Factory
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}

class FactoryDemo {
    public static void main(String[] args) {
        Point point1 = Point.Factory.newCartesianPoint(1, 2);
        Point point2 = Point.Factory.newPolarPoint(1, 2);
    }
}
