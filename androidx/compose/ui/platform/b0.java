package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

public final class b0 {
    public static final b0 a;

    static {
        b0.a = new b0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(23)
    public final void a(@NotNull ViewStructure viewStructure0, @NotNull View view0) {
        viewStructure0.setClassName(view0.getAccessibilityClassName().toString());
    }
}

