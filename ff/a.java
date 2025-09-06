package ff;

import aa.m;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import md.c;

public final class a implements TypeConstructor {
    public final KotlinTypeRefiner a;
    public final Lazy b;
    public final AbstractTypeConstructor c;

    public a(AbstractTypeConstructor abstractTypeConstructor0, KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        this.c = abstractTypeConstructor0;
        this.a = kotlinTypeRefiner0;
        m m0 = new m(21, this, abstractTypeConstructor0);
        this.b = c.lazy(LazyThreadSafetyMode.PUBLICATION, m0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this.c.equals(object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns kotlinBuiltIns0 = this.c.getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(kotlinBuiltIns0, "this@AbstractTypeConstructor.builtIns");
        return kotlinBuiltIns0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor getDeclarationDescriptor() {
        return this.c.getDeclarationDescriptor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        List list0 = this.c.getParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "this@AbstractTypeConstructor.parameters");
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection getSupertypes() {
        return (List)this.b.getValue();
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return this.c.isDenotable();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this.c.refine(kotlinTypeRefiner0);
    }

    @Override
    public final String toString() {
        return this.c.toString();
    }
}

