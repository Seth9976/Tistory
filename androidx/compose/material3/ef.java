package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ef extends Lambda implements Function1 {
    public final float w;

    public ef(float f) {
        this.w = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((DraggableAnchorsConfig)object0).at(DrawerValue.Closed, this.w);
        ((DraggableAnchorsConfig)object0).at(DrawerValue.Open, 0.0f);
        return Unit.INSTANCE;
    }
}

