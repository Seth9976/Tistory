package u;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class s {
    public static final s a;

    static {
        s.a = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final EdgeEffect a(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        try {
            return new EdgeEffect(context0, attributeSet0);
        }
        catch(Throwable unused_ex) {
            return new EdgeEffect(context0);
        }
    }

    @DoNotInline
    public final float b(@NotNull EdgeEffect edgeEffect0) {
        try {
            return edgeEffect0.getDistance();
        }
        catch(Throwable unused_ex) {
            return 0.0f;
        }
    }

    @DoNotInline
    public final float c(@NotNull EdgeEffect edgeEffect0, float f, float f1) {
        try {
            return edgeEffect0.onPullDistance(f, f1);
        }
        catch(Throwable unused_ex) {
            edgeEffect0.onPull(f, f1);
            return 0.0f;
        }
    }
}

