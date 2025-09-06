package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import kotlin.jvm.functions.Function1;

public final class s1 implements SelectionLayout {
    public final boolean a;
    public final int b;
    public final int c;
    public final Selection d;
    public final SelectableInfo e;

    static {
    }

    public s1(boolean z, int v, int v1, Selection selection0, SelectableInfo selectableInfo0) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = selection0;
        this.e = selectableInfo0;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final LongObjectMap createSubSelections(Selection selection0) {
        if(!selection0.getHandlesCrossed() && selection0.getStart().getOffset() > selection0.getEnd().getOffset() || selection0.getHandlesCrossed() && selection0.getStart().getOffset() <= selection0.getEnd().getOffset()) {
            selection0 = Selection.copy$default(selection0, null, null, !selection0.getHandlesCrossed(), 3, null);
        }
        return LongObjectMapKt.longObjectMapOf(this.e.getSelectableId(), selection0);
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final void forEachMiddleInfo(Function1 function10) {
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final CrossStatus getCrossStatus() {
        int v = this.b;
        int v1 = this.c;
        if(v < v1) {
            return CrossStatus.NOT_CROSSED;
        }
        return v <= v1 ? this.e.getRawCrossStatus() : CrossStatus.CROSSED;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getCurrentInfo() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getEndInfo() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getEndSlot() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getFirstInfo() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getLastInfo() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final Selection getPreviousSelection() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getSize() {
        return 1;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final SelectableInfo getStartInfo() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final int getStartSlot() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean isStartHandle() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.text.selection.SelectionLayout
    public final boolean shouldRecomputeSelection(SelectionLayout selectionLayout0) {
        return this.d == null || selectionLayout0 == null || !(selectionLayout0 instanceof s1) || this.b != ((s1)selectionLayout0).b || this.c != ((s1)selectionLayout0).c || this.a != ((s1)selectionLayout0).a || this.e.shouldRecomputeSelection(((s1)selectionLayout0).e);
    }

    @Override
    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + this.getCrossStatus() + ", info=\n\t" + this.e + ')';
    }
}

