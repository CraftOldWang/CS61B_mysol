public class Dog{
    public int weightInPounds;
    public static String binomen = "Canis familiaris";


    public Dog(int w){
        weightInPounds = w;
    }
    
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog(15);
        Dog d2 = new Dog(100);
        Dog d3 = Dog.maxDog(d1, d2);
        String m = Dog.binomen;
        m = d1.binomen;//这样是不好的，因为binomen是一个类变量，不应该通过对象来访问
        System.out.println(d3.weightInPounds);
    }
}