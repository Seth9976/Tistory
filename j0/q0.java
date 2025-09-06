package j0;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function0 {
    public final int w;
    public final SelectionRegistrar x;

    public q0(SelectionRegistrar selectionRegistrar0, int v) {
        this.w = v;
        this.x = selectionRegistrar0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.x.nextSelectableId();
    }
}

