package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final SubstitutingScope w;

    public c(SubstitutingScope substitutingScope0) {
        this.w = substitutingScope0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection collection0 = DefaultImpls.getContributedDescriptors$default(this.w.a, null, null, 3, null);
        return this.w.a(collection0);
    }
}

