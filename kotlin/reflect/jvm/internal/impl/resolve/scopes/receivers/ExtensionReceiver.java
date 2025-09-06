package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExtensionReceiver extends AbstractReceiverValue implements ImplicitReceiver {
    public final CallableDescriptor b;

    public ExtensionReceiver(@NotNull CallableDescriptor callableDescriptor0, @NotNull KotlinType kotlinType0, @Nullable ReceiverValue receiverValue0) {
        if(callableDescriptor0 != null) {
            if(kotlinType0 != null) {
                super(kotlinType0, receiverValue0);
                this.b = callableDescriptor0;
                return;
            }
            ExtensionReceiver.a(1);
            throw null;
        }
        ExtensionReceiver.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.AbstractReceiverValue
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "receiverType";
                break;
            }
            case 2: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
                break;
            }
            case 3: {
                arr_object[0] = "newType";
                break;
            }
            default: {
                arr_object[0] = "callableDescriptor";
            }
        }
        arr_object[1] = v == 2 ? "getDeclarationDescriptor" : "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        if(v != 2) {
            arr_object[2] = v == 3 ? "replaceType" : "<init>";
        }
        String s = String.format((v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override
    public String toString() {
        return this.getType() + ": Ext {" + this.b + "}";
    }
}

