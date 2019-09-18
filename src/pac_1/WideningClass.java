package pac_1;

public class WideningClass {
    byte byte1 = -128;
    short short1 = 1;
    int int1 = 1;
    long long1 = 1L;
    float float1 = 1.0f;
    double double1 = 1.0d;

    public void widening() {

        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
    }
}