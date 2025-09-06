package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.PathRotateSet;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import x2.a;
import x2.b;

public class Motion implements TypedValues {
    public a A;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    public MotionWidget a;
    public int b;
    public final MotionPaths c;
    public final MotionPaths d;
    public final b e;
    public final b f;
    public CurveFit[] g;
    public CurveFit h;
    public final float i;
    public int[] j;
    public double[] k;
    public double[] l;
    public String[] m;
    public int[] n;
    public final float[] o;
    public final ArrayList p;
    public final ArrayList q;
    public HashMap r;
    public HashMap s;
    public HashMap t;
    public MotionKeyTrigger[] u;
    public int v;
    public int w;
    public MotionWidget x;
    public final int y;
    public final float z;

    public Motion(MotionWidget motionWidget0) {
        new Rect();
        this.b = -1;
        this.c = new MotionPaths();
        this.d = new MotionPaths();
        this.e = new b();
        this.f = new b();
        this.i = 1.0f;
        this.o = new float[4];
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.v = -1;
        this.w = -1;
        this.x = null;
        this.y = -1;
        this.z = NaNf;
        this.A = null;
        this.setView(motionWidget0);
    }

    public final float a(float f) {
        float f1 = this.i;
        float f2 = 1.0f;
        float f3 = 0.0f;
        if(Double.compare(f1, 1.0) != 0) {
            if(f < 0.0f) {
                f = 0.0f;
            }
            if(f > 0.0f && ((double)f) < 1.0) {
                f = Math.min((f - 0.0f) * f1, 1.0f);
            }
        }
        Easing easing0 = this.c.a;
        float f4 = NaNf;
        for(Object object0: this.p) {
            MotionPaths motionPaths0 = (MotionPaths)object0;
            Easing easing1 = motionPaths0.a;
            if(easing1 != null) {
                float f5 = motionPaths0.c;
                if(f5 < f) {
                    easing0 = easing1;
                    f3 = f5;
                }
                else if(Float.isNaN(f4)) {
                    f4 = motionPaths0.c;
                }
            }
        }
        if(easing0 != null) {
            if(!Float.isNaN(f4)) {
                f2 = f4;
            }
            return ((float)easing0.get(((double)((f - f3) / (f2 - f3))))) * (f2 - f3) + f3;
        }
        return f;
    }

    public void addKey(MotionKey motionKey0) {
        this.q.add(motionKey0);
    }

    public int buildKeyFrames(float[] arr_f, int[] arr_v, int[] arr_v1) {
        if(arr_f != null) {
            double[] arr_f1 = this.g[0].getTimePoints();
            ArrayList arrayList0 = this.p;
            if(arr_v != null) {
                int v = 0;
                for(Object object0: arrayList0) {
                    arr_v[v] = ((MotionPaths)object0).p;
                    ++v;
                }
            }
            if(arr_v1 != null) {
                int v1 = 0;
                for(Object object1: arrayList0) {
                    arr_v1[v1] = (int)(((MotionPaths)object1).d * 100.0f);
                    ++v1;
                }
            }
            int v3 = 0;
            for(int v2 = 0; v2 < arr_f1.length; ++v2) {
                this.g[0].getPos(arr_f1[v2], this.k);
                this.c.b(arr_f1[v2], this.j, this.k, arr_f, v3);
                v3 += 2;
            }
            return v3 / 2;
        }
        return 0;
    }

    public void buildPath(float[] arr_f, int v) {
        double f7;
        KeyCycleOscillator keyCycleOscillator0 = null;
        SplineSet splineSet0 = this.s == null ? null : ((SplineSet)this.s.get("translationX"));
        SplineSet splineSet1 = this.s == null ? null : ((SplineSet)this.s.get("translationY"));
        KeyCycleOscillator keyCycleOscillator1 = this.t == null ? null : ((KeyCycleOscillator)this.t.get("translationX"));
        HashMap hashMap0 = this.t;
        if(hashMap0 != null) {
            keyCycleOscillator0 = (KeyCycleOscillator)hashMap0.get("translationY");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            float f = ((float)v1) * (1.0f / ((float)(v - 1)));
            float f1 = this.i;
            float f2 = 0.0f;
            if(Float.compare(f1, 1.0f) != 0) {
                if(f < 0.0f) {
                    f = 0.0f;
                }
                if(f > 0.0f && ((double)f) < 1.0) {
                    f = Math.min((f - 0.0f) * f1, 1.0f);
                }
            }
            float f3 = f;
            double f4 = (double)f3;
            Easing easing0 = this.c.a;
            float f5 = NaNf;
            for(Object object0: this.p) {
                MotionPaths motionPaths0 = (MotionPaths)object0;
                Easing easing1 = motionPaths0.a;
                if(easing1 != null) {
                    float f6 = motionPaths0.c;
                    if(f6 < f3) {
                        f2 = f6;
                        easing0 = easing1;
                    }
                    else if(Float.isNaN(f5)) {
                        f5 = motionPaths0.c;
                    }
                }
            }
            if(easing0 == null) {
                f7 = f4;
            }
            else {
                if(Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                f7 = (double)(((float)easing0.get(((double)((f3 - f2) / (f5 - f2))))) * (f5 - f2) + f2);
            }
            this.g[0].getPos(f7, this.k);
            CurveFit curveFit0 = this.h;
            if(curveFit0 != null) {
                double[] arr_f1 = this.k;
                if(arr_f1.length > 0) {
                    curveFit0.getPos(f7, arr_f1);
                }
            }
            this.c.b(f7, this.j, this.k, arr_f, v1 * 2);
            if(keyCycleOscillator1 != null) {
                float f8 = arr_f[v1 * 2];
                arr_f[v1 * 2] = keyCycleOscillator1.get(f3) + f8;
            }
            else if(splineSet0 != null) {
                float f9 = arr_f[v1 * 2];
                arr_f[v1 * 2] = splineSet0.get(f3) + f9;
            }
            if(keyCycleOscillator0 != null) {
                int v2 = v1 * 2 + 1;
                float f10 = arr_f[v2];
                arr_f[v2] = keyCycleOscillator0.get(f3) + f10;
            }
            else if(splineSet1 != null) {
                int v3 = v1 * 2 + 1;
                float f11 = arr_f[v3];
                arr_f[v3] = splineSet1.get(f3) + f11;
            }
        }
    }

    public void buildRect(float f, float[] arr_f, int v) {
        float f1 = this.a(f);
        this.g[0].getPos(((double)f1), this.k);
        int[] arr_v = this.j;
        double[] arr_f1 = this.k;
        MotionPaths motionPaths0 = this.c;
        float f2 = motionPaths0.e;
        float f3 = motionPaths0.f;
        float f4 = motionPaths0.g;
        float f5 = motionPaths0.h;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            float f6 = (float)arr_f1[v1];
            switch(arr_v[v1]) {
                case 1: {
                    f2 = f6;
                    break;
                }
                case 2: {
                    f3 = f6;
                    break;
                }
                case 3: {
                    f4 = f6;
                    break;
                }
                case 4: {
                    f5 = f6;
                }
            }
        }
        if(motionPaths0.n != null) {
            double f7 = Math.sin(f3);
            f3 = (float)(0.0 - Math.cos(f3) * ((double)f2) - ((double)(f5 / 2.0f)));
            f2 = (float)(f7 * ((double)f2) + 0.0 - ((double)(f4 / 2.0f)));
        }
        float f8 = f4 + f2 + 0.0f;
        float f9 = f5 + f3 + 0.0f;
        arr_f[v] = f2 + 0.0f;
        arr_f[v + 1] = f3 + 0.0f;
        arr_f[v + 2] = f8;
        arr_f[v + 3] = f3 + 0.0f;
        arr_f[v + 4] = f8;
        arr_f[v + 5] = f9;
        arr_f[v + 6] = f2 + 0.0f;
        arr_f[v + 7] = f9;
    }

    public int getAnimateRelativeTo() {
        return this.c.l;
    }

    public void getCenter(double f, float[] arr_f, float[] arr_f1) {
        double[] arr_f2 = new double[4];
        double[] arr_f3 = new double[4];
        this.g[0].getPos(f, arr_f2);
        this.g[0].getSlope(f, arr_f3);
        float f1 = 0.0f;
        Arrays.fill(arr_f1, 0.0f);
        int[] arr_v = this.j;
        MotionPaths motionPaths0 = this.c;
        float f2 = motionPaths0.e;
        float f3 = motionPaths0.f;
        float f4 = motionPaths0.g;
        float f5 = motionPaths0.h;
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
        Motion motion0 = motionPaths0.n;
        if(motion0 != null) {
            float[] arr_f4 = new float[2];
            float[] arr_f5 = new float[2];
            motion0.getCenter(f, arr_f4, arr_f5);
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
        int v = this.c.b;
        for(Object object0: this.p) {
            v = Math.max(v, ((MotionPaths)object0).b);
        }
        return Math.max(v, this.d.b);
    }

    public float getFinalHeight() {
        return this.d.h;
    }

    public float getFinalWidth() {
        return this.d.g;
    }

    public float getFinalX() {
        return this.d.e;
    }

    public float getFinalY() {
        return this.d.f;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String s) {
        return 0;
    }

    public MotionPaths getKeyFrame(int v) {
        return (MotionPaths)this.p.get(v);
    }

    public int getKeyFrameInfo(int v, int[] arr_v) {
        float[] arr_f = new float[2];
        int v1 = 0;
        int v2 = 0;
        for(Object object0: this.q) {
            MotionKey motionKey0 = (MotionKey)object0;
            int v3 = motionKey0.mType;
            if(v3 == v || v != -1) {
                arr_v[v2] = 0;
                arr_v[v2 + 1] = v3;
                int v4 = motionKey0.mFramePosition;
                arr_v[v2 + 2] = v4;
                double f = (double)(((float)v4) / 100.0f);
                this.g[0].getPos(f, this.k);
                this.c.b(f, this.j, this.k, arr_f, 0);
                arr_v[v2 + 3] = Float.floatToIntBits(arr_f[0]);
                int v5 = v2 + 4;
                arr_v[v5] = Float.floatToIntBits(arr_f[1]);
                if(motionKey0 instanceof MotionKeyPosition) {
                    arr_v[v2 + 5] = ((MotionKeyPosition)motionKey0).mPositionType;
                    arr_v[v2 + 6] = Float.floatToIntBits(((MotionKeyPosition)motionKey0).mPercentX);
                    v5 = v2 + 7;
                    arr_v[v5] = Float.floatToIntBits(((MotionKeyPosition)motionKey0).mPercentY);
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
        for(Object object0: this.q) {
            int v2 = ((MotionKey)object0).mFramePosition;
            arr_v[v] = ((MotionKey)object0).mType * 1000 + v2;
            double f = (double)(((float)v2) / 100.0f);
            this.g[0].getPos(f, this.k);
            this.c.b(f, this.j, this.k, arr_f, v1);
            v1 += 2;
            ++v;
        }
        return v;
    }

    public float getStartHeight() {
        return this.c.h;
    }

    public float getStartWidth() {
        return this.c.g;
    }

    public float getStartX() {
        return this.c.e;
    }

    public float getStartY() {
        return this.c.f;
    }

    public int getTransformPivotTarget() {
        return this.w;
    }

    public MotionWidget getView() {
        return this.a;
    }

    public boolean interpolate(MotionWidget motionWidget0, float f, long v, KeyCache keyCache0) {
        float f27;
        MotionPaths motionPaths1;
        float f25;
        double f22;
        float f5;
        float f1 = this.a(f);
        int v1 = this.y;
        if(v1 != -1) {
            float f2 = ((float)Math.floor(f1 / (1.0f / ((float)v1)))) * (1.0f / ((float)v1));
            float f3 = f1 % (1.0f / ((float)v1)) / (1.0f / ((float)v1));
            float f4 = this.z;
            if(!Float.isNaN(f4)) {
                f3 = (f3 + f4) % 1.0f;
            }
            a a0 = this.A;
            if(a0 == null) {
                f5 = ((double)f3) > 0.5 ? 1.0f : 0.0f;
            }
            else {
                f5 = a0.getInterpolation(f3);
            }
            f1 = f5 * (1.0f / ((float)v1)) + f2;
        }
        HashMap hashMap0 = this.s;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.values()) {
                ((SplineSet)object0).setProperty(motionWidget0, f1);
            }
        }
        CurveFit[] arr_curveFit = this.g;
        MotionPaths motionPaths0 = this.c;
        if(arr_curveFit == null) {
            float f29 = (this.d.e - motionPaths0.e) * f1 + motionPaths0.e;
            float f30 = (this.d.f - motionPaths0.f) * f1 + motionPaths0.f;
            motionWidget0.layout(((int)(f29 + 0.5f)), ((int)(f30 + 0.5f)), ((int)(f29 + 0.5f + ((this.d.g - motionPaths0.g) * f1 + motionPaths0.g))), ((int)(f30 + 0.5f + ((this.d.h - motionPaths0.h) * f1 + motionPaths0.h))));
        }
        else {
            arr_curveFit[0].getPos(((double)f1), this.k);
            this.g[0].getSlope(((double)f1), this.l);
            CurveFit curveFit0 = this.h;
            if(curveFit0 != null) {
                double[] arr_f = this.k;
                if(arr_f.length > 0) {
                    curveFit0.getPos(((double)f1), arr_f);
                    this.h.getSlope(((double)f1), this.l);
                }
            }
            int[] arr_v = this.j;
            double[] arr_f1 = this.k;
            double[] arr_f2 = this.l;
            float f6 = motionPaths0.e;
            float f7 = motionPaths0.f;
            float f8 = motionPaths0.g;
            float f9 = motionPaths0.h;
            if(arr_v.length != 0 && motionPaths0.q.length <= arr_v[arr_v.length - 1]) {
                int v2 = arr_v[arr_v.length - 1] + 1;
                motionPaths0.q = new double[v2];
                motionPaths0.r = new double[v2];
            }
            Arrays.fill(motionPaths0.q, NaN);
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                double[] arr_f3 = motionPaths0.q;
                int v4 = arr_v[v3];
                arr_f3[v4] = arr_f1[v3];
                motionPaths0.r[v4] = arr_f2[v3];
            }
            float f10 = f7;
            float f11 = f8;
            float f12 = f9;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = NaNf;
            float f17 = 0.0f;
            for(int v5 = 0; true; ++v5) {
                double f18 = 0.0;
                double[] arr_f4 = motionPaths0.q;
                if(v5 >= arr_f4.length) {
                    break;
                }
                if(!Double.isNaN(arr_f4[v5])) {
                    if(!Double.isNaN(motionPaths0.q[v5])) {
                        f18 = motionPaths0.q[v5] + 0.0;
                    }
                    float f19 = (float)motionPaths0.r[v5];
                    switch(v5) {
                        case 1: {
                            f17 = f19;
                            f6 = (float)f18;
                            break;
                        }
                        case 2: {
                            f13 = f19;
                            f10 = (float)f18;
                            break;
                        }
                        case 3: {
                            f11 = (float)f18;
                            f14 = f19;
                            break;
                        }
                        case 4: {
                            f15 = f19;
                            f12 = (float)f18;
                            break;
                        }
                        case 5: {
                            f16 = (float)f18;
                        }
                    }
                }
            }
            Motion motion0 = motionPaths0.n;
            if(motion0 == null) {
                f27 = f11;
                f25 = f12;
                f22 = (double)f1;
                motionPaths1 = motionPaths0;
                if(!Float.isNaN(f16)) {
                    motionWidget0.setRotationZ(((float)(Math.toDegrees(Math.atan2(f15 / 2.0f + f13, f14 / 2.0f + f17)) + ((double)f16) + 0.0)));
                }
            }
            else {
                float[] arr_f5 = new float[2];
                float[] arr_f6 = new float[2];
                motion0.getCenter(((double)f1), arr_f5, arr_f6);
                float f20 = arr_f5[0];
                float f21 = arr_f5[1];
                f22 = (double)f1;
                double f23 = Math.sin(f10);
                double f24 = Math.cos(f10);
                f25 = f12;
                motionPaths1 = motionPaths0;
                float f26 = (float)(Math.cos(f10) * ((double)f6) * ((double)f13) + (Math.sin(f10) * ((double)f17) + ((double)arr_f6[0])));
                f27 = f11;
                float f28 = (float)(Math.sin(f10) * ((double)f6) * ((double)f13) + (((double)arr_f6[1]) - Math.cos(f10) * ((double)f17)));
                if(arr_f2.length >= 2) {
                    arr_f2[0] = (double)f26;
                    arr_f2[1] = (double)f28;
                }
                if(!Float.isNaN(f16)) {
                    motionWidget0.setRotationZ(((float)(Math.toDegrees(Math.atan2(f28, f26)) + ((double)f16))));
                }
                f10 = (float)(((double)f21) - f24 * ((double)f6) - ((double)(f12 / 2.0f)));
                f6 = (float)(f23 * ((double)f6) + ((double)f20) - ((double)(f11 / 2.0f)));
            }
            motionWidget0.layout(((int)(f6 + 0.5f)), ((int)(f10 + 0.5f)), ((int)(f6 + 0.5f + f27)), ((int)(f10 + 0.5f + f25)));
            if(this.w != -1) {
                if(this.x == null) {
                    this.x = null;
                }
                MotionWidget motionWidget1 = this.x;
                if(motionWidget1 != null) {
                    int v6 = motionWidget1.getTop();
                    int v7 = this.x.getBottom();
                    int v8 = this.x.getLeft();
                    int v9 = this.x.getRight();
                    if(motionWidget0.getRight() - motionWidget0.getLeft() > 0 && motionWidget0.getBottom() - motionWidget0.getTop() > 0) {
                        motionWidget0.setPivotX(((float)(v9 + v8)) / 2.0f - ((float)motionWidget0.getLeft()));
                        motionWidget0.setPivotY(((float)(v7 + v6)) / 2.0f - ((float)motionWidget0.getTop()));
                    }
                }
            }
            for(int v10 = 1; true; ++v10) {
                CurveFit[] arr_curveFit1 = this.g;
                if(v10 >= arr_curveFit1.length) {
                    break;
                }
                arr_curveFit1[v10].getPos(f22, this.o);
                ((CustomVariable)motionPaths1.o.get(this.m[v10 - 1])).setInterpolatedValue(motionWidget0, this.o);
            }
            b b0 = this.e;
            b0.getClass();
            if(f1 <= 0.0f) {
                motionWidget0.setVisibility(b0.b);
            }
            else {
                b b1 = this.f;
                if(Float.compare(f1, 1.0f) >= 0) {
                    motionWidget0.setVisibility(b1.b);
                }
                else if(b1.b != b0.b) {
                    motionWidget0.setVisibility(4);
                }
            }
            if(this.u != null) {
                for(int v11 = 0; v11 < this.u.length; ++v11) {
                }
            }
        }
        HashMap hashMap1 = this.t;
        if(hashMap1 != null) {
            for(Object object1: hashMap1.values()) {
                KeyCycleOscillator keyCycleOscillator0 = (KeyCycleOscillator)object1;
                if(keyCycleOscillator0 instanceof PathRotateSet) {
                    ((PathRotateSet)keyCycleOscillator0).setPathRotate(motionWidget0, f1, this.l[0], this.l[1]);
                }
                else {
                    keyCycleOscillator0.setProperty(motionWidget0, f1);
                }
            }
        }
        return false;
    }

    public void setDrawPath(int v) {
        this.c.b = v;
    }

    public void setEnd(MotionWidget motionWidget0) {
        this.d.c = 1.0f;
        this.d.d = 1.0f;
        this.d.e = (float)this.a.getX();
        this.d.f = (float)this.a.getY();
        this.d.g = (float)this.a.getWidth();
        this.d.h = (float)this.a.getHeight();
        this.d.e = (float)motionWidget0.getLeft();
        this.d.f = (float)motionWidget0.getTop();
        this.d.g = (float)motionWidget0.getWidth();
        this.d.h = (float)motionWidget0.getHeight();
        this.d.applyParameters(motionWidget0);
        this.f.getClass();
        this.f.b(motionWidget0);
    }

    public void setPathMotionArc(int v) {
        this.v = v;
    }

    public void setStart(MotionWidget motionWidget0) {
        this.c.c = 0.0f;
        this.c.d = 0.0f;
        this.c.e = (float)motionWidget0.getX();
        this.c.f = (float)motionWidget0.getY();
        this.c.g = (float)motionWidget0.getWidth();
        this.c.h = (float)motionWidget0.getHeight();
        this.c.applyParameters(motionWidget0);
        this.e.getClass();
        this.e.b(motionWidget0);
    }

    public void setStartState(ViewState viewState0, MotionWidget motionWidget0, int v, int v1, int v2) {
        MotionPaths motionPaths0 = this.c;
        motionPaths0.c = 0.0f;
        motionPaths0.d = 0.0f;
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
        motionPaths0.e = (float)rect0.left;
        motionPaths0.f = (float)rect0.top;
        motionPaths0.g = (float)rect0.width();
        motionPaths0.h = (float)rect0.height();
        float f = viewState0.rotation;
        b b0 = this.e;
        b0.getClass();
        b0.b(motionWidget0);
        b0.h = NaNf;
        b0.i = NaNf;
        switch(v) {
            case 1: {
                b0.c = f - 90.0f;
                return;
            }
            case 2: {
                b0.c = f + 90.0f;
            }
        }
    }

    public void setTransformPivotTarget(int v) {
        this.w = v;
        this.x = null;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, float f) {
        return false;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, int v1) {
        switch(v) {
            case 509: {
                this.setPathMotionArc(v1);
                return true;
            }
            case 704: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, String s) {
        if(705 == v) {
            System.out.println("TYPE_INTERPOLATOR  " + s);
            this.A = new a(Easing.getInterpolator(s));
        }
        return false;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, boolean z) {
        return false;
    }

    public void setView(MotionWidget motionWidget0) {
        this.a = motionWidget0;
    }

    public void setup(int v, int v1, float f, long v2) {
        MotionPaths motionPaths14;
        String s10;
        String[] arr_s1;
        SplineSet splineSet2;
        int v6;
        HashSet hashSet4;
        SplineSet splineSet0;
        HashSet hashSet3;
        Iterator iterator4;
        ArrayList arrayList3;
        MotionPaths motionPaths5;
        b b3;
        MotionPaths motionPaths4;
        b b2;
        new HashSet();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap0 = new HashMap();
        int v3 = this.v;
        MotionPaths motionPaths0 = this.c;
        if(v3 != -1) {
            motionPaths0.k = v3;
        }
        b b0 = this.e;
        b b1 = this.f;
        if(b.c(b0.a, b1.a)) {
            hashSet1.add("alpha");
        }
        if(b0.b != b1.b && (b0.b == 4 || b1.b == 4)) {
            hashSet1.add("alpha");
        }
        if(b.c(b0.c, b1.c)) {
            hashSet1.add("rotationZ");
        }
        if(b.c(b0.d, b1.d)) {
            hashSet1.add("rotationX");
        }
        if(b.c(b0.e, b1.e)) {
            hashSet1.add("rotationY");
        }
        if(b.c(b0.h, b1.h)) {
            hashSet1.add("pivotX");
        }
        if(b.c(b0.i, b1.i)) {
            hashSet1.add("pivotY");
        }
        if(b.c(b0.f, b1.f)) {
            hashSet1.add("scaleX");
        }
        if(b.c(b0.g, b1.g)) {
            hashSet1.add("scaleY");
        }
        if(b.c(b0.j, b1.j)) {
            hashSet1.add("translationX");
        }
        if(b.c(b0.k, b1.k)) {
            hashSet1.add("translationY");
        }
        if(b.c(b0.l, b1.l)) {
            hashSet1.add("translationZ");
        }
        ArrayList arrayList0 = this.q;
        ArrayList arrayList1 = this.p;
        if(arrayList0 == null) {
            b3 = b1;
            motionPaths5 = motionPaths0;
            arrayList3 = null;
        }
        else {
            ArrayList arrayList2 = null;
            for(Object object0: arrayList0) {
                MotionKey motionKey0 = (MotionKey)object0;
                if(motionKey0 instanceof MotionKeyPosition) {
                    MotionPaths motionPaths1 = new MotionPaths(v, v1, ((MotionKeyPosition)motionKey0), this.c, this.d);
                    MotionPaths motionPaths2 = null;
                    for(Object object1: arrayList1) {
                        MotionPaths motionPaths3 = (MotionPaths)object1;
                        if(motionPaths1.d == motionPaths3.d) {
                            motionPaths2 = motionPaths3;
                        }
                    }
                    b2 = b1;
                    motionPaths4 = motionPaths0;
                    if(motionPaths2 != null) {
                        arrayList1.remove(motionPaths2);
                    }
                    int v4 = Collections.binarySearch(arrayList1, motionPaths1);
                    if(v4 == 0) {
                        Utils.loge("MotionController", " KeyPath position \"" + motionPaths1.d + "\" outside of range");
                    }
                    arrayList1.add(-v4 - 1, motionPaths1);
                    int v5 = ((MotionKeyPosition)motionKey0).mCurveFit;
                    if(v5 != -1) {
                        this.b = v5;
                    }
                }
                else {
                    b2 = b1;
                    motionPaths4 = motionPaths0;
                    if(motionKey0 instanceof MotionKeyCycle) {
                        motionKey0.getAttributeNames(hashSet2);
                    }
                    else if(motionKey0 instanceof MotionKeyTimeCycle) {
                        motionKey0.getAttributeNames(hashSet0);
                    }
                    else if(motionKey0 instanceof MotionKeyTrigger) {
                        if(arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(((MotionKeyTrigger)motionKey0));
                    }
                    else {
                        motionKey0.setInterpolation(hashMap0);
                        motionKey0.getAttributeNames(hashSet1);
                    }
                }
                motionPaths0 = motionPaths4;
                b1 = b2;
            }
            b3 = b1;
            motionPaths5 = motionPaths0;
            arrayList3 = arrayList2;
        }
        if(arrayList3 != null) {
            this.u = (MotionKeyTrigger[])arrayList3.toArray(new MotionKeyTrigger[0]);
        }
        if(hashSet1.isEmpty()) {
            hashSet4 = hashSet2;
        }
        else {
            this.s = new HashMap();
            Iterator iterator2 = hashSet1.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                String s = (String)object2;
                if(s.startsWith("CUSTOM,")) {
                    CustomVar keyFrameArray$CustomVar0 = new CustomVar();
                    String s1 = s.split(",")[1];
                    for(Object object3: arrayList0) {
                        MotionKey motionKey1 = (MotionKey)object3;
                        HashMap hashMap1 = motionKey1.mCustom;
                        if(hashMap1 != null) {
                            CustomVariable customVariable0 = (CustomVariable)hashMap1.get(s1);
                            if(customVariable0 != null) {
                                keyFrameArray$CustomVar0.append(motionKey1.mFramePosition, customVariable0);
                            }
                        }
                    }
                    iterator4 = iterator2;
                    hashSet3 = hashSet2;
                    splineSet0 = SplineSet.makeCustomSplineSet(s, keyFrameArray$CustomVar0);
                }
                else {
                    iterator4 = iterator2;
                    hashSet3 = hashSet2;
                    splineSet0 = SplineSet.makeSpline(s, v2);
                }
                if(splineSet0 != null) {
                    splineSet0.setType(s);
                    this.s.put(s, splineSet0);
                }
                iterator2 = iterator4;
                hashSet2 = hashSet3;
            }
            hashSet4 = hashSet2;
            if(arrayList0 != null) {
                for(Object object4: arrayList0) {
                    MotionKey motionKey2 = (MotionKey)object4;
                    if(motionKey2 instanceof MotionKeyAttributes) {
                        motionKey2.addValues(this.s);
                    }
                }
            }
            b0.a(this.s, 0);
            b3.a(this.s, 100);
            for(Object object5: this.s.keySet()) {
                String s2 = (String)object5;
                if(hashMap0.containsKey(s2)) {
                    Integer integer0 = (Integer)hashMap0.get(s2);
                    if(integer0 != null) {
                        v6 = (int)integer0;
                    }
                }
                else {
                    v6 = 0;
                }
                SplineSet splineSet1 = (SplineSet)this.s.get(s2);
                if(splineSet1 != null) {
                    splineSet1.setup(v6);
                }
            }
        }
        if(!hashSet0.isEmpty()) {
            if(this.r == null) {
                this.r = new HashMap();
            }
            for(Object object6: hashSet0) {
                String s3 = (String)object6;
                if(!this.r.containsKey(s3)) {
                    if(s3.startsWith("CUSTOM,")) {
                        CustomVar keyFrameArray$CustomVar1 = new CustomVar();
                        String s4 = s3.split(",")[1];
                        for(Object object7: arrayList0) {
                            MotionKey motionKey3 = (MotionKey)object7;
                            HashMap hashMap2 = motionKey3.mCustom;
                            if(hashMap2 != null) {
                                CustomVariable customVariable1 = (CustomVariable)hashMap2.get(s4);
                                if(customVariable1 != null) {
                                    keyFrameArray$CustomVar1.append(motionKey3.mFramePosition, customVariable1);
                                }
                            }
                        }
                        splineSet2 = SplineSet.makeCustomSplineSet(s3, keyFrameArray$CustomVar1);
                    }
                    else {
                        splineSet2 = SplineSet.makeSpline(s3, v2);
                    }
                    if(splineSet2 != null) {
                        splineSet2.setType(s3);
                    }
                }
            }
            if(arrayList0 != null) {
                for(Object object8: arrayList0) {
                    MotionKey motionKey4 = (MotionKey)object8;
                    if(motionKey4 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle)motionKey4).addTimeValues(this.r);
                    }
                }
            }
            for(Object object9: this.r.keySet()) {
                String s5 = (String)object9;
                int v7 = hashMap0.containsKey(s5) ? ((int)(((Integer)hashMap0.get(s5)))) : 0;
                ((TimeCycleSplineSet)this.r.get(s5)).setup(v7);
            }
        }
        int v8 = arrayList1.size();
        MotionPaths[] arr_motionPaths = new MotionPaths[v8 + 2];
        arr_motionPaths[0] = motionPaths5;
        MotionPaths motionPaths6 = this.d;
        arr_motionPaths[v8 + 1] = motionPaths6;
        if(arrayList1.size() > 0 && this.b == MotionKey.UNSET) {
            this.b = 0;
        }
        int v9 = 1;
        for(Object object10: arrayList1) {
            arr_motionPaths[v9] = (MotionPaths)object10;
            ++v9;
        }
        HashSet hashSet5 = new HashSet();
        for(Object object11: motionPaths6.o.keySet()) {
            String s6 = (String)object11;
            if(motionPaths5.o.containsKey(s6) && !hashSet1.contains("CUSTOM," + s6)) {
                hashSet5.add(s6);
            }
        }
        String[] arr_s = (String[])hashSet5.toArray(new String[0]);
        this.m = arr_s;
        this.n = new int[arr_s.length];
        for(int v10 = 0; true; ++v10) {
            arr_s1 = this.m;
            if(v10 >= arr_s1.length) {
                break;
            }
            String s7 = arr_s1[v10];
            this.n[v10] = 0;
            for(int v11 = 0; v11 < v8 + 2; ++v11) {
                if(arr_motionPaths[v11].o.containsKey(s7)) {
                    CustomVariable customVariable2 = (CustomVariable)arr_motionPaths[v11].o.get(s7);
                    if(customVariable2 != null) {
                        this.n[v10] = customVariable2.numberOfInterpolatedValues() + this.n[v10];
                        break;
                    }
                }
            }
        }
        int v12 = arr_motionPaths[0].k == -1 ? 0 : 1;
        int v13 = arr_s1.length + 18;
        boolean[] arr_z = new boolean[v13];
        for(int v14 = 1; v14 < v8 + 2; ++v14) {
            MotionPaths motionPaths7 = arr_motionPaths[v14];
            MotionPaths motionPaths8 = arr_motionPaths[v14 - 1];
            boolean z = MotionPaths.a(motionPaths7.e, motionPaths8.e);
            boolean z1 = MotionPaths.a(motionPaths7.f, motionPaths8.f);
            arr_z[0] |= MotionPaths.a(motionPaths7.d, motionPaths8.d);
            int v15 = z | z1 | v12;
            arr_z[1] |= v15;
            arr_z[2] |= v15;
            arr_z[3] |= MotionPaths.a(motionPaths7.g, motionPaths8.g);
            arr_z[4] |= MotionPaths.a(motionPaths7.h, motionPaths8.h);
        }
        int v17 = 0;
        for(int v16 = 1; v16 < v13; ++v16) {
            if(arr_z[v16]) {
                ++v17;
            }
        }
        this.j = new int[v17];
        int v18 = Math.max(2, v17);
        this.k = new double[v18];
        this.l = new double[v18];
        int v19 = 0;
        for(int v20 = 1; v20 < v13; ++v20) {
            if(arr_z[v20]) {
                this.j[v19] = v20;
                ++v19;
            }
        }
        double[][] arr2_f = new double[v8 + 2][this.j.length];
        double[] arr_f = new double[v8 + 2];
        for(int v21 = 0; v21 < v8 + 2; ++v21) {
            MotionPaths motionPaths9 = arr_motionPaths[v21];
            double[] arr_f1 = arr2_f[v21];
            int[] arr_v = this.j;
            float[] arr_f2 = {motionPaths9.d, motionPaths9.e, motionPaths9.f, motionPaths9.g, motionPaths9.h, motionPaths9.i};
            int v23 = 0;
            for(int v22 = 0; v22 < arr_v.length; ++v22) {
                int v24 = arr_v[v22];
                if(v24 < 6) {
                    arr_f1[v23] = (double)arr_f2[v24];
                    ++v23;
                }
            }
            arr_f[v21] = (double)arr_motionPaths[v21].c;
        }
        MotionPaths motionPaths10 = motionPaths5;
        for(int v25 = 0; true; ++v25) {
            int[] arr_v1 = this.j;
            if(v25 >= arr_v1.length) {
                break;
            }
            if(arr_v1[v25] < 6) {
                String s8 = r0.a.o(new StringBuilder(), MotionPaths.s[this.j[v25]], " [");
                for(int v26 = 0; v26 < v8 + 2; ++v26) {
                    StringBuilder stringBuilder0 = a5.b.t(s8);
                    stringBuilder0.append(arr2_f[v26][v25]);
                    s8 = stringBuilder0.toString();
                }
            }
        }
        this.g = new CurveFit[this.m.length + 1];
        int v27 = 0;
        while(true) {
            String[] arr_s2 = this.m;
            if(v27 >= arr_s2.length) {
                break;
            }
            String s9 = arr_s2[v27];
            int v28 = 0;
            int v29 = 0;
            double[] arr_f3 = null;
            Object[] arr_object = null;
            while(v28 < v8 + 2) {
                if(arr_motionPaths[v28].o.containsKey(s9)) {
                    if(arr_object == null) {
                        arr_f3 = new double[v8 + 2];
                        CustomVariable customVariable3 = (CustomVariable)arr_motionPaths[v28].o.get(s9);
                        int v30 = customVariable3 == null ? 0 : customVariable3.numberOfInterpolatedValues();
                        arr_object = new double[v8 + 2][v30];
                    }
                    MotionPaths motionPaths11 = arr_motionPaths[v28];
                    arr_f3[v29] = (double)motionPaths11.c;
                    Object object12 = arr_object[v29];
                    CustomVariable customVariable4 = (CustomVariable)motionPaths11.o.get(s9);
                    if(customVariable4 != null) {
                        if(customVariable4.numberOfInterpolatedValues() == 1) {
                            object12[0] = (double)customVariable4.getValueToInterpolate();
                        }
                        else {
                            int v31 = customVariable4.numberOfInterpolatedValues();
                            float[] arr_f4 = new float[v31];
                            customVariable4.getValuesToInterpolate(arr_f4);
                            int v32 = 0;
                            for(int v33 = 0; v32 < v31; ++v33) {
                                object12[v33] = (double)arr_f4[v32];
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
            CurveFit[] arr_curveFit = this.g;
            ++v27;
            arr_curveFit[v27] = CurveFit.get(this.b, arr_f5, arr2_f1);
        }
        CurveFit[] arr_curveFit1 = this.g;
        arr_curveFit1[0] = CurveFit.get(this.b, arr_f, arr2_f);
        if(arr_motionPaths[0].k != -1) {
            int[] arr_v2 = new int[v8 + 2];
            double[] arr_f6 = new double[v8 + 2];
            double[][] arr2_f2 = new double[v8 + 2][2];
            for(int v34 = 0; v34 < v8 + 2; ++v34) {
                MotionPaths motionPaths12 = arr_motionPaths[v34];
                arr_v2[v34] = motionPaths12.k;
                arr_f6[v34] = (double)motionPaths12.c;
                double[] arr_f7 = arr2_f2[v34];
                arr_f7[0] = (double)motionPaths12.e;
                arr_f7[1] = (double)motionPaths12.f;
            }
            this.h = CurveFit.getArc(arr_v2, arr_f6, arr2_f2);
        }
        this.t = new HashMap();
        if(arrayList0 != null) {
            float f1 = NaNf;
            for(Object object13: hashSet4) {
                String s11 = (String)object13;
                KeyCycleOscillator keyCycleOscillator0 = KeyCycleOscillator.makeWidgetCycle(s11);
                if(keyCycleOscillator0 != null) {
                    if(!keyCycleOscillator0.variesByPath() || !Float.isNaN(f1)) {
                        motionPaths14 = motionPaths10;
                    }
                    else {
                        float[] arr_f8 = new float[2];
                        double f2 = 0.0;
                        float f4 = 0.0f;
                        int v35 = 0;
                        for(double f3 = 0.0; v35 < 100; f3 = (double)arr_f8[1]) {
                            float f5 = ((float)v35) * 0.010101f;
                            double f6 = (double)f5;
                            Easing easing0 = motionPaths10.a;
                            float f7 = NaNf;
                            float f8 = 0.0f;
                            for(Object object14: arrayList1) {
                                MotionPaths motionPaths13 = (MotionPaths)object14;
                                Easing easing1 = motionPaths13.a;
                                if(easing1 != null) {
                                    float f9 = motionPaths13.c;
                                    if(f9 < f5) {
                                        easing0 = easing1;
                                        f8 = f9;
                                    }
                                    else if(Float.isNaN(f7)) {
                                        f7 = motionPaths13.c;
                                    }
                                }
                            }
                            if(easing0 != null) {
                                if(Float.isNaN(f7)) {
                                    f7 = 1.0f;
                                }
                                f6 = (double)(((float)easing0.get(((double)((f5 - f8) / (f7 - f8))))) * (f7 - f8) + f8);
                            }
                            this.g[0].getPos(f6, this.k);
                            this.c.b(f6, this.j, this.k, arr_f8, 0);
                            if(v35 > 0) {
                                f4 = (float)(Math.hypot(f3 - ((double)arr_f8[1]), f2 - ((double)arr_f8[0])) + ((double)f4));
                            }
                            ++v35;
                            f2 = (double)arr_f8[0];
                        }
                        motionPaths14 = motionPaths10;
                        f1 = f4;
                    }
                    keyCycleOscillator0.setType(s11);
                    this.t.put(s11, keyCycleOscillator0);
                    motionPaths10 = motionPaths14;
                }
            }
            for(Object object15: arrayList0) {
                MotionKey motionKey5 = (MotionKey)object15;
                if(motionKey5 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle)motionKey5).addCycleValues(this.t);
                }
            }
            for(Object object16: this.t.values()) {
                ((KeyCycleOscillator)object16).setup(f1);
            }
        }
    }

    public void setupRelative(Motion motion0) {
        this.c.setupRelative(motion0, motion0.c);
        this.d.setupRelative(motion0, motion0.d);
    }

    @Override
    public String toString() {
        return " start: x: " + this.c.e + " y: " + this.c.f + " end: x: " + this.d.e + " y: " + this.d.f;
    }
}

