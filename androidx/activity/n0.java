package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function1 {
    public static final n0 w;

    static {
        n0.w = new n0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((View)object0), "it");
        Object object1 = ((View)object0).getTag(id.view_tree_on_back_pressed_dispatcher_owner);
        return object1 instanceof OnBackPressedDispatcherOwner ? ((OnBackPressedDispatcherOwner)object1) : null;
    }
}

