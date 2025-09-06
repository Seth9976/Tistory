package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class a {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final String a() {
        String s = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(s, "getProcessName()");
        return s;
    }
}

