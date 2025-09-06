package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

public final class i extends Lambda implements Function2 {
    public final Recomposer w;

    public i(Recomposer recomposer0) {
        this.w = recomposer0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CancellableContinuation cancellableContinuation0;
        Snapshot snapshot0 = (Snapshot)object1;
        Object object2 = this.w.c;
        Recomposer recomposer0 = this.w;
        synchronized(object2) {
            if(((State)recomposer0.u.getValue()).compareTo(State.Idle) >= 0) {
                MutableScatterSet mutableScatterSet0 = recomposer0.h;
                if(((Set)object0) instanceof ScatterSetWrapper) {
                    ScatterSet scatterSet0 = ((ScatterSetWrapper)(((Set)object0))).getSet$runtime_release();
                    Object[] arr_object = scatterSet0.elements;
                    long[] arr_v = scatterSet0.metadata;
                    int v1 = arr_v.length - 2;
                    if(v1 >= 0) {
                        int v2 = 0;
                        while(true) {
                            long v3 = arr_v[v2];
                            if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_27;
                            }
                            int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                            for(int v5 = 0; v5 < v4; ++v5) {
                                if((0xFFL & v3) < 0x80L) {
                                    Object object3 = arr_object[(v2 << 3) + v5];
                                    if(!(object3 instanceof StateObjectImpl) || ((StateObjectImpl)object3).isReadIn-h_f27i8$runtime_release(1)) {
                                        mutableScatterSet0.add(object3);
                                    }
                                }
                                v3 >>= 8;
                            }
                            if(v4 == 8) {
                            label_27:
                                if(v2 != v1) {
                                    ++v2;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
                else {
                    for(Object object4: ((Set)object0)) {
                        if(!(object4 instanceof StateObjectImpl) || ((StateObjectImpl)object4).isReadIn-h_f27i8$runtime_release(1)) {
                            mutableScatterSet0.add(object4);
                        }
                    }
                }
                cancellableContinuation0 = recomposer0.b();
            }
            else {
                cancellableContinuation0 = null;
            }
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}

