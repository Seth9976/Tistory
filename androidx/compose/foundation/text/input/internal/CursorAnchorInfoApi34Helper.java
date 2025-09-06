package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.m0;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\'\u0010\b\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoApi34Helper;", "", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "addVisibleLineBounds", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CursorAnchorInfoApi34Helper {
    public static final int $stable;
    @NotNull
    public static final CursorAnchorInfoApi34Helper INSTANCE;

    static {
        CursorAnchorInfoApi34Helper.INSTANCE = new CursorAnchorInfoApi34Helper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @JvmStatic
    @NotNull
    public static final CursorAnchorInfo.Builder addVisibleLineBounds(@NotNull CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Rect rect0) {
        if(!rect0.isEmpty()) {
            int v = textLayoutResult0.getLineForVerticalPosition(rect0.getTop());
            int v1 = textLayoutResult0.getLineForVerticalPosition(rect0.getBottom());
            if(v <= v1) {
                while(true) {
                    m0.l(cursorAnchorInfo$Builder0, textLayoutResult0.getLineLeft(v), textLayoutResult0.getLineTop(v), textLayoutResult0.getLineRight(v), textLayoutResult0.getLineBottom(v));
                    if(v == v1) {
                        break;
                    }
                    ++v;
                }
            }
        }
        return cursorAnchorInfo$Builder0;
    }
}

