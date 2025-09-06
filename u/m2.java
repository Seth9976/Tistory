package u;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class m2 extends Lambda implements Function1 {
    public final Placeable w;
    public final q2 x;

    public m2(Placeable placeable0, q2 q20) {
        this.w = placeable0;
        this.x = q20;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)this.x.x.getValue()).floatValue();
        int v = c.roundToInt(this.x.b() * -f);
        PlacementScope.placeWithLayer$default(((PlacementScope)object0), this.w, v, 0, 0.0f, null, 12, null);
        return Unit.INSTANCE;
    }
}

