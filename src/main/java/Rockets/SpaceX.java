package Rockets;
public class SpaceX extends Rocket{
    public SpaceX(String rocketName, int capacity) {
        super(rocketName, capacity);

    }

    public String getName() {
        return getRocketName();
    }
}
