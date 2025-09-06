package w0;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final Placeable w;
    public final int x;

    public f(Placeable placeable0, int v) {
        this.w = placeable0;
        this.x = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.place$default(((PlacementScope)object0), this.w, -this.x, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

