package b2;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final MutableVector w;

    public n(MutableVector mutableVector0) {
        this.w = mutableVector0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.w.add(((Element)object0));
        return true;
    }
}

