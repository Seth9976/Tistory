package androidx.activity;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class f {
    public static final f a;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final OnBackInvokedDispatcher a(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher0 = activity0.getOnBackInvokedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher0, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher0;
    }
}

