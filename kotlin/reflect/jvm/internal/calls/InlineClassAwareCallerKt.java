package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001A=\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u001F\u0010\u000B\u001A\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A\u001F\u0010\r\u001A\u00020\n*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\f\u001A\u0019\u0010\u000F\u001A\b\u0012\u0002\b\u0003\u0018\u00010\t*\u00020\u000EH\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u001B\u0010\u000F\u001A\b\u0012\u0002\b\u0003\u0018\u00010\t*\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u000F\u0010\u0012\u001A\u001F\u0010\u0014\u001A\u0004\u0018\u00010\u0013*\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001A\u0010\u0018\u001A\u0004\u0018\u00010\u000E*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "isDefault", "createInlineClassAwareCallerIfNeeded", "(Lkotlin/reflect/jvm/internal/calls/Caller;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "getUnboxMethod", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/reflect/Method;", "getBoxMethod", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "toInlineClass", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;)Ljava/lang/Class;", "", "coerceToExpectedReceiverType", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInlineClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/InlineClassAwareCallerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1747#2,3:220\n*S KotlinDebug\n*F\n+ 1 InlineClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/InlineClassAwareCallerKt\n*L\n156#1:220,3\n*E\n"})
public final class InlineClassAwareCallerKt {
    public static final KotlinType a(CallableMemberDescriptor callableMemberDescriptor0) {
        ReceiverParameterDescriptor receiverParameterDescriptor0 = callableMemberDescriptor0.getExtensionReceiverParameter();
        ReceiverParameterDescriptor receiverParameterDescriptor1 = callableMemberDescriptor0.getDispatchReceiverParameter();
        if(receiverParameterDescriptor0 != null) {
            return receiverParameterDescriptor0.getType();
        }
        if(receiverParameterDescriptor1 != null) {
            if(callableMemberDescriptor0 instanceof ConstructorDescriptor) {
                return receiverParameterDescriptor1.getType();
            }
            DeclarationDescriptor declarationDescriptor0 = callableMemberDescriptor0.getContainingDeclaration();
            ClassDescriptor classDescriptor0 = declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0) : null;
            if(classDescriptor0 != null) {
                return classDescriptor0.getDefaultType();
            }
        }
        return null;
    }

    @Nullable
    public static final Object coerceToExpectedReceiverType(@Nullable Object object0, @NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "descriptor");
        if(callableMemberDescriptor0 instanceof PropertyDescriptor && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(((VariableDescriptor)callableMemberDescriptor0))) {
            return object0;
        }
        KotlinType kotlinType0 = InlineClassAwareCallerKt.a(callableMemberDescriptor0);
        if(kotlinType0 != null) {
            Class class0 = InlineClassAwareCallerKt.toInlineClass(kotlinType0);
            if(class0 != null) {
                Method method0 = InlineClassAwareCallerKt.getUnboxMethod(class0, callableMemberDescriptor0);
                return method0 == null ? object0 : method0.invoke(object0, null);
            }
        }
        return object0;
    }

    @NotNull
    public static final Caller createInlineClassAwareCallerIfNeeded(@NotNull Caller caller0, @NotNull CallableMemberDescriptor callableMemberDescriptor0, boolean z) {
        Intrinsics.checkNotNullParameter(caller0, "<this>");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "descriptor");
        if(!InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfInlineClass(callableMemberDescriptor0)) {
            List list0 = callableMemberDescriptor0.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "descriptor.valueParameters");
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object0: list0) {
                    KotlinType kotlinType0 = ((ValueParameterDescriptor)object0).getType();
                    Intrinsics.checkNotNullExpressionValue(kotlinType0, "it.type");
                    if(InlineClassesUtilsKt.isInlineClassType(kotlinType0)) {
                        return new InlineClassAwareCaller(callableMemberDescriptor0, caller0, z);
                    }
                    if(false) {
                        break;
                    }
                }
            }
            KotlinType kotlinType1 = callableMemberDescriptor0.getReturnType();
            if(kotlinType1 == null || !InlineClassesUtilsKt.isInlineClassType(kotlinType1)) {
                if(caller0 instanceof BoundCaller) {
                    return caller0;
                }
                KotlinType kotlinType2 = InlineClassAwareCallerKt.a(callableMemberDescriptor0);
                if(kotlinType2 == null || !InlineClassesUtilsKt.isInlineClassType(kotlinType2)) {
                    return caller0;
                }
            }
        }
        return new InlineClassAwareCaller(callableMemberDescriptor0, caller0, z);
    }

    public static Caller createInlineClassAwareCallerIfNeeded$default(Caller caller0, CallableMemberDescriptor callableMemberDescriptor0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(caller0, callableMemberDescriptor0, z);
    }

    @NotNull
    public static final Method getBoxMethod(@NotNull Class class0, @NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "descriptor");
        try {
            Method method0 = class0.getDeclaredMethod("box-impl", InlineClassAwareCallerKt.getUnboxMethod(class0, callableMemberDescriptor0).getReturnType());
            Intrinsics.checkNotNullExpressionValue(method0, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return method0;
        }
        catch(NoSuchMethodException unused_ex) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + class0 + " (calling " + callableMemberDescriptor0 + ')');
        }
    }

    @NotNull
    public static final Method getUnboxMethod(@NotNull Class class0, @NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(class0, "<this>");
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "descriptor");
        try {
            Method method0 = class0.getDeclaredMethod("unbox-impl", null);
            Intrinsics.checkNotNullExpressionValue(method0, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return method0;
        }
        catch(NoSuchMethodException unused_ex) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + class0 + " (calling " + callableMemberDescriptor0 + ')');
        }
    }

    @Nullable
    public static final Class toInlineClass(@Nullable DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 instanceof ClassDescriptor && InlineClassesUtilsKt.isInlineClass(declarationDescriptor0)) {
            Class class0 = UtilKt.toJavaClass(((ClassDescriptor)declarationDescriptor0));
            if(class0 == null) {
                throw new KotlinReflectionInternalError("Class object for the class " + ((ClassDescriptor)declarationDescriptor0).getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId(((ClassifierDescriptor)declarationDescriptor0)) + ')');
            }
            return class0;
        }
        return null;
    }

    @Nullable
    public static final Class toInlineClass(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        Class class0 = InlineClassAwareCallerKt.toInlineClass(kotlinType0.getConstructor().getDeclarationDescriptor());
        if(class0 == null) {
            return null;
        }
        if(!TypeUtils.isNullableType(kotlinType0)) {
            return class0;
        }
        KotlinType kotlinType1 = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType0);
        if(kotlinType1 == null) {
            return null;
        }
        return TypeUtils.isNullableType(kotlinType1) || KotlinBuiltIns.isPrimitiveType(kotlinType1) ? null : class0;
    }
}

