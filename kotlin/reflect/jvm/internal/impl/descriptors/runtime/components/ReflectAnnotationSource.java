package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import org.jetbrains.annotations.NotNull;

public final class ReflectAnnotationSource implements SourceElement {
    public final Annotation a;

    public ReflectAnnotationSource(@NotNull Annotation annotation0) {
        Intrinsics.checkNotNullParameter(annotation0, "annotation");
        super();
        this.a = annotation0;
    }

    @NotNull
    public final Annotation getAnnotation() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        Intrinsics.checkNotNullExpressionValue(SourceFile.NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return SourceFile.NO_SOURCE_FILE;
    }
}

