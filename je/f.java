package je;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

public final class f extends Lambda implements Function1 {
    public final JvmBuiltInsCustomizer w;

    public f(JvmBuiltInsCustomizer jvmBuiltInsCustomizer0) {
        this.w = jvmBuiltInsCustomizer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((CallableMemberDescriptor)object0).getKind() == Kind.DECLARATION) {
            DeclarationDescriptor declarationDescriptor0 = ((CallableMemberDescriptor)object0).getContainingDeclaration();
            Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return JvmBuiltInsCustomizer.access$getJ2kClassMapper$p(this.w).isMutable(((ClassDescriptor)declarationDescriptor0));
        }
        return false;
    }
}

