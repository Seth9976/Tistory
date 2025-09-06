package f0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.ranges.c;

public final class a implements NestedScrollConnection {
    public final PagerState a;
    public final Orientation b;

    public a(PagerState pagerState0, Orientation orientation0) {
        this.a = pagerState0;
        this.b = orientation0;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object onPostFling-RZ2iAVY(long v, long v1, Continuation continuation0) {
        return this.b == Orientation.Vertical ? Velocity.box-impl(Velocity.copy-OhffZ5M$default(v1, 0.0f, 0.0f, 2, null)) : Velocity.box-impl(Velocity.copy-OhffZ5M$default(v1, 0.0f, 0.0f, 1, null));
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPostScroll-DzOQY0M(long v, long v1, int v2) {
        if(NestedScrollSource.equals-impl0(v2, 2) && (this.b == Orientation.Horizontal ? Offset.getX-impl(v1) : Offset.getY-impl(v1)) != 0.0f) {
            throw new CancellationException();
        }
        return 0L;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long onPreScroll-OzD1aCk(long v, int v1) {
        if(NestedScrollSource.equals-impl0(v1, 1)) {
            PagerState pagerState0 = this.a;
            if(((double)Math.abs(pagerState0.getCurrentPageOffsetFraction())) > 0.000001) {
                float f = pagerState0.getCurrentPageOffsetFraction() * ((float)pagerState0.getPageSize$foundation_release());
                int v2 = pagerState0.getLayoutInfo().getPageSize();
                float f1 = ((float)(pagerState0.getLayoutInfo().getPageSpacing() + v2)) * -Math.signum(pagerState0.getCurrentPageOffsetFraction()) + f;
                if(pagerState0.getCurrentPageOffsetFraction() > 0.0f) {
                    float f2 = f1;
                    f1 = f;
                    f = f2;
                }
                float f3 = -pagerState0.dispatchRawDelta(-c.coerceIn((this.b == Orientation.Horizontal ? Offset.getX-impl(v) : Offset.getY-impl(v)), f, f1));
                float f4 = this.b == Orientation.Horizontal ? f3 : Offset.getX-impl(v);
                if(this.b != Orientation.Vertical) {
                    f3 = Offset.getY-impl(v);
                }
                return Offset.copy-dBAh8RU(v, f4, f3);
            }
        }
        return 0L;
    }
}

