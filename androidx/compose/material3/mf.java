package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableFloatState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class mf extends Lambda implements Function1 {
    public final MutableFloatState w;

    public mf(MutableFloatState mutableFloatState0) {
        this.w = mutableFloatState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = NavigationDrawerKt.access$ModalNavigationDrawer_FHprtrg$lambda$5(this.w);
        ((DraggableAnchorsConfig)object0).at(DrawerValue.Closed, f);
        ((DraggableAnchorsConfig)object0).at(DrawerValue.Open, 0.0f);
        return Unit.INSTANCE;
    }
}

