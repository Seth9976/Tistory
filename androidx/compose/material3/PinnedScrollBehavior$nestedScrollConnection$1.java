package androidx.compose.material3;

import androidx.appcompat.app.w0;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"androidx/compose/material3/PinnedScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PinnedScrollBehavior.nestedScrollConnection.1 implements NestedScrollConnection {
    public final w0 a;

    public PinnedScrollBehavior.nestedScrollConnection.1(w0 w00) {
        this.a = w00;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        w0 w00 = this.a;
        if(!((Boolean)((Function0)w00.b).invoke()).booleanValue()) {
            return 0L;
        }
        if(Offset.getY-impl(v) == 0.0f && Offset.getY-impl(v1) > 0.0f) {
            ((TopAppBarState)w00.a).setContentOffset(0.0f);
            return 0L;
        }
        float f = ((TopAppBarState)w00.a).getContentOffset();
        ((TopAppBarState)w00.a).setContentOffset(Offset.getY-impl(v) + f);
        return 0L;
    }
}

