package vc;

import dev.chrisbanes.snapper.SnapperLayoutInfo;
import dev.chrisbanes.snapper.SnapperLayoutItemInfo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final int w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        c.x = new c(2, 0);
        c.y = new c(2, 1);
        c.z = new c(2, 2);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((SnapperLayoutInfo)object0), "layout");
                Intrinsics.checkNotNullParameter(((SnapperLayoutItemInfo)object1), "item");
                int v = ((SnapperLayoutInfo)object0).getStartScrollOffset();
                return (int)((((SnapperLayoutInfo)object0).getEndScrollOffset() - ((SnapperLayoutInfo)object0).getStartScrollOffset() - ((SnapperLayoutItemInfo)object1).getSize()) / 2 + v);
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((SnapperLayoutInfo)object0), "layout");
                Intrinsics.checkNotNullParameter(((SnapperLayoutItemInfo)object1), "item");
                return (int)(((SnapperLayoutInfo)object0).getEndScrollOffset() - ((SnapperLayoutItemInfo)object1).getSize());
            }
            default: {
                Intrinsics.checkNotNullParameter(((SnapperLayoutInfo)object0), "layout");
                Intrinsics.checkNotNullParameter(((SnapperLayoutItemInfo)object1), "$noName_1");
                return ((SnapperLayoutInfo)object0).getStartScrollOffset();
            }
        }
    }
}

