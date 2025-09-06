package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public abstract class k {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull Paint paint0, @NotNull CharSequence charSequence0, int v, int v1, @NotNull Rect rect0) {
        paint0.getTextBounds(charSequence0, v, v1, rect0);
    }
}

