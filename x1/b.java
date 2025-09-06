package x1;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.geometry.OffsetKt;
import org.jetbrains.annotations.NotNull;

public final class b {
    public static final b a;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final long a(@NotNull MotionEvent motionEvent0, int v) {
        return OffsetKt.Offset(motionEvent0.getRawX(v), motionEvent0.getRawY(v));
    }
}

