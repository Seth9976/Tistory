package y0;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

public final class i1 extends Lambda implements Function2 {
    public final Channel w;

    public i1(Channel channel0) {
        this.w = channel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Snapshot snapshot0 = (Snapshot)object1;
        if(((Set)object0) instanceof ScatterSetWrapper) {
            ScatterSet scatterSet0 = ((ScatterSetWrapper)(((Set)object0))).getSet$runtime_release();
            Object[] arr_object = scatterSet0.elements;
            long[] arr_v = scatterSet0.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_22;
                    }
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            Object object2 = arr_object[(v1 << 3) + v4];
                            if(!(object2 instanceof StateObjectImpl) || ((StateObjectImpl)object2).isReadIn-h_f27i8$runtime_release(4)) {
                                this.w.trySend-JP2dKIU(((Set)object0));
                                return Unit.INSTANCE;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                    label_22:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    break;
                }
            }
        }
        else if(!(((Set)object0) instanceof Collection) || !((Set)object0).isEmpty()) {
            for(Object object3: ((Set)object0)) {
                if(!(object3 instanceof StateObjectImpl) || ((StateObjectImpl)object3).isReadIn-h_f27i8$runtime_release(4)) {
                    this.w.trySend-JP2dKIU(((Set)object0));
                    break;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

