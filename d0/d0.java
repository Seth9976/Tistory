package d0;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final int w;
    public final SaveableStateRegistry x;

    public d0(SaveableStateRegistry saveableStateRegistry0, int v) {
        this.w = v;
        this.x = saveableStateRegistry0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            return new f0(this.x, ((Map)object0));
        }
        return this.x == null ? true : Boolean.valueOf(this.x.canBeSaved(object0));
    }
}

