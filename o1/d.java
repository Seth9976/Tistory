package o1;

import androidx.compose.ui.focus.FocusOrderToProperties;
import androidx.compose.ui.focus.FocusProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final int w;
    public final FocusOrderToProperties x;

    public d(FocusOrderToProperties focusOrderToProperties0, int v) {
        this.w = v;
        this.x = focusOrderToProperties0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            this.x.apply(((FocusProperties)object0));
            return Unit.INSTANCE;
        }
        this.x.apply(((FocusProperties)object0));
        return Unit.INSTANCE;
    }
}

