package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {
    public final ClassDescriptor a;
    public final ClassDescriptor b;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor0, @Nullable ImplicitClassReceiver implicitClassReceiver0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "classDescriptor");
        super();
        this.a = classDescriptor0;
        this.b = classDescriptor0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        ClassDescriptor classDescriptor0 = null;
        ImplicitClassReceiver implicitClassReceiver0 = object0 instanceof ImplicitClassReceiver ? ((ImplicitClassReceiver)object0) : null;
        if(implicitClassReceiver0 != null) {
            classDescriptor0 = implicitClassReceiver0.a;
        }
        return Intrinsics.areEqual(this.a, classDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public KotlinType getType() {
        return this.getType();
    }

    @NotNull
    public SimpleType getType() {
        SimpleType simpleType0 = this.a.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "classDescriptor.defaultType");
        return simpleType0;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "Class{" + this.getType() + '}';
    }
}

