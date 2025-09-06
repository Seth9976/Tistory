package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class n0 extends Lambda implements Function1 {
    public final MediatorLiveData w;
    public final BooleanRef x;

    public n0(MediatorLiveData mediatorLiveData0, BooleanRef ref$BooleanRef0) {
        this.w = mediatorLiveData0;
        this.x = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        MediatorLiveData mediatorLiveData0 = this.w;
        Object object1 = mediatorLiveData0.getValue();
        BooleanRef ref$BooleanRef0 = this.x;
        if(ref$BooleanRef0.element || object1 == null && object0 != null || object1 != null && !Intrinsics.areEqual(object1, object0)) {
            ref$BooleanRef0.element = false;
            mediatorLiveData0.setValue(object0);
        }
        return Unit.INSTANCE;
    }
}

