package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class h1 extends Lambda implements Function1 {
    public final MutableFloatState A;
    public final MutableFloatState B;
    public final MutableFloatState C;
    public final Placeable w;
    public final MeasureScope x;
    public final Placeable y;
    public final MutableFloatState z;

    public h1(Placeable placeable0, MeasureScope measureScope0, Placeable placeable1, MutableFloatState mutableFloatState0, MutableFloatState mutableFloatState1, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3) {
        this.w = placeable0;
        this.x = measureScope0;
        this.y = placeable1;
        this.z = mutableFloatState0;
        this.A = mutableFloatState1;
        this.B = mutableFloatState2;
        this.C = mutableFloatState3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z = this.w.getWidth() > this.x.roundToPx-0680j_4(0.0f);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.y, 0, 0, 0.0f, 4, null);
        int v = this.x.roundToPx-0680j_4((z ? 12.0f : 6.0f));
        int v1 = this.y.getWidth() - v;
        int v2 = this.x.roundToPx-0680j_4((z ? 14.0f : 6.0f)) - this.w.getHeight();
        float f = BadgeKt.access$BadgedBox$lambda$4(this.z);
        float f1 = BadgeKt.access$BadgedBox$lambda$1(this.A);
        float f2 = BadgeKt.access$BadgedBox$lambda$7(this.B) - (f1 + ((float)v1) + ((float)this.w.getWidth()));
        float f3 = f + ((float)v2) - BadgeKt.access$BadgedBox$lambda$10(this.C);
        int v3 = f2 < 0.0f ? c.roundToInt(f2) + v1 : v1;
        if(f3 < 0.0f) {
            v2 -= c.roundToInt(f3);
        }
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.w, v3, v2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

