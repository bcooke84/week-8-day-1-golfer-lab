import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Rory", "Mclroy", 27);
        Golfer golfer2 = new Golfer("Tiger", "Woods", 37);

        DBGolfer.save(golfer1);
        DBGolfer.save(golfer2);

        List<Golfer> golfers = DBGolfer.getGolfers();

        golfer1.setFirstName("Barry");
        DBGolfer.update(golfer1);

        Golfer foundGolfer = DBGolfer.find(golfer2.getId());


    }
}
