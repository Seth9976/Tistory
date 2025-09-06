package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {
    public final ClassTypeConstructorImpl g;
    public final j h;
    public final NotNullLazyValue i;
    public final Annotations j;

    public EnumEntrySyntheticClassDescriptor(StorageManager storageManager0, ClassDescriptor classDescriptor0, SimpleType simpleType0, Name name0, NotNullLazyValue notNullLazyValue0, Annotations annotations0, SourceElement sourceElement0) {
        if(storageManager0 != null) {
            if(classDescriptor0 != null) {
                if(simpleType0 != null) {
                    if(name0 != null) {
                        if(notNullLazyValue0 != null) {
                            if(annotations0 != null) {
                                if(sourceElement0 != null) {
                                    super(storageManager0, classDescriptor0, name0, sourceElement0, false);
                                    this.j = annotations0;
                                    this.g = new ClassTypeConstructorImpl(this, Collections.emptyList(), Collections.singleton(simpleType0), storageManager0);
                                    this.h = new j(this, storageManager0);
                                    this.i = notNullLazyValue0;
                                    return;
                                }
                                EnumEntrySyntheticClassDescriptor.a(12);
                                throw null;
                            }
                            EnumEntrySyntheticClassDescriptor.a(11);
                            throw null;
                        }
                        EnumEntrySyntheticClassDescriptor.a(10);
                        throw null;
                    }
                    EnumEntrySyntheticClassDescriptor.a(9);
                    throw null;
                }
                EnumEntrySyntheticClassDescriptor.a(8);
                throw null;
            }
            EnumEntrySyntheticClassDescriptor.a(7);
            throw null;
        }
        EnumEntrySyntheticClassDescriptor.a(6);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase
    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
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
                arr_object[0] = "enumClass";
                break;
            }
            case 7: {
                arr_object[0] = "containingClass";
                break;
            }
            case 8: {
                arr_object[0] = "supertype";
                break;
            }
            case 2: 
            case 9: {
                arr_object[0] = "name";
                break;
            }
            case 3: 
            case 10: {
                arr_object[0] = "enumMemberNames";
                break;
            }
            case 4: 
            case 11: {
                arr_object[0] = "annotations";
                break;
            }
            case 5: 
            case 12: {
                arr_object[0] = "source";
                break;
            }
            case 13: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 14: {
                arr_object[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 15: {
                arr_object[1] = "getStaticScope";
                break;
            }
            case 16: {
                arr_object[1] = "getConstructors";
                break;
            }
            case 17: {
                arr_object[1] = "getTypeConstructor";
                break;
            }
            case 18: {
                arr_object[1] = "getKind";
                break;
            }
            case 19: {
                arr_object[1] = "getModality";
                break;
            }
            case 20: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 21: {
                arr_object[1] = "getAnnotations";
                break;
            }
            case 22: {
                arr_object[1] = "getDeclaredTypeParameters";
                break;
            }
            case 23: {
                arr_object[1] = "getSealedSubclasses";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
            }
        }
        switch(v) {
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arr_object[2] = "<init>";
                break;
            }
            case 13: {
                arr_object[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                break;
            }
            default: {
                arr_object[2] = "create";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @NotNull
    public static EnumEntrySyntheticClassDescriptor create(@NotNull StorageManager storageManager0, @NotNull ClassDescriptor classDescriptor0, @NotNull Name name0, @NotNull NotNullLazyValue notNullLazyValue0, @NotNull Annotations annotations0, @NotNull SourceElement sourceElement0) {
        if(storageManager0 != null) {
            if(classDescriptor0 != null) {
                if(name0 != null) {
                    if(notNullLazyValue0 != null) {
                        if(annotations0 != null) {
                            if(sourceElement0 != null) {
                                return new EnumEntrySyntheticClassDescriptor(storageManager0, classDescriptor0, classDescriptor0.getDefaultType(), name0, notNullLazyValue0, annotations0, sourceElement0);
                            }
                            EnumEntrySyntheticClassDescriptor.a(5);
                            throw null;
                        }
                        EnumEntrySyntheticClassDescriptor.a(4);
                        throw null;
                    }
                    EnumEntrySyntheticClassDescriptor.a(3);
                    throw null;
                }
                EnumEntrySyntheticClassDescriptor.a(2);
                throw null;
            }
            EnumEntrySyntheticClassDescriptor.a(1);
            throw null;
        }
        EnumEntrySyntheticClassDescriptor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations0 = this.j;
        if(annotations0 != null) {
            return annotations0;
        }
        EnumEntrySyntheticClassDescriptor.a(21);
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
        Collection collection0 = Collections.emptyList();
        if(collection0 != null) {
            return collection0;
        }
        EnumEntrySyntheticClassDescriptor.a(16);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getDeclaredTypeParameters() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        EnumEntrySyntheticClassDescriptor.a(22);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind0 = ClassKind.ENUM_ENTRY;
        if(classKind0 != null) {
            return classKind0;
        }
        EnumEntrySyntheticClassDescriptor.a(18);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality0 = Modality.FINAL;
        if(modality0 != null) {
            return modality0;
        }
        EnumEntrySyntheticClassDescriptor.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getSealedSubclasses() {
        Collection collection0 = Collections.emptyList();
        if(collection0 != null) {
            return collection0;
        }
        EnumEntrySyntheticClassDescriptor.a(23);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope memberScope0 = Empty.INSTANCE;
        if(memberScope0 != null) {
            return memberScope0;
        }
        EnumEntrySyntheticClassDescriptor.a(15);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor0 = this.g;
        if(typeConstructor0 != null) {
            return typeConstructor0;
        }
        EnumEntrySyntheticClassDescriptor.a(17);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        if(kotlinTypeRefiner0 != null) {
            MemberScope memberScope0 = this.h;
            if(memberScope0 != null) {
                return memberScope0;
            }
            EnumEntrySyntheticClassDescriptor.a(14);
            throw null;
        }
        EnumEntrySyntheticClassDescriptor.a(13);
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
        DescriptorVisibility descriptorVisibility0 = DescriptorVisibilities.PUBLIC;
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0;
        }
        EnumEntrySyntheticClassDescriptor.a(20);
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
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    @Override
    public String toString() {
        return "enum entry " + this.getName();
    }
}

