package androidx.compose.foundation.text.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function1 {
    public final SelectionManager w;

    public e1(SelectionManager selectionManager0) {
        this.w = selectionManager0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((Number)object0).longValue();
        SelectionManager selectionManager0 = this.w;
        Selection selection0 = selectionManager0.getSelection();
        if(selection0 != null) {
            AnchorInfo selection$AnchorInfo0 = selection0.getStart();
            if(selection$AnchorInfo0 != null && v == selection$AnchorInfo0.getSelectableId()) {
                SelectionManager.access$setStartHandlePosition-_kEHs6E(selectionManager0, null);
            }
        }
        Selection selection1 = selectionManager0.getSelection();
        if(selection1 != null) {
            AnchorInfo selection$AnchorInfo1 = selection1.getEnd();
            if(selection$AnchorInfo1 != null && v == selection$AnchorInfo1.getSelectableId()) {
                SelectionManager.access$setEndHandlePosition-_kEHs6E(selectionManager0, null);
            }
        }
        if(selectionManager0.a.getSubselections().contains(v)) {
            selectionManager0.b();
        }
        return Unit.INSTANCE;
    }
}

