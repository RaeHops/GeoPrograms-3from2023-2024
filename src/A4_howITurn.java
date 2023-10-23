

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.pausetime = 3;

        plane.teleport(50, 50);


        plane.isTrail = true;
        plane.trailWidth = 10;


        house();

        plane.teleport(500,500);

        tri();tri();tri();tri();tri();tri();tri();tri();

        plane.teleport(300,486);
        house();
        house();





    }

    public void tri(){
        plane.startingAngle(360);
        plane.setColor(200, 255, 244);
        plane.move(100);
        plane.turn(120);
        plane.setColor(244, 200, 255);
        plane.move(100);
        plane.turn(120);
        plane.setColor(255, 244, 200 );
        plane.move(100);

    }

    public void house(){
        tri();
        plane.startingAngle(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);

    }

}
