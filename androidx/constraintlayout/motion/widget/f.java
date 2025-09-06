package androidx.constraintlayout.motion.widget;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R.styleable;

public abstract class f {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        f.a = sparseIntArray0;
        sparseIntArray0.append(styleable.KeyTrigger_framePosition, 8);
        sparseIntArray0.append(styleable.KeyTrigger_onCross, 4);
        sparseIntArray0.append(styleable.KeyTrigger_onNegativeCross, 1);
        sparseIntArray0.append(styleable.KeyTrigger_onPositiveCross, 2);
        sparseIntArray0.append(styleable.KeyTrigger_motionTarget, 7);
        sparseIntArray0.append(styleable.KeyTrigger_triggerId, 6);
        sparseIntArray0.append(styleable.KeyTrigger_triggerSlack, 5);
        sparseIntArray0.append(styleable.KeyTrigger_motion_triggerOnCollision, 9);
        sparseIntArray0.append(styleable.KeyTrigger_motion_postLayoutCollision, 10);
        sparseIntArray0.append(styleable.KeyTrigger_triggerReceiver, 11);
        sparseIntArray0.append(styleable.KeyTrigger_viewTransitionOnCross, 12);
        sparseIntArray0.append(styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
        sparseIntArray0.append(styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
    }
}

