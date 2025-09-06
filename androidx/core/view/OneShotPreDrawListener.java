package androidx.core.view;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

public final class OneShotPreDrawListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public OneShotPreDrawListener(View view0, Runnable runnable0) {
        this.a = view0;
        this.b = view0.getViewTreeObserver();
        this.c = runnable0;
    }

    @NonNull
    public static OneShotPreDrawListener add(@NonNull View view0, @NonNull Runnable runnable0) {
        if(view0 == null) {
            throw new NullPointerException("view == null");
        }
        if(runnable0 == null) {
            throw new NullPointerException("runnable == null");
        }
        OneShotPreDrawListener oneShotPreDrawListener0 = new OneShotPreDrawListener(view0, runnable0);
        view0.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener0);
        view0.addOnAttachStateChangeListener(oneShotPreDrawListener0);
        return oneShotPreDrawListener0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public boolean onPreDraw() {
        this.removeListener();
        this.c.run();
        return true;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view0) {
        this.b = view0.getViewTreeObserver();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view0) {
        this.removeListener();
    }

    public void removeListener() {
        boolean z = this.b.isAlive();
        View view0 = this.a;
        if(z) {
            this.b.removeOnPreDrawListener(this);
        }
        else {
            view0.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view0.removeOnAttachStateChangeListener(this);
    }
}

