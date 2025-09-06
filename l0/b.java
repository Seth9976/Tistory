package l0;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class b implements InputTransformation {
    public final Function2 a;

    public b(Function2 function20) {
        this.a = function20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? Intrinsics.areEqual(this.a, ((b)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "InputTransformation.byValue(transformation=" + this.a + ')';
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer0) {
        TextFieldCharSequence textFieldCharSequence0 = TextFieldBuffer.toTextFieldCharSequence-udt6zUU$foundation_release$default(textFieldBuffer0, 0L, null, 3, null);
        CharSequence charSequence0 = (CharSequence)this.a.invoke(textFieldBuffer0.getOriginalValue$foundation_release(), textFieldCharSequence0);
        if(charSequence0 == textFieldCharSequence0) {
            return;
        }
        if(charSequence0 == textFieldBuffer0.getOriginalValue$foundation_release()) {
            textFieldBuffer0.revertAllChanges();
            return;
        }
        textFieldBuffer0.setTextIfChanged$foundation_release(charSequence0);
    }
}

