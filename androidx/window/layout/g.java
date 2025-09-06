package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public static final g w;

    static {
        g.w = new g(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    public final Boolean a(SidecarDisplayFeature sidecarDisplayFeature0) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature0, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature0.getType() != 1 || sidecarDisplayFeature0.getRect().width() == 0 || sidecarDisplayFeature0.getRect().height() == 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a(((SidecarDisplayFeature)object0));
    }
}

