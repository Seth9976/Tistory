package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ModuleCapability {
    public final String a;

    public ModuleCapability(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.a = s;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }
}

