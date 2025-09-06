package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MutableClassDescriptor extends ClassDescriptorBase {
    public final ClassKind g;
    public final boolean h;
    public Modality i;
    public DescriptorVisibility j;
    public ClassTypeConstructorImpl k;
    public ArrayList l;
    public final ArrayList m;
    public final StorageManager n;

    public MutableClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull ClassKind classKind0, boolean z, boolean z1, @NotNull Name name0, @NotNull SourceElement sourceElement0, @NotNull StorageManager storageManager0) {
        if(declarationDescriptor0 != null) {
            if(classKind0 != null) {
                if(name0 != null) {
                    if(sourceElement0 != null) {
                        if(storageManager0 != null) {
                            super(storageManager0, declarationDescriptor0, name0, sourceElement0, z1);
                            this.m = new ArrayList();
                            this.n = storageManager0;
                            this.g = classKind0;
                            this.h = z;
                            return;
                        }
                        MutableClassDescriptor.a(4);
                        throw null;
                    }
                    MutableClassDescriptor.a(3);
                    throw null;
                }
                MutableClassDescriptor.a(2);
                throw null;
            }
            MutableClassDescriptor.a(1);
            throw null;
        }
        MutableClassDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase
    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
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
                arr_object[0] = "kind";
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
            case 4: {
                arr_object[0] = "storageManager";
                break;
            }
            case 6: {
                arr_object[0] = "modality";
                break;
            }
            case 9: {
                arr_object[0] = "visibility";
                break;
            }
            case 12: {
                arr_object[0] = "supertype";
                break;
            }
            case 14: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 16: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 5: {
                arr_object[1] = "getAnnotations";
                break;
            }
            case 7: {
                arr_object[1] = "getModality";
                break;
            }
            case 8: {
                arr_object[1] = "getKind";
                break;
            }
            case 10: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 11: {
                arr_object[1] = "getTypeConstructor";
                break;
            }
            case 13: {
                arr_object[1] = "getConstructors";
                break;
            }
            case 15: {
                arr_object[1] = "getDeclaredTypeParameters";
                break;
            }
            case 17: {
                arr_object[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 18: {
                arr_object[1] = "getStaticScope";
                break;
            }
            case 19: {
                arr_object[1] = "getSealedSubclasses";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
            }
        }
        switch(v) {
            case 6: {
                arr_object[2] = "setModality";
                break;
            }
            case 9: {
                arr_object[2] = "setVisibility";
                break;
            }
            case 12: {
                arr_object[2] = "addSupertype";
                break;
            }
            case 14: {
                arr_object[2] = "setTypeParameterDescriptors";
                break;
            }
            case 16: {
                arr_object[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 19: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public void createTypeConstructor() {
        this.k = new ClassTypeConstructorImpl(this, this.l, this.m, this.n);
        for(Object object0: this.getConstructors()) {
            ((ClassConstructorDescriptorImpl)(((FunctionDescriptor)object0))).setReturnType(this.getDefaultType());
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations0 = Annotations.Companion.getEMPTY();
        if(annotations0 != null) {
            return annotations0;
        }
        MutableClassDescriptor.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getConstructors() {
        return this.getConstructors();
    }

    @NotNull
    public Set getConstructors() {
        Set set0 = Collections.emptySet();
        if(set0 != null) {
            return set0;
        }
        MutableClassDescriptor.a(13);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getDeclaredTypeParameters() {
        List list0 = this.l;
        if(list0 != null) {
            return list0;
        }
        MutableClassDescriptor.a(15);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind0 = this.g;
        if(classKind0 != null) {
            return classKind0;
        }
        MutableClassDescriptor.a(8);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality0 = this.i;
        if(modality0 != null) {
            return modality0;
        }
        MutableClassDescriptor.a(7);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getSealedSubclasses() {
        Collection collection0 = Collections.emptyList();
        if(collection0 != null) {
            return collection0;
        }
        MutableClassDescriptor.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope memberScope0 = Empty.INSTANCE;
        if(memberScope0 != null) {
            return memberScope0;
        }
        MutableClassDescriptor.a(18);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor0 = this.k;
        if(typeConstructor0 != null) {
            return typeConstructor0;
        }
        MutableClassDescriptor.a(11);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        if(kotlinTypeRefiner0 != null) {
            MemberScope memberScope0 = Empty.INSTANCE;
            if(memberScope0 != null) {
                return memberScope0;
            }
            MutableClassDescriptor.a(17);
            throw null;
        }
        MutableClassDescriptor.a(16);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation getValueClassRepresentation() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = this.j;
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0;
        }
        MutableClassDescriptor.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.h;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public void setModality(@NotNull Modality modality0) {
        if(modality0 != null) {
            this.i = modality0;
            return;
        }
        MutableClassDescriptor.a(6);
        throw null;
    }

    public void setTypeParameterDescriptors(@NotNull List list0) {
        if(list0 != null) {
            if(this.l != null) {
                throw new IllegalStateException("Type parameters are already set for " + this.getName());
            }
            this.l = new ArrayList(list0);
            return;
        }
        MutableClassDescriptor.a(14);
        throw null;
    }

    public void setVisibility(@NotNull DescriptorVisibility descriptorVisibility0) {
        if(descriptorVisibility0 != null) {
            this.j = descriptorVisibility0;
            return;
        }
        MutableClassDescriptor.a(9);
        throw null;
    }

    @Override
    public String toString() {
        return DeclarationDescriptorImpl.toString(this);
    }
}

