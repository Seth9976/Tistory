package n4;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final int w;
    public final Bundle x;

    public k(int v, Bundle bundle0) {
        this.w = v;
        this.x = bundle0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((String)object0), "key");
            return Boolean.valueOf(!this.x.containsKey(((String)object0)));
        }
        Intrinsics.checkNotNullParameter(((String)object0), "argName");
        return Boolean.valueOf(!this.x.containsKey(((String)object0)));
    }
}

