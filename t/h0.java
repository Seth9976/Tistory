package t;

import androidx.compose.animation.core.TwoWayConverter;
import kotlin.jvm.functions.Function1;

public final class h0 implements TwoWayConverter {
    public final Function1 a;
    public final Function1 b;

    public h0(Function1 function10, Function1 function11) {
        this.a = function10;
        this.b = function11;
    }

    @Override  // androidx.compose.animation.core.TwoWayConverter
    public final Function1 getConvertFromVector() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.TwoWayConverter
    public final Function1 getConvertToVector() {
        return this.a;
    }
}

