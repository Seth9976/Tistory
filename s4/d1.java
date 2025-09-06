package s4;

import androidx.paging.LoadState;
import androidx.paging.LoadStateAdapter;
import androidx.paging.LoadType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function2 {
    public final int w;
    public final LoadStateAdapter x;

    public d1(LoadStateAdapter loadStateAdapter0, int v) {
        this.w = v;
        this.x = loadStateAdapter0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((LoadType)object0), "loadType");
            Intrinsics.checkNotNullParameter(((LoadState)object1), "loadState");
            if(((LoadType)object0) == LoadType.PREPEND) {
                this.x.setLoadState(((LoadState)object1));
            }
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((LoadType)object0), "loadType");
        Intrinsics.checkNotNullParameter(((LoadState)object1), "loadState");
        if(((LoadType)object0) == LoadType.APPEND) {
            this.x.setLoadState(((LoadState)object1));
        }
        return Unit.INSTANCE;
    }
}

