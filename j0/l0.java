package j0;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function1 {
    public final MutableState w;

    public l0(MutableState mutableState0) {
        this.w = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        AnnotatedString annotatedString0 = ((TextSubstitutionValue)object0).isShowingSubstitution() ? ((TextSubstitutionValue)object0).getSubstitution() : ((TextSubstitutionValue)object0).getOriginal();
        BasicTextKt.access$BasicText_RWo7tUw$lambda$6(this.w, annotatedString0);
        return Unit.INSTANCE;
    }
}

