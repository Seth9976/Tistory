package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {
    public final CallableDescriptor b;
    public final Name c;

    public ContextReceiver(@NotNull CallableDescriptor callableDescriptor0, @NotNull KotlinType kotlinType0, @Nullable Name name0, @Nullable ReceiverValue receiverValue0) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(kotlinType0, "receiverType");
        super(kotlinType0, receiverValue0);
        this.b = callableDescriptor0;
        this.c = name0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    public Name getCustomLabelName() {
        return this.c;
    }

    @NotNull
    public CallableDescriptor getDeclarationDescriptor() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        return "Cxt { " + this.getDeclarationDescriptor() + " }";
    }
}

