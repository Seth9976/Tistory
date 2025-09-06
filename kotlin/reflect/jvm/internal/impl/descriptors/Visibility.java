package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Visibility {
    public final String a;
    public final boolean b;

    public Visibility(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.a = s;
        this.b = z;
    }

    @Nullable
    public Integer compareTo(@NotNull Visibility visibility0) {
        Intrinsics.checkNotNullParameter(visibility0, "visibility");
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility0);
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.a;
    }

    public final boolean isPublicAPI() {
        return this.b;
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }

    @Override
    @NotNull
    public final String toString() {
        return this.getInternalDisplayName();
    }
}

