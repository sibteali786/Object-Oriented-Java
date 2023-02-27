
  class Shape{
      public double getArea(){return 0;};
  }

  class Rectangle extends Shape{
      private double width;
      private double length;

      public Rectangle(double width, double length ){
          this.width = width;
          this.length = length;
      }

      public double getArea(){
          return width * length;
      }
  }

    class Circle extends Shape{
        private double radius;

        public Circle(double radius ){
            this.radius = radius;
        }

        public double getArea(){
            return 3.14 * radius;
        }
    }

    class DemoOverriding {
      public static void main(String[] args){
          Shape[] s = new Shape[2];
          s[0] = new Rectangle(2,3);
          s[1] = new Circle(2);
          System.out.println(s[1].getArea());
      }
    }

