package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    public final double[] a;
    public final a[] b;
    public final boolean c;

    public ArcCurveFit(int[] arr_v, double[] arr_f, double[][] arr2_f) {
        a a1;
        a[] arr_a1;
        double f18;
        double[] arr_f3;
        this.c = true;
        this.a = arr_f;
        this.b = new a[arr_f.length - 1];
        int v = 1;
        int v1 = 1;
        for(int v2 = 0; true; ++v2) {
            a[] arr_a = this.b;
            if(v2 >= arr_a.length) {
                break;
            }
            switch(arr_v[v2]) {
                case 0: {
                    v1 = 3;
                    break;
                }
                case 1: {
                    v = 1;
                    v1 = 1;
                    break;
                }
                case 2: {
                    v = 2;
                    v1 = 2;
                    break;
                }
                case 3: {
                    v = v == 1 ? 2 : 1;
                    v1 = v;
                }
            }
            double f = arr_f[v2];
            double f1 = arr_f[v2 + 1];
            double[] arr_f1 = arr2_f[v2];
            double f2 = arr_f1[0];
            double f3 = arr_f1[1];
            double[] arr_f2 = arr2_f[v2 + 1];
            double f4 = arr_f2[0];
            double f5 = arr_f2[1];
            a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            a0.r = false;
            a0.q = v1 == 1;
            a0.c = f;
            a0.d = f1;
            double f6 = f1 - f;
            double f7 = 1.0 / f6;
            a0.i = f7;
            if(3 == v1) {
                a0.r = true;
            }
            double f8 = f4 - f2;
            double f9 = f5 - f3;
            if(!a0.r && Math.abs(f8) >= 0.001 && Math.abs(f9) >= 0.001) {
                a0.a = new double[101];
                a0.j = ((double)(v1 == 1 ? 1 : -1)) * f8;
                a0.k = f9 * ((double)(v1 == 1 ? -1 : 1));
                if(v1 == 1) {
                    f2 = f4;
                }
                a0.l = f2;
                a0.m = v1 == 1 ? f5 : f3;
                double f11 = f3 - f5;
                int v3 = 0;
                double f12 = 0.0;
                double f13 = 0.0;
                double f14 = 0.0;
                while(true) {
                    arr_f3 = a.s;
                    if(v3 >= 91) {
                        break;
                    }
                    double f15 = Math.toRadians(((double)v3) * 90.0 / 90.0);
                    double f16 = Math.sin(f15) * f8;
                    double f17 = Math.cos(f15) * f11;
                    if(v3 > 0) {
                        f18 = f11;
                        f12 += Math.hypot(f16 - f13, f17 - f14);
                        arr_f3[v3] = f12;
                    }
                    else {
                        f18 = f11;
                    }
                    ++v3;
                    f14 = f17;
                    f13 = f16;
                    f11 = f18;
                }
                arr_a1 = arr_a;
                a1 = a0;
                a1.b = f12;
                for(int v4 = 0; v4 < 91; ++v4) {
                    arr_f3[v4] /= f12;
                }
                for(int v5 = 0; true; ++v5) {
                    double[] arr_f4 = a1.a;
                    if(v5 >= arr_f4.length) {
                        break;
                    }
                    double f19 = ((double)v5) / ((double)(arr_f4.length - 1));
                    int v6 = Arrays.binarySearch(arr_f3, f19);
                    if(v6 >= 0) {
                        arr_f4[v5] = ((double)v6) / 90.0;
                    }
                    else if(v6 == -1) {
                        arr_f4[v5] = 0.0;
                    }
                    else {
                        double f20 = arr_f3[-v6 - 2];
                        arr_f4[v5] = ((f19 - f20) / (arr_f3[-v6 - 1] - f20) + ((double)(-v6 - 2))) / 90.0;
                    }
                }
                a1.n = a1.b * a1.i;
            }
            else {
                arr_a1 = arr_a;
                a1 = a0;
                a1.r = true;
                a1.e = f2;
                a1.f = f4;
                a1.g = f3;
                a1.h = f5;
                double f10 = Math.hypot(f9, f8);
                a1.b = f10;
                a1.n = f10 * f7;
                a1.l = f8 / f6;
                a1.m = f9 / f6;
            }
            arr_a1[v2] = a1;
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double f, int v) {
        double f3;
        a[] arr_a = this.b;
        if(this.c) {
            a a0 = arr_a[0];
            double f1 = a0.c;
            if(f < f1) {
                double f2 = f - f1;
                if(a0.r) {
                    return v == 0 ? f2 * arr_a[0].l + a0.c(f1) : f2 * arr_a[0].m + a0.d(f1);
                }
                a0.g(f1);
                if(v == 0) {
                    f3 = arr_a[0].e();
                    return arr_a[0].a() * f2 + f3;
                }
                f3 = arr_a[0].f();
                return arr_a[0].b() * f2 + f3;
            }
            if(f > arr_a[arr_a.length - 1].d) {
                double f4 = arr_a[arr_a.length - 1].d;
                double f5 = f - f4;
                int v2 = arr_a.length - 1;
                return v == 0 ? f5 * arr_a[v2].l + arr_a[v2].c(f4) : f5 * arr_a[v2].m + arr_a[v2].d(f4);
            }
        }
        else {
            double f6 = arr_a[0].c;
            if(f < f6) {
                f = f6;
            }
            else if(f > arr_a[arr_a.length - 1].d) {
                f = arr_a[arr_a.length - 1].d;
            }
        }
        for(int v1 = 0; v1 < arr_a.length; ++v1) {
            a a1 = arr_a[v1];
            if(f <= a1.d) {
                if(a1.r) {
                    return v == 0 ? a1.c(f) : a1.d(f);
                }
                a1.g(f);
                return v == 0 ? arr_a[v1].e() : arr_a[v1].f();
            }
        }
        return NaN;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double f, double[] arr_f) {
        a[] arr_a = this.b;
        if(this.c) {
            a a0 = arr_a[0];
            double f1 = a0.c;
            if(f < f1) {
                double f2 = f - f1;
                if(a0.r) {
                    a a1 = arr_a[0];
                    arr_f[0] = a1.l * f2 + a0.c(f1);
                    arr_f[1] = f2 * arr_a[0].m + a1.d(f1);
                    return;
                }
                a0.g(f1);
                double f3 = arr_a[0].e();
                arr_f[0] = arr_a[0].a() * f2 + f3;
                double f4 = arr_a[0].f();
                arr_f[1] = arr_a[0].b() * f2 + f4;
                return;
            }
            if(f > arr_a[arr_a.length - 1].d) {
                double f5 = arr_a[arr_a.length - 1].d;
                double f6 = f - f5;
                int v = arr_a.length - 1;
                a a2 = arr_a[v];
                if(a2.r) {
                    a a3 = arr_a[v];
                    arr_f[0] = a3.l * f6 + a2.c(f5);
                    arr_f[1] = f6 * arr_a[v].m + a3.d(f5);
                    return;
                }
                a2.g(f);
                double f7 = arr_a[v].e();
                arr_f[0] = arr_a[v].a() * f6 + f7;
                double f8 = arr_a[v].f();
                arr_f[1] = arr_a[v].b() * f6 + f8;
                return;
            }
        }
        else {
            double f9 = arr_a[0].c;
            if(f < f9) {
                f = f9;
            }
            if(f > arr_a[arr_a.length - 1].d) {
                f = arr_a[arr_a.length - 1].d;
            }
        }
        for(int v1 = 0; v1 < arr_a.length; ++v1) {
            a a4 = arr_a[v1];
            if(f <= a4.d) {
                if(a4.r) {
                    arr_f[0] = a4.c(f);
                    arr_f[1] = arr_a[v1].d(f);
                    return;
                }
                a4.g(f);
                arr_f[0] = arr_a[v1].e();
                arr_f[1] = arr_a[v1].f();
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double f, float[] arr_f) {
        a[] arr_a = this.b;
        if(this.c) {
            a a0 = arr_a[0];
            double f1 = a0.c;
            if(f < f1) {
                double f2 = f - f1;
                if(a0.r) {
                    a a1 = arr_a[0];
                    arr_f[0] = (float)(a1.l * f2 + a0.c(f1));
                    arr_f[1] = (float)(f2 * arr_a[0].m + a1.d(f1));
                    return;
                }
                a0.g(f1);
                double f3 = arr_a[0].e();
                arr_f[0] = (float)(arr_a[0].a() * f2 + f3);
                double f4 = arr_a[0].f();
                arr_f[1] = (float)(arr_a[0].b() * f2 + f4);
                return;
            }
            if(f > arr_a[arr_a.length - 1].d) {
                double f5 = arr_a[arr_a.length - 1].d;
                double f6 = f - f5;
                int v = arr_a.length - 1;
                a a2 = arr_a[v];
                if(a2.r) {
                    a a3 = arr_a[v];
                    arr_f[0] = (float)(a3.l * f6 + a2.c(f5));
                    arr_f[1] = (float)(f6 * arr_a[v].m + a3.d(f5));
                    return;
                }
                a2.g(f);
                arr_f[0] = (float)arr_a[v].e();
                arr_f[1] = (float)arr_a[v].f();
                return;
            }
        }
        else {
            double f7 = arr_a[0].c;
            if(f < f7) {
                f = f7;
            }
            else if(f > arr_a[arr_a.length - 1].d) {
                f = arr_a[arr_a.length - 1].d;
            }
        }
        for(int v1 = 0; v1 < arr_a.length; ++v1) {
            a a4 = arr_a[v1];
            if(f <= a4.d) {
                if(a4.r) {
                    arr_f[0] = (float)a4.c(f);
                    arr_f[1] = (float)arr_a[v1].d(f);
                    return;
                }
                a4.g(f);
                arr_f[0] = (float)arr_a[v1].e();
                arr_f[1] = (float)arr_a[v1].f();
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double f, int v) {
        a[] arr_a = this.b;
        double f1 = arr_a[0].c;
        if(f < f1) {
            f = f1;
        }
        if(f > arr_a[arr_a.length - 1].d) {
            f = arr_a[arr_a.length - 1].d;
        }
        for(int v1 = 0; v1 < arr_a.length; ++v1) {
            a a0 = arr_a[v1];
            if(f <= a0.d) {
                if(a0.r) {
                    return v == 0 ? a0.l : a0.m;
                }
                a0.g(f);
                return v == 0 ? arr_a[v1].a() : arr_a[v1].b();
            }
        }
        return NaN;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double f, double[] arr_f) {
        a[] arr_a = this.b;
        double f1 = arr_a[0].c;
        if(Double.compare(f, f1) < 0) {
            f = f1;
        }
        else if(f > arr_a[arr_a.length - 1].d) {
            f = arr_a[arr_a.length - 1].d;
        }
        for(int v = 0; v < arr_a.length; ++v) {
            a a0 = arr_a[v];
            if(f <= a0.d) {
                if(a0.r) {
                    arr_f[0] = a0.l;
                    arr_f[1] = a0.m;
                    return;
                }
                a0.g(f);
                arr_f[0] = arr_a[v].a();
                arr_f[1] = arr_a[v].b();
                return;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.a;
    }
}

