package Java_09;

class SinivelCap {
    void take() {
        System.out.println("콧물 치료");
    }
}

class SneezeCap {
    void take() {
        System.out.println("재채기 치료");
    }
}

class SnuffleCap {
    void take() {
        System.out.println("코막힘 치료");
    }
}

class ColdPatient {
    void takeSinivelCap(SinivelCap cap) {
        cap.take();
    }
    void takeSneezeCap(SneezeCap cap) {
        cap.take();
    }
    void takeSnuffleCap(SnuffleCap cap) {
        cap.take();
    }
}

class BadEncapsulation {
    public static void main(String[] args) {
        ColdPatient suf = new ColdPatient();

        suf.takeSinivelCap(new SinivelCap());

        suf.takeSneezeCap(new SneezeCap());

        suf.takeSnuffleCap(new SnuffleCap());
    }
}
