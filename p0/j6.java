package p0;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j6 extends Lambda implements Function1 {
    public final Placeable A;
    public final Placeable B;
    public final Placeable C;
    public final Placeable D;
    public final k6 E;
    public final MeasureScope F;
    public final int w;
    public final int x;
    public final Placeable y;
    public final Placeable z;

    public j6(int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, k6 k60, MeasureScope measureScope0) {
        this.w = v;
        this.x = v1;
        this.y = placeable0;
        this.z = placeable1;
        this.A = placeable2;
        this.B = placeable3;
        this.C = placeable4;
        this.D = placeable5;
        this.E = k60;
        this.F = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.F.getDensity();
        LayoutDirection layoutDirection0 = this.F.getLayoutDirection();
        OutlinedTextFieldKt.access$place(((PlacementScope)object0), this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E.c, this.E.b, f, layoutDirection0, this.E.d);
        return Unit.INSTANCE;
    }
}

