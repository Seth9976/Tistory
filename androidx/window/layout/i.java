package androidx.window.layout;

import android.app.Activity;
import android.os.IBinder;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class i implements View.OnAttachStateChangeListener {
    public final SidecarCompat a;
    public final WeakReference b;

    public i(SidecarCompat sidecarCompat0, Activity activity0) {
        Intrinsics.checkNotNullParameter(sidecarCompat0, "sidecarCompat");
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super();
        this.a = sidecarCompat0;
        this.b = new WeakReference(activity0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        view0.removeOnAttachStateChangeListener(this);
        Activity activity0 = (Activity)this.b.get();
        IBinder iBinder0 = SidecarCompat.Companion.getActivityWindowToken$window_release(activity0);
        if(activity0 == null) {
            return;
        }
        if(iBinder0 == null) {
            return;
        }
        this.a.register(iBinder0, activity0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
    }
}

