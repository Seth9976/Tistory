package s4;

import androidx.paging.AccessorState.BlockState;
import androidx.paging.LoadState.Error;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import androidx.paging.LoadType;
import androidx.paging.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u1 extends Lambda implements Function1 {
    public final int w;
    public final ArrayList x;

    public u1(ArrayList arrayList0, int v) {
        this.w = v;
        this.x = arrayList0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((a)object0), "accessorState");
                LoadState loadState0 = ((a)object0).b(LoadType.REFRESH);
                LoadState loadState1 = ((a)object0).b(LoadType.APPEND);
                LoadStates loadStates0 = new LoadStates(loadState0, ((a)object0).b(LoadType.PREPEND), loadState1);
                LoadState loadState2 = loadStates0.getRefresh();
                Error[] arr_loadState$Error = ((a)object0).b;
                for(int v = 0; v < arr_loadState$Error.length; ++v) {
                    arr_loadState$Error[v] = null;
                }
                ArrayList arrayList0 = this.x;
                if(loadState2 instanceof Error) {
                    arrayList0.add(LoadType.REFRESH);
                    ((a)object0).d(LoadType.REFRESH, AccessorState.BlockState.UNBLOCKED);
                }
                if(loadStates0.getAppend() instanceof Error) {
                    if(!(loadState2 instanceof Error)) {
                        arrayList0.add(LoadType.APPEND);
                    }
                    ((a)object0).a(LoadType.APPEND);
                }
                if(loadStates0.getPrepend() instanceof Error) {
                    if(!(loadState2 instanceof Error)) {
                        arrayList0.add(LoadType.PREPEND);
                    }
                    ((a)object0).a(LoadType.PREPEND);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((String)object0), "it");
                this.x.add(((String)object0));
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((String)object0), "it");
                this.x.add(((String)object0));
                return Unit.INSTANCE;
            }
        }
    }
}

