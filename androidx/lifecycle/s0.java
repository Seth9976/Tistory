package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R.id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function1 {
    public static final s0 w;

    static {
        s0.w = new s0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((View)object0), "viewParent");
        Object object1 = ((View)object0).getTag(id.view_tree_lifecycle_owner);
        return object1 instanceof LifecycleOwner ? ((LifecycleOwner)object1) : null;
    }
}

