package m0;

import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function0 {
    public final int w;
    public final TextFieldDecoratorModifierNode x;
    public final int y;

    public n0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, int v, int v1) {
        this.w = v1;
        this.x = textFieldDecoratorModifierNode0;
        this.y = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.I.defaultKeyboardAction-KlQnJC8(this.y);
            return Unit.INSTANCE;
        }
        TextFieldDecoratorModifierNode.access$onImeActionPerformed-KlQnJC8(this.x, this.y);
        return true;
    }
}

