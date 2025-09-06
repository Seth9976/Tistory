package p0;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class o8 extends Lambda implements Function1 {
    public final Function1 A;
    public final Function0 B;
    public final boolean w;
    public final ClosedFloatingPointRange x;
    public final int y;
    public final float z;

    public o8(boolean z, ClosedFloatingPointRange closedFloatingPointRange0, int v, float f, Function1 function10, Function0 function00) {
        this.w = z;
        this.x = closedFloatingPointRange0;
        this.y = v;
        this.z = f;
        this.A = function10;
        this.B = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(!this.w) {
            SemanticsPropertiesKt.disabled(((SemanticsPropertyReceiver)object0));
        }
        SemanticsPropertiesKt.setProgress$default(((SemanticsPropertyReceiver)object0), null, new n8(this.x, this.y, this.z, this.A, this.B), 1, null);
        return Unit.INSTANCE;
    }
}

