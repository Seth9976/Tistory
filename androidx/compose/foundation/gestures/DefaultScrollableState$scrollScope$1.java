package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import z.g0;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/DefaultScrollableState$scrollScope$1", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "pixels", "scrollBy", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultScrollableState.scrollScope.1 implements ScrollScope {
    public final g0 a;

    public DefaultScrollableState.scrollScope.1(g0 g00) {
        this.a = g00;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f) {
        if(Float.isNaN(f)) {
            return 0.0f;
        }
        float f1 = ((Number)this.a.a.invoke(f)).floatValue();
        boolean z = false;
        this.a.e.setValue(Boolean.valueOf(Float.compare(f1, 0.0f) > 0));
        MutableState mutableState0 = this.a.f;
        if(f1 < 0.0f) {
            z = true;
        }
        mutableState0.setValue(Boolean.valueOf(z));
        return f1;
    }
}

