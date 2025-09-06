package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public static final h w;

    static {
        h.w = new h(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    public final Boolean a(SidecarDisplayFeature sidecarDisplayFeature0) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature0, "$this$require");
        return sidecarDisplayFeature0.getRect().left == 0 || sidecarDisplayFeature0.getRect().top == 0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a(((SidecarDisplayFeature)object0));
    }
}

