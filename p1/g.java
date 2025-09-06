package p1;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class g {
    public static final g a;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull Canvas canvas0, boolean z) {
        if(z) {
            canvas0.enableZ();
            return;
        }
        canvas0.disableZ();
    }
}

