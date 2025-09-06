package b0;

import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final ArrayList w;
    public final LazyListMeasuredItem x;
    public final boolean y;
    public final MutableState z;

    public m(ArrayList arrayList0, LazyListMeasuredItem lazyListMeasuredItem0, boolean z, MutableState mutableState0) {
        this.w = arrayList0;
        this.x = lazyListMeasuredItem0;
        this.y = z;
        this.z = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        boolean z;
        LazyListMeasuredItem lazyListMeasuredItem0;
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            lazyListMeasuredItem0 = this.x;
            z = this.y;
            if(v1 >= v) {
                break;
            }
            LazyListMeasuredItem lazyListMeasuredItem1 = (LazyListMeasuredItem)arrayList0.get(v1);
            if(lazyListMeasuredItem1 != lazyListMeasuredItem0) {
                lazyListMeasuredItem1.place(((PlacementScope)object0), z);
            }
        }
        if(lazyListMeasuredItem0 != null) {
            lazyListMeasuredItem0.place(((PlacementScope)object0), z);
        }
        ObservableScopeInvalidator.attachToScope-impl(this.z);
        return Unit.INSTANCE;
    }
}

