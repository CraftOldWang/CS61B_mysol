public class Planet {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    static final double G = 6.67e-11;

    public Planet(double xP, double yP, double xV, double yV, double m, String img)
    {
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }
    public Planet(Planet b)
    {
        xxPos = b.xxPos;
        yyPos = b.yyPos;
        xxVel = b.xxVel;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;
    }
    public double calcDistance(Planet b)
    {
        double dx = b.xxPos - xxPos;
        double dy = b.yyPos - yyPos;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double calcForceExertedBy(Planet b)
    {
        double distance = this.calcDistance(b);
        return G * mass * b.mass / (distance * distance);
    }

    public double calcForceExertedByX(Planet b)
    {
        double distance = calcDistance(b);
        double dx = b.xxPos - xxPos;
        return calcForceExertedBy(b) * dx / distance;
    }

    public double calcForceExertedByY(Planet b)
    {
        double distance = calcDistance(b);
        double dy = b.yyPos - yyPos;
        return calcForceExertedBy(b) * dy / distance;
    }

    public double calcNetForceExertedByX(Planet[] allplanets)
    {
        double NetFx = 0;
        for (Planet b : allplanets) {
            if (!equals(b)) {
                NetFx += calcForceExertedByX(b);
            }
        }
        return NetFx;
    }

    public double calcNetForceExertedByY(Planet[] allplanets)
    {
        double NetFy = 0;
        for (Planet b : allplanets) {
            if (!equals(b)) {
                NetFy += calcForceExertedByY(b);
            }
        }
        return NetFy;
    }

    public boolean equals(Planet b)
    {
        return this == b;
    }

    public void update(double dt, double Fx, double Fy)
    {
        double ax = Fx/mass;
        double ay = Fy/mass;
        xxVel += ax*dt;
        yyVel += ay*dt;
        
        xxPos += xxVel*dt;//只是个近似,不应该全用更新后的速度算位移的;但也不是匀加速...总之近似
        yyPos += yyVel*dt;
        
    }
}