package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R.id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function1 {
    public static final t0 w;

    static {
        t0.w = new t0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((View)object0), "view");
        Object object1 = ((View)object0).getTag(id.view_tree_view_model_store_owner);
        return object1 instanceof ViewModelStoreOwner ? ((ViewModelStoreOwner)object1) : null;
    }
}

