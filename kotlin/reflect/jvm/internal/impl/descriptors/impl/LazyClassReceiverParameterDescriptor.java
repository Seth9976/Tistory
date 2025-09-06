package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;

public class LazyClassReceiverParameterDescriptor extends AbstractReceiverParameterDescriptor {
    public final ClassDescriptor c;
    public final ImplicitClassReceiver d;

    public LazyClassReceiverParameterDescriptor(@NotNull ClassDescriptor classDescriptor0) {
        if(classDescriptor0 != null) {
            super(Annotations.Companion.getEMPTY());
            this.c = classDescriptor0;
            this.d = new ImplicitClassReceiver(classDescriptor0, null);
            return;
        }
        LazyClassReceiverParameterDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 1 || v == 2 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 2: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
                break;
            }
            case 3: {
                arr_object[0] = "newOwner";
                break;
            }
            default: {
                arr_object[0] = "descriptor";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "getValue";
                break;
            }
            case 2: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            }
        }
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                arr_object[2] = "copy";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 1 || v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 1 || v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor0 = this.c;
        if(declarationDescriptor0 != null) {
            return declarationDescriptor0;
        }
        LazyClassReceiverParameterDescriptor.a(2);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    @NotNull
    public ReceiverValue getValue() {
        ReceiverValue receiverValue0 = this.d;
        if(receiverValue0 != null) {
            return receiverValue0;
        }
        LazyClassReceiverParameterDescriptor.a(1);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "class " + this.c.getName() + "::this";
    }
}

