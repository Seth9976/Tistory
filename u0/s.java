package u0;

import android.graphics.drawable.RippleDrawable;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class s {
    public static final s a;

    static {
        s.a = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull RippleDrawable rippleDrawable0, int v) {
        rippleDrawable0.setRadius(v);
    }
}

