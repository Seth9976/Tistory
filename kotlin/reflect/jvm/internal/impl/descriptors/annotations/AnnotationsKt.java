package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class AnnotationsKt {
    @NotNull
    public static final Annotations composeAnnotations(@NotNull Annotations annotations0, @NotNull Annotations annotations1) {
        Intrinsics.checkNotNullParameter(annotations0, "first");
        Intrinsics.checkNotNullParameter(annotations1, "second");
        if(annotations0.isEmpty()) {
            return annotations1;
        }
        return !annotations1.isEmpty() ? new CompositeAnnotations(new Annotations[]{annotations0, annotations1}) : annotations0;
    }
}

