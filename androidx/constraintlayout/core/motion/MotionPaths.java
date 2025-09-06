package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.HashMap;

public class MotionPaths implements Comparable {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    public Easing a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public Motion n;
    public final HashMap o;
    public final int p;
    public double[] q;
    public double[] r;
    public static final String[] s;

    static {
        MotionPaths.s = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    public MotionPaths() {
        this.b = 0;
        this.i = NaNf;
        this.j = NaNf;
        this.k = -1;
        this.l = -1;
        this.m = NaNf;
        this.n = null;
        this.o = new HashMap();
        this.p = 0;
        this.q = new double[18];
        this.r = new double[18];
    }

    public MotionPaths(int v, int v1, MotionKeyPosition motionKeyPosition0, MotionPaths motionPaths0, MotionPaths motionPaths1) {
        this.b = 0;
        this.i = NaNf;
        this.j = NaNf;
        this.k = -1;
        this.l = -1;
        this.m = NaNf;
        this.n = null;
        this.o = new HashMap();
        this.p = 0;
        this.q = new double[18];
        this.r = new double[18];
        if(motionPaths0.l != -1) {
            float f = ((float)motionKeyPosition0.mFramePosition) / 100.0f;
            this.c = f;
            this.b = motionKeyPosition0.mDrawPath;
            this.p = motionKeyPosition0.mPositionType;
            float f1 = Float.isNaN(motionKeyPosition0.mPercentWidth) ? f : motionKeyPosition0.mPercentWidth;
            float f2 = Float.isNaN(motionKeyPosition0.mPercentHeight) ? f : motionKeyPosition0.mPercentHeight;
            this.d = this.c;
            this.g = (float)(((int)((motionPaths1.g - motionPaths0.g) * f1 + motionPaths0.g)));
            this.h = (float)(((int)((motionPaths1.h - motionPaths0.h) * f2 + motionPaths0.h)));
            switch(motionKeyPosition0.mPositionType) {
                case 1: {
                    this.e = (motionPaths1.e - motionPaths0.e) * (Float.isNaN(motionKeyPosition0.mPercentX) ? f : motionKeyPosition0.mPercentX) + motionPaths0.e;
                    if(!Float.isNaN(motionKeyPosition0.mPercentY)) {
                        f = motionKeyPosition0.mPercentY;
                    }
                    this.f = (motionPaths1.f - motionPaths0.f) * f + motionPaths0.f;
                    break;
                }
                case 2: {
                    this.e = Float.isNaN(motionKeyPosition0.mPercentX) ? (motionPaths1.e - motionPaths0.e) * f + motionPaths0.e : Math.min(f2, f1) * motionKeyPosition0.mPercentX;
                    this.f = Float.isNaN(motionKeyPosition0.mPercentY) ? (motionPaths1.f - motionPaths0.f) * f + motionPaths0.f : motionKeyPosition0.mPercentY;
                    break;
                }
                default: {
                    this.e = (motionPaths1.e - motionPaths0.e) * (Float.isNaN(motionKeyPosition0.mPercentX) ? f : motionKeyPosition0.mPercentX) + motionPaths0.e;
                    if(!Float.isNaN(motionKeyPosition0.mPercentY)) {
                        f = motionKeyPosition0.mPercentY;
                    }
                    this.f = (motionPaths1.f - motionPaths0.f) * f + motionPaths0.f;
                }
            }
            this.l = motionPaths0.l;
            this.a = Easing.getInterpolator(motionKeyPosition0.mTransitionEasing);
            this.k = motionKeyPosition0.mPathMotionArc;
            return;
        }
        switch(motionKeyPosition0.mPositionType) {
            case 1: {
                float f10 = ((float)motionKeyPosition0.mFramePosition) / 100.0f;
                this.c = f10;
                this.b = motionKeyPosition0.mDrawPath;
                float f11 = Float.isNaN(motionKeyPosition0.mPercentWidth) ? f10 : motionKeyPosition0.mPercentWidth;
                float f12 = Float.isNaN(motionKeyPosition0.mPercentHeight) ? f10 : motionKeyPosition0.mPercentHeight;
                float f13 = motionPaths1.g - motionPaths0.g;
                float f14 = motionPaths1.h - motionPaths0.h;
                this.d = this.c;
                if(!Float.isNaN(motionKeyPosition0.mPercentX)) {
                    f10 = motionKeyPosition0.mPercentX;
                }
                float f15 = motionPaths1.g / 2.0f + motionPaths1.e - (motionPaths0.g / 2.0f + motionPaths0.e);
                float f16 = motionPaths1.h / 2.0f + motionPaths1.f - (motionPaths0.h / 2.0f + motionPaths0.f);
                float f17 = f13 * f11;
                float f18 = f14 * f12;
                this.g = (float)(((int)(motionPaths0.g + f17)));
                this.h = (float)(((int)(motionPaths0.h + f18)));
                float f19 = Float.isNaN(motionKeyPosition0.mPercentY) ? 0.0f : motionKeyPosition0.mPercentY;
                this.p = 1;
                this.e = ((float)(((int)(motionPaths0.e + f15 * f10 - f17 / 2.0f)))) + -f16 * f19;
                this.f = ((float)(((int)(motionPaths0.f + f10 * f16 - f18 / 2.0f)))) + f15 * f19;
                this.l = this.l;
                this.a = Easing.getInterpolator(motionKeyPosition0.mTransitionEasing);
                this.k = motionKeyPosition0.mPathMotionArc;
                return;
            }
            case 2: {
                float f20 = ((float)motionKeyPosition0.mFramePosition) / 100.0f;
                this.c = f20;
                this.b = motionKeyPosition0.mDrawPath;
                this.d = this.c;
                float f21 = (motionPaths1.g - motionPaths0.g) * (Float.isNaN(motionKeyPosition0.mPercentWidth) ? f20 : motionKeyPosition0.mPercentWidth);
                this.e = (float)(((int)((motionPaths1.g / 2.0f + motionPaths1.e - (motionPaths0.g / 2.0f + motionPaths0.e)) * f20 + motionPaths0.e - f21 / 2.0f)));
                float f22 = (motionPaths1.h - motionPaths0.h) * (Float.isNaN(motionKeyPosition0.mPercentHeight) ? f20 : motionKeyPosition0.mPercentHeight);
                this.f = (float)(((int)((motionPaths1.h / 2.0f + motionPaths1.f - (motionPaths0.h / 2.0f + motionPaths0.f)) * f20 + motionPaths0.f - f22 / 2.0f)));
                this.g = (float)(((int)(motionPaths0.g + f21)));
                this.h = (float)(((int)(motionPaths0.h + f22)));
                this.p = 2;
                if(!Float.isNaN(motionKeyPosition0.mPercentX)) {
                    this.e = (float)(((int)(motionKeyPosition0.mPercentX * ((float)(((int)(((float)v) - this.g)))))));
                }
                if(!Float.isNaN(motionKeyPosition0.mPercentY)) {
                    this.f = (float)(((int)(motionKeyPosition0.mPercentY * ((float)(((int)(((float)v1) - this.h)))))));
                }
                this.l = this.l;
                this.a = Easing.getInterpolator(motionKeyPosition0.mTransitionEasing);
                this.k = motionKeyPosition0.mPathMotionArc;
                return;
            }
            default: {
                float f3 = ((float)motionKeyPosition0.mFramePosition) / 100.0f;
                this.c = f3;
                this.b = motionKeyPosition0.mDrawPath;
                this.d = this.c;
                float f4 = motionPaths1.g / 2.0f + motionPaths1.e - (motionPaths0.g / 2.0f + motionPaths0.e);
                float f5 = motionPaths1.h / 2.0f + motionPaths1.f - (motionPaths0.h / 2.0f + motionPaths0.f);
                float f6 = (motionPaths1.g - motionPaths0.g) * (Float.isNaN(motionKeyPosition0.mPercentWidth) ? f3 : motionKeyPosition0.mPercentWidth);
                this.e = (float)(((int)(f4 * f3 + motionPaths0.e - f6 / 2.0f)));
                float f7 = (motionPaths1.h - motionPaths0.h) * (Float.isNaN(motionKeyPosition0.mPercentHeight) ? f3 : motionKeyPosition0.mPercentHeight);
                this.f = (float)(((int)(f5 * f3 + motionPaths0.f - f7 / 2.0f)));
                this.g = (float)(((int)(motionPaths0.g + f6)));
                this.h = (float)(((int)(motionPaths0.h + f7)));
                float f8 = Float.isNaN(motionKeyPosition0.mPercentX) ? f3 : motionKeyPosition0.mPercentX;
                float f9 = Float.isNaN(motionKeyPosition0.mAltPercentY) ? 0.0f : motionKeyPosition0.mAltPercentY;
                if(!Float.isNaN(motionKeyPosition0.mPercentY)) {
                    f3 = motionKeyPosition0.mPercentY;
                }
                this.p = 0;
                this.e = (float)(((int)((Float.isNaN(motionKeyPosition0.mAltPercentX) ? 0.0f : motionKeyPosition0.mAltPercentX) * f5 + (f8 * f4 + motionPaths0.e) - f6 / 2.0f)));
                this.f = (float)(((int)(f5 * f3 + (f4 * f9 + motionPaths0.f) - f7 / 2.0f)));
                this.a = Easing.getInterpolator(motionKeyPosition0.mTransitionEasing);
                this.k = motionKeyPosition0.mPathMotionArc;
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean a(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? Float.isNaN(f) != Float.isNaN(f1) : Math.abs(f - f1) > 0.000001f;
    }

    public void applyParameters(MotionWidget motionWidget0) {
        this.a = Easing.getInterpolator(motionWidget0.b.mTransitionEasing);
        this.k = motionWidget0.b.mPathMotionArc;
        this.l = motionWidget0.b.mAnimateRelativeTo;
        this.i = motionWidget0.b.mPathRotate;
        this.b = motionWidget0.b.mDrawPath;
        this.j = motionWidget0.c.mProgress;
        this.m = 0.0f;
        for(Object object0: motionWidget0.getCustomAttributeNames()) {
            String s = (String)object0;
            CustomVariable customVariable0 = motionWidget0.getCustomAttribute(s);
            if(customVariable0 != null && customVariable0.isContinuous()) {
                this.o.put(s, customVariable0);
            }
        }
    }

    public final void b(double f, int[] arr_v, double[] arr_f, float[] arr_f1, int v) {
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
        Motion motion0 = this.n;
        if(motion0 != null) {
            float[] arr_f2 = new float[2];
            motion0.getCenter(f, arr_f2, new float[2]);
            float f6 = (float)(((double)arr_f2[1]) - Math.cos(f2) * ((double)f1) - ((double)(f4 / 2.0f)));
            f1 = (float)(Math.sin(f2) * ((double)f1) + ((double)arr_f2[0]) - ((double)(f3 / 2.0f)));
            f2 = f6;
        }
        arr_f1[v] = f3 / 2.0f + f1 + 0.0f;
        arr_f1[v + 1] = f4 / 2.0f + f2 + 0.0f;
    }

    public int compareTo(MotionPaths motionPaths0) {
        return Float.compare(this.d, motionPaths0.d);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((MotionPaths)object0));
    }

    public void configureRelativeTo(Motion motion0) {
        double f = (double)this.j;
        motion0.g[0].getPos(f, motion0.k);
        CurveFit curveFit0 = motion0.h;
        if(curveFit0 != null) {
            double[] arr_f = motion0.k;
            if(arr_f.length > 0) {
                curveFit0.getPos(f, arr_f);
            }
        }
    }

    public void setupRelative(Motion motion0, MotionPaths motionPaths0) {
        double f = (double)(this.g / 2.0f + this.e - motionPaths0.e - motionPaths0.g / 2.0f);
        double f1 = (double)(this.h / 2.0f + this.f - motionPaths0.f - motionPaths0.h / 2.0f);
        this.n = motion0;
        this.e = (float)Math.hypot(f1, f);
        if(Float.isNaN(this.m)) {
            this.f = (float)(Math.atan2(f1, f) + 1.570796);
            return;
        }
        this.f = (float)Math.toRadians(this.m);
    }
}

