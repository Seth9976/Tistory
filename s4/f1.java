package s4;

import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadStateAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function1 {
    public final int w;
    public final LoadStateAdapter x;

    public f1(LoadStateAdapter loadStateAdapter0, int v) {
        this.w = v;
        this.x = loadStateAdapter0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((CombinedLoadStates)object0), "loadStates");
            this.x.setLoadState(((CombinedLoadStates)object0).getPrepend());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((CombinedLoadStates)object0), "loadStates");
        this.x.setLoadState(((CombinedLoadStates)object0).getAppend());
        return Unit.INSTANCE;
    }
}

