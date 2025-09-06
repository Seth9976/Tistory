package m0;

import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o0 extends Lambda implements Function2 {
    public final TextFieldDecoratorModifierNode w;

    public o0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0) {
        this.w = textFieldDecoratorModifierNode0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0 = this.w;
        TextFieldDecoratorModifierNode.access$emitDragExitEvent(textFieldDecoratorModifierNode0);
        textFieldDecoratorModifierNode0.getTextFieldSelectionState().clearHandleDragging();
        String s = TransferableContent_androidKt.readPlainText(((ClipEntry)object0));
        ReceiveContentConfiguration receiveContentConfiguration0 = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode0);
        if(receiveContentConfiguration0 != null) {
            TransferableContent transferableContent0 = new TransferableContent(((ClipEntry)object0), ((ClipMetadata)object1), 1, null, 8, null);
            TransferableContent transferableContent1 = receiveContentConfiguration0.getReceiveContentListener().onReceive(transferableContent0);
            if(transferableContent1 == null) {
                s = null;
            }
            else {
                ClipEntry clipEntry0 = transferableContent1.getClipEntry();
                s = clipEntry0 == null ? null : TransferableContent_androidKt.readPlainText(clipEntry0);
            }
        }
        if(s != null) {
            TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode0.getTextFieldState(), s, false, null, 6, null);
        }
        return true;
    }
}

