package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class bk extends Lambda implements Function1 {
    public final MutableIntState w;
    public final boolean x;
    public final Placeable y;

    public bk(MutableIntState mutableIntState0, boolean z, Placeable placeable0) {
        this.w = mutableIntState0;
        this.x = z;
        this.y = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)this.w.getValue()).floatValue();
        ((PlacementScope)object0).place(this.y, 0, 0, f + (this.x ? 5.0f : 0.0f));
        return Unit.INSTANCE;
    }
}

