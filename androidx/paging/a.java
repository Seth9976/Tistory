package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s.h1;

public final class a {
    public final AccessorState.BlockState[] a;
    public final Error[] b;
    public final ArrayDeque c;
    public boolean d;

    public a() {
        LoadType[] arr_loadType = LoadType.values();
        AccessorState.BlockState[] arr_accessorState$BlockState = new AccessorState.BlockState[arr_loadType.length];
        for(int v1 = 0; v1 < arr_loadType.length; ++v1) {
            arr_accessorState$BlockState[v1] = AccessorState.BlockState.UNBLOCKED;
        }
        this.a = arr_accessorState$BlockState;
        LoadType[] arr_loadType1 = LoadType.values();
        Error[] arr_loadState$Error = new Error[arr_loadType1.length];
        for(int v = 0; v < arr_loadType1.length; ++v) {
            arr_loadState$Error[v] = null;
        }
        this.b = arr_loadState$Error;
        this.c = new ArrayDeque();
    }

    public final void a(LoadType loadType0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        h1 h10 = new h1(loadType0, 1);
        o.removeAll(this.c, h10);
    }

    public final LoadState b(LoadType loadType0) {
        AccessorState.BlockState accessorState$BlockState0 = this.a[loadType0.ordinal()];
        ArrayDeque arrayDeque0 = this.c;
        if(arrayDeque0 == null || !arrayDeque0.isEmpty()) {
            for(Object object0: arrayDeque0) {
                if(((AccessorState.PendingRequest)object0).getLoadType() == loadType0) {
                    if(accessorState$BlockState0 == AccessorState.BlockState.REQUIRES_REFRESH) {
                        break;
                    }
                    return Loading.INSTANCE;
                }
                if(false) {
                    break;
                }
            }
        }
        LoadState loadState0 = this.b[loadType0.ordinal()];
        if(loadState0 != null) {
            return loadState0;
        }
        switch(AccessorState.WhenMappings.$EnumSwitchMapping$1[accessorState$BlockState0.ordinal()]) {
            case 1: {
                return AccessorState.WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()] == 1 ? NotLoading.Companion.getIncomplete$paging_common_release() : NotLoading.Companion.getComplete$paging_common_release();
            }
            case 2: {
                return NotLoading.Companion.getIncomplete$paging_common_release();
            }
            case 3: {
                return NotLoading.Companion.getIncomplete$paging_common_release();
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final Pair c() {
        for(Object object0: this.c) {
            if(((AccessorState.PendingRequest)object0).getLoadType() != LoadType.REFRESH && this.a[((AccessorState.PendingRequest)object0).getLoadType().ordinal()] == AccessorState.BlockState.UNBLOCKED) {
                return ((AccessorState.PendingRequest)object0) == null ? null : TuplesKt.to(((AccessorState.PendingRequest)object0).getLoadType(), ((AccessorState.PendingRequest)object0).getPagingState());
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final void d(LoadType loadType0, AccessorState.BlockState accessorState$BlockState0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(accessorState$BlockState0, "state");
        this.a[loadType0.ordinal()] = accessorState$BlockState0;
    }

    public final void e(LoadType loadType0, Error loadState$Error0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        this.b[loadType0.ordinal()] = loadState$Error0;
    }
}

