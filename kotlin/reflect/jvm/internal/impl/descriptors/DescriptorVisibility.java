package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DescriptorVisibility {
    @Nullable
    public final Integer compareTo(@NotNull DescriptorVisibility descriptorVisibility0) {
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "visibility");
        return this.getDelegate().compareTo(descriptorVisibility0.getDelegate());
    }

    @NotNull
    public abstract Visibility getDelegate();

    @NotNull
    public abstract String getInternalDisplayName();

    public final boolean isPublicAPI() {
        return this.getDelegate().isPublicAPI();
    }

    public abstract boolean isVisible(@Nullable ReceiverValue arg1, @NotNull DeclarationDescriptorWithVisibility arg2, @NotNull DeclarationDescriptor arg3, boolean arg4);

    @NotNull
    public abstract DescriptorVisibility normalize();

    @Override
    @NotNull
    public final String toString() {
        return this.getDelegate().toString();
    }
}

