package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TypeMappingConfiguration {
    @NotNull
    KotlinType commonSupertype(@NotNull Collection arg1);

    @Nullable
    String getPredefinedFullInternalNameForClass(@NotNull ClassDescriptor arg1);

    @Nullable
    String getPredefinedInternalNameForClass(@NotNull ClassDescriptor arg1);

    @Nullable
    Object getPredefinedTypeForClass(@NotNull ClassDescriptor arg1);

    @Nullable
    KotlinType preprocessType(@NotNull KotlinType arg1);

    void processErrorType(@NotNull KotlinType arg1, @NotNull ClassDescriptor arg2);
}

