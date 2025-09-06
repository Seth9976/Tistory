package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function1 {
    public final MutableVector w;

    public y1(MutableVector mutableVector0) {
        this.w = mutableVector0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope placeable$PlacementScope0 = (PlacementScope)object0;
        MutableVector mutableVector0 = this.w;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((MeasureResult)arr_object[v1]).placeChildren();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

