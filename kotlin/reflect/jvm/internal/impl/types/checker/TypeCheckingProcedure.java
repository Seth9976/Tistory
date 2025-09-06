package kotlin.reflect.jvm.internal.impl.types.checker;

import a7.c;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeCheckingProcedure {
    public static void a(int v) {
        Object[] arr_object = new Object[(v == 7 || v == 10 ? 2 : 3)];
        switch(v) {
            case 4: {
                arr_object[0] = "typeCheckingProcedureCallbacks";
                break;
            }
            case 6: 
            case 9: {
                arr_object[0] = "argument";
                break;
            }
            case 7: 
            case 10: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            }
            case 11: {
                arr_object[0] = "type1";
                break;
            }
            case 12: {
                arr_object[0] = "type2";
                break;
            }
            case 13: {
                arr_object[0] = "typeParameter";
                break;
            }
            case 14: {
                arr_object[0] = "typeArgument";
                break;
            }
            case 15: {
                arr_object[0] = "typeParameterVariance";
                break;
            }
            case 16: {
                arr_object[0] = "typeArgumentVariance";
                break;
            }
            case 1: 
            case 3: 
            case 18: 
            case 20: {
                arr_object[0] = "supertype";
                break;
            }
            case 21: {
                arr_object[0] = "subtypeArgumentProjection";
                break;
            }
            case 22: {
                arr_object[0] = "supertypeArgumentProjection";
                break;
            }
            case 5: 
            case 8: 
            case 23: {
                arr_object[0] = "parameter";
                break;
            }
            default: {
                arr_object[0] = "subtype";
            }
        }
        switch(v) {
            case 7: {
                arr_object[1] = "getOutType";
                break;
            }
            case 10: {
                arr_object[1] = "getInType";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
            }
        }
        switch(v) {
            case 5: 
            case 6: {
                arr_object[2] = "getOutType";
                break;
            }
            case 8: 
            case 9: {
                arr_object[2] = "getInType";
                break;
            }
            case 7: 
            case 10: {
                break;
            }
            case 11: 
            case 12: {
                arr_object[2] = "equalTypes";
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                arr_object[2] = "getEffectiveProjectionKind";
                break;
            }
            case 17: 
            case 18: {
                arr_object[2] = "isSubtypeOf";
                break;
            }
            case 19: 
            case 20: {
                arr_object[2] = "checkSubtypeForTheSameConstructor";
                break;
            }
            case 21: 
            case 22: 
            case 23: {
                arr_object[2] = "capture";
                break;
            }
            default: {
                arr_object[2] = "findCorrespondingSupertype";
            }
        }
        String s = String.format((v == 7 || v == 10 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 7 || v == 10 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Nullable
    public static KotlinType findCorrespondingSupertype(@NotNull KotlinType kotlinType0, @NotNull KotlinType kotlinType1) {
        if(kotlinType0 != null) {
            if(kotlinType1 != null) {
                return TypeCheckingProcedure.findCorrespondingSupertype(kotlinType0, kotlinType1, new c(25));
            }
            TypeCheckingProcedure.a(1);
            throw null;
        }
        TypeCheckingProcedure.a(0);
        throw null;
    }

    @Nullable
    public static KotlinType findCorrespondingSupertype(@NotNull KotlinType kotlinType0, @NotNull KotlinType kotlinType1, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks0) {
        if(kotlinType0 != null) {
            if(kotlinType1 != null) {
                if(typeCheckingProcedureCallbacks0 != null) {
                    return UtilsKt.findCorrespondingSupertype(kotlinType0, kotlinType1, typeCheckingProcedureCallbacks0);
                }
                TypeCheckingProcedure.a(4);
                throw null;
            }
            TypeCheckingProcedure.a(3);
            throw null;
        }
        TypeCheckingProcedure.a(2);
        throw null;
    }
}

