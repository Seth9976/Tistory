package u2;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final int w;
    public final AndroidViewHolder x;

    public j(AndroidViewHolder androidViewHolder0, int v) {
        this.w = v;
        this.x = androidViewHolder0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            AndroidViewHolder androidViewHolder0 = this.x;
            if(androidViewHolder0.e && androidViewHolder0.isAttachedToWindow() && androidViewHolder0.getView().getParent() == androidViewHolder0) {
                androidViewHolder0.getSnapshotObserver().observeReads$ui_release(androidViewHolder0, AndroidViewHolder.w, androidViewHolder0.getUpdate());
            }
            return Unit.INSTANCE;
        }
        this.x.getLayoutNode().invalidateLayer$ui_release();
        return Unit.INSTANCE;
    }
}

