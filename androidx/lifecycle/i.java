package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final int w;
    public final MediatorLiveData x;

    public i(MediatorLiveData mediatorLiveData0, int v) {
        this.w = v;
        this.x = mediatorLiveData0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                this.x.setValue(object0);
                return Unit.INSTANCE;
            }
            case 1: {
                this.x.setValue(object0);
                return Unit.INSTANCE;
            }
            default: {
                this.x.setValue(object0);
                return Unit.INSTANCE;
            }
        }
    }
}

