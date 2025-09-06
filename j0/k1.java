package j0;

import androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.3.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function1 {
    public final int w;
    public final TextFieldSelectionManager x;

    public k1(TextFieldSelectionManager textFieldSelectionManager0, int v) {
        this.w = v;
        this.x = textFieldSelectionManager0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            this.x.showSelectionToolbar$foundation_release();
            return Unit.INSTANCE;
        }
        DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
        return new CoreTextFieldKt.CoreTextField.3.1.invoke..inlined.onDispose.1(this.x);
    }
}

