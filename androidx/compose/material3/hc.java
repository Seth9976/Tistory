package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class hc extends Lambda implements Function1 {
    public final int A;
    public final Placeable B;
    public final Placeable C;
    public final Placeable D;
    public final int E;
    public final int F;
    public final int G;
    public final Placeable w;
    public final Placeable x;
    public final int y;
    public final boolean z;

    public hc(Placeable placeable0, Placeable placeable1, int v, boolean z, int v1, Placeable placeable2, Placeable placeable3, Placeable placeable4, int v2, int v3, int v4) {
        this.w = placeable0;
        this.x = placeable1;
        this.y = v;
        this.z = z;
        this.A = v1;
        this.B = placeable2;
        this.C = placeable3;
        this.D = placeable4;
        this.E = v2;
        this.F = v3;
        this.G = v4;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = this.E;
        int v1 = this.A;
        boolean z = this.z;
        Placeable placeable0 = this.w;
        if(placeable0 != null) {
            int v2 = z ? v1 : Alignment.Companion.getCenterVertically().align(placeable0.getHeight(), v);
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable0, this.y, v2, 0.0f, 4, null);
        }
        Placeable placeable1 = this.x;
        if(placeable1 != null) {
            int v3 = z ? v1 : Alignment.Companion.getCenterVertically().align(placeable1.getHeight(), v);
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable1, this.F - this.G - placeable1.getWidth(), v3, 0.0f, 4, null);
        }
        int v4 = TextFieldImplKt.widthOrZero(placeable0) + this.y;
        Placeable placeable2 = this.D;
        Placeable placeable3 = this.C;
        Placeable placeable4 = this.B;
        if(!z) {
            int v5 = TextFieldImplKt.heightOrZero(placeable4);
            int v6 = TextFieldImplKt.heightOrZero(placeable3);
            int v7 = TextFieldImplKt.heightOrZero(placeable2);
            v1 = Alignment.Companion.getCenterVertically().align(v7 + (v6 + v5), v);
        }
        if(placeable3 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable3, v4, v1, 0.0f, 4, null);
        }
        int v8 = TextFieldImplKt.heightOrZero(placeable3) + v1;
        if(placeable4 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable4, v4, v8, 0.0f, 4, null);
        }
        int v9 = TextFieldImplKt.heightOrZero(placeable4);
        if(placeable2 != null) {
            PlacementScope.placeRelative$default(((PlacementScope)object0), placeable2, v4, v9 + v8, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}

