package androidx.constraintlayout.core.motion.utils;

import a5.b;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import java.text.DecimalFormat;

public abstract class TimeCycleSplineSet {
    public static class CustomSet extends TimeCycleSplineSet {
        public final String a;
        public final CustomArray b;
        public final g c;
        public float[] d;
        public float[] e;

        public CustomSet(String s, CustomArray keyFrameArray$CustomArray0) {
            this.c = new g();
            this.a = s.split(",")[1];
            this.b = keyFrameArray$CustomArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int v, float f, float f1, int v1, float f2) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int v, CustomAttribute customAttribute0, float f, int v1, float f1) {
            this.b.append(v, customAttribute0);
            this.c.a(v, new float[]{f, f1});
            this.mWaveShape = Math.max(this.mWaveShape, v1);
        }

        public boolean setProperty(MotionWidget motionWidget0, float f, long v, KeyCache keyCache0) {
            this.mCurveFit.getPos(((double)f), this.d);
            float[] arr_f = this.d;
            float f1 = arr_f[arr_f.length - 2];
            float f2 = arr_f[arr_f.length - 1];
            long v1 = v - this.last_time;
            if(Float.isNaN(this.last_cycle)) {
                float f3 = keyCache0.getFloatValue(motionWidget0, this.a, 0);
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
            motionWidget0.setInterpolatedValue(this.b.valueAt(0), this.e);
            if(f1 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int v) {
            CustomArray keyFrameArray$CustomArray0 = this.b;
            int v1 = keyFrameArray$CustomArray0.size();
            int v2 = keyFrameArray$CustomArray0.valueAt(0).numberOfInterpolatedValues();
            double[] arr_f = new double[v1];
            this.d = new float[v2 + 2];
            this.e = new float[v2];
            double[][] arr2_f = new double[v1][v2 + 2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = keyFrameArray$CustomArray0.keyAt(v3);
                CustomAttribute customAttribute0 = keyFrameArray$CustomArray0.valueAt(v3);
                float[] arr_f1 = ((float[][])this.c.c)[((int[])this.c.b)[v3]];
                arr_f[v3] = ((double)v4) * 0.01;
                customAttribute0.getValuesToInterpolate(this.d);
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

    public static class CustomVarSet extends TimeCycleSplineSet {
        public final String a;
        public final CustomVar b;
        public final g c;
        public float[] d;
        public float[] e;

        public CustomVarSet(String s, CustomVar keyFrameArray$CustomVar0) {
            this.c = new g();
            this.a = s.split(",")[1];
            this.b = keyFrameArray$CustomVar0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int v, float f, float f1, int v1, float f2) {
            throw new RuntimeException("don\'t call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int v, CustomVariable customVariable0, float f, int v1, float f1) {
            this.b.append(v, customVariable0);
            this.c.a(v, new float[]{f, f1});
            this.mWaveShape = Math.max(this.mWaveShape, v1);
        }

        public boolean setProperty(MotionWidget motionWidget0, float f, long v, KeyCache keyCache0) {
            this.mCurveFit.getPos(((double)f), this.d);
            float[] arr_f = this.d;
            float f1 = arr_f[arr_f.length - 2];
            float f2 = arr_f[arr_f.length - 1];
            long v1 = v - this.last_time;
            if(Float.isNaN(this.last_cycle)) {
                float f3 = keyCache0.getFloatValue(motionWidget0, this.a, 0);
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
            this.b.valueAt(0).setInterpolatedValue(motionWidget0, this.e);
            if(f1 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int v) {
            CustomVar keyFrameArray$CustomVar0 = this.b;
            int v1 = keyFrameArray$CustomVar0.size();
            int v2 = keyFrameArray$CustomVar0.valueAt(0).numberOfInterpolatedValues();
            double[] arr_f = new double[v1];
            this.d = new float[v2 + 2];
            this.e = new float[v2];
            double[][] arr2_f = new double[v1][v2 + 2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = keyFrameArray$CustomVar0.keyAt(v3);
                CustomVariable customVariable0 = keyFrameArray$CustomVar0.valueAt(v3);
                float[] arr_f1 = ((float[][])this.c.c)[((int[])this.c.b)[v3]];
                arr_f[v3] = ((double)v4) * 0.01;
                customVariable0.getValuesToInterpolate(this.d);
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

    public static class Sort {
    }

    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    protected static float VAL_2PI = 6.283185f;
    protected int count;
    protected float last_cycle;
    protected long last_time;
    protected float[] mCache;
    protected boolean mContinue;
    protected CurveFit mCurveFit;
    protected int[] mTimePoints;
    protected String mType;
    protected float[][] mValues;
    protected int mWaveShape;

    public TimeCycleSplineSet() {
        this.mWaveShape = 0;
        this.mTimePoints = new int[10];
        this.mValues = new float[10][3];
        this.mCache = new float[3];
        this.mContinue = false;
        this.last_cycle = NaNf;
    }

    public float calcWave(float f) {
        switch(this.mWaveShape) {
            case 1: {
                return Math.signum(f * TimeCycleSplineSet.VAL_2PI);
            }
            case 2: {
                return 1.0f - Math.abs(f);
            }
            case 3: {
                return (f * 2.0f + 1.0f) % 2.0f - 1.0f;
            }
            case 4: {
                return 1.0f - (f * 2.0f + 1.0f) % 2.0f;
            }
            case 5: {
                return (float)Math.cos(f * TimeCycleSplineSet.VAL_2PI);
            }
            case 6: {
                float f1 = Math.abs(f * 4.0f % 4.0f - 2.0f);
                return 1.0f - (1.0f - f1) * (1.0f - f1);
            }
            default: {
                return (float)Math.sin(f * TimeCycleSplineSet.VAL_2PI);
            }
        }
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int v, float f, float f1, int v1, float f2) {
        int v2 = this.count;
        this.mTimePoints[v2] = v;
        float[] arr_f = this.mValues[v2];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        this.mWaveShape = Math.max(this.mWaveShape, v1);
        ++this.count;
    }

    public void setStartTime(long v) {
        this.last_time = v;
    }

    public void setType(String s) {
        this.mType = s;
    }

    public void setup(int v) {
        int v1 = this.count;
        if(v1 == 0) {
            System.err.println("Error no points added to " + this.mType);
            return;
        }
        int[] arr_v = this.mTimePoints;
        float[][] arr2_f = this.mValues;
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
                        float[] arr_f = arr2_f[v7];
                        arr2_f[v7] = arr2_f[v6];
                        arr2_f[v6] = arr_f;
                        ++v7;
                    }
                    ++v6;
                }
                int v10 = arr_v[v7];
                arr_v[v7] = arr_v[v4];
                arr_v[v4] = v10;
                float[] arr_f1 = arr2_f[v7];
                arr2_f[v7] = arr2_f[v4];
                arr2_f[v4] = arr_f1;
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
        int v13 = 0;
        for(int v12 = 1; true; ++v12) {
            int[] arr_v2 = this.mTimePoints;
            if(v12 >= arr_v2.length) {
                break;
            }
            if(arr_v2[v12] != arr_v2[v12 - 1]) {
                ++v13;
            }
        }
        if(v13 == 0) {
            v13 = 1;
        }
        double[] arr_f2 = new double[v13];
        double[][] arr2_f1 = new double[v13][3];
        int v15 = 0;
        for(int v14 = 0; v14 < this.count; ++v14) {
            if(v14 <= 0 || this.mTimePoints[v14] != this.mTimePoints[v14 - 1]) {
                arr_f2[v15] = ((double)this.mTimePoints[v14]) * 0.01;
                double[] arr_f3 = arr2_f1[v15];
                float[] arr_f4 = this.mValues[v14];
                arr_f3[0] = (double)arr_f4[0];
                arr_f3[1] = (double)arr_f4[1];
                arr_f3[2] = (double)arr_f4[2];
                ++v15;
            }
        }
        this.mCurveFit = CurveFit.get(v, arr_f2, arr2_f1);
    }

    @Override
    public String toString() {
        String s = this.mType;
        DecimalFormat decimalFormat0 = new DecimalFormat("##.##");
        for(int v = 0; v < this.count; ++v) {
            StringBuilder stringBuilder0 = b.u(s, "[");
            stringBuilder0.append(this.mTimePoints[v]);
            stringBuilder0.append(" , ");
            stringBuilder0.append(decimalFormat0.format(this.mValues[v]));
            stringBuilder0.append("] ");
            s = stringBuilder0.toString();
        }
        return s;
    }
}

