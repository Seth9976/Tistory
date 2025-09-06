package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ClassDescriptorFactory {
    @Nullable
    ClassDescriptor createClass(@NotNull ClassId arg1);

    @NotNull
    Collection getAllContributedClassesIfPossible(@NotNull FqName arg1);

    boolean shouldCreateClass(@NotNull FqName arg1, @NotNull Name arg2);
}

