package androidx.constraintlayout.core.motion.utils;

public final class b extends CurveFit {
    public double a;
    public double[] b;

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double getPos(double f, int v) {
        return this.b[v];
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getPos(double f, double[] arr_f) {
        System.arraycopy(this.b, 0, arr_f, 0, this.b.length);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getPos(double f, float[] arr_f) {
        for(int v = 0; true; ++v) {
            double[] arr_f1 = this.b;
            if(v >= arr_f1.length) {
                break;
            }
            arr_f[v] = (float)arr_f1[v];
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double getSlope(double f, int v) {
        return 0.0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public final void getSlope(double f, double[] arr_f) {
        for(int v = 0; v < this.b.length; ++v) {
            arr_f[v] = 0.0;
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.CurveFit
    public final double[] getTimePoints() {
        return new double[]{this.a};
    }
}

