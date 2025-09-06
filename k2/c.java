package k2;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class c {
    public static final c a;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final TypefaceSpan a(@NotNull Typeface typeface0) {
        return new TypefaceSpan(typeface0);
    }
}

