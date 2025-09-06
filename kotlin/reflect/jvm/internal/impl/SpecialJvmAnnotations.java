package kotlin.reflect.jvm.internal.impl;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSpecialJvmAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1620#2,3:43\n*S KotlinDebug\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n*L\n22#1:43,3\n*E\n"})
public final class SpecialJvmAnnotations {
    @NotNull
    public static final SpecialJvmAnnotations INSTANCE;
    public static final LinkedHashSet a;
    public static final ClassId b;

    static {
        SpecialJvmAnnotations.INSTANCE = new SpecialJvmAnnotations();  // 初始化器: Ljava/lang/Object;-><init>()V
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOf(new FqName[]{JvmAnnotationNames.METADATA_FQ_NAME, JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, JvmAnnotationNames.TARGET_ANNOTATION, JvmAnnotationNames.RETENTION_ANNOTATION, JvmAnnotationNames.DOCUMENTED_ANNOTATION});
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: iterable0) {
            linkedHashSet0.add(ClassId.topLevel(((FqName)object0)));
        }
        SpecialJvmAnnotations.a = linkedHashSet0;
        ClassId classId0 = ClassId.topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION);
        Intrinsics.checkNotNullExpressionValue(classId0, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        SpecialJvmAnnotations.b = classId0;
    }

    @NotNull
    public final ClassId getJAVA_LANG_ANNOTATION_REPEATABLE() {
        return SpecialJvmAnnotations.b;
    }

    @NotNull
    public final Set getSPECIAL_ANNOTATIONS() {
        return SpecialJvmAnnotations.a;
    }

    public final boolean isAnnotatedWithContainerMetaAnnotation(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass0) {
        Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass0, "klass");
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        kotlinJvmBinaryClass0.loadClassAnnotations(new AnnotationVisitor() {
            public final BooleanRef a;

            {
                this.a = ref$BooleanRef0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
            @Nullable
            public AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId0, @NotNull SourceElement sourceElement0) {
                Intrinsics.checkNotNullParameter(classId0, "classId");
                Intrinsics.checkNotNullParameter(sourceElement0, "source");
                if(Intrinsics.areEqual(classId0, JvmAbi.INSTANCE.getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION())) {
                    this.a.element = true;
                }
                return null;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
            public void visitEnd() {
            }
        }, null);
        return ref$BooleanRef0.element;
    }
}

