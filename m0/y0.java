package m0;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableSharedFlow;

public final class y0 extends Lambda implements Function0 {
    public final TextFieldDecoratorModifierNode w;
    public final KeyboardOptions x;

    public y0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, KeyboardOptions keyboardOptions0) {
        this.w = textFieldDecoratorModifierNode0;
        this.x = keyboardOptions0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0 = this.w;
        if(!textFieldDecoratorModifierNode0.e()) {
            FocusRequesterModifierNodeKt.requestFocus(textFieldDecoratorModifierNode0);
        }
        if(!KeyboardType.equals-impl0(this.x.getKeyboardType-PjHm6EE(), 7) && !KeyboardType.equals-impl0(this.x.getKeyboardType-PjHm6EE(), 8)) {
            MutableSharedFlow mutableSharedFlow0 = TextFieldDecoratorModifierNode.access$getStylusHandwritingTrigger(textFieldDecoratorModifierNode0);
            if(mutableSharedFlow0 != null) {
                mutableSharedFlow0.tryEmit(Unit.INSTANCE);
            }
        }
        return true;
    }
}

