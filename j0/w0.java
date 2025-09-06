package j0;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final MutableState w;

    public w0(MutableState mutableState0) {
        this.w = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        MutableState mutableState0 = this.w;
        if(mutableState0 != null) {
            mutableState0.setValue(((List)object0));
        }
        return Unit.INSTANCE;
    }
}

