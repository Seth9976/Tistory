package androidx.compose.foundation.text;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

public final class f extends Lambda implements Function1 {
    public final TextFieldValue A;
    public final boolean w;
    public final boolean x;
    public final LegacyTextFieldState y;
    public final SemanticsPropertyReceiver z;

    public f(boolean z, boolean z1, LegacyTextFieldState legacyTextFieldState0, SemanticsPropertyReceiver semanticsPropertyReceiver0, TextFieldValue textFieldValue0) {
        this.w = z;
        this.x = z1;
        this.y = legacyTextFieldState0;
        this.z = semanticsPropertyReceiver0;
        this.A = textFieldValue0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Unit unit0;
        if(!this.w && this.x) {
            LegacyTextFieldState legacyTextFieldState0 = this.y;
            TextInputSession textInputSession0 = legacyTextFieldState0.getInputSession();
            if(textInputSession0 == null) {
                unit0 = null;
            }
            else {
                List list0 = CollectionsKt__CollectionsKt.listOf(new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(((AnnotatedString)object0), 1)});
                TextFieldDelegate.Companion.onEditCommand$foundation_release(list0, legacyTextFieldState0.getProcessor(), legacyTextFieldState0.getOnValueChange(), textInputSession0);
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                legacyTextFieldState0.getOnValueChange().invoke(new TextFieldValue(StringsKt__StringsKt.replaceRange(this.A.getText(), TextRange.getStart-impl(this.A.getSelection-d9O1mEE()), TextRange.getEnd-impl(this.A.getSelection-d9O1mEE()), ((AnnotatedString)object0)).toString(), TextRangeKt.TextRange(((AnnotatedString)object0).length() + TextRange.getStart-impl(this.A.getSelection-d9O1mEE())), null, 4, null));
            }
            return true;
        }
        return false;
    }
}

