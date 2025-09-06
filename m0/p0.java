package m0;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function1 {
    public final TextFieldDecoratorModifierNode w;

    public p0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0) {
        this.w = textFieldDecoratorModifierNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DragAndDropEvent dragAndDropEvent0 = (DragAndDropEvent)object0;
        Enter hoverInteraction$Enter0 = new Enter();
        this.w.getInteractionSource().tryEmit(hoverInteraction$Enter0);
        this.w.B = hoverInteraction$Enter0;
        ReceiveContentConfiguration receiveContentConfiguration0 = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.w);
        if(receiveContentConfiguration0 != null) {
            ReceiveContentListener receiveContentListener0 = receiveContentConfiguration0.getReceiveContentListener();
            if(receiveContentListener0 != null) {
                receiveContentListener0.onDragEnter();
            }
        }
        return Unit.INSTANCE;
    }
}

