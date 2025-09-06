package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class pq extends Lambda implements Function1 {
    public final boolean w;

    public pq(boolean z) {
        this.w = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.setSelected(((SemanticsPropertyReceiver)object0), this.w);
        return Unit.INSTANCE;
    }
}

