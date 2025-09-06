package p0;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.compose.material3.q9;

public final class z5 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final View a;
    public final q9 b;
    public boolean c;

    public z5(View view0, q9 q90) {
        this.a = view0;
        this.b = q90;
        view0.addOnAttachStateChangeListener(this);
        if(!this.c && view0.isAttachedToWindow()) {
            view0.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.c = true;
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.invoke();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        if(!this.c) {
            View view1 = this.a;
            if(view1.isAttachedToWindow()) {
                view1.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.c = true;
            }
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        if(this.c) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c = false;
        }
    }
}

