package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import cf.a;
import cf.b;
import cf.c;
import cf.d;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.Ref;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport.Enabled;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDescriptorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n+ 2 ClassKind.kt\norg/jetbrains/kotlin/descriptors/ClassKindKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,458:1\n34#2:459\n819#3:460\n847#3,2:461\n1603#3,9:463\n1855#3:472\n1856#3:474\n1612#3:475\n819#3:476\n847#3,2:477\n819#3:481\n847#3,2:482\n350#3,7:485\n1747#3,3:492\n2624#3,3:495\n1549#3:498\n1620#3,3:499\n1#4:473\n1#4:484\n1282#5,2:479\n*S KotlinDebug\n*F\n+ 1 DescriptorUtils.kt\norg/jetbrains/kotlin/resolve/descriptorUtil/DescriptorUtilsKt\n*L\n141#1:459\n160#1:460\n160#1:461,2\n161#1:463,9\n161#1:472\n161#1:474\n161#1:475\n168#1:476\n168#1:477,2\n229#1:481\n229#1:482,2\n299#1:485,7\n441#1:492,3\n447#1:495,3\n201#1:498\n201#1:499,3\n161#1:473\n222#1:479,2\n*E\n"})
public final class DescriptorUtilsKt {
    public static final int a;

    static {
        Intrinsics.checkNotNullExpressionValue(Name.identifier("value"), "identifier(\"value\")");
    }

    public static final boolean declaresOrInheritsDefaultValue(@NotNull ValueParameterDescriptor valueParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(valueParameterDescriptor0, "<this>");
        Boolean boolean0 = DFS.ifAny(k.listOf(valueParameterDescriptor0), a.a, c.a);
        Intrinsics.checkNotNullExpressionValue(boolean0, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolean0.booleanValue();
    }

    @Nullable
    public static final CallableMemberDescriptor firstOverridden(@NotNull CallableMemberDescriptor callableMemberDescriptor0, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        return (CallableMemberDescriptor)DFS.dfs(k.listOf(callableMemberDescriptor0), new b(z), new AbstractNodeHandler() {
            @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$AbstractNodeHandler
            public void afterChildren(Object object0) {
                this.afterChildren(((CallableMemberDescriptor)object0));
            }

            public void afterChildren(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
                Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "current");
                ObjectRef ref$ObjectRef0 = ref$ObjectRef0;
                if(ref$ObjectRef0.element == null && ((Boolean)function10.invoke(callableMemberDescriptor0)).booleanValue()) {
                    ref$ObjectRef0.element = callableMemberDescriptor0;
                }
            }

            @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$AbstractNodeHandler
            public boolean beforeChildren(Object object0) {
                return this.beforeChildren(((CallableMemberDescriptor)object0));
            }

            public boolean beforeChildren(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
                Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "current");
                return ref$ObjectRef0.element == null;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$NodeHandler
            public Object result() {
                return this.result();
            }

            @Nullable
            public CallableMemberDescriptor result() {
                return (CallableMemberDescriptor)ref$ObjectRef0.element;
            }
        });
    }

    public static CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return DescriptorUtilsKt.firstOverridden(callableMemberDescriptor0, z, function10);
    }

    @Nullable
    public static final FqName fqNameOrNull(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor0);
        if(!fqNameUnsafe0.isSafe()) {
            fqNameUnsafe0 = null;
        }
        return fqNameUnsafe0 == null ? null : fqNameUnsafe0.toSafe();
    }

    @Nullable
    public static final ClassDescriptor getAnnotationClass(@NotNull AnnotationDescriptor annotationDescriptor0) {
        Intrinsics.checkNotNullParameter(annotationDescriptor0, "<this>");
        ClassifierDescriptor classifierDescriptor0 = annotationDescriptor0.getType().getConstructor().getDeclarationDescriptor();
        return classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
    }

    @NotNull
    public static final KotlinBuiltIns getBuiltIns(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        return DescriptorUtilsKt.getModule(declarationDescriptor0).getBuiltIns();
    }

    @Nullable
    public static final ClassId getClassId(@Nullable ClassifierDescriptor classifierDescriptor0) {
        if(classifierDescriptor0 != null) {
            DeclarationDescriptor declarationDescriptor0 = classifierDescriptor0.getContainingDeclaration();
            if(declarationDescriptor0 != null) {
                if(declarationDescriptor0 instanceof PackageFragmentDescriptor) {
                    return new ClassId(((PackageFragmentDescriptor)declarationDescriptor0).getFqName(), classifierDescriptor0.getName());
                }
                if(declarationDescriptor0 instanceof ClassifierDescriptorWithTypeParameters) {
                    ClassId classId0 = DescriptorUtilsKt.getClassId(((ClassifierDescriptor)declarationDescriptor0));
                    return classId0 == null ? null : classId0.createNestedClassId(classifierDescriptor0.getName());
                }
            }
        }
        return null;
    }

    @NotNull
    public static final FqName getFqNameSafe(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        FqName fqName0 = DescriptorUtils.getFqNameSafe(declarationDescriptor0);
        Intrinsics.checkNotNullExpressionValue(fqName0, "getFqNameSafe(this)");
        return fqName0;
    }

    @NotNull
    public static final FqNameUnsafe getFqNameUnsafe(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        FqNameUnsafe fqNameUnsafe0 = DescriptorUtils.getFqName(declarationDescriptor0);
        Intrinsics.checkNotNullExpressionValue(fqNameUnsafe0, "getFqName(this)");
        return fqNameUnsafe0;
    }

    @Nullable
    public static final InlineClassRepresentation getInlineClassRepresentation(@Nullable ClassDescriptor classDescriptor0) {
        ValueClassRepresentation valueClassRepresentation0 = classDescriptor0 == null ? null : classDescriptor0.getValueClassRepresentation();
        return valueClassRepresentation0 instanceof InlineClassRepresentation ? ((InlineClassRepresentation)valueClassRepresentation0) : null;
    }

    @NotNull
    public static final KotlinTypeRefiner getKotlinTypeRefiner(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        boolean z = ((Ref)moduleDescriptor0.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY())) == null;
        if(null instanceof Enabled) {
            throw new NullPointerException();
        }
        return Default.INSTANCE;
    }

    @NotNull
    public static final ModuleDescriptor getModule(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        ModuleDescriptor moduleDescriptor0 = DescriptorUtils.getContainingModule(declarationDescriptor0);
        Intrinsics.checkNotNullExpressionValue(moduleDescriptor0, "getContainingModule(this)");
        return moduleDescriptor0;
    }

    @NotNull
    public static final Sequence getParents(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        return SequencesKt___SequencesKt.drop(DescriptorUtilsKt.getParentsWithSelf(declarationDescriptor0), 1);
    }

    @NotNull
    public static final Sequence getParentsWithSelf(@NotNull DeclarationDescriptor declarationDescriptor0) {
        Intrinsics.checkNotNullParameter(declarationDescriptor0, "<this>");
        return SequencesKt__SequencesKt.generateSequence(declarationDescriptor0, d.w);
    }

    @NotNull
    public static final CallableMemberDescriptor getPropertyIfAccessor(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        if(callableMemberDescriptor0 instanceof PropertyAccessorDescriptor) {
            callableMemberDescriptor0 = ((PropertyAccessorDescriptor)callableMemberDescriptor0).getCorrespondingProperty();
            Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor0, "correspondingProperty");
        }
        return callableMemberDescriptor0;
    }

    @Nullable
    public static final ClassDescriptor getSuperClassNotAny(@NotNull ClassDescriptor classDescriptor0) {
        Intrinsics.checkNotNullParameter(classDescriptor0, "<this>");
        for(Object object0: classDescriptor0.getDefaultType().getConstructor().getSupertypes()) {
            KotlinType kotlinType0 = (KotlinType)object0;
            if(!KotlinBuiltIns.isAnyOrNullableAny(kotlinType0)) {
                ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
                if(DescriptorUtils.isClassOrEnumClass(classifierDescriptor0)) {
                    Intrinsics.checkNotNull(classifierDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (ClassDescriptor)classifierDescriptor0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static final boolean isTypeRefinementEnabled(@NotNull ModuleDescriptor moduleDescriptor0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        boolean z = ((Ref)moduleDescriptor0.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY())) == null;
        return false;
    }

    @Nullable
    public static final ClassDescriptor resolveTopLevelClass(@NotNull ModuleDescriptor moduleDescriptor0, @NotNull FqName fqName0, @NotNull LookupLocation lookupLocation0) {
        Intrinsics.checkNotNullParameter(moduleDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(fqName0, "topLevelClassFqName");
        Intrinsics.checkNotNullParameter(lookupLocation0, "location");
        FqName fqName1 = fqName0.parent();
        Intrinsics.checkNotNullExpressionValue(fqName1, "topLevelClassFqName.parent()");
        MemberScope memberScope0 = moduleDescriptor0.getPackage(fqName1).getMemberScope();
        Name name0 = fqName0.shortName();
        Intrinsics.checkNotNullExpressionValue(name0, "topLevelClassFqName.shortName()");
        ClassifierDescriptor classifierDescriptor0 = memberScope0.getContributedClassifier(name0, lookupLocation0);
        return classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
    }
}

