package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class fh extends Lambda implements Function1 {
    public final Placeable A;
    public final Placeable B;
    public final Placeable C;
    public final Placeable D;
    public final Placeable E;
    public final Placeable F;
    public final Placeable G;
    public final gh H;
    public final MeasureScope I;
    public final int w;
    public final int x;
    public final Placeable y;
    public final Placeable z;

    public fh(int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, gh gh0, MeasureScope measureScope0) {
        this.w = v;
        this.x = v1;
        this.y = placeable0;
        this.z = placeable1;
        this.A = placeable2;
        this.B = placeable3;
        this.C = placeable4;
        this.D = placeable5;
        this.E = placeable6;
        this.F = placeable7;
        this.G = placeable8;
        this.H = gh0;
        this.I = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.I.getDensity();
        LayoutDirection layoutDirection0 = this.I.getLayoutDirection();
        OutlinedTextFieldKt.access$place(((PlacementScope)object0), this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H.c, this.H.b, f, layoutDirection0, this.H.d);
        return Unit.INSTANCE;
    }
}

