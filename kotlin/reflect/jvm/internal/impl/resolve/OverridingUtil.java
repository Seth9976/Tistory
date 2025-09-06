package kotlin.reflect.jvm.internal.impl.resolve;

import he.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.n;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ze.e;
import ze.f;

public class OverridingUtil {
    public static class OverrideCompatibilityInfo {
        public static enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT;

        }

        public final Result a;
        public static final OverrideCompatibilityInfo b;

        static {
            OverrideCompatibilityInfo.b = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        }

        public OverrideCompatibilityInfo(@NotNull Result overridingUtil$OverrideCompatibilityInfo$Result0, @NotNull String s) {
            if(overridingUtil$OverrideCompatibilityInfo$Result0 != null) {
                if(s != null) {
                    super();
                    this.a = overridingUtil$OverrideCompatibilityInfo$Result0;
                    return;
                }
                OverrideCompatibilityInfo.a(4);
                throw null;
            }
            OverrideCompatibilityInfo.a(3);
            throw null;
        }

        public static void a(int v) {
            Object[] arr_object = new Object[(v == 1 || v == 2 || v == 3 || v == 4 ? 3 : 2)];
            switch(v) {
                case 3: {
                    arr_object[0] = "success";
                    break;
                }
                case 1: 
                case 2: 
                case 4: {
                    arr_object[0] = "debugMessage";
                    break;
                }
                default: {
                    arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
            }
            switch(v) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                }
                case 5: {
                    arr_object[1] = "getResult";
                    break;
                }
                case 6: {
                    arr_object[1] = "getDebugMessage";
                    break;
                }
                default: {
                    arr_object[1] = "success";
                }
            }
            switch(v) {
                case 1: {
                    arr_object[2] = "incompatible";
                    break;
                }
                case 2: {
                    arr_object[2] = "conflict";
                    break;
                }
                case 3: 
                case 4: {
                    arr_object[2] = "<init>";
                }
            }
            String s = String.format((v == 1 || v == 2 || v == 3 || v == 4 ? "Argument for @NotNull parameter \'%s\' of %s.%s must not be null" : "@NotNull method %s.%s must not return null"), arr_object);
            IllegalArgumentException illegalArgumentException0 = v == 1 || v == 2 || v == 3 || v == 4 ? new IllegalArgumentException(s) : new IllegalStateException(s);
            throw illegalArgumentException0;
        }

        @NotNull
        public static OverrideCompatibilityInfo conflict(@NotNull String s) {
            if(s != null) {
                return new OverrideCompatibilityInfo(Result.CONFLICT, s);
            }
            OverrideCompatibilityInfo.a(2);
            throw null;
        }

        @NotNull
        public Result getResult() {
            Result overridingUtil$OverrideCompatibilityInfo$Result0 = this.a;
            if(overridingUtil$OverrideCompatibilityInfo$Result0 != null) {
                return overridingUtil$OverrideCompatibilityInfo$Result0;
            }
            OverrideCompatibilityInfo.a(5);
            throw null;
        }

        @NotNull
        public static OverrideCompatibilityInfo incompatible(@NotNull String s) {
            if(s != null) {
                return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, s);
            }
            OverrideCompatibilityInfo.a(1);
            throw null;
        }

        @NotNull
        public static OverrideCompatibilityInfo success() {
            OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo0 = OverrideCompatibilityInfo.b;
            if(overridingUtil$OverrideCompatibilityInfo0 != null) {
                return overridingUtil$OverrideCompatibilityInfo0;
            }
            OverrideCompatibilityInfo.a(0);
            throw null;
        }
    }

    public static final OverridingUtil DEFAULT;
    public final KotlinTypeRefiner a;
    public final Default b;
    public final TypeConstructorEquality c;
    public static final List d;
    public static final e e;

    static {
        OverridingUtil.d = CollectionsKt___CollectionsKt.toList(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
        e e0 = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        OverridingUtil.e = e0;
        OverridingUtil.DEFAULT = new OverridingUtil(e0, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default.INSTANCE, Default.INSTANCE);
    }

    public OverridingUtil(TypeConstructorEquality kotlinTypeChecker$TypeConstructorEquality0, KotlinTypeRefiner kotlinTypeRefiner0, Default kotlinTypePreparator$Default0) {
        if(kotlinTypeChecker$TypeConstructorEquality0 != null) {
            if(kotlinTypeRefiner0 != null) {
                if(kotlinTypePreparator$Default0 != null) {
                    super();
                    this.c = kotlinTypeChecker$TypeConstructorEquality0;
                    this.a = kotlinTypeRefiner0;
                    this.b = kotlinTypePreparator$Default0;
                    return;
                }
                OverridingUtil.a(7);
                throw null;
            }
            OverridingUtil.a(6);
            throw null;
        }
        OverridingUtil.a(5);
        throw null;
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 0x5F: 
            case 98: 
            case 103: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = v == 80 || v == 81 || v == 82 || v == 83 || v == 84 || (v == 90 || v == 91 || v == 92) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 0x5F: 
            case 98: 
            case 103: {
                v1 = 2;
                break;
            }
            default: {
                v1 = v == 80 || v == 81 || v == 82 || v == 83 || v == 84 || (v == 90 || v == 91 || v == 92) ? 2 : 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: {
                arr_object[0] = "customSubtype";
                break;
            }
            case 4: {
                arr_object[0] = "equalityAxioms";
                break;
            }
            case 5: {
                arr_object[0] = "axioms";
                break;
            }
            case 1: 
            case 7: {
                arr_object[0] = "kotlinTypePreparator";
                break;
            }
            case 8: 
            case 9: {
                arr_object[0] = "candidateSet";
                break;
            }
            case 10: {
                arr_object[0] = "transformFirst";
                break;
            }
            case 13: {
                arr_object[0] = "f";
                break;
            }
            case 14: {
                arr_object[0] = "g";
                break;
            }
            case 15: 
            case 17: {
                arr_object[0] = "descriptor";
                break;
            }
            case 18: {
                arr_object[0] = "result";
                break;
            }
            case 19: 
            case 22: 
            case 30: 
            case 40: {
                arr_object[0] = "superDescriptor";
                break;
            }
            case 20: 
            case 23: 
            case 0x1F: 
            case 41: {
                arr_object[0] = "subDescriptor";
                break;
            }
            case 42: {
                arr_object[0] = "firstParameters";
                break;
            }
            case 43: {
                arr_object[0] = "secondParameters";
                break;
            }
            case 46: {
                arr_object[0] = "typeInSuper";
                break;
            }
            case 0x2F: {
                arr_object[0] = "typeInSub";
                break;
            }
            case 49: {
                arr_object[0] = "superTypeParameter";
                break;
            }
            case 50: {
                arr_object[0] = "subTypeParameter";
                break;
            }
            case 52: {
                arr_object[0] = "name";
                break;
            }
            case 53: {
                arr_object[0] = "membersFromSupertypes";
                break;
            }
            case 54: {
                arr_object[0] = "membersFromCurrent";
                break;
            }
            case 57: {
                arr_object[0] = "overriding";
                break;
            }
            case 58: {
                arr_object[0] = "fromSuper";
                break;
            }
            case 59: {
                arr_object[0] = "fromCurrent";
                break;
            }
            case 60: {
                arr_object[0] = "descriptorsFromSuper";
                break;
            }
            case 0x3F: 
            case 65: {
                arr_object[0] = "notOverridden";
                break;
            }
            case 71: {
                arr_object[0] = "candidate";
                break;
            }
            case 67: 
            case 69: 
            case 73: {
                arr_object[0] = "a";
                break;
            }
            case 74: {
                arr_object[0] = "aReturnType";
                break;
            }
            case 68: 
            case 70: 
            case 75: {
                arr_object[0] = "b";
                break;
            }
            case 76: {
                arr_object[0] = "bReturnType";
                break;
            }
            case 0x30: 
            case 51: 
            case 77: {
                arr_object[0] = "typeCheckerState";
                break;
            }
            case 78: 
            case 85: {
                arr_object[0] = "overridables";
                break;
            }
            case 94: {
                arr_object[0] = "classModality";
                break;
            }
            case 55: 
            case 61: 
            case 0x40: 
            case 86: 
            case 89: 
            case 0x60: {
                arr_object[0] = "current";
                break;
            }
            case 97: {
                arr_object[0] = "toFilter";
                break;
            }
            case 0x4F: 
            case 101: {
                arr_object[0] = "descriptorByHandle";
                break;
            }
            case 102: {
                arr_object[0] = "onConflict";
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 84: 
            case 90: 
            case 91: 
            case 92: 
            case 0x5F: 
            case 98: 
            case 103: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            }
            case 99: 
            case 104: {
                arr_object[0] = "overrider";
                break;
            }
            case 100: 
            case 105: {
                arr_object[0] = "extractFrom";
                break;
            }
            case 56: 
            case 62: 
            case 66: 
            case 87: 
            case 106: {
                arr_object[0] = "strategy";
                break;
            }
            case 107: 
            case 108: {
                arr_object[0] = "memberDescriptor";
                break;
            }
            case 72: 
            case 88: 
            case 93: 
            case 109: {
                arr_object[0] = "descriptors";
                break;
            }
            default: {
                arr_object[0] = "kotlinTypeRefiner";
            }
        }
        switch(v) {
            case 11: 
            case 12: {
                arr_object[1] = "filterOverrides";
                break;
            }
            case 16: {
                arr_object[1] = "getOverriddenDeclarations";
                break;
            }
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                arr_object[1] = "isOverridableBy";
                break;
            }
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: {
                arr_object[1] = "isOverridableByWithoutExternalConditions";
                break;
            }
            case 44: 
            case 45: {
                arr_object[1] = "createTypeCheckerState";
                break;
            }
            case 0x5F: {
                arr_object[1] = "getMinimalModality";
                break;
            }
            case 98: {
                arr_object[1] = "filterVisibleFakeOverrides";
                break;
            }
            case 103: {
                arr_object[1] = "extractMembersOverridableInBothWays";
                break;
            }
            default: {
                if(v == 80 || v == 81 || v == 82 || v == 83 || v == 84) {
                    arr_object[1] = "selectMostSpecificMember";
                }
                else if(v != 90 && v != 91 && v != 92) {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                }
                else {
                    arr_object[1] = "determineModalityForFakeOverride";
                }
            }
        }
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            }
            case 3: 
            case 4: {
                arr_object[2] = "create";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                arr_object[2] = "<init>";
                break;
            }
            case 8: {
                arr_object[2] = "filterOutOverridden";
                break;
            }
            case 9: 
            case 10: {
                arr_object[2] = "filterOverrides";
                break;
            }
            case 13: 
            case 14: {
                arr_object[2] = "overrides";
                break;
            }
            case 15: {
                arr_object[2] = "getOverriddenDeclarations";
                break;
            }
            case 17: 
            case 18: {
                arr_object[2] = "collectOverriddenDeclarations";
                break;
            }
            case 19: 
            case 20: 
            case 22: 
            case 23: {
                arr_object[2] = "isOverridableBy";
                break;
            }
            case 30: 
            case 0x1F: {
                arr_object[2] = "isOverridableByWithoutExternalConditions";
                break;
            }
            case 40: 
            case 41: {
                arr_object[2] = "getBasicOverridabilityProblem";
                break;
            }
            case 42: 
            case 43: {
                arr_object[2] = "createTypeCheckerState";
                break;
            }
            case 46: 
            case 0x2F: 
            case 0x30: {
                arr_object[2] = "areTypesEquivalent";
                break;
            }
            case 49: 
            case 50: 
            case 51: {
                arr_object[2] = "areTypeParametersEquivalent";
                break;
            }
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: {
                arr_object[2] = "generateOverridesInFunctionGroup";
                break;
            }
            case 57: 
            case 58: {
                arr_object[2] = "isVisibleForOverride";
                break;
            }
            case 59: 
            case 60: 
            case 61: 
            case 62: {
                arr_object[2] = "extractAndBindOverridesForMember";
                break;
            }
            case 0x3F: {
                arr_object[2] = "allHasSameContainingDeclaration";
                break;
            }
            case 0x40: 
            case 65: 
            case 66: {
                arr_object[2] = "createAndBindFakeOverrides";
                break;
            }
            case 67: 
            case 68: {
                arr_object[2] = "isMoreSpecific";
                break;
            }
            case 69: 
            case 70: {
                arr_object[2] = "isVisibilityMoreSpecific";
                break;
            }
            case 71: 
            case 72: {
                arr_object[2] = "isMoreSpecificThenAllOf";
                break;
            }
            case 73: 
            case 74: 
            case 75: 
            case 76: 
            case 77: {
                arr_object[2] = "isReturnTypeMoreSpecific";
                break;
            }
            case 78: 
            case 0x4F: {
                arr_object[2] = "selectMostSpecificMember";
                break;
            }
            case 85: 
            case 86: 
            case 87: {
                arr_object[2] = "createAndBindFakeOverride";
                break;
            }
            case 88: 
            case 89: {
                arr_object[2] = "determineModalityForFakeOverride";
                break;
            }
            case 93: 
            case 94: {
                arr_object[2] = "getMinimalModality";
                break;
            }
            case 0x60: 
            case 97: {
                arr_object[2] = "filterVisibleFakeOverrides";
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 84: 
            case 90: 
            case 91: 
            case 92: 
            case 0x5F: 
            case 98: 
            case 103: {
                break;
            }
            case 99: 
            case 100: 
            case 101: 
            case 102: 
            case 104: 
            case 105: 
            case 106: {
                arr_object[2] = "extractMembersOverridableInBothWays";
                break;
            }
            case 107: {
                arr_object[2] = "resolveUnknownVisibilityForMember";
                break;
            }
            case 108: {
                arr_object[2] = "computeVisibilityToInherit";
                break;
            }
            case 109: {
                arr_object[2] = "findMaxVisibility";
                break;
            }
            default: {
                arr_object[2] = "createWithTypeRefiner";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 0x5F: 
            case 98: 
            case 103: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = v == 80 || v == 81 || v == 82 || v == 83 || v == 84 || (v == 90 || v == 91 || v == 92) ? new IllegalStateException(s1) : new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    public static boolean b(KotlinType kotlinType0, KotlinType kotlinType1, TypeCheckerState typeCheckerState0) {
        if(kotlinType0 != null) {
            if(kotlinType1 != null) {
                if(typeCheckerState0 != null) {
                    if(KotlinTypeKt.isError(kotlinType0) && KotlinTypeKt.isError(kotlinType1)) {
                        return true;
                    }
                    UnwrappedType unwrappedType0 = kotlinType0.unwrap();
                    UnwrappedType unwrappedType1 = kotlinType1.unwrap();
                    return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState0, unwrappedType0, unwrappedType1);
                }
                OverridingUtil.a(0x30);
                throw null;
            }
            OverridingUtil.a(0x2F);
            throw null;
        }
        OverridingUtil.a(46);
        throw null;
    }

    public static void c(CallableMemberDescriptor callableMemberDescriptor0, LinkedHashSet linkedHashSet0) {
        if(callableMemberDescriptor0 != null) {
            if(callableMemberDescriptor0.getKind().isReal()) {
                linkedHashSet0.add(callableMemberDescriptor0);
                return;
            }
            if(callableMemberDescriptor0.getOverriddenDescriptors().isEmpty()) {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor0);
            }
            for(Object object0: callableMemberDescriptor0.getOverriddenDescriptors()) {
                OverridingUtil.c(((CallableMemberDescriptor)object0), linkedHashSet0);
            }
            return;
        }
        OverridingUtil.a(17);
        throw null;
    }

    @NotNull
    public static OverridingUtil create(@NotNull KotlinTypeRefiner kotlinTypeRefiner0, @NotNull TypeConstructorEquality kotlinTypeChecker$TypeConstructorEquality0) {
        if(kotlinTypeRefiner0 != null) {
            if(kotlinTypeChecker$TypeConstructorEquality0 != null) {
                return new OverridingUtil(kotlinTypeChecker$TypeConstructorEquality0, kotlinTypeRefiner0, Default.INSTANCE);
            }
            OverridingUtil.a(4);
            throw null;
        }
        OverridingUtil.a(3);
        throw null;
    }

    @NotNull
    public static OverridingUtil createWithTypeRefiner(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        if(kotlinTypeRefiner0 != null) {
            return new OverridingUtil(OverridingUtil.e, kotlinTypeRefiner0, Default.INSTANCE);
        }
        OverridingUtil.a(0);
        throw null;
    }

    public static ArrayList d(CallableDescriptor callableDescriptor0) {
        ReceiverParameterDescriptor receiverParameterDescriptor0 = callableDescriptor0.getExtensionReceiverParameter();
        ArrayList arrayList0 = new ArrayList();
        if(receiverParameterDescriptor0 != null) {
            arrayList0.add(receiverParameterDescriptor0.getType());
        }
        for(Object object0: callableDescriptor0.getValueParameters()) {
            arrayList0.add(((ValueParameterDescriptor)object0).getType());
        }
        return arrayList0;
    }

    public static void e(Collection collection0, ClassDescriptor classDescriptor0, OverridingStrategy overridingStrategy0) {
        Modality modality1;
        Modality modality0;
        if(collection0 != null) {
            if(classDescriptor0 != null) {
                if(overridingStrategy0 != null) {
                    if(classDescriptor0 != null) {
                        if(collection0 != null) {
                            List list0 = CollectionsKt___CollectionsKt.filter(collection0, new b(classDescriptor0, 3));
                            if(list0 != null) {
                                boolean z = list0.isEmpty();
                                if(!z) {
                                    collection0 = list0;
                                }
                                boolean z1 = false;
                                boolean z2 = false;
                                boolean z3 = false;
                                for(Object object0: collection0) {
                                    CallableMemberDescriptor callableMemberDescriptor0 = (CallableMemberDescriptor)object0;
                                    switch(a.c[callableMemberDescriptor0.getModality().ordinal()]) {
                                        case 1: {
                                            modality0 = Modality.FINAL;
                                            if(modality0 != null) {
                                                modality1 = modality0;
                                                goto label_65;
                                            }
                                            OverridingUtil.a(90);
                                            throw null;
                                        }
                                        case 2: {
                                            throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor0);
                                        }
                                        case 3: {
                                            z2 = true;
                                            break;
                                        }
                                        case 4: {
                                            z3 = true;
                                        }
                                    }
                                }
                                if(classDescriptor0.isExpect() && classDescriptor0.getModality() != Modality.ABSTRACT && classDescriptor0.getModality() != Modality.SEALED) {
                                    z1 = true;
                                }
                                if(z2 && !z3) {
                                    modality0 = Modality.OPEN;
                                    if(modality0 != null) {
                                        modality1 = modality0;
                                        goto label_65;
                                    }
                                    OverridingUtil.a(91);
                                    throw null;
                                }
                                if(!z2 && z3) {
                                    modality0 = z1 ? classDescriptor0.getModality() : Modality.ABSTRACT;
                                    if(modality0 == null) {
                                        OverridingUtil.a(92);
                                        throw null;
                                    }
                                    modality1 = modality0;
                                    goto label_65;
                                }
                                HashSet hashSet0 = new HashSet();
                                for(Object object1: collection0) {
                                    hashSet0.addAll(OverridingUtil.getOverriddenDeclarations(((CallableMemberDescriptor)object1)));
                                }
                                Set set0 = OverridingUtil.filterOutOverridden(hashSet0);
                                Modality modality2 = classDescriptor0.getModality();
                                if(set0 != null) {
                                    if(modality2 != null) {
                                        Modality modality3 = Modality.ABSTRACT;
                                        for(Object object2: set0) {
                                            CallableMemberDescriptor callableMemberDescriptor1 = (CallableMemberDescriptor)object2;
                                            Modality modality4 = !z1 || callableMemberDescriptor1.getModality() != Modality.ABSTRACT ? callableMemberDescriptor1.getModality() : modality2;
                                            if(modality4.compareTo(modality3) < 0) {
                                                modality3 = modality4;
                                            }
                                        }
                                        if(modality3 != null) {
                                            modality1 = modality3;
                                        label_65:
                                            CallableMemberDescriptor callableMemberDescriptor2 = ((CallableMemberDescriptor)OverridingUtil.selectMostSpecificMember(collection0, new n(4))).copy(classDescriptor0, modality1, (z ? DescriptorVisibilities.INVISIBLE_FAKE : DescriptorVisibilities.INHERITED), Kind.FAKE_OVERRIDE, false);
                                            overridingStrategy0.setOverriddenDescriptors(callableMemberDescriptor2, collection0);
                                            overridingStrategy0.addFakeOverride(callableMemberDescriptor2);
                                            return;
                                        }
                                        OverridingUtil.a(0x5F);
                                        throw null;
                                    }
                                    OverridingUtil.a(94);
                                    throw null;
                                }
                                OverridingUtil.a(93);
                                throw null;
                            }
                            OverridingUtil.a(98);
                            throw null;
                        }
                        OverridingUtil.a(97);
                        throw null;
                    }
                    OverridingUtil.a(0x60);
                    throw null;
                }
                OverridingUtil.a(87);
                throw null;
            }
            OverridingUtil.a(86);
            throw null;
        }
        OverridingUtil.a(85);
        throw null;
    }

    @NotNull
    public static Collection extractMembersOverridableInBothWays(@NotNull Object object0, @NotNull Collection collection0, @NotNull Function1 function10, @NotNull Function1 function11) {
        if(object0 != null) {
            if(collection0 != null) {
                if(function10 != null) {
                    if(function11 != null) {
                        Collection collection1 = new ArrayList();
                        ((ArrayList)collection1).add(object0);
                        CallableDescriptor callableDescriptor0 = (CallableDescriptor)function10.invoke(object0);
                        Iterator iterator0 = collection0.iterator();
                        while(iterator0.hasNext()) {
                            Object object1 = iterator0.next();
                            CallableDescriptor callableDescriptor1 = (CallableDescriptor)function10.invoke(object1);
                            if(object0 == object1) {
                                iterator0.remove();
                            }
                            else {
                                Result overridingUtil$OverrideCompatibilityInfo$Result0 = OverridingUtil.getBothWaysOverridability(callableDescriptor0, callableDescriptor1);
                                if(overridingUtil$OverrideCompatibilityInfo$Result0 == Result.OVERRIDABLE) {
                                    ((ArrayList)collection1).add(object1);
                                    iterator0.remove();
                                }
                                else if(overridingUtil$OverrideCompatibilityInfo$Result0 == Result.CONFLICT) {
                                    function11.invoke(object1);
                                    iterator0.remove();
                                }
                            }
                        }
                        return collection1;
                    }
                    OverridingUtil.a(102);
                    throw null;
                }
                OverridingUtil.a(101);
                throw null;
            }
            OverridingUtil.a(100);
            throw null;
        }
        OverridingUtil.a(99);
        throw null;
    }

    public final TypeCheckerState f(List list0, List list1) {
        if(list0 != null) {
            if(list1 != null) {
                if(list0.isEmpty()) {
                    TypeCheckerState typeCheckerState0 = new OverridingUtilTypeSystemContext(null, this.c, this.a, this.b, null).newTypeCheckerState(true, true);
                    if(typeCheckerState0 != null) {
                        return typeCheckerState0;
                    }
                    OverridingUtil.a(44);
                    throw null;
                }
                HashMap hashMap0 = new HashMap();
                for(int v = 0; v < list0.size(); ++v) {
                    hashMap0.put(((TypeParameterDescriptor)list0.get(v)).getTypeConstructor(), ((TypeParameterDescriptor)list1.get(v)).getTypeConstructor());
                }
                TypeCheckerState typeCheckerState1 = new OverridingUtilTypeSystemContext(hashMap0, this.c, this.a, this.b, null).newTypeCheckerState(true, true);
                if(typeCheckerState1 != null) {
                    return typeCheckerState1;
                }
                OverridingUtil.a(45);
                throw null;
            }
            OverridingUtil.a(43);
            throw null;
        }
        OverridingUtil.a(42);
        throw null;
    }

    @NotNull
    public static Set filterOutOverridden(@NotNull Set set0) {
        if(set0 != null) {
            if(!set0.isEmpty()) {
                Object object0 = set0.iterator().next();
                return DescriptorUtilsKt.isTypeRefinementEnabled(DescriptorUtilsKt.getModule(((DeclarationDescriptor)object0))) ? OverridingUtil.filterOverrides(set0, true, null, new f()) : OverridingUtil.filterOverrides(set0, false, null, new f());  // 初始化器: Ljava/lang/Object;-><init>()V / 初始化器: Ljava/lang/Object;-><init>()V
            }
            return OverridingUtil.filterOverrides(set0, false, null, new f());  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        OverridingUtil.a(8);
        throw null;
    }

    @NotNull
    public static Set filterOverrides(@NotNull Set set0, boolean z, @Nullable Function0 function00, @NotNull Function2 function20) {
        if(set0 != null) {
            if(function20 != null) {
                if(set0.size() <= 1) {
                    return set0;
                }
                Set set1 = new LinkedHashSet();
                Iterator iterator0 = set0.iterator();
            label_6:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(function00 != null) {
                        function00.invoke();
                    }
                    Iterator iterator1 = set1.iterator();
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        Pair pair0 = (Pair)function20.invoke(object0, object1);
                        CallableDescriptor callableDescriptor0 = (CallableDescriptor)pair0.component1();
                        CallableDescriptor callableDescriptor1 = (CallableDescriptor)pair0.component2();
                        if(OverridingUtil.overrides(callableDescriptor0, callableDescriptor1, z, true)) {
                            iterator1.remove();
                        }
                        else {
                            if(OverridingUtil.overrides(callableDescriptor1, callableDescriptor0, z, true)) {
                                continue label_6;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    set1.add(object0);
                }
                return set1;
            }
            OverridingUtil.a(10);
            throw null;
        }
        OverridingUtil.a(9);
        throw null;
    }

    @Nullable
    public static DescriptorVisibility findMaxVisibility(@NotNull Collection collection0) {
        DescriptorVisibility descriptorVisibility1;
        DescriptorVisibility descriptorVisibility0;
        if(collection0 != null) {
            if(collection0.isEmpty()) {
                return DescriptorVisibilities.DEFAULT_VISIBILITY;
            }
            Iterator iterator0 = collection0.iterator();
            do {
                descriptorVisibility0 = null;
            label_5:
                if(!iterator0.hasNext()) {
                    goto label_14;
                }
                Object object0 = iterator0.next();
                descriptorVisibility1 = ((CallableMemberDescriptor)object0).getVisibility();
                if(descriptorVisibility0 == null) {
                    descriptorVisibility0 = descriptorVisibility1;
                    goto label_5;
                }
                Integer integer0 = DescriptorVisibilities.compare(descriptorVisibility1, descriptorVisibility0);
            }
            while(integer0 == null);
            if(((int)integer0) <= 0) {
                goto label_5;
            }
            descriptorVisibility0 = descriptorVisibility1;
            goto label_5;
        label_14:
            if(descriptorVisibility0 == null) {
                return null;
            }
            for(Object object1: collection0) {
                Integer integer1 = DescriptorVisibilities.compare(descriptorVisibility0, ((CallableMemberDescriptor)object1).getVisibility());
                if(integer1 == null || ((int)integer1) < 0) {
                    return null;
                }
                if(false) {
                    break;
                }
            }
            return descriptorVisibility0;
        }
        OverridingUtil.a(109);
        throw null;
    }

    public static boolean g(CallableDescriptor callableDescriptor0, KotlinType kotlinType0, CallableDescriptor callableDescriptor1, KotlinType kotlinType1, TypeCheckerState typeCheckerState0) {
        if(callableDescriptor0 != null) {
            if(kotlinType0 != null) {
                if(callableDescriptor1 != null) {
                    if(kotlinType1 != null) {
                        if(typeCheckerState0 != null) {
                            UnwrappedType unwrappedType0 = kotlinType0.unwrap();
                            UnwrappedType unwrappedType1 = kotlinType1.unwrap();
                            return AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerState0, unwrappedType0, unwrappedType1);
                        }
                        OverridingUtil.a(77);
                        throw null;
                    }
                    OverridingUtil.a(76);
                    throw null;
                }
                OverridingUtil.a(75);
                throw null;
            }
            OverridingUtil.a(74);
            throw null;
        }
        OverridingUtil.a(73);
        throw null;
    }

    public void generateOverridesInFunctionGroup(@NotNull Name name0, @NotNull Collection collection0, @NotNull Collection collection1, @NotNull ClassDescriptor classDescriptor0, @NotNull OverridingStrategy overridingStrategy0) {
        boolean z;
        if(name0 != null) {
            if(collection0 != null) {
                if(collection1 != null) {
                    if(classDescriptor0 != null) {
                        if(overridingStrategy0 != null) {
                            LinkedHashSet linkedHashSet0 = new LinkedHashSet(collection0);
                            Iterator iterator0 = collection1.iterator();
                            while(true) {
                                z = true;
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object0 = iterator0.next();
                                CallableMemberDescriptor callableMemberDescriptor0 = (CallableMemberDescriptor)object0;
                                if(callableMemberDescriptor0 != null) {
                                    ArrayList arrayList0 = new ArrayList(collection0.size());
                                    SmartSet smartSet0 = SmartSet.create();
                                    for(Object object1: collection0) {
                                        CallableMemberDescriptor callableMemberDescriptor1 = (CallableMemberDescriptor)object1;
                                        Result overridingUtil$OverrideCompatibilityInfo$Result0 = this.isOverridableBy(callableMemberDescriptor1, callableMemberDescriptor0, classDescriptor0).getResult();
                                        boolean z1 = OverridingUtil.isVisibleForOverride(callableMemberDescriptor0, callableMemberDescriptor1, false);
                                        switch(a.b[overridingUtil$OverrideCompatibilityInfo$Result0.ordinal()]) {
                                            case 1: {
                                                if(z1) {
                                                    smartSet0.add(callableMemberDescriptor1);
                                                }
                                                arrayList0.add(callableMemberDescriptor1);
                                                continue;
                                            }
                                            case 2: {
                                                if(z1) {
                                                    overridingStrategy0.overrideConflict(callableMemberDescriptor1, callableMemberDescriptor0);
                                                }
                                                break;
                                            }
                                            default: {
                                                continue;
                                            }
                                        }
                                        arrayList0.add(callableMemberDescriptor1);
                                    }
                                    overridingStrategy0.setOverriddenDescriptors(callableMemberDescriptor0, smartSet0);
                                    linkedHashSet0.removeAll(arrayList0);
                                    continue;
                                }
                                OverridingUtil.a(59);
                                throw null;
                            }
                            if(linkedHashSet0.size() >= 2) {
                                Object object2 = linkedHashSet0.iterator().next();
                                z = CollectionsKt___CollectionsKt.all(linkedHashSet0, new b(((CallableMemberDescriptor)object2).getContainingDeclaration(), 2));
                            }
                            if(z) {
                                for(Object object3: linkedHashSet0) {
                                    OverridingUtil.e(Collections.singleton(((CallableMemberDescriptor)object3)), classDescriptor0, overridingStrategy0);
                                }
                                return;
                            }
                            LinkedList linkedList0 = new LinkedList(linkedHashSet0);
                            while(!linkedList0.isEmpty()) {
                                CallableMemberDescriptor callableMemberDescriptor2 = VisibilityUtilKt.findMemberWithMaxVisibility(linkedList0);
                                if(callableMemberDescriptor2 != null) {
                                    OverridingUtil.e(OverridingUtil.extractMembersOverridableInBothWays(callableMemberDescriptor2, linkedList0, new n(5), new z5.b(1, overridingStrategy0, callableMemberDescriptor2)), classDescriptor0, overridingStrategy0);
                                    continue;
                                }
                                OverridingUtil.a(104);
                                throw null;
                            }
                            return;
                        }
                        OverridingUtil.a(56);
                        throw null;
                    }
                    OverridingUtil.a(55);
                    throw null;
                }
                OverridingUtil.a(54);
                throw null;
            }
            OverridingUtil.a(53);
            throw null;
        }
        OverridingUtil.a(52);
        throw null;
    }

    @Nullable
    public static OverrideCompatibilityInfo getBasicOverridabilityProblem(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1) {
        OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo0;
        int v = 0;
        if(callableDescriptor0 != null) {
            if(callableDescriptor1 != null) {
                if(callableDescriptor0 instanceof FunctionDescriptor && !(callableDescriptor1 instanceof FunctionDescriptor) || callableDescriptor0 instanceof PropertyDescriptor && !(callableDescriptor1 instanceof PropertyDescriptor)) {
                    return OverrideCompatibilityInfo.incompatible("Member kind mismatch");
                }
                if(!(callableDescriptor0 instanceof FunctionDescriptor) && !(callableDescriptor0 instanceof PropertyDescriptor)) {
                    throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor0);
                }
                if(!callableDescriptor0.getName().equals(callableDescriptor1.getName())) {
                    return OverrideCompatibilityInfo.incompatible("Name mismatch");
                }
                int v1 = callableDescriptor0.getExtensionReceiverParameter() == null ? 1 : 0;
                if(callableDescriptor1.getExtensionReceiverParameter() == null) {
                    v = 1;
                }
                if(v1 != v) {
                    overridingUtil$OverrideCompatibilityInfo0 = OverrideCompatibilityInfo.incompatible("Receiver presence mismatch");
                    return overridingUtil$OverrideCompatibilityInfo0 == null ? null : overridingUtil$OverrideCompatibilityInfo0;
                }
                overridingUtil$OverrideCompatibilityInfo0 = callableDescriptor0.getValueParameters().size() == callableDescriptor1.getValueParameters().size() ? null : OverrideCompatibilityInfo.incompatible("Value parameter number mismatch");
                return overridingUtil$OverrideCompatibilityInfo0 == null ? null : overridingUtil$OverrideCompatibilityInfo0;
            }
            OverridingUtil.a(41);
            throw null;
        }
        OverridingUtil.a(40);
        throw null;
    }

    @Nullable
    public static Result getBothWaysOverridability(CallableDescriptor callableDescriptor0, CallableDescriptor callableDescriptor1) {
        Result overridingUtil$OverrideCompatibilityInfo$Result0 = OverridingUtil.DEFAULT.isOverridableBy(callableDescriptor1, callableDescriptor0, null).getResult();
        Result overridingUtil$OverrideCompatibilityInfo$Result1 = OverridingUtil.DEFAULT.isOverridableBy(callableDescriptor0, callableDescriptor1, null).getResult();
        Result overridingUtil$OverrideCompatibilityInfo$Result2 = Result.OVERRIDABLE;
        if(overridingUtil$OverrideCompatibilityInfo$Result0 != overridingUtil$OverrideCompatibilityInfo$Result2 || overridingUtil$OverrideCompatibilityInfo$Result1 != overridingUtil$OverrideCompatibilityInfo$Result2) {
            return overridingUtil$OverrideCompatibilityInfo$Result0 == Result.CONFLICT || overridingUtil$OverrideCompatibilityInfo$Result1 == Result.CONFLICT ? Result.CONFLICT : Result.INCOMPATIBLE;
        }
        return overridingUtil$OverrideCompatibilityInfo$Result2;
    }

    @NotNull
    public static Set getOverriddenDeclarations(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        if(callableMemberDescriptor0 != null) {
            Set set0 = new LinkedHashSet();
            OverridingUtil.c(callableMemberDescriptor0, ((LinkedHashSet)set0));
            return set0;
        }
        OverridingUtil.a(15);
        throw null;
    }

    public static boolean h(CallableDescriptor callableDescriptor0, CallableDescriptor callableDescriptor1) {
        if(callableDescriptor0 != null) {
            if(callableDescriptor1 != null) {
                Integer integer0 = DescriptorVisibilities.compare(callableDescriptor0.getVisibility(), callableDescriptor1.getVisibility());
                return integer0 == null || ((int)integer0) >= 0;
            }
            OverridingUtil.a(70);
            throw null;
        }
        OverridingUtil.a(69);
        throw null;
    }

    public static boolean isMoreSpecific(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1) {
        if(callableDescriptor0 != null) {
            if(callableDescriptor1 != null) {
                KotlinType kotlinType0 = callableDescriptor0.getReturnType();
                KotlinType kotlinType1 = callableDescriptor1.getReturnType();
                if(!OverridingUtil.h(callableDescriptor0, callableDescriptor1)) {
                    return false;
                }
                List list0 = callableDescriptor0.getTypeParameters();
                List list1 = callableDescriptor1.getTypeParameters();
                TypeCheckerState typeCheckerState0 = OverridingUtil.DEFAULT.f(list0, list1);
                if(callableDescriptor0 instanceof FunctionDescriptor) {
                    return OverridingUtil.g(callableDescriptor0, kotlinType0, callableDescriptor1, kotlinType1, typeCheckerState0);
                }
                if(!(callableDescriptor0 instanceof PropertyDescriptor)) {
                    throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor0.getClass());
                }
                PropertySetterDescriptor propertySetterDescriptor0 = ((PropertyDescriptor)callableDescriptor0).getSetter();
                PropertySetterDescriptor propertySetterDescriptor1 = ((PropertyDescriptor)callableDescriptor1).getSetter();
                if(!(propertySetterDescriptor0 == null || propertySetterDescriptor1 == null ? true : OverridingUtil.h(propertySetterDescriptor0, propertySetterDescriptor1))) {
                    return false;
                }
                if(((PropertyDescriptor)callableDescriptor0).isVar() && ((PropertyDescriptor)callableDescriptor1).isVar()) {
                    UnwrappedType unwrappedType0 = kotlinType0.unwrap();
                    UnwrappedType unwrappedType1 = kotlinType1.unwrap();
                    return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState0, unwrappedType0, unwrappedType1);
                }
                return (((PropertyDescriptor)callableDescriptor0).isVar() || !((PropertyDescriptor)callableDescriptor1).isVar()) && OverridingUtil.g(callableDescriptor0, kotlinType0, callableDescriptor1, kotlinType1, typeCheckerState0);
            }
            OverridingUtil.a(68);
            throw null;
        }
        OverridingUtil.a(67);
        throw null;
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableBy(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1, @Nullable ClassDescriptor classDescriptor0) {
        if(callableDescriptor0 != null) {
            if(callableDescriptor1 != null) {
                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo0 = this.isOverridableBy(callableDescriptor0, callableDescriptor1, classDescriptor0, false);
                if(overridingUtil$OverrideCompatibilityInfo0 != null) {
                    return overridingUtil$OverrideCompatibilityInfo0;
                }
                OverridingUtil.a(21);
                throw null;
            }
            OverridingUtil.a(20);
            throw null;
        }
        OverridingUtil.a(19);
        throw null;
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableBy(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1, @Nullable ClassDescriptor classDescriptor0, boolean z) {
        if(callableDescriptor0 != null) {
            if(callableDescriptor1 != null) {
                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo0 = this.isOverridableByWithoutExternalConditions(callableDescriptor0, callableDescriptor1, z);
                boolean z1 = overridingUtil$OverrideCompatibilityInfo0.getResult() == Result.OVERRIDABLE;
                List list0 = OverridingUtil.d;
                for(Object object0: list0) {
                    ExternalOverridabilityCondition externalOverridabilityCondition0 = (ExternalOverridabilityCondition)object0;
                    if(externalOverridabilityCondition0.getContract() != Contract.CONFLICTS_ONLY && (!z1 || externalOverridabilityCondition0.getContract() != Contract.SUCCESS_ONLY)) {
                        switch(a.a[externalOverridabilityCondition0.isOverridable(callableDescriptor0, callableDescriptor1, classDescriptor0).ordinal()]) {
                            case 1: {
                                z1 = true;
                                break;
                            }
                            case 2: {
                                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo1 = OverrideCompatibilityInfo.conflict("External condition failed");
                                if(overridingUtil$OverrideCompatibilityInfo1 != null) {
                                    return overridingUtil$OverrideCompatibilityInfo1;
                                }
                                OverridingUtil.a(24);
                                throw null;
                            }
                            case 3: {
                                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo2 = OverrideCompatibilityInfo.incompatible("External condition");
                                if(overridingUtil$OverrideCompatibilityInfo2 != null) {
                                    return overridingUtil$OverrideCompatibilityInfo2;
                                }
                                OverridingUtil.a(25);
                                throw null;
                            }
                        }
                    }
                }
                if(!z1) {
                    return overridingUtil$OverrideCompatibilityInfo0;
                }
                for(Object object1: list0) {
                    ExternalOverridabilityCondition externalOverridabilityCondition1 = (ExternalOverridabilityCondition)object1;
                    if(externalOverridabilityCondition1.getContract() != Contract.CONFLICTS_ONLY) {
                        continue;
                    }
                    switch(a.a[externalOverridabilityCondition1.isOverridable(callableDescriptor0, callableDescriptor1, classDescriptor0).ordinal()]) {
                        case 1: {
                            throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition1.getClass().getName() + " condition. It\'s not supposed to end with success");
                        }
                        case 2: {
                            OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo3 = OverrideCompatibilityInfo.conflict("External condition failed");
                            if(overridingUtil$OverrideCompatibilityInfo3 != null) {
                                return overridingUtil$OverrideCompatibilityInfo3;
                            }
                            OverridingUtil.a(27);
                            throw null;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            continue;
                        }
                    }
                    OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo4 = OverrideCompatibilityInfo.incompatible("External condition");
                    if(overridingUtil$OverrideCompatibilityInfo4 != null) {
                        return overridingUtil$OverrideCompatibilityInfo4;
                    }
                    OverridingUtil.a(28);
                    throw null;
                }
                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo5 = OverrideCompatibilityInfo.success();
                if(overridingUtil$OverrideCompatibilityInfo5 != null) {
                    return overridingUtil$OverrideCompatibilityInfo5;
                }
                OverridingUtil.a(29);
                throw null;
            }
            OverridingUtil.a(23);
            throw null;
        }
        OverridingUtil.a(22);
        throw null;
    }

    @NotNull
    public OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1, boolean z) {
        if(callableDescriptor0 != null) {
            if(callableDescriptor1 != null) {
                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo0 = OverridingUtil.getBasicOverridabilityProblem(callableDescriptor0, callableDescriptor1);
                if(overridingUtil$OverrideCompatibilityInfo0 != null) {
                    return overridingUtil$OverrideCompatibilityInfo0;
                }
                ArrayList arrayList0 = OverridingUtil.d(callableDescriptor0);
                ArrayList arrayList1 = OverridingUtil.d(callableDescriptor1);
                List list0 = callableDescriptor0.getTypeParameters();
                List list1 = callableDescriptor1.getTypeParameters();
                int v = 0;
                if(list0.size() != list1.size()) {
                    while(v < arrayList0.size()) {
                        KotlinType kotlinType0 = (KotlinType)arrayList0.get(v);
                        KotlinType kotlinType1 = (KotlinType)arrayList1.get(v);
                        if(!KotlinTypeChecker.DEFAULT.equalTypes(kotlinType0, kotlinType1)) {
                            OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo1 = OverrideCompatibilityInfo.incompatible("Type parameter number mismatch");
                            if(overridingUtil$OverrideCompatibilityInfo1 != null) {
                                return overridingUtil$OverrideCompatibilityInfo1;
                            }
                            OverridingUtil.a(33);
                            throw null;
                        }
                        ++v;
                    }
                    OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo2 = OverrideCompatibilityInfo.conflict("Type parameter number mismatch");
                    if(overridingUtil$OverrideCompatibilityInfo2 != null) {
                        return overridingUtil$OverrideCompatibilityInfo2;
                    }
                    OverridingUtil.a(34);
                    throw null;
                }
                TypeCheckerState typeCheckerState0 = this.f(list0, list1);
                int v1 = 0;
                while(v1 < list0.size()) {
                    TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)list0.get(v1);
                    TypeParameterDescriptor typeParameterDescriptor1 = (TypeParameterDescriptor)list1.get(v1);
                    if(typeParameterDescriptor0 != null) {
                        if(typeParameterDescriptor1 != null) {
                            List list2 = typeParameterDescriptor0.getUpperBounds();
                            ArrayList arrayList2 = new ArrayList(typeParameterDescriptor1.getUpperBounds());
                            if(list2.size() == arrayList2.size()) {
                                Iterator iterator0 = list2.iterator();
                            label_38:
                                while(iterator0.hasNext()) {
                                    Object object0 = iterator0.next();
                                    ListIterator listIterator0 = arrayList2.listIterator();
                                    while(true) {
                                        if(!listIterator0.hasNext()) {
                                            goto label_47;
                                        }
                                        if(!OverridingUtil.b(((KotlinType)object0), ((KotlinType)listIterator0.next()), typeCheckerState0)) {
                                            continue;
                                        }
                                        listIterator0.remove();
                                        continue label_38;
                                    }
                                }
                                ++v1;
                                continue;
                            }
                        label_47:
                            OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo3 = OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
                            if(overridingUtil$OverrideCompatibilityInfo3 != null) {
                                return overridingUtil$OverrideCompatibilityInfo3;
                            }
                            OverridingUtil.a(35);
                            throw null;
                        }
                        OverridingUtil.a(50);
                        throw null;
                    }
                    OverridingUtil.a(49);
                    throw null;
                }
                while(v < arrayList0.size()) {
                    if(!OverridingUtil.b(((KotlinType)arrayList0.get(v)), ((KotlinType)arrayList1.get(v)), typeCheckerState0)) {
                        OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo4 = OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                        if(overridingUtil$OverrideCompatibilityInfo4 != null) {
                            return overridingUtil$OverrideCompatibilityInfo4;
                        }
                        OverridingUtil.a(36);
                        throw null;
                    }
                    ++v;
                }
                if(callableDescriptor0 instanceof FunctionDescriptor && callableDescriptor1 instanceof FunctionDescriptor && ((FunctionDescriptor)callableDescriptor0).isSuspend() != ((FunctionDescriptor)callableDescriptor1).isSuspend()) {
                    OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo5 = OverrideCompatibilityInfo.conflict("Incompatible suspendability");
                    if(overridingUtil$OverrideCompatibilityInfo5 != null) {
                        return overridingUtil$OverrideCompatibilityInfo5;
                    }
                    OverridingUtil.a(37);
                    throw null;
                }
                if(z) {
                    KotlinType kotlinType2 = callableDescriptor0.getReturnType();
                    KotlinType kotlinType3 = callableDescriptor1.getReturnType();
                    if(kotlinType2 != null && kotlinType3 != null && (!KotlinTypeKt.isError(kotlinType3) || !KotlinTypeKt.isError(kotlinType2))) {
                        UnwrappedType unwrappedType0 = kotlinType3.unwrap();
                        UnwrappedType unwrappedType1 = kotlinType2.unwrap();
                        if(!AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerState0, unwrappedType0, unwrappedType1)) {
                            OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo6 = OverrideCompatibilityInfo.conflict("Return type mismatch");
                            if(overridingUtil$OverrideCompatibilityInfo6 != null) {
                                return overridingUtil$OverrideCompatibilityInfo6;
                            }
                            OverridingUtil.a(38);
                            throw null;
                        }
                    }
                }
                OverrideCompatibilityInfo overridingUtil$OverrideCompatibilityInfo7 = OverrideCompatibilityInfo.success();
                if(overridingUtil$OverrideCompatibilityInfo7 != null) {
                    return overridingUtil$OverrideCompatibilityInfo7;
                }
                OverridingUtil.a(39);
                throw null;
            }
            OverridingUtil.a(0x1F);
            throw null;
        }
        OverridingUtil.a(30);
        throw null;
    }

    public static boolean isVisibleForOverride(@NotNull MemberDescriptor memberDescriptor0, @NotNull MemberDescriptor memberDescriptor1, boolean z) {
        if(memberDescriptor0 != null) {
            if(memberDescriptor1 != null) {
                return !DescriptorVisibilities.isPrivate(memberDescriptor1.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(memberDescriptor1, memberDescriptor0, z);
            }
            OverridingUtil.a(58);
            throw null;
        }
        OverridingUtil.a(57);
        throw null;
    }

    public static boolean overrides(@NotNull CallableDescriptor callableDescriptor0, @NotNull CallableDescriptor callableDescriptor1, boolean z, boolean z1) {
        if(callableDescriptor0 != null) {
            if(callableDescriptor1 != null) {
                if(!callableDescriptor0.equals(callableDescriptor1)) {
                    CallableDescriptor callableDescriptor2 = callableDescriptor0.getOriginal();
                    CallableDescriptor callableDescriptor3 = callableDescriptor1.getOriginal();
                    if(DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(callableDescriptor2, callableDescriptor3, z, z1)) {
                        return true;
                    }
                }
                CallableDescriptor callableDescriptor4 = callableDescriptor1.getOriginal();
                for(Object object0: DescriptorUtils.getAllOverriddenDescriptors(callableDescriptor0)) {
                    if(DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(callableDescriptor4, ((CallableDescriptor)object0), z, z1)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            OverridingUtil.a(14);
            throw null;
        }
        OverridingUtil.a(13);
        throw null;
    }

    public static void resolveUnknownVisibilityForMember(@NotNull CallableMemberDescriptor callableMemberDescriptor0, @Nullable Function1 function10) {
        DescriptorVisibility descriptorVisibility1;
        if(callableMemberDescriptor0 != null) {
            for(Object object0: callableMemberDescriptor0.getOverriddenDescriptors()) {
                CallableMemberDescriptor callableMemberDescriptor1 = (CallableMemberDescriptor)object0;
                if(callableMemberDescriptor1.getVisibility() == DescriptorVisibilities.INHERITED) {
                    OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor1, function10);
                }
            }
            if(callableMemberDescriptor0.getVisibility() != DescriptorVisibilities.INHERITED) {
                return;
            }
            Collection collection0 = callableMemberDescriptor0.getOverriddenDescriptors();
            DescriptorVisibility descriptorVisibility0 = OverridingUtil.findMaxVisibility(collection0);
            if(descriptorVisibility0 == null) {
                descriptorVisibility0 = null;
            }
            else if(callableMemberDescriptor0.getKind() == Kind.FAKE_OVERRIDE) {
                for(Object object1: collection0) {
                    if(((CallableMemberDescriptor)object1).getModality() != Modality.ABSTRACT && !((CallableMemberDescriptor)object1).getVisibility().equals(descriptorVisibility0)) {
                        descriptorVisibility0 = null;
                        break;
                    }
                }
            }
            else {
                descriptorVisibility0 = descriptorVisibility0.normalize();
            }
            if(descriptorVisibility0 == null) {
                if(function10 != null) {
                    function10.invoke(callableMemberDescriptor0);
                }
                descriptorVisibility1 = DescriptorVisibilities.PUBLIC;
            }
            else {
                descriptorVisibility1 = descriptorVisibility0;
            }
            if(callableMemberDescriptor0 instanceof PropertyDescriptorImpl) {
                ((PropertyDescriptorImpl)callableMemberDescriptor0).setVisibility(descriptorVisibility1);
                for(Object object2: ((PropertyDescriptor)callableMemberDescriptor0).getAccessors()) {
                    OverridingUtil.resolveUnknownVisibilityForMember(((PropertyAccessorDescriptor)object2), (descriptorVisibility0 == null ? null : function10));
                }
                return;
            }
            if(callableMemberDescriptor0 instanceof FunctionDescriptorImpl) {
                ((FunctionDescriptorImpl)callableMemberDescriptor0).setVisibility(descriptorVisibility1);
                return;
            }
            ((PropertyAccessorDescriptorImpl)callableMemberDescriptor0).setVisibility(descriptorVisibility1);
            if(descriptorVisibility1 != ((PropertyAccessorDescriptorImpl)callableMemberDescriptor0).getCorrespondingProperty().getVisibility()) {
                ((PropertyAccessorDescriptorImpl)callableMemberDescriptor0).setDefault(false);
            }
            return;
        }
        OverridingUtil.a(107);
        throw null;
    }

    @NotNull
    public static Object selectMostSpecificMember(@NotNull Collection collection0, @NotNull Function1 function10) {
        if(collection0 != null) {
            if(function10 != null) {
                if(collection0.size() == 1) {
                    Object object0 = CollectionsKt___CollectionsKt.first(collection0);
                    if(object0 != null) {
                        return object0;
                    }
                    OverridingUtil.a(80);
                    throw null;
                }
                ArrayList arrayList0 = new ArrayList(2);
                List list0 = CollectionsKt___CollectionsKt.map(collection0, function10);
                Object object1 = CollectionsKt___CollectionsKt.first(collection0);
                CallableDescriptor callableDescriptor0 = (CallableDescriptor)function10.invoke(object1);
                for(Object object2: collection0) {
                    CallableDescriptor callableDescriptor1 = (CallableDescriptor)function10.invoke(object2);
                    if(callableDescriptor1 != null) {
                        if(list0 != null) {
                            for(Object object3: list0) {
                                if(OverridingUtil.isMoreSpecific(callableDescriptor1, ((CallableDescriptor)object3))) {
                                    continue;
                                }
                                goto label_24;
                            }
                            arrayList0.add(object2);
                        label_24:
                            if(!OverridingUtil.isMoreSpecific(callableDescriptor1, callableDescriptor0) || OverridingUtil.isMoreSpecific(callableDescriptor0, callableDescriptor1)) {
                                continue;
                            }
                            object1 = object2;
                            continue;
                        }
                        OverridingUtil.a(72);
                        throw null;
                    }
                    OverridingUtil.a(71);
                    throw null;
                }
                if(arrayList0.isEmpty()) {
                    if(object1 != null) {
                        return object1;
                    }
                    OverridingUtil.a(81);
                    throw null;
                }
                if(arrayList0.size() == 1) {
                    Object object4 = CollectionsKt___CollectionsKt.first(arrayList0);
                    if(object4 != null) {
                        return object4;
                    }
                    OverridingUtil.a(82);
                    throw null;
                }
                Object object5 = null;
                for(Object object6: arrayList0) {
                    if(!FlexibleTypesKt.isFlexible(((CallableDescriptor)function10.invoke(object6)).getReturnType())) {
                        object5 = object6;
                        break;
                    }
                }
                if(object5 != null) {
                    return object5;
                }
                Object object7 = CollectionsKt___CollectionsKt.first(arrayList0);
                if(object7 != null) {
                    return object7;
                }
                OverridingUtil.a(84);
                throw null;
            }
            OverridingUtil.a(0x4F);
            throw null;
        }
        OverridingUtil.a(78);
        throw null;
    }
}

