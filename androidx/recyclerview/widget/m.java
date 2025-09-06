package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

public final class m implements Runnable {
    public final ArrayList a;
    public final DefaultItemAnimator b;

    public m(DefaultItemAnimator defaultItemAnimator0, ArrayList arrayList0) {
        this.b = defaultItemAnimator0;
        this.a = arrayList0;
    }

    @Override
    public final void run() {
        DefaultItemAnimator defaultItemAnimator0;
        ArrayList arrayList0 = this.a;
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            defaultItemAnimator0 = this.b;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            ViewHolder recyclerView$ViewHolder0 = ((u)object0).a;
            defaultItemAnimator0.getClass();
            View view0 = recyclerView$ViewHolder0.itemView;
            int v = ((u)object0).d - ((u)object0).b;
            int v1 = ((u)object0).e - ((u)object0).c;
            if(v != 0) {
                view0.animate().translationX(0.0f);
            }
            if(v1 != 0) {
                view0.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimator0 = view0.animate();
            defaultItemAnimator0.p.add(recyclerView$ViewHolder0);
            viewPropertyAnimator0.setDuration(defaultItemAnimator0.getMoveDuration()).setListener(new q(defaultItemAnimator0, recyclerView$ViewHolder0, v, view0, v1, viewPropertyAnimator0)).start();
        }
        arrayList0.clear();
        defaultItemAnimator0.m.remove(arrayList0);
    }
}

