class Area_Of_Circle_Using_Super_Keyword {
    int r = 5;
}
class VolumeOfCylinder extends Area_Of_Circle_Using_Super_Keyword {
    int h = 5;
    void calc() {
        System.out.println("Area_Of_Circle_Using_Super_Keyword= " + (3.14 * super.r * super.r));
        System.out.println("VolumeOfCylinder= " + (3.14 * super.r * super.r * h));
    }
    public static void main(String arg[]) {
        VolumeOfCylinder v = new VolumeOfCylinder();
        v.calc();
    }
}
