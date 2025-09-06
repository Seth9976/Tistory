package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class a implements Function1 {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Object object1 = this.b;
        if(this.a != 0) {
            if(((SimpleType)object0) != null) {
                return ((LazySubstitutingClassDescriptor)object1).b.isEmpty() ? ((SimpleType)object0) : ((SimpleType)((LazySubstitutingClassDescriptor)object1).b().substitute(((SimpleType)object0), Variance.INVARIANT));
            }
            ((LazySubstitutingClassDescriptor)object1).getClass();
            return (SimpleType)object0;
        }
        ClassifierDescriptor classifierDescriptor0 = ((KotlinTypeRefiner)object0).refineDescriptor(((b)object1).b);
        if(classifierDescriptor0 == null) {
            return (SimpleType)((b)object1).b.defaultType.invoke();
        }
        if(classifierDescriptor0 instanceof TypeAliasDescriptor) {
            return KotlinTypeFactory.computeExpandedType(((TypeAliasDescriptor)classifierDescriptor0), TypeUtils.getDefaultTypeProjections(classifierDescriptor0.getTypeConstructor().getParameters()));
        }
        return classifierDescriptor0 instanceof ModuleAwareClassDescriptor ? TypeUtils.makeUnsubstitutedType(classifierDescriptor0.getTypeConstructor().refine(((KotlinTypeRefiner)object0)), ((ModuleAwareClassDescriptor)classifierDescriptor0).getUnsubstitutedMemberScope(((KotlinTypeRefiner)object0)), this) : classifierDescriptor0.getDefaultType();
    }
}

