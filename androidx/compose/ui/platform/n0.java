package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class n0 {
    public static final n0 a;

    static {
        n0.a = new n0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final float a(@NotNull ViewConfiguration viewConfiguration0) {
        return (float)m0.v(viewConfiguration0);
    }

    @DoNotInline
    public final float b(@NotNull ViewConfiguration viewConfiguration0) {
        return (float)viewConfiguration0.getScaledHandwritingSlop();
    }
}

