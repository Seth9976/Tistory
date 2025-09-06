package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;

public final class AbstractStrictEqualityTypeChecker {
    @NotNull
    public static final AbstractStrictEqualityTypeChecker INSTANCE;

    static {
        AbstractStrictEqualityTypeChecker.INSTANCE = new AbstractStrictEqualityTypeChecker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static boolean a(TypeSystemContext typeSystemContext0, SimpleTypeMarker simpleTypeMarker0, SimpleTypeMarker simpleTypeMarker1) {
        if(typeSystemContext0.argumentsCount(simpleTypeMarker0) == typeSystemContext0.argumentsCount(simpleTypeMarker1) && typeSystemContext0.isMarkedNullable(simpleTypeMarker0) == typeSystemContext0.isMarkedNullable(simpleTypeMarker1) && ((typeSystemContext0.asDefinitelyNotNullType(simpleTypeMarker0) == null ? 1 : 0) == (typeSystemContext0.asDefinitelyNotNullType(simpleTypeMarker1) == null ? 1 : 0) && typeSystemContext0.areEqualTypeConstructors(typeSystemContext0.typeConstructor(simpleTypeMarker0), typeSystemContext0.typeConstructor(simpleTypeMarker1)))) {
            if(typeSystemContext0.identicalArguments(simpleTypeMarker0, simpleTypeMarker1)) {
                return true;
            }
            int v = typeSystemContext0.argumentsCount(simpleTypeMarker0);
            for(int v1 = 0; v1 < v; ++v1) {
                TypeArgumentMarker typeArgumentMarker0 = typeSystemContext0.getArgument(simpleTypeMarker0, v1);
                TypeArgumentMarker typeArgumentMarker1 = typeSystemContext0.getArgument(simpleTypeMarker1, v1);
                if(typeSystemContext0.isStarProjection(typeArgumentMarker0) != typeSystemContext0.isStarProjection(typeArgumentMarker1)) {
                    return false;
                }
                if(!typeSystemContext0.isStarProjection(typeArgumentMarker0)) {
                    if(typeSystemContext0.getVariance(typeArgumentMarker0) != typeSystemContext0.getVariance(typeArgumentMarker1)) {
                        return false;
                    }
                    if(!AbstractStrictEqualityTypeChecker.b(typeSystemContext0, typeSystemContext0.getType(typeArgumentMarker0), typeSystemContext0.getType(typeArgumentMarker1))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(TypeSystemContext typeSystemContext0, KotlinTypeMarker kotlinTypeMarker0, KotlinTypeMarker kotlinTypeMarker1) {
        if(kotlinTypeMarker0 == kotlinTypeMarker1) {
            return true;
        }
        SimpleTypeMarker simpleTypeMarker0 = typeSystemContext0.asSimpleType(kotlinTypeMarker0);
        SimpleTypeMarker simpleTypeMarker1 = typeSystemContext0.asSimpleType(kotlinTypeMarker1);
        if(simpleTypeMarker0 != null && simpleTypeMarker1 != null) {
            return AbstractStrictEqualityTypeChecker.a(typeSystemContext0, simpleTypeMarker0, simpleTypeMarker1);
        }
        FlexibleTypeMarker flexibleTypeMarker0 = typeSystemContext0.asFlexibleType(kotlinTypeMarker0);
        FlexibleTypeMarker flexibleTypeMarker1 = typeSystemContext0.asFlexibleType(kotlinTypeMarker1);
        return flexibleTypeMarker0 != null && flexibleTypeMarker1 != null && (AbstractStrictEqualityTypeChecker.a(typeSystemContext0, typeSystemContext0.lowerBound(flexibleTypeMarker0), typeSystemContext0.lowerBound(flexibleTypeMarker1)) && AbstractStrictEqualityTypeChecker.a(typeSystemContext0, typeSystemContext0.upperBound(flexibleTypeMarker0), typeSystemContext0.upperBound(flexibleTypeMarker1)));
    }

    public final boolean strictEqualTypes(@NotNull TypeSystemContext typeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull KotlinTypeMarker kotlinTypeMarker1) {
        Intrinsics.checkNotNullParameter(typeSystemContext0, "context");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "a");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker1, "b");
        return AbstractStrictEqualityTypeChecker.b(typeSystemContext0, kotlinTypeMarker0, kotlinTypeMarker1);
    }
}

