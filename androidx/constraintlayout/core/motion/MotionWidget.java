package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType;
import androidx.constraintlayout.core.motion.utils.TypedValues.MotionType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.Set;

public class MotionWidget implements TypedValues {
    public static class Motion {
        public int mAnimateCircleAngleTo;
        public int mAnimateRelativeTo;
        public int mDrawPath;
        public float mMotionStagger;
        public int mPathMotionArc;
        public float mPathRotate;
        public int mPolarRelativeTo;
        public int mQuantizeInterpolatorID;
        public String mQuantizeInterpolatorString;
        public int mQuantizeInterpolatorType;
        public float mQuantizeMotionPhase;
        public int mQuantizeMotionSteps;
        public String mTransitionEasing;

        public Motion() {
            this.mAnimateRelativeTo = -1;
            this.mAnimateCircleAngleTo = 0;
            this.mTransitionEasing = null;
            this.mPathMotionArc = -1;
            this.mDrawPath = 0;
            this.mMotionStagger = NaNf;
            this.mPolarRelativeTo = -1;
            this.mPathRotate = NaNf;
            this.mQuantizeMotionPhase = NaNf;
            this.mQuantizeMotionSteps = -1;
            this.mQuantizeInterpolatorString = null;
            this.mQuantizeInterpolatorType = -3;
            this.mQuantizeInterpolatorID = -1;
        }
    }

    public static class PropertySet {
        public float alpha;
        public float mProgress;
        public int mVisibilityMode;
        public int visibility;

        public PropertySet() {
            this.visibility = 4;
            this.mVisibilityMode = 0;
            this.alpha = 1.0f;
            this.mProgress = NaNf;
        }
    }

    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = 0x80000000;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;
    public WidgetFrame a;
    public final Motion b;
    public final PropertySet c;
    public float d;
    public float e;

    public MotionWidget() {
        this.a = new WidgetFrame();
        this.b = new Motion();
        this.c = new PropertySet();
    }

    public MotionWidget(WidgetFrame widgetFrame0) {
        this.a = new WidgetFrame();
        this.b = new Motion();
        this.c = new PropertySet();
        this.a = widgetFrame0;
    }

    public MotionWidget findViewById(int v) [...] // Inlined contents

    public float getAlpha() {
        return this.c.alpha;
    }

    public int getBottom() {
        return this.a.bottom;
    }

    public CustomVariable getCustomAttribute(String s) {
        return this.a.getCustomAttribute(s);
    }

    public Set getCustomAttributeNames() {
        return this.a.getCustomAttributeNames();
    }

    public int getHeight() {
        return this.a.bottom - this.a.top;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String s) {
        int v = AttributesType.getId(s);
        return v == -1 ? MotionType.getId(s) : v;
    }

    public int getLeft() {
        return this.a.left;
    }

    // 去混淆评级： 低(20)
    public String getName() {
        return "unknown";
    }

    public MotionWidget getParent() [...] // Inlined contents

    public float getPivotX() {
        return this.a.pivotX;
    }

    public float getPivotY() {
        return this.a.pivotY;
    }

    public int getRight() {
        return this.a.right;
    }

    public float getRotationX() {
        return this.a.rotationX;
    }

    public float getRotationY() {
        return this.a.rotationY;
    }

    public float getRotationZ() {
        return this.a.rotationZ;
    }

    public float getScaleX() {
        return this.a.scaleX;
    }

    public float getScaleY() {
        return this.a.scaleY;
    }

    public int getTop() {
        return this.a.top;
    }

    public float getTranslationX() {
        return this.a.translationX;
    }

    public float getTranslationY() {
        return this.a.translationY;
    }

    public float getTranslationZ() {
        return this.a.translationZ;
    }

    public float getValueAttributes(int v) {
        switch(v) {
            case 303: {
                return this.a.alpha;
            }
            case 304: {
                return this.a.translationX;
            }
            case 305: {
                return this.a.translationY;
            }
            case 306: {
                return this.a.translationZ;
            }
            case 308: {
                return this.a.rotationX;
            }
            case 309: {
                return this.a.rotationY;
            }
            case 310: {
                return this.a.rotationZ;
            }
            case 311: {
                return this.a.scaleX;
            }
            case 312: {
                return this.a.scaleY;
            }
            case 313: {
                return this.a.pivotX;
            }
            case 314: {
                return this.a.pivotY;
            }
            case 315: {
                return this.d;
            }
            case 316: {
                return this.e;
            }
            default: {
                return NaNf;
            }
        }
    }

    public int getVisibility() {
        return this.c.visibility;
    }

    public WidgetFrame getWidgetFrame() {
        return this.a;
    }

    public int getWidth() {
        return this.a.right - this.a.left;
    }

    public int getX() {
        return this.a.left;
    }

    public int getY() {
        return this.a.top;
    }

    public void layout(int v, int v1, int v2, int v3) {
        this.setBounds(v, v1, v2, v3);
    }

    public void setBounds(int v, int v1, int v2, int v3) {
        if(this.a == null) {
            this.a = new WidgetFrame(null);
        }
        this.a.top = v1;
        this.a.left = v;
        this.a.right = v2;
        this.a.bottom = v3;
    }

    public void setCustomAttribute(String s, int v, float f) {
        this.a.setCustomAttribute(s, v, f);
    }

    public void setCustomAttribute(String s, int v, int v1) {
        this.a.setCustomAttribute(s, v, v1);
    }

    public void setCustomAttribute(String s, int v, String s1) {
        this.a.setCustomAttribute(s, v, s1);
    }

    public void setCustomAttribute(String s, int v, boolean z) {
        this.a.setCustomAttribute(s, v, z);
    }

    public void setInterpolatedValue(CustomAttribute customAttribute0, float[] arr_f) {
        this.a.setCustomAttribute(customAttribute0.a, 901, arr_f[0]);
    }

    public void setPivotX(float f) {
        this.a.pivotX = f;
    }

    public void setPivotY(float f) {
        this.a.pivotY = f;
    }

    public void setRotationX(float f) {
        this.a.rotationX = f;
    }

    public void setRotationY(float f) {
        this.a.rotationY = f;
    }

    public void setRotationZ(float f) {
        this.a.rotationZ = f;
    }

    public void setScaleX(float f) {
        this.a.scaleX = f;
    }

    public void setScaleY(float f) {
        this.a.scaleY = f;
    }

    public void setTranslationX(float f) {
        this.a.translationX = f;
    }

    public void setTranslationY(float f) {
        this.a.translationY = f;
    }

    public void setTranslationZ(float f) {
        this.a.translationZ = f;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, float f) {
        return this.setValueAttributes(v, f) ? true : this.setValueMotion(v, f);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, int v1) {
        return this.setValueAttributes(v, ((float)v1));
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, String s) {
        return this.setValueMotion(v, s);
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, boolean z) {
        return false;
    }

    public boolean setValueAttributes(int v, float f) {
        switch(v) {
            case 303: {
                this.a.alpha = f;
                return true;
            }
            case 304: {
                this.a.translationX = f;
                return true;
            }
            case 305: {
                this.a.translationY = f;
                return true;
            }
            case 306: {
                this.a.translationZ = f;
                return true;
            }
            case 308: {
                this.a.rotationX = f;
                return true;
            }
            case 309: {
                this.a.rotationY = f;
                return true;
            }
            case 310: {
                this.a.rotationZ = f;
                return true;
            }
            case 311: {
                this.a.scaleX = f;
                return true;
            }
            case 312: {
                this.a.scaleY = f;
                return true;
            }
            case 313: {
                this.a.pivotX = f;
                return true;
            }
            case 314: {
                this.a.pivotY = f;
                return true;
            }
            case 315: {
                this.d = f;
                return true;
            }
            case 316: {
                this.e = f;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean setValueMotion(int v, float f) {
        Motion motionWidget$Motion0 = this.b;
        switch(v) {
            case 600: {
                motionWidget$Motion0.mMotionStagger = f;
                return true;
            }
            case 601: {
                motionWidget$Motion0.mPathRotate = f;
                return true;
            }
            case 602: {
                motionWidget$Motion0.mQuantizeMotionPhase = f;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean setValueMotion(int v, int v1) {
        Motion motionWidget$Motion0 = this.b;
        switch(v) {
            case 605: {
                motionWidget$Motion0.mAnimateRelativeTo = v1;
                return true;
            }
            case 606: {
                motionWidget$Motion0.mAnimateCircleAngleTo = v1;
                return true;
            }
            case 607: {
                motionWidget$Motion0.mPathMotionArc = v1;
                return true;
            }
            case 608: {
                motionWidget$Motion0.mDrawPath = v1;
                return true;
            }
            case 609: {
                motionWidget$Motion0.mPolarRelativeTo = v1;
                return true;
            }
            case 610: {
                motionWidget$Motion0.mQuantizeMotionSteps = v1;
                return true;
            }
            case 611: {
                motionWidget$Motion0.mQuantizeInterpolatorType = v1;
                return true;
            }
            case 612: {
                motionWidget$Motion0.mQuantizeInterpolatorID = v1;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public boolean setValueMotion(int v, String s) {
        Motion motionWidget$Motion0 = this.b;
        switch(v) {
            case 603: {
                motionWidget$Motion0.mTransitionEasing = s;
                return true;
            }
            case 604: {
                motionWidget$Motion0.mQuantizeInterpolatorString = s;
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public void setVisibility(int v) {
        this.c.visibility = v;
    }

    @Override
    public String toString() {
        return this.a.left + ", " + this.a.top + ", " + this.a.right + ", " + this.a.bottom;
    }
}

