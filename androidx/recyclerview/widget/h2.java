package androidx.recyclerview.widget;

import android.view.View;

public final class h2 {
    public final ViewBoundsCheck.Callback a;
    public final g2 b;

    public h2(ViewBoundsCheck.Callback viewBoundsCheck$Callback0) {
        this.a = viewBoundsCheck$Callback0;
        g2 g20 = new g2();  // 初始化器: Ljava/lang/Object;-><init>()V
        g20.a = 0;
        this.b = g20;
    }

    public final View a(int v, int v1, int v2, int v3) {
        ViewBoundsCheck.Callback viewBoundsCheck$Callback0 = this.a;
        int v4 = viewBoundsCheck$Callback0.getParentStart();
        int v5 = viewBoundsCheck$Callback0.getParentEnd();
        int v6 = v1 <= v ? -1 : 1;
        View view0 = null;
        while(v != v1) {
            View view1 = viewBoundsCheck$Callback0.getChildAt(v);
            int v7 = viewBoundsCheck$Callback0.getChildStart(view1);
            int v8 = viewBoundsCheck$Callback0.getChildEnd(view1);
            g2 g20 = this.b;
            g20.b = v4;
            g20.c = v5;
            g20.d = v7;
            g20.e = v8;
            if(v2 != 0) {
                g20.a = v2;
                if(g20.a()) {
                    return view1;
                }
            }
            if(v3 != 0) {
                g20.a = v3;
                if(g20.a()) {
                    view0 = view1;
                }
            }
            v += v6;
        }
        return view0;
    }

    public final boolean b(View view0) {
        int v = this.a.getParentStart();
        int v1 = this.a.getParentEnd();
        int v2 = this.a.getChildStart(view0);
        int v3 = this.a.getChildEnd(view0);
        this.b.b = v;
        this.b.c = v1;
        this.b.d = v2;
        this.b.e = v3;
        this.b.a = 0x6003;
        return this.b.a();
    }
}

