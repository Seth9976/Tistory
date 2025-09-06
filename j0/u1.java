package j0;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.e;
import androidx.compose.foundation.text.f;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.jf;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u1 extends Lambda implements Function1 {
    public final boolean A;
    public final ImeOptions B;
    public final LegacyTextFieldState C;
    public final OffsetMapping D;
    public final TextFieldSelectionManager E;
    public final FocusRequester F;
    public final TransformedText w;
    public final TextFieldValue x;
    public final boolean y;
    public final boolean z;

    public u1(TransformedText transformedText0, TextFieldValue textFieldValue0, boolean z, boolean z1, boolean z2, ImeOptions imeOptions0, LegacyTextFieldState legacyTextFieldState0, OffsetMapping offsetMapping0, TextFieldSelectionManager textFieldSelectionManager0, FocusRequester focusRequester0) {
        this.w = transformedText0;
        this.x = textFieldValue0;
        this.y = z;
        this.z = z1;
        this.A = z2;
        this.B = imeOptions0;
        this.C = legacyTextFieldState0;
        this.D = offsetMapping0;
        this.E = textFieldSelectionManager0;
        this.F = focusRequester0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.setEditableText(((SemanticsPropertyReceiver)object0), this.w.getText());
        TextFieldValue textFieldValue0 = this.x;
        SemanticsPropertiesKt.setTextSelectionRange-FDrldGo(((SemanticsPropertyReceiver)object0), textFieldValue0.getSelection-d9O1mEE());
        boolean z = this.y;
        if(!z) {
            SemanticsPropertiesKt.disabled(((SemanticsPropertyReceiver)object0));
        }
        boolean z1 = this.z;
        if(z1) {
            SemanticsPropertiesKt.password(((SemanticsPropertyReceiver)object0));
        }
        boolean z2 = this.A;
        boolean z3 = z && !z2;
        SemanticsPropertiesKt.setEditable(((SemanticsPropertyReceiver)object0), z3);
        LegacyTextFieldState legacyTextFieldState0 = this.C;
        SemanticsPropertiesKt.getTextLayoutResult$default(((SemanticsPropertyReceiver)object0), null, new p1(legacyTextFieldState0, 2), 1, null);
        if(z3) {
            SemanticsPropertiesKt.setText$default(((SemanticsPropertyReceiver)object0), null, new e(legacyTextFieldState0, ((SemanticsPropertyReceiver)object0)), 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(((SemanticsPropertyReceiver)object0), null, new f(this.A, this.y, this.C, ((SemanticsPropertyReceiver)object0), this.x), 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(((SemanticsPropertyReceiver)object0), null, new s1(this.D, this.y, this.x, this.E, this.C, 0), 1, null);
        t1 t10 = new t1(0, legacyTextFieldState0, this.B);
        SemanticsPropertiesKt.onImeAction-9UiTYpY$default(((SemanticsPropertyReceiver)object0), this.B.getImeAction-eUduSuo(), null, t10, 2, null);
        SemanticsPropertiesKt.onClick$default(((SemanticsPropertyReceiver)object0), null, new jf(legacyTextFieldState0, this.F, z2, 2), 1, null);
        TextFieldSelectionManager textFieldSelectionManager0 = this.E;
        SemanticsPropertiesKt.onLongClick$default(((SemanticsPropertyReceiver)object0), null, new androidx.compose.foundation.text.selection.t1(textFieldSelectionManager0, 5), 1, null);
        if(!TextRange.getCollapsed-impl(textFieldValue0.getSelection-d9O1mEE()) && !z1) {
            SemanticsPropertiesKt.copyText$default(((SemanticsPropertyReceiver)object0), null, new androidx.compose.foundation.text.selection.t1(textFieldSelectionManager0, 6), 1, null);
            if(z && !z2) {
                SemanticsPropertiesKt.cutText$default(((SemanticsPropertyReceiver)object0), null, new androidx.compose.foundation.text.selection.t1(textFieldSelectionManager0, 7), 1, null);
            }
        }
        if(z && !z2) {
            SemanticsPropertiesKt.pasteText$default(((SemanticsPropertyReceiver)object0), null, new androidx.compose.foundation.text.selection.t1(textFieldSelectionManager0, 4), 1, null);
        }
        return Unit.INSTANCE;
    }
}

