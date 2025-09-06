package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;
import se.b;
import se.c;

@SourceDebugExtension({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1747#2,3:323\n1747#2,3:326\n1603#2,9:329\n1855#2:338\n1856#2:340\n1612#2:341\n1045#2:342\n1#3:339\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n185#1:323,3\n188#1:326,3\n200#1:329,9\n200#1:338\n200#1:340\n200#1:341\n202#1:342\n200#1:339\n*E\n"})
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final LazyJavaResolverContext g;
    public final JavaClass h;
    public final ClassDescriptor i;
    public final LazyJavaResolverContext j;
    public final Lazy k;
    public final ClassKind l;
    public final Modality m;
    public final Visibility n;
    public final boolean o;
    public final c p;
    public final LazyJavaClassMemberScope q;
    public final ScopesHolderForClass r;
    public final InnerClassesScopeWrapper s;
    public final LazyJavaStaticClassScope t;
    public final Annotations u;
    public final NotNullLazyValue v;
    public static final Set w;

    static {
        LazyJavaClassDescriptor.Companion = new Companion(null);
        LazyJavaClassDescriptor.w = f0.setOf(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    public LazyJavaClassDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext0, @NotNull DeclarationDescriptor declarationDescriptor0, @NotNull JavaClass javaClass0, @Nullable ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext0, "outerContext");
        Modality modality0;
        ClassKind classKind0;
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "containingDeclaration");
        Intrinsics.checkNotNullParameter(javaClass0, "jClass");
        super(lazyJavaResolverContext0.getStorageManager(), declarationDescriptor0, javaClass0.getName(), lazyJavaResolverContext0.getComponents().getSourceElementFactory().source(javaClass0), false);
        this.g = lazyJavaResolverContext0;
        this.h = javaClass0;
        this.i = classDescriptor0;
        LazyJavaResolverContext lazyJavaResolverContext1 = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext0, this, javaClass0, 0, 4, null);
        this.j = lazyJavaResolverContext1;
        lazyJavaResolverContext1.getComponents().getJavaResolverCache().recordClass(javaClass0, this);
        javaClass0.getLightClassOriginKind();
        this.k = md.c.lazy(new b(this, 2));
        if(javaClass0.isAnnotationType()) {
            classKind0 = ClassKind.ANNOTATION_CLASS;
        }
        else if(javaClass0.isInterface()) {
            classKind0 = ClassKind.INTERFACE;
        }
        else {
            classKind0 = javaClass0.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        }
        this.l = classKind0;
        if(javaClass0.isAnnotationType() || javaClass0.isEnum()) {
            modality0 = Modality.FINAL;
        }
        else {
            boolean z = javaClass0.isSealed();
            boolean z1 = javaClass0.isSealed() || javaClass0.isAbstract() || javaClass0.isInterface();
            modality0 = Modality.Companion.convertFromFlags(z, z1, !javaClass0.isFinal());
        }
        this.m = modality0;
        this.n = javaClass0.getVisibility();
        this.o = javaClass0.getOuterClass() != null && !javaClass0.isStatic();
        this.p = new c(this);
        LazyJavaClassMemberScope lazyJavaClassMemberScope0 = new LazyJavaClassMemberScope(lazyJavaResolverContext1, this, javaClass0, classDescriptor0 != null, null, 16, null);
        this.q = lazyJavaClassMemberScope0;
        StorageManager storageManager0 = lazyJavaResolverContext1.getStorageManager();
        KotlinTypeRefiner kotlinTypeRefiner0 = lazyJavaResolverContext1.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner();
        h1 h10 = new h1(this, 5);
        this.r = ScopesHolderForClass.Companion.create(this, storageManager0, kotlinTypeRefiner0, h10);
        this.s = new InnerClassesScopeWrapper(lazyJavaClassMemberScope0);
        this.t = new LazyJavaStaticClassScope(lazyJavaResolverContext1, javaClass0, this);
        this.u = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext1, javaClass0);
        this.v = lazyJavaResolverContext1.getStorageManager().createLazyValue(new b(this, 1));
    }

    public LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext0, DeclarationDescriptor declarationDescriptor0, JavaClass javaClass0, ClassDescriptor classDescriptor0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            classDescriptor0 = null;
        }
        this(lazyJavaResolverContext0, declarationDescriptor0, javaClass0, classDescriptor0);
    }

    public static final LazyJavaClassMemberScope access$getUnsubstitutedMemberScope$p(LazyJavaClassDescriptor lazyJavaClassDescriptor0) {
        return lazyJavaClassDescriptor0.q;
    }

    @NotNull
    public final LazyJavaClassDescriptor copy$descriptors_jvm(@NotNull JavaResolverCache javaResolverCache0, @Nullable ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(javaResolverCache0, "javaResolverCache");
        JavaResolverComponents javaResolverComponents0 = this.j.getComponents().replace(javaResolverCache0);
        LazyJavaResolverContext lazyJavaResolverContext0 = ContextKt.replaceComponents(this.j, javaResolverComponents0);
        DeclarationDescriptor declarationDescriptor0 = this.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(declarationDescriptor0, "containingDeclaration");
        return new LazyJavaClassDescriptor(lazyJavaResolverContext0, declarationDescriptor0, this.h, classDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.u;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection getConstructors() {
        return this.getConstructors();
    }

    @NotNull
    public List getConstructors() {
        return (List)this.q.getConstructors$descriptors_jvm().invoke();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List getDeclaredTypeParameters() {
        return (List)this.v.invoke();
    }

    @NotNull
    public final JavaClass getJClass() {
        return this.h;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.l;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Modality getModality() {
        return this.m;
    }

    @Nullable
    public final List getModuleAnnotations() {
        return (List)this.k.getValue();
    }

    @NotNull
    public final LazyJavaResolverContext getOuterContext() {
        return this.g;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection getSealedSubclasses() {
        if(this.m == Modality.SEALED) {
            JavaTypeAttributes javaTypeAttributes0 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            Iterable iterable0 = this.h.getPermittedTypes();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                ClassifierDescriptor classifierDescriptor0 = this.j.getTypeResolver().transformJavaType(((JavaClassifierType)object0), javaTypeAttributes0).getConstructor().getDeclarationDescriptor();
                ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
                if(classDescriptor0 != null) {
                    arrayList0.add(classDescriptor0);
                }
            }
            return CollectionsKt___CollectionsKt.sortedWith(arrayList0, new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.getSealedSubclasses..inlined.sortedBy.1());
        }
        return CollectionsKt__CollectionsKt.emptyList();

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n1#1,328:1\n202#2:329\n*E\n"})
        public final class kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.getSealedSubclasses..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return pd.c.compareValues(DescriptorUtilsKt.getFqNameSafe(((ClassDescriptor)object0)).asString(), DescriptorUtilsKt.getFqNameSafe(((ClassDescriptor)object1)).asString());
            }
        }

    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        return this.t;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.p;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return this.s;
    }

    @NotNull
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        MemberScope memberScope0 = super.getUnsubstitutedMemberScope();
        Intrinsics.checkNotNull(memberScope0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope)memberScope0;
    }

    @NotNull
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope)this.r.getScope(kotlinTypeRefiner0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedMemberScope() {
        return this.getUnsubstitutedMemberScope();
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
        Visibility visibility0 = this.n;
        if(Intrinsics.areEqual(visibility0, DescriptorVisibilities.PRIVATE) && this.h.getOuterClass() == null) {
            Intrinsics.checkNotNullExpressionValue(JavaDescriptorVisibilities.PACKAGE_VISIBILITY, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
            return JavaDescriptorVisibilities.PACKAGE_VISIBILITY;
        }
        return UtilsKt.toDescriptorVisibility(visibility0);
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
        return this.o;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    @Override
    @NotNull
    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.getFqNameUnsafe(this);
    }
}

