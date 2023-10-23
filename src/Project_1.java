public class Project_1 extends World{
    public int red;
    public int blue;
    public int green;


    public void go() {

        plane.teleport(0, 0);
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.trailWidth = 10;


        for (int a = 1; a < 70; a = a + 1) {
            for (int x = 1; x < 100; x = x + 1) {
                plane.setColor(a * 3, x * 2, 255);
                System.out.println(x);
                plane.startingAngle(360);
                plane.square(10);
                plane.isTrail = false;
                plane.teleport(plane.xpos + 10, plane.ypos);

            }
            plane.teleport(0, plane.ypos + 10);
        }
        whatsmyname();
        plane.teleport(plane.random(100, 500), plane.random(100, 500));
        whatsmyname();
        plane.teleport(plane.random(100, 500), plane.random(100, 500));
        whatsmyname();
        plane.teleport(plane.random(100, 500), plane.random(100, 500));
        whatsmyname();

        for (int row = 1; row < 1000; row = row + 1) {
            for (int col = 1; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if ( red > 0; green > 0; blue > 0){
                    System.out.println("color not black");
                    plane.setPixelColor(250, 218, 221);
                }

                for (int row = 1; row < 1000; row = row + 1) {
                    for (int col = 1; col < 100; col++) {
                        plane.teleport(col, row);

                        red = plane.howMuchRed();
                        green = plane.howMuchGreen();
                        blue = plane.howMuchBlue();
                        if ( red == 0 && green == 0 && blue == 0){
                            System.out.println("Name is BLACK!!");
                            plane.setPixelColor(250, 218, 221);


                      for (int a = 1; a < 70; a = a + 1) {
                          for (int x = 1; x < 100; x = x + 1) {
                              plane.setColor(50,50,50);
                              System.out.println(x);
                              pentagon();
                              plane.isTrail = false;
                              plane.teleport(plane.xpos + 100, plane.ypos);

                          }
                      }
                                plane.teleport(0, plane.ypos + 10);





    public void R(){
        plane.isTrail=true;
        plane.startingAngle(-90);
        plane.move(100);
        plane.turn(270);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-225);
        plane.move(70);

    }
    public void A(){
        plane.startingAngle(-80);
        plane.move(100);
        plane.turn(-160);
        plane.move(100);
        plane.turn(-180);
        plane.move(50);
        plane.turn(-220);
        plane.move(60);
    }
    public void E(){
        plane.startingAngle(180);
        plane.move(50);
        plane.startingAngle(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
        plane.turn(180);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
        plane.turn(-90);
        plane.move(50);
    }
    public void whatsmyname(){
        plane.setPixelColor(0,0,0);
        plane.teleport(100,100);
        R();
        plane.teleport(plane.xpos+100,plane.ypos);
        A();
        plane.teleport(plane.xpos+200,plane.ypos);
        E();
    }
    public void square(){
        plane.isTrail=true;
        plane.startingAngle(90);
        plane.move(20);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(20);

    }
    public void pentagon(){
        plane.startingAngle(180);
        plane.move(50);
        plane.turn(108);
        plane.move(50);
        plane.turn(108);
        plane.move(50);
        plane.turn(108);
        plane.move(50);
        plane.turn(108);
        plane.move(50);
        plane.turn(108);



                            }
    }
                        }

}
