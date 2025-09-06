package androidx.constraintlayout.motion.widget;

import a5.b;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator.PathRotateSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.PathRotate;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import r0.a;

public class MotionController {
    public KeyTrigger[] A;
    public int B;
    public int C;
    public View D;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public int E;
    public float F;
    public Interpolator G;
    public boolean H;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    public final Rect a;
    public View b;
    public int c;
    public boolean d;
    public int e;
    public final p f;
    public final p g;
    public final g h;
    public final g i;
    public CurveFit[] j;
    public CurveFit k;
    public float l;
    public float m;
    public float n;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public final float[] t;
    public final ArrayList u;
    public final float[] v;
    public final ArrayList w;
    public HashMap x;
    public HashMap y;
    public HashMap z;

    public MotionController(View view0) {
        this.a = new Rect();
        this.d = false;
        this.e = -1;
        this.f = new p();
        this.g = new p();
        this.h = new g();
        this.i = new g();
        this.l = NaNf;
        this.m = 0.0f;
        this.n = 1.0f;
        this.t = new float[4];
        this.u = new ArrayList();
        this.v = new float[1];
        this.w = new ArrayList();
        this.B = Key.UNSET;
        this.C = Key.UNSET;
        this.D = null;
        this.E = Key.UNSET;
        this.F = NaNf;
        this.G = null;
        this.H = false;
        this.setView(view0);
    }

    public final int a(int[] arr_v, float[] arr_f) {
        if(arr_f != null) {
            double[] arr_f1 = this.j[0].getTimePoints();
            if(arr_v != null) {
                int v = 0;
                for(Object object0: this.u) {
                    arr_v[v] = ((p)object0).o;
                    ++v;
                }
            }
            int v2 = 0;
            for(int v1 = 0; v1 < arr_f1.length; ++v1) {
                this.j[0].getPos(arr_f1[v1], this.p);
                this.f.c(arr_f1[v1], this.o, this.p, arr_f, v2);
                v2 += 2;
            }
            return v2 / 2;
        }
        return 0;
    }

    public void addKey(Key key0) {
        this.w.add(key0);
    }

    public final void b(float[] arr_f, int v) {
        double f8;
        ViewOscillator viewOscillator0 = null;
        SplineSet splineSet0 = this.y == null ? null : ((SplineSet)this.y.get("translationX"));
        SplineSet splineSet1 = this.y == null ? null : ((SplineSet)this.y.get("translationY"));
        ViewOscillator viewOscillator1 = this.z == null ? null : ((ViewOscillator)this.z.get("translationX"));
        HashMap hashMap0 = this.z;
        if(hashMap0 != null) {
            viewOscillator0 = (ViewOscillator)hashMap0.get("translationY");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            float f = ((float)v1) * (1.0f / ((float)(v - 1)));
            float f1 = this.n;
            float f2 = 0.0f;
            if(Float.compare(f1, 1.0f) != 0) {
                float f3 = this.m;
                if(f < f3) {
                    f = 0.0f;
                }
                if(f > f3 && ((double)f) < 1.0) {
                    f = Math.min((f - f3) * f1, 1.0f);
                }
            }
            float f4 = f;
            double f5 = (double)f4;
            Easing easing0 = this.f.a;
            float f6 = NaNf;
            for(Object object0: this.u) {
                p p0 = (p)object0;
                Easing easing1 = p0.a;
                if(easing1 != null) {
                    float f7 = p0.c;
                    if(f7 < f4) {
                        f2 = f7;
                        easing0 = easing1;
                    }
                    else if(Float.isNaN(f6)) {
                        f6 = p0.c;
                    }
                }
            }
            if(easing0 == null) {
                f8 = f5;
            }
            else {
                if(Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                f8 = (double)(((float)easing0.get(((double)((f4 - f2) / (f6 - f2))))) * (f6 - f2) + f2);
            }
            this.j[0].getPos(f8, this.p);
            CurveFit curveFit0 = this.k;
            if(curveFit0 != null) {
                double[] arr_f1 = this.p;
                if(arr_f1.length > 0) {
                    curveFit0.getPos(f8, arr_f1);
                }
            }
            this.f.c(f8, this.o, this.p, arr_f, v1 * 2);
            if(viewOscillator1 != null) {
                float f9 = arr_f[v1 * 2];
                arr_f[v1 * 2] = viewOscillator1.get(f4) + f9;
            }
            else if(splineSet0 != null) {
                float f10 = arr_f[v1 * 2];
                arr_f[v1 * 2] = splineSet0.get(f4) + f10;
            }
            if(viewOscillator0 != null) {
                int v2 = v1 * 2 + 1;
                float f11 = arr_f[v2];
                arr_f[v2] = viewOscillator0.get(f4) + f11;
            }
            else if(splineSet1 != null) {
                int v3 = v1 * 2 + 1;
                float f12 = arr_f[v3];
                arr_f[v3] = splineSet1.get(f4) + f12;
            }
        }
    }

    public final float c(float f, float[] arr_f) {
        float f1 = 0.0f;
        float f2 = 1.0f;
        if(arr_f == null) {
            float f3 = this.n;
            if(((double)f3) != 1.0) {
                float f4 = this.m;
                if(f < f4) {
                    f = 0.0f;
                }
                if(f > f4 && ((double)f) < 1.0) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        else {
            arr_f[0] = 1.0f;
        }
        Easing easing0 = this.f.a;
        float f5 = NaNf;
        for(Object object0: this.u) {
            p p0 = (p)object0;
            Easing easing1 = p0.a;
            if(easing1 != null) {
                float f6 = p0.c;
                if(f6 < f) {
                    easing0 = easing1;
                    f1 = f6;
                }
                else if(Float.isNaN(f5)) {
                    f5 = p0.c;
                }
            }
        }
        if(easing0 != null) {
            if(!Float.isNaN(f5)) {
                f2 = f5;
            }
            float f7 = f2 - f1;
            double f8 = (double)((f - f1) / f7);
            f = ((float)easing0.get(f8)) * f7 + f1;
            if(arr_f != null) {
                arr_f[0] = (float)easing0.getDiff(f8);
            }
        }
        return f;
    }

    public final void d(float f, float[] arr_f, float f1, float f2) {
        double[] arr_f2;
        float[] arr_f1 = this.v;
        float f3 = this.c(f, arr_f1);
        CurveFit[] arr_curveFit = this.j;
        if(arr_curveFit != null) {
            arr_curveFit[0].getSlope(((double)f3), this.q);
            this.j[0].getPos(((double)f3), this.p);
            float f4 = arr_f1[0];
            for(int v = 0; true; ++v) {
                arr_f2 = this.q;
                if(v >= arr_f2.length) {
                    break;
                }
                arr_f2[v] *= (double)f4;
            }
            CurveFit curveFit0 = this.k;
            if(curveFit0 != null) {
                double[] arr_f3 = this.p;
                if(arr_f3.length > 0) {
                    curveFit0.getPos(((double)f3), arr_f3);
                    this.k.getSlope(((double)f3), this.q);
                    int[] arr_v = this.o;
                    double[] arr_f4 = this.q;
                    double[] arr_f5 = this.p;
                    this.f.getClass();
                    p.f(f1, f2, arr_f, arr_v, arr_f4, arr_f5);
                }
                return;
            }
            int[] arr_v1 = this.o;
            double[] arr_f6 = this.p;
            this.f.getClass();
            p.f(f1, f2, arr_f, arr_v1, arr_f2, arr_f6);
            return;
        }
        float f5 = this.g.e - this.f.e;
        float f6 = this.g.f - this.f.f;
        float f7 = this.g.h - this.f.h + f6;
        arr_f[0] = (this.g.g - this.f.g + f5) * f1 + (1.0f - f1) * f5;
        arr_f[1] = f7 * f2 + (1.0f - f2) * f6;
    }

    public final float e(float f, float f1, int v) {
        float f2 = this.g.e - this.f.e;
        float f3 = this.g.f - this.f.f;
        float f4 = this.f.g / 2.0f + this.f.e;
        float f5 = this.f.h / 2.0f + this.f.f;
        float f6 = (float)Math.hypot(f2, f3);
        if(((double)f6) < 1.000000E-07) {
            return NaNf;
        }
        float f7 = f - f4;
        float f8 = f1 - f5;
        if(((float)Math.hypot(f7, f8)) == 0.0f) {
            return 0.0f;
        }
        float f9 = f8 * f3 + f7 * f2;
        switch(v) {
            case 0: {
                return f9 / f6;
            }
            case 1: {
                return (float)Math.sqrt(f6 * f6 - f9 * f9);
            }
            case 2: {
                return f7 / f2;
            }
            case 3: {
                return f8 / f2;
            }
            case 4: {
                return f7 / f3;
            }
            case 5: {
                return f8 / f3;
            }
            default: {
                return 0.0f;
            }
        }
    }

    public final boolean f(View view0, float f, long v, KeyCache keyCache0) {
        float f33;
        p p2;
        double f32;
        float f29;
        float f26;
        p p1;
        double f23;
        float f19;
        PathRotate viewTimeCycle$PathRotate1;
        float f10;
        float f9;
        boolean z1;
        PathRotate viewTimeCycle$PathRotate0;
        float f4;
        float f1 = this.c(f, null);
        int v1 = this.E;
        if(v1 != Key.UNSET) {
            float f2 = ((float)Math.floor(f1 / (1.0f / ((float)v1)))) * (1.0f / ((float)v1));
            float f3 = f1 % (1.0f / ((float)v1)) / (1.0f / ((float)v1));
            if(!Float.isNaN(this.F)) {
                f3 = (f3 + this.F) % 1.0f;
            }
            Interpolator interpolator0 = this.G;
            if(interpolator0 == null) {
                f4 = ((double)f3) > 0.5 ? 1.0f : 0.0f;
            }
            else {
                f4 = interpolator0.getInterpolation(f3);
            }
            f1 = f4 * (1.0f / ((float)v1)) + f2;
        }
        HashMap hashMap0 = this.y;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.values()) {
                ((ViewSpline)object0).setProperty(view0, f1);
            }
        }
        HashMap hashMap1 = this.x;
        if(hashMap1 == null) {
            viewTimeCycle$PathRotate0 = null;
            z1 = false;
        }
        else {
            viewTimeCycle$PathRotate0 = null;
            boolean z = false;
            for(Object object1: hashMap1.values()) {
                ViewTimeCycle viewTimeCycle0 = (ViewTimeCycle)object1;
                if(viewTimeCycle0 instanceof PathRotate) {
                    viewTimeCycle$PathRotate0 = (PathRotate)viewTimeCycle0;
                }
                else {
                    z |= viewTimeCycle0.setProperty(view0, f1, v, keyCache0);
                }
            }
            z1 = z;
        }
        CurveFit[] arr_curveFit = this.j;
        p p0 = this.f;
        if(arr_curveFit == null) {
            f33 = f1;
            float f34 = (this.g.e - p0.e) * f33 + p0.e;
            float f35 = (this.g.f - p0.f) * f33 + p0.f;
            int v16 = (int)(f34 + 0.5f + ((this.g.g - p0.g) * f33 + p0.g));
            int v17 = (int)(f35 + 0.5f + ((this.g.h - p0.h) * f33 + p0.h));
            if(this.g.g != p0.g || this.g.h != p0.h || this.d) {
                view0.measure(View.MeasureSpec.makeMeasureSpec(v16 - ((int)(f34 + 0.5f)), 0x40000000), View.MeasureSpec.makeMeasureSpec(v17 - ((int)(f35 + 0.5f)), 0x40000000));
                this.d = false;
            }
            view0.layout(((int)(f34 + 0.5f)), ((int)(f35 + 0.5f)), v16, v17);
        }
        else {
            arr_curveFit[0].getPos(((double)f1), this.p);
            this.j[0].getSlope(((double)f1), this.q);
            CurveFit curveFit0 = this.k;
            if(curveFit0 != null) {
                double[] arr_f = this.p;
                if(arr_f.length > 0) {
                    curveFit0.getPos(((double)f1), arr_f);
                    this.k.getSlope(((double)f1), this.q);
                }
            }
            if(this.H) {
                f23 = (double)f1;
                viewTimeCycle$PathRotate1 = viewTimeCycle$PathRotate0;
                p1 = p0;
                f10 = f1;
            }
            else {
                int[] arr_v = this.o;
                double[] arr_f1 = this.p;
                double[] arr_f2 = this.q;
                boolean z2 = this.d;
                float f5 = p0.e;
                float f6 = p0.f;
                float f7 = p0.g;
                float f8 = p0.h;
                if(arr_v.length == 0) {
                    f9 = f5;
                }
                else {
                    f9 = f5;
                    if(p0.p.length <= arr_v[arr_v.length - 1]) {
                        int v2 = arr_v[arr_v.length - 1] + 1;
                        p0.p = new double[v2];
                        p0.q = new double[v2];
                    }
                }
                f10 = f1;
                Arrays.fill(p0.p, NaN);
                for(int v3 = 0; v3 < arr_v.length; ++v3) {
                    double[] arr_f3 = p0.p;
                    int v4 = arr_v[v3];
                    arr_f3[v4] = arr_f1[v3];
                    p0.q[v4] = arr_f2[v3];
                }
                float f11 = NaNf;
                viewTimeCycle$PathRotate1 = viewTimeCycle$PathRotate0;
                float f12 = f8;
                float f13 = f9;
                float f14 = 0.0f;
                int v5 = 0;
                float f15 = 0.0f;
                float f16 = 0.0f;
                float f17 = 0.0f;
                while(true) {
                    double f18 = 0.0;
                    double[] arr_f4 = p0.p;
                    if(v5 >= arr_f4.length) {
                        break;
                    }
                    if(Double.isNaN(arr_f4[v5])) {
                        f19 = f13;
                        f13 = f19;
                        ++v5;
                    }
                    else {
                        if(!Double.isNaN(p0.p[v5])) {
                            f18 = p0.p[v5] + 0.0;
                        }
                        f19 = f13;
                        float f20 = (float)p0.q[v5];
                        switch(v5) {
                            case 1: {
                                break;
                            }
                            case 2: {
                                f15 = f20;
                                f6 = (float)f18;
                                f13 = f19;
                                ++v5;
                                continue;
                            }
                            case 3: {
                                f7 = (float)f18;
                                f13 = f19;
                                f16 = f20;
                                ++v5;
                                continue;
                            }
                            case 4: {
                                f17 = f20;
                                f12 = (float)f18;
                                f13 = f19;
                                ++v5;
                                continue;
                            }
                            case 5: {
                                f11 = (float)f18;
                                f13 = f19;
                                ++v5;
                                continue;
                            }
                            default: {
                                f13 = f19;
                                ++v5;
                                continue;
                            }
                        }
                        f14 = f20;
                        f13 = (float)f18;
                        v5 = 2;
                    }
                }
                MotionController motionController0 = p0.m;
                if(motionController0 == null) {
                    f26 = f7;
                    f23 = (double)f1;
                    p1 = p0;
                    if(!Float.isNaN(f11)) {
                        view0.setRotation(((float)(Math.toDegrees(Math.atan2(f17 / 2.0f + f15, f16 / 2.0f + f14)) + ((double)f11) + 0.0)));
                    }
                    f29 = f13;
                }
                else {
                    float[] arr_f5 = new float[2];
                    float[] arr_f6 = new float[2];
                    motionController0.getCenter(((double)f1), arr_f5, arr_f6);
                    float f21 = arr_f5[0];
                    float f22 = arr_f5[1];
                    f23 = (double)f1;
                    double f24 = Math.sin(f6);
                    double f25 = Math.cos(f6);
                    p1 = p0;
                    f26 = f7;
                    float f27 = (float)(Math.cos(f6) * ((double)f13) * ((double)f15) + (Math.sin(f6) * ((double)f14) + ((double)arr_f6[0])));
                    float f28 = (float)(Math.sin(f6) * ((double)f13) * ((double)f15) + (((double)arr_f6[1]) - Math.cos(f6) * ((double)f14)));
                    if(arr_f2.length >= 2) {
                        arr_f2[0] = (double)f27;
                        arr_f2[1] = (double)f28;
                    }
                    if(!Float.isNaN(f11)) {
                        view0.setRotation(((float)(Math.toDegrees(Math.atan2(f28, f27)) + ((double)f11))));
                    }
                    f6 = (float)(((double)f22) - f25 * ((double)f13) - ((double)(f12 / 2.0f)));
                    f29 = (float)(f24 * ((double)f13) + ((double)f21) - ((double)(f7 / 2.0f)));
                }
                if(view0 instanceof FloatLayout) {
                    ((FloatLayout)view0).layout(f29, f6, f29 + f26, f6 + f12);
                }
                else {
                    int v6 = (int)(f29 + 0.5f + f26);
                    int v7 = (int)(f6 + 0.5f + f12);
                    int v8 = v6 - ((int)(f29 + 0.5f));
                    int v9 = v7 - ((int)(f6 + 0.5f));
                    if(v8 != view0.getMeasuredWidth() || v9 != view0.getMeasuredHeight() || z2) {
                        view0.measure(View.MeasureSpec.makeMeasureSpec(v8, 0x40000000), View.MeasureSpec.makeMeasureSpec(v9, 0x40000000));
                    }
                    view0.layout(((int)(f29 + 0.5f)), ((int)(f6 + 0.5f)), v6, v7);
                }
                this.d = false;
            }
            if(this.C != Key.UNSET) {
                if(this.D == null) {
                    this.D = ((View)view0.getParent()).findViewById(this.C);
                }
                View view1 = this.D;
                if(view1 != null) {
                    int v10 = view1.getTop();
                    int v11 = this.D.getBottom();
                    int v12 = this.D.getLeft();
                    int v13 = this.D.getRight();
                    if(view0.getRight() - view0.getLeft() > 0 && view0.getBottom() - view0.getTop() > 0) {
                        float f30 = ((float)(v13 + v12)) / 2.0f - ((float)view0.getLeft());
                        float f31 = ((float)(v11 + v10)) / 2.0f - ((float)view0.getTop());
                        view0.setPivotX(f30);
                        view0.setPivotY(f31);
                    }
                }
            }
            HashMap hashMap2 = this.y;
            if(hashMap2 != null) {
                for(Object object2: hashMap2.values()) {
                    SplineSet splineSet0 = (SplineSet)object2;
                    if(splineSet0 instanceof androidx.constraintlayout.motion.utils.ViewSpline.PathRotate) {
                        double[] arr_f7 = this.q;
                        if(arr_f7.length > 1) {
                            f32 = f23;
                            ((androidx.constraintlayout.motion.utils.ViewSpline.PathRotate)splineSet0).setPathRotate(view0, f10, arr_f7[0], arr_f7[1]);
                        }
                    }
                    else {
                        f32 = f23;
                    }
                    f23 = f32;
                }
            }
            if(viewTimeCycle$PathRotate1 == null) {
                p2 = p1;
            }
            else {
                p2 = p1;
                z1 |= viewTimeCycle$PathRotate1.setPathRotate(view0, keyCache0, f10, v, this.q[0], this.q[1]);
            }
            for(int v14 = 1; true; ++v14) {
                CurveFit[] arr_curveFit1 = this.j;
                if(v14 >= arr_curveFit1.length) {
                    break;
                }
                arr_curveFit1[v14].getPos(f23, this.t);
                CustomSupport.setInterpolatedValue(((ConstraintAttribute)p2.n.get(this.r[v14 - 1])), view0, this.t);
            }
            g g0 = this.h;
            if(g0.b == 0) {
                if(f10 <= 0.0f) {
                    view0.setVisibility(g0.c);
                }
                else {
                    g g1 = this.i;
                    if(Float.compare(f10, 1.0f) >= 0) {
                        view0.setVisibility(g1.c);
                    }
                    else if(g1.c != g0.c) {
                        view0.setVisibility(0);
                    }
                }
            }
            if(this.A != null) {
                for(int v15 = 0; true; ++v15) {
                    KeyTrigger[] arr_keyTrigger = this.A;
                    if(v15 >= arr_keyTrigger.length) {
                        break;
                    }
                    arr_keyTrigger[v15].conditionallyFire(f10, view0);
                }
            }
            f33 = f10;
        }
        HashMap hashMap3 = this.z;
        if(hashMap3 != null) {
            for(Object object3: hashMap3.values()) {
                ViewOscillator viewOscillator0 = (ViewOscillator)object3;
                if(viewOscillator0 instanceof PathRotateSet) {
                    ((PathRotateSet)viewOscillator0).setPathRotate(view0, f33, this.q[0], this.q[1]);
                }
                else {
                    viewOscillator0.setProperty(view0, f33);
                }
            }
        }
        return z1;
    }

    public final void g(p p0) {
        p0.e(((float)(((int)this.b.getX()))), ((float)(((int)this.b.getY()))), ((float)this.b.getWidth()), ((float)this.b.getHeight()));
    }

    public int getAnimateRelativeTo() {
        return this.f.k;
    }

    public void getCenter(double f, float[] arr_f, float[] arr_f1) {
        double[] arr_f2 = new double[4];
        double[] arr_f3 = new double[4];
        this.j[0].getPos(f, arr_f2);
        this.j[0].getSlope(f, arr_f3);
        float f1 = 0.0f;
        Arrays.fill(arr_f1, 0.0f);
        int[] arr_v = this.o;
        p p0 = this.f;
        float f2 = p0.e;
        float f3 = p0.f;
        float f4 = p0.g;
        float f5 = p0.h;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for(int v = 0; v < arr_v.length; ++v) {
            float f9 = (float)arr_f2[v];
            float f10 = (float)arr_f3[v];
            switch(arr_v[v]) {
                case 1: {
                    f2 = f9;
                    f1 = f10;
                    break;
                }
                case 2: {
                    f3 = f9;
                    f8 = f10;
                    break;
                }
                case 3: {
                    f4 = f9;
                    f6 = f10;
                    break;
                }
                case 4: {
                    f5 = f9;
                    f7 = f10;
                }
            }
        }
        float f11 = f6 / 2.0f + f1;
        float f12 = f7 / 2.0f + f8;
        MotionController motionController0 = p0.m;
        if(motionController0 != null) {
            float[] arr_f4 = new float[2];
            float[] arr_f5 = new float[2];
            motionController0.getCenter(f, arr_f4, arr_f5);
            float f13 = (float)(((double)arr_f4[1]) - Math.cos(f3) * ((double)f2) - ((double)(f5 / 2.0f)));
            double f14 = Math.sin(f3);
            double f15 = Math.cos(f3);
            f12 = (float)(Math.sin(f3) * ((double)f8) + (((double)arr_f5[1]) - Math.cos(f3) * ((double)f1)));
            f2 = (float)(Math.sin(f3) * ((double)f2) + ((double)arr_f4[0]) - ((double)(f4 / 2.0f)));
            f3 = f13;
            f11 = (float)(f15 * ((double)f8) + (f14 * ((double)f1) + ((double)arr_f5[0])));
        }
        arr_f[0] = f4 / 2.0f + f2 + 0.0f;
        arr_f[1] = f5 / 2.0f + f3 + 0.0f;
        arr_f1[0] = f11;
        arr_f1[1] = f12;
    }

    public float getCenterX() [...] // Inlined contents

    public float getCenterY() [...] // Inlined contents

    public int getDrawPath() {
        int v = this.f.b;
        for(Object object0: this.u) {
            v = Math.max(v, ((p)object0).b);
        }
        return Math.max(v, this.g.b);
    }

    public float getFinalHeight() {
        return this.g.h;
    }

    public float getFinalWidth() {
        return this.g.g;
    }

    public float getFinalX() {
        return this.g.e;
    }

    public float getFinalY() {
        return this.g.f;
    }

    public int getKeyFrameInfo(int v, int[] arr_v) {
        float[] arr_f = new float[2];
        int v1 = 0;
        int v2 = 0;
        for(Object object0: this.w) {
            Key key0 = (Key)object0;
            int v3 = key0.mType;
            if(v3 == v || v != -1) {
                arr_v[v2] = 0;
                arr_v[v2 + 1] = v3;
                int v4 = key0.a;
                arr_v[v2 + 2] = v4;
                double f = (double)(((float)v4) / 100.0f);
                this.j[0].getPos(f, this.p);
                this.f.c(f, this.o, this.p, arr_f, 0);
                arr_v[v2 + 3] = Float.floatToIntBits(arr_f[0]);
                int v5 = v2 + 4;
                arr_v[v5] = Float.floatToIntBits(arr_f[1]);
                if(key0 instanceof KeyPosition) {
                    arr_v[v2 + 5] = ((KeyPosition)key0).o;
                    arr_v[v2 + 6] = Float.floatToIntBits(((KeyPosition)key0).k);
                    v5 = v2 + 7;
                    arr_v[v5] = Float.floatToIntBits(((KeyPosition)key0).l);
                }
                arr_v[v2] = v5 + 1 - v2;
                ++v1;
                v2 = v5 + 1;
            }
        }
        return v1;
    }

    public int getKeyFramePositions(int[] arr_v, float[] arr_f) {
        int v = 0;
        int v1 = 0;
        for(Object object0: this.w) {
            int v2 = ((Key)object0).a;
            arr_v[v] = ((Key)object0).mType * 1000 + v2;
            double f = (double)(((float)v2) / 100.0f);
            this.j[0].getPos(f, this.p);
            this.f.c(f, this.o, this.p, arr_f, v1);
            v1 += 2;
            ++v;
        }
        return v;
    }

    public float getStartHeight() {
        return this.f.h;
    }

    public float getStartWidth() {
        return this.f.g;
    }

    public float getStartX() {
        return this.f.e;
    }

    public float getStartY() {
        return this.f.f;
    }

    public int getTransformPivotTarget() {
        return this.C;
    }

    public View getView() {
        return this.b;
    }

    public static void h(int v, int v1, int v2, Rect rect0, Rect rect1) {
        switch(v) {
            case 1: {
                int v3 = rect0.left + rect0.right;
                rect1.left = (rect0.top + rect0.bottom - rect0.width()) / 2;
                rect1.top = v2 - (rect0.height() + v3) / 2;
                int v4 = rect1.left;
                rect1.right = rect0.width() + v4;
                int v5 = rect1.top;
                rect1.bottom = rect0.height() + v5;
                return;
            }
            case 2: {
                int v6 = rect0.left + rect0.right;
                int v7 = rect0.top + rect0.bottom;
                rect1.left = v1 - (rect0.width() + v7) / 2;
                rect1.top = (v6 - rect0.height()) / 2;
                int v8 = rect1.left;
                rect1.right = rect0.width() + v8;
                int v9 = rect1.top;
                rect1.bottom = rect0.height() + v9;
                return;
            }
            case 3: {
                int v10 = rect0.left + rect0.right;
                rect1.left = rect0.height() / 2 + rect0.top - v10 / 2;
                rect1.top = v2 - (rect0.height() + v10) / 2;
                int v11 = rect1.left;
                rect1.right = rect0.width() + v11;
                int v12 = rect1.top;
                rect1.bottom = rect0.height() + v12;
                return;
            }
            case 4: {
                int v13 = rect0.left + rect0.right;
                int v14 = rect0.bottom + rect0.top;
                rect1.left = v1 - (rect0.width() + v14) / 2;
                rect1.top = (v13 - rect0.height()) / 2;
                int v15 = rect1.left;
                rect1.right = rect0.width() + v15;
                int v16 = rect1.top;
                rect1.bottom = rect0.height() + v16;
            }
        }
    }

    public void remeasure() {
        this.d = true;
    }

    public void setDrawPath(int v) {
        this.f.b = v;
    }

    public void setPathMotionArc(int v) {
        this.B = v;
    }

    public void setStartState(ViewState viewState0, View view0, int v, int v1, int v2) {
        p p0 = this.f;
        p0.c = 0.0f;
        p0.d = 0.0f;
        Rect rect0 = new Rect();
        switch(v) {
            case 1: {
                int v3 = viewState0.left + viewState0.right;
                rect0.left = (viewState0.top + viewState0.bottom - viewState0.width()) / 2;
                rect0.top = v1 - (viewState0.height() + v3) / 2;
                rect0.right = viewState0.width() + rect0.left;
                rect0.bottom = viewState0.height() + rect0.top;
                break;
            }
            case 2: {
                int v4 = viewState0.left + viewState0.right;
                rect0.left = v2 - (viewState0.width() + (viewState0.top + viewState0.bottom)) / 2;
                rect0.top = (v4 - viewState0.height()) / 2;
                rect0.right = viewState0.width() + rect0.left;
                rect0.bottom = viewState0.height() + rect0.top;
            }
        }
        p0.e(((float)rect0.left), ((float)rect0.top), ((float)rect0.width()), ((float)rect0.height()));
        float f = viewState0.rotation;
        g g0 = this.h;
        g0.getClass();
        rect0.width();
        rect0.height();
        g0.b(view0);
        g0.j = NaNf;
        g0.k = NaNf;
        switch(v) {
            case 1: {
                g0.e = f - 90.0f;
                return;
            }
            case 2: {
                g0.e = f + 90.0f;
            }
        }
    }

    public void setTransformPivotTarget(int v) {
        this.C = v;
        this.D = null;
    }

    public void setView(View view0) {
        this.b = view0;
        this.c = view0.getId();
        boolean z = !(view0.getLayoutParams() instanceof LayoutParams);
    }

    public void setup(int v, int v1, float f, long v2) {
        p p12;
        String s10;
        String[] arr_s1;
        ViewTimeCycle viewTimeCycle0;
        int v6;
        ViewSpline viewSpline0;
        Iterator iterator3;
        ArrayList arrayList7;
        g g5;
        p p4;
        g g4;
        HashMap hashMap3;
        HashSet hashSet11;
        HashSet hashSet10;
        HashSet hashSet9;
        ArrayList arrayList6;
        ArrayList arrayList5;
        MotionController motionController2;
        HashSet hashSet8;
        HashSet hashSet7;
        HashMap hashMap2;
        HashSet hashSet6;
        MotionController motionController1;
        p p3;
        HashSet hashSet5;
        HashSet hashSet4;
        KeyPosition keyPosition1;
        ArrayList arrayList4;
        HashMap hashMap1;
        HashSet hashSet3;
        ArrayList arrayList3;
        g g3;
        g g2;
        MotionController motionController0 = this;
        ArrayList arrayList0 = motionController0.u;
        new HashSet();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap0 = new HashMap();
        int v3 = motionController0.B;
        p p0 = motionController0.f;
        if(v3 != Key.UNSET) {
            p0.j = v3;
        }
        g g0 = motionController0.h;
        g g1 = motionController0.i;
        if(g.c(g0.a, g1.a)) {
            hashSet1.add("alpha");
        }
        if(g.c(g0.d, g1.d)) {
            hashSet1.add("elevation");
        }
        if(g0.c != g1.c && g0.b == 0 && (g0.c == 0 || g1.c == 0)) {
            hashSet1.add("alpha");
        }
        if(g.c(g0.e, g1.e)) {
            hashSet1.add("rotation");
        }
        if(!Float.isNaN(g0.o) || !Float.isNaN(g1.o)) {
            hashSet1.add("transitionPathRotate");
        }
        if(!Float.isNaN(g0.p) || !Float.isNaN(g1.p)) {
            hashSet1.add("progress");
        }
        if(g.c(g0.f, g1.f)) {
            hashSet1.add("rotationX");
        }
        if(g.c(g0.g, g1.g)) {
            hashSet1.add("rotationY");
        }
        if(g.c(g0.j, g1.j)) {
            hashSet1.add("transformPivotX");
        }
        if(g.c(g0.k, g1.k)) {
            hashSet1.add("transformPivotY");
        }
        if(g.c(g0.h, g1.h)) {
            hashSet1.add("scaleX");
        }
        if(g.c(g0.i, g1.i)) {
            hashSet1.add("scaleY");
        }
        if(g.c(g0.l, g1.l)) {
            hashSet1.add("translationX");
        }
        if(g.c(g0.m, g1.m)) {
            hashSet1.add("translationY");
        }
        if(g.c(g0.n, g1.n)) {
            hashSet1.add("translationZ");
        }
        ArrayList arrayList1 = motionController0.w;
        p p1 = motionController0.g;
        if(arrayList1 == null) {
            motionController2 = motionController0;
            arrayList5 = null;
            arrayList6 = arrayList0;
            hashSet9 = hashSet0;
            hashSet10 = hashSet1;
            hashSet11 = hashSet2;
            hashMap3 = hashMap0;
            g4 = g0;
            p4 = p0;
            g5 = g1;
            arrayList7 = null;
        }
        else {
            ArrayList arrayList2 = null;
            for(Object object0: arrayList1) {
                Key key0 = (Key)object0;
                if(key0 instanceof KeyPosition) {
                    KeyPosition keyPosition0 = (KeyPosition)key0;
                    p p2 = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
                    p2.b = 0;
                    p2.i = NaNf;
                    p2.j = Key.UNSET;
                    p2.k = Key.UNSET;
                    p2.l = NaNf;
                    p2.m = null;
                    p2.n = new LinkedHashMap();
                    p2.o = 0;
                    p2.p = new double[18];
                    p2.q = new double[18];
                    if(p0.k == Key.UNSET) {
                        arrayList3 = arrayList1;
                        hashSet3 = hashSet1;
                        hashMap1 = hashMap0;
                        g3 = g0;
                        g2 = g1;
                        switch(keyPosition0.o) {
                            case 1: {
                                hashSet4 = hashSet0;
                                hashSet5 = hashSet2;
                                float f11 = ((float)keyPosition0.a) / 100.0f;
                                p2.c = f11;
                                p2.b = keyPosition0.h;
                                float f12 = Float.isNaN(keyPosition0.i) ? f11 : keyPosition0.i;
                                float f13 = Float.isNaN(keyPosition0.j) ? f11 : keyPosition0.j;
                                float f14 = p1.g - p0.g;
                                float f15 = p1.h - p0.h;
                                p2.d = p2.c;
                                if(!Float.isNaN(keyPosition0.k)) {
                                    f11 = keyPosition0.k;
                                }
                                float f16 = p1.g / 2.0f + p1.e - (p0.g / 2.0f + p0.e);
                                float f17 = p1.h / 2.0f + p1.f - (p0.h / 2.0f + p0.f);
                                float f18 = f14 * f12;
                                float f19 = f15 * f13;
                                p2.g = (float)(((int)(p0.g + f18)));
                                p2.h = (float)(((int)(p0.h + f19)));
                                keyPosition1 = keyPosition0;
                                float f20 = Float.isNaN(keyPosition1.l) ? 0.0f : keyPosition1.l;
                                p2.o = 1;
                                p3 = p0;
                                p2.e = ((float)(((int)(p3.e + f16 * f11 - f18 / 2.0f)))) + -f17 * f20;
                                p2.f = ((float)(((int)(p3.f + f11 * f17 - f19 / 2.0f)))) + f16 * f20;
                                p2.k = p2.k;
                                p2.a = Easing.getInterpolator(keyPosition1.f);
                                p2.j = keyPosition1.g;
                                arrayList4 = arrayList0;
                                break;
                            }
                            case 2: {
                                hashSet4 = hashSet0;
                                hashSet5 = hashSet2;
                                float f21 = ((float)keyPosition0.a) / 100.0f;
                                p2.c = f21;
                                p2.b = keyPosition0.h;
                                p2.d = p2.c;
                                float f22 = (p1.g - p0.g) * (Float.isNaN(keyPosition0.i) ? f21 : keyPosition0.i);
                                p2.e = (float)(((int)((p1.g / 2.0f + p1.e - (p0.g / 2.0f + p0.e)) * f21 + p0.e - f22 / 2.0f)));
                                float f23 = (p1.h - p0.h) * (Float.isNaN(keyPosition0.j) ? f21 : keyPosition0.j);
                                p2.f = (float)(((int)((p1.h / 2.0f + p1.f - (p0.h / 2.0f + p0.f)) * f21 + p0.f - f23 / 2.0f)));
                                p2.g = (float)(((int)(p0.g + f22)));
                                p2.h = (float)(((int)(p0.h + f23)));
                                p2.o = 2;
                                if(!Float.isNaN(keyPosition0.k)) {
                                    p2.e = (float)(((int)(keyPosition0.k * ((float)(((int)(((float)v) - p2.g)))))));
                                }
                                if(!Float.isNaN(keyPosition0.l)) {
                                    p2.f = (float)(((int)(keyPosition0.l * ((float)(((int)(((float)v1) - p2.h)))))));
                                }
                                p2.k = p2.k;
                                p2.a = Easing.getInterpolator(keyPosition0.f);
                                p2.j = keyPosition0.g;
                                keyPosition1 = keyPosition0;
                                arrayList4 = arrayList0;
                                p3 = p0;
                                break;
                            }
                            default: {
                                float f4 = ((float)keyPosition0.a) / 100.0f;
                                p2.c = f4;
                                p2.b = keyPosition0.h;
                                hashSet4 = hashSet0;
                                p2.d = p2.c;
                                hashSet5 = hashSet2;
                                float f5 = p1.g / 2.0f + p1.e - (p0.g / 2.0f + p0.e);
                                float f6 = p1.h / 2.0f + p1.f - (p0.h / 2.0f + p0.f);
                                float f7 = (p1.g - p0.g) * (Float.isNaN(keyPosition0.i) ? f4 : keyPosition0.i);
                                p2.e = (float)(((int)(f5 * f4 + p0.e - f7 / 2.0f)));
                                float f8 = (p1.h - p0.h) * (Float.isNaN(keyPosition0.j) ? f4 : keyPosition0.j);
                                p2.f = (float)(((int)(f6 * f4 + p0.f - f8 / 2.0f)));
                                p2.g = (float)(((int)(p0.g + f7)));
                                p2.h = (float)(((int)(p0.h + f8)));
                                float f9 = Float.isNaN(keyPosition0.k) ? f4 : keyPosition0.k;
                                float f10 = Float.isNaN(keyPosition0.n) ? 0.0f : keyPosition0.n;
                                if(!Float.isNaN(keyPosition0.l)) {
                                    f4 = keyPosition0.l;
                                }
                                p2.o = 0;
                                p2.e = (float)(((int)((Float.isNaN(keyPosition0.m) ? 0.0f : keyPosition0.m) * f6 + (f9 * f5 + p0.e) - f7 / 2.0f)));
                                p2.f = (float)(((int)(f6 * f4 + (f5 * f10 + p0.f) - f8 / 2.0f)));
                                p2.a = Easing.getInterpolator(keyPosition0.f);
                                p2.j = keyPosition0.g;
                                arrayList4 = arrayList0;
                                keyPosition1 = keyPosition0;
                                p3 = p0;
                            }
                        }
                    }
                    else {
                        float f1 = ((float)keyPosition0.a) / 100.0f;
                        p2.c = f1;
                        p2.b = keyPosition0.h;
                        p2.o = keyPosition0.o;
                        float f2 = Float.isNaN(keyPosition0.i) ? f1 : keyPosition0.i;
                        float f3 = Float.isNaN(keyPosition0.j) ? f1 : keyPosition0.j;
                        g2 = g1;
                        g3 = g0;
                        arrayList3 = arrayList1;
                        hashSet3 = hashSet1;
                        hashMap1 = hashMap0;
                        p2.d = p2.c;
                        p2.g = (float)(((int)((p1.g - p0.g) * f2 + p0.g)));
                        p2.h = (float)(((int)((p1.h - p0.h) * f3 + p0.h)));
                        switch(keyPosition0.o) {
                            case 1: {
                                p2.e = (p1.e - p0.e) * (Float.isNaN(keyPosition0.k) ? f1 : keyPosition0.k) + p0.e;
                                if(!Float.isNaN(keyPosition0.l)) {
                                    f1 = keyPosition0.l;
                                }
                                p2.f = (p1.f - p0.f) * f1 + p0.f;
                                break;
                            }
                            case 2: {
                                p2.e = Float.isNaN(keyPosition0.k) ? (p1.e - p0.e) * f1 + p0.e : keyPosition0.k * Math.min(f3, f2);
                                p2.f = Float.isNaN(keyPosition0.l) ? (p1.f - p0.f) * f1 + p0.f : keyPosition0.l;
                                break;
                            }
                            default: {
                                p2.e = (p1.e - p0.e) * (Float.isNaN(keyPosition0.k) ? f1 : keyPosition0.k) + p0.e;
                                if(!Float.isNaN(keyPosition0.l)) {
                                    f1 = keyPosition0.l;
                                }
                                p2.f = (p1.f - p0.f) * f1 + p0.f;
                            }
                        }
                        p2.k = p0.k;
                        p2.a = Easing.getInterpolator(keyPosition0.f);
                        p2.j = keyPosition0.g;
                        arrayList4 = arrayList0;
                        keyPosition1 = keyPosition0;
                        hashSet4 = hashSet0;
                        hashSet5 = hashSet2;
                        p3 = p0;
                    }
                    int v4 = Collections.binarySearch(arrayList4, p2);
                    if(v4 == 0) {
                        Log.e("MotionController", " KeyPath position \"" + p2.d + "\" outside of range");
                    }
                    arrayList4.add(-v4 - 1, p2);
                    int v5 = keyPosition1.e;
                    if(v5 == Key.UNSET) {
                        motionController1 = this;
                    }
                    else {
                        motionController1 = this;
                        motionController1.e = v5;
                    }
                    hashSet6 = hashSet3;
                    hashMap2 = hashMap1;
                    hashSet7 = hashSet4;
                    hashSet8 = hashSet5;
                }
                else {
                    motionController1 = motionController0;
                    arrayList3 = arrayList1;
                    arrayList4 = arrayList0;
                    g3 = g0;
                    p3 = p0;
                    g2 = g1;
                    if(key0 instanceof KeyCycle) {
                        hashSet8 = hashSet2;
                        key0.getAttributeNames(hashSet8);
                        hashSet6 = hashSet1;
                        hashMap2 = hashMap0;
                        hashSet7 = hashSet0;
                    }
                    else {
                        hashSet8 = hashSet2;
                        if(key0 instanceof KeyTimeCycle) {
                            hashSet7 = hashSet0;
                            key0.getAttributeNames(hashSet7);
                            hashSet6 = hashSet1;
                            hashMap2 = hashMap0;
                        }
                        else {
                            hashSet7 = hashSet0;
                            if(key0 instanceof KeyTrigger) {
                                if(arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(((KeyTrigger)key0));
                                hashSet6 = hashSet1;
                                hashMap2 = hashMap0;
                            }
                            else {
                                hashMap2 = hashMap0;
                                key0.setInterpolation(hashMap2);
                                hashSet6 = hashSet1;
                                key0.getAttributeNames(hashSet6);
                            }
                        }
                    }
                }
                hashSet2 = hashSet8;
                motionController0 = motionController1;
                hashMap0 = hashMap2;
                hashSet1 = hashSet6;
                p0 = p3;
                g1 = g2;
                g0 = g3;
                arrayList0 = arrayList4;
                hashSet0 = hashSet7;
                arrayList1 = arrayList3;
            }
            motionController2 = motionController0;
            arrayList5 = arrayList1;
            arrayList6 = arrayList0;
            hashSet9 = hashSet0;
            hashSet10 = hashSet1;
            hashSet11 = hashSet2;
            hashMap3 = hashMap0;
            g4 = g0;
            p4 = p0;
            g5 = g1;
            arrayList7 = arrayList2;
        }
        if(arrayList7 != null) {
            motionController2.A = (KeyTrigger[])arrayList7.toArray(new KeyTrigger[0]);
        }
        if(!hashSet10.isEmpty()) {
            motionController2.y = new HashMap();
            for(Iterator iterator1 = hashSet10.iterator(); iterator1.hasNext(); iterator1 = iterator3) {
                Object object1 = iterator1.next();
                String s = (String)object1;
                if(s.startsWith("CUSTOM,")) {
                    SparseArray sparseArray0 = new SparseArray();
                    String s1 = s.split(",")[1];
                    for(Object object2: arrayList5) {
                        Key key1 = (Key)object2;
                        HashMap hashMap4 = key1.d;
                        if(hashMap4 != null) {
                            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)hashMap4.get(s1);
                            if(constraintAttribute0 != null) {
                                sparseArray0.append(key1.a, constraintAttribute0);
                            }
                        }
                    }
                    iterator3 = iterator1;
                    viewSpline0 = ViewSpline.makeCustomSpline(s, sparseArray0);
                }
                else {
                    iterator3 = iterator1;
                    viewSpline0 = ViewSpline.makeSpline(s);
                }
                if(viewSpline0 != null) {
                    viewSpline0.setType(s);
                    motionController2.y.put(s, viewSpline0);
                }
            }
            if(arrayList5 != null) {
                for(Object object3: arrayList5) {
                    Key key2 = (Key)object3;
                    if(key2 instanceof KeyAttributes) {
                        key2.addValues(motionController2.y);
                    }
                }
            }
            g4.a(motionController2.y, 0);
            g5.a(motionController2.y, 100);
            for(Object object4: motionController2.y.keySet()) {
                String s2 = (String)object4;
                if(hashMap3.containsKey(s2)) {
                    Integer integer0 = (Integer)hashMap3.get(s2);
                    if(integer0 != null) {
                        v6 = (int)integer0;
                    }
                }
                else {
                    v6 = 0;
                }
                SplineSet splineSet0 = (SplineSet)motionController2.y.get(s2);
                if(splineSet0 != null) {
                    splineSet0.setup(v6);
                }
            }
        }
        if(!hashSet9.isEmpty()) {
            if(motionController2.x == null) {
                motionController2.x = new HashMap();
            }
            for(Object object5: hashSet9) {
                String s3 = (String)object5;
                if(!motionController2.x.containsKey(s3)) {
                    if(s3.startsWith("CUSTOM,")) {
                        SparseArray sparseArray1 = new SparseArray();
                        String s4 = s3.split(",")[1];
                        for(Object object6: arrayList5) {
                            Key key3 = (Key)object6;
                            HashMap hashMap5 = key3.d;
                            if(hashMap5 != null) {
                                ConstraintAttribute constraintAttribute1 = (ConstraintAttribute)hashMap5.get(s4);
                                if(constraintAttribute1 != null) {
                                    sparseArray1.append(key3.a, constraintAttribute1);
                                }
                            }
                        }
                        viewTimeCycle0 = ViewTimeCycle.makeCustomSpline(s3, sparseArray1);
                    }
                    else {
                        viewTimeCycle0 = ViewTimeCycle.makeSpline(s3, v2);
                    }
                    if(viewTimeCycle0 != null) {
                        viewTimeCycle0.setType(s3);
                        motionController2.x.put(s3, viewTimeCycle0);
                    }
                }
            }
            if(arrayList5 != null) {
                for(Object object7: arrayList5) {
                    Key key4 = (Key)object7;
                    if(key4 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle)key4).addTimeValues(motionController2.x);
                    }
                }
            }
            for(Object object8: motionController2.x.keySet()) {
                String s5 = (String)object8;
                int v7 = hashMap3.containsKey(s5) ? ((int)(((Integer)hashMap3.get(s5)))) : 0;
                ((ViewTimeCycle)motionController2.x.get(s5)).setup(v7);
            }
        }
        int v8 = arrayList6.size();
        p[] arr_p = new p[v8 + 2];
        arr_p[0] = p4;
        arr_p[v8 + 1] = p1;
        if(arrayList6.size() > 0 && motionController2.e == -1) {
            motionController2.e = 0;
        }
        int v9 = 1;
        for(Object object9: arrayList6) {
            arr_p[v9] = (p)object9;
            ++v9;
        }
        HashSet hashSet12 = new HashSet();
        for(Object object10: p1.n.keySet()) {
            String s6 = (String)object10;
            if(p4.n.containsKey(s6) && !hashSet10.contains("CUSTOM," + s6)) {
                hashSet12.add(s6);
            }
        }
        String[] arr_s = (String[])hashSet12.toArray(new String[0]);
        motionController2.r = arr_s;
        motionController2.s = new int[arr_s.length];
        for(int v10 = 0; true; ++v10) {
            arr_s1 = motionController2.r;
            if(v10 >= arr_s1.length) {
                break;
            }
            String s7 = arr_s1[v10];
            motionController2.s[v10] = 0;
            for(int v11 = 0; v11 < v8 + 2; ++v11) {
                if(arr_p[v11].n.containsKey(s7)) {
                    ConstraintAttribute constraintAttribute2 = (ConstraintAttribute)arr_p[v11].n.get(s7);
                    if(constraintAttribute2 != null) {
                        motionController2.s[v10] = constraintAttribute2.numberOfInterpolatedValues() + motionController2.s[v10];
                        break;
                    }
                }
            }
        }
        int v12 = arr_p[0].j == Key.UNSET ? 0 : 1;
        int v13 = arr_s1.length + 18;
        boolean[] arr_z = new boolean[v13];
        for(int v14 = 1; v14 < v8 + 2; ++v14) {
            p p5 = arr_p[v14];
            p p6 = arr_p[v14 - 1];
            boolean z = p.b(p5.e, p6.e);
            boolean z1 = p.b(p5.f, p6.f);
            arr_z[0] |= p.b(p5.d, p6.d);
            int v15 = z | z1 | v12;
            arr_z[1] |= v15;
            arr_z[2] |= v15;
            arr_z[3] |= p.b(p5.g, p6.g);
            arr_z[4] |= p.b(p5.h, p6.h);
        }
        int v17 = 0;
        for(int v16 = 1; v16 < v13; ++v16) {
            if(arr_z[v16]) {
                ++v17;
            }
        }
        motionController2.o = new int[v17];
        int v18 = Math.max(2, v17);
        motionController2.p = new double[v18];
        motionController2.q = new double[v18];
        int v20 = 0;
        for(int v19 = 1; v19 < v13; ++v19) {
            if(arr_z[v19]) {
                motionController2.o[v20] = v19;
                ++v20;
            }
        }
        double[][] arr2_f = new double[v8 + 2][motionController2.o.length];
        double[] arr_f = new double[v8 + 2];
        for(int v21 = 0; v21 < v8 + 2; ++v21) {
            p p7 = arr_p[v21];
            double[] arr_f1 = arr2_f[v21];
            int[] arr_v = motionController2.o;
            float[] arr_f2 = {p7.d, p7.e, p7.f, p7.g, p7.h, p7.i};
            int v23 = 0;
            for(int v22 = 0; v22 < arr_v.length; ++v22) {
                int v24 = arr_v[v22];
                if(v24 < 6) {
                    arr_f1[v23] = (double)arr_f2[v24];
                    ++v23;
                }
            }
            arr_f[v21] = (double)arr_p[v21].c;
        }
        p p8 = p4;
        for(int v25 = 0; true; ++v25) {
            int[] arr_v1 = motionController2.o;
            if(v25 >= arr_v1.length) {
                break;
            }
            if(arr_v1[v25] < 6) {
                String s8 = a.o(new StringBuilder(), p.r[motionController2.o[v25]], " [");
                for(int v26 = 0; v26 < v8 + 2; ++v26) {
                    StringBuilder stringBuilder0 = b.t(s8);
                    stringBuilder0.append(arr2_f[v26][v25]);
                    s8 = stringBuilder0.toString();
                }
            }
        }
        motionController2.j = new CurveFit[motionController2.r.length + 1];
        int v27 = 0;
        while(true) {
            String[] arr_s2 = motionController2.r;
            if(v27 >= arr_s2.length) {
                break;
            }
            String s9 = arr_s2[v27];
            int v28 = 0;
            int v29 = 0;
            double[] arr_f3 = null;
            Object[] arr_object = null;
            while(v28 < v8 + 2) {
                if(arr_p[v28].n.containsKey(s9)) {
                    if(arr_object == null) {
                        arr_f3 = new double[v8 + 2];
                        ConstraintAttribute constraintAttribute3 = (ConstraintAttribute)arr_p[v28].n.get(s9);
                        int v30 = constraintAttribute3 == null ? 0 : constraintAttribute3.numberOfInterpolatedValues();
                        arr_object = new double[v8 + 2][v30];
                    }
                    p p9 = arr_p[v28];
                    arr_f3[v29] = (double)p9.c;
                    Object object11 = arr_object[v29];
                    ConstraintAttribute constraintAttribute4 = (ConstraintAttribute)p9.n.get(s9);
                    if(constraintAttribute4 != null) {
                        if(constraintAttribute4.numberOfInterpolatedValues() == 1) {
                            object11[0] = (double)constraintAttribute4.getValueToInterpolate();
                        }
                        else {
                            int v31 = constraintAttribute4.numberOfInterpolatedValues();
                            float[] arr_f4 = new float[v31];
                            constraintAttribute4.getValuesToInterpolate(arr_f4);
                            int v32 = 0;
                            for(int v33 = 0; v32 < v31; ++v33) {
                                object11[v33] = (double)arr_f4[v32];
                                ++v32;
                            }
                        }
                    }
                    s10 = s9;
                    ++v29;
                }
                else {
                    s10 = s9;
                }
                ++v28;
                s9 = s10;
            }
            double[] arr_f5 = Arrays.copyOf(arr_f3, v29);
            double[][] arr2_f1 = (double[][])Arrays.copyOf(arr_object, v29);
            CurveFit[] arr_curveFit = motionController2.j;
            ++v27;
            arr_curveFit[v27] = CurveFit.get(motionController2.e, arr_f5, arr2_f1);
        }
        CurveFit[] arr_curveFit1 = motionController2.j;
        arr_curveFit1[0] = CurveFit.get(motionController2.e, arr_f, arr2_f);
        if(arr_p[0].j != Key.UNSET) {
            int[] arr_v2 = new int[v8 + 2];
            double[] arr_f6 = new double[v8 + 2];
            double[][] arr2_f2 = new double[v8 + 2][2];
            for(int v34 = 0; v34 < v8 + 2; ++v34) {
                p p10 = arr_p[v34];
                arr_v2[v34] = p10.j;
                arr_f6[v34] = (double)p10.c;
                double[] arr_f7 = arr2_f2[v34];
                arr_f7[0] = (double)p10.e;
                arr_f7[1] = (double)p10.f;
            }
            motionController2.k = CurveFit.getArc(arr_v2, arr_f6, arr2_f2);
        }
        motionController2.z = new HashMap();
        if(arrayList5 != null) {
            float f24 = NaNf;
            for(Object object12: hashSet11) {
                String s11 = (String)object12;
                ViewOscillator viewOscillator0 = ViewOscillator.makeSpline(s11);
                if(viewOscillator0 != null) {
                    if(!viewOscillator0.variesByPath() || !Float.isNaN(f24)) {
                        p12 = p8;
                    }
                    else {
                        float[] arr_f8 = new float[2];
                        double f25 = 0.0;
                        float f27 = 0.0f;
                        int v35 = 0;
                        for(double f26 = 0.0; v35 < 100; f26 = (double)arr_f8[1]) {
                            float f28 = ((float)v35) * 0.010101f;
                            double f29 = (double)f28;
                            Easing easing0 = p8.a;
                            float f30 = NaNf;
                            float f31 = 0.0f;
                            for(Object object13: arrayList6) {
                                p p11 = (p)object13;
                                Easing easing1 = p11.a;
                                if(easing1 != null) {
                                    float f32 = p11.c;
                                    if(f32 < f28) {
                                        easing0 = easing1;
                                        f31 = f32;
                                    }
                                    else if(Float.isNaN(f30)) {
                                        f30 = p11.c;
                                    }
                                }
                            }
                            if(easing0 != null) {
                                if(Float.isNaN(f30)) {
                                    f30 = 1.0f;
                                }
                                f29 = (double)(((float)easing0.get(((double)((f28 - f31) / (f30 - f31))))) * (f30 - f31) + f31);
                            }
                            motionController2.j[0].getPos(f29, motionController2.p);
                            motionController2.f.c(f29, motionController2.o, motionController2.p, arr_f8, 0);
                            if(v35 > 0) {
                                f27 = (float)(Math.hypot(f26 - ((double)arr_f8[1]), f25 - ((double)arr_f8[0])) + ((double)f27));
                            }
                            ++v35;
                            f25 = (double)arr_f8[0];
                        }
                        p12 = p8;
                        f24 = f27;
                    }
                    viewOscillator0.setType(s11);
                    motionController2.z.put(s11, viewOscillator0);
                    p8 = p12;
                }
            }
            for(Object object14: arrayList5) {
                Key key5 = (Key)object14;
                if(key5 instanceof KeyCycle) {
                    ((KeyCycle)key5).addCycleValues(motionController2.z);
                }
            }
            for(Object object15: motionController2.z.values()) {
                ((ViewOscillator)object15).setup(f24);
            }
        }
    }

    public void setupRelative(MotionController motionController0) {
        this.f.g(motionController0, motionController0.f);
        this.g.g(motionController0, motionController0.g);
    }

    @Override
    public String toString() {
        return " start: x: " + this.f.e + " y: " + this.f.f + " end: x: " + this.g.e + " y: " + this.g.f;
    }
}

