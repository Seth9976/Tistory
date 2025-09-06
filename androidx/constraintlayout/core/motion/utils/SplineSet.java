package androidx.constraintlayout.core.motion.utils;

import a5.b;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class SplineSet {
    public static class CustomSet extends SplineSet {
        public final CustomArray c;
        public float[] d;

        public CustomSet(String s, CustomArray keyFrameArray$CustomArray0) {
            String s1 = s.split(",")[1];
            this.c = keyFrameArray$CustomArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int v, float f) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int v, CustomAttribute customAttribute0) {
            this.c.append(v, customAttribute0);
        }

        public void setProperty(WidgetFrame widgetFrame0, float f) {
            this.mCurveFit.getPos(((double)f), this.d);
            widgetFrame0.setCustomValue(this.c.valueAt(0), this.d);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int v) {
            CustomArray keyFrameArray$CustomArray0 = this.c;
            int v1 = keyFrameArray$CustomArray0.size();
            int v2 = keyFrameArray$CustomArray0.valueAt(0).numberOfInterpolatedValues();
            double[] arr_f = new double[v1];
            this.d = new float[v2];
            double[][] arr2_f = new double[v1][v2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = keyFrameArray$CustomArray0.keyAt(v3);
                CustomAttribute customAttribute0 = keyFrameArray$CustomArray0.valueAt(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                customAttribute0.getValuesToInterpolate(this.d);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f1 = this.d;
                    if(v5 >= arr_f1.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f1[v5];
                }
            }
            this.mCurveFit = CurveFit.get(v, arr_f, arr2_f);
        }
    }

    public static class CustomSpline extends SplineSet {
        public final CustomVar c;
        public float[] d;

        public CustomSpline(String s, CustomVar keyFrameArray$CustomVar0) {
            String s1 = s.split(",")[1];
            this.c = keyFrameArray$CustomVar0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int v, float f) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int v, CustomVariable customVariable0) {
            this.c.append(v, customVariable0);
        }

        public void setProperty(MotionWidget motionWidget0, float f) {
            this.mCurveFit.getPos(((double)f), this.d);
            this.c.valueAt(0).setInterpolatedValue(motionWidget0, this.d);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues0, float f) {
            this.setProperty(((MotionWidget)typedValues0), f);
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int v) {
            CustomVar keyFrameArray$CustomVar0 = this.c;
            int v1 = keyFrameArray$CustomVar0.size();
            int v2 = keyFrameArray$CustomVar0.valueAt(0).numberOfInterpolatedValues();
            double[] arr_f = new double[v1];
            this.d = new float[v2];
            double[][] arr2_f = new double[v1][v2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = keyFrameArray$CustomVar0.keyAt(v3);
                CustomVariable customVariable0 = keyFrameArray$CustomVar0.valueAt(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                customVariable0.getValuesToInterpolate(this.d);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f1 = this.d;
                    if(v5 >= arr_f1.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f1[v5];
                }
            }
            this.mCurveFit = CurveFit.get(v, arr_f, arr2_f);
        }
    }

    public int a;
    public String b;
    protected CurveFit mCurveFit;
    protected int[] mTimePoints;
    protected float[] mValues;

    public SplineSet() {
        this.mTimePoints = new int[10];
        this.mValues = new float[10];
    }

    public float get(float f) {
        return (float)this.mCurveFit.getPos(((double)f), 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f) {
        return (float)this.mCurveFit.getSlope(((double)f), 0);
    }

    public static SplineSet makeCustomSpline(String s, CustomArray keyFrameArray$CustomArray0) {
        return new CustomSet(s, keyFrameArray$CustomArray0);
    }

    public static SplineSet makeCustomSplineSet(String s, CustomVar keyFrameArray$CustomVar0) {
        return new CustomSpline(s, keyFrameArray$CustomVar0);
    }

    public static SplineSet makeSpline(String s, long v) {
        SplineSet splineSet0 = new h();  // 初始化器: Landroidx/constraintlayout/core/motion/utils/SplineSet;-><init>()V
        splineSet0.c = s;
        return splineSet0;
    }

    public void setPoint(int v, float f) {
        int[] arr_v = this.mTimePoints;
        if(arr_v.length < this.a + 1) {
            this.mTimePoints = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.mValues = Arrays.copyOf(this.mValues, this.mValues.length * 2);
        }
        int v1 = this.a;
        this.mTimePoints[v1] = v;
        this.mValues[v1] = f;
        this.a = v1 + 1;
    }

    public void setProperty(TypedValues typedValues0, float f) {
        typedValues0.setValue(AttributesType.getId(this.b), this.get(f));
    }

    public void setType(String s) {
        this.b = s;
    }

    public void setup(int v) {
        int v1 = this.a;
        if(v1 == 0) {
            return;
        }
        int[] arr_v = this.mTimePoints;
        float[] arr_f = this.mValues;
        int[] arr_v1 = new int[arr_v.length + 10];
        arr_v1[0] = v1 - 1;
        arr_v1[1] = 0;
        int v2 = 2;
        while(v2 > 0) {
            int v3 = arr_v1[v2 - 1];
            int v4 = arr_v1[v2 - 2];
            if(v3 < v4) {
                int v5 = arr_v[v4];
                int v6 = v3;
                int v7 = v6;
                while(v6 < v4) {
                    int v8 = arr_v[v6];
                    if(v8 <= v5) {
                        int v9 = arr_v[v7];
                        arr_v[v7] = v8;
                        arr_v[v6] = v9;
                        float f = arr_f[v7];
                        arr_f[v7] = arr_f[v6];
                        arr_f[v6] = f;
                        ++v7;
                    }
                    ++v6;
                }
                int v10 = arr_v[v7];
                arr_v[v7] = arr_v[v4];
                arr_v[v4] = v10;
                float f1 = arr_f[v7];
                arr_f[v7] = arr_f[v4];
                arr_f[v4] = f1;
                arr_v1[v2 - 2] = v7 - 1;
                arr_v1[v2 - 1] = v3;
                int v11 = v2 + 1;
                arr_v1[v2] = v4;
                v2 += 2;
                arr_v1[v11] = v7 + 1;
            }
            else {
                v2 -= 2;
            }
        }
        int v13 = 1;
        for(int v12 = 1; v12 < this.a; ++v12) {
            if(this.mTimePoints[v12 - 1] != this.mTimePoints[v12]) {
                ++v13;
            }
        }
        double[] arr_f1 = new double[v13];
        double[][] arr2_f = new double[v13][1];
        int v15 = 0;
        for(int v14 = 0; v14 < this.a; ++v14) {
            if(v14 <= 0 || this.mTimePoints[v14] != this.mTimePoints[v14 - 1]) {
                arr_f1[v15] = ((double)this.mTimePoints[v14]) * 0.01;
                arr2_f[v15][0] = (double)this.mValues[v14];
                ++v15;
            }
        }
        this.mCurveFit = CurveFit.get(v, arr_f1, arr2_f);
    }

    @Override
    public String toString() {
        String s = this.b;
        DecimalFormat decimalFormat0 = new DecimalFormat("##.##");
        for(int v = 0; v < this.a; ++v) {
            StringBuilder stringBuilder0 = b.u(s, "[");
            stringBuilder0.append(this.mTimePoints[v]);
            stringBuilder0.append(" , ");
            stringBuilder0.append(decimalFormat0.format(((double)this.mValues[v])));
            stringBuilder0.append("] ");
            s = stringBuilder0.toString();
        }
        return s;
    }
}

