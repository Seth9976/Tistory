package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import y2.g;
import y2.h;

public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    public static class CustomSet extends ViewTimeCycle {
        public final String a;
        public final SparseArray b;
        public final SparseArray c;
        public float[] d;
        public float[] e;

        public CustomSet(String s, SparseArray sparseArray0) {
            this.c = new SparseArray();
            this.a = s.split(",")[1];
            this.b = sparseArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int v, float f, float f1, int v1, float f2) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int v, ConstraintAttribute constraintAttribute0, float f, int v1, float f1) {
            this.b.append(v, constraintAttribute0);
            this.c.append(v, new float[]{f, f1});
            this.mWaveShape = Math.max(this.mWaveShape, v1);
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view0, float f, long v, KeyCache keyCache0) {
            this.mCurveFit.getPos(((double)f), this.d);
            float[] arr_f = this.d;
            float f1 = arr_f[arr_f.length - 2];
            float f2 = arr_f[arr_f.length - 1];
            long v1 = v - this.last_time;
            if(Float.isNaN(this.last_cycle)) {
                float f3 = keyCache0.getFloatValue(view0, this.a, 0);
                this.last_cycle = f3;
                if(Float.isNaN(f3)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f4 = (float)((((double)v1) * 1.000000E-09 * ((double)f1) + ((double)this.last_cycle)) % 1.0);
            this.last_cycle = f4;
            this.last_time = v;
            float f5 = this.calcWave(f4);
            this.mContinue = false;
            for(int v2 = 0; true; ++v2) {
                float[] arr_f1 = this.e;
                if(v2 >= arr_f1.length) {
                    break;
                }
                boolean z = this.mContinue;
                float f6 = this.d[v2];
                this.mContinue = z | ((double)f6) != 0.0;
                arr_f1[v2] = f6 * f5 + f2;
            }
            CustomSupport.setInterpolatedValue(((ConstraintAttribute)this.b.valueAt(0)), view0, this.e);
            if(f1 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int v) {
            SparseArray sparseArray0 = this.b;
            int v1 = sparseArray0.size();
            int v2 = ((ConstraintAttribute)sparseArray0.valueAt(0)).numberOfInterpolatedValues();
            double[] arr_f = new double[v1];
            this.d = new float[v2 + 2];
            this.e = new float[v2];
            double[][] arr2_f = new double[v1][v2 + 2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = sparseArray0.keyAt(v3);
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)sparseArray0.valueAt(v3);
                float[] arr_f1 = (float[])this.c.valueAt(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                constraintAttribute0.getValuesToInterpolate(this.d);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f2 = this.d;
                    if(v5 >= arr_f2.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f2[v5];
                }
                double[] arr_f3 = arr2_f[v3];
                arr_f3[v2] = (double)arr_f1[0];
                arr_f3[v2 + 1] = (double)arr_f1[1];
            }
            this.mCurveFit = CurveFit.get(v, arr_f, arr2_f);
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view0, KeyCache keyCache0, float f, long v, double f1, double f2) {
            view0.setRotation(this.get(f, v, view0, keyCache0) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
            return this.mContinue;
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view0, float f, long v, KeyCache keyCache0) {
            return this.mContinue;
        }
    }

    public float get(float f, long v, View view0, KeyCache keyCache0) {
        this.mCurveFit.getPos(((double)f), this.mCache);
        float[] arr_f = this.mCache;
        float f1 = arr_f[1];
        int v1 = Float.compare(f1, 0.0f);
        if(v1 == 0) {
            this.mContinue = false;
            return arr_f[2];
        }
        if(Float.isNaN(this.last_cycle)) {
            float f2 = keyCache0.getFloatValue(view0, this.mType, 0);
            this.last_cycle = f2;
            if(Float.isNaN(f2)) {
                this.last_cycle = 0.0f;
            }
        }
        float f3 = (float)((((double)(v - this.last_time)) * 1.000000E-09 * ((double)f1) + ((double)this.last_cycle)) % 1.0);
        this.last_cycle = f3;
        keyCache0.setFloatValue(view0, this.mType, 0, f3);
        this.last_time = v;
        float f4 = this.mCache[0];
        float f5 = this.calcWave(this.last_cycle) * f4 + this.mCache[2];
        this.mContinue = f4 != 0.0f || v1 != 0;
        return f5;
    }

    public static ViewTimeCycle makeCustomSpline(String s, SparseArray sparseArray0) {
        return new CustomSet(s, sparseArray0);
    }

    public static ViewTimeCycle makeSpline(String s, long v) {
        ViewTimeCycle viewTimeCycle0;
        s.getClass();
        switch(s) {
            case "alpha": {
                viewTimeCycle0 = new g(0);
                break;
            }
            case "elevation": {
                viewTimeCycle0 = new g(1);
                break;
            }
            case "progress": {
                viewTimeCycle0 = new h();  // 初始化器: Landroidx/constraintlayout/motion/utils/ViewTimeCycle;-><init>()V
                viewTimeCycle0.a = false;
                break;
            }
            case "rotation": {
                viewTimeCycle0 = new g(2);
                break;
            }
            case "rotationX": {
                viewTimeCycle0 = new g(3);
                break;
            }
            case "rotationY": {
                viewTimeCycle0 = new g(4);
                break;
            }
            case "scaleX": {
                viewTimeCycle0 = new g(5);
                break;
            }
            case "scaleY": {
                viewTimeCycle0 = new g(6);
                break;
            }
            case "transitionPathRotate": {
                viewTimeCycle0 = new PathRotate();
                break;
            }
            case "translationX": {
                viewTimeCycle0 = new g(7);
                break;
            }
            case "translationY": {
                viewTimeCycle0 = new g(8);
                break;
            }
            case "translationZ": {
                viewTimeCycle0 = new g(9);
                break;
            }
            default: {
                return null;
            }
        }
        viewTimeCycle0.setStartTime(v);
        return viewTimeCycle0;
    }

    public abstract boolean setProperty(View arg1, float arg2, long arg3, KeyCache arg4);
}

