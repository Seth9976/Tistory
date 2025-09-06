package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public abstract class ClassDescriptorBase extends AbstractClassDescriptor {
    public final DeclarationDescriptor d;
    public final SourceElement e;
    public final boolean f;

    public ClassDescriptorBase(@NotNull StorageManager storageManager0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Name name0, @NotNull SourceElement sourceElement0, boolean z) {
        if(storageManager0 != null) {
            if(declarationDescriptor0 != null) {
                if(name0 != null) {
                    if(sourceElement0 != null) {
                        super(storageManager0, name0);
                        this.d = declarationDescriptor0;
                        this.e = sourceElement0;
                        this.f = z;
                        return;
                    }
                    ClassDescriptorBase.a(3);
                    throw null;
                }
                ClassDescriptorBase.a(2);
                throw null;
            }
            ClassDescriptorBase.a(1);
            throw null;
        }
        ClassDescriptorBase.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 4 || v == 5 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "containingDeclaration";
                break;
            }
            case 2: {
                arr_object[0] = "name";
                break;
            }
            case 3: {
                arr_object[0] = "source";
                break;
            }
            case 4: 
            case 5: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            case 5: {
                arr_object[1] = "getSource";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            }
        }
        if(v != 4 && v != 5) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 4 || v == 5 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 4 || v == 5 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor0 = this.d;
        if(declarationDescriptor0 != null) {
            return declarationDescriptor0;
        }
        ClassDescriptorBase.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement0 = this.e;
        if(sourceElement0 != null) {
            return sourceElement0;
        }
        ClassDescriptorBase.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f;
    }
}

