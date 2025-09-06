package u2;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final int w;
    public final AndroidViewHolder x;
    public final LayoutNode y;

    public c(AndroidViewHolder androidViewHolder0, LayoutNode layoutNode0, int v) {
        this.w = v;
        this.x = androidViewHolder0;
        this.y = layoutNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)object0;
            AndroidViewHolder_androidKt.access$layoutAccordingTo(this.x, this.y);
            this.x.c.onInteropViewLayoutChange(this.x);
            return Unit.INSTANCE;
        }
        AndroidComposeView androidComposeView0 = ((Owner)object0) instanceof AndroidComposeView ? ((AndroidComposeView)(((Owner)object0))) : null;
        AndroidViewHolder androidViewHolder0 = this.x;
        if(androidComposeView0 != null) {
            androidComposeView0.addAndroidView(androidViewHolder0, this.y);
        }
        if(androidViewHolder0.getView().getParent() != androidViewHolder0) {
            androidViewHolder0.addView(androidViewHolder0.getView());
        }
        return Unit.INSTANCE;
    }
}

