package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PossiblyInnerType {
    public final ClassifierDescriptorWithTypeParameters a;
    public final List b;
    public final PossiblyInnerType c;

    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0, @NotNull List list0, @Nullable PossiblyInnerType possiblyInnerType0) {
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters0, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        super();
        this.a = classifierDescriptorWithTypeParameters0;
        this.b = list0;
        this.c = possiblyInnerType0;
    }

    @NotNull
    public final List getArguments() {
        return this.b;
    }

    @NotNull
    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.a;
    }

    @Nullable
    public final PossiblyInnerType getOuterType() {
        return this.c;
    }
}

