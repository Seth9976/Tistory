package androidx.constraintlayout.core.motion.utils;

public class HyperSpline {
    public static class Cubic {
        public final double a;
        public final double b;
        public final double c;
        public final double d;

        public Cubic(double f, double f1, double f2, double f3) {
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
        }

        public double eval(double f) {
            return ((this.d * f + this.c) * f + this.b) * f + this.a;
        }

        public double vel(double f) {
            return (this.c * 2.0 + this.d * 3.0 * f) * f + this.b;
        }
    }

    public int a;
    public Cubic[][] b;
    public int c;
    public double[] d;
    public double e;
    public double[][] f;

    public HyperSpline() {
    }

    public HyperSpline(double[][] arr2_f) {
        this.setup(arr2_f);
    }

    public double approxLength(Cubic[] arr_hyperSpline$Cubic) {
        int v;
        double[] arr_f = new double[arr_hyperSpline$Cubic.length];
        double f = 0.0;
        double f2 = 0.0;
        for(double f1 = 0.0; true; f1 += 0.1) {
            v = 0;
            if(Double.compare(f1, 1.0) >= 0) {
                break;
            }
            double f3 = 0.0;
            while(v < arr_hyperSpline$Cubic.length) {
                double f4 = arr_f[v];
                double f5 = arr_hyperSpline$Cubic[v].eval(f1);
                arr_f[v] = f5;
                f3 += (f4 - f5) * (f4 - f5);
                ++v;
            }
            if(f1 > 0.0) {
                f2 += Math.sqrt(f3);
            }
        }
        while(v < arr_hyperSpline$Cubic.length) {
            double f6 = arr_f[v];
            double f7 = arr_hyperSpline$Cubic[v].eval(1.0);
            arr_f[v] = f7;
            f += (f6 - f7) * (f6 - f7);
            ++v;
        }
        return Math.sqrt(f) + f2;
    }

    public double getPos(double f, int v) {
        double[] arr_f;
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            arr_f = this.d;
            if(v1 >= arr_f.length - 1) {
                break;
            }
            double f2 = arr_f[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        return this.b[v][v1].eval(f1 / arr_f[v1]);
    }

    public void getPos(double f, double[] arr_f) {
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            double[] arr_f1 = this.d;
            if(v1 >= arr_f1.length - 1) {
                break;
            }
            double f2 = arr_f1[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] = this.b[v][v1].eval(f1 / this.d[v1]);
        }
    }

    public void getPos(double f, float[] arr_f) {
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            double[] arr_f1 = this.d;
            if(v1 >= arr_f1.length - 1) {
                break;
            }
            double f2 = arr_f1[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] = (float)this.b[v][v1].eval(f1 / this.d[v1]);
        }
    }

    public void getVelocity(double f, double[] arr_f) {
        double f1 = f * this.e;
        int v1;
        for(v1 = 0; true; ++v1) {
            double[] arr_f1 = this.d;
            if(v1 >= arr_f1.length - 1) {
                break;
            }
            double f2 = arr_f1[v1];
            if(f2 >= f1) {
                break;
            }
            f1 -= f2;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] = this.b[v][v1].vel(f1 / this.d[v1]);
        }
    }

    public void setup(double[][] arr2_f) {
        int v3;
        this.c = arr2_f[0].length;
        this.a = arr2_f.length;
        this.f = new double[arr2_f[0].length][arr2_f.length];
        this.b = new Cubic[this.c][];
        for(int v = 0; v < this.c; ++v) {
            for(int v1 = 0; v1 < this.a; ++v1) {
                this.f[v][v1] = arr2_f[v1][v];
            }
        }
        for(int v2 = 0; true; ++v2) {
            v3 = this.c;
            if(v2 >= v3) {
                break;
            }
            Cubic[][] arr2_hyperSpline$Cubic = this.b;
            double[] arr_f = this.f[v2];
            double[] arr_f1 = new double[arr_f.length];
            double[] arr_f2 = new double[arr_f.length];
            double[] arr_f3 = new double[arr_f.length];
            int v4 = arr_f.length - 1;
            arr_f1[0] = 0.5;
            for(int v5 = 1; v5 < v4; ++v5) {
                arr_f1[v5] = 1.0 / (4.0 - arr_f1[v5 - 1]);
            }
            int v6 = arr_f.length - 2;
            arr_f1[v4] = 1.0 / (2.0 - arr_f1[v6]);
            arr_f2[0] = (arr_f[1] - arr_f[0]) * 3.0 * arr_f1[0];
            for(int v7 = 1; v7 < v4; ++v7) {
                arr_f2[v7] = ((arr_f[v7 + 1] - arr_f[v7 - 1]) * 3.0 - arr_f2[v7 - 1]) * arr_f1[v7];
            }
            double f = ((arr_f[v4] - arr_f[v6]) * 3.0 - arr_f2[v6]) * arr_f1[v4];
            arr_f2[v4] = f;
            arr_f3[v4] = f;
            while(v6 >= 0) {
                arr_f3[v6] = arr_f2[v6] - arr_f1[v6] * arr_f3[v6 + 1];
                --v6;
            }
            Cubic[] arr_hyperSpline$Cubic = new Cubic[v4];
            for(int v8 = 0; v8 < v4; ++v8) {
                double f1 = arr_f[v8];
                double f2 = arr_f3[v8];
                double f3 = arr_f[v8 + 1];
                double f4 = arr_f3[v8 + 1];
                arr_hyperSpline$Cubic[v8] = new Cubic(((double)(((float)f1))), f2, (f3 - f1) * 3.0 - f2 * 2.0 - f4, (f1 - f3) * 2.0 + f2 + f4);
            }
            arr2_hyperSpline$Cubic[v2] = arr_hyperSpline$Cubic;
        }
        this.d = new double[this.a - 1];
        this.e = 0.0;
        Cubic[] arr_hyperSpline$Cubic1 = new Cubic[v3];
        for(int v9 = 0; v9 < this.d.length; ++v9) {
            for(int v10 = 0; v10 < this.c; ++v10) {
                arr_hyperSpline$Cubic1[v10] = this.b[v10][v9];
            }
            double f5 = this.e;
            double[] arr_f4 = this.d;
            double f6 = this.approxLength(arr_hyperSpline$Cubic1);
            arr_f4[v9] = f6;
            this.e = f5 + f6;
        }
    }
}

