package net.cyrus;

public abstract class HitChecker {
    public static void checkHit(Point point) {
        point.setResult(checkArea(point.getX(), point.getY(), point.getR()) ? "YES" : "NO");
    }

    public static boolean checkArea(double x, double y, double r) {
        return (checkRectangle(x, y, r) || checkTriangle(x, y, r) || checkCircle(x, y, r));
    }

    public static boolean checkRectangle(double x, double y, double r) {
        return x <= 0 && y <= 0 && (Math.abs(x) <= r) && (Math.abs(y) <= r);
    }

    public static boolean checkTriangle(double x, double y, double r) {
        return x <= 0 && y <= 0 && (Math.abs(x) <= r) && (Math.abs(y) <= r);
    }

    public static boolean checkCircle(double x, double y, double r) {
        return x >= 0 && y <= 0 && (x * x + y * y) <= r * r;
    }
}
