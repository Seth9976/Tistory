package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001B\u0010\u0003\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\u0006\u001A\u00020\u00058\nX\u008A\u0084\u0002²\u0006\f\u0010\b\u001A\u00020\u00078\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/Selection;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "layout", "ensureAtLeastOneChar", "(Landroidx/compose/foundation/text/selection/Selection;Landroidx/compose/foundation/text/selection/SelectionLayout;)Landroidx/compose/foundation/text/selection/Selection;", "", "currentRawLine", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchorSnappedToWordBoundary", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionAdjustmentKt {
    public static final AnchorInfo a(SelectableInfo selectableInfo0, boolean z, boolean z1, int v, BoundaryFunction boundaryFunction0) {
        int v1 = z1 ? selectableInfo0.getRawStartHandleOffset() : selectableInfo0.getRawEndHandleOffset();
        if(v != selectableInfo0.getSlot()) {
            return selectableInfo0.anchorForOffset(v1);
        }
        long v2 = boundaryFunction0.getBoundary-fzxv0v0(selectableInfo0, v1);
        return (z ^ z1) == 0 ? selectableInfo0.anchorForOffset(TextRange.getEnd-impl(v2)) : selectableInfo0.anchorForOffset(TextRange.getStart-impl(v2));
    }

    public static final Selection access$adjustToBoundaries(SelectionLayout selectionLayout0, BoundaryFunction boundaryFunction0) {
        return selectionLayout0.getCrossStatus() == CrossStatus.CROSSED ? new Selection(SelectionAdjustmentKt.a(selectionLayout0.getStartInfo(), true, true, selectionLayout0.getStartSlot(), boundaryFunction0), SelectionAdjustmentKt.a(selectionLayout0.getEndInfo(), true, false, selectionLayout0.getEndSlot(), boundaryFunction0), true) : new Selection(SelectionAdjustmentKt.a(selectionLayout0.getStartInfo(), false, true, selectionLayout0.getStartSlot(), boundaryFunction0), SelectionAdjustmentKt.a(selectionLayout0.getEndInfo(), false, false, selectionLayout0.getEndSlot(), boundaryFunction0), false);
    }

    public static final AnchorInfo access$snapToWordBoundary(SelectableInfo selectableInfo0, int v, int v1, int v2, boolean z, boolean z1) {
        int v5;
        int v4;
        long v3 = selectableInfo0.getTextLayoutResult().getWordBoundary--jx7JFs(v1);
        if(selectableInfo0.getTextLayoutResult().getLineForOffset(TextRange.getStart-impl(v3)) == v) {
            v4 = TextRange.getStart-impl(v3);
        }
        else {
            v4 = v < selectableInfo0.getTextLayoutResult().getLineCount() ? selectableInfo0.getTextLayoutResult().getLineStart(v) : selectableInfo0.getTextLayoutResult().getLineStart(selectableInfo0.getTextLayoutResult().getLineCount() - 1);
        }
        if(selectableInfo0.getTextLayoutResult().getLineForOffset(TextRange.getEnd-impl(v3)) == v) {
            v5 = TextRange.getEnd-impl(v3);
        }
        else {
            v5 = v < selectableInfo0.getTextLayoutResult().getLineCount() ? TextLayoutResult.getLineEnd$default(selectableInfo0.getTextLayoutResult(), v, false, 2, null) : TextLayoutResult.getLineEnd$default(selectableInfo0.getTextLayoutResult(), selectableInfo0.getTextLayoutResult().getLineCount() - 1, false, 2, null);
        }
        if(v4 == v2) {
            return selectableInfo0.anchorForOffset(v5);
        }
        if(v5 == v2) {
            return selectableInfo0.anchorForOffset(v4);
        }
        if((z ^ z1) != 0) {
            return v1 > v5 ? selectableInfo0.anchorForOffset(v5) : selectableInfo0.anchorForOffset(v4);
        }
        if(v1 >= v4) {
            v4 = v5;
        }
        return selectableInfo0.anchorForOffset(v4);
    }

    public static final AnchorInfo access$updateSelectionBoundary(SelectionLayout selectionLayout0, SelectableInfo selectableInfo0, AnchorInfo selection$AnchorInfo0) {
        int v = selectionLayout0.isStartHandle() ? selectableInfo0.getRawStartHandleOffset() : selectableInfo0.getRawEndHandleOffset();
        if((selectionLayout0.isStartHandle() ? selectionLayout0.getStartSlot() : selectionLayout0.getEndSlot()) != selectableInfo0.getSlot()) {
            return selectableInfo0.anchorForOffset(v);
        }
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, new r(selectableInfo0, v));
        int v1 = selectionLayout0.isStartHandle() ? selectableInfo0.getRawEndHandleOffset() : selectableInfo0.getRawStartHandleOffset();
        Lazy lazy1 = c.lazy(LazyThreadSafetyMode.NONE, new q(selectableInfo0, v, v1, selectionLayout0, lazy0));
        if(selectableInfo0.getSelectableId() != selection$AnchorInfo0.getSelectableId()) {
            return (AnchorInfo)lazy1.getValue();
        }
        int v2 = selectableInfo0.getRawPreviousHandleOffset();
        if(v != v2) {
            int v3 = selectableInfo0.getTextLayoutResult().getLineForOffset(v2);
            if(((Number)lazy0.getValue()).intValue() != v3) {
                return (AnchorInfo)lazy1.getValue();
            }
            int v4 = selection$AnchorInfo0.getOffset();
            long v5 = selectableInfo0.getTextLayoutResult().getWordBoundary--jx7JFs(v4);
            boolean z = selectionLayout0.isStartHandle();
            if(selectableInfo0.getRawPreviousHandleOffset() != -1) {
                if(v == selectableInfo0.getRawPreviousHandleOffset()) {
                    return selectableInfo0.anchorForOffset(v);
                }
                if((z ^ selectableInfo0.getRawCrossStatus() == CrossStatus.CROSSED) != 0) {
                    if(v >= selectableInfo0.getRawPreviousHandleOffset()) {
                        return selectableInfo0.anchorForOffset(v);
                    }
                    return v4 == TextRange.getStart-impl(v5) || v4 == TextRange.getEnd-impl(v5) ? ((AnchorInfo)lazy1.getValue()) : selectableInfo0.anchorForOffset(v);
                }
                if(v <= selectableInfo0.getRawPreviousHandleOffset()) {
                    return selectableInfo0.anchorForOffset(v);
                }
            }
            return v4 == TextRange.getStart-impl(v5) || v4 == TextRange.getEnd-impl(v5) ? ((AnchorInfo)lazy1.getValue()) : selectableInfo0.anchorForOffset(v);
        }
        return selection$AnchorInfo0;
    }

    public static final int access$updateSelectionBoundary$lambda$0(Lazy lazy0) {
        return ((Number)lazy0.getValue()).intValue();
    }

    public static final AnchorInfo b(AnchorInfo selection$AnchorInfo0, SelectableInfo selectableInfo0, int v) {
        return AnchorInfo.copy$default(selection$AnchorInfo0, selectableInfo0.getTextLayoutResult().getBidiRunDirection(v), v, 0L, 4, null);
    }

    @NotNull
    public static final Selection ensureAtLeastOneChar(@NotNull Selection selection0, @NotNull SelectionLayout selectionLayout0) {
        if(!SelectionLayoutKt.isCollapsed(selection0, selectionLayout0)) {
            return selection0;
        }
        String s = selectionLayout0.getCurrentInfo().getInputText();
        if(selectionLayout0.getSize() <= 1 && selectionLayout0.getPreviousSelection() != null && s.length() != 0) {
            SelectableInfo selectableInfo0 = selectionLayout0.getCurrentInfo();
            String s1 = selectableInfo0.getInputText();
            int v = selectableInfo0.getRawStartHandleOffset();
            int v1 = s1.length();
            if(v == 0) {
                int v2 = StringHelpers_androidKt.findFollowingBreak(s1, 0);
                return selectionLayout0.isStartHandle() ? Selection.copy$default(selection0, SelectionAdjustmentKt.b(selection0.getStart(), selectableInfo0, v2), null, true, 2, null) : Selection.copy$default(selection0, null, SelectionAdjustmentKt.b(selection0.getEnd(), selectableInfo0, v2), false, 1, null);
            }
            if(v == v1) {
                int v3 = StringHelpers_androidKt.findPrecedingBreak(s1, v1);
                return selectionLayout0.isStartHandle() ? Selection.copy$default(selection0, SelectionAdjustmentKt.b(selection0.getStart(), selectableInfo0, v3), null, false, 2, null) : Selection.copy$default(selection0, null, SelectionAdjustmentKt.b(selection0.getEnd(), selectableInfo0, v3), true, 1, null);
            }
            Selection selection1 = selectionLayout0.getPreviousSelection();
            boolean z = selection1 != null && selection1.getHandlesCrossed();
            int v4 = (selectionLayout0.isStartHandle() ^ z) == 0 ? StringHelpers_androidKt.findFollowingBreak(s1, v) : StringHelpers_androidKt.findPrecedingBreak(s1, v);
            return selectionLayout0.isStartHandle() ? Selection.copy$default(selection0, SelectionAdjustmentKt.b(selection0.getStart(), selectableInfo0, v4), null, z, 2, null) : Selection.copy$default(selection0, null, SelectionAdjustmentKt.b(selection0.getEnd(), selectableInfo0, v4), z, 1, null);
        }
        return selection0;
    }
}

