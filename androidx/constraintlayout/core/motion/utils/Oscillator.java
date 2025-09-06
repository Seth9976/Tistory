package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    public float[] a;
    public double[] b;
    public double[] c;
    public MonotonicCurveFit d;
    public int e;

    public Oscillator() {
        this.a = new float[0];
        this.b = new double[0];
    }

    public final double a(double f) {
        if(Double.compare(f, 0.0) < 0) {
            f = 0.0;
        }
        else if(f > 1.0) {
            f = 1.0;
        }
        int v = Arrays.binarySearch(this.b, f);
        if(v > 0) {
            return 1.0;
        }
        if(v != 0) {
            float[] arr_f = this.a;
            float f1 = arr_f[-v - 1];
            float f2 = arr_f[-v - 2];
            double[] arr_f1 = this.b;
            double f3 = arr_f1[-v - 1];
            double f4 = arr_f1[-v - 2];
            double f5 = ((double)(f1 - f2)) / (f3 - f4);
            return (f * f - f4 * f4) * f5 / 2.0 + ((f - f4) * (((double)f2) - f5 * f4) + this.c[-v - 2]);
        }
        return 0.0;
    }

    public void addPoint(double f, float f1) {
        int v = this.a.length + 1;
        int v1 = Arrays.binarySearch(this.b, f);
        if(v1 < 0) {
            v1 = -v1 - 1;
        }
        this.b = Arrays.copyOf(this.b, v);
        this.a = Arrays.copyOf(this.a, v);
        this.c = new double[v];
        System.arraycopy(this.b, v1, this.b, v1 + 1, v - v1 - 1);
        this.b[v1] = f;
        this.a[v1] = f1;
    }

    public double getSlope(double f, double f1, double f2) {
        double f10;
        double f4;
        double f3 = this.a(f) + f1;
        if(Double.compare(f, 0.0) <= 0) {
            f4 = 0.00001;
        }
        else {
            f4 = f >= 1.0 ? 0.999999 : f;
        }
        int v = Arrays.binarySearch(this.b, f4);
        if(v > 0) {
            f10 = 0.0;
        }
        else if(v != 0) {
            float[] arr_f = this.a;
            float f5 = arr_f[-v - 1];
            float f6 = arr_f[-v - 2];
            double[] arr_f1 = this.b;
            double f7 = arr_f1[-v - 1];
            double f8 = arr_f1[-v - 2];
            double f9 = ((double)(f5 - f6)) / (f7 - f8);
            f10 = ((double)f6) - f9 * f8 + f4 * f9;
        }
        else {
            f10 = 0.0;
        }
        double f11 = f10 + f2;
        switch(this.e) {
            case 1: {
                return 0.0;
            }
            case 2: {
                return Math.signum((f3 * 4.0 + 3.0) % 4.0 - 2.0) * (f11 * 4.0);
            }
            case 3: {
                return f11 * 2.0;
            }
            case 4: {
                return -f11 * 2.0;
            }
            case 5: {
                return Math.sin(6.283185 * f3) * (-6.283185 * f11);
            }
            case 6: {
                return ((f3 * 4.0 + 2.0) % 4.0 - 2.0) * (f11 * 4.0);
            }
            case 7: {
                return this.d.getSlope(f3 % 1.0, 0);
            }
            default: {
                return Math.cos(6.283185 * f3) * (f11 * 6.283185);
            }
        }
    }

    public double getValue(double f, double f1) {
        double f2 = this.a(f) + f1;
        switch(this.e) {
            case 1: {
                return Math.signum(0.5 - f2 % 1.0);
            }
            case 2: {
                return 1.0 - Math.abs((f2 * 4.0 + 1.0) % 4.0 - 2.0);
            }
            case 3: {
                return (f2 * 2.0 + 1.0) % 2.0 - 1.0;
            }
            case 4: {
                return 1.0 - (f2 * 2.0 + 1.0) % 2.0;
            }
            case 5: {
                return Math.cos((f1 + f2) * 6.283185);
            }
            case 6: {
                double f3 = Math.abs(f2 * 4.0 % 4.0 - 2.0);
                return 1.0 - (1.0 - f3) * (1.0 - f3);
            }
            case 7: {
                return this.d.getPos(f2 % 1.0, 0);
            }
            default: {
                return Math.sin(6.283185 * f2);
            }
        }
    }

    public void normalize() {
        double f = 0.0;
        for(int v = 0; true; ++v) {
            float[] arr_f = this.a;
            if(v >= arr_f.length) {
                break;
            }
            f += (double)arr_f[v];
        }
        double f1 = 0.0;
        for(int v2 = 1; true; ++v2) {
            float[] arr_f1 = this.a;
            if(v2 >= arr_f1.length) {
                break;
            }
            f1 += (this.b[v2] - this.b[v2 - 1]) * ((double)((arr_f1[v2 - 1] + arr_f1[v2]) / 2.0f));
        }
        for(int v3 = 0; true; ++v3) {
            float[] arr_f2 = this.a;
            if(v3 >= arr_f2.length) {
                break;
            }
            arr_f2[v3] = (float)(((double)arr_f2[v3]) * (f / f1));
        }
        this.c[0] = 0.0;
        for(int v1 = 1; true; ++v1) {
            float[] arr_f3 = this.a;
            if(v1 >= arr_f3.length) {
                break;
            }
            this.c[v1] = (this.b[v1] - this.b[v1 - 1]) * ((double)((arr_f3[v1 - 1] + arr_f3[v1]) / 2.0f)) + this.c[v1 - 1];
        }
    }

    public void setType(int v, String s) {
        this.e = v;
        if(s != null) {
            this.d = MonotonicCurveFit.buildWave(s);
        }
    }

    @Override
    public String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.a);
    }
}

