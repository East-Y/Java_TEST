package Java_09;

class SinusCap {
    void sniTake() {
        System.out.println("콧물 치료");
    }

    void sneTake() {
        System.out.println("재채기 치료");
    }

    void snuTake() {
        System.out.println("코막힘 치료");
    }

    void take() {
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient {
    void takeSinus(SinusCap cap) {
        cap.take();
    }
}

class OneClassEncapsulation {
    public static void main(String[] args) {
        ColdPatient suf = new ColdPatient();
        suf.takeSinus(new SinusCap());
    }
}
