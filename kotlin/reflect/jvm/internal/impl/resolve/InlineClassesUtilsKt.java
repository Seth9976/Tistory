package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\ninlineClassesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1549#2:84\n1620#2,3:85\n1549#2:89\n1620#2,3:90\n1747#2,3:93\n1#3:88\n*S KotlinDebug\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n*L\n38#1:84\n38#1:85,3\n53#1:89\n53#1:90,3\n64#1:93,3\n*E\n"})
public final class InlineClassesUtilsKt {
    static {
        Intrinsics.checkNotNullExpressionValue(ClassId.topLevel(new FqName("kotlin.jvm.JvmInline")), "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
    }

    public static final boolean isGetterOfUnderlyingPropertyOfInlineClass(@NotNull CallableDescriptor callableDescriptor0) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "<this>");
        if(callableDescriptor0 instanceof PropertyGetterDescriptor) {
            PropertyDescriptor propertyDescriptor0 = ((PropertyGetterDescriptor)callableDescriptor0).getCorrespondingProperty();
            Intrinsics.checkNotNullExpressionValue(propertyDescriptor0, "correspondingProperty");
            return InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(propertyDescriptor0);
        }
        return false;
    }

    public static final boolean isInlineClass(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        return declarationDescriptor0 instanceof ClassDescriptor && ((ClassDescriptor)declarationDescriptor0).getValueClassRepresentation() instanceof InlineClassRepresentation;
    }

    public static final boolean isInlineClassType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        return classifierDescriptor0 == null ? false : InlineClassesUtilsKt.isInlineClass(classifierDescriptor0);
    }

    public static final boolean isMultiFieldValueClass(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        return declarationDescriptor0 instanceof ClassDescriptor && ((ClassDescriptor)declarationDescriptor0).getValueClassRepresentation() instanceof MultiFieldValueClassRepresentation;
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(@NotNull VariableDescriptor variableDescriptor0) {
        Intrinsics.checkNotNullParameter(variableDescriptor0, "<this>");
        if(variableDescriptor0.getExtensionReceiverParameter() == null) {
            DeclarationDescriptor declarationDescriptor0 = variableDescriptor0.getContainingDeclaration();
            Name name0 = null;
            ClassDescriptor classDescriptor0 = declarationDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)declarationDescriptor0) : null;
            if(classDescriptor0 != null) {
                InlineClassRepresentation inlineClassRepresentation0 = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor0);
                if(inlineClassRepresentation0 != null) {
                    name0 = inlineClassRepresentation0.getUnderlyingPropertyName();
                }
            }
            return Intrinsics.areEqual(name0, variableDescriptor0.getName());
        }
        return false;
    }

    public static final boolean isValueClass(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        return InlineClassesUtilsKt.isInlineClass(declarationDescriptor0) || InlineClassesUtilsKt.isMultiFieldValueClass(declarationDescriptor0);
    }

    @Nullable
    public static final KotlinType unsubstitutedUnderlyingType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
        if(classDescriptor0 != null) {
            InlineClassRepresentation inlineClassRepresentation0 = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor0);
            if(inlineClassRepresentation0 != null) {
                return (SimpleType)inlineClassRepresentation0.getUnderlyingType();
            }
        }
        return null;
    }
}

