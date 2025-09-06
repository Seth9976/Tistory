package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Ax\u0010\u0015\u001A\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\b\u0010\u0005\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "build-vxqZcH0", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "build", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CursorAnchorInfoBuilder_androidKt {
    @NotNull
    public static final CursorAnchorInfo build-vxqZcH0(@NotNull CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, @NotNull CharSequence charSequence0, long v, @Nullable TextRange textRange0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Matrix matrix0, @NotNull Rect rect0, @NotNull Rect rect1, boolean z, boolean z1, boolean z2, boolean z3) {
        cursorAnchorInfo$Builder0.reset();
        cursorAnchorInfo$Builder0.setMatrix(matrix0);
        int v1 = TextRange.getMin-impl(v);
        cursorAnchorInfo$Builder0.setSelectionRange(v1, TextRange.getMax-impl(v));
        if(z && v1 >= 0) {
            Rect rect2 = textLayoutResult0.getCursorRect(v1);
            float f = c.coerceIn(rect2.getLeft(), 0.0f, IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g()));
            boolean z4 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect0, f, rect2.getTop());
            boolean z5 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect0, f, rect2.getBottom());
            int v2 = 1;
            boolean z6 = textLayoutResult0.getBidiRunDirection(v1) == ResolvedTextDirection.Rtl;
            if(!z4 && !z5) {
                v2 = 0;
            }
            if(!z4 || !z5) {
                v2 |= 2;
            }
            cursorAnchorInfo$Builder0.setInsertionMarkerLocation(f, rect2.getTop(), rect2.getBottom(), rect2.getBottom(), (z6 ? v2 | 4 : v2));
        }
        int v3 = -1;
        if(z1) {
            int v4 = textRange0 == null ? -1 : TextRange.getMin-impl(textRange0.unbox-impl());
            if(textRange0 != null) {
                v3 = TextRange.getMax-impl(textRange0.unbox-impl());
            }
            if(v4 >= 0 && v4 < v3) {
                cursorAnchorInfo$Builder0.setComposingText(v4, charSequence0.subSequence(v4, v3));
                float[] arr_f = new float[(v3 - v4) * 4];
                textLayoutResult0.getMultiParagraph().fillBoundingBoxes-8ffj60Q(TextRangeKt.TextRange(v4, v3), arr_f, 0);
                for(int v5 = v4; v5 < v3; ++v5) {
                    int v6 = (v5 - v4) * 4;
                    Rect rect3 = new Rect(arr_f[v6], arr_f[v6 + 1], arr_f[v6 + 2], arr_f[v6 + 3]);
                    boolean z7 = rect0.overlaps(rect3);
                    if(!LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect0, rect3.getLeft(), rect3.getTop()) || !LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect0, rect3.getRight(), rect3.getBottom())) {
                        z7 |= 2;
                    }
                    if(textLayoutResult0.getBidiRunDirection(v5) == ResolvedTextDirection.Rtl) {
                        z7 |= 4;
                    }
                    cursorAnchorInfo$Builder0.addCharacterBounds(v5, rect3.getLeft(), rect3.getTop(), rect3.getRight(), rect3.getBottom(), ((int)z7));
                }
            }
        }
        int v7 = Build.VERSION.SDK_INT;
        if(v7 >= 33 && z2) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(cursorAnchorInfo$Builder0, rect1);
        }
        if(v7 >= 34 && z3) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(cursorAnchorInfo$Builder0, textLayoutResult0, rect0);
        }
        return cursorAnchorInfo$Builder0.build();
    }

    public static CursorAnchorInfo build-vxqZcH0$default(CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, CharSequence charSequence0, long v, TextRange textRange0, TextLayoutResult textLayoutResult0, Matrix matrix0, Rect rect0, Rect rect1, boolean z, boolean z1, boolean z2, boolean z3, int v1, Object object0) {
        boolean z4 = (v1 & 0x80) == 0 ? z : true;
        boolean z5 = (v1 & 0x100) == 0 ? z1 : true;
        boolean z6 = (v1 & 0x200) == 0 ? z2 : true;
        return (v1 & 0x400) == 0 ? CursorAnchorInfoBuilder_androidKt.build-vxqZcH0(cursorAnchorInfo$Builder0, charSequence0, v, textRange0, textLayoutResult0, matrix0, rect0, rect1, z4, z5, z6, z3) : CursorAnchorInfoBuilder_androidKt.build-vxqZcH0(cursorAnchorInfo$Builder0, charSequence0, v, textRange0, textLayoutResult0, matrix0, rect0, rect1, z4, z5, z6, true);
    }
}

