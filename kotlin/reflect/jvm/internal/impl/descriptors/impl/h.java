package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public final class h implements Function1 {
    public final int a;
    public final j b;

    public h(j j0, int v) {
        this.a = v;
        this.b = j0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.a != 0) {
            j j0 = this.b;
            if(((Name)object0) != null) {
                Object object1 = j0.d.getTypeConstructor().getSupertypes().iterator().next();
                MemberScope memberScope0 = ((KotlinType)object1).getMemberScope();
                if(memberScope0 != null) {
                    return j0.b(((Name)object0), memberScope0.getContributedVariables(((Name)object0), NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                j.a(9);
                throw null;
            }
            j0.getClass();
            j.a(4);
            throw null;
        }
        j j1 = this.b;
        if(((Name)object0) != null) {
            Object object2 = j1.d.getTypeConstructor().getSupertypes().iterator().next();
            MemberScope memberScope1 = ((KotlinType)object2).getMemberScope();
            if(memberScope1 != null) {
                return j1.b(((Name)object0), memberScope1.getContributedFunctions(((Name)object0), NoLookupLocation.FOR_NON_TRACKED_SCOPE));
            }
            j.a(9);
            throw null;
        }
        j1.getClass();
        j.a(8);
        throw null;
    }
}

