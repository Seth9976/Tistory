package s1;

import android.view.View;
import androidx.annotation.DoNotInline;
import lc.a;
import org.jetbrains.annotations.NotNull;

public final class m {
    public static final m a;

    static {
        m.a = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void a(@NotNull View view0) {
        a.g(view0);
    }

    @DoNotInline
    public final void b(@NotNull View view0, int v) {
        a.h(v, view0);
    }

    @DoNotInline
    public final void c(@NotNull View view0, int v) {
        a.f(v, view0);
    }
}

