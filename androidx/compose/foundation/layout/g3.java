package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g3 extends Lambda implements Function1 {
    public final int w;
    public final Function1 x;

    public g3(Function1 function10, int v) {
        this.w = v;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            ((InspectorInfo)object0).setName("offset");
            ((InspectorInfo)object0).getProperties().set("offset", this.x);
            return Unit.INSTANCE;
        }
        ((InspectorInfo)object0).setName("absoluteOffset");
        ((InspectorInfo)object0).getProperties().set("offset", this.x);
        return Unit.INSTANCE;
    }
}

