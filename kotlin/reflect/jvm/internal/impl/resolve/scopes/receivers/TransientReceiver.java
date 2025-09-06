package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public class TransientReceiver extends AbstractReceiverValue {
    public TransientReceiver(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'type\' of kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver.<init> must not be null");
        }
        super(kotlinType0, null);
    }

    @Override
    public String toString() {
        return "{Transient} : " + this.getType();
    }
}

