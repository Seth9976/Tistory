package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class wf extends Lambda implements Function1 {
    public static final wf w;

    static {
        wf.w = new wf(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DrawerValue drawerValue0 = (DrawerValue)object0;
        return true;
    }
}

