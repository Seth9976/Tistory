package fe;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KParameterImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

public final class m extends Lambda implements Function0 {
    public final KParameterImpl w;

    public m(KParameterImpl kParameterImpl0) {
        this.w = kParameterImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KParameterImpl kParameterImpl0 = this.w;
        ParameterDescriptor parameterDescriptor0 = KParameterImpl.access$getDescriptor(kParameterImpl0);
        if(parameterDescriptor0 instanceof ReceiverParameterDescriptor && Intrinsics.areEqual(UtilKt.getInstanceReceiverParameter(kParameterImpl0.getCallable().getDescriptor()), parameterDescriptor0) && kParameterImpl0.getCallable().getDescriptor().getKind() == Kind.FAKE_OVERRIDE) {
            DeclarationDescriptor declarationDescriptor0 = kParameterImpl0.getCallable().getDescriptor().getContainingDeclaration();
            Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Type type0 = UtilKt.toJavaClass(((ClassDescriptor)declarationDescriptor0));
            if(type0 == null) {
                throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptor0);
            }
            return type0;
        }
        return (Type)kParameterImpl0.getCallable().getCaller().getParameterTypes().get(kParameterImpl0.getIndex());
    }
}

