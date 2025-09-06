package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A6\u0010\u000B\u001A\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "previousHandlePosition", "", "selectableId", "", "appendSelectableInfo-Parwq6A", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;Landroidx/compose/ui/text/TextLayoutResult;JJJ)V", "appendSelectableInfo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1#2:336\n*E\n"})
public final class MultiWidgetSelectionDelegateKt {
    public static final Direction a(Direction direction0, Direction direction1, SelectionLayoutBuilder selectionLayoutBuilder0, long v, AnchorInfo selection$AnchorInfo0) {
        if(selection$AnchorInfo0 != null) {
            int v1 = selectionLayoutBuilder0.getSelectableIdOrderingComparator().compare(selection$AnchorInfo0.getSelectableId(), v);
            if(v1 < 0) {
                return Direction.BEFORE == null ? SelectionLayoutKt.resolve2dDirection(direction0, direction1) : Direction.BEFORE;
            }
            Direction direction2 = v1 <= 0 ? Direction.ON : Direction.AFTER;
            return direction2 == null ? SelectionLayoutKt.resolve2dDirection(direction0, direction1) : direction2;
        }
        return SelectionLayoutKt.resolve2dDirection(direction0, direction1);
    }

    public static final void appendSelectableInfo-Parwq6A(@NotNull SelectionLayoutBuilder selectionLayoutBuilder0, @NotNull TextLayoutResult textLayoutResult0, long v, long v1, long v2) {
        int v7;
        int v6;
        Direction direction6;
        Direction direction5;
        Direction direction4;
        Direction direction3;
        Direction direction2;
        Direction direction1;
        Direction direction0;
        Rect rect0 = new Rect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(textLayoutResult0.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(textLayoutResult0.getSize-YbymL2g())));
        if(Offset.getX-impl(v) < rect0.getLeft()) {
            direction0 = Direction.BEFORE;
        }
        else {
            direction0 = Offset.getX-impl(v) > rect0.getRight() ? Direction.AFTER : Direction.ON;
        }
        if(Offset.getY-impl(v) < rect0.getTop()) {
            direction1 = Direction.BEFORE;
        }
        else {
            direction1 = Offset.getY-impl(v) > rect0.getBottom() ? Direction.AFTER : Direction.ON;
        }
        if(selectionLayoutBuilder0.isStartHandle()) {
            Selection selection0 = selectionLayoutBuilder0.getPreviousSelection();
            direction2 = MultiWidgetSelectionDelegateKt.a(direction0, direction1, selectionLayoutBuilder0, v2, (selection0 == null ? null : selection0.getEnd()));
            direction3 = direction1;
            direction4 = direction0;
            direction5 = direction2;
            direction6 = direction5;
        }
        else {
            Selection selection1 = selectionLayoutBuilder0.getPreviousSelection();
            direction2 = MultiWidgetSelectionDelegateKt.a(direction0, direction1, selectionLayoutBuilder0, v2, (selection1 == null ? null : selection1.getStart()));
            direction6 = direction1;
            direction5 = direction0;
            direction4 = direction2;
            direction3 = direction4;
        }
        Direction direction7 = SelectionLayoutKt.resolve2dDirection(direction0, direction1);
        if(direction7 != Direction.ON && direction7 == direction2) {
            return;
        }
        int v3 = textLayoutResult0.getLayoutInput().getText().length();
        if(selectionLayoutBuilder0.isStartHandle()) {
            int v4 = MultiWidgetSelectionDelegateKt.b(v, textLayoutResult0);
            Selection selection2 = selectionLayoutBuilder0.getPreviousSelection();
            if(selection2 == null) {
                v3 = v4;
            }
            else {
                AnchorInfo selection$AnchorInfo0 = selection2.getEnd();
                if(selection$AnchorInfo0 == null) {
                    v3 = v4;
                }
                else {
                    int v5 = selectionLayoutBuilder0.getSelectableIdOrderingComparator().compare(selection$AnchorInfo0.getSelectableId(), v2);
                    if(v5 < 0) {
                        v3 = 0;
                    }
                    else if(v5 <= 0) {
                        v3 = selection$AnchorInfo0.getOffset();
                    }
                }
            }
            v6 = v4;
            v7 = v3;
        }
        else {
            int v8 = MultiWidgetSelectionDelegateKt.b(v, textLayoutResult0);
            Selection selection3 = selectionLayoutBuilder0.getPreviousSelection();
            if(selection3 == null) {
                v3 = v8;
            }
            else {
                AnchorInfo selection$AnchorInfo1 = selection3.getStart();
                if(selection$AnchorInfo1 == null) {
                    v3 = v8;
                }
                else {
                    int v9 = selectionLayoutBuilder0.getSelectableIdOrderingComparator().compare(selection$AnchorInfo1.getSelectableId(), v2);
                    if(v9 < 0) {
                        v3 = 0;
                    }
                    else if(v9 <= 0) {
                        v3 = selection$AnchorInfo1.getOffset();
                    }
                }
            }
            v7 = v8;
            v6 = v3;
        }
        selectionLayoutBuilder0.appendInfo(v2, v6, direction4, direction3, v7, direction5, direction6, (OffsetKt.isUnspecified-k-4lQ0M(v1) ? -1 : MultiWidgetSelectionDelegateKt.b(v1, textLayoutResult0)), textLayoutResult0);
    }

    public static final int b(long v, TextLayoutResult textLayoutResult0) {
        if(Offset.getY-impl(v) <= 0.0f) {
            return 0;
        }
        return Offset.getY-impl(v) >= textLayoutResult0.getMultiParagraph().getHeight() ? textLayoutResult0.getLayoutInput().getText().length() : textLayoutResult0.getOffsetForPosition-k-4lQ0M(v);
    }
}

