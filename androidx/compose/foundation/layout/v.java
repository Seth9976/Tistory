package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final int A;
    public final x B;
    public final Placeable w;
    public final Measurable x;
    public final MeasureScope y;
    public final int z;

    public v(Placeable placeable0, Measurable measurable0, MeasureScope measureScope0, int v, int v1, x x0) {
        this.w = placeable0;
        this.x = measurable0;
        this.y = measureScope0;
        this.z = v;
        this.A = v1;
        this.B = x0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LayoutDirection layoutDirection0 = this.y.getLayoutDirection();
        BoxKt.access$placeInBox(((PlacementScope)object0), this.w, this.x, layoutDirection0, this.z, this.A, this.B.a);
        return Unit.INSTANCE;
    }
}

