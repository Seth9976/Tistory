package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b3 extends Lambda implements Function1 {
    public final Placeable w;

    public b3(Placeable placeable0) {
        this.w = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeRelative-70tqf50$default(((PlacementScope)object0), this.w, 0L, 0.0f, 2, null);
        return Unit.INSTANCE;
    }
}

