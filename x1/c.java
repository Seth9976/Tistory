package x1;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class c extends Lambda implements Function1 {
    public final ObjectRef w;

    public c(ObjectRef ref$ObjectRef0) {
        this.w = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ObjectRef ref$ObjectRef0 = this.w;
        if(ref$ObjectRef0.element == null && ((PointerHoverIconModifierNode)object0).q) {
            ref$ObjectRef0.element = (PointerHoverIconModifierNode)object0;
            return true;
        }
        if(ref$ObjectRef0.element != null && ((PointerHoverIconModifierNode)object0).getOverrideDescendants() && ((PointerHoverIconModifierNode)object0).q) {
            ref$ObjectRef0.element = (PointerHoverIconModifierNode)object0;
        }
        return true;
    }
}

