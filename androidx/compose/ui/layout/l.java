package androidx.compose.ui.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final Placeable w;

    public l(Placeable placeable0) {
        this.w = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeRelativeWithLayer$default(((PlacementScope)object0), this.w, 0, 0, 0.0f, null, 12, null);
        return Unit.INSTANCE;
    }
}

