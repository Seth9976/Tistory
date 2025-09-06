package ff;

import java.util.Collection;
import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

public final class b {
    public final Collection a;
    public List b;

    public b(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "allSupertypes");
        super();
        this.a = collection0;
        this.b = k.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
    }
}

