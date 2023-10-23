public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.teleport(0, 0);
        plane.pausetime = 0;
        plane.isTrail = true;
        plane.trailWidth = 10;

        for (int a = 1; a < 70; a = a + 1) {
            for (int x = 1; x < 100; x = x + 1) {
                plane.setColor(a*3, x*2, 255);
                System.out.println(x);
                plane.startingAngle(360);
                plane.square(10);
                plane.isTrail = false;
                plane.teleport(plane.xpos + 10,plane.ypos);

            }
            plane.teleport(0, plane.ypos+10);
        }
    }
}
