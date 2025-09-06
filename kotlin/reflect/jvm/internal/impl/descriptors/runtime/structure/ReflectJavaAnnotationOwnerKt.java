package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nReflectJavaAnnotationOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n11335#2:44\n11670#2,3:45\n1282#2,2:48\n1#3:50\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n*L\n37#1:44\n37#1:45,3\n41#1:48,2\n*E\n"})
public final class ReflectJavaAnnotationOwnerKt {
    @Nullable
    public static final ReflectJavaAnnotation findAnnotation(@NotNull Annotation[] arr_annotation, @NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(arr_annotation, "<this>");
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation0 = arr_annotation[v];
            if(Intrinsics.areEqual(ReflectClassUtilKt.getClassId(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation0))).asSingleFqName(), fqName0)) {
                return annotation0 == null ? null : new ReflectJavaAnnotation(annotation0);
            }
        }
        return null;
    }

    @NotNull
    public static final List getAnnotations(@NotNull Annotation[] arr_annotation) {
        Intrinsics.checkNotNullParameter(arr_annotation, "<this>");
        List list0 = new ArrayList(arr_annotation.length);
        for(int v = 0; v < arr_annotation.length; ++v) {
            list0.add(new ReflectJavaAnnotation(arr_annotation[v]));
        }
        return list0;
    }
}

