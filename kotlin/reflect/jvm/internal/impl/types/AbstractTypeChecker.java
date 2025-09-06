package kotlin.reflect.jvm.internal.impl.types;

import androidx.room.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContextKt\n*L\n1#1,835:1\n1#2:836\n1#2:853\n1#2:905\n1#2:943\n132#3,16:837\n148#3,13:854\n46#3,8:875\n132#3,16:889\n148#3,13:906\n132#3,16:927\n148#3,13:944\n1549#4:867\n1620#4,3:868\n1549#4:871\n1620#4,3:872\n1726#4,3:883\n1726#4,3:886\n766#4:919\n857#4:920\n858#4:926\n1360#4:957\n1446#4,5:958\n1747#4,3:963\n1747#4,3:966\n556#5,5:921\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n*L\n342#1:853\n622#1:905\n692#1:943\n342#1:837,16\n342#1:854,13\n475#1:875,8\n622#1:889,16\n622#1:906,13\n692#1:927,16\n692#1:944,13\n378#1:867\n378#1:868,3\n389#1:871\n389#1:872,3\n561#1:883,3\n572#1:886,3\n667#1:919\n667#1:920\n667#1:926\n701#1:957\n701#1:958,5\n295#1:963,3\n303#1:966,3\n668#1:921,5\n*E\n"})
public final class AbstractTypeChecker {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[TypeVariance.values().length];
            try {
                arr_v[TypeVariance.INV.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypeVariance.OUT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TypeVariance.IN.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[LowerCapturedTypePolicy.values().length];
            try {
                arr_v1[LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @NotNull
    public static final AbstractTypeChecker INSTANCE;
    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;

    static {
        AbstractTypeChecker.INSTANCE = new AbstractTypeChecker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final boolean a(TypeSystemContext typeSystemContext0, SimpleTypeMarker simpleTypeMarker0) {
        if(!typeSystemContext0.isIntegerLiteralType(simpleTypeMarker0)) {
            if(simpleTypeMarker0 instanceof CapturedTypeMarker) {
                TypeArgumentMarker typeArgumentMarker0 = typeSystemContext0.projection(typeSystemContext0.typeConstructor(((CapturedTypeMarker)simpleTypeMarker0)));
                return !typeSystemContext0.isStarProjection(typeArgumentMarker0) && typeSystemContext0.isIntegerLiteralType(typeSystemContext0.upperBoundIfFlexible(typeSystemContext0.getType(typeArgumentMarker0)));
            }
            return false;
        }
        return true;
    }

    public static final boolean b(TypeSystemContext typeSystemContext0, TypeCheckerState typeCheckerState0, SimpleTypeMarker simpleTypeMarker0, SimpleTypeMarker simpleTypeMarker1, boolean z) {
        Iterable iterable0 = typeSystemContext0.possibleIntegerTypes(simpleTypeMarker0);
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(Intrinsics.areEqual(typeSystemContext0.typeConstructor(((KotlinTypeMarker)object0)), typeSystemContext0.typeConstructor(simpleTypeMarker1)) || z && AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, typeCheckerState0, simpleTypeMarker1, ((KotlinTypeMarker)object0), false, 8, null)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public static List c(TypeCheckerState typeCheckerState0, SimpleTypeMarker simpleTypeMarker0, TypeConstructorMarker typeConstructorMarker0) {
        SupertypesPolicy typeCheckerState$SupertypesPolicy0;
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        List list0 = typeSystemContext0.fastCorrespondingSupertypes(simpleTypeMarker0, typeConstructorMarker0);
        if(list0 != null) {
            return list0;
        }
        if(!typeSystemContext0.isClassTypeConstructor(typeConstructorMarker0) && typeSystemContext0.isClassType(simpleTypeMarker0)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if(typeSystemContext0.isCommonFinalClassConstructor(typeConstructorMarker0)) {
            if(typeSystemContext0.areEqualTypeConstructors(typeSystemContext0.typeConstructor(simpleTypeMarker0), typeConstructorMarker0)) {
                SimpleTypeMarker simpleTypeMarker1 = typeSystemContext0.captureFromArguments(simpleTypeMarker0, CaptureStatus.FOR_SUBTYPING);
                if(simpleTypeMarker1 != null) {
                    simpleTypeMarker0 = simpleTypeMarker1;
                }
                return k.listOf(simpleTypeMarker0);
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list1 = new SmartList();
        typeCheckerState0.initialize();
        ArrayDeque arrayDeque0 = typeCheckerState0.getSupertypesDeque();
        Intrinsics.checkNotNull(arrayDeque0);
        Set set0 = typeCheckerState0.getSupertypesSet();
        Intrinsics.checkNotNull(set0);
        arrayDeque0.push(simpleTypeMarker0);
        while(!arrayDeque0.isEmpty()) {
            if(set0.size() <= 1000) {
                SimpleTypeMarker simpleTypeMarker2 = (SimpleTypeMarker)arrayDeque0.pop();
                Intrinsics.checkNotNullExpressionValue(simpleTypeMarker2, "current");
                if(!set0.add(simpleTypeMarker2)) {
                    continue;
                }
                SimpleTypeMarker simpleTypeMarker3 = typeSystemContext0.captureFromArguments(simpleTypeMarker2, CaptureStatus.FOR_SUBTYPING);
                if(simpleTypeMarker3 == null) {
                    simpleTypeMarker3 = simpleTypeMarker2;
                }
                if(typeSystemContext0.areEqualTypeConstructors(typeSystemContext0.typeConstructor(simpleTypeMarker3), typeConstructorMarker0)) {
                    list1.add(simpleTypeMarker3);
                    typeCheckerState$SupertypesPolicy0 = None.INSTANCE;
                }
                else if(typeSystemContext0.argumentsCount(simpleTypeMarker3) == 0) {
                    typeCheckerState$SupertypesPolicy0 = LowerIfFlexible.INSTANCE;
                }
                else {
                    typeCheckerState$SupertypesPolicy0 = typeCheckerState0.getTypeSystemContext().substitutionSupertypePolicy(simpleTypeMarker3);
                }
                if(Intrinsics.areEqual(typeCheckerState$SupertypesPolicy0, None.INSTANCE)) {
                    typeCheckerState$SupertypesPolicy0 = null;
                }
                if(typeCheckerState$SupertypesPolicy0 == null) {
                    continue;
                }
                TypeSystemContext typeSystemContext1 = typeCheckerState0.getTypeSystemContext();
                for(Object object0: typeSystemContext1.supertypes(typeSystemContext1.typeConstructor(simpleTypeMarker2))) {
                    arrayDeque0.add(typeCheckerState$SupertypesPolicy0.transformType(typeCheckerState0, ((KotlinTypeMarker)object0)));
                }
                continue;
            }
            StringBuilder stringBuilder0 = a.l("Too many supertypes for type: ", simpleTypeMarker0, ". Supertypes = ");
            stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(set0, null, null, null, 0, null, null, 0x3F, null));
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
        typeCheckerState0.clear();
        return list1;
    }

    public static List d(TypeCheckerState typeCheckerState0, SimpleTypeMarker simpleTypeMarker0, TypeConstructorMarker typeConstructorMarker0) {
        List list0 = AbstractTypeChecker.c(typeCheckerState0, simpleTypeMarker0, typeConstructorMarker0);
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        if(list0.size() >= 2) {
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = list0.iterator();
        label_5:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                TypeArgumentListMarker typeArgumentListMarker0 = typeSystemContext0.asArgumentList(((SimpleTypeMarker)object0));
                int v = typeSystemContext0.size(typeArgumentListMarker0);
                int v1 = 0;
                while(v1 < v) {
                    if(typeSystemContext0.asFlexibleType(typeSystemContext0.getType(typeSystemContext0.get(typeArgumentListMarker0, v1))) != null) {
                        continue label_5;
                    }
                    ++v1;
                }
                arrayList0.add(object0);
            }
            if(!arrayList0.isEmpty()) {
                return arrayList0;
            }
        }
        return list0;
    }

    public static TypeParameterMarker e(TypeSystemContext typeSystemContext0, KotlinTypeMarker kotlinTypeMarker0, SimpleTypeMarker simpleTypeMarker0) {
        int v = typeSystemContext0.argumentsCount(kotlinTypeMarker0);
        for(int v1 = 0; true; ++v1) {
            TypeArgumentMarker typeArgumentMarker0 = null;
            if(v1 >= v) {
                break;
            }
            TypeArgumentMarker typeArgumentMarker1 = typeSystemContext0.getArgument(kotlinTypeMarker0, v1);
            if(!typeSystemContext0.isStarProjection(typeArgumentMarker1)) {
                typeArgumentMarker0 = typeArgumentMarker1;
            }
            if(typeArgumentMarker0 != null) {
                KotlinTypeMarker kotlinTypeMarker1 = typeSystemContext0.getType(typeArgumentMarker0);
                if(kotlinTypeMarker1 != null) {
                    boolean z = typeSystemContext0.isCapturedType(typeSystemContext0.originalIfDefinitelyNotNullable(typeSystemContext0.lowerBoundIfFlexible(kotlinTypeMarker1))) && typeSystemContext0.isCapturedType(typeSystemContext0.originalIfDefinitelyNotNullable(typeSystemContext0.lowerBoundIfFlexible(simpleTypeMarker0)));
                    if(Intrinsics.areEqual(kotlinTypeMarker1, simpleTypeMarker0) || z && Intrinsics.areEqual(typeSystemContext0.typeConstructor(kotlinTypeMarker1), typeSystemContext0.typeConstructor(simpleTypeMarker0))) {
                        return typeSystemContext0.getParameter(typeSystemContext0.typeConstructor(kotlinTypeMarker0), v1);
                    }
                    TypeParameterMarker typeParameterMarker0 = AbstractTypeChecker.e(typeSystemContext0, kotlinTypeMarker1, simpleTypeMarker0);
                    if(typeParameterMarker0 != null) {
                        return typeParameterMarker0;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public final TypeVariance effectiveVariance(@NotNull TypeVariance typeVariance0, @NotNull TypeVariance typeVariance1) {
        Intrinsics.checkNotNullParameter(typeVariance0, "declared");
        Intrinsics.checkNotNullParameter(typeVariance1, "useSite");
        TypeVariance typeVariance2 = TypeVariance.INV;
        if(typeVariance0 == typeVariance2) {
            return typeVariance1;
        }
        if(typeVariance1 == typeVariance2) {
            return typeVariance0;
        }
        return typeVariance0 == typeVariance1 ? typeVariance0 : null;
    }

    public final boolean equalTypes(@NotNull TypeCheckerState typeCheckerState0, @NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull KotlinTypeMarker kotlinTypeMarker1) {
        Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "a");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker1, "b");
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        if(kotlinTypeMarker0 == kotlinTypeMarker1) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker0 = AbstractTypeChecker.INSTANCE;
        abstractTypeChecker0.getClass();
        if(AbstractTypeChecker.f(typeSystemContext0, kotlinTypeMarker0) && AbstractTypeChecker.f(typeSystemContext0, kotlinTypeMarker1)) {
            KotlinTypeMarker kotlinTypeMarker2 = typeCheckerState0.prepareType(typeCheckerState0.refineType(kotlinTypeMarker0));
            KotlinTypeMarker kotlinTypeMarker3 = typeCheckerState0.prepareType(typeCheckerState0.refineType(kotlinTypeMarker1));
            SimpleTypeMarker simpleTypeMarker0 = typeSystemContext0.lowerBoundIfFlexible(kotlinTypeMarker2);
            if(!typeSystemContext0.areEqualTypeConstructors(typeSystemContext0.typeConstructor(kotlinTypeMarker2), typeSystemContext0.typeConstructor(kotlinTypeMarker3))) {
                return false;
            }
            return typeSystemContext0.argumentsCount(simpleTypeMarker0) == 0 ? typeSystemContext0.hasFlexibleNullability(kotlinTypeMarker2) || typeSystemContext0.hasFlexibleNullability(kotlinTypeMarker3) || typeSystemContext0.isMarkedNullable(simpleTypeMarker0) == typeSystemContext0.isMarkedNullable(typeSystemContext0.lowerBoundIfFlexible(kotlinTypeMarker3)) : AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, kotlinTypeMarker0, kotlinTypeMarker1, false, 8, null) && AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, kotlinTypeMarker1, kotlinTypeMarker0, false, 8, null);
        }
        return AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, kotlinTypeMarker0, kotlinTypeMarker1, false, 8, null) && AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, kotlinTypeMarker1, kotlinTypeMarker0, false, 8, null);
    }

    // 去混淆评级： 中等(50)
    public static boolean f(TypeSystemContext typeSystemContext0, KotlinTypeMarker kotlinTypeMarker0) {
        return typeSystemContext0.isDenotable(typeSystemContext0.typeConstructor(kotlinTypeMarker0)) && !typeSystemContext0.isDynamic(kotlinTypeMarker0) && !typeSystemContext0.isDefinitelyNotNullType(kotlinTypeMarker0) && !typeSystemContext0.isNotNullTypeParameter(kotlinTypeMarker0) && Intrinsics.areEqual(typeSystemContext0.typeConstructor(typeSystemContext0.lowerBoundIfFlexible(kotlinTypeMarker0)), typeSystemContext0.typeConstructor(typeSystemContext0.upperBoundIfFlexible(kotlinTypeMarker0)));
    }

    @NotNull
    public final List findCorrespondingSupertypes(@NotNull TypeCheckerState typeCheckerState0, @NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
        None typeCheckerState$SupertypesPolicy$None0;
        Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
        Intrinsics.checkNotNullParameter(simpleTypeMarker0, "subType");
        Intrinsics.checkNotNullParameter(typeConstructorMarker0, "superConstructor");
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        if(typeSystemContext0.isClassType(simpleTypeMarker0)) {
            AbstractTypeChecker.INSTANCE.getClass();
            return AbstractTypeChecker.d(typeCheckerState0, simpleTypeMarker0, typeConstructorMarker0);
        }
        if(!typeSystemContext0.isClassTypeConstructor(typeConstructorMarker0) && !typeSystemContext0.isIntegerLiteralTypeConstructor(typeConstructorMarker0)) {
            AbstractTypeChecker.INSTANCE.getClass();
            return AbstractTypeChecker.c(typeCheckerState0, simpleTypeMarker0, typeConstructorMarker0);
        }
        SmartList smartList0 = new SmartList();
        typeCheckerState0.initialize();
        ArrayDeque arrayDeque0 = typeCheckerState0.getSupertypesDeque();
        Intrinsics.checkNotNull(arrayDeque0);
        Set set0 = typeCheckerState0.getSupertypesSet();
        Intrinsics.checkNotNull(set0);
        arrayDeque0.push(simpleTypeMarker0);
        while(!arrayDeque0.isEmpty()) {
            if(set0.size() <= 1000) {
                SimpleTypeMarker simpleTypeMarker1 = (SimpleTypeMarker)arrayDeque0.pop();
                Intrinsics.checkNotNullExpressionValue(simpleTypeMarker1, "current");
                if(!set0.add(simpleTypeMarker1)) {
                    continue;
                }
                if(typeSystemContext0.isClassType(simpleTypeMarker1)) {
                    smartList0.add(simpleTypeMarker1);
                    typeCheckerState$SupertypesPolicy$None0 = None.INSTANCE;
                }
                else {
                    typeCheckerState$SupertypesPolicy$None0 = LowerIfFlexible.INSTANCE;
                }
                if(Intrinsics.areEqual(typeCheckerState$SupertypesPolicy$None0, None.INSTANCE)) {
                    typeCheckerState$SupertypesPolicy$None0 = null;
                }
                if(typeCheckerState$SupertypesPolicy$None0 == null) {
                    continue;
                }
                TypeSystemContext typeSystemContext1 = typeCheckerState0.getTypeSystemContext();
                for(Object object0: typeSystemContext1.supertypes(typeSystemContext1.typeConstructor(simpleTypeMarker1))) {
                    arrayDeque0.add(typeCheckerState$SupertypesPolicy$None0.transformType(typeCheckerState0, ((KotlinTypeMarker)object0)));
                }
                continue;
            }
            StringBuilder stringBuilder0 = a.l("Too many supertypes for type: ", simpleTypeMarker0, ". Supertypes = ");
            stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(set0, null, null, null, 0, null, null, 0x3F, null));
            throw new IllegalStateException(stringBuilder0.toString().toString());
        }
        typeCheckerState0.clear();
        List list0 = new ArrayList();
        for(Object object1: smartList0) {
            Intrinsics.checkNotNullExpressionValue(((SimpleTypeMarker)object1), "it");
            AbstractTypeChecker.INSTANCE.getClass();
            o.addAll(list0, AbstractTypeChecker.d(typeCheckerState0, ((SimpleTypeMarker)object1), typeConstructorMarker0));
        }
        return list0;
    }

    public static boolean g(TypeSystemContext typeSystemContext0, KotlinTypeMarker kotlinTypeMarker0, KotlinTypeMarker kotlinTypeMarker1, TypeConstructorMarker typeConstructorMarker0) {
        SimpleTypeMarker simpleTypeMarker0 = typeSystemContext0.asSimpleType(kotlinTypeMarker0);
        if(!(simpleTypeMarker0 instanceof CapturedTypeMarker) || typeSystemContext0.isOldCapturedType(((CapturedTypeMarker)simpleTypeMarker0)) || !typeSystemContext0.isStarProjection(typeSystemContext0.projection(typeSystemContext0.typeConstructor(((CapturedTypeMarker)simpleTypeMarker0)))) || typeSystemContext0.captureStatus(((CapturedTypeMarker)simpleTypeMarker0)) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        TypeConstructorMarker typeConstructorMarker1 = typeSystemContext0.typeConstructor(kotlinTypeMarker1);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker0 = typeConstructorMarker1 instanceof TypeVariableTypeConstructorMarker ? ((TypeVariableTypeConstructorMarker)typeConstructorMarker1) : null;
        if(typeVariableTypeConstructorMarker0 == null) {
            return false;
        }
        TypeParameterMarker typeParameterMarker0 = typeSystemContext0.getTypeParameter(typeVariableTypeConstructorMarker0);
        return typeParameterMarker0 != null && typeSystemContext0.hasRecursiveBounds(typeParameterMarker0, typeConstructorMarker0);
    }

    public final boolean isSubtypeForSameConstructor(@NotNull TypeCheckerState typeCheckerState0, @NotNull TypeArgumentListMarker typeArgumentListMarker0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
        boolean z;
        Intrinsics.checkNotNullParameter(typeCheckerState0, "<this>");
        Intrinsics.checkNotNullParameter(typeArgumentListMarker0, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(simpleTypeMarker0, "superType");
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        TypeConstructorMarker typeConstructorMarker0 = typeSystemContext0.typeConstructor(simpleTypeMarker0);
        int v = typeSystemContext0.size(typeArgumentListMarker0);
        int v1 = typeSystemContext0.parametersCount(typeConstructorMarker0);
        if(v == v1 && v == typeSystemContext0.argumentsCount(simpleTypeMarker0)) {
            for(int v2 = 0; v2 < v1; ++v2) {
                TypeArgumentMarker typeArgumentMarker0 = typeSystemContext0.getArgument(simpleTypeMarker0, v2);
                if(!typeSystemContext0.isStarProjection(typeArgumentMarker0)) {
                    KotlinTypeMarker kotlinTypeMarker0 = typeSystemContext0.getType(typeArgumentMarker0);
                    TypeArgumentMarker typeArgumentMarker1 = typeSystemContext0.get(typeArgumentListMarker0, v2);
                    typeSystemContext0.getVariance(typeArgumentMarker1);
                    TypeVariance typeVariance0 = TypeVariance.INV;
                    KotlinTypeMarker kotlinTypeMarker1 = typeSystemContext0.getType(typeArgumentMarker1);
                    AbstractTypeChecker abstractTypeChecker0 = AbstractTypeChecker.INSTANCE;
                    TypeVariance typeVariance1 = abstractTypeChecker0.effectiveVariance(typeSystemContext0.getVariance(typeSystemContext0.getParameter(typeConstructorMarker0, v2)), typeSystemContext0.getVariance(typeArgumentMarker0));
                    if(typeVariance1 == null) {
                        return typeCheckerState0.isErrorTypeEqualsToAnything();
                    }
                    if(typeVariance1 != typeVariance0 || !AbstractTypeChecker.g(typeSystemContext0, kotlinTypeMarker1, kotlinTypeMarker0, typeConstructorMarker0) && !AbstractTypeChecker.g(typeSystemContext0, kotlinTypeMarker0, kotlinTypeMarker1, typeConstructorMarker0)) {
                        if(typeCheckerState0.g > 100) {
                            throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + kotlinTypeMarker1).toString());
                        }
                        ++typeCheckerState0.g;
                        switch(WhenMappings.$EnumSwitchMapping$0[typeVariance1.ordinal()]) {
                            case 1: {
                                z = abstractTypeChecker0.equalTypes(typeCheckerState0, kotlinTypeMarker1, kotlinTypeMarker0);
                                break;
                            }
                            case 2: {
                                z = AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, kotlinTypeMarker1, kotlinTypeMarker0, false, 8, null);
                                break;
                            }
                            case 3: {
                                z = AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, kotlinTypeMarker0, kotlinTypeMarker1, false, 8, null);
                                break;
                            }
                            default: {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        --typeCheckerState0.g;
                        if(!z) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @JvmOverloads
    public final boolean isSubtypeOf(@NotNull TypeCheckerState typeCheckerState0, @NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull KotlinTypeMarker kotlinTypeMarker1) {
        Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "subType");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker1, "superType");
        return AbstractTypeChecker.isSubtypeOf$default(this, typeCheckerState0, kotlinTypeMarker0, kotlinTypeMarker1, false, 8, null);
    }

    @JvmOverloads
    public final boolean isSubtypeOf(@NotNull TypeCheckerState typeCheckerState0, @NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull KotlinTypeMarker kotlinTypeMarker1, boolean z) {
        Boolean boolean2;
        TypeSystemContext typeSystemContext2;
        SimpleTypeMarker simpleTypeMarker4;
        Boolean boolean0;
        SimpleTypeMarker simpleTypeMarker3;
        SimpleTypeMarker simpleTypeMarker2;
        Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "subType");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker1, "superType");
        if(kotlinTypeMarker0 == kotlinTypeMarker1) {
            return true;
        }
        if(!typeCheckerState0.customIsSubtypeOf(kotlinTypeMarker0, kotlinTypeMarker1)) {
            return false;
        }
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        KotlinTypeMarker kotlinTypeMarker2 = typeCheckerState0.prepareType(typeCheckerState0.refineType(kotlinTypeMarker0));
        KotlinTypeMarker kotlinTypeMarker3 = typeCheckerState0.prepareType(typeCheckerState0.refineType(kotlinTypeMarker1));
        AbstractTypeChecker abstractTypeChecker0 = AbstractTypeChecker.INSTANCE;
        SimpleTypeMarker simpleTypeMarker0 = typeSystemContext0.lowerBoundIfFlexible(kotlinTypeMarker2);
        SimpleTypeMarker simpleTypeMarker1 = typeSystemContext0.upperBoundIfFlexible(kotlinTypeMarker3);
        abstractTypeChecker0.getClass();
        TypeSystemContext typeSystemContext1 = typeCheckerState0.getTypeSystemContext();
        if(typeSystemContext1.isError(simpleTypeMarker0) || typeSystemContext1.isError(simpleTypeMarker1)) {
            if(typeCheckerState0.isErrorTypeEqualsToAnything()) {
                boolean0 = Boolean.TRUE;
                typeCheckerState0.addSubtypeConstraint(kotlinTypeMarker2, kotlinTypeMarker3, z);
                return boolean0.booleanValue();
            }
            if(typeSystemContext1.isMarkedNullable(simpleTypeMarker0) && !typeSystemContext1.isMarkedNullable(simpleTypeMarker1)) {
                boolean0 = Boolean.FALSE;
                typeCheckerState0.addSubtypeConstraint(kotlinTypeMarker2, kotlinTypeMarker3, z);
                return boolean0.booleanValue();
            }
            SimpleTypeMarker simpleTypeMarker5 = typeSystemContext1.withNullability(simpleTypeMarker0, false);
            SimpleTypeMarker simpleTypeMarker6 = typeSystemContext1.withNullability(simpleTypeMarker1, false);
            boolean0 = Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(typeSystemContext1, simpleTypeMarker5, simpleTypeMarker6));
        }
        else if(typeSystemContext1.isStubTypeForBuilderInference(simpleTypeMarker0) && typeSystemContext1.isStubTypeForBuilderInference(simpleTypeMarker1)) {
            DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker0 = typeSystemContext1.asDefinitelyNotNullType(simpleTypeMarker0);
            if(definitelyNotNullTypeMarker0 == null) {
                simpleTypeMarker2 = simpleTypeMarker0;
            }
            else {
                simpleTypeMarker2 = typeSystemContext1.original(definitelyNotNullTypeMarker0);
                if(simpleTypeMarker2 == null) {
                    simpleTypeMarker2 = simpleTypeMarker0;
                }
            }
            DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker1 = typeSystemContext1.asDefinitelyNotNullType(simpleTypeMarker1);
            if(definitelyNotNullTypeMarker1 == null) {
                simpleTypeMarker3 = simpleTypeMarker1;
            }
            else {
                simpleTypeMarker3 = typeSystemContext1.original(definitelyNotNullTypeMarker1);
                if(simpleTypeMarker3 == null) {
                    simpleTypeMarker3 = simpleTypeMarker1;
                }
            }
            boolean0 = Boolean.valueOf(typeSystemContext1.typeConstructor(simpleTypeMarker2) == typeSystemContext1.typeConstructor(simpleTypeMarker3) && (typeSystemContext1.isDefinitelyNotNullType(simpleTypeMarker0) || !typeSystemContext1.isDefinitelyNotNullType(simpleTypeMarker1)) && (!typeSystemContext1.isMarkedNullable(simpleTypeMarker0) || typeSystemContext1.isMarkedNullable(simpleTypeMarker1)) || typeCheckerState0.isStubTypeEqualsToAnything());
        }
        else if(typeSystemContext1.isStubType(simpleTypeMarker0) || typeSystemContext1.isStubType(simpleTypeMarker1)) {
            boolean0 = Boolean.valueOf(typeCheckerState0.isStubTypeEqualsToAnything());
        }
        else {
            DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker2 = typeSystemContext1.asDefinitelyNotNullType(simpleTypeMarker1);
            if(definitelyNotNullTypeMarker2 == null) {
                simpleTypeMarker4 = simpleTypeMarker1;
            }
            else {
                simpleTypeMarker4 = typeSystemContext1.original(definitelyNotNullTypeMarker2);
                if(simpleTypeMarker4 == null) {
                    simpleTypeMarker4 = simpleTypeMarker1;
                }
            }
            CapturedTypeMarker capturedTypeMarker0 = typeSystemContext1.asCapturedType(simpleTypeMarker4);
            KotlinTypeMarker kotlinTypeMarker4 = capturedTypeMarker0 == null ? null : typeSystemContext1.lowerType(capturedTypeMarker0);
            if(capturedTypeMarker0 == null || kotlinTypeMarker4 == null) {
                typeSystemContext2 = typeSystemContext1;
            label_59:
                TypeConstructorMarker typeConstructorMarker0 = typeSystemContext2.typeConstructor(simpleTypeMarker1);
                if(typeSystemContext2.isIntersection(typeConstructorMarker0)) {
                    boolean z1 = true;
                    typeSystemContext2.isMarkedNullable(simpleTypeMarker1);
                    Iterable iterable0 = typeSystemContext2.supertypes(typeConstructorMarker0);
                    if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                        for(Object object0: iterable0) {
                            if(!AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, typeCheckerState0, simpleTypeMarker0, ((KotlinTypeMarker)object0), false, 8, null)) {
                                z1 = false;
                                break;
                            }
                        }
                    }
                    boolean0 = Boolean.valueOf(z1);
                }
                else {
                    TypeConstructorMarker typeConstructorMarker1 = typeSystemContext2.typeConstructor(simpleTypeMarker0);
                    if(simpleTypeMarker0 instanceof CapturedTypeMarker) {
                    label_82:
                        AbstractTypeChecker.INSTANCE.getClass();
                        TypeParameterMarker typeParameterMarker0 = AbstractTypeChecker.e(typeCheckerState0.getTypeSystemContext(), simpleTypeMarker1, simpleTypeMarker0);
                        if(typeParameterMarker0 != null && typeSystemContext2.hasRecursiveBounds(typeParameterMarker0, typeSystemContext2.typeConstructor(simpleTypeMarker1))) {
                            boolean0 = Boolean.TRUE;
                            typeCheckerState0.addSubtypeConstraint(kotlinTypeMarker2, kotlinTypeMarker3, z);
                            return boolean0.booleanValue();
                        }
                    }
                    else if(typeSystemContext2.isIntersection(typeConstructorMarker1)) {
                        Iterable iterable1 = typeSystemContext2.supertypes(typeConstructorMarker1);
                        if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                            Iterator iterator1 = iterable1.iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    break;
                                }
                                Object object1 = iterator1.next();
                                if(((KotlinTypeMarker)object1) instanceof CapturedTypeMarker) {
                                    continue;
                                }
                                goto label_87;
                            }
                        }
                        goto label_82;
                    }
                label_87:
                    boolean0 = null;
                }
            }
            else {
                if(typeSystemContext1.isMarkedNullable(simpleTypeMarker1)) {
                    kotlinTypeMarker4 = typeSystemContext1.withNullability(kotlinTypeMarker4, true);
                }
                else if(typeSystemContext1.isDefinitelyNotNullType(simpleTypeMarker1)) {
                    kotlinTypeMarker4 = typeSystemContext1.makeDefinitelyNotNullOrNotNull(kotlinTypeMarker4);
                }
                switch(WhenMappings.$EnumSwitchMapping$1[typeCheckerState0.getLowerCapturedTypePolicy(simpleTypeMarker0, capturedTypeMarker0).ordinal()]) {
                    case 1: {
                        boolean0 = Boolean.valueOf(AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, simpleTypeMarker0, kotlinTypeMarker4, false, 8, null));
                        break;
                    }
                    case 2: {
                        typeSystemContext2 = typeSystemContext1;
                        if(AbstractTypeChecker.isSubtypeOf$default(abstractTypeChecker0, typeCheckerState0, simpleTypeMarker0, kotlinTypeMarker4, false, 8, null)) {
                            boolean0 = Boolean.TRUE;
                            typeCheckerState0.addSubtypeConstraint(kotlinTypeMarker2, kotlinTypeMarker3, z);
                            return boolean0.booleanValue();
                        }
                        goto label_59;
                    }
                    default: {
                        typeSystemContext2 = typeSystemContext1;
                        goto label_59;
                    }
                }
            }
        }
        if(boolean0 != null) {
            typeCheckerState0.addSubtypeConstraint(kotlinTypeMarker2, kotlinTypeMarker3, z);
            return boolean0.booleanValue();
        }
        Boolean boolean1 = typeCheckerState0.addSubtypeConstraint(kotlinTypeMarker2, kotlinTypeMarker3, z);
        if(boolean1 != null) {
            return boolean1.booleanValue();
        }
        SimpleTypeMarker simpleTypeMarker7 = typeSystemContext0.lowerBoundIfFlexible(kotlinTypeMarker2);
        SimpleTypeMarker simpleTypeMarker8 = typeSystemContext0.upperBoundIfFlexible(kotlinTypeMarker3);
        AbstractTypeChecker.INSTANCE.getClass();
        TypeSystemContext typeSystemContext3 = typeCheckerState0.getTypeSystemContext();
        if(AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if(!typeSystemContext3.isSingleClassifierType(simpleTypeMarker7) && !typeSystemContext3.isIntersection(typeSystemContext3.typeConstructor(simpleTypeMarker7))) {
                typeCheckerState0.isAllowedTypeVariable(simpleTypeMarker7);
            }
            if(!typeSystemContext3.isSingleClassifierType(simpleTypeMarker8)) {
                typeCheckerState0.isAllowedTypeVariable(simpleTypeMarker8);
            }
        }
        if(!AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerState0, simpleTypeMarker7, simpleTypeMarker8)) {
            return false;
        }
        SimpleTypeMarker simpleTypeMarker9 = typeSystemContext3.lowerBoundIfFlexible(simpleTypeMarker7);
        SimpleTypeMarker simpleTypeMarker10 = typeSystemContext3.upperBoundIfFlexible(simpleTypeMarker8);
        TypeSystemContext typeSystemContext4 = typeCheckerState0.getTypeSystemContext();
        if(typeSystemContext4.isIntegerLiteralType(simpleTypeMarker9) || typeSystemContext4.isIntegerLiteralType(simpleTypeMarker10)) {
            if(AbstractTypeChecker.a(typeSystemContext4, simpleTypeMarker9) && AbstractTypeChecker.a(typeSystemContext4, simpleTypeMarker10)) {
                boolean2 = Boolean.TRUE;
                TypeCheckerState.addSubtypeConstraint$default(typeCheckerState0, simpleTypeMarker7, simpleTypeMarker8, false, 4, null);
                return boolean2.booleanValue();
            }
            if(typeSystemContext4.isIntegerLiteralType(simpleTypeMarker9)) {
                if(!AbstractTypeChecker.b(typeSystemContext4, typeCheckerState0, simpleTypeMarker9, simpleTypeMarker10, false)) {
                    goto label_145;
                }
                boolean2 = Boolean.TRUE;
                TypeCheckerState.addSubtypeConstraint$default(typeCheckerState0, simpleTypeMarker7, simpleTypeMarker8, false, 4, null);
                return boolean2.booleanValue();
            }
            else if(typeSystemContext4.isIntegerLiteralType(simpleTypeMarker10)) {
                TypeConstructorMarker typeConstructorMarker2 = typeSystemContext4.typeConstructor(simpleTypeMarker9);
                if(typeConstructorMarker2 instanceof IntersectionTypeConstructorMarker) {
                    Iterable iterable2 = typeSystemContext4.supertypes(typeConstructorMarker2);
                    if(!(iterable2 instanceof Collection) || !((Collection)iterable2).isEmpty()) {
                        for(Object object2: iterable2) {
                            SimpleTypeMarker simpleTypeMarker11 = typeSystemContext4.asSimpleType(((KotlinTypeMarker)object2));
                            if(simpleTypeMarker11 == null || !typeSystemContext4.isIntegerLiteralType(simpleTypeMarker11)) {
                                continue;
                            }
                            boolean2 = Boolean.TRUE;
                            goto label_146;
                        }
                    }
                }
                boolean2 = AbstractTypeChecker.b(typeSystemContext4, typeCheckerState0, simpleTypeMarker10, simpleTypeMarker9, true) ? Boolean.TRUE : null;
            }
            else {
                goto label_145;
            }
        }
        else {
        label_145:
            boolean2 = null;
        }
    label_146:
        if(boolean2 != null) {
            TypeCheckerState.addSubtypeConstraint$default(typeCheckerState0, simpleTypeMarker7, simpleTypeMarker8, false, 4, null);
            return boolean2.booleanValue();
        }
        TypeConstructorMarker typeConstructorMarker3 = typeSystemContext3.typeConstructor(simpleTypeMarker8);
        if((!typeSystemContext3.areEqualTypeConstructors(typeSystemContext3.typeConstructor(simpleTypeMarker7), typeConstructorMarker3) || typeSystemContext3.parametersCount(typeConstructorMarker3) != 0) && !typeSystemContext3.isAnyConstructor(typeSystemContext3.typeConstructor(simpleTypeMarker8))) {
            Iterable iterable3 = AbstractTypeChecker.INSTANCE.findCorrespondingSupertypes(typeCheckerState0, simpleTypeMarker7, typeConstructorMarker3);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable3, 10));
            for(Object object3: iterable3) {
                SimpleTypeMarker simpleTypeMarker12 = (SimpleTypeMarker)object3;
                SimpleTypeMarker simpleTypeMarker13 = typeSystemContext3.asSimpleType(typeCheckerState0.prepareType(simpleTypeMarker12));
                if(simpleTypeMarker13 != null) {
                    simpleTypeMarker12 = simpleTypeMarker13;
                }
                arrayList0.add(simpleTypeMarker12);
            }
            switch(arrayList0.size()) {
                case 0: {
                    AbstractTypeChecker.INSTANCE.getClass();
                    TypeSystemContext typeSystemContext5 = typeCheckerState0.getTypeSystemContext();
                    TypeConstructorMarker typeConstructorMarker4 = typeSystemContext5.typeConstructor(simpleTypeMarker7);
                    if(typeSystemContext5.isClassTypeConstructor(typeConstructorMarker4)) {
                        return typeSystemContext5.isNothingConstructor(typeConstructorMarker4);
                    }
                    if(!typeSystemContext5.isNothingConstructor(typeSystemContext5.typeConstructor(simpleTypeMarker7))) {
                        typeCheckerState0.initialize();
                        ArrayDeque arrayDeque0 = typeCheckerState0.getSupertypesDeque();
                        Intrinsics.checkNotNull(arrayDeque0);
                        Set set0 = typeCheckerState0.getSupertypesSet();
                        Intrinsics.checkNotNull(set0);
                        arrayDeque0.push(simpleTypeMarker7);
                        while(!arrayDeque0.isEmpty()) {
                            if(set0.size() <= 1000) {
                                SimpleTypeMarker simpleTypeMarker15 = (SimpleTypeMarker)arrayDeque0.pop();
                                Intrinsics.checkNotNullExpressionValue(simpleTypeMarker15, "current");
                                if(!set0.add(simpleTypeMarker15)) {
                                    continue;
                                }
                                None typeCheckerState$SupertypesPolicy$None0 = typeSystemContext5.isClassType(simpleTypeMarker15) ? None.INSTANCE : LowerIfFlexible.INSTANCE;
                                if(Intrinsics.areEqual(typeCheckerState$SupertypesPolicy$None0, None.INSTANCE)) {
                                    typeCheckerState$SupertypesPolicy$None0 = null;
                                }
                                if(typeCheckerState$SupertypesPolicy$None0 == null) {
                                    continue;
                                }
                                TypeSystemContext typeSystemContext6 = typeCheckerState0.getTypeSystemContext();
                                for(Object object5: typeSystemContext6.supertypes(typeSystemContext6.typeConstructor(simpleTypeMarker15))) {
                                    SimpleTypeMarker simpleTypeMarker16 = typeCheckerState$SupertypesPolicy$None0.transformType(typeCheckerState0, ((KotlinTypeMarker)object5));
                                    if(typeSystemContext5.isNothingConstructor(typeSystemContext5.typeConstructor(simpleTypeMarker16))) {
                                        typeCheckerState0.clear();
                                        return true;
                                    }
                                    arrayDeque0.add(simpleTypeMarker16);
                                }
                                continue;
                            }
                            StringBuilder stringBuilder0 = a.l("Too many supertypes for type: ", simpleTypeMarker7, ". Supertypes = ");
                            stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(set0, null, null, null, 0, null, null, 0x3F, null));
                            throw new IllegalStateException(stringBuilder0.toString().toString());
                        }
                        typeCheckerState0.clear();
                        return false;
                    }
                    break;
                }
                case 1: {
                    TypeArgumentListMarker typeArgumentListMarker0 = typeSystemContext3.asArgumentList(((SimpleTypeMarker)CollectionsKt___CollectionsKt.first(arrayList0)));
                    return AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(typeCheckerState0, typeArgumentListMarker0, simpleTypeMarker8);
                }
                default: {
                    ArgumentList argumentList0 = new ArgumentList(typeSystemContext3.parametersCount(typeConstructorMarker3));
                    int v = typeSystemContext3.parametersCount(typeConstructorMarker3);
                    boolean z2 = false;
                    for(int v1 = 0; v1 < v; ++v1) {
                        z2 = z2 || typeSystemContext3.getVariance(typeSystemContext3.getParameter(typeConstructorMarker3, v1)) != TypeVariance.OUT;
                        if(!z2) {
                            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
                            for(Object object4: arrayList0) {
                                SimpleTypeMarker simpleTypeMarker14 = (SimpleTypeMarker)object4;
                                TypeArgumentMarker typeArgumentMarker0 = typeSystemContext3.getArgumentOrNull(simpleTypeMarker14, v1);
                                if(typeArgumentMarker0 == null) {
                                    throw new IllegalStateException(("Incorrect type: " + simpleTypeMarker14 + ", subType: " + simpleTypeMarker7 + ", superType: " + simpleTypeMarker8).toString());
                                }
                                if(typeSystemContext3.getVariance(typeArgumentMarker0) != TypeVariance.INV) {
                                    typeArgumentMarker0 = null;
                                }
                                if(typeArgumentMarker0 == null) {
                                    throw new IllegalStateException(("Incorrect type: " + simpleTypeMarker14 + ", subType: " + simpleTypeMarker7 + ", superType: " + simpleTypeMarker8).toString());
                                }
                                KotlinTypeMarker kotlinTypeMarker5 = typeSystemContext3.getType(typeArgumentMarker0);
                                if(kotlinTypeMarker5 == null) {
                                    throw new IllegalStateException(("Incorrect type: " + simpleTypeMarker14 + ", subType: " + simpleTypeMarker7 + ", superType: " + simpleTypeMarker8).toString());
                                }
                                arrayList1.add(kotlinTypeMarker5);
                            }
                            argumentList0.add(typeSystemContext3.asTypeArgument(typeSystemContext3.intersectTypes(arrayList1)));
                        }
                    }
                    return !z2 && AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(typeCheckerState0, argumentList0, simpleTypeMarker8) ? true : typeCheckerState0.runForkingPoint(new b(arrayList0, typeCheckerState0, typeSystemContext3, simpleTypeMarker8));
                }
            }
        }
        return true;
    }

    public static boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker0, TypeCheckerState typeCheckerState0, KotlinTypeMarker kotlinTypeMarker0, KotlinTypeMarker kotlinTypeMarker1, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker0.isSubtypeOf(typeCheckerState0, kotlinTypeMarker0, kotlinTypeMarker1, z);
    }
}

