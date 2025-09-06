package androidx.compose.ui.text.font;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final Density w;

    public l(Density density0) {
        this.w = density0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return "\'" + ((Setting)object0).getAxisName() + "\' " + ((Setting)object0).toVariationValue(this.w);
    }
}

