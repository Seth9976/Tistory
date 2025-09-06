package kotlin.reflect.jvm.internal.impl.types.checker;

import androidx.room.a;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RawTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {
    @SourceDebugExtension({"SMAP\nClassicTypeSystemContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContextKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 6 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n*L\n1#1,951:1\n1#2:952\n945#3:953\n945#3:954\n945#3:955\n945#3:956\n945#3:957\n945#3:958\n945#3:959\n945#3:960\n945#3:961\n945#3:962\n945#3:963\n945#3:964\n945#3:965\n945#3:966\n945#3:967\n945#3:968\n945#3:969\n945#3:970\n945#3:971\n945#3:972\n945#3:973\n945#3:974\n945#3:975\n945#3:976\n945#3:977\n945#3:978\n945#3:979\n945#3:980\n945#3:981\n945#3:982\n945#3:983\n945#3:984\n945#3:985\n945#3:986\n945#3:987\n945#3:988\n945#3:989\n945#3:990\n945#3:991\n945#3:992\n945#3:993\n945#3:994\n945#3:995\n945#3:996\n945#3:997\n945#3:998\n945#3:999\n945#3:1000\n945#3:1001\n945#3:1002\n945#3:1003\n945#3:1004\n945#3:1005\n945#3:1006\n945#3:1007\n945#3:1008\n945#3:1009\n945#3:1010\n945#3:1011\n945#3:1012\n945#3:1013\n945#3:1014\n945#3:1015\n945#3:1016\n945#3:1017\n945#3:1018\n945#3:1019\n945#3:1020\n945#3:1021\n945#3:1022\n945#3:1023\n945#3:1024\n945#3:1025\n945#3:1029\n945#3:1030\n945#3:1031\n945#3:1032\n945#3:1033\n945#3:1034\n945#3:1035\n945#3:1036\n945#3:1042\n945#3:1043\n945#3:1044\n945#3:1045\n945#3:1046\n945#3:1047\n945#3:1054\n945#3:1055\n945#3:1056\n945#3:1071\n945#3:1072\n945#3:1073\n945#3:1074\n945#3:1075\n945#3:1076\n945#3:1090\n945#3:1091\n945#3:1092\n945#3:1093\n945#3:1094\n945#3:1095\n945#3:1096\n945#3:1097\n945#3:1098\n945#3:1099\n945#3:1100\n945#3:1101\n945#3:1102\n945#3:1103\n945#3:1104\n945#3:1105\n945#3:1106\n945#3:1107\n945#3:1108\n945#3:1109\n945#3:1110\n945#3:1111\n945#3:1112\n945#3:1113\n945#3:1114\n945#3:1115\n945#3:1116\n819#4:1026\n847#4,2:1027\n766#4:1039\n857#4,2:1040\n1549#4:1050\n1620#4,3:1051\n1549#4:1057\n1620#4,3:1058\n2661#4,7:1061\n819#4:1068\n847#4,2:1069\n819#4:1077\n847#4,2:1078\n1549#4:1080\n1620#4,3:1081\n1271#4,2:1084\n1285#4,4:1086\n20#5,2:1037\n280#6,2:1048\n*S KotlinDebug\n*F\n+ 1 ClassicTypeSystemContext.kt\norg/jetbrains/kotlin/types/checker/ClassicTypeSystemContext$DefaultImpls\n*L\n40#1:953\n45#1:954\n58#1:955\n63#1:956\n69#1:957\n75#1:958\n80#1:959\n85#1:960\n90#1:961\n95#1:962\n100#1:963\n105#1:964\n110#1:965\n119#1:966\n125#1:967\n130#1:968\n135#1:969\n136#1:970\n141#1:971\n146#1:972\n151#1:973\n156#1:974\n161#1:975\n166#1:976\n171#1:977\n176#1:978\n184#1:979\n189#1:980\n194#1:981\n199#1:982\n204#1:983\n209#1:984\n214#1:985\n219#1:986\n224#1:987\n229#1:988\n230#1:989\n235#1:990\n241#1:991\n246#1:992\n251#1:993\n256#1:994\n261#1:995\n266#1:996\n271#1:997\n276#1:998\n281#1:999\n286#1:1000\n287#1:1001\n293#1:1002\n294#1:1003\n299#1:1004\n304#1:1005\n309#1:1006\n315#1:1007\n323#1:1008\n329#1:1009\n334#1:1010\n339#1:1011\n344#1:1012\n349#1:1013\n354#1:1014\n368#1:1015\n378#1:1016\n383#1:1017\n409#1:1018\n414#1:1019\n419#1:1020\n420#1:1021\n460#1:1022\n466#1:1023\n471#1:1024\n476#1:1025\n482#1:1029\n487#1:1030\n504#1:1031\n510#1:1032\n515#1:1033\n520#1:1034\n527#1:1035\n538#1:1036\n561#1:1042\n566#1:1043\n571#1:1044\n578#1:1045\n583#1:1046\n589#1:1047\n595#1:1054\n617#1:1055\n618#1:1056\n674#1:1071\n679#1:1072\n684#1:1073\n689#1:1074\n694#1:1075\n699#1:1076\n737#1:1090\n742#1:1091\n747#1:1092\n752#1:1093\n757#1:1094\n762#1:1095\n767#1:1096\n772#1:1097\n777#1:1098\n782#1:1099\n787#1:1100\n792#1:1101\n797#1:1102\n802#1:1103\n807#1:1104\n812#1:1105\n817#1:1106\n822#1:1107\n827#1:1108\n836#1:1109\n837#1:1110\n848#1:1111\n853#1:1112\n858#1:1113\n863#1:1114\n881#1:1115\n888#1:1116\n477#1:1026\n477#1:1027,2\n546#1:1039\n546#1:1040,2\n591#1:1050\n591#1:1051,3\n660#1:1057\n660#1:1058,3\n660#1:1061,7\n666#1:1068\n666#1:1069,2\n700#1:1077\n700#1:1078,2\n725#1:1080\n725#1:1081,3\n726#1:1084,2\n726#1:1086,4\n540#1:1037,2\n591#1:1048,2\n*E\n"})
    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0, @NotNull TypeConstructorMarker typeConstructorMarker1) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "c1");
            Intrinsics.checkNotNullParameter(typeConstructorMarker1, "c2");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            if(!(typeConstructorMarker1 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker1 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker1.getClass())).toString());
            }
            return Intrinsics.areEqual(typeConstructorMarker0, typeConstructorMarker1);
        }

        public static int argumentsCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return ((KotlinType)kotlinTypeMarker0).getArguments().size();
        }

        @NotNull
        public static TypeArgumentListMarker asArgumentList(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return (TypeArgumentListMarker)simpleTypeMarker0;
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        @Nullable
        public static CapturedTypeMarker asCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                if(simpleTypeMarker0 instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext0.asCapturedType(((SimpleTypeWithEnhancement)simpleTypeMarker0).getOrigin());
                }
                return simpleTypeMarker0 instanceof NewCapturedType ? ((NewCapturedType)simpleTypeMarker0) : null;
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        @Nullable
        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return simpleTypeMarker0 instanceof DefinitelyNotNullType ? ((DefinitelyNotNullType)simpleTypeMarker0) : null;
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        @Nullable
        public static DynamicTypeMarker asDynamicType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull FlexibleTypeMarker flexibleTypeMarker0) {
            Intrinsics.checkNotNullParameter(flexibleTypeMarker0, "$receiver");
            if(!(flexibleTypeMarker0 instanceof FlexibleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + flexibleTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(flexibleTypeMarker0.getClass())).toString());
            }
            return flexibleTypeMarker0 instanceof DynamicType ? ((DynamicType)flexibleTypeMarker0) : null;
        }

        @Nullable
        public static FlexibleTypeMarker asFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            UnwrappedType unwrappedType0 = ((KotlinType)kotlinTypeMarker0).unwrap();
            return unwrappedType0 instanceof FlexibleType ? ((FlexibleType)unwrappedType0) : null;
        }

        @Nullable
        public static RawTypeMarker asRawType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull FlexibleTypeMarker flexibleTypeMarker0) {
            Intrinsics.checkNotNullParameter(flexibleTypeMarker0, "$receiver");
            if(!(flexibleTypeMarker0 instanceof FlexibleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + flexibleTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(flexibleTypeMarker0.getClass())).toString());
            }
            return flexibleTypeMarker0 instanceof RawType ? ((RawType)flexibleTypeMarker0) : null;
        }

        @Nullable
        public static SimpleTypeMarker asSimpleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            UnwrappedType unwrappedType0 = ((KotlinType)kotlinTypeMarker0).unwrap();
            return unwrappedType0 instanceof SimpleType ? ((SimpleType)unwrappedType0) : null;
        }

        @NotNull
        public static TypeArgumentMarker asTypeArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return TypeUtilsKt.asTypeProjection(((KotlinType)kotlinTypeMarker0));
        }

        @Nullable
        public static SimpleTypeMarker captureFromArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull CaptureStatus captureStatus0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "type");
            Intrinsics.checkNotNullParameter(captureStatus0, "status");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments(((SimpleType)simpleTypeMarker0), captureStatus0);
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        @NotNull
        public static CaptureStatus captureStatus(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull CapturedTypeMarker capturedTypeMarker0) {
            Intrinsics.checkNotNullParameter(capturedTypeMarker0, "$receiver");
            if(!(capturedTypeMarker0 instanceof NewCapturedType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + capturedTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(capturedTypeMarker0.getClass())).toString());
            }
            return ((NewCapturedType)capturedTypeMarker0).getCaptureStatus();
        }

        @NotNull
        public static KotlinTypeMarker createFlexibleType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull SimpleTypeMarker simpleTypeMarker1) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "lowerBound");
            Intrinsics.checkNotNullParameter(simpleTypeMarker1, "upperBound");
            if(!(simpleTypeMarker0 instanceof SimpleType) || !(simpleTypeMarker1 instanceof SimpleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + classicTypeSystemContext0 + ", " + Reflection.getOrCreateKotlinClass(classicTypeSystemContext0.getClass())).toString());
            }
            return KotlinTypeFactory.flexibleType(((SimpleType)simpleTypeMarker0), ((SimpleType)simpleTypeMarker1));
        }

        @NotNull
        public static TypeArgumentMarker getArgument(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0, int v) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return (TypeArgumentMarker)((KotlinType)kotlinTypeMarker0).getArguments().get(v);
        }

        @NotNull
        public static List getArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return ((KotlinType)kotlinTypeMarker0).getArguments();
        }

        @NotNull
        public static FqNameUnsafe getClassFqNameUnsafe(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return DescriptorUtilsKt.getFqNameUnsafe(((ClassDescriptor)classifierDescriptor0));
        }

        @NotNull
        public static TypeParameterMarker getParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0, int v) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            Object object0 = ((TypeConstructor)typeConstructorMarker0).getParameters().get(v);
            Intrinsics.checkNotNullExpressionValue(object0, "this.parameters[index]");
            return (TypeParameterMarker)object0;
        }

        @NotNull
        public static List getParameters(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            List list0 = ((TypeConstructor)typeConstructorMarker0).getParameters();
            Intrinsics.checkNotNullExpressionValue(list0, "this.parameters");
            return list0;
        }

        @Nullable
        public static PrimitiveType getPrimitiveArrayType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return KotlinBuiltIns.getPrimitiveArrayType(((ClassDescriptor)classifierDescriptor0));
        }

        @Nullable
        public static PrimitiveType getPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return KotlinBuiltIns.getPrimitiveType(((ClassDescriptor)classifierDescriptor0));
        }

        @NotNull
        public static KotlinTypeMarker getRepresentativeUpperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeParameterMarker typeParameterMarker0) {
            Intrinsics.checkNotNullParameter(typeParameterMarker0, "$receiver");
            if(!(typeParameterMarker0 instanceof TypeParameterDescriptor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeParameterMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeParameterMarker0.getClass())).toString());
            }
            return TypeUtilsKt.getRepresentativeUpperBound(((TypeParameterDescriptor)typeParameterMarker0));
        }

        @NotNull
        public static KotlinTypeMarker getType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeArgumentMarker typeArgumentMarker0) {
            Intrinsics.checkNotNullParameter(typeArgumentMarker0, "$receiver");
            if(!(typeArgumentMarker0 instanceof TypeProjection)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeArgumentMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeArgumentMarker0.getClass())).toString());
            }
            return ((TypeProjection)typeArgumentMarker0).getType().unwrap();
        }

        @Nullable
        public static TypeParameterMarker getTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeVariableTypeConstructorMarker0, "$receiver");
            if(!(typeVariableTypeConstructorMarker0 instanceof NewTypeVariableConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeVariableTypeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeVariableTypeConstructorMarker0.getClass())).toString());
            }
            return ((NewTypeVariableConstructor)typeVariableTypeConstructorMarker0).getOriginalTypeParameter();
        }

        @Nullable
        public static TypeParameterMarker getTypeParameterClassifier(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor();
            return classifierDescriptor0 instanceof TypeParameterDescriptor ? ((TypeParameterDescriptor)classifierDescriptor0) : null;
        }

        @Nullable
        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return InlineClassesUtilsKt.unsubstitutedUnderlyingType(((KotlinType)kotlinTypeMarker0));
        }

        @NotNull
        public static List getUpperBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeParameterMarker typeParameterMarker0) {
            Intrinsics.checkNotNullParameter(typeParameterMarker0, "$receiver");
            if(!(typeParameterMarker0 instanceof TypeParameterDescriptor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeParameterMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeParameterMarker0.getClass())).toString());
            }
            List list0 = ((TypeParameterDescriptor)typeParameterMarker0).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(list0, "this.upperBounds");
            return list0;
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeArgumentMarker typeArgumentMarker0) {
            Intrinsics.checkNotNullParameter(typeArgumentMarker0, "$receiver");
            if(!(typeArgumentMarker0 instanceof TypeProjection)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeArgumentMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeArgumentMarker0.getClass())).toString());
            }
            Variance variance0 = ((TypeProjection)typeArgumentMarker0).getProjectionKind();
            Intrinsics.checkNotNullExpressionValue(variance0, "this.projectionKind");
            return TypeSystemContextKt.convertVariance(variance0);
        }

        @NotNull
        public static TypeVariance getVariance(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeParameterMarker typeParameterMarker0) {
            Intrinsics.checkNotNullParameter(typeParameterMarker0, "$receiver");
            if(!(typeParameterMarker0 instanceof TypeParameterDescriptor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeParameterMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeParameterMarker0.getClass())).toString());
            }
            Variance variance0 = ((TypeParameterDescriptor)typeParameterMarker0).getVariance();
            Intrinsics.checkNotNullExpressionValue(variance0, "this.variance");
            return TypeSystemContextKt.convertVariance(variance0);
        }

        public static boolean hasAnnotation(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull FqName fqName0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            Intrinsics.checkNotNullParameter(fqName0, "fqName");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return ((KotlinType)kotlinTypeMarker0).getAnnotations().hasAnnotation(fqName0);
        }

        public static boolean hasRecursiveBounds(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeParameterMarker typeParameterMarker0, @Nullable TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeParameterMarker0, "$receiver");
            if(!(typeParameterMarker0 instanceof TypeParameterDescriptor) || !(typeConstructorMarker0 == null ? true : typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeParameterMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeParameterMarker0.getClass())).toString());
            }
            return TypeUtilsKt.hasTypeParameterRecursiveBounds$default(((TypeParameterDescriptor)typeParameterMarker0), ((TypeConstructor)typeConstructorMarker0), null, 4, null);
        }

        public static boolean identicalArguments(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0, @NotNull SimpleTypeMarker simpleTypeMarker1) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "a");
            Intrinsics.checkNotNullParameter(simpleTypeMarker1, "b");
            if(simpleTypeMarker0 instanceof SimpleType) {
                if(simpleTypeMarker1 instanceof SimpleType) {
                    return ((SimpleType)simpleTypeMarker0).getArguments() == ((SimpleType)simpleTypeMarker1).getArguments();
                }
                StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker1, ", ");
                stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker1.getClass()));
                throw new IllegalArgumentException(stringBuilder0.toString().toString());
            }
            StringBuilder stringBuilder1 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder1.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder1.toString().toString());
        }

        @NotNull
        public static KotlinTypeMarker intersectTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "types");
            return IntersectionTypeKt.intersectTypes(list0);
        }

        public static boolean isAnyConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            return KotlinBuiltIns.isTypeConstructorForGivenClass(((TypeConstructor)typeConstructorMarker0), FqNames.any);
        }

        public static boolean isClassTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            return ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor() instanceof ClassDescriptor;
        }

        public static boolean isCommonFinalClassConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor();
            ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
            return classDescriptor0 == null ? false : ModalityUtilsKt.isFinalClass(classDescriptor0) && classDescriptor0.getKind() != ClassKind.ENUM_ENTRY && classDescriptor0.getKind() != ClassKind.ANNOTATION_CLASS;
        }

        public static boolean isDenotable(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            return ((TypeConstructor)typeConstructorMarker0).isDenotable();
        }

        public static boolean isError(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return KotlinTypeKt.isError(((KotlinType)kotlinTypeMarker0));
        }

        public static boolean isInlineClass(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor();
            ValueClassRepresentation valueClassRepresentation0 = null;
            ClassDescriptor classDescriptor0 = classifierDescriptor0 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor0) : null;
            if(classDescriptor0 != null) {
                valueClassRepresentation0 = classDescriptor0.getValueClassRepresentation();
            }
            return valueClassRepresentation0 instanceof InlineClassRepresentation;
        }

        public static boolean isIntegerLiteralTypeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            return typeConstructorMarker0 instanceof IntegerLiteralTypeConstructor;
        }

        public static boolean isIntersection(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            return typeConstructorMarker0 instanceof IntersectionTypeConstructor;
        }

        public static boolean isMarkedNullable(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return ((SimpleType)simpleTypeMarker0).isMarkedNullable();
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        public static boolean isNotNullTypeParameter(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            return kotlinTypeMarker0 instanceof NotNullTypeParameter;
        }

        public static boolean isNothingConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            return KotlinBuiltIns.isTypeConstructorForGivenClass(((TypeConstructor)typeConstructorMarker0), FqNames.nothing);
        }

        public static boolean isNullableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof KotlinType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return TypeUtils.isNullableType(((KotlinType)kotlinTypeMarker0));
        }

        public static boolean isOldCapturedType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull CapturedTypeMarker capturedTypeMarker0) {
            Intrinsics.checkNotNullParameter(capturedTypeMarker0, "$receiver");
            return capturedTypeMarker0 instanceof CapturedType;
        }

        public static boolean isPrimitiveType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType(((KotlinType)simpleTypeMarker0));
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        public static boolean isProjectionNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull CapturedTypeMarker capturedTypeMarker0) {
            Intrinsics.checkNotNullParameter(capturedTypeMarker0, "$receiver");
            if(!(capturedTypeMarker0 instanceof NewCapturedType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + capturedTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(capturedTypeMarker0.getClass())).toString());
            }
            return ((NewCapturedType)capturedTypeMarker0).isProjectionNotNull();
        }

        public static boolean isSingleClassifierType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return !KotlinTypeKt.isError(((KotlinType)simpleTypeMarker0)) && !(((SimpleType)simpleTypeMarker0).getConstructor().getDeclarationDescriptor() instanceof TypeAliasDescriptor) && (((SimpleType)simpleTypeMarker0).getConstructor().getDeclarationDescriptor() != null || simpleTypeMarker0 instanceof CapturedType || simpleTypeMarker0 instanceof NewCapturedType || simpleTypeMarker0 instanceof DefinitelyNotNullType || ((SimpleType)simpleTypeMarker0).getConstructor() instanceof IntegerLiteralTypeConstructor || simpleTypeMarker0 instanceof SimpleTypeWithEnhancement && classicTypeSystemContext0.isSingleClassifierType(((SimpleTypeWithEnhancement)simpleTypeMarker0).getOrigin()));
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        public static boolean isStarProjection(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeArgumentMarker typeArgumentMarker0) {
            Intrinsics.checkNotNullParameter(typeArgumentMarker0, "$receiver");
            if(!(typeArgumentMarker0 instanceof TypeProjection)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeArgumentMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeArgumentMarker0.getClass())).toString());
            }
            return ((TypeProjection)typeArgumentMarker0).isStarProjection();
        }

        public static boolean isStubType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return TypeUtilsKt.isStubType(((KotlinType)simpleTypeMarker0));
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        public static boolean isStubTypeForBuilderInference(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference(((KotlinType)simpleTypeMarker0));
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        public static boolean isTypeVariableType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            return kotlinTypeMarker0 instanceof UnwrappedType && ((UnwrappedType)kotlinTypeMarker0).getConstructor() instanceof NewTypeVariableConstructor;
        }

        public static boolean isUnderKotlinPackage(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            ClassifierDescriptor classifierDescriptor0 = ((TypeConstructor)typeConstructorMarker0).getDeclarationDescriptor();
            return classifierDescriptor0 != null && KotlinBuiltIns.isUnderKotlinPackage(classifierDescriptor0);
        }

        @NotNull
        public static SimpleTypeMarker lowerBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull FlexibleTypeMarker flexibleTypeMarker0) {
            Intrinsics.checkNotNullParameter(flexibleTypeMarker0, "$receiver");
            if(!(flexibleTypeMarker0 instanceof FlexibleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + flexibleTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(flexibleTypeMarker0.getClass())).toString());
            }
            return ((FlexibleType)flexibleTypeMarker0).getLowerBound();
        }

        @Nullable
        public static KotlinTypeMarker lowerType(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull CapturedTypeMarker capturedTypeMarker0) {
            Intrinsics.checkNotNullParameter(capturedTypeMarker0, "$receiver");
            if(!(capturedTypeMarker0 instanceof NewCapturedType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + capturedTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(capturedTypeMarker0.getClass())).toString());
            }
            return ((NewCapturedType)capturedTypeMarker0).getLowerType();
        }

        @NotNull
        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(!(kotlinTypeMarker0 instanceof UnwrappedType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + kotlinTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(kotlinTypeMarker0.getClass())).toString());
            }
            return ClassicTypeSystemContextKt.access$makeDefinitelyNotNullOrNotNullInternal(((UnwrappedType)kotlinTypeMarker0));
        }

        @NotNull
        public static TypeCheckerState newTypeCheckerState(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, boolean z, boolean z1) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z, z1, classicTypeSystemContext0, null, null, 24, null);
        }

        @NotNull
        public static SimpleTypeMarker original(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker0) {
            Intrinsics.checkNotNullParameter(definitelyNotNullTypeMarker0, "$receiver");
            if(!(definitelyNotNullTypeMarker0 instanceof DefinitelyNotNullType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + definitelyNotNullTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(definitelyNotNullTypeMarker0.getClass())).toString());
            }
            return ((DefinitelyNotNullType)definitelyNotNullTypeMarker0).getOriginal();
        }

        public static int parametersCount(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            return ((TypeConstructor)typeConstructorMarker0).getParameters().size();
        }

        @NotNull
        public static Collection possibleIntegerTypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            TypeConstructorMarker typeConstructorMarker0 = classicTypeSystemContext0.typeConstructor(simpleTypeMarker0);
            if(typeConstructorMarker0 instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor)typeConstructorMarker0).getPossibleTypes();
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        @NotNull
        public static TypeArgumentMarker projection(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(capturedTypeConstructorMarker0, "$receiver");
            if(!(capturedTypeConstructorMarker0 instanceof NewCapturedTypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + capturedTypeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(capturedTypeConstructorMarker0.getClass())).toString());
            }
            return ((NewCapturedTypeConstructor)capturedTypeConstructorMarker0).getProjection();
        }

        @NotNull
        public static SupertypesPolicy substitutionSupertypePolicy(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "type");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return new ClassicTypeSystemContext.substitutionSupertypePolicy.2(classicTypeSystemContext0, TypeConstructorSubstitution.Companion.create(((KotlinType)simpleTypeMarker0)).buildSubstitutor());
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        @NotNull
        public static Collection supertypes(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull TypeConstructorMarker typeConstructorMarker0) {
            Intrinsics.checkNotNullParameter(typeConstructorMarker0, "$receiver");
            if(!(typeConstructorMarker0 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + typeConstructorMarker0 + ", " + Reflection.getOrCreateKotlinClass(typeConstructorMarker0.getClass())).toString());
            }
            Collection collection0 = ((TypeConstructor)typeConstructorMarker0).getSupertypes();
            Intrinsics.checkNotNullExpressionValue(collection0, "this.supertypes");
            return collection0;
        }

        @NotNull
        public static CapturedTypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull CapturedTypeMarker capturedTypeMarker0) {
            Intrinsics.checkNotNullParameter(capturedTypeMarker0, "$receiver");
            if(!(capturedTypeMarker0 instanceof NewCapturedType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + capturedTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(capturedTypeMarker0.getClass())).toString());
            }
            return ((NewCapturedType)capturedTypeMarker0).getConstructor();
        }

        @NotNull
        public static TypeConstructorMarker typeConstructor(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return ((SimpleType)simpleTypeMarker0).getConstructor();
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }

        @NotNull
        public static SimpleTypeMarker upperBound(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull FlexibleTypeMarker flexibleTypeMarker0) {
            Intrinsics.checkNotNullParameter(flexibleTypeMarker0, "$receiver");
            if(!(flexibleTypeMarker0 instanceof FlexibleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn\'t handle: " + flexibleTypeMarker0 + ", " + Reflection.getOrCreateKotlinClass(flexibleTypeMarker0.getClass())).toString());
            }
            return ((FlexibleType)flexibleTypeMarker0).getUpperBound();
        }

        @NotNull
        public static KotlinTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0, boolean z) {
            Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "$receiver");
            if(kotlinTypeMarker0 instanceof SimpleTypeMarker) {
                return classicTypeSystemContext0.withNullability(((SimpleTypeMarker)kotlinTypeMarker0), z);
            }
            if(!(kotlinTypeMarker0 instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed");
            }
            return classicTypeSystemContext0.createFlexibleType(classicTypeSystemContext0.withNullability(classicTypeSystemContext0.lowerBound(((FlexibleTypeMarker)kotlinTypeMarker0)), z), classicTypeSystemContext0.withNullability(classicTypeSystemContext0.upperBound(((FlexibleTypeMarker)kotlinTypeMarker0)), z));
        }

        @NotNull
        public static SimpleTypeMarker withNullability(@NotNull ClassicTypeSystemContext classicTypeSystemContext0, @NotNull SimpleTypeMarker simpleTypeMarker0, boolean z) {
            Intrinsics.checkNotNullParameter(simpleTypeMarker0, "$receiver");
            if(simpleTypeMarker0 instanceof SimpleType) {
                return ((SimpleType)simpleTypeMarker0).makeNullableAsSpecified(z);
            }
            StringBuilder stringBuilder0 = a.l("ClassicTypeSystemContext couldn\'t handle: ", simpleTypeMarker0, ", ");
            stringBuilder0.append(Reflection.getOrCreateKotlinClass(simpleTypeMarker0.getClass()));
            throw new IllegalArgumentException(stringBuilder0.toString().toString());
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    SimpleTypeMarker asSimpleType(@NotNull KotlinTypeMarker arg1);

    @NotNull
    KotlinTypeMarker createFlexibleType(@NotNull SimpleTypeMarker arg1, @NotNull SimpleTypeMarker arg2);

    @Override  // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(@NotNull SimpleTypeMarker arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    TypeConstructorMarker typeConstructor(@NotNull SimpleTypeMarker arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    SimpleTypeMarker withNullability(@NotNull SimpleTypeMarker arg1, boolean arg2);
}

