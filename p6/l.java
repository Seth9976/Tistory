package p6;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import zd.c;

public final class l implements NestedScrollConnection {
    public final SwipeRefreshState a;
    public final CoroutineScope b;
    public final aa.l c;
    public boolean d;
    public float e;

    public l(SwipeRefreshState swipeRefreshState0, CoroutineScope coroutineScope0, aa.l l0) {
        Intrinsics.checkNotNullParameter(swipeRefreshState0, "state");
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        Intrinsics.checkNotNullParameter(l0, "onRefresh");
        super();
        this.a = swipeRefreshState0;
        this.b = coroutineScope0;
        this.c = l0;
    }

    public final long a(long v) {
        SwipeRefreshState swipeRefreshState0 = this.a;
        if(Float.compare(Offset.getY-impl(v), 0.0f) > 0) {
            swipeRefreshState0.setSwipeInProgress$swiperefresh_release(true);
        }
        else if(c.roundToInt(swipeRefreshState0.getIndicatorOffset()) == 0) {
            swipeRefreshState0.setSwipeInProgress$swiperefresh_release(false);
        }
        float f = kotlin.ranges.c.coerceAtLeast(swipeRefreshState0.getIndicatorOffset() + Offset.getY-impl(v) * 0.5f, 0.0f) - swipeRefreshState0.getIndicatorOffset();
        if(Math.abs(f) >= 0.5f) {
            k k0 = new k(this, f, null);
            BuildersKt.launch$default(this.b, null, null, k0, 3, null);
            return OffsetKt.Offset(0.0f, f / 0.5f);
        }
        return 0L;
    }

    // 去混淆评级： 低(22)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        if(!this.d) {
            return 0L;
        }
        if(this.a.isRefreshing()) {
            return 0L;
        }
        return !NestedScrollSource.equals-impl0(v2, 1) || Offset.getY-impl(v1) <= 0.0f ? 0L : this.a(v1);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object onPreFling-QWom1Mo(long v, Continuation continuation0) {
        SwipeRefreshState swipeRefreshState0 = this.a;
        if(!swipeRefreshState0.isRefreshing() && swipeRefreshState0.getIndicatorOffset() >= this.e) {
            this.c.invoke();
        }
        swipeRefreshState0.setSwipeInProgress$swiperefresh_release(false);
        return Velocity.box-impl(0L);
    }

    // 去混淆评级： 低(22)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPreScroll-OzD1aCk(long v, int v1) {
        if(!this.d) {
            return 0L;
        }
        if(this.a.isRefreshing()) {
            return 0L;
        }
        return !NestedScrollSource.equals-impl0(v1, 1) || Offset.getY-impl(v) >= 0.0f ? 0L : this.a(v);
    }
}

