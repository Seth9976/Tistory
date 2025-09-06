package androidx.compose.foundation.text;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final LegacyTextFieldState w;
    public final SemanticsPropertyReceiver x;

    public e(LegacyTextFieldState legacyTextFieldState0, SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        this.w = legacyTextFieldState0;
        this.x = semanticsPropertyReceiver0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Unit unit0;
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        TextInputSession textInputSession0 = legacyTextFieldState0.getInputSession();
        if(textInputSession0 == null) {
            unit0 = null;
        }
        else {
            List list0 = CollectionsKt__CollectionsKt.listOf(new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(((AnnotatedString)object0), 1)});
            TextFieldDelegate.Companion.onEditCommand$foundation_release(list0, legacyTextFieldState0.getProcessor(), legacyTextFieldState0.getOnValueChange(), textInputSession0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            legacyTextFieldState0.getOnValueChange().invoke(new TextFieldValue(((AnnotatedString)object0).getText(), TextRangeKt.TextRange(((AnnotatedString)object0).getText().length()), null, 4, null));
        }
        return true;
    }
}

