package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0011\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001A\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u001CH\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010\"\u001A\u00020!2\u0006\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001A\u00020$2\u0006\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010\'\u001A\u00020$2\u0006\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b\'\u0010&J\u0017\u0010(\u001A\u00020$2\u0006\u0010 \u001A\u00020\u001FH\u0016¢\u0006\u0004\b(\u0010&J\u001D\u0010,\u001A\u00020)2\u0006\u0010 \u001A\u00020\u001FH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u000F\u0010-\u001A\u00020\u001FH\u0016¢\u0006\u0004\b-\u0010.R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00063"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinatesCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "builder", "", "appendSelectableInfoToBuilder", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V", "Landroidx/compose/foundation/text/selection/Selection;", "getSelectAllSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "selection", "", "isStartHandle", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "offset", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "", "getLineLeft", "(I)F", "getLineRight", "getCenterYForOffset", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "()I", "a", "J", "getSelectableId", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 8;
    public final long a;
    public final Function0 b;
    public final Function0 c;
    public TextLayoutResult d;
    public int e;

    public MultiWidgetSelectionDelegate(long v, @NotNull Function0 function00, @NotNull Function0 function01) {
        this.a = v;
        this.b = function00;
        this.c = function01;
        this.e = -1;
    }

    public final int a(TextLayoutResult textLayoutResult0) {
        int v2;
        synchronized(this) {
            if(this.d != textLayoutResult0) {
                if(!textLayoutResult0.getDidOverflowHeight() || textLayoutResult0.getMultiParagraph().getDidExceedMaxLines()) {
                    v2 = textLayoutResult0.getLineCount() - 1;
                }
                else {
                    int v1;
                    for(v1 = c.coerceAtMost(textLayoutResult0.getLineForVerticalPosition(((float)IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g()))), textLayoutResult0.getLineCount() - 1); v1 >= 0 && textLayoutResult0.getLineTop(v1) >= ((float)IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g())); --v1) {
                    }
                    v2 = c.coerceAtLeast(v1, 0);
                }
                this.e = textLayoutResult0.getLineEnd(v2, true);
                this.d = textLayoutResult0;
            }
            return this.e;
        }
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(@NotNull SelectionLayoutBuilder selectionLayoutBuilder0) {
        LayoutCoordinates layoutCoordinates0 = this.getLayoutCoordinates();
        if(layoutCoordinates0 == null) {
            return;
        }
        Object object0 = this.c.invoke();
        if(((TextLayoutResult)object0) == null) {
            return;
        }
        long v = selectionLayoutBuilder0.getContainerCoordinates().localPositionOf-R5De75A(layoutCoordinates0, 0L);
        MultiWidgetSelectionDelegateKt.appendSelectableInfo-Parwq6A(selectionLayoutBuilder0, ((TextLayoutResult)object0), Offset.minus-MK-Hz9U(selectionLayoutBuilder0.getCurrentPosition-F1C5BW0(), v), (OffsetKt.isUnspecified-k-4lQ0M(selectionLayoutBuilder0.getPreviousHandlePosition-F1C5BW0()) ? 0x7FC000007FC00000L : Offset.minus-MK-Hz9U(selectionLayoutBuilder0.getPreviousHandlePosition-F1C5BW0(), v)), this.getSelectableId());
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public Rect getBoundingBox(int v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return Rect.Companion.getZero();
        }
        int v1 = textLayoutResult0.getLayoutInput().getText().length();
        return v1 >= 1 ? textLayoutResult0.getBoundingBox(c.coerceIn(v, 0, v1 - 1)) : Rect.Companion.getZero();
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return -1.0f;
        }
        int v1 = textLayoutResult0.getLineForOffset(v);
        if(v1 >= textLayoutResult0.getLineCount()) {
            return -1.0f;
        }
        float f = textLayoutResult0.getLineTop(v1);
        return (textLayoutResult0.getLineBottom(v1) - f) / 2.0f + f;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public long getHandlePosition-dBAh8RU(@NotNull Selection selection0, boolean z) {
        if(z && selection0.getStart().getSelectableId() != this.getSelectableId() || !z && selection0.getEnd().getSelectableId() != this.getSelectableId()) {
            return 0x7FC000007FC00000L;
        }
        if(this.getLayoutCoordinates() == null) {
            return 0x7FC000007FC00000L;
        }
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return 0x7FC000007FC00000L;
        }
        return z ? TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult0, c.coerceIn(selection0.getStart().getOffset(), 0, this.a(textLayoutResult0)), true, selection0.getHandlesCrossed()) : TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult0, c.coerceIn(selection0.getEnd().getOffset(), 0, this.a(textLayoutResult0)), false, selection0.getHandlesCrossed());
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        return textLayoutResult0 == null ? 0 : this.a(textLayoutResult0);
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)this.b.invoke();
        return layoutCoordinates0 == null || !layoutCoordinates0.isAttached() ? null : layoutCoordinates0;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return -1.0f;
        }
        int v1 = textLayoutResult0.getLineForOffset(v);
        return v1 < textLayoutResult0.getLineCount() ? textLayoutResult0.getLineLeft(v1) : -1.0f;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return -1.0f;
        }
        int v1 = textLayoutResult0.getLineForOffset(v);
        return v1 < textLayoutResult0.getLineCount() ? textLayoutResult0.getLineRight(v1) : -1.0f;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public long getRangeOfLineContaining--jx7JFs(int v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return 0L;
        }
        int v1 = this.a(textLayoutResult0);
        if(v1 < 1) {
            return 0L;
        }
        int v2 = textLayoutResult0.getLineForOffset(c.coerceIn(v, 0, v1 - 1));
        return TextRangeKt.TextRange(textLayoutResult0.getLineStart(v2), textLayoutResult0.getLineEnd(v2, true));
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @Nullable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        if(textLayoutResult0 == null) {
            return null;
        }
        int v = textLayoutResult0.getLayoutInput().getText().length();
        return new Selection(new AnchorInfo(textLayoutResult0.getBidiRunDirection(0), 0, this.getSelectableId()), new AnchorInfo(textLayoutResult0.getBidiRunDirection(Math.max(v - 1, 0)), v, this.getSelectableId()), false);
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.text.selection.Selectable
    @NotNull
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.c.invoke();
        return textLayoutResult0 == null ? new AnnotatedString("", null, null, 6, null) : textLayoutResult0.getLayoutInput().getText();
    }
}

