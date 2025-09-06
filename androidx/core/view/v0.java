package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

public final class v0 extends Lambda implements Function1 {
    public static final v0 w;

    static {
        v0.w = new v0(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ViewGroup viewGroup0 = ((View)object0) instanceof ViewGroup ? ((ViewGroup)(((View)object0))) : null;
        if(viewGroup0 != null) {
            Sequence sequence0 = ViewGroupKt.getChildren(viewGroup0);
            return sequence0 == null ? null : sequence0.iterator();
        }
        return null;
    }
}

