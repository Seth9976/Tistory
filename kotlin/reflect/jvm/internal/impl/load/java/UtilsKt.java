package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n1#2:50\n12744#3,2:51\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/load/java/UtilsKt\n*L\n47#1:51,2\n*E\n"})
public final class UtilsKt {
    @Nullable
    public static final AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull JavaWildcardType javaWildcardType0) {
        Object object0;
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        Intrinsics.checkNotNullParameter(javaWildcardType0, "wildcardType");
        if(javaWildcardType0.getBound() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren\'t supported");
        }
        Iterator iterator0 = new LazyJavaAnnotations(lazyJavaResolverContext0, javaWildcardType0, false, 4, null).iterator();
    alab1:
        while(true) {
            object0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            object0 = iterator0.next();
            AnnotationDescriptor annotationDescriptor0 = (AnnotationDescriptor)object0;
            FqName[] arr_fqName = JavaNullabilityAnnotationSettingsKt.getRXJAVA3_ANNOTATIONS();
            for(int v = 0; v < arr_fqName.length; ++v) {
                FqName fqName0 = arr_fqName[v];
                if(Intrinsics.areEqual(annotationDescriptor0.getFqName(), fqName0)) {
                    break alab1;
                }
            }
        }
        return (AnnotationDescriptor)object0;
    }

    public static final boolean hasErasedValueParameters(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "memberDescriptor");
        return callableMemberDescriptor0 instanceof FunctionDescriptor && Intrinsics.areEqual(callableMemberDescriptor0.getUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS), Boolean.TRUE);
    }

    public static final boolean isJspecifyEnabledInStrictMode(@NotNull JavaTypeEnhancementState javaTypeEnhancementState0) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState0, "javaTypeEnhancementState");
        return javaTypeEnhancementState0.getGetReportLevelForAnnotation().invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.STRICT;
    }

    @NotNull
    public static final DescriptorVisibility toDescriptorVisibility(@NotNull Visibility visibility0) {
        Intrinsics.checkNotNullParameter(visibility0, "<this>");
        DescriptorVisibility descriptorVisibility0 = JavaDescriptorVisibilities.toDescriptorVisibility(visibility0);
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "toDescriptorVisibility(this)");
        return descriptorVisibility0;
    }
}

