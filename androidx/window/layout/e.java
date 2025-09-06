package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public static final e w;

    static {
        e.w = new e(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    public final Boolean a(SidecarDisplayFeature sidecarDisplayFeature0) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeature0, "$this$require");
        boolean z = true;
        switch(sidecarDisplayFeature0.getType()) {
            case 1: 
            case 2: {
                break;
            }
            default: {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return this.a(((SidecarDisplayFeature)object0));
    }
}

