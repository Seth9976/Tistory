package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {
    public final Visibility a;

    public DelegatedDescriptorVisibility(@NotNull Visibility visibility0) {
        Intrinsics.checkNotNullParameter(visibility0, "delegate");
        super();
        this.a = visibility0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public Visibility getDelegate() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public String getInternalDisplayName() {
        return this.getDelegate().getInternalDisplayName();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    @NotNull
    public DescriptorVisibility normalize() {
        DescriptorVisibility descriptorVisibility0 = DescriptorVisibilities.toDescriptorVisibility(this.getDelegate().normalize());
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility0, "toDescriptorVisibility(delegate.normalize())");
        return descriptorVisibility0;
    }
}

