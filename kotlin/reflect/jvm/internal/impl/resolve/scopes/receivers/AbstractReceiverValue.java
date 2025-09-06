package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractReceiverValue implements ReceiverValue {
    public final ReceiverValue a;
    protected final KotlinType receiverType;

    public AbstractReceiverValue(@NotNull KotlinType kotlinType0, @Nullable ReceiverValue receiverValue0) {
        if(kotlinType0 != null) {
            super();
            this.receiverType = kotlinType0;
            if(receiverValue0 == null) {
                receiverValue0 = this;
            }
            this.a = receiverValue0;
            return;
        }
        AbstractReceiverValue.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 1 || v == 2 ? 2 : 3)];
        arr_object[0] = v == 1 || v == 2 ? "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue" : "receiverType";
        switch(v) {
            case 1: {
                arr_object[1] = "getType";
                break;
            }
            case 2: {
                arr_object[1] = "getOriginal";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            }
        }
        if(v != 1 && v != 2) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 1 || v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 1 || v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType0 = this.receiverType;
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        AbstractReceiverValue.a(1);
        throw null;
    }
}

