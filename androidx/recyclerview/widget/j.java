package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public final class j {
    public final j1 a;
    public final i b;
    public final ArrayList c;
    public int d;
    public View e;

    public j(j1 j10) {
        this.d = 0;
        this.a = j10;
        this.b = new i();
        this.c = new ArrayList();
    }

    public final void a(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        j1 j10 = this.a;
        int v1 = v >= 0 ? this.d(v) : j10.a.getChildCount();
        this.b.e(v1, z);
        if(z) {
            this.c.add(view0);
            j10.onEnteredHiddenState(view0);
        }
        j10.attachViewToParent(view0, v1, viewGroup$LayoutParams0);
    }

    public final View b(int v) {
        int v1 = this.d(v);
        return this.a.a.getChildAt(v1);
    }

    public final int c() {
        return this.a.a.getChildCount() - this.c.size();
    }

    public final int d(int v) {
        if(v < 0) {
            return -1;
        }
        int v1 = this.a.a.getChildCount();
        for(int v2 = v; v2 < v1; v2 += v3) {
            i i0 = this.b;
            int v3 = v - (v2 - i0.b(v2));
            if(v3 == 0) {
                while(i0.d(v2)) {
                    ++v2;
                }
                return v2;
            }
        }
        return -1;
    }

    public final int e(View view0) {
        int v = this.a.a.indexOfChild(view0);
        if(v == -1) {
            return -1;
        }
        return this.b.d(v) ? -1 : v - this.b.b(v);
    }

    public final void f(int v) {
        j1 j10 = this.a;
        switch(this.d) {
            case 1: {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            case 2: {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            default: {
                try {
                    int v1 = this.d(v);
                    View view0 = j10.a.getChildAt(v1);
                    if(view0 != null) {
                        this.d = 1;
                        this.e = view0;
                        if(this.b.f(v1)) {
                            this.g(view0);
                        }
                        j10.removeViewAt(v1);
                        this.d = 0;
                        this.e = null;
                        return;
                    }
                    this.d = 0;
                    this.e = null;
                    return;
                }
                catch(Throwable throwable0) {
                }
                this.d = 0;
                this.e = null;
                throw throwable0;
            }
        }
    }

    public final void g(View view0) {
        if(this.c.remove(view0)) {
            this.a.onLeftHiddenState(view0);
        }
    }

    // 去混淆评级： 低(40)
    @Override
    public final String toString() {
        return "0, hidden list:" + this.c.size();
    }
}

