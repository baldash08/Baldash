public class Boxes{
   double width,height,depth,volume;
   String box_color;
   public Boxes(double width, double height, double depth) {
       this.width = width;
       this.height = height;
       this.depth = depth;
       volume = width * height * depth;
   }
   public Boxes(String box_color) {
       this.box_color = box_color;
   }
   public Boxes() {
       System.out.println("This is empty Box constructor");
   }
    public static void main(String[] args) {
        Boxes box_volume = new Boxes(4D,3D,5D);
        Boxes box_color = new Boxes("BLACK");
        Boxes empty_box = new Boxes();

        System.out.println("This is my big box. Box volume is " + box_volume.volume) ;
        System.out.println("This box color " + box_color.box_color);
    }
}
