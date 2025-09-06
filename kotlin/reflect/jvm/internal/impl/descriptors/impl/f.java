package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

public final class f implements Function0 {
    public final Name a;
    public final AbstractTypeParameterDescriptor b;

    public f(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor0, Name name0) {
        this.b = abstractTypeParameterDescriptor0;
        this.a = name0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this.b.getTypeConstructor(), Collections.emptyList(), false, new LazyScopeAdapter(new e(this, 0)));
    }
}

