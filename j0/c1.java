package j0;

import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class c1 extends Lambda implements Function1 {
    public final ObjectRef w;
    public final Function1 x;
    public final MutableState y;

    public c1(ObjectRef ref$ObjectRef0, Function1 function10, MutableState mutableState0) {
        this.w = ref$ObjectRef0;
        this.x = function10;
        this.y = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Integer integer0 = ClickableTextKt.access$ClickableText_03UYbkw$getOffset(this.y, ((Offset)object0).unbox-impl());
        ObjectRef ref$ObjectRef0 = this.w;
        if(!Intrinsics.areEqual(ref$ObjectRef0.element, integer0)) {
            ref$ObjectRef0.element = integer0;
            this.x.invoke(integer0);
        }
        return Unit.INSTANCE;
    }
}

