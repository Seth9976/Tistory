package l0;

import a5.b;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

public final class c implements InputTransformation {
    public final int a;

    public c(int v) {
        this.a = v;
        if(v < 0) {
            throw new IllegalArgumentException(("maxLength must be at least zero, was " + v).toString());
        }
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        SemanticsPropertiesKt.setMaxTextLength(semanticsPropertyReceiver0, this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? this.a == ((c)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return b.p(new StringBuilder("InputTransformation.maxLength("), this.a, ')');
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer0) {
        if(textFieldBuffer0.getLength() > this.a) {
            textFieldBuffer0.revertAllChanges();
        }
    }
}

