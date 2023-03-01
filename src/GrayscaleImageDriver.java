public class GrayscaleImageDriver extends GrayscaleImage {
    public static void main(String[] args) {
        GrayscaleImage g = new GrayscaleImage();
        System.out.println(g.countWhitePixels());
        g.printPixels();
        g.processImage();
        System.out.println();
        g.printPixels();

    }
}
