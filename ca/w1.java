package ca;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class w1 extends Lambda implements Function1 {
    public final Function0 w;
    public final Placeable x;

    public w1(Function0 function00, Placeable placeable0) {
        this.w = function00;
        this.x = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        long v = ((Offset)this.w.invoke()).unbox-impl();
        int v1 = c.roundToInt(Offset.getX-impl(v) - ((float)this.x.getWidth()) / 2.0f);
        int v2 = c.roundToInt(Offset.getY-impl(v) - ((float)this.x.getHeight()) / 2.0f);
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.x, v1, v2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

