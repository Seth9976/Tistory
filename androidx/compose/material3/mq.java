package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class mq extends Lambda implements Function1 {
    public final String w;

    public mq(String s) {
        this.w = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.setRole-kuIjeqM(((SemanticsPropertyReceiver)object0), 3);
        SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.w);
        return Unit.INSTANCE;
    }
}

