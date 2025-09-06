package n0;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class q extends Lambda implements Function1 {
    public final LongRef A;
    public final LongRef w;
    public final TextFieldSelectionState x;
    public final boolean y;
    public final Handle z;

    public q(Handle handle0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef0, LongRef ref$LongRef1, boolean z) {
        this.w = ref$LongRef0;
        this.x = textFieldSelectionState0;
        this.y = z;
        this.z = handle0;
        this.A = ref$LongRef1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = SelectionHandlesKt.getAdjustedCoordinates-k-4lQ0M(this.x.c(this.y));
        this.w.element = v;
        this.x.updateHandleDragging-Uv8p0NA(this.z, v);
        this.A.element = 0L;
        this.x.t = -1;
        return Unit.INSTANCE;
    }
}

