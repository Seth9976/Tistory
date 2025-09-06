package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class jl extends Lambda implements Function1 {
    public final int w;
    public final boolean x;
    public final ClosedFloatingPointRange y;
    public final RangeSliderState z;

    public jl(boolean z, ClosedFloatingPointRange closedFloatingPointRange0, RangeSliderState rangeSliderState0, int v) {
        this.w = v;
        this.x = z;
        this.y = closedFloatingPointRange0;
        this.z = rangeSliderState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            if(!this.x) {
                SemanticsPropertiesKt.disabled(((SemanticsPropertyReceiver)object0));
            }
            SemanticsPropertiesKt.setProgress$default(((SemanticsPropertyReceiver)object0), null, new il(this.y, this.z, 1), 1, null);
            return Unit.INSTANCE;
        }
        if(!this.x) {
            SemanticsPropertiesKt.disabled(((SemanticsPropertyReceiver)object0));
        }
        SemanticsPropertiesKt.setProgress$default(((SemanticsPropertyReceiver)object0), null, new il(this.y, this.z, 0), 1, null);
        return Unit.INSTANCE;
    }
}

