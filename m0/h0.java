package m0;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;

public final class h0 extends Lambda implements Function0 {
    public final TextFieldCoreModifierNode w;
    public final IntRef x;

    public h0(TextFieldCoreModifierNode textFieldCoreModifierNode0, IntRef ref$IntRef0) {
        this.w = textFieldCoreModifierNode0;
        this.x = ref$IntRef0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.s.getVisualText();
        Integer integer0 = (int)((!this.w.isAttached() || !((WindowInfo)CompositionLocalConsumerModifierNodeKt.currentValueOf(this.w, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() ? 2 : 1) * this.x.element);
        this.x.element = -this.x.element;
        return integer0;
    }
}

