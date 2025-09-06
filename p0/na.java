package p0;

import androidx.compose.material.TabKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class na extends Lambda implements Function1 {
    public final int A;
    public final Integer B;
    public final Integer C;
    public final Placeable w;
    public final Placeable x;
    public final MeasureScope y;
    public final int z;

    public na(Placeable placeable0, Placeable placeable1, MeasureScope measureScope0, int v, int v1, Integer integer0, Integer integer1) {
        this.w = placeable0;
        this.x = placeable1;
        this.y = measureScope0;
        this.z = v;
        this.A = v1;
        this.B = integer0;
        this.C = integer1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Placeable placeable0 = this.x;
        Placeable placeable1 = this.w;
        if(placeable1 != null && placeable0 != null) {
            Intrinsics.checkNotNull(this.B);
            Intrinsics.checkNotNull(this.C);
            TabKt.access$placeTextAndIcon(((PlacementScope)object0), this.y, placeable1, placeable0, this.z, this.A, ((int)this.B), ((int)this.C));
            return Unit.INSTANCE;
        }
        int v = this.A;
        if(placeable1 != null) {
            TabKt.access$placeTextOrIcon(((PlacementScope)object0), placeable1, v);
            return Unit.INSTANCE;
        }
        if(placeable0 != null) {
            TabKt.access$placeTextOrIcon(((PlacementScope)object0), placeable0, v);
        }
        return Unit.INSTANCE;
    }
}

