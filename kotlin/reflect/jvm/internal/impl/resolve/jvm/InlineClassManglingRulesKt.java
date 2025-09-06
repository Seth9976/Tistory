package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\ninlineClassManglingRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1747#2,3:58\n1747#2,3:61\n*S KotlinDebug\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n*L\n25#1:58,3\n31#1:61,3\n*E\n"})
public final class InlineClassManglingRulesKt {
    public static final boolean a(KotlinType kotlinType0) {
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor0 = classifierDescriptor0 instanceof TypeParameterDescriptor ? ((TypeParameterDescriptor)classifierDescriptor0) : null;
        if(typeParameterDescriptor0 == null) {
            return false;
        }
        KotlinType kotlinType1 = TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor0);
        return InlineClassManglingRulesKt.isInlineClassThatRequiresMangling(kotlinType1) || InlineClassManglingRulesKt.a(kotlinType1);
    }

    public static final boolean isInlineClassThatRequiresMangling(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        return InlineClassesUtilsKt.isInlineClass(declarationDescriptor0) && !Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(((ClassDescriptor)declarationDescriptor0)), StandardNames.RESULT_FQ_NAME);
    }

    public static final boolean isInlineClassThatRequiresMangling(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        return classifierDescriptor0 != null && InlineClassManglingRulesKt.isInlineClassThatRequiresMangling(classifierDescriptor0);
    }

    public static final boolean shouldHideConstructorDueToInlineClassTypeValueParameters(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "descriptor");
        ClassConstructorDescriptor classConstructorDescriptor0 = callableMemberDescriptor0 instanceof ClassConstructorDescriptor ? ((ClassConstructorDescriptor)callableMemberDescriptor0) : null;
        if(classConstructorDescriptor0 == null) {
            return false;
        }
        if(DescriptorVisibilities.isPrivate(classConstructorDescriptor0.getVisibility())) {
            return false;
        }
        ClassDescriptor classDescriptor0 = classConstructorDescriptor0.getConstructedClass();
        Intrinsics.checkNotNullExpressionValue(classDescriptor0, "constructorDescriptor.constructedClass");
        if(InlineClassesUtilsKt.isInlineClass(classDescriptor0)) {
            return false;
        }
        if(DescriptorUtils.isSealedClass(classConstructorDescriptor0.getConstructedClass())) {
            return false;
        }
        List list0 = classConstructorDescriptor0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(list0, "constructorDescriptor.valueParameters");
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                KotlinType kotlinType0 = ((ValueParameterDescriptor)object0).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType0, "it.type");
                if(InlineClassManglingRulesKt.isInlineClassThatRequiresMangling(kotlinType0) || InlineClassManglingRulesKt.a(kotlinType0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }
}

