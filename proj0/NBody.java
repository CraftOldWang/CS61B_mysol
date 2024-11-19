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
        in.readDouble();//丢掉
        Planet[] Planets = new Planet[Planetnum];
        for (int i=0;i<Planets.length;i++) {
            Planets[i] = new Planet(in.readDouble(),in.readDouble(), in.readDouble(),in.readDouble(),in.readDouble(),in.readString());

        }
        
        return Planets;
    }

    public static void main(String[] args){
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];

        double universe_radius = readRadius(filename);
        Planet[] Planets = readPlanets(filename);

    }

    /**Test drawing */
    public static void main(String[] args){
        StdDraw.setScale(-100, 100);
        
    }
}
