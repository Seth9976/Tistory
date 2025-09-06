package androidx.compose.foundation.gestures;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$2$reverseScope$1", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "pixels", "scrollBy", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ScrollingLogic.doFlingAnimation.2.reverseScope.1 implements ScrollScope {
    public final ScrollingLogic a;
    public final NestedScrollScope b;

    public ScrollingLogic.doFlingAnimation.2.reverseScope.1(NestedScrollScope nestedScrollScope0, ScrollingLogic scrollingLogic0) {
        this.a = scrollingLogic0;
        this.b = nestedScrollScope0;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollScope
    public float scrollBy(float f) {
        long v = this.a.toOffset-tuRUvjQ(f);
        long v1 = this.a.reverseIfNeeded-MK-Hz9U(v);
        long v2 = this.b.scrollByWithOverscroll-OzD1aCk(v1, 2);
        float f1 = this.a.toFloat-k-4lQ0M(v2);
        return this.a.reverseIfNeeded(f1);
    }
}

