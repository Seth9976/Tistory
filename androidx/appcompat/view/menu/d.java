package androidx.appcompat.view.menu;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.ViewTarget;
import com.google.android.material.textfield.b;

public final class d implements View.OnAttachStateChangeListener {
    public final int a;
    public final Object b;

    public d(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final void a(View view0) {
    }

    private final void b(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        switch(this.a) {
            case 0: 
            case 1: {
                break;
            }
            case 2: {
                Request request1 = ((CustomViewTarget)this.b).getRequest();
                if(request1 != null && request1.isCleared()) {
                    request1.begin();
                }
                break;
            }
            case 3: {
                Request request0 = ((ViewTarget)this.b).getRequest();
                if(request0 != null && request0.isCleared()) {
                    request0.begin();
                }
                return;
            }
            default: {
                b b0 = (b)this.b;
                if(b0.u != null) {
                    AccessibilityManager accessibilityManager0 = b0.t;
                    if(accessibilityManager0 != null && ViewCompat.isAttachedToWindow(b0)) {
                        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager0, b0.u);
                    }
                }
            }
        }
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        switch(this.a) {
            case 0: {
                h h0 = (h)this.b;
                ViewTreeObserver viewTreeObserver0 = h0.y;
                if(viewTreeObserver0 != null) {
                    if(!viewTreeObserver0.isAlive()) {
                        h0.y = view0.getViewTreeObserver();
                    }
                    h0.y.removeGlobalOnLayoutListener(h0.j);
                }
                view0.removeOnAttachStateChangeListener(this);
                return;
            }
            case 1: {
                t t0 = (t)this.b;
                ViewTreeObserver viewTreeObserver1 = t0.p;
                if(viewTreeObserver1 != null) {
                    if(!viewTreeObserver1.isAlive()) {
                        t0.p = view0.getViewTreeObserver();
                    }
                    t0.p.removeGlobalOnLayoutListener(t0.j);
                }
                view0.removeOnAttachStateChangeListener(this);
                return;
            }
            case 2: {
                CustomViewTarget customViewTarget0 = (CustomViewTarget)this.b;
                Request request0 = customViewTarget0.getRequest();
                if(request0 != null) {
                    customViewTarget0.c = true;
                    request0.clear();
                    customViewTarget0.c = false;
                }
                return;
            }
            case 3: {
                ViewTarget viewTarget0 = (ViewTarget)this.b;
                Request request1 = viewTarget0.getRequest();
                if(request1 != null) {
                    viewTarget0.d = true;
                    request1.clear();
                    viewTarget0.d = false;
                }
                return;
            }
            default: {
                b b0 = (b)this.b;
                TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0 = b0.u;
                if(accessibilityManagerCompat$TouchExplorationStateChangeListener0 != null) {
                    AccessibilityManager accessibilityManager0 = b0.t;
                    if(accessibilityManager0 != null) {
                        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager0, accessibilityManagerCompat$TouchExplorationStateChangeListener0);
                    }
                }
            }
        }
    }
}

