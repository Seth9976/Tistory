package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;

public class ReceiverParameterDescriptorImpl extends AbstractReceiverParameterDescriptor {
    public final DeclarationDescriptor c;
    public final ReceiverValue d;

    public ReceiverParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull ReceiverValue receiverValue0, @NotNull Annotations annotations0) {
        if(declarationDescriptor0 != null) {
            if(receiverValue0 != null) {
                if(annotations0 != null) {
                    this(declarationDescriptor0, receiverValue0, annotations0, SpecialNames.THIS);
                    return;
                }
                ReceiverParameterDescriptorImpl.a(2);
                throw null;
            }
            ReceiverParameterDescriptorImpl.a(1);
            throw null;
        }
        ReceiverParameterDescriptorImpl.a(0);
        throw null;
    }

    public ReceiverParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull ReceiverValue receiverValue0, @NotNull Annotations annotations0, @NotNull Name name0) {
        if(declarationDescriptor0 != null) {
            if(receiverValue0 != null) {
                if(annotations0 != null) {
                    if(name0 != null) {
                        super(annotations0, name0);
                        this.c = declarationDescriptor0;
                        this.d = receiverValue0;
                        return;
                    }
                    ReceiverParameterDescriptorImpl.a(6);
                    throw null;
                }
                ReceiverParameterDescriptorImpl.a(5);
                throw null;
            }
            ReceiverParameterDescriptorImpl.a(4);
            throw null;
        }
        ReceiverParameterDescriptorImpl.a(3);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 7 || v == 8 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 4: {
                arr_object[0] = "value";
                break;
            }
            case 2: 
            case 5: {
                arr_object[0] = "annotations";
                break;
            }
            case 6: {
                arr_object[0] = "name";
                break;
            }
            case 7: 
            case 8: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            }
            case 9: {
                arr_object[0] = "newOwner";
                break;
            }
            case 10: {
                arr_object[0] = "outType";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 7: {
                arr_object[1] = "getValue";
                break;
            }
            case 8: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            }
        }
        switch(v) {
            case 7: 
            case 8: {
                break;
            }
            case 9: {
                arr_object[2] = "copy";
                break;
            }
            case 10: {
                arr_object[2] = "setOutType";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 7 || v == 8 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 7 || v == 8 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor0 = this.c;
        if(declarationDescriptor0 != null) {
            return declarationDescriptor0;
        }
        ReceiverParameterDescriptorImpl.a(8);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    @NotNull
    public ReceiverValue getValue() {
        ReceiverValue receiverValue0 = this.d;
        if(receiverValue0 != null) {
            return receiverValue0;
        }
        ReceiverParameterDescriptorImpl.a(7);
        throw null;
    }
}

