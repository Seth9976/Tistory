package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

public final class DescriptorsJvmAbiUtil {
    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: 
            case 2: {
                arr_object[0] = "companionObject";
                break;
            }
            case 3: {
                arr_object[0] = "memberDescriptor";
                break;
            }
            default: {
                arr_object[0] = "propertyDescriptor";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        switch(v) {
            case 1: {
                arr_object[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            }
            case 2: {
                arr_object[2] = "isMappedIntrinsicCompanionObject";
                break;
            }
            case 3: {
                arr_object[2] = "hasJvmFieldAnnotation";
                break;
            }
            default: {
                arr_object[2] = "isPropertyWithBackingFieldInOuterClass";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public static boolean hasJvmFieldAnnotation(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        if(callableMemberDescriptor0 != null) {
            if(callableMemberDescriptor0 instanceof PropertyDescriptor) {
                FieldDescriptor fieldDescriptor0 = ((PropertyDescriptor)callableMemberDescriptor0).getBackingField();
                return fieldDescriptor0 == null || !fieldDescriptor0.getAnnotations().hasAnnotation(JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME) ? callableMemberDescriptor0.getAnnotations().hasAnnotation(JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME) : true;
            }
            return callableMemberDescriptor0.getAnnotations().hasAnnotation(JvmAbi.JVM_FIELD_ANNOTATION_FQ_NAME);
        }
        DescriptorsJvmAbiUtil.a(3);
        throw null;
    }

    public static boolean isClassCompanionObjectWithBackingFieldsInOuter(@NotNull DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            return DescriptorUtils.isCompanionObject(declarationDescriptor0) && DescriptorUtils.isClassOrEnumClass(declarationDescriptor0.getContainingDeclaration()) && !DescriptorsJvmAbiUtil.isMappedIntrinsicCompanionObject(((ClassDescriptor)declarationDescriptor0));
        }
        DescriptorsJvmAbiUtil.a(1);
        throw null;
    }

    public static boolean isMappedIntrinsicCompanionObject(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            return CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, classDescriptor0);
        }
        DescriptorsJvmAbiUtil.a(2);
        throw null;
    }

    public static boolean isPropertyWithBackingFieldInOuterClass(@NotNull PropertyDescriptor propertyDescriptor0) {
        if(propertyDescriptor0 != null) {
            if(propertyDescriptor0.getKind() == Kind.FAKE_OVERRIDE) {
                return false;
            }
            return DescriptorsJvmAbiUtil.isClassCompanionObjectWithBackingFieldsInOuter(propertyDescriptor0.getContainingDeclaration()) ? true : DescriptorUtils.isCompanionObject(propertyDescriptor0.getContainingDeclaration()) && DescriptorsJvmAbiUtil.hasJvmFieldAnnotation(propertyDescriptor0);
        }
        DescriptorsJvmAbiUtil.a(0);
        throw null;
    }
}

