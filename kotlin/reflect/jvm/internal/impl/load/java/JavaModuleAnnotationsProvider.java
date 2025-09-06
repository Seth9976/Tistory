package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaModuleAnnotationsProvider {
    @Nullable
    List getAnnotationsForModuleOwnerOfClass(@NotNull ClassId arg1);
}

