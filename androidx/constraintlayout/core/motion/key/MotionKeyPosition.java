package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.TypedValues.PositionType;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyPosition extends MotionKey {
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float a;
    public float b;
    public float mAltPercentX;
    public float mAltPercentY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    public MotionKeyPosition() {
        this.mCurveFit = MotionKey.UNSET;
        this.mTransitionEasing = null;
        this.mPathMotionArc = MotionKey.UNSET;
        this.mDrawPath = 0;
        this.mPercentWidth = NaNf;
        this.mPercentHeight = NaNf;
        this.mPercentX = NaNf;
        this.mPercentY = NaNf;
        this.mAltPercentX = NaNf;
        this.mAltPercentY = NaNf;
        this.mPositionType = 0;
        this.a = NaNf;
        this.b = NaNf;
        this.mType = 2;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        return new MotionKeyPosition().copy(this);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey0) {
        super.copy(motionKey0);
        this.mTransitionEasing = ((MotionKeyPosition)motionKey0).mTransitionEasing;
        this.mPathMotionArc = ((MotionKeyPosition)motionKey0).mPathMotionArc;
        this.mDrawPath = ((MotionKeyPosition)motionKey0).mDrawPath;
        this.mPercentWidth = ((MotionKeyPosition)motionKey0).mPercentWidth;
        this.mPercentHeight = NaNf;
        this.mPercentX = ((MotionKeyPosition)motionKey0).mPercentX;
        this.mPercentY = ((MotionKeyPosition)motionKey0).mPercentY;
        this.mAltPercentX = ((MotionKeyPosition)motionKey0).mAltPercentX;
        this.mAltPercentY = ((MotionKeyPosition)motionKey0).mAltPercentY;
        this.a = ((MotionKeyPosition)motionKey0).a;
        this.b = ((MotionKeyPosition)motionKey0).b;
        return this;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet hashSet0) {
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String s) {
        return PositionType.getId(s);
    }

    public boolean intersects(int v, int v1, FloatRect floatRect0, FloatRect floatRect1, float f, float f1) {
        float f2 = floatRect0.centerX();
        float f3 = floatRect0.centerY();
        float f4 = floatRect1.centerX();
        float f5 = floatRect1.centerY();
        switch(this.mPositionType) {
            case 1: {
                float f12 = f4 - f2;
                float f13 = f5 - f3;
                this.a = -f13 * this.mPercentY + (f12 * this.mPercentX + f2);
                this.b = f12 * this.mPercentY + (f13 * this.mPercentX + f3);
                return Math.abs(f - this.a) < 20.0f && Math.abs(f1 - this.b) < 20.0f;
            }
            case 2: {
                this.a = ((float)v) * this.mPercentX + 0.0f;
                this.b = ((float)v1) * this.mPercentX + 0.0f;
                return Math.abs(f - this.a) < 20.0f && Math.abs(f1 - this.b) < 20.0f;
            }
            default: {
                float f6 = f4 - f2;
                float f7 = f5 - f3;
                float f8 = 0.0f;
                float f9 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
                float f10 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
                float f11 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
                if(!Float.isNaN(this.mAltPercentX)) {
                    f8 = this.mAltPercentX;
                }
                this.a = (float)(((int)(f8 * f7 + (f9 * f6 + f2))));
                this.b = (float)(((int)(f7 * f11 + (f6 * f10 + f3))));
                return Math.abs(f - this.a) < 20.0f && Math.abs(f1 - this.b) < 20.0f;
            }
        }
    }

    public void positionAttributes(MotionWidget motionWidget0, FloatRect floatRect0, FloatRect floatRect1, float f, float f1, String[] arr_s, float[] arr_f) {
        switch(this.mPositionType) {
            case 1: {
                float f6 = floatRect0.centerX();
                float f7 = floatRect0.centerY();
                float f8 = floatRect1.centerX() - f6;
                float f9 = floatRect1.centerY() - f7;
                float f10 = (float)Math.hypot(f8, f9);
                if(((double)f10) < 0.0001) {
                    System.out.println("distance ~ 0");
                    arr_f[0] = 0.0f;
                    arr_f[1] = 0.0f;
                    return;
                }
                float f11 = f8 / f10;
                float f12 = f9 / f10;
                float f13 = f1 - f7;
                float f14 = f - f6;
                float f15 = (f11 * f13 - f14 * f12) / f10;
                float f16 = (f12 * f13 + f11 * f14) / f10;
                String s1 = arr_s[0];
                if(s1 == null) {
                    arr_s[0] = "percentX";
                    arr_s[1] = "percentY";
                    arr_f[0] = f16;
                    arr_f[1] = f15;
                }
                else if("percentX".equals(s1)) {
                    arr_f[0] = f16;
                    arr_f[1] = f15;
                    return;
                }
                return;
            }
            case 2: {
                throw new NullPointerException();
            }
            default: {
                float f2 = floatRect0.centerX();
                float f3 = floatRect0.centerY();
                float f4 = floatRect1.centerX() - f2;
                float f5 = floatRect1.centerY() - f3;
                String s = arr_s[0];
                if(s != null) {
                    if("percentX".equals(s)) {
                        arr_f[0] = (f - f2) / f4;
                        arr_f[1] = (f1 - f3) / f5;
                        return;
                    }
                    arr_f[1] = (f - f2) / f4;
                    arr_f[0] = (f1 - f3) / f5;
                    return;
                }
                arr_s[0] = "percentX";
                arr_f[0] = (f - f2) / f4;
                arr_s[1] = "percentY";
                arr_f[1] = (f1 - f3) / f5;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, float f) {
        switch(v) {
            case 503: {
                this.mPercentWidth = f;
                return true;
            }
            case 504: {
                this.mPercentHeight = f;
                return true;
            }
            case 505: {
                this.mPercentWidth = f;
                this.mPercentHeight = f;
                return true;
            }
            case 506: {
                this.mPercentX = f;
                return true;
            }
            case 507: {
                this.mPercentY = f;
                return true;
            }
            default: {
                return super.setValue(v, f);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, int v1) {
        switch(v) {
            case 100: {
                this.mFramePosition = v1;
                return true;
            }
            case 508: {
                this.mCurveFit = v1;
                return true;
            }
            case 510: {
                this.mPositionType = v1;
                return true;
            }
            default: {
                return super.setValue(v, v1);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, String s) {
        if(v != 501) {
            return super.setValue(v, s);
        }
        this.mTransitionEasing = s.toString();
        return true;
    }
}

