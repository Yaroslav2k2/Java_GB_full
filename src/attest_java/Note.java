package attest_java;

public class Note {
    String brand;
    int volume_ssd;
    int ozu;
    int price;
    String opersysyem;

    @Override
    public String toString() {
        return "Note{" +
                "brand='" + brand  +
                ", volume_ssd=" + volume_ssd +
                ", ozu=" + ozu +
                ", price=" + price +
                ", opersysyem='" + opersysyem  +
                '}'+"\n";
    }
}
