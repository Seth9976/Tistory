package fg;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KType;

public final class i extends Lambda implements Function0 {
    public final int w;
    public final ArrayList x;

    public i(ArrayList arrayList0, int v) {
        this.w = v;
        this.x = arrayList0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? this.x : ((KType)this.x.get(0)).getClassifier();
    }
}

