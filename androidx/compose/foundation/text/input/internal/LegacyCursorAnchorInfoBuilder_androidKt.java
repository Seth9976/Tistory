package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001Ak\u0010\u0012\u001A\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001A#\u0010\u0017\u001A\u00020\f*\u00020\t2\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Landroid/view/inputmethod/CursorAnchorInfo;", "build", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;", "", "x", "y", "containsInclusive", "(Landroidx/compose/ui/geometry/Rect;FF)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LegacyCursorAnchorInfoBuilder_androidKt {
    @NotNull
    public static final CursorAnchorInfo build(@NotNull CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, @NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Matrix matrix0, @NotNull Rect rect0, @NotNull Rect rect1, boolean z, boolean z1, boolean z2, boolean z3) {
        cursorAnchorInfo$Builder0.reset();
        cursorAnchorInfo$Builder0.setMatrix(matrix0);
        int v = TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE());
        cursorAnchorInfo$Builder0.setSelectionRange(v, TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()));
        if(z && v >= 0) {
            int v1 = offsetMapping0.originalToTransformed(v);
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
        if(z1) {
            TextRange textRange0 = textFieldValue0.getComposition-MzsxiRA();
            int v3 = -1;
            int v4 = textRange0 == null ? -1 : TextRange.getMin-impl(textRange0.unbox-impl());
            TextRange textRange1 = textFieldValue0.getComposition-MzsxiRA();
            if(textRange1 != null) {
                v3 = TextRange.getMax-impl(textRange1.unbox-impl());
            }
            if(v4 >= 0 && v4 < v3) {
                cursorAnchorInfo$Builder0.setComposingText(v4, textFieldValue0.getText().subSequence(v4, v3));
                int v5 = offsetMapping0.originalToTransformed(v4);
                int v6 = offsetMapping0.originalToTransformed(v3);
                float[] arr_f = new float[(v6 - v5) * 4];
                textLayoutResult0.getMultiParagraph().fillBoundingBoxes-8ffj60Q(TextRangeKt.TextRange(v5, v6), arr_f, 0);
                for(int v7 = v4; v7 < v3; ++v7) {
                    int v8 = offsetMapping0.originalToTransformed(v7);
                    int v9 = (v8 - v5) * 4;
                    Rect rect3 = new Rect(arr_f[v9], arr_f[v9 + 1], arr_f[v9 + 2], arr_f[v9 + 3]);
                    boolean z7 = rect0.overlaps(rect3);
                    if(!LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect0, rect3.getLeft(), rect3.getTop()) || !LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect0, rect3.getRight(), rect3.getBottom())) {
                        z7 |= 2;
                    }
                    int v10 = textLayoutResult0.getBidiRunDirection(v8) == ResolvedTextDirection.Rtl ? z7 | 4 : z7;
                    cursorAnchorInfo$Builder0.addCharacterBounds(v7, rect3.getLeft(), rect3.getTop(), rect3.getRight(), rect3.getBottom(), v10);
                }
            }
        }
        int v11 = Build.VERSION.SDK_INT;
        if(v11 >= 33 && z2) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(cursorAnchorInfo$Builder0, rect1);
        }
        if(v11 >= 34 && z3) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(cursorAnchorInfo$Builder0, textLayoutResult0, rect0);
        }
        return cursorAnchorInfo$Builder0.build();
    }

    public static CursorAnchorInfo build$default(CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0, TextLayoutResult textLayoutResult0, Matrix matrix0, Rect rect0, Rect rect1, boolean z, boolean z1, boolean z2, boolean z3, int v, Object object0) {
        boolean z4 = (v & 0x40) == 0 ? z : true;
        boolean z5 = (v & 0x80) == 0 ? z1 : true;
        boolean z6 = (v & 0x100) == 0 ? z2 : true;
        return (v & 0x200) == 0 ? LegacyCursorAnchorInfoBuilder_androidKt.build(cursorAnchorInfo$Builder0, textFieldValue0, offsetMapping0, textLayoutResult0, matrix0, rect0, rect1, z4, z5, z6, z3) : LegacyCursorAnchorInfoBuilder_androidKt.build(cursorAnchorInfo$Builder0, textFieldValue0, offsetMapping0, textLayoutResult0, matrix0, rect0, rect1, z4, z5, z6, true);
    }

    public static final boolean containsInclusive(@NotNull Rect rect0, float f, float f1) {
        return f <= rect0.getRight() && rect0.getLeft() <= f && (f1 <= rect0.getBottom() && rect0.getTop() <= f1);
    }
}

