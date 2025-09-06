package androidx.recyclerview.widget;

import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

public final class n implements Runnable {
    public final ArrayList a;
    public final DefaultItemAnimator b;

    public n(DefaultItemAnimator defaultItemAnimator0, ArrayList arrayList0) {
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
            defaultItemAnimator0.getClass();
            ViewPropertyAnimator viewPropertyAnimator0 = ((ViewHolder)object0).itemView.animate();
            defaultItemAnimator0.o.add(((ViewHolder)object0));
            viewPropertyAnimator0.alpha(1.0f).setDuration(defaultItemAnimator0.getAddDuration()).setListener(new p(((ViewHolder)object0).itemView, viewPropertyAnimator0, defaultItemAnimator0, ((ViewHolder)object0))).start();
        }
        arrayList0.clear();
        defaultItemAnimator0.l.remove(arrayList0);
    }
}

