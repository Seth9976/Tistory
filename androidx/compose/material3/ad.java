package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class ad extends Lambda implements Function1 {
    public final int w;
    public final Placeable x;
    public final int y;

    public ad(Placeable placeable0, int v, int v1) {
        this.w = v;
        this.x = placeable0;
        this.y = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = c.roundToInt(((float)(this.w - this.x.getWidth())) / 2.0f);
        int v1 = c.roundToInt(((float)(this.y - this.x.getHeight())) / 2.0f);
        PlacementScope.place$default(((PlacementScope)object0), this.x, v, v1, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

