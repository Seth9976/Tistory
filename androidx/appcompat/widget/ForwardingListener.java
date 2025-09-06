package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public abstract class ForwardingListener implements View.OnAttachStateChangeListener, View.OnTouchListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public t1 e;
    public t1 f;
    public boolean g;
    public int h;
    public final int[] i;

    public ForwardingListener(View view0) {
        this.i = new int[2];
        this.d = view0;
        view0.setLongClickable(true);
        view0.addOnAttachStateChangeListener(this);
        this.a = (float)ViewConfiguration.get(view0.getContext()).getScaledTouchSlop();
        this.b = 100;
        this.c = (ViewConfiguration.getLongPressTimeout() + 100) / 2;
    }

    public final void a() {
        t1 t10 = this.f;
        View view0 = this.d;
        if(t10 != null) {
            view0.removeCallbacks(t10);
        }
        t1 t11 = this.e;
        if(t11 != null) {
            view0.removeCallbacks(t11);
        }
    }

    public abstract ShowableListMenu getPopup();

    public boolean onForwardingStarted() {
        ShowableListMenu showableListMenu0 = this.getPopup();
        if(showableListMenu0 != null && !showableListMenu0.isShowing()) {
            showableListMenu0.show();
        }
        return true;
    }

    public boolean onForwardingStopped() {
        ShowableListMenu showableListMenu0 = this.getPopup();
        if(showableListMenu0 != null && showableListMenu0.isShowing()) {
            showableListMenu0.dismiss();
        }
        return true;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        boolean z3;
        boolean z2;
        boolean z = this.g;
        View view1 = this.d;
        if(z) {
            ShowableListMenu showableListMenu0 = this.getPopup();
            if(showableListMenu0 == null || !showableListMenu0.isShowing()) {
                z3 = this.onForwardingStopped() ? false : true;
            }
            else {
                s1 s10 = (s1)showableListMenu0.getListView();
                if(s10 != null && s10.isShown()) {
                    MotionEvent motionEvent1 = MotionEvent.obtainNoHistory(motionEvent0);
                    view1.getLocationOnScreen(this.i);
                    motionEvent1.offsetLocation(((float)this.i[0]), ((float)this.i[1]));
                    s10.getLocationOnScreen(this.i);
                    motionEvent1.offsetLocation(((float)(-this.i[0])), ((float)(-this.i[1])));
                    boolean z1 = s10.onForwardedEvent(motionEvent1, this.h);
                    motionEvent1.recycle();
                    switch(motionEvent0.getActionMasked()) {
                        case 1: 
                        case 3: {
                            z2 = false;
                            break;
                        }
                        default: {
                            z2 = true;
                        }
                    }
                    if(z1 && z2) {
                        z3 = true;
                        this.g = z3;
                        return z3 || z;
                    }
                }
                z3 = this.onForwardingStopped() ? false : true;
                this.g = z3;
                return z3 || z;
            }
        }
        else {
            if(view1.isEnabled()) {
                switch(motionEvent0.getActionMasked()) {
                    case 0: {
                        this.h = motionEvent0.getPointerId(0);
                        if(this.e == null) {
                            this.e = new t1(this, 0);
                        }
                        view1.postDelayed(this.e, ((long)this.b));
                        if(this.f == null) {
                            this.f = new t1(this, 1);
                        }
                        view1.postDelayed(this.f, ((long)this.c));
                        z3 = false;
                        break;
                    }
                    case 2: {
                        int v = motionEvent0.findPointerIndex(this.h);
                        if(v >= 0) {
                            float f = motionEvent0.getX(v);
                            float f1 = motionEvent0.getY(v);
                            if(f >= -this.a && f1 >= -this.a && f < ((float)(view1.getRight() - view1.getLeft())) + this.a && f1 < ((float)(view1.getBottom() - view1.getTop())) + this.a) {
                                z3 = false;
                            }
                            else {
                                this.a();
                                view1.getParent().requestDisallowInterceptTouchEvent(true);
                                z3 = this.onForwardingStarted();
                            }
                        }
                        else {
                            z3 = false;
                        }
                        break;
                    }
                    case 1: 
                    case 3: {
                        this.a();
                        z3 = false;
                        break;
                    }
                    default: {
                        z3 = false;
                    }
                }
            }
            else {
                z3 = false;
            }
            if(z3) {
                long v1 = SystemClock.uptimeMillis();
                MotionEvent motionEvent2 = MotionEvent.obtain(v1, v1, 3, 0.0f, 0.0f, 0);
                view1.onTouchEvent(motionEvent2);
                motionEvent2.recycle();
            }
        }
        this.g = z3;
        return z3 || z;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view0) {
        this.g = false;
        this.h = -1;
        t1 t10 = this.e;
        if(t10 != null) {
            this.d.removeCallbacks(t10);
        }
    }
}

