package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\ntypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1#2:104\n1747#3,3:105\n*S KotlinDebug\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n*L\n55#1:105,3\n*E\n"})
public final class TypeSignatureMappingKt {
    @NotNull
    public static final Object boxTypeIfNeeded(@NotNull JvmTypeFactory jvmTypeFactory0, @NotNull Object object0, boolean z) {
        Intrinsics.checkNotNullParameter(jvmTypeFactory0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "possiblyPrimitiveType");
        return z ? jvmTypeFactory0.boxType(object0) : object0;
    }

    @Nullable
    public static final Object mapBuiltInType(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext0, @NotNull KotlinTypeMarker kotlinTypeMarker0, @NotNull JvmTypeFactory jvmTypeFactory0, @NotNull TypeMappingMode typeMappingMode0) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext0, "<this>");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker0, "type");
        Intrinsics.checkNotNullParameter(jvmTypeFactory0, "typeFactory");
        Intrinsics.checkNotNullParameter(typeMappingMode0, "mode");
        TypeConstructorMarker typeConstructorMarker0 = typeSystemCommonBackendContext0.typeConstructor(kotlinTypeMarker0);
        if(!typeSystemCommonBackendContext0.isClassTypeConstructor(typeConstructorMarker0)) {
            return null;
        }
        PrimitiveType primitiveType0 = typeSystemCommonBackendContext0.getPrimitiveType(typeConstructorMarker0);
        if(primitiveType0 != null) {
            Object object0 = jvmTypeFactory0.createPrimitiveType(primitiveType0);
            return typeSystemCommonBackendContext0.isNullableType(kotlinTypeMarker0) || TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext0, kotlinTypeMarker0) ? TypeSignatureMappingKt.boxTypeIfNeeded(jvmTypeFactory0, object0, true) : TypeSignatureMappingKt.boxTypeIfNeeded(jvmTypeFactory0, object0, false);
        }
        PrimitiveType primitiveType1 = typeSystemCommonBackendContext0.getPrimitiveArrayType(typeConstructorMarker0);
        if(primitiveType1 != null) {
            return jvmTypeFactory0.createFromString("[" + JvmPrimitiveType.get(primitiveType1).getDesc());
        }
        if(typeSystemCommonBackendContext0.isUnderKotlinPackage(typeConstructorMarker0)) {
            FqNameUnsafe fqNameUnsafe0 = typeSystemCommonBackendContext0.getClassFqNameUnsafe(typeConstructorMarker0);
            ClassId classId0 = fqNameUnsafe0 == null ? null : JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe0);
            if(classId0 != null) {
                if(!typeMappingMode0.getKotlinCollectionsToJavaCollections()) {
                    Iterable iterable0 = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                        for(Object object1: iterable0) {
                            if(Intrinsics.areEqual(((PlatformMutabilityMapping)object1).getJavaClass(), classId0)) {
                                return null;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
                String s = JvmClassName.byClassId(classId0).getInternalName();
                Intrinsics.checkNotNullExpressionValue(s, "byClassId(classId).internalName");
                return jvmTypeFactory0.createObjectType(s);
            }
        }
        return null;
    }
}

