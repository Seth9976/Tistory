package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class wb extends Lambda implements Function0 {
    public final ObjectRef w;

    public wb(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (LayoutCoordinates)((MutableState)this.w.element).getValue();
    }
}

