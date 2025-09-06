package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {
    public final ClassDescriptor b;
    public final Name c;

    public ContextClassReceiver(@NotNull ClassDescriptor classDescriptor0, @NotNull KotlinType kotlinType0, @Nullable Name name0, @Nullable ReceiverValue receiverValue0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        Intrinsics.checkNotNullParameter(kotlinType0, "receiverType");
        super(kotlinType0, receiverValue0);
        this.b = classDescriptor0;
        this.c = name0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    public Name getCustomLabelName() {
        return this.c;
    }

    @Override
    @NotNull
    public String toString() {
        return this.getType() + ": Ctx { " + this.b + " }";
    }
}

