public class NBody {
    public static double readRadius(String filepath)
    {
        In in = new In(filepath);

        int planets_num = in.readInt();
        double Radius = in.readDouble();
        return Radius;
    }

    public static Planet[] readPlanets(String filepath)
    {
        In in = new In(filepath);

        int Planetnum = in.readInt();
        in.readDouble(); // 丢掉
        Planet[] Planets = new Planet[Planetnum];
        for (int i = 0; i < Planets.length; i++) {
            Planets[i] = new Planet(in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readDouble(), in.readString());
        }

        return Planets;
    }

    public static void main(String[] args)
    {
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        double time_now = 0;

        double universe_radius = readRadius(filename);
        Planet[] Planets = readPlanets(filename);

        StdDraw.setScale(-universe_radius, universe_radius);
        String imgtodraw = "./images/starfield.jpg";

        StdDraw.enableDoubleBuffering();
        while (time_now <= T) {
            double[] xForce = new double[Planets.length];
            double[] yForce = new double[Planets.length];
            for (int i = 0; i < Planets.length; i++) {
                xForce[i] = Planets[i].calcNetForceExertedByX(Planets);
                yForce[i] = Planets[i].calcNetForceExertedByY(Planets);
            }
            for (int i = 0; i < Planets.length; i++) {
                Planets[i].update(dt, xForce[i], yForce[i]);
            }

            StdDraw.picture(0, 0, imgtodraw);
            for (Planet b : Planets) {
                b.draw();
            }
            StdDraw.show();
            StdDraw.pause(10);
            time_now += dt;
        }


        
        StdOut.printf("%d\n", Planets.length);
        StdOut.printf("%.2e\n", universe_radius);
        for (int i = 0; i < Planets.length; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
            Planets[i].xxPos, Planets[i].yyPos, Planets[i].xxVel,
            Planets[i].yyVel, Planets[i].mass, Planets[i].imgFileName);   
        }

    }
}
