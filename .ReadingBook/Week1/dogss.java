public class dogss {

    public void bark()
    {
        System.out.println("Moo");
    }
    public static void runFast()
    {
        System.out.println("Ruff Run");
    }

    public static void main(String[] args)
    {
        dogss poppa = new dogss();
        poppa.bark();
        Dog.bark();
        poppa.runFast();
        dogss.runFast();
    }
}
