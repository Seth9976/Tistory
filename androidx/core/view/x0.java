package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class x0 extends FunctionReferenceImpl implements Function1 {
    public static final x0 a;

    static {
        x0.a = new x0(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((ViewParent)object0).getParent();
    }
}

