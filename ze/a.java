package ze;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality;
import va.v;

public final class a implements TypeConstructorEquality {
    public final boolean a;
    public final CallableDescriptor b;
    public final CallableDescriptor c;

    public a(CallableDescriptor callableDescriptor0, CallableDescriptor callableDescriptor1, boolean z) {
        this.a = z;
        this.b = callableDescriptor0;
        this.c = callableDescriptor1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker$TypeConstructorEquality
    public final boolean equals(TypeConstructor typeConstructor0, TypeConstructor typeConstructor1) {
        CallableDescriptor callableDescriptor0 = this.b;
        Intrinsics.checkNotNullParameter(callableDescriptor0, "$a");
        CallableDescriptor callableDescriptor1 = this.c;
        Intrinsics.checkNotNullParameter(callableDescriptor1, "$b");
        Intrinsics.checkNotNullParameter(typeConstructor0, "c1");
        Intrinsics.checkNotNullParameter(typeConstructor1, "c2");
        if(Intrinsics.areEqual(typeConstructor0, typeConstructor1)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptor0 = typeConstructor0.getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptor1 = typeConstructor1.getDeclarationDescriptor();
        if(classifierDescriptor0 instanceof TypeParameterDescriptor && classifierDescriptor1 instanceof TypeParameterDescriptor) {
            v v0 = new v(4, callableDescriptor0, callableDescriptor1);
            return DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(((TypeParameterDescriptor)classifierDescriptor0), ((TypeParameterDescriptor)classifierDescriptor1), this.a, v0);
        }
        return false;
    }
}

