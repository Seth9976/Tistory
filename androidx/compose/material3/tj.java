package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class tj extends Lambda implements Function1 {
    public final ArrayList A;
    public final int B;
    public final ArrayList w;
    public final MeasureScope x;
    public final SegmentedButtonContentMeasurePolicy y;
    public final int z;

    public tj(ArrayList arrayList0, MeasureScope measureScope0, SegmentedButtonContentMeasurePolicy segmentedButtonContentMeasurePolicy0, int v, ArrayList arrayList1, int v1) {
        this.w = arrayList0;
        this.x = measureScope0;
        this.y = segmentedButtonContentMeasurePolicy0;
        this.z = v;
        this.A = arrayList1;
        this.B = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v3;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v2 = 0; true; ++v2) {
            v3 = this.B;
            if(v2 >= v) {
                break;
            }
            Object object1 = arrayList0.get(v2);
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)object1), 0, q.A(((Placeable)object1), v3, 2), 0.0f, 4, null);
        }
        int v4 = this.x.roundToPx-0680j_4(0.0f);
        int v5 = this.x.roundToPx-0680j_4(8.0f);
        Animatable animatable0 = this.y.getAnimatable();
        int v6 = animatable0 == null ? this.z : ((Number)animatable0.getValue()).intValue();
        ArrayList arrayList1 = this.A;
        int v7 = arrayList1.size();
        for(int v1 = 0; v1 < v7; ++v1) {
            Object object2 = arrayList1.get(v1);
            PlacementScope.place$default(((PlacementScope)object0), ((Placeable)object2), v5 + v4 + v6, q.A(((Placeable)object2), v3, 2), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

