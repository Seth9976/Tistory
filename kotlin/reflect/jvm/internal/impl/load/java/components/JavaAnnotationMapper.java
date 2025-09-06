package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaAnnotationMapper {
    @NotNull
    public static final JavaAnnotationMapper INSTANCE;
    public static final Name a;
    public static final Name b;
    public static final Name c;
    public static final Map d;

    static {
        JavaAnnotationMapper.INSTANCE = new JavaAnnotationMapper();  // 初始化器: Ljava/lang/Object;-><init>()V
        Name name0 = Name.identifier("message");
        Intrinsics.checkNotNullExpressionValue(name0, "identifier(\"message\")");
        JavaAnnotationMapper.a = name0;
        Name name1 = Name.identifier("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(name1, "identifier(\"allowedTargets\")");
        JavaAnnotationMapper.b = name1;
        Name name2 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(name2, "identifier(\"value\")");
        JavaAnnotationMapper.c = name2;
        JavaAnnotationMapper.d = x.mapOf(new Pair[]{TuplesKt.to(FqNames.target, JvmAnnotationNames.TARGET_ANNOTATION), TuplesKt.to(FqNames.retention, JvmAnnotationNames.RETENTION_ANNOTATION), TuplesKt.to(FqNames.mustBeDocumented, JvmAnnotationNames.DOCUMENTED_ANNOTATION)});
    }

    @Nullable
    public final AnnotationDescriptor findMappedJavaAnnotation(@NotNull FqName fqName0, @NotNull JavaAnnotationOwner javaAnnotationOwner0, @NotNull LazyJavaResolverContext lazyJavaResolverContext0) {
        Intrinsics.checkNotNullParameter(fqName0, "kotlinName");
        Intrinsics.checkNotNullParameter(javaAnnotationOwner0, "annotationOwner");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        if(Intrinsics.areEqual(fqName0, FqNames.deprecated)) {
            Intrinsics.checkNotNullExpressionValue(JvmAnnotationNames.DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotation0 = javaAnnotationOwner0.findAnnotation(JvmAnnotationNames.DEPRECATED_ANNOTATION);
            if(javaAnnotation0 != null || javaAnnotationOwner0.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotation0, lazyJavaResolverContext0);
            }
        }
        FqName fqName1 = (FqName)JavaAnnotationMapper.d.get(fqName0);
        if(fqName1 != null) {
            JavaAnnotation javaAnnotation1 = javaAnnotationOwner0.findAnnotation(fqName1);
            return javaAnnotation1 == null ? null : JavaAnnotationMapper.mapOrResolveJavaAnnotation$default(JavaAnnotationMapper.INSTANCE, javaAnnotation1, lazyJavaResolverContext0, false, 4, null);
        }
        return null;
    }

    @NotNull
    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return JavaAnnotationMapper.a;
    }

    @NotNull
    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return JavaAnnotationMapper.c;
    }

    @NotNull
    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return JavaAnnotationMapper.b;
    }

    @Nullable
    public final AnnotationDescriptor mapOrResolveJavaAnnotation(@NotNull JavaAnnotation javaAnnotation0, @NotNull LazyJavaResolverContext lazyJavaResolverContext0, boolean z) {
        Intrinsics.checkNotNullParameter(javaAnnotation0, "annotation");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "c");
        ClassId classId0 = javaAnnotation0.getClassId();
        if(Intrinsics.areEqual(classId0, ClassId.topLevel(JvmAnnotationNames.TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation0, lazyJavaResolverContext0);
        }
        if(Intrinsics.areEqual(classId0, ClassId.topLevel(JvmAnnotationNames.RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation0, lazyJavaResolverContext0);
        }
        if(Intrinsics.areEqual(classId0, ClassId.topLevel(JvmAnnotationNames.DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(lazyJavaResolverContext0, javaAnnotation0, FqNames.mustBeDocumented);
        }
        return Intrinsics.areEqual(classId0, ClassId.topLevel(JvmAnnotationNames.DEPRECATED_ANNOTATION)) ? null : new LazyJavaAnnotationDescriptor(lazyJavaResolverContext0, javaAnnotation0, z);
    }

    public static AnnotationDescriptor mapOrResolveJavaAnnotation$default(JavaAnnotationMapper javaAnnotationMapper0, JavaAnnotation javaAnnotation0, LazyJavaResolverContext lazyJavaResolverContext0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        return javaAnnotationMapper0.mapOrResolveJavaAnnotation(javaAnnotation0, lazyJavaResolverContext0, z);
    }
}

