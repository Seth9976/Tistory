package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001A-\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001A$\u0010\n\u001A\u00020\u000B*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0007H\u0000¨\u0006\f"}, d2 = {"getSelectionHandleCoordinates", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "offset", "", "isStart", "", "areHandlesCrossed", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "getHorizontalPosition", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextSelectionDelegateKt {
    // 去混淆评级： 低(40)
    public static final float getHorizontalPosition(@NotNull TextLayoutResult textLayoutResult0, int v, boolean z, boolean z1) {
        return textLayoutResult0.getHorizontalPosition(v, textLayoutResult0.getBidiRunDirection(((!z || z1) && (z || !z1) ? Math.max(v - 1, 0) : v)) == textLayoutResult0.getParagraphDirection(v));
    }

    public static final long getSelectionHandleCoordinates(@NotNull TextLayoutResult textLayoutResult0, int v, boolean z, boolean z1) {
        int v1 = textLayoutResult0.getLineForOffset(v);
        return v1 < textLayoutResult0.getLineCount() ? OffsetKt.Offset(c.coerceIn(TextSelectionDelegateKt.getHorizontalPosition(textLayoutResult0, v, z, z1), 0.0f, IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g())), c.coerceIn(textLayoutResult0.getLineBottom(v1), 0.0f, IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g()))) : 0x7FC000007FC00000L;
    }
}

