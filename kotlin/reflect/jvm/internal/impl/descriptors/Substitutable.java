package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

public interface Substitutable {
    @NotNull
    DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor arg1);
}

