package o2;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.text.font.ResourceFont;
import org.jetbrains.annotations.NotNull;

public final class g {
    public static final g a;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final Typeface a(@NotNull Context context0, @NotNull ResourceFont resourceFont0) {
        return context0.getResources().getFont(resourceFont0.getResId());
    }
}

