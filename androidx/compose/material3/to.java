package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class to extends Lambda implements Function1 {
    public final Placeable A;
    public final Placeable B;
    public final Placeable C;
    public final Placeable D;
    public final Placeable E;
    public final Placeable F;
    public final Placeable G;
    public final uo H;
    public final int I;
    public final MeasureScope J;
    public final Placeable w;
    public final int x;
    public final int y;
    public final Placeable z;

    public to(Placeable placeable0, int v, int v1, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, uo uo0, int v2, MeasureScope measureScope0) {
        this.w = placeable0;
        this.x = v;
        this.y = v1;
        this.z = placeable1;
        this.A = placeable2;
        this.B = placeable3;
        this.C = placeable4;
        this.D = placeable5;
        this.E = placeable6;
        this.F = placeable7;
        this.G = placeable8;
        this.H = uo0;
        this.I = v2;
        this.J = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        MeasureScope measureScope0 = this.J;
        uo uo0 = this.H;
        Placeable placeable0 = this.w;
        if(placeable0 != null) {
            float f = measureScope0.getDensity();
            TextFieldKt.access$placeWithLabel(((PlacementScope)object0), this.x, this.y, this.z, placeable0, this.A, this.B, this.C, this.D, this.E, this.F, this.G, uo0.a, this.I, placeable0.getHeight() + this.I, uo0.b, f);
            return Unit.INSTANCE;
        }
        float f1 = measureScope0.getDensity();
        TextFieldKt.access$placeWithoutLabel(((PlacementScope)object0), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, uo0.a, f1, uo0.c);
        return Unit.INSTANCE;
    }
}

