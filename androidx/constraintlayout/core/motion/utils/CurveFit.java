package androidx.constraintlayout.core.motion.utils;

public abstract class CurveFit {
    public static final int CONSTANT = 2;
    public static final int LINEAR = 1;
    public static final int SPLINE;

    public static CurveFit get(int v, double[] arr_f, double[][] arr2_f) {
        if(arr_f.length == 1) {
            v = 2;
        }
        switch(v) {
            case 0: {
                return new MonotonicCurveFit(arr_f, arr2_f);
            }
            case 2: {
                double f = arr_f[0];
                double[] arr_f1 = arr2_f[0];
                CurveFit curveFit0 = new b();  // 初始化器: Landroidx/constraintlayout/core/motion/utils/CurveFit;-><init>()V
                curveFit0.a = f;
                curveFit0.b = arr_f1;
                return curveFit0;
            }
            default: {
                return new LinearCurveFit(arr_f, arr2_f);
            }
        }
    }

    public static CurveFit getArc(int[] arr_v, double[] arr_f, double[][] arr2_f) {
        return new ArcCurveFit(arr_v, arr_f, arr2_f);
    }

    public abstract double getPos(double arg1, int arg2);

    public abstract void getPos(double arg1, double[] arg2);

    public abstract void getPos(double arg1, float[] arg2);

    public abstract double getSlope(double arg1, int arg2);

    public abstract void getSlope(double arg1, double[] arg2);

    public abstract double[] getTimePoints();
}

