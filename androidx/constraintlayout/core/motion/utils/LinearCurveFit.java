package androidx.constraintlayout.core.motion.utils;

public class LinearCurveFit extends CurveFit {
    public final double[] a;
    public final double[][] b;
    public final boolean c;
    public final double[] d;

    public LinearCurveFit(double[] arr_f, double[][] arr2_f) {
        this.c = true;
        int v = arr2_f[0].length;
        this.d = new double[v];
        this.a = arr_f;
        this.b = arr2_f;
        if(v > 2) {
            for(int v1 = 0; v1 < arr_f.length; ++v1) {
                double f = arr2_f[v1][0];
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double f, int v) {
        double[] arr_f = this.a;
        double[][] arr2_f = this.b;
        if(this.c) {
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
                double f5 = (f - f3) / (f4 - f3);
                return arr2_f[v1 + 1][v] * f5 + (1.0 - f5) * arr2_f[v1][v];
            }
        }
        return 0.0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double f, double[] arr_f) {
        double[] arr_f1 = this.a;
        double[][] arr2_f = this.b;
        int v = 0;
        if(this.c) {
            double f1 = arr_f1[0];
            double[] arr_f2 = this.d;
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
                double f5 = (f - f4) / (f3 - f4);
                while(v < arr2_f[0].length) {
                    arr_f[v] = arr2_f[v5 + 1][v] * f5 + (1.0 - f5) * arr2_f[v5][v];
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
        if(this.c) {
            double f1 = arr_f1[0];
            double[] arr_f2 = this.d;
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
                double f5 = (f - f4) / (f3 - f4);
                while(v < arr2_f[0].length) {
                    arr_f[v] = (float)(arr2_f[v5 + 1][v] * f5 + (1.0 - f5) * arr2_f[v5][v]);
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
            if(f >= f1) {
                f = f1;
            }
        }
        else {
            f = f1;
        }
        for(int v1 = 0; v1 < arr_f.length - 1; ++v1) {
            double f2 = arr_f[v1 + 1];
            if(f <= f2) {
                return (this.b[v1 + 1][v] - this.b[v1][v]) / (f2 - arr_f[v1]);
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
            if(f >= f1) {
                f = f1;
            }
        }
        else {
            f = f1;
        }
        for(int v2 = 0; v2 < arr_f1.length - 1; ++v2) {
            double f2 = arr_f1[v2 + 1];
            if(f <= f2) {
                double f3 = f2 - arr_f1[v2];
                for(int v = 0; v < v1; ++v) {
                    arr_f[v] = (arr2_f[v2 + 1][v] - arr2_f[v2][v]) / f3;
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

