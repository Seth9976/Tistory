package j2;

import android.view.inputmethod.CursorAnchorInfo.Builder;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import kotlin.jvm.JvmStatic;
import m0.q;
import org.jetbrains.annotations.NotNull;

public abstract class a {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, @NotNull Rect rect0) {
        return q.e(cursorAnchorInfo$Builder0, q.h(q.k(q.g(q.f(), RectHelper_androidKt.toAndroidRectF(rect0)), RectHelper_androidKt.toAndroidRectF(rect0))));
    }
}

