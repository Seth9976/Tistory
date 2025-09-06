package androidx.appcompat.app;

public final class u0 {
    public long a;
    public long b;
    public int c;
    public static u0 d;

    public final void a(double f, double f1, long v) {
        float f2 = ((float)(v - 946728000000L)) / 86400000.0f;
        float f3 = 0.017202f * f2 + 6.24006f;
        double f4 = Math.sin(f3 * 3.0f) * 0.000005 + (Math.sin(2.0f * f3) * 0.000349 + (Math.sin(f3) * 0.03342 + ((double)f3))) + 4.938186;
        double f5 = Math.sin(2.0 * f4) * -0.0069 + (Math.sin(f3) * 0.0053 + (((double)(((float)Math.round(((double)(f2 - 0.0009f)) - -f1 / 360.0)) + 0.0009f)) + -f1 / 360.0));
        double f6 = Math.asin(0.397949 * Math.sin(f4));
        double f7 = (-0.104528 - Math.sin(f6) * Math.sin(0.017453 * f)) / (Math.cos(f6) * Math.cos(0.017453 * f));
        if(Double.compare(f7, 1.0) >= 0) {
            this.c = 1;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        if(Double.compare(f7, -1.0) <= 0) {
            this.c = 0;
            this.a = -1L;
            this.b = -1L;
            return;
        }
        double f8 = (double)(((float)(Math.acos(f7) / 6.283185)));
        this.a = Math.round((f5 + f8) * 86400000.0) + 946728000000L;
        long v1 = Math.round((f5 - f8) * 86400000.0);
        this.b = v1 + 946728000000L;
        if(v1 + 946728000000L < v && this.a > v) {
            this.c = 0;
            return;
        }
        this.c = 1;
    }
}

