public class TestPlanet {
    public static void main(String[] args)
    {
        Planet a = new Planet(3, 4, 30, 40, 50 / Planet.G, "venus.gif");
        Planet b = new Planet(0, 0, 3, 4, 5, "star.gif");
        Planet[] allPlanets = new Planet[] { a, b };

        System.out.println("a exerted by b, in X: " + a.calcNetForceExertedByX(allPlanets));
        System.out.println("a exerted by b, in Y: " + a.calcNetForceExertedByY(allPlanets));
        System.out.println("b exerted by a, in X: " + b.calcNetForceExertedByX(allPlanets));
        System.out.println("b exerted by a, in X: " + b.calcNetForceExertedByY(allPlanets));
    }
}
