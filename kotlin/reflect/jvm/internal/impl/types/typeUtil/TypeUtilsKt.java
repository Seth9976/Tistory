package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import hf.a;
import hf.b;
import hf.c;
import hf.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.l;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTypeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n261#1,14:433\n276#1:451\n265#1,12:452\n261#1,14:464\n276#1:482\n265#1,12:483\n272#1,3:501\n276#1:508\n272#1,3:509\n276#1:516\n272#1,3:517\n276#1:524\n397#1:550\n397#1:551\n397#1:552\n1747#2,3:407\n1549#2:410\n1620#2,3:411\n1855#2,2:414\n1603#2,9:417\n1855#2:426\n1856#2:428\n1612#2:429\n766#2:430\n857#2,2:431\n1549#2:447\n1620#2,3:448\n1549#2:478\n1620#2,3:479\n1747#2,3:495\n1747#2,3:498\n1549#2:504\n1620#2,3:505\n1549#2:512\n1620#2,3:513\n1549#2:520\n1620#2,3:521\n1549#2:525\n1620#2,3:526\n1549#2:529\n1620#2,3:530\n1747#2,3:533\n288#2,2:536\n1549#2:538\n1620#2,3:539\n1549#2:542\n1620#2,3:543\n1549#2:546\n1620#2,3:547\n1#3:416\n1#3:427\n*S KotlinDebug\n*F\n+ 1 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n200#1:433,14\n200#1:451\n200#1:452,12\n201#1:464,14\n201#1:482\n201#1:483,12\n264#1:501,3\n264#1:508\n265#1:509,3\n265#1:516\n267#1:517,3\n267#1:524\n389#1:550\n392#1:551\n395#1:552\n90#1:407,3\n141#1:410\n141#1:411,3\n157#1:414,2\n183#1:417,9\n183#1:426\n183#1:428\n183#1:429\n189#1:430\n189#1:431,2\n200#1:447\n200#1:448,3\n201#1:478\n201#1:479,3\n239#1:495,3\n251#1:498,3\n264#1:504\n264#1:505,3\n265#1:512\n265#1:513,3\n267#1:520\n267#1:521,3\n274#1:525\n274#1:526,3\n281#1:529\n281#1:530,3\n307#1:533,3\n314#1:536,2\n324#1:538\n324#1:539,3\n343#1:542\n343#1:543,3\n351#1:546\n351#1:547,3\n183#1:427\n*E\n"})
public final class TypeUtilsKt {
    public static final boolean a(KotlinType kotlinType0, TypeConstructor typeConstructor0, Set set0) {
        boolean z;
        if(Intrinsics.areEqual(kotlinType0.getConstructor(), typeConstructor0)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0 = classifierDescriptor0 instanceof ClassifierDescriptorWithTypeParameters ? ((ClassifierDescriptorWithTypeParameters)classifierDescriptor0) : null;
        List list0 = classifierDescriptorWithTypeParameters0 == null ? null : classifierDescriptorWithTypeParameters0.getDeclaredTypeParameters();
        Iterable iterable0 = CollectionsKt___CollectionsKt.withIndex(kotlinType0.getArguments());
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                int v = ((IndexedValue)object0).component1();
                TypeProjection typeProjection0 = (TypeProjection)((IndexedValue)object0).component2();
                TypeParameterDescriptor typeParameterDescriptor0 = list0 == null ? null : ((TypeParameterDescriptor)CollectionsKt___CollectionsKt.getOrNull(list0, v));
                if((typeParameterDescriptor0 == null || set0 == null || !set0.contains(typeParameterDescriptor0)) && !typeProjection0.isStarProjection()) {
                    KotlinType kotlinType1 = typeProjection0.getType();
                    Intrinsics.checkNotNullExpressionValue(kotlinType1, "argument.type");
                    z = TypeUtilsKt.a(kotlinType1, typeConstructor0, set0);
                }
                else {
                    z = false;
                }
                if(z) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @NotNull
    public static final TypeProjection asTypeProjection(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return new TypeProjectionImpl(kotlinType0);
    }

    public static final void b(KotlinType kotlinType0, KotlinType kotlinType1, LinkedHashSet linkedHashSet0, Set set0) {
        ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
        if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
            if(!Intrinsics.areEqual(kotlinType0.getConstructor(), kotlinType1.getConstructor())) {
                linkedHashSet0.add(classifierDescriptor0);
                return;
            }
            for(Object object0: ((TypeParameterDescriptor)classifierDescriptor0).getUpperBounds()) {
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object0), "upperBound");
                TypeUtilsKt.b(((KotlinType)object0), kotlinType1, linkedHashSet0, set0);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptor1 = kotlinType0.getConstructor().getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters0 = classifierDescriptor1 instanceof ClassifierDescriptorWithTypeParameters ? ((ClassifierDescriptorWithTypeParameters)classifierDescriptor1) : null;
        List list0 = classifierDescriptorWithTypeParameters0 == null ? null : classifierDescriptorWithTypeParameters0.getDeclaredTypeParameters();
        int v = 0;
        for(Object object1: kotlinType0.getArguments()) {
            TypeProjection typeProjection0 = (TypeProjection)object1;
            TypeParameterDescriptor typeParameterDescriptor0 = list0 == null ? null : ((TypeParameterDescriptor)CollectionsKt___CollectionsKt.getOrNull(list0, v));
            if((typeParameterDescriptor0 == null || set0 == null || !set0.contains(typeParameterDescriptor0)) && !typeProjection0.isStarProjection() && !CollectionsKt___CollectionsKt.contains(linkedHashSet0, typeProjection0.getType().getConstructor().getDeclarationDescriptor()) && !Intrinsics.areEqual(typeProjection0.getType().getConstructor(), kotlinType1.getConstructor())) {
                KotlinType kotlinType2 = typeProjection0.getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType2, "argument.type");
                TypeUtilsKt.b(kotlinType2, kotlinType1, linkedHashSet0, set0);
            }
            ++v;
        }
    }

    public static final boolean contains(@NotNull KotlinType kotlinType0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return TypeUtils.contains(kotlinType0, function10);
    }

    public static final boolean containsTypeAliasParameters(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return TypeUtilsKt.contains(kotlinType0, a.w);
    }

    public static final boolean containsTypeParameter(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return TypeUtils.contains(kotlinType0, b.w);
    }

    @NotNull
    public static final TypeProjection createProjection(@NotNull KotlinType kotlinType0, @NotNull Variance variance0, @Nullable TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        Intrinsics.checkNotNullParameter(variance0, "projectionKind");
        if((typeParameterDescriptor0 == null ? null : typeParameterDescriptor0.getVariance()) == variance0) {
            variance0 = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(variance0, kotlinType0);
    }

    @NotNull
    public static final Set extractTypeParametersFromUpperBounds(@NotNull KotlinType kotlinType0, @Nullable Set set0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        Set set1 = new LinkedHashSet();
        TypeUtilsKt.b(kotlinType0, kotlinType0, ((LinkedHashSet)set1), set0);
        return set1;
    }

    @NotNull
    public static final KotlinBuiltIns getBuiltIns(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        KotlinBuiltIns kotlinBuiltIns0 = kotlinType0.getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(kotlinBuiltIns0, "constructor.builtIns");
        return kotlinBuiltIns0;
    }

    @NotNull
    public static final KotlinType getRepresentativeUpperBound(@NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        ClassDescriptor classDescriptor0;
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "<this>");
        List list0 = typeParameterDescriptor0.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(list0, "upperBounds");
        list0.isEmpty();
        List list1 = typeParameterDescriptor0.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(list1, "upperBounds");
        Iterator iterator0 = list1.iterator();
        while(true) {
            classDescriptor0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            ClassifierDescriptor classifierDescriptor0 = ((KotlinType)object0).getConstructor().getDeclarationDescriptor();
            if(classifierDescriptor0 instanceof ClassDescriptor) {
                classDescriptor0 = (ClassDescriptor)classifierDescriptor0;
            }
            if(classDescriptor0 != null && classDescriptor0.getKind() != ClassKind.INTERFACE && classDescriptor0.getKind() != ClassKind.ANNOTATION_CLASS) {
                classDescriptor0 = object0;
                break;
            }
        }
        if(((KotlinType)classDescriptor0) == null) {
            List list2 = typeParameterDescriptor0.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(list2, "upperBounds");
            Object object1 = CollectionsKt___CollectionsKt.first(list2);
            Intrinsics.checkNotNullExpressionValue(object1, "upperBounds.first()");
            return (KotlinType)object1;
        }
        return (KotlinType)classDescriptor0;
    }

    @JvmOverloads
    public static final boolean hasTypeParameterRecursiveBounds(@NotNull TypeParameterDescriptor typeParameterDescriptor0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        return TypeUtilsKt.hasTypeParameterRecursiveBounds$default(typeParameterDescriptor0, null, null, 6, null);
    }

    @JvmOverloads
    public static final boolean hasTypeParameterRecursiveBounds(@NotNull TypeParameterDescriptor typeParameterDescriptor0, @Nullable TypeConstructor typeConstructor0, @Nullable Set set0) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor0, "typeParameter");
        List list0 = typeParameterDescriptor0.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(list0, "typeParameter.upperBounds");
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                Intrinsics.checkNotNullExpressionValue(((KotlinType)object0), "upperBound");
                if(TypeUtilsKt.a(((KotlinType)object0), typeParameterDescriptor0.getDefaultType().getConstructor(), set0) && (typeConstructor0 == null || Intrinsics.areEqual(((KotlinType)object0).getConstructor(), typeConstructor0))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static boolean hasTypeParameterRecursiveBounds$default(TypeParameterDescriptor typeParameterDescriptor0, TypeConstructor typeConstructor0, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            typeConstructor0 = null;
        }
        if((v & 4) != 0) {
            set0 = null;
        }
        return TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor0, typeConstructor0, set0);
    }

    public static final boolean isBoolean(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return KotlinBuiltIns.isBoolean(kotlinType0);
    }

    public static final boolean isNothing(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return KotlinBuiltIns.isNothing(kotlinType0);
    }

    public static final boolean isStubType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return kotlinType0 instanceof AbstractStubType || kotlinType0 instanceof DefinitelyNotNullType && ((DefinitelyNotNullType)kotlinType0).getOriginal() instanceof AbstractStubType;
    }

    public static final boolean isStubTypeForBuilderInference(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return kotlinType0 instanceof StubTypeForBuilderInference || kotlinType0 instanceof DefinitelyNotNullType && ((DefinitelyNotNullType)kotlinType0).getOriginal() instanceof StubTypeForBuilderInference;
    }

    public static final boolean isSubtypeOf(@NotNull KotlinType kotlinType0, @NotNull KotlinType kotlinType1) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinType1, "superType");
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType0, kotlinType1);
    }

    public static final boolean isTypeAliasParameter(@NotNull ClassifierDescriptor classifierDescriptor0) {
        Intrinsics.checkNotNullParameter(classifierDescriptor0, "<this>");
        return classifierDescriptor0 instanceof TypeParameterDescriptor && ((TypeParameterDescriptor)classifierDescriptor0).getContainingDeclaration() instanceof TypeAliasDescriptor;
    }

    public static final boolean isTypeParameter(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return TypeUtils.isTypeParameter(kotlinType0);
    }

    public static final boolean isUnresolvedType(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        return kotlinType0 instanceof ErrorType && ((ErrorType)kotlinType0).getKind().isUnresolved();
    }

    @NotNull
    public static final KotlinType makeNotNullable(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        KotlinType kotlinType1 = TypeUtils.makeNotNullable(kotlinType0);
        Intrinsics.checkNotNullExpressionValue(kotlinType1, "makeNotNullable(this)");
        return kotlinType1;
    }

    @NotNull
    public static final KotlinType makeNullable(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        KotlinType kotlinType1 = TypeUtils.makeNullable(kotlinType0);
        Intrinsics.checkNotNullExpressionValue(kotlinType1, "makeNullable(this)");
        return kotlinType1;
    }

    @NotNull
    public static final KotlinType replaceAnnotations(@NotNull KotlinType kotlinType0, @NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        Intrinsics.checkNotNullParameter(annotations0, "newAnnotations");
        return kotlinType0.getAnnotations().isEmpty() && annotations0.isEmpty() ? kotlinType0 : kotlinType0.unwrap().replaceAttributes(TypeAttributesKt.replaceAnnotations(kotlinType0.getAttributes(), annotations0));
    }

    @NotNull
    public static final KotlinType replaceArgumentsWithStarProjections(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        UnwrappedType unwrappedType0 = kotlinType0.unwrap();
        if(unwrappedType0 instanceof FlexibleType) {
            SimpleType simpleType0 = ((FlexibleType)unwrappedType0).getLowerBound();
            if(!simpleType0.getConstructor().getParameters().isEmpty() && simpleType0.getConstructor().getDeclarationDescriptor() != null) {
                List list0 = simpleType0.getConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(list0, "constructor.parameters");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    arrayList0.add(new StarProjectionImpl(((TypeParameterDescriptor)object0)));
                }
                simpleType0 = TypeSubstitutionKt.replace$default(simpleType0, arrayList0, null, 2, null);
            }
            SimpleType simpleType1 = ((FlexibleType)unwrappedType0).getUpperBound();
            if(!simpleType1.getConstructor().getParameters().isEmpty() && simpleType1.getConstructor().getDeclarationDescriptor() != null) {
                List list1 = simpleType1.getConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(list1, "constructor.parameters");
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                for(Object object1: list1) {
                    arrayList1.add(new StarProjectionImpl(((TypeParameterDescriptor)object1)));
                }
                simpleType1 = TypeSubstitutionKt.replace$default(simpleType1, arrayList1, null, 2, null);
            }
            return TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(simpleType0, simpleType1), unwrappedType0);
        }
        if(!(unwrappedType0 instanceof SimpleType)) {
            throw new NoWhenBranchMatchedException();
        }
        UnwrappedType unwrappedType1 = (SimpleType)unwrappedType0;
        if(!unwrappedType1.getConstructor().getParameters().isEmpty() && unwrappedType1.getConstructor().getDeclarationDescriptor() != null) {
            List list2 = unwrappedType1.getConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(list2, "constructor.parameters");
            ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
            for(Object object2: list2) {
                arrayList2.add(new StarProjectionImpl(((TypeParameterDescriptor)object2)));
            }
            unwrappedType1 = TypeSubstitutionKt.replace$default(((SimpleType)unwrappedType1), arrayList2, null, 2, null);
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedType1, unwrappedType0);
    }

    public static final boolean requiresTypeAliasExpansion(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return TypeUtilsKt.contains(kotlinType0, c.w);
    }

    public static final boolean shouldBeUpdated(@Nullable KotlinType kotlinType0) {
        return kotlinType0 == null || TypeUtilsKt.contains(kotlinType0, d.w);
    }
}

