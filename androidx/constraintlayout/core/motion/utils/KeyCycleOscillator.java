package androidx.constraintlayout.core.motion.utils;

import a5.b;
import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.motion.MotionWidget;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public abstract class KeyCycleOscillator {
    public static class PathRotateSet extends KeyCycleOscillator {
        public final int g;

        public PathRotateSet(String s) {
            this.g = CycleType.getId(s);
        }

        public void setPathRotate(MotionWidget motionWidget0, float f, double f1, double f2) {
            motionWidget0.setRotationZ(this.get(f) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
        }

        @Override  // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget0, float f) {
            float f1 = this.get(f);
            motionWidget0.setValue(this.g, f1);
        }
    }

    public CurveFit a;
    public e b;
    public String c;
    public int d;
    public String e;
    public final ArrayList f;
    public int mVariesBy;

    public KeyCycleOscillator() {
        this.d = 0;
        this.e = null;
        this.mVariesBy = 0;
        this.f = new ArrayList();
    }

    public float get(float f) {
        e e0 = this.b;
        CurveFit curveFit0 = e0.g;
        if(curveFit0 == null) {
            double[] arr_f = e0.h;
            arr_f[0] = (double)e0.e[0];
            arr_f[1] = (double)e0.f[0];
            arr_f[2] = (double)e0.b[0];
        }
        else {
            curveFit0.getPos(((double)f), e0.h);
        }
        double[] arr_f1 = e0.h;
        double f1 = arr_f1[0];
        return (float)(e0.a.getValue(((double)f), arr_f1[1]) * e0.h[2] + f1);
    }

    public CurveFit getCurveFit() {
        return this.a;
    }

    public float getSlope(float f) {
        e e0 = this.b;
        CurveFit curveFit0 = e0.g;
        if(curveFit0 == null) {
            double[] arr_f = e0.i;
            arr_f[0] = 0.0;
            arr_f[1] = 0.0;
            arr_f[2] = 0.0;
        }
        else {
            curveFit0.getSlope(((double)f), e0.i);
            e0.g.getPos(((double)f), e0.h);
        }
        double f1 = e0.a.getValue(((double)f), e0.h[1]);
        return (float)(e0.a.getSlope(((double)f), e0.h[1], e0.i[1]) * e0.h[2] + (f1 * e0.i[2] + e0.i[0]));
    }

    public static KeyCycleOscillator makeWidgetCycle(String s) {
        if(s.equals("pathRotate")) {
            return new PathRotateSet(s);
        }
        KeyCycleOscillator keyCycleOscillator0 = new d();  // 初始化器: Landroidx/constraintlayout/core/motion/utils/KeyCycleOscillator;-><init>()V
        keyCycleOscillator0.g = CycleType.getId(s);
        return keyCycleOscillator0;
    }

    public void setCustom(Object object0) {
    }

    public void setPoint(int v, int v1, String s, int v2, float f, float f1, float f2, float f3) {
        f f4 = new f(f, f1, f2, f3, v);
        this.f.add(f4);
        if(v2 != -1) {
            this.mVariesBy = v2;
        }
        this.d = v1;
        this.e = s;
    }

    public void setPoint(int v, int v1, String s, int v2, float f, float f1, float f2, float f3, Object object0) {
        f f4 = new f(f, f1, f2, f3, v);
        this.f.add(f4);
        if(v2 != -1) {
            this.mVariesBy = v2;
        }
        this.d = v1;
        this.setCustom(object0);
        this.e = s;
    }

    public void setProperty(MotionWidget motionWidget0, float f) {
    }

    public void setType(String s) {
        this.c = s;
    }

    public void setup(float f) {
        ArrayList arrayList0 = this.f;
        int v = arrayList0.size();
        if(v == 0) {
            return;
        }
        Collections.sort(arrayList0, new c(1));
        double[] arr_f = new double[v];
        double[][] arr2_f = new double[v][3];
        int v1 = this.d;
        String s = this.e;
        e e0 = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        Oscillator oscillator0 = new Oscillator();
        e0.a = oscillator0;
        oscillator0.setType(v1, s);
        e0.b = new float[v];
        e0.c = new double[v];
        e0.d = new float[v];
        e0.e = new float[v];
        e0.f = new float[v];
        new float[v];
        this.b = e0;
        int v2 = 0;
        for(Object object0: arrayList0) {
            arr_f[v2] = ((double)((f)object0).d) * 0.01;
            double[] arr_f1 = arr2_f[v2];
            arr_f1[0] = (double)((f)object0).b;
            arr_f1[1] = (double)((f)object0).c;
            arr_f1[2] = (double)((f)object0).e;
            e e1 = this.b;
            e1.c[v2] = ((double)((f)object0).a) / 100.0;
            e1.d[v2] = ((f)object0).d;
            e1.e[v2] = ((f)object0).c;
            e1.f[v2] = ((f)object0).e;
            e1.b[v2] = ((f)object0).b;
            ++v2;
        }
        e e2 = this.b;
        double[] arr_f2 = e2.c;
        double[][] arr2_f1 = new double[arr_f2.length][3];
        float[] arr_f3 = e2.b;
        e2.h = new double[arr_f3.length + 2];
        e2.i = new double[arr_f3.length + 2];
        float[] arr_f4 = e2.d;
        Oscillator oscillator1 = e2.a;
        if(Double.compare(arr_f2[0], 0.0) > 0) {
            oscillator1.addPoint(0.0, arr_f4[0]);
        }
        int v3 = arr_f2.length - 1;
        if(arr_f2[v3] < 1.0) {
            oscillator1.addPoint(1.0, arr_f4[v3]);
        }
        for(int v4 = 0; v4 < arr2_f1.length; ++v4) {
            double[] arr_f5 = arr2_f1[v4];
            arr_f5[0] = (double)e2.e[v4];
            arr_f5[1] = (double)e2.f[v4];
            arr_f5[2] = (double)arr_f3[v4];
            oscillator1.addPoint(arr_f2[v4], arr_f4[v4]);
        }
        oscillator1.normalize();
        e2.g = arr_f2.length > 1 ? CurveFit.get(0, arr_f2, arr2_f1) : null;
        this.a = CurveFit.get(0, arr_f, arr2_f);
    }

    @Override
    public String toString() {
        String s = this.c;
        DecimalFormat decimalFormat0 = new DecimalFormat("##.##");
        for(Object object0: this.f) {
            StringBuilder stringBuilder0 = b.u(s, "[");
            stringBuilder0.append(((f)object0).a);
            stringBuilder0.append(" , ");
            stringBuilder0.append(decimalFormat0.format(((double)((f)object0).b)));
            stringBuilder0.append("] ");
            s = stringBuilder0.toString();
        }
        return s;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }
}

