package j0;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p3 extends Lambda implements Function1 {
    public final ArrayList w;
    public final List x;

    public p3(ArrayList arrayList0, List list0) {
        this.w = arrayList0;
        this.x = list0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ArrayList arrayList0 = this.w;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Pair pair0 = (Pair)arrayList0.get(v2);
                PlacementScope.place-70tqf50$default(((PlacementScope)object0), ((Placeable)pair0.component1()), ((IntOffset)pair0.component2()).unbox-impl(), 0.0f, 2, null);
            }
        }
        List list0 = this.x;
        if(list0 != null) {
            int v3 = list0.size();
            for(int v = 0; v < v3; ++v) {
                Pair pair1 = (Pair)list0.get(v);
                Function0 function00 = (Function0)pair1.component2();
                PlacementScope.place-70tqf50$default(((PlacementScope)object0), ((Placeable)pair1.component1()), (function00 == null ? 0L : ((IntOffset)function00.invoke()).unbox-impl()), 0.0f, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}

