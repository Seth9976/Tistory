package c0;

import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final ArrayList w;
    public final MutableState x;

    public m(ArrayList arrayList0, MutableState mutableState0) {
        this.w = arrayList0;
        this.x = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((LazyGridMeasuredItem)arrayList0.get(v1)).place(((PlacementScope)object0));
        }
        ObservableScopeInvalidator.attachToScope-impl(this.x);
        return Unit.INSTANCE;
    }
}

