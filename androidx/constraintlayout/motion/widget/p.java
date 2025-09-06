package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import java.util.LinkedHashMap;

public final class p implements Comparable {
    public Easing a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public int k;
    public float l;
    public MotionController m;
    public LinkedHashMap n;
    public int o;
    public double[] p;
    public double[] q;
    public static final String[] r;

    static {
        p.r = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    public p() {
        this.b = 0;
        this.i = NaNf;
        this.j = Key.UNSET;
        this.k = Key.UNSET;
        this.l = NaNf;
        this.m = null;
        this.n = new LinkedHashMap();
        this.o = 0;
        this.p = new double[18];
        this.q = new double[18];
    }

    public final void a(Constraint constraintSet$Constraint0) {
        this.a = Easing.getInterpolator(constraintSet$Constraint0.motion.mTransitionEasing);
        this.j = constraintSet$Constraint0.motion.mPathMotionArc;
        this.k = constraintSet$Constraint0.motion.mAnimateRelativeTo;
        this.i = constraintSet$Constraint0.motion.mPathRotate;
        this.b = constraintSet$Constraint0.motion.mDrawPath;
        this.l = constraintSet$Constraint0.layout.circleAngle;
        for(Object object0: constraintSet$Constraint0.mCustomConstraints.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)constraintSet$Constraint0.mCustomConstraints.get(s);
            if(constraintAttribute0 != null && constraintAttribute0.isContinuous()) {
                this.n.put(s, constraintAttribute0);
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean b(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? Float.isNaN(f) != Float.isNaN(f1) : Math.abs(f - f1) > 0.000001f;
    }

    public final void c(double f, int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
        float f1 = this.e;
        float f2 = this.f;
        float f3 = this.g;
        float f4 = this.h;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            float f5 = (float)arr_f[v1];
            switch(arr_v[v1]) {
                case 1: {
                    f1 = f5;
                    break;
                }
                case 2: {
                    f2 = f5;
                    break;
                }
                case 3: {
                    f3 = f5;
                    break;
                }
                case 4: {
                    f4 = f5;
                }
            }
        }
        MotionController motionController0 = this.m;
        if(motionController0 != null) {
            float[] arr_f2 = new float[2];
            motionController0.getCenter(f, arr_f2, new float[2]);
            float f6 = (float)(((double)arr_f2[1]) - Math.cos(f2) * ((double)f1) - ((double)(f4 / 2.0f)));
            f1 = (float)(Math.sin(f2) * ((double)f1) + ((double)arr_f2[0]) - ((double)(f3 / 2.0f)));
            f2 = f6;
        }
        arr_f1[v] = f3 / 2.0f + f1 + 0.0f;
        arr_f1[v + 1] = f4 / 2.0f + f2 + 0.0f;
    }

    @Override
    public final int compareTo(Object object0) {
        return Float.compare(this.d, ((p)object0).d);
    }

    public final void d(int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
        float f = this.e;
        float f1 = this.f;
        float f2 = this.g;
        float f3 = this.h;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            float f4 = (float)arr_f[v1];
            switch(arr_v[v1]) {
                case 1: {
                    f = f4;
                    break;
                }
                case 2: {
                    f1 = f4;
                    break;
                }
                case 3: {
                    f2 = f4;
                    break;
                }
                case 4: {
                    f3 = f4;
                }
            }
        }
        if(this.m != null) {
            double f5 = Math.sin(f1);
            f1 = (float)(0.0 - Math.cos(f1) * ((double)f) - ((double)(f3 / 2.0f)));
            f = (float)(f5 * ((double)f) + 0.0 - ((double)(f2 / 2.0f)));
        }
        float f6 = f2 + f;
        float f7 = f3 + f1;
        arr_f1[v] = f + 0.0f;
        arr_f1[v + 1] = f1 + 0.0f;
        arr_f1[v + 2] = f6 + 0.0f;
        arr_f1[v + 3] = f1 + 0.0f;
        arr_f1[v + 4] = f6 + 0.0f;
        arr_f1[v + 5] = f7 + 0.0f;
        arr_f1[v + 6] = f + 0.0f;
        arr_f1[v + 7] = f7 + 0.0f;
    }

    public final void e(float f, float f1, float f2, float f3) {
        this.e = f;
        this.f = f1;
        this.g = f2;
        this.h = f3;
    }

    public static void f(float f, float f1, float[] arr_f, int[] arr_v, double[] arr_f1, double[] arr_f2) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for(int v = 0; v < arr_v.length; ++v) {
            float f6 = (float)arr_f1[v];
            double f7 = arr_f2[v];
            switch(arr_v[v]) {
                case 1: {
                    f2 = f6;
                    break;
                }
                case 2: {
                    f4 = f6;
                    break;
                }
                case 3: {
                    f3 = f6;
                    break;
                }
                case 4: {
                    f5 = f6;
                }
            }
        }
        float f8 = f2 - 0.0f * f3 / 2.0f;
        float f9 = f4 - 0.0f * f5 / 2.0f;
        arr_f[0] = (f3 * 1.0f + f8) * f + (1.0f - f) * f8 + 0.0f;
        arr_f[1] = (f5 * 1.0f + f9) * f1 + (1.0f - f1) * f9 + 0.0f;
    }

    public final void g(MotionController motionController0, p p0) {
        double f = (double)(this.g / 2.0f + this.e - p0.e - p0.g / 2.0f);
        double f1 = (double)(this.h / 2.0f + this.f - p0.f - p0.h / 2.0f);
        this.m = motionController0;
        this.e = (float)Math.hypot(f1, f);
        if(Float.isNaN(this.l)) {
            this.f = (float)(Math.atan2(f1, f) + 1.570796);
            return;
        }
        this.f = (float)Math.toRadians(this.l);
    }
}

