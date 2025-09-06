package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {
    public final ModuleAwareClassDescriptor a;
    public final TypeSubstitutor b;
    public TypeSubstitutor c;
    public ArrayList d;
    public List e;
    public ClassTypeConstructorImpl f;
    public static final int g;

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor0, TypeSubstitutor typeSubstitutor0) {
        this.a = moduleAwareClassDescriptor0;
        this.b = typeSubstitutor0;
    }

    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
                break;
            }
            default: {
                s = "@NotNull method %s.%s must not return null";
            }
        }
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                v1 = 3;
                break;
            }
            default: {
                v1 = 2;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: 
            case 8: {
                arr_object[0] = "typeArguments";
                break;
            }
            case 5: 
            case 10: {
                arr_object[0] = "typeSubstitution";
                break;
            }
            case 3: 
            case 6: 
            case 13: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 23: {
                arr_object[0] = "substitutor";
                break;
            }
            default: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
            }
        }
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 11: {
                arr_object[1] = "getMemberScope";
                break;
            }
            case 12: 
            case 14: {
                arr_object[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 15: {
                arr_object[1] = "getStaticScope";
                break;
            }
            case 16: {
                arr_object[1] = "getDefaultType";
                break;
            }
            case 17: {
                arr_object[1] = "getContextReceivers";
                break;
            }
            case 18: {
                arr_object[1] = "getConstructors";
                break;
            }
            case 19: {
                arr_object[1] = "getAnnotations";
                break;
            }
            case 20: {
                arr_object[1] = "getName";
                break;
            }
            case 21: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 22: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            }
            case 24: {
                arr_object[1] = "substitute";
                break;
            }
            case 25: {
                arr_object[1] = "getKind";
                break;
            }
            case 26: {
                arr_object[1] = "getModality";
                break;
            }
            case 27: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 28: {
                arr_object[1] = "getUnsubstitutedInnerClassesScope";
                break;
            }
            case 29: {
                arr_object[1] = "getSource";
                break;
            }
            case 30: {
                arr_object[1] = "getDeclaredTypeParameters";
                break;
            }
            case 0x1F: {
                arr_object[1] = "getSealedSubclasses";
                break;
            }
            default: {
                arr_object[1] = "getTypeConstructor";
            }
        }
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: {
                arr_object[2] = "getMemberScope";
                break;
            }
            case 13: {
                arr_object[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 23: {
                arr_object[2] = "substitute";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 10: 
            case 13: 
            case 23: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalStateException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitClassDescriptor(this, object0);
    }

    public final TypeSubstitutor b() {
        if(this.c == null) {
            TypeSubstitutor typeSubstitutor0 = this.b;
            if(typeSubstitutor0.isEmpty()) {
                this.c = typeSubstitutor0;
                return this.c;
            }
            List list0 = this.a.getTypeConstructor().getParameters();
            this.d = new ArrayList(list0.size());
            this.c = DescriptorSubstitutor.substituteTypeParameters(list0, typeSubstitutor0.getSubstitution(), this, this.d);
            this.e = CollectionsKt___CollectionsKt.filter(this.d, new n(0));
        }
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations0 = this.a.getAnnotations();
        if(annotations0 != null) {
            return annotations0;
        }
        LazySubstitutingClassDescriptor.a(19);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor getCompanionObjectDescriptor() {
        return this.a.getCompanionObjectDescriptor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getConstructors() {
        Collection collection0 = this.a.getConstructors();
        Collection collection1 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            ((ArrayList)collection1).add(((ClassConstructorDescriptor)((ClassConstructorDescriptor)object0).newCopyBuilder().setOriginal(((ClassConstructorDescriptor)object0).getOriginal()).setModality(((ClassConstructorDescriptor)object0).getModality()).setVisibility(((ClassConstructorDescriptor)object0).getVisibility()).setKind(((ClassConstructorDescriptor)object0).getKind()).setCopyOverrides(false).build()).substitute(this.b()));
        }
        return collection1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor0 = this.a.getContainingDeclaration();
        if(declarationDescriptor0 != null) {
            return declarationDescriptor0;
        }
        LazySubstitutingClassDescriptor.a(22);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getContextReceivers() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        LazySubstitutingClassDescriptor.a(17);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getDeclaredTypeParameters() {
        this.b();
        List list0 = this.e;
        if(list0 != null) {
            return list0;
        }
        LazySubstitutingClassDescriptor.a(30);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        List list0 = TypeUtils.getDefaultTypeProjections(this.getTypeConstructor().getParameters());
        Annotations annotations0 = this.getAnnotations();
        SimpleType simpleType0 = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(DefaultTypeAttributeTranslator.INSTANCE.toAttributes(annotations0, null, null), this.getTypeConstructor(), list0, false, this.getUnsubstitutedMemberScope());
        if(simpleType0 != null) {
            return simpleType0;
        }
        LazySubstitutingClassDescriptor.a(16);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind0 = this.a.getKind();
        if(classKind0 != null) {
            return classKind0;
        }
        LazySubstitutingClassDescriptor.a(25);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution0) {
        if(typeSubstitution0 != null) {
            MemberScope memberScope0 = this.getMemberScope(typeSubstitution0, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
            if(memberScope0 != null) {
                return memberScope0;
            }
            LazySubstitutingClassDescriptor.a(11);
            throw null;
        }
        LazySubstitutingClassDescriptor.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution0, @NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        if(typeSubstitution0 != null) {
            if(kotlinTypeRefiner0 != null) {
                MemberScope memberScope0 = this.a.getMemberScope(typeSubstitution0, kotlinTypeRefiner0);
                if(this.b.isEmpty()) {
                    if(memberScope0 != null) {
                        return memberScope0;
                    }
                    LazySubstitutingClassDescriptor.a(7);
                    throw null;
                }
                return new SubstitutingScope(memberScope0, this.b());
            }
            LazySubstitutingClassDescriptor.a(6);
            throw null;
        }
        LazySubstitutingClassDescriptor.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality0 = this.a.getModality();
        if(modality0 != null) {
            return modality0;
        }
        LazySubstitutingClassDescriptor.a(26);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name0 = this.a.getName();
        if(name0 != null) {
            return name0;
        }
        LazySubstitutingClassDescriptor.a(20);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassDescriptor getOriginal() {
        ClassDescriptor classDescriptor0 = this.a.getOriginal();
        if(classDescriptor0 != null) {
            return classDescriptor0;
        }
        LazySubstitutingClassDescriptor.a(21);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public ClassifierDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getSealedSubclasses() {
        Collection collection0 = this.a.getSealedSubclasses();
        if(collection0 != null) {
            return collection0;
        }
        LazySubstitutingClassDescriptor.a(0x1F);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement0 = SourceElement.NO_SOURCE;
        if(sourceElement0 != null) {
            return sourceElement0;
        }
        LazySubstitutingClassDescriptor.a(29);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope memberScope0 = this.a.getStaticScope();
        if(memberScope0 != null) {
            return memberScope0;
        }
        LazySubstitutingClassDescriptor.a(15);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor0 = this.a.getTypeConstructor();
        if(this.b.isEmpty()) {
            if(typeConstructor0 != null) {
                return typeConstructor0;
            }
            LazySubstitutingClassDescriptor.a(0);
            throw null;
        }
        if(this.f == null) {
            TypeSubstitutor typeSubstitutor0 = this.b();
            Collection collection0 = typeConstructor0.getSupertypes();
            ArrayList arrayList0 = new ArrayList(collection0.size());
            for(Object object0: collection0) {
                arrayList0.add(typeSubstitutor0.substitute(((KotlinType)object0), Variance.INVARIANT));
            }
            this.f = new ClassTypeConstructorImpl(this, this.d, arrayList0, LockBasedStorageManager.NO_LOCKS);
        }
        TypeConstructor typeConstructor1 = this.f;
        if(typeConstructor1 != null) {
            return typeConstructor1;
        }
        LazySubstitutingClassDescriptor.a(1);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope memberScope0 = this.a.getUnsubstitutedInnerClassesScope();
        if(memberScope0 != null) {
            return memberScope0;
        }
        LazySubstitutingClassDescriptor.a(28);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope memberScope0 = this.getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this.a)));
        if(memberScope0 != null) {
            return memberScope0;
        }
        LazySubstitutingClassDescriptor.a(12);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        if(kotlinTypeRefiner0 != null) {
            MemberScope memberScope0 = this.a.getUnsubstitutedMemberScope(kotlinTypeRefiner0);
            if(this.b.isEmpty()) {
                if(memberScope0 != null) {
                    return memberScope0;
                }
                LazySubstitutingClassDescriptor.a(14);
                throw null;
            }
            return new SubstitutingScope(memberScope0, this.b());
        }
        LazySubstitutingClassDescriptor.a(13);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return this.a.getUnsubstitutedPrimaryConstructor();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation getValueClassRepresentation() {
        ValueClassRepresentation valueClassRepresentation0 = this.a.getValueClassRepresentation();
        return valueClassRepresentation0 == null ? null : valueClassRepresentation0.mapUnderlyingType(new a(this, 1));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility0 = this.a.getVisibility();
        if(descriptorVisibility0 != null) {
            return descriptorVisibility0;
        }
        LazySubstitutingClassDescriptor.a(27);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.a.isActual();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.a.isCompanionObject();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.a.isData();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.a.isExpect();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.a.isExternal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return this.a.isFun();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.a.isInline();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.a.isInner();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return this.a.isValue();
    }

    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            return typeSubstitutor0.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.createChainedSubstitutor(typeSubstitutor0.getSubstitution(), this.b().getSubstitution()));
        }
        LazySubstitutingClassDescriptor.a(23);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }
}

