package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

public final class w extends Lambda implements Function1 {
    public final IntRef A;
    public final x B;
    public final Placeable[] w;
    public final List x;
    public final MeasureScope y;
    public final IntRef z;

    public w(Placeable[] arr_placeable, List list0, MeasureScope measureScope0, IntRef ref$IntRef0, IntRef ref$IntRef1, x x0) {
        this.w = arr_placeable;
        this.x = list0;
        this.y = measureScope0;
        this.z = ref$IntRef0;
        this.A = ref$IntRef1;
        this.B = x0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Placeable[] arr_placeable = this.w;
        int v1 = 0;
        for(int v = 0; v1 < arr_placeable.length; ++v) {
            Placeable placeable0 = arr_placeable[v1];
            Intrinsics.checkNotNull(placeable0, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            BoxKt.access$placeInBox(((PlacementScope)object0), placeable0, ((Measurable)this.x.get(v)), this.y.getLayoutDirection(), this.z.element, this.A.element, this.B.a);
            ++v1;
        }
        return Unit.INSTANCE;
    }
}

