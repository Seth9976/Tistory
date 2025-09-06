package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyTrigger extends MotionKey {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";

    public MotionKeyTrigger() {
        new FloatRect();
        new FloatRect();
        this.mType = 5;
        this.mCustom = new HashMap();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey clone() {
        return new MotionKeyTrigger().copy(this);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    public void conditionallyFire(float f, MotionWidget motionWidget0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey0) {
        return this.copy(motionKey0);
    }

    public MotionKeyTrigger copy(MotionKey motionKey0) {
        super.copy(motionKey0);
        ((MotionKeyTrigger)motionKey0).getClass();
        return this;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet hashSet0) {
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String s) {
        s.getClass();
        switch(s) {
            case "negativeCross": {
                return 310;
            }
            case "positiveCross": {
                return 309;
            }
            case "postLayout": {
                return 304;
            }
            case "triggerCollisionId": {
                return 307;
            }
            case "triggerCollisionView": {
                return 306;
            }
            case "triggerID": {
                return 308;
            }
            case "triggerReceiver": {
                return 311;
            }
            case "triggerSlack": {
                return 305;
            }
            case "viewTransitionOnCross": {
                return 301;
            }
            case "viewTransitionOnNegativeCross": {
                return 303;
            }
            case "viewTransitionOnPositiveCross": {
                return 302;
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, float f) {
        return v == 305 ? true : super.setValue(v, f);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, int v1) {
        return v == 307 || v == 308 || v == 311 || (v == 301 || v == 302 || v == 303) ? true : super.setValue(v, v1);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, String s) {
        return v == 309 || v == 310 || v == 312 ? true : super.setValue(v, s);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean setValue(int v, boolean z) {
        return v == 304 ? true : super.setValue(v, z);
    }
}

