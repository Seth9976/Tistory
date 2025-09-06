package androidx.compose.foundation.text.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function0 {
    public final int w;
    public final SelectionManager x;

    public d1(SelectionManager selectionManager0, int v) {
        this.w = v;
        this.x = selectionManager0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.onRelease();
            return Unit.INSTANCE;
        }
        this.x.setShowToolbar$foundation_release(true);
        SelectionManager.access$setDraggingHandle(this.x, null);
        SelectionManager.access$setCurrentDragPosition-_kEHs6E(this.x, null);
        return Unit.INSTANCE;
    }
}

