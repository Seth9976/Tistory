package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nAbstractTypeAliasDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1603#2,9:128\n1855#2:137\n1856#2:139\n1612#2:140\n1#3:138\n*S KotlinDebug\n*F\n+ 1 AbstractTypeAliasDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/AbstractTypeAliasDescriptor\n*L\n67#1:128,9\n67#1:137\n67#1:139\n67#1:140\n67#1:138\n*E\n"})
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {
    public final DescriptorVisibility e;
    public List f;
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.typeConstructor.1 g;

    public AbstractTypeAliasDescriptor(@NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull SourceElement sourceElement0, @NotNull DescriptorVisibility descriptorVisibility0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(sourceElement0, "sourceElement");
        Intrinsics.checkNotNullParameter(descriptorVisibility0, "visibilityImpl");
        super(declarationDescriptor0, annotations0, name0, sourceElement0);
        this.e = descriptorVisibility0;
        this.g = new TypeConstructor() {
            public final AbstractTypeAliasDescriptor a;

            {
                this.a = abstractTypeAliasDescriptor0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public KotlinBuiltIns getBuiltIns() {
                return DescriptorUtilsKt.getBuiltIns(this.getDeclarationDescriptor());
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public ClassifierDescriptor getDeclarationDescriptor() {
                return this.getDeclarationDescriptor();
            }

            @NotNull
            public TypeAliasDescriptor getDeclarationDescriptor() {
                return this.a;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public List getParameters() {
                return this.a.getTypeConstructorTypeParameters();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public Collection getSupertypes() {
                Collection collection0 = this.getDeclarationDescriptor().getUnderlyingType().getConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(collection0, "declarationDescriptor.un…pe.constructor.supertypes");
                return collection0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean isDenotable() {
                return true;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            @NotNull
            public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
                return this;
            }

            @Override
            @NotNull
            public String toString() {
                return "[typealias " + this.getDeclarationDescriptor().getName().asString() + ']';
            }
        };
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(@NotNull DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        Intrinsics.checkNotNullParameter(declarationDescriptorVisitor0, "visitor");
        return declarationDescriptorVisitor0.visitTypeAliasDescriptor(this, object0);
    }

    @NotNull
    public final SimpleType computeDefaultType() {
        MemberScope memberScope0;
        ClassDescriptor classDescriptor0 = this.getClassDescriptor();
        if(classDescriptor0 == null) {
            memberScope0 = Empty.INSTANCE;
        }
        else {
            memberScope0 = classDescriptor0.getUnsubstitutedMemberScope();
            if(memberScope0 == null) {
                memberScope0 = Empty.INSTANCE;
            }
        }
        SimpleType simpleType0 = TypeUtils.makeUnsubstitutedType(this, memberScope0, new c(this, 0));
        Intrinsics.checkNotNullExpressionValue(simpleType0, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return simpleType0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List getDeclaredTypeParameters() {
        List list0 = this.f;
        if(list0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("declaredTypeParametersImpl");
            return null;
        }
        return list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return Modality.FINAL;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public ClassifierDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @NotNull
    public TypeAliasDescriptor getOriginal() {
        DeclarationDescriptorWithSource declarationDescriptorWithSource0 = super.getOriginal();
        Intrinsics.checkNotNull(declarationDescriptorWithSource0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (TypeAliasDescriptor)declarationDescriptorWithSource0;
    }

    @NotNull
    public abstract StorageManager getStorageManager();

    @NotNull
    public final Collection getTypeAliasConstructors() {
        ClassDescriptor classDescriptor0 = this.getClassDescriptor();
        if(classDescriptor0 == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection collection0 = classDescriptor0.getConstructors();
        Intrinsics.checkNotNullExpressionValue(collection0, "classDescriptor.constructors");
        Collection collection1 = new ArrayList();
        for(Object object0: collection0) {
            StorageManager storageManager0 = this.getStorageManager();
            Intrinsics.checkNotNullExpressionValue(((ClassConstructorDescriptor)object0), "it");
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptor0 = TypeAliasConstructorDescriptorImpl.Companion.createIfAvailable(storageManager0, this, ((ClassConstructorDescriptor)object0));
            if(typeAliasConstructorDescriptor0 != null) {
                collection1.add(typeAliasConstructorDescriptor0);
            }
        }
        return collection1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.g;
    }

    @NotNull
    public abstract List getTypeConstructorTypeParameters();

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.e;
    }

    public final void initialize(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "declaredTypeParameters");
        this.f = list0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return TypeUtils.contains(this.getUnderlyingType(), new c(this, 1));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "typealias " + this.getName().asString();
    }
}

