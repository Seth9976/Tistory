package androidx.paging;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final boolean w;
    public final LoadType x;
    public final LoadState y;
    public final MutableCombinedLoadStateCollection z;

    public a0(boolean z, LoadType loadType0, LoadState loadState0, MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection0) {
        this.w = z;
        this.x = loadType0;
        this.y = loadState0;
        this.z = mutableCombinedLoadStateCollection0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LoadStates loadStates0;
        if(((CombinedLoadStates)object0) == null) {
            loadStates0 = LoadStates.Companion.getIDLE();
        }
        else {
            loadStates0 = ((CombinedLoadStates)object0).getSource();
            if(loadStates0 == null) {
                loadStates0 = LoadStates.Companion.getIDLE();
            }
        }
        LoadStates loadStates1 = ((CombinedLoadStates)object0) == null ? null : ((CombinedLoadStates)object0).getMediator();
        LoadState loadState0 = this.y;
        LoadType loadType0 = this.x;
        if(this.w) {
            loadStates1 = LoadStates.Companion.getIDLE().modifyState$paging_common_release(loadType0, loadState0);
            return MutableCombinedLoadStateCollection.access$computeNewState(this.z, ((CombinedLoadStates)object0), loadStates0, loadStates1);
        }
        loadStates0 = loadStates0.modifyState$paging_common_release(loadType0, loadState0);
        return MutableCombinedLoadStateCollection.access$computeNewState(this.z, ((CombinedLoadStates)object0), loadStates0, loadStates1);
    }
}

