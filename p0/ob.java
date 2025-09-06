package p0;

import androidx.compose.material.TextFieldKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class ob extends Lambda implements Function1 {
    public final int A;
    public final Placeable B;
    public final Placeable C;
    public final Placeable D;
    public final Placeable E;
    public final pb F;
    public final int G;
    public final int H;
    public final MeasureScope I;
    public final Placeable w;
    public final int x;
    public final int y;
    public final int z;

    public ob(Placeable placeable0, int v, int v1, int v2, int v3, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, pb pb0, int v4, int v5, MeasureScope measureScope0) {
        this.w = placeable0;
        this.x = v;
        this.y = v1;
        this.z = v2;
        this.A = v3;
        this.B = placeable1;
        this.C = placeable2;
        this.D = placeable3;
        this.E = placeable4;
        this.F = pb0;
        this.G = v4;
        this.H = v5;
        this.I = measureScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        MeasureScope measureScope0 = this.I;
        pb pb0 = this.F;
        if(this.w != null) {
            float f = measureScope0.getDensity();
            TextFieldKt.access$placeWithLabel(((PlacementScope)object0), this.z, this.A, this.B, this.w, this.C, this.D, this.E, pb0.a, c.coerceAtLeast(this.x - this.y, 0), this.G + this.H, pb0.b, f);
            return Unit.INSTANCE;
        }
        float f1 = measureScope0.getDensity();
        TextFieldKt.access$placeWithoutLabel(((PlacementScope)object0), this.z, this.A, this.B, this.C, this.D, this.E, pb0.a, f1, pb0.c);
        return Unit.INSTANCE;
    }
}

