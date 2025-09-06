package v2;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final ArrayList w;

    public e(ArrayList arrayList0) {
        this.w = arrayList0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v1)), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

