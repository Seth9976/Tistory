package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {
    public final Variance e;
    public final boolean f;
    public final int g;
    public final NotNullLazyValue h;
    public final NotNullLazyValue i;
    public final StorageManager j;

    public AbstractTypeParameterDescriptor(@NotNull StorageManager storageManager0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull Variance variance0, boolean z, int v, @NotNull SourceElement sourceElement0, @NotNull SupertypeLoopChecker supertypeLoopChecker0) {
        if(storageManager0 != null) {
            if(declarationDescriptor0 != null) {
                if(annotations0 != null) {
                    if(name0 != null) {
                        if(variance0 != null) {
                            if(sourceElement0 != null) {
                                if(supertypeLoopChecker0 != null) {
                                    super(declarationDescriptor0, annotations0, name0, sourceElement0);
                                    this.e = variance0;
                                    this.f = z;
                                    this.g = v;
                                    this.h = storageManager0.createLazyValue(new d(this, storageManager0, supertypeLoopChecker0));
                                    this.i = storageManager0.createLazyValue(new f(this, name0));
                                    this.j = storageManager0;
                                    return;
                                }
                                AbstractTypeParameterDescriptor.a(6);
                                throw null;
                            }
                            AbstractTypeParameterDescriptor.a(5);
                            throw null;
                        }
                        AbstractTypeParameterDescriptor.a(4);
                        throw null;
                    }
                    AbstractTypeParameterDescriptor.a(3);
                    throw null;
                }
                AbstractTypeParameterDescriptor.a(2);
                throw null;
            }
            AbstractTypeParameterDescriptor.a(1);
            throw null;
        }
        AbstractTypeParameterDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
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
            case 12: {
                arr_object[0] = "bounds";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 7: {
                arr_object[1] = "getVariance";
                break;
            }
            case 8: {
                arr_object[1] = "getUpperBounds";
                break;
            }
            case 9: {
                arr_object[1] = "getTypeConstructor";
                break;
            }
            case 10: {
                arr_object[1] = "getDefaultType";
                break;
            }
            case 11: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 13: {
                arr_object[1] = "processBoundsWithoutCycles";
                break;
            }
            case 14: {
                arr_object[1] = "getStorageManager";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
            }
        }
        switch(v) {
            case 12: {
                arr_object[2] = "processBoundsWithoutCycles";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitTypeParameterDescriptor(this, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleType0 = (SimpleType)this.i.invoke();
        if(simpleType0 != null) {
            return simpleType0;
        }
        AbstractTypeParameterDescriptor.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.g;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public ClassifierDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    @NotNull
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)super.getOriginal();
        if(typeParameterDescriptor0 != null) {
            return typeParameterDescriptor0;
        }
        AbstractTypeParameterDescriptor.a(11);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public StorageManager getStorageManager() {
        StorageManager storageManager0 = this.j;
        if(storageManager0 != null) {
            return storageManager0;
        }
        AbstractTypeParameterDescriptor.a(14);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor0 = (TypeConstructor)this.h.invoke();
        if(typeConstructor0 != null) {
            return typeConstructor0;
        }
        AbstractTypeParameterDescriptor.a(9);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List getUpperBounds() {
        List list0 = ((g)this.getTypeConstructor()).getSupertypes();
        if(list0 != null) {
            return list0;
        }
        AbstractTypeParameterDescriptor.a(8);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public Variance getVariance() {
        Variance variance0 = this.e;
        if(variance0 != null) {
            return variance0;
        }
        AbstractTypeParameterDescriptor.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.f;
    }

    @NotNull
    public List processBoundsWithoutCycles(@NotNull List list0) {
        if(list0 != null) {
            return list0;
        }
        AbstractTypeParameterDescriptor.a(12);
        throw null;
    }

    public abstract void reportSupertypeLoopError(@NotNull KotlinType arg1);

    @NotNull
    public abstract List resolveUpperBounds();
}

