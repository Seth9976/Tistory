package kotlin.reflect.jvm.internal.impl.types;

import androidx.room.a;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n+ 2 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n132#2,16:836\n148#2,13:853\n132#2,16:866\n148#2,13:883\n1#3:852\n1#3:882\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractNullabilityChecker\n*L\n779#1:836,16\n779#1:853,13\n793#1:866,16\n793#1:883,13\n779#1:852\n793#1:882\n*E\n"})
public final class AbstractNullabilityChecker {
    @NotNull
    public static final AbstractNullabilityChecker INSTANCE;

    static {
        AbstractNullabilityChecker.INSTANCE = new AbstractNullabilityChecker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static boolean a(TypeCheckerState typeCheckerState0, SimpleTypeMarker simpleTypeMarker0, TypeConstructorMarker typeConstructorMarker0) {
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        if(typeSystemContext0.isNothing(simpleTypeMarker0)) {
            return true;
        }
        if(typeSystemContext0.isMarkedNullable(simpleTypeMarker0)) {
            return false;
        }
        return !typeCheckerState0.isStubTypeEqualsToAnything() || !typeSystemContext0.isStubType(simpleTypeMarker0) ? typeSystemContext0.areEqualTypeConstructors(typeSystemContext0.typeConstructor(simpleTypeMarker0), typeConstructorMarker0) : true;
    }

    public final boolean hasNotNullSupertype(@NotNull TypeCheckerState typeCheckerState0, @NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull SupertypesPolicy typeCheckerState$SupertypesPolicy0) {
        Intrinsics.checkNotNullParameter(typeCheckerState0, "<this>");
        Intrinsics.checkNotNullParameter(simpleTypeMarker0, "type");
        Intrinsics.checkNotNullParameter(typeCheckerState$SupertypesPolicy0, "supertypesPolicy");
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        if((!typeSystemContext0.isClassType(simpleTypeMarker0) || typeSystemContext0.isMarkedNullable(simpleTypeMarker0)) && !typeSystemContext0.isDefinitelyNotNullType(simpleTypeMarker0)) {
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
                    SupertypesPolicy typeCheckerState$SupertypesPolicy1 = typeSystemContext0.isMarkedNullable(simpleTypeMarker1) ? None.INSTANCE : typeCheckerState$SupertypesPolicy0;
                    if(Intrinsics.areEqual(typeCheckerState$SupertypesPolicy1, None.INSTANCE)) {
                        typeCheckerState$SupertypesPolicy1 = null;
                    }
                    if(typeCheckerState$SupertypesPolicy1 == null) {
                        continue;
                    }
                    TypeSystemContext typeSystemContext1 = typeCheckerState0.getTypeSystemContext();
                    for(Object object0: typeSystemContext1.supertypes(typeSystemContext1.typeConstructor(simpleTypeMarker1))) {
                        SimpleTypeMarker simpleTypeMarker2 = typeCheckerState$SupertypesPolicy1.transformType(typeCheckerState0, ((KotlinTypeMarker)object0));
                        if(typeSystemContext0.isClassType(simpleTypeMarker2) && !typeSystemContext0.isMarkedNullable(simpleTypeMarker2) || typeSystemContext0.isDefinitelyNotNullType(simpleTypeMarker2)) {
                            typeCheckerState0.clear();
                            return true;
                        }
                        arrayDeque0.add(simpleTypeMarker2);
                    }
                    continue;
                }
                StringBuilder stringBuilder0 = a.l("Too many supertypes for type: ", simpleTypeMarker0, ". Supertypes = ");
                stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(set0, null, null, null, 0, null, null, 0x3F, null));
                throw new IllegalStateException(stringBuilder0.toString().toString());
            }
            typeCheckerState0.clear();
            return false;
        }
        return true;
    }

    public final boolean hasPathByNotMarkedNullableNodes(@NotNull TypeCheckerState typeCheckerState0, @NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
        Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
        Intrinsics.checkNotNullParameter(simpleTypeMarker0, "start");
        Intrinsics.checkNotNullParameter(typeConstructorMarker0, "end");
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        AbstractNullabilityChecker.INSTANCE.getClass();
        if(!AbstractNullabilityChecker.a(typeCheckerState0, simpleTypeMarker0, typeConstructorMarker0)) {
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
                    None typeCheckerState$SupertypesPolicy$None0 = typeSystemContext0.isMarkedNullable(simpleTypeMarker1) ? None.INSTANCE : LowerIfFlexible.INSTANCE;
                    if(Intrinsics.areEqual(typeCheckerState$SupertypesPolicy$None0, None.INSTANCE)) {
                        typeCheckerState$SupertypesPolicy$None0 = null;
                    }
                    if(typeCheckerState$SupertypesPolicy$None0 == null) {
                        continue;
                    }
                    TypeSystemContext typeSystemContext1 = typeCheckerState0.getTypeSystemContext();
                    for(Object object0: typeSystemContext1.supertypes(typeSystemContext1.typeConstructor(simpleTypeMarker1))) {
                        SimpleTypeMarker simpleTypeMarker2 = typeCheckerState$SupertypesPolicy$None0.transformType(typeCheckerState0, ((KotlinTypeMarker)object0));
                        AbstractNullabilityChecker.INSTANCE.getClass();
                        if(AbstractNullabilityChecker.a(typeCheckerState0, simpleTypeMarker2, typeConstructorMarker0)) {
                            typeCheckerState0.clear();
                            return true;
                        }
                        arrayDeque0.add(simpleTypeMarker2);
                    }
                    continue;
                }
                StringBuilder stringBuilder0 = a.l("Too many supertypes for type: ", simpleTypeMarker0, ". Supertypes = ");
                stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(set0, null, null, null, 0, null, null, 0x3F, null));
                throw new IllegalStateException(stringBuilder0.toString().toString());
            }
            typeCheckerState0.clear();
            return false;
        }
        return true;
    }

    public final boolean isPossibleSubtype(@NotNull TypeCheckerState typeCheckerState0, @NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull SimpleTypeMarker simpleTypeMarker1) {
        Intrinsics.checkNotNullParameter(typeCheckerState0, "state");
        Intrinsics.checkNotNullParameter(simpleTypeMarker0, "subType");
        Intrinsics.checkNotNullParameter(simpleTypeMarker1, "superType");
        TypeSystemContext typeSystemContext0 = typeCheckerState0.getTypeSystemContext();
        if(AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if(!typeSystemContext0.isSingleClassifierType(simpleTypeMarker0) && !typeSystemContext0.isIntersection(typeSystemContext0.typeConstructor(simpleTypeMarker0))) {
                typeCheckerState0.isAllowedTypeVariable(simpleTypeMarker0);
            }
            if(!typeSystemContext0.isSingleClassifierType(simpleTypeMarker1)) {
                typeCheckerState0.isAllowedTypeVariable(simpleTypeMarker1);
            }
        }
        if(!typeSystemContext0.isMarkedNullable(simpleTypeMarker1) && !typeSystemContext0.isDefinitelyNotNullType(simpleTypeMarker0) && !typeSystemContext0.isNotNullTypeParameter(simpleTypeMarker0) && (!(simpleTypeMarker0 instanceof CapturedTypeMarker) || !typeSystemContext0.isProjectionNotNull(((CapturedTypeMarker)simpleTypeMarker0)))) {
            AbstractNullabilityChecker abstractNullabilityChecker0 = AbstractNullabilityChecker.INSTANCE;
            if(!abstractNullabilityChecker0.hasNotNullSupertype(typeCheckerState0, simpleTypeMarker0, LowerIfFlexible.INSTANCE)) {
                if(typeSystemContext0.isDefinitelyNotNullType(simpleTypeMarker1)) {
                    return false;
                }
                return abstractNullabilityChecker0.hasNotNullSupertype(typeCheckerState0, simpleTypeMarker1, UpperIfFlexible.INSTANCE) || typeSystemContext0.isClassType(simpleTypeMarker0) ? false : abstractNullabilityChecker0.hasPathByNotMarkedNullableNodes(typeCheckerState0, simpleTypeMarker0, typeSystemContext0.typeConstructor(simpleTypeMarker1));
            }
        }
        return true;
    }
}

