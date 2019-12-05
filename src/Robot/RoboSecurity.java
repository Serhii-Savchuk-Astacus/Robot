package Robot;

public class RoboSecurity implements Robot,Cloneable {
    private int powerOfAccumulator;
    private String name;

    public RoboSecurity(int powerOfAccumulator, String name) {
        this.powerOfAccumulator = powerOfAccumulator;
        this.name = name;
    }

    public RoboSecurity() {
        powerOfAccumulator=0;
        name="";
    }
    public RoboSecurity(RoboSecurity other) {
        this.powerOfAccumulator=other.powerOfAccumulator;
        this.name=other.name;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (RoboSecurity)super.clone();
    }

    @Override
    public void Run() {
        System.out.println(name+" is run");
    }

    @Override
    public void Charge() {
System.out.println("Security is charging");
    }

    public int getPowerOfAccumulator() {
        return powerOfAccumulator;
    }
    @Override
    public void setPowerOfAccumulator(int powerOfAccumulator) {
        this.powerOfAccumulator = powerOfAccumulator;
    }

    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
