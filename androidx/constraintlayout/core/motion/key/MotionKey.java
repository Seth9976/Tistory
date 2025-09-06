package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

public abstract class MotionKey implements TypedValues {
    public static final String ALPHA = "alpha";
    public static final String CUSTOM = "CUSTOM";
    public static final String ELEVATION = "elevation";
    public static final String ROTATION = "rotationZ";
    public static final String ROTATION_X = "rotationX";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final String TRANSLATION_X = "translationX";
    public static final String TRANSLATION_Y = "translationY";
    public static int UNSET = -1;
    public static final String VISIBILITY = "visibility";
    public HashMap mCustom;
    public int mFramePosition;
    public int mType;

    public MotionKey() {
        this.mFramePosition = MotionKey.UNSET;
    }

    public abstract void addValues(HashMap arg1);

    public abstract MotionKey clone();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    public MotionKey copy(MotionKey motionKey0) {
        this.mFramePosition = motionKey0.mFramePosition;
        this.mType = motionKey0.mType;
        return this;
    }

    public abstract void getAttributeNames(HashSet arg1);

    public int getFramePosition() {
        return this.mFramePosition;
    }

    public void setCustomAttribute(String s, int v, float f) {
        this.mCustom.put(s, new CustomVariable(s, v, f));
    }

    public void setCustomAttribute(String s, int v, int v1) {
        this.mCustom.put(s, new CustomVariable(s, v, v1));
    }

    public void setCustomAttribute(String s, int v, String s1) {
        this.mCustom.put(s, new CustomVariable(s, v, s1));
    }

    public void setCustomAttribute(String s, int v, boolean z) {
        this.mCustom.put(s, new CustomVariable(s, v, z));
    }

    public void setFramePosition(int v) {
        this.mFramePosition = v;
    }

    public void setInterpolation(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, float f) {
        return false;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, int v1) {
        if(v != 100) {
            return false;
        }
        this.mFramePosition = v1;
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, String s) {
        return v == 101;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int v, boolean z) {
        return false;
    }

    public MotionKey setViewId(int v) {
        return this;
    }
}

