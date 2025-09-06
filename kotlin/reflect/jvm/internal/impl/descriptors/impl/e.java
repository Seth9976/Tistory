package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

public final class e implements Function0 {
    public final int a;
    public final Object b;

    public e(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.a) {
            case 0: {
                return TypeIntersectionScope.create(("Scope for type parameter " + ((f)this.b).a.asString()), ((f)this.b).b.getUpperBounds());
            }
            case 1: {
                j j0 = (j)this.b;
                j0.getClass();
                HashSet hashSet0 = new HashSet();
                for(Object object0: ((Set)j0.d.i.invoke())) {
                    hashSet0.addAll(j0.getContributedFunctions(((Name)object0), NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                    hashSet0.addAll(j0.getContributedVariables(((Name)object0), NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                return hashSet0;
            }
            default: {
                return (List)this.b;
            }
        }
    }
}

