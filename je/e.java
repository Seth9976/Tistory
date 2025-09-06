package je;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public final class e extends Lambda implements Function1 {
    public final int w;
    public final Name x;

    public e(Name name0, int v) {
        this.w = v;
        this.x = name0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((MemberScope)object0), "it");
            return ((MemberScope)object0).getContributedVariables(this.x, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
        }
        Intrinsics.checkNotNullParameter(((MemberScope)object0), "it");
        return ((MemberScope)object0).getContributedFunctions(this.x, NoLookupLocation.FROM_BUILTINS);
    }
}

