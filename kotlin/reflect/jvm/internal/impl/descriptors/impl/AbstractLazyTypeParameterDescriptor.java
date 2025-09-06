package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractLazyTypeParameterDescriptor extends AbstractTypeParameterDescriptor {
    public AbstractLazyTypeParameterDescriptor(@NotNull StorageManager storageManager0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull Variance variance0, boolean z, int v, @NotNull SourceElement sourceElement0, @NotNull SupertypeLoopChecker supertypeLoopChecker0) {
        if(storageManager0 != null) {
            if(declarationDescriptor0 != null) {
                if(annotations0 != null) {
                    if(name0 != null) {
                        if(variance0 != null) {
                            if(sourceElement0 != null) {
                                if(supertypeLoopChecker0 != null) {
                                    super(storageManager0, declarationDescriptor0, annotations0, name0, variance0, z, v, sourceElement0, supertypeLoopChecker0);
                                    return;
                                }
                                AbstractLazyTypeParameterDescriptor.a(6);
                                throw null;
                            }
                            AbstractLazyTypeParameterDescriptor.a(5);
                            throw null;
                        }
                        AbstractLazyTypeParameterDescriptor.a(4);
                        throw null;
                    }
                    AbstractLazyTypeParameterDescriptor.a(3);
                    throw null;
                }
                AbstractLazyTypeParameterDescriptor.a(2);
                throw null;
            }
            AbstractLazyTypeParameterDescriptor.a(1);
            throw null;
        }
        AbstractLazyTypeParameterDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "containingDeclaration";
                break;
            }
            case 2: {
                arr_object[0] = "annotations";
                break;
            }
            case 3: {
                arr_object[0] = "name";
                break;
            }
            case 4: {
                arr_object[0] = "variance";
                break;
            }
            case 5: {
                arr_object[0] = "source";
                break;
            }
            case 6: {
                arr_object[0] = "supertypeLoopChecker";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        arr_object[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        String s = "";
        String s1 = this.isReified() ? "reified " : "";
        if(this.getVariance() != Variance.INVARIANT) {
            s = this.getVariance() + " ";
        }
        return s1 + s + this.getName();
    }
}

