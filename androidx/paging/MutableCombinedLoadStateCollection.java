package androidx.paging;

import aa.r;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\b\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0006\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\b\u0010\u0010J\u001F\u0010\u0011\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001A\u00020\u00072\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001A\u00020\u00072\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0018\u0010\u0017R\u001F\u0010\u001E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00198\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Landroidx/paging/MutableCombinedLoadStateCollection;", "", "<init>", "()V", "Landroidx/paging/LoadStates;", "sourceLoadStates", "remoteLoadStates", "", "set", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "Landroidx/paging/LoadType;", "type", "", "remote", "Landroidx/paging/LoadState;", "state", "(Landroidx/paging/LoadType;ZLandroidx/paging/LoadState;)V", "get", "(Landroidx/paging/LoadType;Z)Landroidx/paging/LoadState;", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "listener", "addListener", "(Lkotlin/jvm/functions/Function1;)V", "removeListener", "Lkotlinx/coroutines/flow/StateFlow;", "c", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "stateFlow", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMutableCombinedLoadStateCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1#2:171\n230#3,5:172\n1855#4,2:177\n*S KotlinDebug\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n*L\n98#1:172,5\n108#1:177,2\n*E\n"})
public final class MutableCombinedLoadStateCollection {
    public final CopyOnWriteArrayList a;
    public final MutableStateFlow b;
    public final StateFlow c;

    public MutableCombinedLoadStateCollection() {
        this.a = new CopyOnWriteArrayList();
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(null);
        this.b = mutableStateFlow0;
        this.c = FlowKt.asStateFlow(mutableStateFlow0);
    }

    public static LoadState a(LoadState loadState0, LoadState loadState1, LoadState loadState2, LoadState loadState3) {
        if(loadState3 == null) {
            return loadState2;
        }
        return loadState0 instanceof Loading && (!(loadState1 instanceof NotLoading) || !(loadState3 instanceof NotLoading)) && !(loadState3 instanceof Error) ? loadState0 : loadState3;
    }

    public static final CombinedLoadStates access$computeNewState(MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection0, CombinedLoadStates combinedLoadStates0, LoadStates loadStates0, LoadStates loadStates1) {
        LoadState loadState5;
        LoadState loadState3;
        LoadState loadState0;
        mutableCombinedLoadStateCollection0.getClass();
        if(combinedLoadStates0 == null) {
            loadState0 = NotLoading.Companion.getIncomplete$paging_common_release();
        }
        else {
            loadState0 = combinedLoadStates0.getRefresh();
            if(loadState0 == null) {
                loadState0 = NotLoading.Companion.getIncomplete$paging_common_release();
            }
        }
        LoadState loadState1 = null;
        LoadState loadState2 = MutableCombinedLoadStateCollection.a(loadState0, loadStates0.getRefresh(), loadStates0.getRefresh(), (loadStates1 == null ? null : loadStates1.getRefresh()));
        if(combinedLoadStates0 == null) {
            loadState3 = NotLoading.Companion.getIncomplete$paging_common_release();
        }
        else {
            loadState3 = combinedLoadStates0.getPrepend();
            if(loadState3 == null) {
                loadState3 = NotLoading.Companion.getIncomplete$paging_common_release();
            }
        }
        LoadState loadState4 = MutableCombinedLoadStateCollection.a(loadState3, loadStates0.getRefresh(), loadStates0.getPrepend(), (loadStates1 == null ? null : loadStates1.getPrepend()));
        if(combinedLoadStates0 == null) {
            loadState5 = NotLoading.Companion.getIncomplete$paging_common_release();
        }
        else {
            loadState5 = combinedLoadStates0.getAppend();
            if(loadState5 == null) {
                loadState5 = NotLoading.Companion.getIncomplete$paging_common_release();
            }
        }
        LoadState loadState6 = loadStates0.getRefresh();
        LoadState loadState7 = loadStates0.getAppend();
        if(loadStates1 != null) {
            loadState1 = loadStates1.getAppend();
        }
        return new CombinedLoadStates(loadState2, loadState4, MutableCombinedLoadStateCollection.a(loadState5, loadState6, loadState7, loadState1), loadStates0, loadStates1);
    }

    public final void addListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.a.add(function10);
        CombinedLoadStates combinedLoadStates0 = (CombinedLoadStates)this.b.getValue();
        if(combinedLoadStates0 != null) {
            function10.invoke(combinedLoadStates0);
        }
    }

    public final void b(Function1 function10) {
        while(true) {
            MutableStateFlow mutableStateFlow0 = this.b;
            Object object0 = mutableStateFlow0.getValue();
            CombinedLoadStates combinedLoadStates0 = (CombinedLoadStates)function10.invoke(((CombinedLoadStates)object0));
            if(Intrinsics.areEqual(((CombinedLoadStates)object0), combinedLoadStates0)) {
                break;
            }
            if(mutableStateFlow0.compareAndSet(object0, combinedLoadStates0)) {
                if(combinedLoadStates0 == null) {
                    break;
                }
                for(Object object1: this.a) {
                    ((Function1)object1).invoke(combinedLoadStates0);
                }
                return;
            }
        }
    }

    @Nullable
    public final LoadState get(@NotNull LoadType loadType0, boolean z) {
        LoadStates loadStates0;
        Intrinsics.checkNotNullParameter(loadType0, "type");
        CombinedLoadStates combinedLoadStates0 = (CombinedLoadStates)this.b.getValue();
        if(z) {
            if(combinedLoadStates0 != null) {
                loadStates0 = combinedLoadStates0.getMediator();
                return loadStates0 == null ? null : loadStates0.get$paging_common_release(loadType0);
            }
        }
        else if(combinedLoadStates0 != null) {
            loadStates0 = combinedLoadStates0.getSource();
            return loadStates0 == null ? null : loadStates0.get$paging_common_release(loadType0);
        }
        throw new NullPointerException();
    }

    @NotNull
    public final StateFlow getStateFlow() {
        return this.c;
    }

    public final void removeListener(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "listener");
        this.a.remove(function10);
    }

    public final void set(@NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
        Intrinsics.checkNotNullParameter(loadStates0, "sourceLoadStates");
        this.b(new r(this, loadStates0, 23, loadStates1));
    }

    public final void set(@NotNull LoadType loadType0, boolean z, @NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadType0, "type");
        Intrinsics.checkNotNullParameter(loadState0, "state");
        this.b(new a0(z, loadType0, loadState0, this));
    }
}

