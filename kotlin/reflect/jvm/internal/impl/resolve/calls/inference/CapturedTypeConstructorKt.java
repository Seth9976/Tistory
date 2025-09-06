package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import a2.b;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nCapturedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n1549#2:154\n1620#2,3:155\n37#3,2:158\n*S KotlinDebug\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n*L\n125#1:154\n125#1:155,3\n127#1:158,2\n*E\n"})
public final class CapturedTypeConstructorKt {
    public static final TypeProjection a(TypeProjection typeProjection0, TypeParameterDescriptor typeParameterDescriptor0) {
        if(typeParameterDescriptor0 != null && typeProjection0.getProjectionKind() != Variance.INVARIANT) {
            if(typeParameterDescriptor0.getVariance() == typeProjection0.getProjectionKind()) {
                if(typeProjection0.isStarProjection()) {
                    Intrinsics.checkNotNullExpressionValue(LockBasedStorageManager.NO_LOCKS, "NO_LOCKS");
                    b b0 = new b(typeProjection0, 1);
                    return new TypeProjectionImpl(new LazyWrappedType(LockBasedStorageManager.NO_LOCKS, b0));
                }
                return new TypeProjectionImpl(typeProjection0.getType());
            }
            return new TypeProjectionImpl(CapturedTypeConstructorKt.createCapturedType(typeProjection0));
        }
        return typeProjection0;
    }

    @NotNull
    public static final KotlinType createCapturedType(@NotNull TypeProjection typeProjection0) {
        Intrinsics.checkNotNullParameter(typeProjection0, "typeProjection");
        return new CapturedType(typeProjection0, null, false, null, 14, null);
    }

    public static final boolean isCaptured(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "<this>");
        return kotlinType0.getConstructor() instanceof CapturedTypeConstructor;
    }

    @NotNull
    public static final TypeSubstitution wrapWithCapturingSubstitution(@NotNull TypeSubstitution typeSubstitution0, boolean z) {
        Intrinsics.checkNotNullParameter(typeSubstitution0, "<this>");
        if(typeSubstitution0 instanceof IndexedParametersSubstitution) {
            TypeParameterDescriptor[] arr_typeParameterDescriptor = ((IndexedParametersSubstitution)typeSubstitution0).getParameters();
            Iterable iterable0 = ArraysKt___ArraysKt.zip(((IndexedParametersSubstitution)typeSubstitution0).getArguments(), ((IndexedParametersSubstitution)typeSubstitution0).getParameters());
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList0.add(CapturedTypeConstructorKt.a(((TypeProjection)((Pair)object0).getFirst()), ((TypeParameterDescriptor)((Pair)object0).getSecond())));
            }
            return new IndexedParametersSubstitution(arr_typeParameterDescriptor, ((TypeProjection[])arrayList0.toArray(new TypeProjection[0])), z);
        }
        return new DelegatedTypeSubstitution(typeSubstitution0) {
            @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return z;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution
            @Nullable
            public TypeProjection get(@NotNull KotlinType kotlinType0) {
                Intrinsics.checkNotNullParameter(kotlinType0, "key");
                TypeProjection typeProjection0 = super.get(kotlinType0);
                TypeProjection typeProjection1 = null;
                if(typeProjection0 != null) {
                    ClassifierDescriptor classifierDescriptor0 = kotlinType0.getConstructor().getDeclarationDescriptor();
                    if(classifierDescriptor0 instanceof TypeParameterDescriptor) {
                        typeProjection1 = (TypeParameterDescriptor)classifierDescriptor0;
                    }
                    return CapturedTypeConstructorKt.a(typeProjection0, ((TypeParameterDescriptor)typeProjection1));
                }
                return null;
            }
        };
    }

    public static TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return CapturedTypeConstructorKt.wrapWithCapturingSubstitution(typeSubstitution0, z);
    }
}

