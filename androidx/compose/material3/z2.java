package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

public final class z2 extends Lambda implements Function1 {
    public final IntRef w;
    public final ArrayList x;

    public z2(IntRef ref$IntRef0, ArrayList arrayList0) {
        this.w = ref$IntRef0;
        this.x = arrayList0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = this.w.element;
        ArrayList arrayList0 = this.x;
        int v1 = arrayList0.size();
        int v2 = v;
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object1 = arrayList0.get(v3);
            PlacementScope.placeRelative$default(((PlacementScope)object0), ((Placeable)object1), v2, 0, 0.0f, 4, null);
            v2 += ((Placeable)object1).getWidth();
        }
        return Unit.INSTANCE;
    }
}

