package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class AnnotationValue extends ConstantValue {
    public AnnotationValue(@NotNull AnnotationDescriptor annotationDescriptor0) {
        Intrinsics.checkNotNullParameter(annotationDescriptor0, "value");
        super(annotationDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        return ((AnnotationDescriptor)this.getValue()).getType();
    }
}

