package s;

import androidx.compose.animation.b;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final Placeable[] w;
    public final b x;
    public final int y;
    public final int z;

    public h(Placeable[] arr_placeable, b b0, int v, int v1) {
        this.w = arr_placeable;
        this.x = b0;
        this.y = v;
        this.z = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Placeable[] arr_placeable = this.w;
        for(int v = 0; v < arr_placeable.length; ++v) {
            Placeable placeable0 = arr_placeable[v];
            if(placeable0 != null) {
                long v1 = this.x.a.getContentAlignment().align-KFBX0sM(IntSizeKt.IntSize(placeable0.getWidth(), placeable0.getHeight()), IntSizeKt.IntSize(this.y, this.z), LayoutDirection.Ltr);
                PlacementScope.place$default(((PlacementScope)object0), placeable0, IntOffset.getX-impl(v1), IntOffset.getY-impl(v1), 0.0f, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}

