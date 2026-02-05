public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        String result = "";
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static void printStaticTriangle(int width) {
        StarTriangle triangle = new StarTriangle(width);
        System.out.println(triangle.toString());
    }
}