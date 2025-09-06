package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Annotations extends Iterable, KMappedMarker {
    public static final class Companion {
        public static final Companion a;
        public static final Annotations.Companion.EMPTY.1 b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = new Annotations.Companion.EMPTY.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final Annotations create(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "annotations");
            return list0.isEmpty() ? Companion.b : new AnnotationsImpl(list0);
        }

        @NotNull
        public final Annotations getEMPTY() {
            return Companion.b;
        }
    }

    @SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n288#2,2:124\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n*L\n29#1:124,2\n*E\n"})
    public static final class DefaultImpls {
        @Nullable
        public static AnnotationDescriptor findAnnotation(@NotNull Annotations annotations0, @NotNull FqName fqName0) {
            Intrinsics.checkNotNullParameter(fqName0, "fqName");
            for(Object object0: annotations0) {
                if(Intrinsics.areEqual(((AnnotationDescriptor)object0).getFqName(), fqName0)) {
                    return (AnnotationDescriptor)object0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }

        public static boolean hasAnnotation(@NotNull Annotations annotations0, @NotNull FqName fqName0) {
            Intrinsics.checkNotNullParameter(fqName0, "fqName");
            return annotations0.findAnnotation(fqName0) != null;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        Annotations.Companion = Companion.a;
    }

    @Nullable
    AnnotationDescriptor findAnnotation(@NotNull FqName arg1);

    boolean hasAnnotation(@NotNull FqName arg1);

    boolean isEmpty();
}

