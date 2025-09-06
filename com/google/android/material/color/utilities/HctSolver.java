package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public class HctSolver {
    public static final double[][] a;
    public static final double[][] b;
    public static final double[] c;
    public static final double[] d;

    static {
        HctSolver.a = new double[][]{new double[]{0.001201, 0.00239, 0.00028}, new double[]{0.000589, 0.002979, 0.000327}, new double[]{0.000101, 0.000536, 0.003298}};
        HctSolver.b = new double[][]{new double[]{1373.219871, -1100.425119, -7.278681}, new double[]{-271.815969, 559.658047, -32.460475}, new double[]{1.96229, -57.173815, 308.72332}};
        HctSolver.c = new double[]{0.2126, 0.7152, 0.0722};
        HctSolver.d = new double[]{0.015176, 0.045529, 0.075882, 0.106234, 0.136587, 0.16694, 0.197293, 0.227645, 0.257998, 0.288351, 0.31883, 0.350926, 0.384831, 0.420575, 0.458183, 0.497684, 0.539102, 0.582465, 0.627797, 0.675123, 0.724467, 0.775853, 0.829305, 0.884845, 0.942497, 1.002283, 1.064224, 1.128342, 1.194659, 1.263196, 1.333973, 1.407011, 1.48233, 1.55995, 1.639891, 1.722172, 1.806811, 1.893829, 1.983244, 2.075074, 2.169338, 2.266054, 2.365239, 2.466911, 2.571089, 2.677788, 2.787027, 2.898822, 3.01319, 3.130148, 3.249712, 3.371899, 3.496724, 3.624204, 3.754355, 3.887193, 4.022732, 4.160989, 4.301978, 4.445716, 4.592217, 4.741496, 4.893569, 5.048448, 5.206151, 5.36669, 5.53008, 5.696336, 5.865472, 6.037501, 6.212438, 6.390297, 6.571092, 6.754835, 6.941541, 7.131224, 7.323896, 7.51957, 7.718262, 7.919982, 8.124744, 8.332562, 8.543449, 8.757416, 8.974477, 9.194644, 9.41793, 9.644348, 9.873909, 10.106627, 10.342513, 10.58158, 10.82384, 11.069305, 11.317986, 11.569897, 11.825048, 12.083452, 12.34512, 12.610064, 12.878295, 13.149826, 13.424667, 13.702831, 13.984327, 14.269169, 14.557366, 14.848931, 15.143873, 15.442206, 15.743939, 16.049083, 16.357649, 16.669649, 16.985093, 17.303992, 17.626356, 17.952197, 18.281525, 18.61435, 18.950683, 19.290535, 19.633915, 19.980835, 20.331305, 20.685334, 21.042934, 21.404114, 21.768885, 22.137256, 22.509239, 22.884842, 23.264076, 23.646951, 24.033477, 24.423664, 24.817521, 25.215058, 25.616285, 26.021212, 26.429848, 26.842204, 27.258288, 27.67811, 28.101681, 28.529008, 28.960102, 29.394973, 29.833629, 30.27608, 30.722335, 31.172404, 31.626296, 32.084019, 32.545584, 33.010999, 33.480274, 33.953417, 34.430438, 34.911346, 35.396149, 35.884857, 36.377478, 36.874022, 37.374498, 37.878913, 38.387278, 38.8996, 39.415889, 39.936153, 40.460401, 40.988641, 41.520883, 42.057135, 42.597405, 43.141702, 43.690035, 44.242412, 44.798841, 45.359332, 45.923891, 46.492529, 47.065253, 47.642071, 48.222992, 48.808025, 49.397176, 49.990456, 50.587871, 51.18943, 51.795142, 52.405014, 53.019054, 53.637272, 54.259673, 54.886268, 55.517063, 56.152068, 56.791289, 57.434734, 58.082413, 58.734332, 59.390499, 60.050923, 60.715611, 61.384572, 62.057812, 62.735339, 63.417163, 64.103289, 64.793726, 65.488482, 66.187564, 66.89098, 67.598738, 68.310845, 69.027308, 69.748136, 70.473336, 71.202916, 71.936882, 72.675243, 73.418006, 74.165179, 74.916768, 75.672782, 76.433228, 77.198112, 77.967444, 78.741229, 79.519475, 80.30219, 81.089381, 81.881055, 82.677219, 83.477881, 84.283048, 85.092727, 85.906925, 86.72565, 87.548908, 88.376707, 89.209054, 90.045956, 90.88742, 91.733453, 92.584063, 93.439256, 94.299039, 95.163419, 96.032404, 96.906, 97.784214, 98.667053, 99.554525};
    }

    public static boolean a(double f, double f1, double f2) {
        return (f1 - f + 25.132741) % 6.283185 < (f2 - f + 25.132741) % 6.283185;
    }

    public static double b(double f) {
        double f1 = Math.pow(Math.abs(f), 0.42);
        return ((double)MathUtils.signum(f)) * 400.0 * f1 / (f1 + 27.13);
    }

    public static double c(double[] arr_f) {
        double[] arr_f1 = MathUtils.matrixMultiply(arr_f, HctSolver.a);
        double f = HctSolver.b(arr_f1[0]);
        double f1 = HctSolver.b(arr_f1[1]);
        double f2 = HctSolver.b(arr_f1[2]);
        return Math.atan2((f + f1 - f2 * 2.0) / 9.0, (-12.0 * f1 + f * 11.0 + f2) / 11.0);
    }

    public static double d(double f) {
        double f1 = Math.abs(f);
        return Math.pow(Math.max(0.0, 27.13 * f1 / (400.0 - f1)), 2.380952) * ((double)MathUtils.signum(f));
    }

    // 去混淆评级： 低(20)
    public static boolean e(double f) {
        return 0L <= ((long)f) && ((long)f) <= 0x4059000000000000L;
    }

    public static double f(double f) {
        return f / 100.0 <= 0.003131 ? f / 100.0 * 3294.6 : (Math.pow(f / 100.0, 0.416667) * 1.055 - 0.055) * 255.0;
    }

    public static Cam16 solveToCam(double f, double f1, double f2) {
        return Cam16.fromInt(HctSolver.solveToInt(f, f1, f2));
    }

    public static int solveToInt(double f, double f1, double f2) {
        double f35;
        int v4;
        double[] arr_f4;
        int v1;
        double[] arr_f1;
        double f11;
        double[] arr_f;
        if(f1 >= 0.0001 && f2 >= 0.0001 && f2 <= 99.9999) {
            double f3 = MathUtils.sanitizeDegreesDouble(f) / 180.0 * 3.141593;
            double f4 = ColorUtils.yFromLstar(f2);
            double f5 = Math.sqrt(f4) * 11.0;
            ViewingConditions viewingConditions0 = ViewingConditions.DEFAULT;
            double f6 = 1.0 / Math.pow(1.64 - Math.pow(0.29, viewingConditions0.getN()), 0.73);
            double f7 = (Math.cos(f3 + 2.0) + 3.8) * 961.538462 * viewingConditions0.e * viewingConditions0.c;
            double f8 = Math.sin(f3);
            double f9 = Math.cos(f3);
            int v = 0;
            while(true) {
                arr_f = HctSolver.c;
                if(v >= 5) {
                    goto label_39;
                }
                double f10 = Math.pow((f1 == 0.0 || f5 == 0.0 ? 0.0 : f1 / Math.sqrt(f5 / 100.0)) * f6, 1.111111);
                f11 = f3;
                double f12 = Math.pow(f5 / 100.0, 1.0 / viewingConditions0.d / viewingConditions0.j) * viewingConditions0.getAw() / viewingConditions0.getNbb();
                double f13 = (f12 + 0.305) * 23.0 * f10 / (f10 * 108.0 * f8 + (f10 * 11.0 * f9 + 23.0 * f7));
                double f14 = f13 * f9;
                double f15 = f13 * f8;
                arr_f1 = MathUtils.matrixMultiply(new double[]{HctSolver.d((288.0 * f15 + (451.0 * f14 + f12 * 460.0)) / 1403.0), HctSolver.d((f12 * 460.0 - 891.0 * f14 - 261.0 * f15) / 1403.0), HctSolver.d((f12 * 460.0 - f14 * 220.0 - f15 * 6300.0) / 1403.0)}, HctSolver.b);
                double f16 = arr_f1[0];
                if(f16 < 0.0) {
                    goto label_40;
                }
                double f17 = arr_f1[1];
                if(f17 < 0.0) {
                    goto label_40;
                }
                double f18 = arr_f1[2];
                if(f18 < 0.0) {
                    goto label_40;
                }
                double f19 = arr_f[2] * f18 + (arr_f[1] * f17 + arr_f[0] * f16);
                if(f19 <= 0.0) {
                    goto label_40;
                }
                if(v == 4) {
                    break;
                }
                double f20 = f19 - f4;
                if(Math.abs(f20) < 0.002) {
                    break;
                }
                f5 -= f20 * f5 / (f19 * 2.0);
                ++v;
                f3 = f11;
            }
            if(arr_f1[0] > 100.01 || arr_f1[1] > 100.01 || arr_f1[2] > 100.01) {
                v1 = 0;
                goto label_41;
            label_39:
                f11 = f3;
            label_40:
                v1 = 0;
            }
            else {
                v1 = ColorUtils.argbFromLinrgb(arr_f1);
            }
        label_41:
            if(v1 != 0) {
                return v1;
            }
            double[] arr_f2 = {-1.0, -1.0, -1.0};
            boolean z = true;
            double[] arr_f3 = arr_f2;
            boolean z1 = false;
            double f21 = 0.0;
            double f22 = 0.0;
            for(int v2 = 0; v2 < 12; ++v2) {
                double f23 = arr_f[0];
                double f24 = arr_f[1];
                double f25 = arr_f[2];
                double f26 = v2 % 4 > 1 ? 100.0 : 0.0;
                double f27 = v2 % 2 == 0 ? 0.0 : 100.0;
                if(v2 < 4) {
                    double f28 = (f4 - f24 * f26 - f25 * f27) / f23;
                    arr_f4 = HctSolver.e(f28) ? new double[]{f28, f26, f27} : new double[]{-1.0, -1.0, -1.0};
                }
                else if(v2 < 8) {
                    double f29 = (f4 - f23 * f27 - f25 * f26) / f24;
                    arr_f4 = HctSolver.e(f29) ? new double[]{f27, f29, f26} : new double[]{-1.0, -1.0, -1.0};
                }
                else {
                    double f30 = (f4 - f23 * f26 - f24 * f27) / f25;
                    arr_f4 = HctSolver.e(f30) ? new double[]{f26, f27, f30} : new double[]{-1.0, -1.0, -1.0};
                }
                if(arr_f4[0] >= 0.0) {
                    double f31 = HctSolver.c(arr_f4);
                    if(!z1) {
                        arr_f2 = arr_f4;
                        arr_f3 = arr_f2;
                        f21 = f31;
                        f22 = f21;
                        z1 = true;
                    }
                    else if(z || HctSolver.a(f21, f31, f22)) {
                        if(HctSolver.a(f21, f11, f31)) {
                            arr_f3 = arr_f4;
                            f22 = f31;
                        }
                        else {
                            arr_f2 = arr_f4;
                            f21 = f31;
                        }
                        z = false;
                    }
                }
            }
            double[][] arr2_f = {arr_f2, arr_f3};
            double[] arr_f5 = arr2_f[0];
            double f32 = HctSolver.c(arr_f5);
            double[] arr_f6 = arr2_f[1];
            for(int v3 = 0; v3 < 3; ++v3) {
                double f33 = arr_f5[v3];
                double f34 = arr_f6[v3];
                if(f33 != f34) {
                    if(Double.compare(f33, f34) < 0) {
                        v4 = (int)Math.floor(HctSolver.f(f33) - 0.5);
                        f35 = Math.ceil(HctSolver.f(arr_f6[v3]) - 0.5);
                    }
                    else {
                        v4 = (int)Math.ceil(HctSolver.f(f33) - 0.5);
                        f35 = Math.floor(HctSolver.f(arr_f6[v3]) - 0.5);
                    }
                    int v5 = (int)f35;
                    for(int v6 = 0; v6 < 8 && Math.abs(v5 - v4) > 1; ++v6) {
                        int v7 = (int)Math.floor(((double)(v4 + v5)) / 2.0);
                        double f36 = HctSolver.d[v7];
                        double f37 = arr_f5[v3];
                        double f38 = (f36 - f37) / (arr_f6[v3] - f37);
                        double f39 = arr_f5[0];
                        double f40 = (arr_f6[0] - f39) * f38 + f39;
                        double f41 = arr_f5[1];
                        double f42 = (arr_f6[1] - f41) * f38 + f41;
                        double f43 = arr_f5[2];
                        double[] arr_f7 = {f40, f42, (arr_f6[2] - f43) * f38 + f43};
                        double f44 = HctSolver.c(arr_f7);
                        if(HctSolver.a(f32, f11, f44)) {
                            v5 = v7;
                            arr_f6 = arr_f7;
                        }
                        else {
                            v4 = v7;
                            arr_f5 = arr_f7;
                            f32 = f44;
                        }
                    }
                }
            }
            return ColorUtils.argbFromLinrgb(new double[]{(arr_f5[0] + arr_f6[0]) / 2.0, (arr_f5[1] + arr_f6[1]) / 2.0, (arr_f5[2] + arr_f6[2]) / 2.0});
        }
        return ColorUtils.argbFromLstar(f2);
    }
}

