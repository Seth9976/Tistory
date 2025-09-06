package j2;

import android.view.inputmethod.CursorAnchorInfo.Builder;
import androidx.annotation.DoNotInline;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public abstract class b {
    @DoNotInline
    @JvmStatic
    @NotNull
    public static final CursorAnchorInfo.Builder a(@NotNull CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Rect rect0) {
        if(!rect0.isEmpty()) {
            int v = textLayoutResult0.getLineForVerticalPosition(rect0.getTop());
            int v1 = textLayoutResult0.getLineForVerticalPosition(rect0.getBottom());
            if(v <= v1) {
                while(true) {
                    cursorAnchorInfo$Builder0.addVisibleLineBounds(textLayoutResult0.getLineLeft(v), textLayoutResult0.getLineTop(v), textLayoutResult0.getLineRight(v), textLayoutResult0.getLineBottom(v));
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

