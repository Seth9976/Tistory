package p5;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final String w;

    public l(String s) {
        this.w = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.w);
        SemanticsPropertiesKt.setRole-kuIjeqM(((SemanticsPropertyReceiver)object0), 5);
        return Unit.INSTANCE;
    }
}

