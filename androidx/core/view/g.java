package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class g implements DifferentialVelocityProvider, FlingVelocityThresholdCalculator {
    @Override  // androidx.core.view.DifferentialMotionFlingController$FlingVelocityThresholdCalculator
    public void calculateFlingVelocityThresholds(Context context0, int[] arr_v, MotionEvent motionEvent0, int v) {
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        arr_v[0] = ViewConfigurationCompat.getScaledMinimumFlingVelocity(context0, viewConfiguration0, motionEvent0.getDeviceId(), v, motionEvent0.getSource());
        arr_v[1] = ViewConfigurationCompat.getScaledMaximumFlingVelocity(context0, viewConfiguration0, motionEvent0.getDeviceId(), v, motionEvent0.getSource());
    }

    @Override  // androidx.core.view.DifferentialMotionFlingController$DifferentialVelocityProvider
    public float getCurrentVelocity(VelocityTracker velocityTracker0, MotionEvent motionEvent0, int v) {
        VelocityTrackerCompat.addMovement(velocityTracker0, motionEvent0);
        VelocityTrackerCompat.computeCurrentVelocity(velocityTracker0, 1000);
        return VelocityTrackerCompat.getAxisVelocity(velocityTracker0, v);
    }
}

