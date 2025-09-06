package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {
    public final Name a;
    public final NotNullLazyValue b;
    public final NotNullLazyValue c;
    protected final NotNullLazyValue defaultType;

    public AbstractClassDescriptor(@NotNull StorageManager storageManager0, @NotNull Name name0) {
        if(storageManager0 != null) {
            if(name0 != null) {
                super();
                this.a = name0;
                this.defaultType = storageManager0.createLazyValue(new b(this, 0));
                this.b = storageManager0.createLazyValue(new b(this, 1));
                this.c = storageManager0.createLazyValue(new b(this, 2));
                return;
            }
            AbstractClassDescriptor.a(1);
            throw null;
        }
        AbstractClassDescriptor.a(0);
        throw null;
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
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
                arr_object[0] = "name";
                break;
            }
            case 8: 
            case 11: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 7: 
            case 13: {
                arr_object[0] = "typeArguments";
                break;
            }
            case 10: 
            case 15: {
                arr_object[0] = "typeSubstitution";
                break;
            }
            case 18: {
                arr_object[0] = "substitutor";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
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
            case 4: {
                arr_object[1] = "getUnsubstitutedInnerClassesScope";
                break;
            }
            case 5: {
                arr_object[1] = "getThisAsReceiverParameter";
                break;
            }
            case 6: {
                arr_object[1] = "getContextReceivers";
                break;
            }
            case 9: 
            case 12: 
            case 14: 
            case 16: {
                arr_object[1] = "getMemberScope";
                break;
            }
            case 17: {
                arr_object[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 19: {
                arr_object[1] = "substitute";
                break;
            }
            case 20: {
                arr_object[1] = "getDefaultType";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
            }
        }
        switch(v) {
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: {
                arr_object[2] = "getMemberScope";
                break;
            }
            case 18: {
                arr_object[2] = "substitute";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        return declarationDescriptorVisitor0.visitClassDescriptor(this, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getContextReceivers() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        AbstractClassDescriptor.a(6);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleType0 = (SimpleType)this.defaultType.invoke();
        if(simpleType0 != null) {
            return simpleType0;
        }
        AbstractClassDescriptor.a(20);
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
            AbstractClassDescriptor.a(16);
            throw null;
        }
        AbstractClassDescriptor.a(15);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution0, @NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        if(typeSubstitution0 != null) {
            if(kotlinTypeRefiner0 != null) {
                if(typeSubstitution0.isEmpty()) {
                    MemberScope memberScope0 = this.getUnsubstitutedMemberScope(kotlinTypeRefiner0);
                    if(memberScope0 != null) {
                        return memberScope0;
                    }
                    AbstractClassDescriptor.a(12);
                    throw null;
                }
                TypeSubstitutor typeSubstitutor0 = TypeSubstitutor.create(typeSubstitution0);
                return new SubstitutingScope(this.getUnsubstitutedMemberScope(kotlinTypeRefiner0), typeSubstitutor0);
            }
            AbstractClassDescriptor.a(11);
            throw null;
        }
        AbstractClassDescriptor.a(10);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name0 = this.a;
        if(name0 != null) {
            return name0;
        }
        AbstractClassDescriptor.a(2);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassDescriptor getOriginal() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public ClassifierDescriptor getOriginal() {
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        ReceiverParameterDescriptor receiverParameterDescriptor0 = (ReceiverParameterDescriptor)this.c.invoke();
        if(receiverParameterDescriptor0 != null) {
            return receiverParameterDescriptor0;
        }
        AbstractClassDescriptor.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope memberScope0 = (MemberScope)this.b.invoke();
        if(memberScope0 != null) {
            return memberScope0;
        }
        AbstractClassDescriptor.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope memberScope0 = this.getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if(memberScope0 != null) {
            return memberScope0;
        }
        AbstractClassDescriptor.a(17);
        throw null;
    }

    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        if(typeSubstitutor0 != null) {
            return typeSubstitutor0.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor0);
        }
        AbstractClassDescriptor.a(18);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public DeclarationDescriptorNonRoot substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }
}

