package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public interface ModuleDependencies {
    @NotNull
    List getAllDependencies();

    @NotNull
    List getDirectExpectedByDependencies();

    @NotNull
    Set getModulesWhoseInternalsAreVisible();
}

