package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import kotlin.jvm.internal.Intrinsics;

public final class n implements SelectionAdjustment {
    public final int a;

    public n(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionAdjustment
    public final Selection adjust(SelectionLayout selectionLayout0) {
        AnchorInfo selection$AnchorInfo3;
        AnchorInfo selection$AnchorInfo2;
        AnchorInfo selection$AnchorInfo1;
        AnchorInfo selection$AnchorInfo0;
        switch(this.a) {
            case 0: {
                AnchorInfo selection$AnchorInfo4 = selectionLayout0.getStartInfo().anchorForOffset(selectionLayout0.getStartInfo().getRawStartHandleOffset());
                AnchorInfo selection$AnchorInfo5 = selectionLayout0.getEndInfo().anchorForOffset(selectionLayout0.getEndInfo().getRawEndHandleOffset());
                return selectionLayout0.getCrossStatus() == CrossStatus.CROSSED ? new Selection(selection$AnchorInfo4, selection$AnchorInfo5, true) : new Selection(selection$AnchorInfo4, selection$AnchorInfo5, false);
            }
            case 1: {
                AnchorInfo selection$AnchorInfo6 = selectionLayout0.getStartInfo().anchorForOffset(selectionLayout0.getStartInfo().getRawStartHandleOffset());
                AnchorInfo selection$AnchorInfo7 = selectionLayout0.getEndInfo().anchorForOffset(selectionLayout0.getEndInfo().getRawEndHandleOffset());
                return selectionLayout0.getCrossStatus() == CrossStatus.CROSSED ? SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(selection$AnchorInfo6, selection$AnchorInfo7, true), selectionLayout0) : SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(selection$AnchorInfo6, selection$AnchorInfo7, false), selectionLayout0);
            }
            case 2: {
                return SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout0, (/* 缺少Lambda参数 */, SelectableInfo selectableInfo0) -> selectableInfo0.getTextLayoutResult().getWordBoundary--jx7JFs(v));
            }
            case 3: {
                return SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout0, (/* 缺少Lambda参数 */, SelectableInfo selectableInfo0) -> StringHelpersKt.getParagraphBoundary(selectableInfo0.getInputText(), v));
            }
            default: {
                Selection selection0 = selectionLayout0.getPreviousSelection();
                if(selection0 == null) {
                    return SelectionAdjustmentKt.access$adjustToBoundaries(selectionLayout0, (/* 缺少Lambda参数 */, SelectableInfo selectableInfo0) -> selectableInfo0.getTextLayoutResult().getWordBoundary--jx7JFs(v));
                }
                if(selectionLayout0.isStartHandle()) {
                    selection$AnchorInfo0 = selection0.getStart();
                    selection$AnchorInfo1 = SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout0, selectionLayout0.getStartInfo(), selection$AnchorInfo0);
                    selection$AnchorInfo2 = selection0.getEnd();
                    selection$AnchorInfo3 = selection$AnchorInfo1;
                }
                else {
                    selection$AnchorInfo0 = selection0.getEnd();
                    selection$AnchorInfo1 = SelectionAdjustmentKt.access$updateSelectionBoundary(selectionLayout0, selectionLayout0.getEndInfo(), selection$AnchorInfo0);
                    selection$AnchorInfo3 = selection0.getStart();
                    selection$AnchorInfo2 = selection$AnchorInfo1;
                }
                if(!Intrinsics.areEqual(selection$AnchorInfo1, selection$AnchorInfo0)) {
                    return selectionLayout0.getCrossStatus() == CrossStatus.CROSSED || selectionLayout0.getCrossStatus() == CrossStatus.COLLAPSED && selection$AnchorInfo3.getOffset() > selection$AnchorInfo2.getOffset() ? SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(selection$AnchorInfo3, selection$AnchorInfo2, true), selectionLayout0) : SelectionAdjustmentKt.ensureAtLeastOneChar(new Selection(selection$AnchorInfo3, selection$AnchorInfo2, false), selectionLayout0);
                }
                return selection0;
            }
        }
    }
}

