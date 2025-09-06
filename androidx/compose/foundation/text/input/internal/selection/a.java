package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final TextFieldMagnifierNodeImpl28 w;

    public a(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl280) {
        this.w = textFieldMagnifierNodeImpl280;
        super(0);
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w.s || this.w.q.getDirectDragGestureInitiator() == InputType.Touch ? Offset.box-impl(TextFieldMagnifierKt.calculateSelectionMagnifierCenterAndroid-hUlJWOE(this.w.p, this.w.q, this.w.r, TextFieldMagnifierNodeImpl28.access$getMagnifierSize-YbymL2g(this.w))) : Offset.box-impl(0x7FC000007FC00000L);
    }
}

