package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

public class Easing {
    public static String[] NAMED_EASING;
    public String a;
    public static final Easing b;

    static {
        Easing.b = new Easing();
        Easing.NAMED_EASING = new String[]{"standard", "accelerate", "decelerate", "linear"};
    }

    public Easing() {
        this.a = "identity";
    }

    public double get(double f) {
        return f;
    }

    public double getDiff(double f) {
        return 1.0;
    }

    public static Easing getInterpolator(String s) {
        if(s == null) {
            return null;
        }
        if(s.startsWith("cubic")) {
            return new c(s);
        }
        if(s.startsWith("spline")) {
            StepCurve stepCurve0 = new StepCurve();  // 初始化器: Landroidx/constraintlayout/core/motion/utils/Easing;-><init>()V
            stepCurve0.a = s;
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
            MonotonicCurveFit monotonicCurveFit0 = new MonotonicCurveFit(arr_f2, arr2_f);
            PrintStream printStream0 = System.out;
            printStream0.println(" 0 " + monotonicCurveFit0.getPos(0.0, 0));
            printStream0.println(" 1 " + monotonicCurveFit0.getPos(1.0, 0));
            stepCurve0.c = monotonicCurveFit0;
            return stepCurve0;
        }
        if(s.startsWith("Schlick")) {
            Easing easing0 = new Schlick();  // 初始化器: Landroidx/constraintlayout/core/motion/utils/Easing;-><init>()V
            easing0.a = s;
            int v8 = s.indexOf(40);
            int v9 = s.indexOf(44, v8);
            easing0.c = Double.parseDouble(s.substring(v8 + 1, v9).trim());
            easing0.d = Double.parseDouble(s.substring(v9 + 1, s.indexOf(44, v9 + 1)).trim());
            return easing0;
        }
        switch(s) {
            case "accelerate": {
                return new c("cubic(0.4, 0.05, 0.8, 0.7)");
            }
            case "anticipate": {
                return new c("cubic(0.36, 0, 0.66, -0.56)");
            }
            case "decelerate": {
                return new c("cubic(0.0, 0.0, 0.2, 0.95)");
            }
            case "linear": {
                return new c("cubic(1, 1, 0, 0)");
            }
            case "overshoot": {
                return new c("cubic(0.34, 1.56, 0.64, 1)");
            }
            case "standard": {
                return new c("cubic(0.4, 0.0, 0.2, 1)");
            }
            default: {
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or [standard, accelerate, decelerate, linear]");
                return Easing.b;
            }
        }
    }

    @Override
    public String toString() {
        return this.a;
    }
}

