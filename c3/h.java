package c3;

import android.view.View;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import com.google.android.material.sidesheet.SideSheetBehavior;
import g3.v;

public final class h implements Runnable {
    public final int a;
    public final int b;
    public final Object c;

    public h(Object object0, int v, int v1) {
        this.a = v1;
        this.c = object0;
        this.b = v;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                ((FontCallback)this.c).onFontRetrievalFailed(this.b);
                return;
            }
            case 1: {
                SideSheetBehavior sideSheetBehavior0 = (SideSheetBehavior)this.c;
                View view0 = (View)sideSheetBehavior0.E.get();
                if(view0 != null) {
                    sideSheetBehavior0.c(view0, this.b, false);
                }
                return;
            }
            default: {
                boolean z = ((v)this.c).a == null;
            }
        }
    }
}

