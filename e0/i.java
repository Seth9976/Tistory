package e0;

import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final ArrayList w;
    public final LazyStaggeredGridMeasureContext x;

    public i(ArrayList arrayList0, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0) {
        this.w = arrayList0;
        this.x = lazyStaggeredGridMeasureContext0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            lazyStaggeredGridMeasureContext0 = this.x;
            if(v1 >= v) {
                break;
            }
            ((LazyStaggeredGridMeasuredItem)arrayList0.get(v1)).place(((PlacementScope)object0), lazyStaggeredGridMeasureContext0);
        }
        ObservableScopeInvalidator.attachToScope-impl(lazyStaggeredGridMeasureContext0.getState().getPlacementScopeInvalidator-zYiylxw$foundation_release());
        return Unit.INSTANCE;
    }
}

