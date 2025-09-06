package l0;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.Intrinsics;

public final class a implements InputTransformation {
    public final InputTransformation a;
    public final InputTransformation b;

    public a(InputTransformation inputTransformation0, InputTransformation inputTransformation1) {
        this.a = inputTransformation0;
        this.b = inputTransformation1;
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        this.a.applySemantics(semanticsPropertyReceiver0);
        this.b.applySemantics(semanticsPropertyReceiver0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        if(a.class != class0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((a)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((a)object0).b) ? Intrinsics.areEqual(this.getKeyboardOptions(), ((a)object0).getKeyboardOptions()) : false;
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final KeyboardOptions getKeyboardOptions() {
        KeyboardOptions keyboardOptions0 = this.b.getKeyboardOptions();
        InputTransformation inputTransformation0 = this.a;
        if(keyboardOptions0 != null) {
            KeyboardOptions keyboardOptions1 = keyboardOptions0.fillUnspecifiedValuesWith$foundation_release(inputTransformation0.getKeyboardOptions());
            return keyboardOptions1 == null ? inputTransformation0.getKeyboardOptions() : keyboardOptions1;
        }
        return inputTransformation0.getKeyboardOptions();
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        KeyboardOptions keyboardOptions0 = this.getKeyboardOptions();
        return keyboardOptions0 == null ? (v1 + v * 0x1F) * 0x20 : (v1 + v * 0x1F) * 0x20 + keyboardOptions0.hashCode();
    }

    @Override
    public final String toString() {
        return this.a + ".then(" + this.b + ')';
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer0) {
        this.a.transformInput(textFieldBuffer0);
        this.b.transformInput(textFieldBuffer0);
    }
}

