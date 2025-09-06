package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class p0 extends Lambda implements Function1 {
    public final Function1 w;
    public final ObjectRef x;
    public final MediatorLiveData y;

    public p0(Function1 function10, ObjectRef ref$ObjectRef0, MediatorLiveData mediatorLiveData0) {
        this.w = function10;
        this.x = ref$ObjectRef0;
        this.y = mediatorLiveData0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LiveData liveData0 = (LiveData)this.w.invoke(object0);
        ObjectRef ref$ObjectRef0 = this.x;
        Object object1 = ref$ObjectRef0.element;
        if(object1 != liveData0) {
            MediatorLiveData mediatorLiveData0 = this.y;
            if(object1 != null) {
                Intrinsics.checkNotNull(object1);
                mediatorLiveData0.removeSource(((LiveData)object1));
            }
            ref$ObjectRef0.element = liveData0;
            if(liveData0 != null) {
                Intrinsics.checkNotNull(liveData0);
                mediatorLiveData0.addSource(liveData0, new o0(new i(mediatorLiveData0, 1), 0));
            }
        }
        return Unit.INSTANCE;
    }
}

