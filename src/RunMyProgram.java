

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    // "public static void main(..) should only appear once in any project. It is where the instructions begin.
    public static void main(String[] args) {
        World run;

        run = (new Project_1()   );
        run.planeIcon = "plane.png";
        run.pictureFileName = "duo bird.png";
        run.HEIGHT = 800;
        run.WIDTH = 1000;
        run.Refresh();

        //new Thread(run).start();
    }
}
