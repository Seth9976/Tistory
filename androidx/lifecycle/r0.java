package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final int w;
    public static final r0 x;
    public static final r0 y;

    static {
        r0.x = new r0(1, 0);
        r0.y = new r0(1, 1);
    }

    public r0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((View)object0), "view");
            ViewParent viewParent0 = ((View)object0).getParent();
            return viewParent0 instanceof View ? ((View)viewParent0) : null;
        }
        Intrinsics.checkNotNullParameter(((View)object0), "currentView");
        ViewParent viewParent1 = ((View)object0).getParent();
        return viewParent1 instanceof View ? ((View)viewParent1) : null;
    }
}

