package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;
import kotlin.jvm.internal.Intrinsics;

public final class i implements ViewTreeObserver.OnDrawListener, ReportFullyDrawnExecutor, Runnable {
    public final long a;
    public Runnable b;
    public boolean c;
    public final ComponentActivity d;

    public i(ComponentActivity componentActivity0) {
        this.d = componentActivity0;
        this.a = SystemClock.uptimeMillis() + 10000L;
    }

    @Override  // androidx.activity.ComponentActivity$ReportFullyDrawnExecutor
    public final void activityDestroyed() {
        this.d.getWindow().getDecorView().removeCallbacks(this);
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override
    public final void execute(Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "runnable");
        this.b = runnable0;
        View view0 = this.d.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window.decorView");
        if(this.c) {
            if(Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                view0.invalidate();
                return;
            }
            view0.postInvalidate();
            return;
        }
        view0.postOnAnimation(new h(this, 0));
    }

    @Override  // android.view.ViewTreeObserver$OnDrawListener
    public final void onDraw() {
        Runnable runnable0 = this.b;
        ComponentActivity componentActivity0 = this.d;
        if(runnable0 != null) {
            runnable0.run();
            this.b = null;
            if(componentActivity0.getFullyDrawnReporter().isFullyDrawnReported()) {
                this.c = false;
                componentActivity0.getWindow().getDecorView().post(this);
            }
        }
        else if(SystemClock.uptimeMillis() > this.a) {
            this.c = false;
            componentActivity0.getWindow().getDecorView().post(this);
        }
    }

    @Override
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override  // androidx.activity.ComponentActivity$ReportFullyDrawnExecutor
    public final void viewCreated(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        if(!this.c) {
            this.c = true;
            view0.getViewTreeObserver().addOnDrawListener(this);
        }
    }
}

