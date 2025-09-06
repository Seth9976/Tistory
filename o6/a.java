package o6;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

public final class a implements NestedScrollConnection {
    public final boolean a;
    public final boolean b;
    public final PagerState c;

    public a(boolean z, boolean z1, PagerState pagerState0) {
        Intrinsics.checkNotNullParameter(pagerState0, "pagerState");
        super();
        this.a = z;
        this.b = z1;
        this.c = pagerState0;
    }

    // 去混淆评级： 低(30)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object onPostFling-RZ2iAVY(long v, long v1, Continuation continuation0) {
        return this.c.getCurrentPageOffset() == 0.0f ? Velocity.box-impl(Pager.access$consume-BMRW4eQ(v1, this.a, this.b)) : Velocity.box-impl(0L);
    }

    // 去混淆评级： 中等(60)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        return NestedScrollSource.equals-impl0(v2, 2) ? Pager.access$consume-9KIMszo(v1, this.a, this.b) : 0L;
    }
}

