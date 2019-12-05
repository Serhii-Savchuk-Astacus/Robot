package Robot;

import javax.management.openmbean.ArrayType;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,Robot> robots=new HashMap<>();
        robots.put(1,new RoboCar(0,"Car"));
        robots.put(2,new RoboCleaner(0,"cleaner"));
        robots.put(3,new RoboSecurity(0,"Security"));
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
        System.out.println("Origins:");
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
        Iterator<Map.Entry<Integer, Robot>> itr = robots.entrySet().iterator();
        while (itr.hasNext())
            itr.next().getValue().Run();
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
        while (itr.hasNext())
            itr.next().getValue().Charge();
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
        Robot rob1=new RoboCar((RoboCar) robots.get(1));
        Robot rob2=new RoboCleaner((RoboCleaner) robots.get(2));
        Robot rob3=new RoboSecurity((RoboSecurity) robots.get(3));
        rob1.setName("SuperCar");
        rob1.setPowerOfAccumulator(90000);
        rob2.setName("RoboShvabra");
        rob2.setPowerOfAccumulator(90000);
        System.out.println("Clone :");
        rob3.setName("T1000");
        rob3.setPowerOfAccumulator(90000);
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
        rob1.Run();
        rob2.Run();
        rob3.Run();
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
        System.out.println("Origins:");
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
        Iterator<Map.Entry<Integer, Robot>> itr2 = robots.entrySet().iterator();
        while (itr2.hasNext())
            itr2.next().getValue().Run();
        System.out.println("...........................................................................");
        System.out.println("...........................................................................");
    }
}
