package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

public final class c extends Lambda implements Function1 {
    public final int w;
    public final AbstractTypeAliasDescriptor x;

    public c(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor0, int v) {
        this.w = v;
        this.x = abstractTypeAliasDescriptor0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullExpressionValue(((UnwrappedType)object0), "type");
            if(!KotlinTypeKt.isError(((UnwrappedType)object0))) {
                ClassifierDescriptor classifierDescriptor0 = ((UnwrappedType)object0).getConstructor().getDeclarationDescriptor();
                return !(classifierDescriptor0 instanceof TypeParameterDescriptor) || Intrinsics.areEqual(((TypeParameterDescriptor)classifierDescriptor0).getContainingDeclaration(), this.x) ? false : true;
            }
            return false;
        }
        ClassifierDescriptor classifierDescriptor1 = ((KotlinTypeRefiner)object0).refineDescriptor(this.x);
        return classifierDescriptor1 != null ? classifierDescriptor1.getDefaultType() : null;
    }
}

