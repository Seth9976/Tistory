package m0;

import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function0 {
    public final int w;
    public final TextFieldDecoratorModifierNode x;

    public l0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, int v) {
        this.w = v;
        this.x = textFieldDecoratorModifierNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.getTextFieldSelectionState().paste();
                return true;
            }
            case 1: {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0 = this.x;
                if(!textFieldDecoratorModifierNode0.e()) {
                    FocusRequesterModifierNodeKt.requestFocus(textFieldDecoratorModifierNode0);
                    return true;
                }
                if(!textFieldDecoratorModifierNode0.getReadOnly()) {
                    TextFieldDecoratorModifierNode.access$requireKeyboardController(textFieldDecoratorModifierNode0).show();
                }
                return true;
            }
            case 2: {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode1 = this.x;
                if(!textFieldDecoratorModifierNode1.e()) {
                    FocusRequesterModifierNodeKt.requestFocus(textFieldDecoratorModifierNode1);
                }
                textFieldDecoratorModifierNode1.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return true;
            }
            case 3: {
                TextFieldSelectionState.copy$default(this.x.getTextFieldSelectionState(), false, 1, null);
                return true;
            }
            case 4: {
                this.x.getTextFieldSelectionState().cut();
                return true;
            }
            case 5: {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.x) == null ? TextFieldDecoratorModifierKt.a : TextFieldDecoratorModifierKt.b;
            }
            case 6: {
                int v = this.x.getKeyboardOptions().getImeActionOrDefault-eUduSuo$foundation_release();
                TextFieldDecoratorModifierNode.access$onImeActionPerformed-KlQnJC8(this.x, v);
                return Unit.INSTANCE;
            }
            case 7: {
                WindowInfo windowInfo0 = (WindowInfo)CompositionLocalConsumerModifierNodeKt.currentValueOf(this.x, CompositionLocalsKt.getLocalWindowInfo());
                this.x.F = windowInfo0;
                this.x.f();
                return Unit.INSTANCE;
            }
            case 8: {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = this.x;
                if(textFieldDecoratorModifierNode2.J != null) {
                    TextFieldDecoratorModifierNode.access$requireKeyboardController(textFieldDecoratorModifierNode2).show();
                    return Unit.INSTANCE;
                }
                textFieldDecoratorModifierNode2.g(true);
                return Unit.INSTANCE;
            }
            default: {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.x);
            }
        }
    }
}

