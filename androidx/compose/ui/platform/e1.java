package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;
import s1.c;

public final class e1 {
    public static final e1 a;

    static {
        e1.a = new e1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final boolean a(@NotNull MotionEvent motionEvent0, int v) {
        float f = c.a(motionEvent0, v);
        if(!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f1 = c.w(motionEvent0, v);
            return !Float.isInfinite(f1) && !Float.isNaN(f1);
        }
        return false;
    }
}

