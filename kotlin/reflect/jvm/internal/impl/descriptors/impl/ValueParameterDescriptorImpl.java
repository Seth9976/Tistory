package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.l;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nValueParameterDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1549#2:135\n1620#2,3:136\n*S KotlinDebug\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n*L\n129#1:135\n129#1:136,3\n*E\n"})
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final ValueParameterDescriptorImpl createWithDestructuringDeclarations(@NotNull CallableDescriptor callableDescriptor0, @Nullable ValueParameterDescriptor valueParameterDescriptor0, int v, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull KotlinType kotlinType0, boolean z, boolean z1, boolean z2, @Nullable KotlinType kotlinType1, @NotNull SourceElement sourceElement0, @Nullable Function0 function00) {
            Intrinsics.checkNotNullParameter(callableDescriptor0, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations0, "annotations");
            Intrinsics.checkNotNullParameter(name0, "name");
            Intrinsics.checkNotNullParameter(kotlinType0, "outType");
            Intrinsics.checkNotNullParameter(sourceElement0, "source");
            return function00 == null ? new ValueParameterDescriptorImpl(callableDescriptor0, valueParameterDescriptor0, v, annotations0, name0, kotlinType0, z, z1, z2, kotlinType1, sourceElement0) : new WithDestructuringDeclaration(callableDescriptor0, valueParameterDescriptor0, v, annotations0, name0, kotlinType0, z, z1, z2, kotlinType1, sourceElement0, function00);
        }
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {
        public final Lazy k;

        public WithDestructuringDeclaration(@NotNull CallableDescriptor callableDescriptor0, @Nullable ValueParameterDescriptor valueParameterDescriptor0, int v, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull KotlinType kotlinType0, boolean z, boolean z1, boolean z2, @Nullable KotlinType kotlinType1, @NotNull SourceElement sourceElement0, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(callableDescriptor0, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations0, "annotations");
            Intrinsics.checkNotNullParameter(name0, "name");
            Intrinsics.checkNotNullParameter(kotlinType0, "outType");
            Intrinsics.checkNotNullParameter(sourceElement0, "source");
            Intrinsics.checkNotNullParameter(function00, "destructuringVariables");
            super(callableDescriptor0, valueParameterDescriptor0, v, annotations0, name0, kotlinType0, z, z1, z2, kotlinType1, sourceElement0);
            this.k = c.lazy(function00);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl
        @NotNull
        public ValueParameterDescriptor copy(@NotNull CallableDescriptor callableDescriptor0, @NotNull Name name0, int v) {
            Intrinsics.checkNotNullParameter(callableDescriptor0, "newOwner");
            Intrinsics.checkNotNullParameter(name0, "newName");
            Annotations annotations0 = this.getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations0, "annotations");
            KotlinType kotlinType0 = this.getType();
            Intrinsics.checkNotNullExpressionValue(kotlinType0, "type");
            boolean z = this.declaresDefaultValue();
            Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
            p p0 = new p(this);
            return new WithDestructuringDeclaration(callableDescriptor0, null, v, annotations0, name0, kotlinType0, z, this.isCrossinline(), this.isNoinline(), this.getVarargElementType(), SourceElement.NO_SOURCE, p0);
        }

        @NotNull
        public final List getDestructuringVariables() {
            return (List)this.k.getValue();
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final KotlinType i;
    public final ValueParameterDescriptor j;

    static {
        ValueParameterDescriptorImpl.Companion = new Companion(null);
    }

    public ValueParameterDescriptorImpl(@NotNull CallableDescriptor callableDescriptor0, @Nullable ValueParameterDescriptor valueParameterDescriptor0, int v, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull KotlinType kotlinType0, boolean z, boolean z1, boolean z2, @Nullable KotlinType kotlinType1, @NotNull SourceElement sourceElement0) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(kotlinType0, "outType");
        Intrinsics.checkNotNullParameter(sourceElement0, "source");
        super(callableDescriptor0, annotations0, name0, kotlinType0, sourceElement0);
        this.e = v;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = kotlinType1;
        ValueParameterDescriptor valueParameterDescriptor1 = valueParameterDescriptor0 == null ? this : valueParameterDescriptor0;
        this.j = valueParameterDescriptor1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public Object accept(@NotNull DeclarationDescriptorVisitor declarationDescriptorVisitor0, Object object0) {
        Intrinsics.checkNotNullParameter(declarationDescriptorVisitor0, "visitor");
        return declarationDescriptorVisitor0.visitValueParameterDescriptor(this, object0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    public ValueParameterDescriptor copy(@NotNull CallableDescriptor callableDescriptor0, @NotNull Name name0, int v) {
        Intrinsics.checkNotNullParameter(callableDescriptor0, "newOwner");
        Intrinsics.checkNotNullParameter(name0, "newName");
        Annotations annotations0 = this.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations0, "annotations");
        KotlinType kotlinType0 = this.getType();
        Intrinsics.checkNotNullExpressionValue(kotlinType0, "type");
        boolean z = this.declaresDefaultValue();
        Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(callableDescriptor0, null, v, annotations0, name0, kotlinType0, z, this.isCrossinline(), this.isNoinline(), this.getVarargElementType(), SourceElement.NO_SOURCE);
    }

    @JvmStatic
    @NotNull
    public static final ValueParameterDescriptorImpl createWithDestructuringDeclarations(@NotNull CallableDescriptor callableDescriptor0, @Nullable ValueParameterDescriptor valueParameterDescriptor0, int v, @NotNull Annotations annotations0, @NotNull Name name0, @NotNull KotlinType kotlinType0, boolean z, boolean z1, boolean z2, @Nullable KotlinType kotlinType1, @NotNull SourceElement sourceElement0, @Nullable Function0 function00) {
        return ValueParameterDescriptorImpl.Companion.createWithDestructuringDeclarations(callableDescriptor0, valueParameterDescriptor0, v, annotations0, name0, kotlinType0, z, z1, z2, kotlinType1, sourceElement0, function00);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean declaresDefaultValue() {
        if(this.f) {
            CallableDescriptor callableDescriptor0 = this.getContainingDeclaration();
            Intrinsics.checkNotNull(callableDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            return ((CallableMemberDescriptor)callableDescriptor0).getKind().isReal();
        }
        return false;
    }

    @Nullable
    public Void getCompileTimeInitializer() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public ConstantValue getCompileTimeInitializer() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    public CallableDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor0 = super.getContainingDeclaration();
        Intrinsics.checkNotNull(declarationDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor)declarationDescriptor0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.getContainingDeclaration();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public CallableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl
    public DeclarationDescriptorWithSource getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    public ValueParameterDescriptor getOriginal() {
        ValueParameterDescriptor valueParameterDescriptor0 = this.j;
        return valueParameterDescriptor0 == this ? this : valueParameterDescriptor0.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl
    public VariableDescriptor getOriginal() {
        return this.getOriginal();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @NotNull
    public Collection getOverriddenDescriptors() {
        Collection collection0 = this.getContainingDeclaration().getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(collection0, "containingDeclaration.overriddenDescriptors");
        Collection collection1 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            collection1.add(((ValueParameterDescriptor)((CallableDescriptor)object0).getValueParameters().get(this.getIndex())));
        }
        return collection1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    @Nullable
    public KotlinType getVarargElementType() {
        return this.i;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        Intrinsics.checkNotNullExpressionValue(DescriptorVisibilities.LOCAL, "LOCAL");
        return DescriptorVisibilities.LOCAL;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isCrossinline() {
        return this.g;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean isNoinline() {
        return this.h;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public DeclarationDescriptorNonRoot substitute(TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }

    @NotNull
    public ValueParameterDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor0) {
        Intrinsics.checkNotNullParameter(typeSubstitutor0, "substitutor");
        if(!typeSubstitutor0.isEmpty()) {
            throw new UnsupportedOperationException();
        }
        return this;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public VariableDescriptor substitute(TypeSubstitutor typeSubstitutor0) {
        return this.substitute(typeSubstitutor0);
    }
}

