package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ModuleDependenciesImpl implements ModuleDependencies {
    public final List a;
    public final Set b;
    public final List c;
    public final Set d;

    public ModuleDependenciesImpl(@NotNull List list0, @NotNull Set set0, @NotNull List list1, @NotNull Set set1) {
        Intrinsics.checkNotNullParameter(list0, "allDependencies");
        Intrinsics.checkNotNullParameter(set0, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(list1, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(set1, "allExpectedByDependencies");
        super();
        this.a = list0;
        this.b = set0;
        this.c = list1;
        this.d = set1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public List getAllDependencies() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public List getDirectExpectedByDependencies() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    @NotNull
    public Set getModulesWhoseInternalsAreVisible() {
        return this.b;
    }
}

