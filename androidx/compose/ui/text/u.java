package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public static final u w;

    static {
        u.w = new u(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        Object object1 = ((List)object0).get(0);
        String s = object1 == null ? null : ((String)object1);
        Intrinsics.checkNotNull(s);
        Object object2 = ((List)object0).get(1);
        Saver saver0 = SaversKt.getTextLinkStylesSaver();
        if(Intrinsics.areEqual(object2, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            return new Clickable(s, null, null);
        }
        return object2 == null ? new Clickable(s, null, null) : new Clickable(s, ((TextLinkStyles)saver0.restore(object2)), null);
    }
}

