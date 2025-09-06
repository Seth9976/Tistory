package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public abstract class DeclarationDescriptorNonRootImpl extends DeclarationDescriptorImpl implements DeclarationDescriptorNonRoot {
    public final DeclarationDescriptor c;
    public final SourceElement d;

    public DeclarationDescriptorNonRootImpl(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull SourceElement sourceElement0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(name0 != null) {
                    if(sourceElement0 != null) {
                        super(annotations0, name0);
                        this.c = declarationDescriptor0;
                        this.d = sourceElement0;
                        return;
                    }
                    DeclarationDescriptorNonRootImpl.a(3);
                    throw null;
                }
                DeclarationDescriptorNonRootImpl.a(2);
                throw null;
            }
            DeclarationDescriptorNonRootImpl.a(1);
            throw null;
        }
        DeclarationDescriptorNonRootImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 4 || v == 5 || v == 6 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "annotations";
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
            case 5: 
            case 6: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 5: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            case 6: {
                arr_object[1] = "getSource";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
            }
        }
        if(v != 4 && v != 5 && v != 6) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 4 || v == 5 || v == 6 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 4 || v == 5 || v == 6 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor0 = this.c;
        if(declarationDescriptor0 != null) {
            return declarationDescriptor0;
        }
        DeclarationDescriptorNonRootImpl.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @NotNull
    public DeclarationDescriptorWithSource getOriginal() {
        DeclarationDescriptorWithSource declarationDescriptorWithSource0 = (DeclarationDescriptorWithSource)super.getOriginal();
        if(declarationDescriptorWithSource0 != null) {
            return declarationDescriptorWithSource0;
        }
        DeclarationDescriptorNonRootImpl.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement0 = this.d;
        if(sourceElement0 != null) {
            return sourceElement0;
        }
        DeclarationDescriptorNonRootImpl.a(6);
        throw null;
    }
}

