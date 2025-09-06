package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final int w;
    public final Measurer x;
    public final List y;

    public m(Measurer measurer0, List list0, int v) {
        this.w = v;
        this.x = measurer0;
        this.y = list0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
            this.x.performLayout(((PlacementScope)object0), this.y);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        this.x.performLayout(((PlacementScope)object0), this.y);
        return Unit.INSTANCE;
    }
}

