package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

public class DifferentialMotionFlingController {
    @VisibleForTesting
    interface DifferentialVelocityProvider {
        float getCurrentVelocity(VelocityTracker arg1, MotionEvent arg2, int arg3);
    }

    @VisibleForTesting
    interface FlingVelocityThresholdCalculator {
        void calculateFlingVelocityThresholds(Context arg1, int[] arg2, MotionEvent arg3, int arg4);
    }

    public final Context a;
    public final DifferentialMotionFlingTarget b;
    public final g c;
    public final g d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    public DifferentialMotionFlingController(@NonNull Context context0, @NonNull DifferentialMotionFlingTarget differentialMotionFlingTarget0) {
        g g0 = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        g g1 = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        super();
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{0x7FFFFFFF, 0};
        this.a = context0;
        this.b = differentialMotionFlingTarget0;
        this.c = g0;
        this.d = g1;
    }

    public void onMotionEvent(@NonNull MotionEvent motionEvent0, int v) {
        boolean z;
        int v1 = motionEvent0.getSource();
        int v2 = motionEvent0.getDeviceId();
        int[] arr_v = this.j;
        if(this.h != v1 || this.i != v2 || this.g != v) {
            this.c.calculateFlingVelocityThresholds(this.a, arr_v, motionEvent0, v);
            this.h = v1;
            this.i = v2;
            this.g = v;
            z = true;
        }
        else {
            z = false;
        }
        if(arr_v[0] == 0x7FFFFFFF) {
            VelocityTracker velocityTracker0 = this.e;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.e = null;
            }
            return;
        }
        if(this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        float f = this.d.getCurrentVelocity(this.e, motionEvent0, v);
        DifferentialMotionFlingTarget differentialMotionFlingTarget0 = this.b;
        float f1 = differentialMotionFlingTarget0.getScaledScrollFactor() * f;
        float f2 = Math.signum(f1);
        float f3 = 0.0f;
        if(z || f2 != Math.signum(this.f) && f2 != 0.0f) {
            differentialMotionFlingTarget0.stopDifferentialMotionFling();
        }
        if(Math.abs(f1) < ((float)arr_v[0])) {
            return;
        }
        float f4 = Math.max(-arr_v[1], Math.min(f1, arr_v[1]));
        if(differentialMotionFlingTarget0.startDifferentialMotionFling(f4)) {
            f3 = f4;
        }
        this.f = f3;
    }
}

