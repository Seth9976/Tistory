package e2;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.graphics.ColorKt;
import org.jetbrains.annotations.NotNull;

public final class a {
    public static final a a;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final long a(@NotNull Context context0, @ColorRes int v) {
        return ColorKt.Color(context0.getResources().getColor(v, context0.getTheme()));
    }
}

