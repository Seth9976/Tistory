package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vm extends Lambda implements Function1 {
    public final Density w;
    public final Function1 x;
    public final Function1 y;

    public vm(Function1 function10, Function1 function11, Density density0) {
        this.w = density0;
        this.x = function10;
        this.y = function11;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new SwipeToDismissBoxState(((SwipeToDismissBoxValue)object0), this.w, this.x, this.y);
    }
}

