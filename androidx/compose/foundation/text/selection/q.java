package androidx.compose.foundation.text.selection;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final Lazy A;
    public final SelectableInfo w;
    public final int x;
    public final int y;
    public final SelectionLayout z;

    public q(SelectableInfo selectableInfo0, int v, int v1, SelectionLayout selectionLayout0, Lazy lazy0) {
        this.w = selectableInfo0;
        this.x = v;
        this.y = v1;
        this.z = selectionLayout0;
        this.A = lazy0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = SelectionAdjustmentKt.access$updateSelectionBoundary$lambda$0(this.A);
        boolean z = this.z.isStartHandle();
        return this.z.getCrossStatus() == CrossStatus.CROSSED ? SelectionAdjustmentKt.access$snapToWordBoundary(this.w, v, this.x, this.y, z, true) : SelectionAdjustmentKt.access$snapToWordBoundary(this.w, v, this.x, this.y, z, false);
    }
}

