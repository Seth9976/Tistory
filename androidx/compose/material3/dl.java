package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class dl extends Lambda implements Function1 {
    public final int A;
    public final int B;
    public final Placeable w;
    public final int x;
    public final int y;
    public final Placeable z;

    public dl(Placeable placeable0, int v, int v1, Placeable placeable1, int v2, int v3) {
        this.w = placeable0;
        this.x = v;
        this.y = v1;
        this.z = placeable1;
        this.A = v2;
        this.B = v3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.w, this.x, this.y, 0.0f, 4, null);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.z, this.A, this.B, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

