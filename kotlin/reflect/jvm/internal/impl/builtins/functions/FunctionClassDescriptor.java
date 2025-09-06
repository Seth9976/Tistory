package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a5.b;
import ie.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFunctionClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1549#2:140\n1620#2,3:141\n*S KotlinDebug\n*F\n+ 1 FunctionClassDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionClassDescriptor\n*L\n51#1:140\n51#1:141,3\n*E\n"})
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final StorageManager d;
    public final PackageFragmentDescriptor e;
    public final FunctionClassKind f;
    public final int g;
    public final a h;
    public final FunctionClassScope i;
    public final List j;
    public static final ClassId k;
    public static final ClassId l;

    static {
        FunctionClassDescriptor.Companion = new Companion(null);
        Name name0 = Name.identifier("Function");
        FunctionClassDescriptor.k = new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, name0);
        Name name1 = Name.identifier("KFunction");
        FunctionClassDescriptor.l = new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, name1);
    }

    public FunctionClassDescriptor(@NotNull StorageManager storageManager0, @NotNull PackageFragmentDescriptor packageFragmentDescriptor0, @NotNull FunctionClassKind functionClassKind0, int v) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(packageFragmentDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionClassKind0, "functionKind");
        super(storageManager0, functionClassKind0.numberedClassName(v));
        this.d = storageManager0;
        this.e = packageFragmentDescriptor0;
        this.f = functionClassKind0;
        this.g = v;
        this.h = new a(this);
        this.i = new FunctionClassScope(storageManager0, this);
        ArrayList arrayList0 = new ArrayList();
        IntRange intRange0 = new IntRange(1, v);
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
        Iterator iterator0 = intRange0.iterator();
        while(iterator0.hasNext()) {
            Name name0 = Name.identifier(b.e(((IntIterator)iterator0).nextInt(), "P"));
            arrayList0.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.IN_VARIANCE, name0, arrayList0.size(), this.d));
            arrayList1.add(Unit.INSTANCE);
        }
        Name name1 = Name.identifier("R");
        arrayList0.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.OUT_VARIANCE, name1, arrayList0.size(), this.d));
        this.j = CollectionsKt___CollectionsKt.toList(arrayList0);
    }

    public static final PackageFragmentDescriptor access$getContainingDeclaration$p(FunctionClassDescriptor functionClassDescriptor0) {
        return functionClassDescriptor0.e;
    }

    public static final ClassId access$getFunctionClassId$cp() {
        return FunctionClassDescriptor.k;
    }

    public static final ClassId access$getKFunctionClassId$cp() {
        return FunctionClassDescriptor.l;
    }

    public static final List access$getParameters$p(FunctionClassDescriptor functionClassDescriptor0) {
        return functionClassDescriptor0.j;
    }

    public static final StorageManager access$getStorageManager$p(FunctionClassDescriptor functionClassDescriptor0) {
        return functionClassDescriptor0.d;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.g;
    }

    @Nullable
    public Void getCompanionObjectDescriptor() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection getConstructors() {
        return this.getConstructors();
    }

    @NotNull
    public List getConstructors() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.getContainingDeclaration();
    }

    @NotNull
    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.e;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getDeclaredTypeParameters() {
        return this.j;
    }

    @NotNull
    public final FunctionClassKind getFunctionKind() {
        return this.f;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection getSealedSubclasses() {
        return this.getSealedSubclasses();
    }

    @NotNull
    public List getSealedSubclasses() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
        return SourceElement.NO_SOURCE;
    }

    @NotNull
    public Empty getStaticScope() {
        return Empty.INSTANCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        return this.getStaticScope();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.h;
    }

    @NotNull
    public FunctionClassScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this.i;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner0) {
        return this.getUnsubstitutedMemberScope(kotlinTypeRefiner0);
    }

    @Nullable
    public Void getUnsubstitutedPrimaryConstructor() [...] // Inlined contents

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
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
        Intrinsics.checkNotNullExpressionValue(DescriptorVisibilities.PUBLIC, "PUBLIC");
        return DescriptorVisibilities.PUBLIC;
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

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
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
    @NotNull
    public String toString() {
        String s = this.getName().asString();
        Intrinsics.checkNotNullExpressionValue(s, "name.asString()");
        return s;
    }
}

