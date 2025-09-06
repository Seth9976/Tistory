package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.intl.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class a implements InputTransformation {
    public final Locale a;
    public final KeyboardOptions b;

    public a(Locale locale0) {
        this.a = locale0;
        this.b = new KeyboardOptions(1, null, 0, 0, null, null, null, 0x7E, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? Intrinsics.areEqual(this.a, ((a)object0).a) : false;
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final KeyboardOptions getKeyboardOptions() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "InputTransformation.allCaps(locale=" + this.a + ')';
    }

    @Override  // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer0) {
        ChangeList textFieldBuffer$ChangeList0 = textFieldBuffer0.getChanges();
        for(int v = 0; v < textFieldBuffer$ChangeList0.getChangeCount(); ++v) {
            long v1 = textFieldBuffer$ChangeList0.getRange--jx7JFs(v);
            textFieldBuffer$ChangeList0.getOriginalRange--jx7JFs(v);
            if(!TextRange.getCollapsed-impl(v1)) {
                textFieldBuffer0.replace(TextRange.getMin-impl(v1), TextRange.getMax-impl(v1), StringKt.toUpperCase(TextRangeKt.substring-FDrldGo(textFieldBuffer0.asCharSequence(), v1), this.a));
            }
        }
    }
}

