package k2;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

public final class b {
    public static final b a;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final Typeface a(@NotNull Context context0, int v) {
        return context0.getResources().getFont(v);
    }
}

