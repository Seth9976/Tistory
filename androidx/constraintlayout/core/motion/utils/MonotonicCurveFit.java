package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MonotonicCurveFit extends CurveFit {
    public final double[] a;
    public final double[][] b;
    public final double[][] c;
    public final boolean d;
    public final double[] e;

    public MonotonicCurveFit(double[] arr_f, double[][] arr2_f) {
        this.d = true;
        int v = arr2_f[0].length;
        this.e = new double[v];
        int v1 = arr_f.length - 1;
        Class class0 = Double.TYPE;
        double[][] arr2_f1 = (double[][])Array.newInstance(class0, new int[]{v1, v});
        double[][] arr2_f2 = (double[][])Array.newInstance(class0, new int[]{arr_f.length, v});
        for(int v2 = 0; v2 < v; ++v2) {
            for(int v3 = 0; v3 < v1; ++v3) {
                double f = arr_f[v3 + 1] - arr_f[v3];
                double[] arr_f1 = arr2_f1[v3];
                double f1 = (arr2_f[v3 + 1][v2] - arr2_f[v3][v2]) / f;
                arr_f1[v2] = f1;
                if(v3 == 0) {
                    arr2_f2[0][v2] = f1;
                }
                else {
                    arr2_f2[v3][v2] = (arr2_f1[v3 - 1][v2] + f1) * 0.5;
                }
            }
            arr2_f2[v1][v2] = arr2_f1[arr_f.length - 2][v2];
        }
        for(int v4 = 0; v4 < v1; ++v4) {
            for(int v5 = 0; v5 < v; ++v5) {
                double f2 = arr2_f1[v4][v5];
                if(f2 == 0.0) {
                    arr2_f2[v4][v5] = 0.0;
                    arr2_f2[v4 + 1][v5] = 0.0;
                }
                else {
                    double f3 = arr2_f2[v4][v5] / f2;
                    double f4 = arr2_f2[v4 + 1][v5] / f2;
                    double f5 = Math.hypot(f3, f4);
                    if(f5 > 9.0) {
                        double[] arr_f2 = arr2_f2[v4];
                        double[] arr_f3 = arr2_f1[v4];
                        arr_f2[v5] = f3 * (3.0 / f5) * arr_f3[v5];
                        arr2_f2[v4 + 1][v5] = 3.0 / f5 * f4 * arr_f3[v5];
                    }
                }
            }
        }
        this.a = arr_f;
        this.b = arr2_f;
        this.c = arr2_f2;
    }

    public static double a(double f, double f1, double f2, double f3, double f4, double f5) {
        double f6 = f1 * f1;
        return f * f4 + (3.0 * f * f4 * f6 + (3.0 * f * f5 * f6 + (6.0 * f6 * f2 + (f1 * 6.0 * f3 + -6.0 * f6 * f3) - f1 * 6.0 * f2)) - 2.0 * f * f5 * f1 - 4.0 * f * f4 * f1);
    }

    public static double b(double f, double f1, double f2, double f3, double f4, double f5) {
        double f6 = f1 * f1;
        double f7 = f6 * f1;
        return f * f4 * f1 + (f7 * (f * f4) + (f * f5 * f7 + (f7 * 2.0 * f2 + (3.0 * f6 * f3 + -2.0 * f7 * f3) - 3.0 * f6 * f2 + f2)) - f * f5 * f6 - 2.0 * f * f4 * f6);
    }

    public static MonotonicCurveFit buildWave(String s) {
        double[] arr_f = new double[s.length() / 2];
        int v = s.indexOf(40) + 1;
        int v1 = s.indexOf(44, v);
        int v2;
        for(v2 = 0; v1 != -1; ++v2) {
            arr_f[v2] = Double.parseDouble(s.substring(v, v1).trim());
            v = v1 + 1;
            v1 = s.indexOf(44, v);
        }
        arr_f[v2] = Double.parseDouble(s.substring(v, s.indexOf(41, v)).trim());
        double[] arr_f1 = Arrays.copyOf(arr_f, v2 + 1);
        int v3 = arr_f1.length * 3 - 2;
        int v4 = arr_f1.length - 1;
        double[][] arr2_f = new double[v3][1];
        double[] arr_f2 = new double[v3];
        for(int v5 = 0; v5 < arr_f1.length; ++v5) {
            double f = arr_f1[v5];
            int v6 = v5 + v4;
            arr2_f[v6][0] = f;
            double f1 = ((double)v5) * (1.0 / ((double)v4));
            arr_f2[v6] = f1;
            if(v5 > 0) {
                int v7 = v4 * 2 + v5;
                arr2_f[v7][0] = f + 1.0;
                arr_f2[v7] = f1 + 1.0;
                arr2_f[v5 - 1][0] = f - 1.0 - 1.0 / ((double)v4);
                arr_f2[v5 - 1] = f1 - 1.0 - 1.0 / ((double)v4);
            }
        }
        return new MonotonicCurveFit(arr_f2, arr2_f);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double f, int v) {
        double[] arr_f = this.a;
        double[][] arr2_f = this.b;
        if(this.d) {
            double f1 = arr_f[0];
            if(f <= f1) {
                return this.getSlope(f1, v) * (f - f1) + arr2_f[0][v];
            }
            int v2 = arr_f.length - 1;
            double f2 = arr_f[v2];
            if(f >= f2) {
                return this.getSlope(f2, v) * (f - f2) + arr2_f[v2][v];
            }
        }
        else {
            if(f <= arr_f[0]) {
                return arr2_f[0][v];
            }
            int v3 = arr_f.length - 1;
            if(f >= arr_f[v3]) {
                return arr2_f[v3][v];
            }
        }
        for(int v1 = 0; v1 < arr_f.length - 1; ++v1) {
            double f3 = arr_f[v1];
            if(f == f3) {
                return arr2_f[v1][v];
            }
            double f4 = arr_f[v1 + 1];
            if(f < f4) {
                return MonotonicCurveFit.b(f4 - f3, (f - f3) / (f4 - f3), arr2_f[v1][v], arr2_f[v1 + 1][v], this.c[v1][v], this.c[v1 + 1][v]);
            }
        }
        return 0.0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double f, double[] arr_f) {
        double[] arr_f1 = this.a;
        double[][] arr2_f = this.b;
        int v = 0;
        if(this.d) {
            double f1 = arr_f1[0];
            double[] arr_f2 = this.e;
            if(Double.compare(f, f1) <= 0) {
                this.getSlope(f1, arr_f2);
                for(int v1 = 0; v1 < arr2_f[0].length; ++v1) {
                    arr_f[v1] = (f - arr_f1[0]) * arr_f2[v1] + arr2_f[0][v1];
                }
                return;
            }
            int v2 = arr_f1.length - 1;
            double f2 = arr_f1[v2];
            if(f >= f2) {
                this.getSlope(f2, arr_f2);
                while(v < arr2_f[0].length) {
                    arr_f[v] = (f - arr_f1[v2]) * arr_f2[v] + arr2_f[v2][v];
                    ++v;
                }
                return;
            }
        }
        else {
            if(f <= arr_f1[0]) {
                for(int v3 = 0; v3 < arr2_f[0].length; ++v3) {
                    arr_f[v3] = arr2_f[0][v3];
                }
                return;
            }
            int v4 = arr_f1.length - 1;
            if(f >= arr_f1[v4]) {
                while(v < arr2_f[0].length) {
                    arr_f[v] = arr2_f[v4][v];
                    ++v;
                }
                return;
            }
        }
        for(int v5 = 0; v5 < arr_f1.length - 1; ++v5) {
            if(f == arr_f1[v5]) {
                for(int v6 = 0; v6 < arr2_f[0].length; ++v6) {
                    arr_f[v6] = arr2_f[v5][v6];
                }
            }
            double f3 = arr_f1[v5 + 1];
            if(f < f3) {
                double f4 = arr_f1[v5];
                while(v < arr2_f[0].length) {
                    arr_f[v] = MonotonicCurveFit.b(f3 - f4, (f - f4) / (f3 - f4), arr2_f[v5][v], arr2_f[v5 + 1][v], this.c[v5][v], this.c[v5 + 1][v]);
                    ++v;
                }
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double f, float[] arr_f) {
        double[] arr_f1 = this.a;
        double[][] arr2_f = this.b;
        int v = 0;
        if(this.d) {
            double f1 = arr_f1[0];
            double[] arr_f2 = this.e;
            if(Double.compare(f, f1) <= 0) {
                this.getSlope(f1, arr_f2);
                for(int v1 = 0; v1 < arr2_f[0].length; ++v1) {
                    arr_f[v1] = (float)((f - arr_f1[0]) * arr_f2[v1] + arr2_f[0][v1]);
                }
                return;
            }
            int v2 = arr_f1.length - 1;
            double f2 = arr_f1[v2];
            if(f >= f2) {
                this.getSlope(f2, arr_f2);
                while(v < arr2_f[0].length) {
                    arr_f[v] = (float)((f - arr_f1[v2]) * arr_f2[v] + arr2_f[v2][v]);
                    ++v;
                }
                return;
            }
        }
        else {
            if(f <= arr_f1[0]) {
                for(int v3 = 0; v3 < arr2_f[0].length; ++v3) {
                    arr_f[v3] = (float)arr2_f[0][v3];
                }
                return;
            }
            int v4 = arr_f1.length - 1;
            if(f >= arr_f1[v4]) {
                while(v < arr2_f[0].length) {
                    arr_f[v] = (float)arr2_f[v4][v];
                    ++v;
                }
                return;
            }
        }
        for(int v5 = 0; v5 < arr_f1.length - 1; ++v5) {
            if(f == arr_f1[v5]) {
                for(int v6 = 0; v6 < arr2_f[0].length; ++v6) {
                    arr_f[v6] = (float)arr2_f[v5][v6];
                }
            }
            double f3 = arr_f1[v5 + 1];
            if(f < f3) {
                double f4 = arr_f1[v5];
                while(v < arr2_f[0].length) {
                    arr_f[v] = (float)MonotonicCurveFit.b(f3 - f4, (f - f4) / (f3 - f4), arr2_f[v5][v], arr2_f[v5 + 1][v], this.c[v5][v], this.c[v5 + 1][v]);
                    ++v;
                }
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double f, int v) {
        double[] arr_f = this.a;
        double f1 = arr_f[0];
        if(f >= f1) {
            f1 = arr_f[arr_f.length - 1];
            if(f < f1) {
                f1 = f;
            }
        }
        for(int v1 = 0; v1 < arr_f.length - 1; ++v1) {
            double f2 = arr_f[v1 + 1];
            if(f1 <= f2) {
                double f3 = arr_f[v1];
                double f4 = f2 - f3;
                return MonotonicCurveFit.a(f4, (f1 - f3) / f4, this.b[v1][v], this.b[v1 + 1][v], this.c[v1][v], this.c[v1 + 1][v]) / f4;
            }
        }
        return 0.0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double f, double[] arr_f) {
        double[] arr_f1 = this.a;
        double[][] arr2_f = this.b;
        int v1 = arr2_f[0].length;
        double f1 = arr_f1[0];
        if(f > f1) {
            f1 = arr_f1[arr_f1.length - 1];
            if(f < f1) {
                f1 = f;
            }
        }
        for(int v2 = 0; v2 < arr_f1.length - 1; ++v2) {
            double f2 = arr_f1[v2 + 1];
            if(f1 <= f2) {
                double f3 = arr_f1[v2];
                double f4 = f2 - f3;
                for(int v = 0; v < v1; ++v) {
                    arr_f[v] = MonotonicCurveFit.a(f4, (f1 - f3) / f4, arr2_f[v2][v], arr2_f[v2 + 1][v], this.c[v2][v], this.c[v2 + 1][v]) / f4;
                }
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.a;
    }
}

