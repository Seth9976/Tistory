package s4;

import androidx.paging.AccessorState.BlockState;
import androidx.paging.AccessorState.PendingRequest;
import androidx.paging.LoadType;
import androidx.paging.a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function1 {
    public static final a1 A;
    public static final a1 B;
    public static final a1 C;
    public static final a1 D;
    public final int w;
    public static final a1 x;
    public static final a1 y;
    public static final a1 z;

    static {
        a1.x = new a1(1, 0);
        a1.y = new a1(1, 1);
        a1.z = new a1(1, 2);
        a1.A = new a1(1, 3);
        a1.B = new a1(1, 4);
        a1.C = new a1(1, 5);
        a1.D = new a1(1, 6);
    }

    public a1(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((WeakReference)object0), "it");
                return ((WeakReference)object0).get() == null;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((WeakReference)object0), "it");
                return ((WeakReference)object0).get() == null;
            }
            case 2: {
                Intrinsics.checkNotNullParameter(((Function0)object0), "it");
                ((Function0)object0).invoke();
                return Unit.INSTANCE;
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((a)object0), "it");
                ((a)object0).d = true;
                return Unit.INSTANCE;
            }
            case 4: {
                Intrinsics.checkNotNullParameter(((a)object0), "it");
                ((a)object0).d(LoadType.APPEND, AccessorState.BlockState.REQUIRES_REFRESH);
                ((a)object0).d(LoadType.PREPEND, AccessorState.BlockState.REQUIRES_REFRESH);
                return Unit.INSTANCE;
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((a)object0), "it");
                return ((a)object0).c();
            }
            default: {
                Intrinsics.checkNotNullParameter(((a)object0), "it");
                for(Object object1: ((a)object0).c) {
                    if(((AccessorState.PendingRequest)object1).getLoadType() == LoadType.REFRESH) {
                        return ((AccessorState.PendingRequest)object1) == null ? null : ((AccessorState.PendingRequest)object1).getPagingState();
                    }
                    if(false) {
                        break;
                    }
                }
                return null;
            }
        }
    }
}

