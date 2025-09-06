package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KClassifierImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001A=\u0010\t\u001A\u00020\b*\u00020\u00002\u000E\b\u0002\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\"\u001E\u0010\u000F\u001A\u00020\b*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000E\u001A\u0004\b\u000B\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/KClassifier;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "nullable", "", "annotations", "Lkotlin/reflect/KType;", "createType", "(Lkotlin/reflect/KClassifier;Ljava/util/List;ZLjava/util/List;)Lkotlin/reflect/KType;", "getStarProjectedType", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KType;", "getStarProjectedType$annotations", "(Lkotlin/reflect/KClassifier;)V", "starProjectedType", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "KClassifiers")
@SourceDebugExtension({"SMAP\nKClassifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1559#2:98\n1590#2,4:99\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n*L\n69#1:98\n69#1:99,4\n95#1:103\n95#1:104,3\n*E\n"})
public final class KClassifiers {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[KVariance.values().length];
            try {
                arr_v[KVariance.INVARIANT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KVariance.IN.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KVariance.OUT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final KType createType(@NotNull KClassifier kClassifier0, @NotNull List list0, boolean z, @NotNull List list1) {
        StarProjectionImpl starProjectionImpl0;
        Intrinsics.checkNotNullParameter(kClassifier0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(list1, "annotations");
        KClassifierImpl kClassifierImpl0 = kClassifier0 instanceof KClassifierImpl ? ((KClassifierImpl)kClassifier0) : null;
        if(kClassifierImpl0 != null) {
            ClassifierDescriptor classifierDescriptor0 = kClassifierImpl0.getDescriptor();
            if(classifierDescriptor0 != null) {
                TypeConstructor typeConstructor0 = classifierDescriptor0.getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor0, "descriptor.typeConstructor");
                List list2 = typeConstructor0.getParameters();
                Intrinsics.checkNotNullExpressionValue(list2, "typeConstructor.parameters");
                if(list2.size() != list0.size()) {
                    throw new IllegalArgumentException("Class declares " + list2.size() + " type parameters, but " + list0.size() + " were provided.");
                }
                TypeAttributes typeAttributes0 = list1.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.getEmpty();
                List list3 = typeConstructor0.getParameters();
                Intrinsics.checkNotNullExpressionValue(list3, "typeConstructor.parameters");
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                int v = 0;
                for(Object object0: list0) {
                    if(v < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    KTypeImpl kTypeImpl0 = (KTypeImpl)((KTypeProjection)object0).getType();
                    KotlinType kotlinType0 = kTypeImpl0 == null ? null : kTypeImpl0.getType();
                    KVariance kVariance0 = ((KTypeProjection)object0).getVariance();
                    int v1 = kVariance0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance0.ordinal()];
                    if(v1 == -1) {
                        Object object1 = list3.get(v);
                        Intrinsics.checkNotNullExpressionValue(object1, "parameters[index]");
                        starProjectionImpl0 = new StarProjectionImpl(((TypeParameterDescriptor)object1));
                    }
                    else {
                        switch(v1) {
                            case 1: {
                                Intrinsics.checkNotNull(kotlinType0);
                                starProjectionImpl0 = new TypeProjectionImpl(Variance.INVARIANT, kotlinType0);
                                break;
                            }
                            case 2: {
                                Intrinsics.checkNotNull(kotlinType0);
                                starProjectionImpl0 = new TypeProjectionImpl(Variance.IN_VARIANCE, kotlinType0);
                                break;
                            }
                            default: {
                                if(v1 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Intrinsics.checkNotNull(kotlinType0);
                                starProjectionImpl0 = new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType0);
                                break;
                            }
                        }
                    }
                    arrayList0.add(starProjectionImpl0);
                    ++v;
                }
                return new KTypeImpl(KotlinTypeFactory.simpleType$default(typeAttributes0, typeConstructor0, arrayList0, z, null, 16, null), null, 2, null);
            }
        }
        throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + kClassifier0 + " (" + kClassifier0.getClass() + ')');
    }

    public static KType createType$default(KClassifier kClassifier0, List list0, boolean z, List list1, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        return KClassifiers.createType(kClassifier0, list0, z, list1);
    }

    @NotNull
    public static final KType getStarProjectedType(@NotNull KClassifier kClassifier0) {
        Intrinsics.checkNotNullParameter(kClassifier0, "<this>");
        KClassifierImpl kClassifierImpl0 = kClassifier0 instanceof KClassifierImpl ? ((KClassifierImpl)kClassifier0) : null;
        if(kClassifierImpl0 != null) {
            ClassifierDescriptor classifierDescriptor0 = kClassifierImpl0.getDescriptor();
            if(classifierDescriptor0 != null) {
                List list0 = classifierDescriptor0.getTypeConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(list0, "descriptor.typeConstructor.parameters");
                if(list0.isEmpty()) {
                    return KClassifiers.createType$default(kClassifier0, null, false, null, 7, null);
                }
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    TypeParameterDescriptor typeParameterDescriptor0 = (TypeParameterDescriptor)object0;
                    arrayList0.add(KTypeProjection.Companion.getSTAR());
                }
                return KClassifiers.createType$default(kClassifier0, arrayList0, false, null, 6, null);
            }
        }
        return KClassifiers.createType$default(kClassifier0, null, false, null, 7, null);
    }

    @SinceKotlin(version = "1.1")
    public static void getStarProjectedType$annotations(KClassifier kClassifier0) {
    }
}

