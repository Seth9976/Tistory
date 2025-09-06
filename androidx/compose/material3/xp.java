package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xp extends Lambda implements Function1 {
    public final ArrayList w;
    public final Placeable x;

    public xp(Placeable placeable0, ArrayList arrayList0) {
        this.w = arrayList0;
        this.x = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.place$default(((PlacementScope)object0), ((Placeable)this.w.get(0)), 0, 0, 0.0f, 4, null);
        PlacementScope.place$default(((PlacementScope)object0), ((Placeable)this.w.get(1)), ((Placeable)this.w.get(0)).getWidth(), 0, 0.0f, 4, null);
        int v = ((Placeable)this.w.get(0)).getWidth();
        PlacementScope.place$default(((PlacementScope)object0), this.x, v - this.x.getWidth() / 2, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

