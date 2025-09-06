package i4;

import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final LifecycleOwner w;
    public final State x;
    public final Function0 y;

    public a(LifecycleOwner lifecycleOwner0, State lifecycle$State0, Function0 function00) {
        this.w = lifecycleOwner0;
        this.x = lifecycle$State0;
        this.y = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w.getLifecycle().getCurrentState().isAtLeast(this.x)) {
            this.y.invoke();
        }
        return Unit.INSTANCE;
    }
}

