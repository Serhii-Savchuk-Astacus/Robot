package Robot;

public class RoboCleaner implements Robot,Cloneable {
    private int powerOfAccumulator;
    private String name;

    public RoboCleaner(int powerOfAccumulator, String name) {
        this.powerOfAccumulator = powerOfAccumulator;
        this.name = name;
    }

    public RoboCleaner() {
        powerOfAccumulator=0;
        name="";
    }
    public RoboCleaner(RoboCleaner other) {
        this.powerOfAccumulator=other.powerOfAccumulator;
        this.name=other.name;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (RoboCleaner)super.clone();
    }

    @Override
    public void Run() {
        System.out.println(name+" run to cleaning");
    }

    @Override
    public void Charge() {
        System.out.println("Robot cleaner is charging");
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
