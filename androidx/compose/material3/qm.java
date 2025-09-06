package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class qm extends Lambda implements Function1 {
    public final boolean w;
    public final boolean x;
    public final float y;
    public final boolean z;

    public qm(boolean z, boolean z1, float f, boolean z2) {
        this.w = z;
        this.x = z1;
        this.y = f;
        this.z = z2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((DraggableAnchorsConfig)object0).at(SwipeToDismissBoxValue.Settled, 0.0f);
        boolean z = this.x;
        float f = this.y;
        if(this.w) {
            ((DraggableAnchorsConfig)object0).at(SwipeToDismissBoxValue.StartToEnd, (z ? -f : f));
        }
        if(this.z) {
            SwipeToDismissBoxValue swipeToDismissBoxValue0 = SwipeToDismissBoxValue.EndToStart;
            if(!z) {
                f = -f;
            }
            ((DraggableAnchorsConfig)object0).at(swipeToDismissBoxValue0, f);
        }
        return Unit.INSTANCE;
    }
}

