package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function1 {
    public final int w;
    public static final l0 x;
    public static final l0 y;

    static {
        l0.x = new l0(1, 0);
        l0.y = new l0(1, 1);
    }

    public l0(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((View)object0), "it");
            ViewParent viewParent0 = ((View)object0).getParent();
            return viewParent0 instanceof View ? ((View)viewParent0) : null;
        }
        Intrinsics.checkNotNullParameter(((View)object0), "it");
        ViewParent viewParent1 = ((View)object0).getParent();
        return viewParent1 instanceof View ? ((View)viewParent1) : null;
    }
}

