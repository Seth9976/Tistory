package androidx.appcompat.widget;

import android.view.View;

public final class h implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public h(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            int v = ((View)this.b).getLeft();
            int v1 = ((ScrollingTabContainerView)this.c).getWidth();
            int v2 = ((View)this.b).getWidth();
            ((ScrollingTabContainerView)this.c).smoothScrollTo(v - (v1 - v2) / 2, 0);
            ((ScrollingTabContainerView)this.c).a = null;
            return;
        }
        o o0 = (o)this.c;
        if(o0.mMenu != null) {
            o0.mMenu.changeMenuMode();
        }
        View view0 = (View)o0.mMenuView;
        if(view0 != null && view0.getWindowToken() != null) {
            k k0 = (k)this.b;
            if(k0.tryShow()) {
                o0.o = k0;
            }
        }
        o0.q = null;
    }
}

