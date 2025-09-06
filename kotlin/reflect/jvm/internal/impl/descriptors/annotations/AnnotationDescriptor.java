package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface AnnotationDescriptor {
    @SourceDebugExtension({"SMAP\nAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDescriptor.kt\norg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    public static final class DefaultImpls {
        @Nullable
        public static FqName getFqName(@NotNull AnnotationDescriptor annotationDescriptor0) {
            ClassDescriptor classDescriptor0 = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor0);
            if(classDescriptor0 != null) {
                if(ErrorUtils.isError(classDescriptor0)) {
                    classDescriptor0 = null;
                }
                return classDescriptor0 == null ? null : DescriptorUtilsKt.fqNameOrNull(classDescriptor0);
            }
            return null;
        }
    }

    @NotNull
    Map getAllValueArguments();

    @Nullable
    FqName getFqName();

    @NotNull
    SourceElement getSource();

    @NotNull
    KotlinType getType();
}

