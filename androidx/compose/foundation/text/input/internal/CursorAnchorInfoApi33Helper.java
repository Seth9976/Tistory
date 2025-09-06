package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import m0.q;
import org.jetbrains.annotations.NotNull;

@RequiresApi(33)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoApi33Helper;", "", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroidx/compose/ui/geometry/Rect;", "decorationBoxBounds", "setEditorBoundsInfo", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CursorAnchorInfoApi33Helper {
    public static final int $stable;
    @NotNull
    public static final CursorAnchorInfoApi33Helper INSTANCE;

    static {
        CursorAnchorInfoApi33Helper.INSTANCE = new CursorAnchorInfoApi33Helper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @JvmStatic
    @NotNull
    public static final CursorAnchorInfo.Builder setEditorBoundsInfo(@NotNull CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, @NotNull Rect rect0) {
        return q.e(cursorAnchorInfo$Builder0, q.h(q.k(q.g(q.f(), RectHelper_androidKt.toAndroidRectF(rect0)), RectHelper_androidKt.toAndroidRectF(rect0))));
    }
}

