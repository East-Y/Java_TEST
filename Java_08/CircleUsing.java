package Java_08;

class CircleUsing {
    public static void main(String args[]) {
        Java_08.wxfx.smart.Circle c1 = new Java_08.wxfx.smart.Circle(3.5);
        System.out.println("반지름 3.5 원 넓이 : " + c1.getArea());

        Java_08.fxmx.simple.Circle c2 = new Java_08.fxmx.simple.Circle(3.5);
        System.out.println("반지름 3.5 원 둘레 : " + c2.getPerimeter());
    }
}
