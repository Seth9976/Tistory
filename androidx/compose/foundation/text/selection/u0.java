package androidx.compose.foundation.text.selection;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class u0 extends Lambda implements Function1 {
    public final BooleanRef w;

    public u0(BooleanRef ref$BooleanRef0) {
        this.w = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((SelectableInfo)object0).getInputText().length() > 0) {
            this.w.element = false;
        }
        return Unit.INSTANCE;
    }
}

