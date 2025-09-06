package j0;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function0 {
    public final MutableState w;

    public u0(MutableState mutableState0) {
        this.w = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState0 = this.w;
        return mutableState0 != null ? ((List)mutableState0.getValue()) : null;
    }
}

