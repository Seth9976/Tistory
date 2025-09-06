package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import org.jetbrains.annotations.NotNull;

public abstract class DeclarationDescriptorImpl extends AnnotatedImpl implements DeclarationDescriptor {
    public final Name b;

    public DeclarationDescriptorImpl(@NotNull Annotations annotations0, @NotNull Name name0) {
        if(annotations0 != null) {
            if(name0 != null) {
                super(annotations0);
                this.b = name0;
                return;
            }
            DeclarationDescriptorImpl.a(1);
            throw null;
        }
        DeclarationDescriptorImpl.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 2 || v == 3 || v == 5 || v == 6 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "name";
                break;
            }
            case 4: {
                arr_object[0] = "descriptor";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "annotations";
            }
        }
        switch(v) {
            case 2: {
                arr_object[1] = "getName";
                break;
            }
            case 3: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 5: 
            case 6: {
                arr_object[1] = "toString";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
            }
        }
        if(v != 2 && v != 3) {
            switch(v) {
                case 4: {
                    arr_object[2] = "toString";
                    break;
                }
                case 5: 
                case 6: {
                    break;
                }
                default: {
                    arr_object[2] = "<init>";
                }
            }
        }
        String s = String.format((v == 2 || v == 3 || v == 5 || v == 6 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 2 || v == 3 || v == 5 || v == 6 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name0 = this.b;
        if(name0 != null) {
            return name0;
        }
        DeclarationDescriptorImpl.a(2);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    @NotNull
    public static String toString(@NotNull DeclarationDescriptor declarationDescriptor0) {
        String s;
        if(declarationDescriptor0 != null) {
            try {
                s = DescriptorRenderer.DEBUG_TEXT.render(declarationDescriptor0) + "[" + declarationDescriptor0.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(declarationDescriptor0)) + "]";
            }
            catch(Throwable unused_ex) {
                String s1 = declarationDescriptor0.getClass().getSimpleName() + " " + declarationDescriptor0.getName();
                if(s1 != null) {
                    return s1;
                }
                DeclarationDescriptorImpl.a(6);
                throw null;
            }
            if(s != null) {
                return s;
            }
            DeclarationDescriptorImpl.a(5);
            throw null;
        }
        DeclarationDescriptorImpl.a(4);
        throw null;
    }

    @Override
    public String toString() {
        return DeclarationDescriptorImpl.toString(this);
    }
}

