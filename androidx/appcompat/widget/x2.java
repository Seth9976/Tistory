package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class x2 extends TouchDelegate {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public x2(View view0, Rect rect0, Rect rect1) {
        super(rect0, view0);
        int v = ViewConfiguration.get(view0.getContext()).getScaledTouchSlop();
        this.e = v;
        Rect rect2 = new Rect();
        this.b = rect2;
        Rect rect3 = new Rect();
        this.d = rect3;
        Rect rect4 = new Rect();
        this.c = rect4;
        rect2.set(rect0);
        rect3.set(rect0);
        rect3.inset(-v, -v);
        rect4.set(rect1);
        this.a = view0;
    }

    @Override  // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        boolean z1;
        int v = (int)motionEvent0.getX();
        int v1 = (int)motionEvent0.getY();
        int v2 = motionEvent0.getAction();
        boolean z = true;
        switch(v2) {
            case 0: {
                if(this.b.contains(v, v1)) {
                    this.f = true;
                    z2 = true;
                }
                else {
                    z2 = true;
                    z = false;
                }
                break;
            }
            case 1: 
            case 2: {
                z1 = this.f;
                if(!z1 || this.d.contains(v, v1)) {
                    z = z1;
                    z2 = true;
                }
                else {
                    z2 = false;
                }
                break;
            }
            default: {
                if(v2 == 3) {
                    z1 = this.f;
                    this.f = false;
                    z = z1;
                    z2 = true;
                }
                else {
                    z2 = true;
                    z = false;
                }
            }
        }
        if(z) {
            Rect rect0 = this.c;
            View view0 = this.a;
            if(z2 && !rect0.contains(v, v1)) {
                motionEvent0.setLocation(((float)(view0.getWidth() / 2)), ((float)(view0.getHeight() / 2)));
                return view0.dispatchTouchEvent(motionEvent0);
            }
            motionEvent0.setLocation(((float)(v - rect0.left)), ((float)(v1 - rect0.top)));
            return view0.dispatchTouchEvent(motionEvent0);
        }
        return false;
    }
}

