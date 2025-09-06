package o6;

import com.google.accompanist.pager.PagerState;
import dev.chrisbanes.snapper.SnapperLayoutInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final int w;
    public static final p x;
    public static final p y;

    static {
        p.x = new p(1, 0);
        p.y = new p(1, 1);
    }

    public p(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((List)object0), "it");
            Object object1 = ((List)object0).get(0);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Int");
            return new PagerState(((int)(((Integer)object1))));
        }
        Intrinsics.checkNotNullParameter(((SnapperLayoutInfo)object0), "layoutInfo");
        return (float)(((float)((SnapperLayoutInfo)object0).getEndScrollOffset()) - ((float)((SnapperLayoutInfo)object0).getStartScrollOffset()));
    }
}

