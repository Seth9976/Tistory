package u2;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final AndroidViewHolder w;
    public final LayoutNode x;

    public f(AndroidViewHolder androidViewHolder0, LayoutNode layoutNode0) {
        this.w = androidViewHolder0;
        this.x = layoutNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PlacementScope placeable$PlacementScope0 = (PlacementScope)object0;
        AndroidViewHolder_androidKt.access$layoutAccordingTo(this.w, this.x);
        return Unit.INSTANCE;
    }
}

