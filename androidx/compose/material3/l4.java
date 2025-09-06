package androidx.compose.material3;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.graphics.ColorKt;
import org.jetbrains.annotations.NotNull;

public final class l4 {
    public static final l4 a;

    static {
        l4.a = new l4();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final long a(@NotNull Context context0, @ColorRes int v) {
        return ColorKt.Color(context0.getResources().getColor(v, context0.getTheme()));
    }
}

