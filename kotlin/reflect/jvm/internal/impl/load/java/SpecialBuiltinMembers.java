package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;
import oe.f;
import oe.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "SpecialBuiltinMembers")
@SourceDebugExtension({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/SpecialBuiltinMembers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class SpecialBuiltinMembers {
    public static final boolean doesOverrideBuiltinWithDifferentJvmName(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        return SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor0) != null;
    }

    @Nullable
    public static final String getJvmMethodNameIfSpecial(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "callableMemberDescriptor");
        CallableMemberDescriptor callableMemberDescriptor1 = KotlinBuiltIns.isBuiltIn(callableMemberDescriptor0) ? SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor0) : null;
        if(callableMemberDescriptor1 != null) {
            CallableMemberDescriptor callableMemberDescriptor2 = DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor1);
            if(callableMemberDescriptor2 != null) {
                if(callableMemberDescriptor2 instanceof PropertyDescriptor) {
                    return ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(callableMemberDescriptor2);
                }
                if(callableMemberDescriptor2 instanceof SimpleFunctionDescriptor) {
                    Name name0 = BuiltinMethodsWithDifferentJvmName.INSTANCE.getJvmName(((SimpleFunctionDescriptor)callableMemberDescriptor2));
                    return name0 == null ? null : name0.asString();
                }
            }
        }
        return null;
    }

    @Nullable
    public static final CallableMemberDescriptor getOverriddenBuiltinWithDifferentJvmName(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        Name name0 = callableMemberDescriptor0.getName();
        if(!SpecialGenericSignatures.Companion.getORIGINAL_SHORT_NAMES().contains(name0)) {
            Name name1 = DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor0).getName();
            if(!BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(name1)) {
                return null;
            }
        }
        if((callableMemberDescriptor0 instanceof PropertyDescriptor ? true : callableMemberDescriptor0 instanceof PropertyAccessorDescriptor)) {
            return DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor0, false, f.w, 1, null);
        }
        return callableMemberDescriptor0 instanceof SimpleFunctionDescriptor ? DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor0, false, g.w, 1, null) : null;
    }

    @Nullable
    public static final CallableMemberDescriptor getOverriddenSpecialBuiltin(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        CallableMemberDescriptor callableMemberDescriptor1 = SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor0);
        if(callableMemberDescriptor1 != null) {
            return callableMemberDescriptor1;
        }
        Name name0 = callableMemberDescriptor0.getName();
        Intrinsics.checkNotNullExpressionValue(name0, "name");
        return BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name0) ? DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor0, false, c.w, 1, null) : null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(@NotNull ClassDescriptor classDescriptor0, @NotNull CallableDescriptor callableDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(callableDescriptor0, "specialCallableDescriptor");
        DeclarationDescriptor declarationDescriptor0 = callableDescriptor0.getContainingDeclaration();
        Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        SimpleType simpleType0 = ((ClassDescriptor)declarationDescriptor0).getDefaultType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "specialCallableDescripto…ssDescriptor).defaultType");
        for(ClassDescriptor classDescriptor1 = DescriptorUtils.getSuperClassDescriptor(classDescriptor0); classDescriptor1 != null; classDescriptor1 = DescriptorUtils.getSuperClassDescriptor(classDescriptor1)) {
            if(!(classDescriptor1 instanceof JavaClassDescriptor) && TypeCheckingProcedure.findCorrespondingSupertype(classDescriptor1.getDefaultType(), simpleType0) != null) {
                return !KotlinBuiltIns.isBuiltIn(classDescriptor1);
            }
        }
        return false;
    }

    public static final boolean isFromJava(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        return DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor0).getContainingDeclaration() instanceof JavaClassDescriptor;
    }

    public static final boolean isFromJavaOrBuiltins(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        return SpecialBuiltinMembers.isFromJava(callableMemberDescriptor0) || KotlinBuiltIns.isBuiltIn(callableMemberDescriptor0);
    }
}

