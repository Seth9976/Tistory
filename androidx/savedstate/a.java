package androidx.savedstate;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((View)object0), "view");
        Object object1 = ((View)object0).getTag(id.view_tree_saved_state_registry_owner);
        return object1 instanceof SavedStateRegistryOwner ? ((SavedStateRegistryOwner)object1) : null;
    }
}

