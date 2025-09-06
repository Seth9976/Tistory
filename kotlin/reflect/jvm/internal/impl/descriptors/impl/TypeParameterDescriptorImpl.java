package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {
    public final Function1 k;
    public final ArrayList l;
    public boolean m;

    public TypeParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor0, Annotations annotations0, boolean z, Variance variance0, Name name0, int v, SourceElement sourceElement0, Function1 function10, SupertypeLoopChecker supertypeLoopChecker0, StorageManager storageManager0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(variance0 != null) {
                    if(name0 != null) {
                        if(sourceElement0 != null) {
                            if(supertypeLoopChecker0 != null) {
                                if(storageManager0 != null) {
                                    super(storageManager0, declarationDescriptor0, annotations0, name0, variance0, z, v, sourceElement0, supertypeLoopChecker0);
                                    this.l = new ArrayList(1);
                                    this.m = false;
                                    this.k = function10;
                                    return;
                                }
                                TypeParameterDescriptorImpl.a(25);
                                throw null;
                            }
                            TypeParameterDescriptorImpl.a(24);
                            throw null;
                        }
                        TypeParameterDescriptorImpl.a(23);
                        throw null;
                    }
                    TypeParameterDescriptorImpl.a(22);
                    throw null;
                }
                TypeParameterDescriptorImpl.a(21);
                throw null;
            }
            TypeParameterDescriptorImpl.a(20);
            throw null;
        }
        TypeParameterDescriptorImpl.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 5 || v == 28 ? 2 : 3)];
        switch(v) {
            case 17: {
                arr_object[0] = "supertypeLoopsResolver";
                break;
            }
            case 1: 
            case 7: 
            case 13: 
            case 20: {
                arr_object[0] = "annotations";
                break;
            }
            case 2: 
            case 8: 
            case 14: 
            case 21: {
                arr_object[0] = "variance";
                break;
            }
            case 3: 
            case 9: 
            case 15: 
            case 22: {
                arr_object[0] = "name";
                break;
            }
            case 10: 
            case 16: 
            case 23: {
                arr_object[0] = "source";
                break;
            }
            case 24: {
                arr_object[0] = "supertypeLoopsChecker";
                break;
            }
            case 4: 
            case 11: 
            case 18: 
            case 25: {
                arr_object[0] = "storageManager";
                break;
            }
            case 26: {
                arr_object[0] = "bound";
                break;
            }
            case 27: {
                arr_object[0] = "type";
                break;
            }
            case 5: 
            case 28: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 5: {
                arr_object[1] = "createWithDefaultBound";
                break;
            }
            case 28: {
                arr_object[1] = "resolveUpperBounds";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
            }
        }
        switch(v) {
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                arr_object[2] = "createForFurtherModification";
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                arr_object[2] = "<init>";
                break;
            }
            case 26: {
                arr_object[2] = "addUpperBound";
                break;
            }
            case 27: {
                arr_object[2] = "reportSupertypeLoopError";
                break;
            }
            case 5: 
            case 28: {
                break;
            }
            default: {
                arr_object[2] = "createWithDefaultBound";
            }
        }
        String s = String.format((v == 5 || v == 28 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 5 || v == 28 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public void addUpperBound(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            if(this.m) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + this.b());
            }
            if(!KotlinTypeKt.isError(kotlinType0)) {
                this.l.add(kotlinType0);
            }
            return;
        }
        TypeParameterDescriptorImpl.a(26);
        throw null;
    }

    public final String b() {
        return this.getName() + " declared in " + DescriptorUtils.getFqName(this.getContainingDeclaration());
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull Variance variance0, @NotNull Name name0, int v, @NotNull SourceElement sourceElement0, @Nullable Function1 function10, @NotNull SupertypeLoopChecker supertypeLoopChecker0, @NotNull StorageManager storageManager0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(variance0 != null) {
                    if(name0 != null) {
                        if(sourceElement0 != null) {
                            if(supertypeLoopChecker0 != null) {
                                if(storageManager0 != null) {
                                    return new TypeParameterDescriptorImpl(declarationDescriptor0, annotations0, z, variance0, name0, v, sourceElement0, function10, supertypeLoopChecker0, storageManager0);
                                }
                                TypeParameterDescriptorImpl.a(18);
                                throw null;
                            }
                            TypeParameterDescriptorImpl.a(17);
                            throw null;
                        }
                        TypeParameterDescriptorImpl.a(16);
                        throw null;
                    }
                    TypeParameterDescriptorImpl.a(15);
                    throw null;
                }
                TypeParameterDescriptorImpl.a(14);
                throw null;
            }
            TypeParameterDescriptorImpl.a(13);
            throw null;
        }
        TypeParameterDescriptorImpl.a(12);
        throw null;
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull Variance variance0, @NotNull Name name0, int v, @NotNull SourceElement sourceElement0, @NotNull StorageManager storageManager0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(variance0 != null) {
                    if(name0 != null) {
                        if(sourceElement0 != null) {
                            if(storageManager0 != null) {
                                return TypeParameterDescriptorImpl.createForFurtherModification(declarationDescriptor0, annotations0, z, variance0, name0, v, sourceElement0, null, EMPTY.INSTANCE, storageManager0);
                            }
                            TypeParameterDescriptorImpl.a(11);
                            throw null;
                        }
                        TypeParameterDescriptorImpl.a(10);
                        throw null;
                    }
                    TypeParameterDescriptorImpl.a(9);
                    throw null;
                }
                TypeParameterDescriptorImpl.a(8);
                throw null;
            }
            TypeParameterDescriptorImpl.a(7);
            throw null;
        }
        TypeParameterDescriptorImpl.a(6);
        throw null;
    }

    @NotNull
    public static TypeParameterDescriptor createWithDefaultBound(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, boolean z, @NotNull Variance variance0, @NotNull Name name0, int v, @NotNull StorageManager storageManager0) {
        if(declarationDescriptor0 != null) {
            if(annotations0 != null) {
                if(variance0 != null) {
                    if(name0 != null) {
                        if(storageManager0 != null) {
                            TypeParameterDescriptor typeParameterDescriptor0 = TypeParameterDescriptorImpl.createForFurtherModification(declarationDescriptor0, annotations0, z, variance0, name0, v, SourceElement.NO_SOURCE, storageManager0);
                            ((TypeParameterDescriptorImpl)typeParameterDescriptor0).addUpperBound(DescriptorUtilsKt.getBuiltIns(declarationDescriptor0).getDefaultBound());
                            ((TypeParameterDescriptorImpl)typeParameterDescriptor0).setInitialized();
                            return typeParameterDescriptor0;
                        }
                        TypeParameterDescriptorImpl.a(4);
                        throw null;
                    }
                    TypeParameterDescriptorImpl.a(3);
                    throw null;
                }
                TypeParameterDescriptorImpl.a(2);
                throw null;
            }
            TypeParameterDescriptorImpl.a(1);
            throw null;
        }
        TypeParameterDescriptorImpl.a(0);
        throw null;
    }

    public boolean isInitialized() {
        return this.m;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public void reportSupertypeLoopError(@NotNull KotlinType kotlinType0) {
        if(kotlinType0 != null) {
            Function1 function10 = this.k;
            if(function10 == null) {
                return;
            }
            function10.invoke(kotlinType0);
            return;
        }
        TypeParameterDescriptorImpl.a(27);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List resolveUpperBounds() {
        if(!this.m) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + this.b());
        }
        List list0 = this.l;
        if(list0 != null) {
            return list0;
        }
        TypeParameterDescriptorImpl.a(28);
        throw null;
    }

    public void setInitialized() {
        if(this.m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + this.b());
        }
        this.m = true;
    }
}

