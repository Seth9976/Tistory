package s;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final Placeable w;

    public r0(Placeable placeable0) {
        this.w = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.place$default(((PlacementScope)object0), this.w, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

