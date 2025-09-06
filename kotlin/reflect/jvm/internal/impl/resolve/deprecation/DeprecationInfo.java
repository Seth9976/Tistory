package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class DeprecationInfo implements Comparable {
    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((DeprecationInfo)object0));
    }

    public int compareTo(@NotNull DeprecationInfo deprecationInfo0) {
        Intrinsics.checkNotNullParameter(deprecationInfo0, "other");
        int v = this.getDeprecationLevel().compareTo(deprecationInfo0.getDeprecationLevel());
        return v != 0 || this.getPropagatesToOverrides() || !deprecationInfo0.getPropagatesToOverrides() ? v : 1;
    }

    @NotNull
    public abstract DeprecationLevelValue getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();
}

