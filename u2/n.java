package u2;

import android.util.SparseArray;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function0 {
    public final int w;
    public final ViewFactoryHolder x;

    public n(ViewFactoryHolder viewFactoryHolder0, int v) {
        this.w = v;
        this.x = viewFactoryHolder0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                SparseArray sparseArray0 = new SparseArray();
                this.x.x.saveHierarchyState(sparseArray0);
                return sparseArray0;
            }
            case 1: {
                this.x.getReleaseBlock().invoke(this.x.x);
                ViewFactoryHolder.access$unregisterSaveStateProvider(this.x);
                return Unit.INSTANCE;
            }
            case 2: {
                this.x.getResetBlock().invoke(this.x.x);
                return Unit.INSTANCE;
            }
            default: {
                this.x.getUpdateBlock().invoke(this.x.x);
                return Unit.INSTANCE;
            }
        }
    }
}

