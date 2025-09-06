package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

public final class h0 {
    public static final h0 a;

    static {
        h0.a = new h0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final Typeface a(@NotNull Context context0, int v) {
        return context0.getResources().getFont(v);
    }
}

