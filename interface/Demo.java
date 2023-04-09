
    interface Drawable{
        void draw();
    }
    class Rectangle implements Drawable{
        public void draw(){
            System.out.println("drawing a rectangle");
        }
    }
    class circle implements Drawable{
        public void draw(){
            System.out.println("drawing a circle");
        }
    }
    class Demo{
     public static void main(String[] args) {
        Drawable d = new circle();              //  interface name
        Drawable r = new Rectangle();

       // circle d = new circle();                 //  we can also write class name
       // Drawable r = new Rectangle();
        d.draw();
        r.draw();
        
     }
        
    }
