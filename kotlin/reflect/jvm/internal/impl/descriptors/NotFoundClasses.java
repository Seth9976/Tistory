package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ke.e;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NotFoundClasses {
    @SourceDebugExtension({"SMAP\nNotFoundClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1549#2:101\n1620#2,3:102\n*S KotlinDebug\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n*L\n55#1:101\n55#1:102,3\n*E\n"})
    public static final class MockClassDescriptor extends ClassDescriptorBase {
        public final boolean g;
        public final ArrayList h;
        public final ClassTypeConstructorImpl i;

        public MockClassDescriptor(@NotNull StorageManager storageManager0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull Name name0, boolean z, int v) {
            Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
            Intrinsics.checkNotNullParameter(declarationDescriptor0, "container");
            Intrinsics.checkNotNullParameter(name0, "name");
            super(storageManager0, declarationDescriptor0, name0, SourceElement.NO_SOURCE, false);
            this.g = z;
            IntRange intRange0 = c.until(0, v);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                int v1 = ((IntIterator)iterator0).nextInt();
                Name name1 = Name.identifier(("T" + v1));
                arrayList0.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.INVARIANT, name1, v1, storageManager0));
            }
            this.h = arrayList0;
            this.i = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), e0.setOf(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager0);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        @NotNull
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @Nullable
        public ClassDescriptor getCompanionObjectDescriptor() {
            return null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public Collection getConstructors() {
            return f0.emptySet();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public List getDeclaredTypeParameters() {
            return this.h;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        @NotNull
        public Collection getSealedSubclasses() {
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @NotNull
        public Empty getStaticScope() {
            return Empty.INSTANCE;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public MemberScope getStaticScope() {
            return this.getStaticScope();
        }

        @NotNull
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.i;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public TypeConstructor getTypeConstructor() {
            return this.getTypeConstructor();
        }

        @NotNull
        public Empty getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
            return Empty.INSTANCE;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner0) {
            return this.getUnsubstitutedMemberScope(kotlinTypeRefiner0);
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

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase
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
            return this.g;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isValue() {
            return false;
        }

        @Override
        @NotNull
        public String toString() {
            return "class " + this.getName() + " (not found)";
        }
    }

    public final StorageManager a;
    public final ModuleDescriptor b;
    public final MemoizedFunctionToNotNull c;
    public final MemoizedFunctionToNotNull d;

    public NotFoundClasses(@NotNull StorageManager storageManager0, @NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "module");
        super();
        this.a = storageManager0;
        this.b = moduleDescriptor0;
        this.c = storageManager0.createMemoizedFunction(new fg.c(this, 18));
        this.d = storageManager0.createMemoizedFunction(new a(this));
    }

    public static final ModuleDescriptor access$getModule$p(NotFoundClasses notFoundClasses0) {
        return notFoundClasses0.b;
    }

    @NotNull
    public final ClassDescriptor getClass(@NotNull ClassId classId0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        Intrinsics.checkNotNullParameter(list0, "typeParametersCount");
        e e0 = new e(classId0, list0);
        return (ClassDescriptor)this.d.invoke(e0);
    }
}

