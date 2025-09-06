package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

public final class v1 implements Runnable {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public v1(int v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = v;
        this.b = arrayList0;
        this.c = arrayList1;
        this.d = arrayList2;
        this.e = arrayList3;
    }

    @Override
    public final void run() {
        for(int v = 0; v < this.a; ++v) {
            ViewCompat.setTransitionName(((View)this.b.get(v)), ((String)this.c.get(v)));
            ViewCompat.setTransitionName(((View)this.d.get(v)), ((String)this.e.get(v)));
        }
    }
}

