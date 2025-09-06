package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function1 {
    public static final m0 w;

    static {
        m0.w = new m0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((View)object0), "it");
        Object object1 = ((View)object0).getTag(id.report_drawn);
        return object1 instanceof FullyDrawnReporterOwner ? ((FullyDrawnReporterOwner)object1) : null;
    }
}

