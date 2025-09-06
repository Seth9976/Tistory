package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

public final class o3 extends ViewPropertyAnimatorListenerAdapter {
    public final int a;
    public boolean b;
    public int c;
    public final Object d;

    public o3(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0) {
        this.a = 1;
        this.d = viewPropertyAnimatorCompatSet0;
        super();
        this.b = false;
        this.c = 0;
    }

    public o3(ToolbarWidgetWrapper toolbarWidgetWrapper0, int v) {
        this.a = 0;
        this.d = toolbarWidgetWrapper0;
        this.c = v;
        super();
        this.b = false;
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public void onAnimationCancel(View view0) {
        if(this.a != 0) {
            super.onAnimationCancel(view0);
            return;
        }
        this.b = true;
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public final void onAnimationEnd(View view0) {
        if(this.a != 0) {
            int v = this.c + 1;
            this.c = v;
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet0 = (ViewPropertyAnimatorCompatSet)this.d;
            if(v == viewPropertyAnimatorCompatSet0.a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener0 = viewPropertyAnimatorCompatSet0.d;
                if(viewPropertyAnimatorListener0 != null) {
                    viewPropertyAnimatorListener0.onAnimationEnd(null);
                }
                this.c = 0;
                this.b = false;
                viewPropertyAnimatorCompatSet0.e = false;
            }
            return;
        }
        if(!this.b) {
            ((ToolbarWidgetWrapper)this.d).a.setVisibility(this.c);
        }
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public final void onAnimationStart(View view0) {
        if(this.a != 0) {
            if(!this.b) {
                this.b = true;
                ViewPropertyAnimatorListener viewPropertyAnimatorListener0 = ((ViewPropertyAnimatorCompatSet)this.d).d;
                if(viewPropertyAnimatorListener0 != null) {
                    viewPropertyAnimatorListener0.onAnimationStart(null);
                }
            }
            return;
        }
        ((ToolbarWidgetWrapper)this.d).a.setVisibility(0);
    }
}

