package androidx.compose.ui.layout;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final ArrayList w;

    public m(ArrayList arrayList0) {
        this.w = arrayList0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PlacementScope.placeRelativeWithLayer$default(((PlacementScope)object0), ((Placeable)arrayList0.get(v1)), 0, 0, 0.0f, null, 12, null);
        }
        return Unit.INSTANCE;
    }
}

