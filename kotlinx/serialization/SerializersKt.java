package kotlinx.serialization;

import fg.h;
import g.a;
import g.b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"g/a", "g/b"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 0x30)
public final class SerializersKt {
    @PublishedApi
    @NotNull
    public static final KSerializer noCompiledSerializer(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(s));
    }

    @PublishedApi
    @NotNull
    public static final KSerializer noCompiledSerializer(@NotNull SerializersModule serializersModule0, @NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "module");
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        KSerializer kSerializer0 = SerializersModule.getContextual$default(serializersModule0, kClass0, null, 2, null);
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        Platform_commonKt.serializerNotRegistered(kClass0);
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public static final KSerializer noCompiledSerializer(@NotNull SerializersModule serializersModule0, @NotNull KClass kClass0, @NotNull KSerializer[] arr_kSerializer) {
        Intrinsics.checkNotNullParameter(serializersModule0, "module");
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(arr_kSerializer, "argSerializers");
        KSerializer kSerializer0 = serializersModule0.getContextual(kClass0, ArraysKt___ArraysJvmKt.asList(arr_kSerializer));
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        Platform_commonKt.serializerNotRegistered(kClass0);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final KSerializer parametrizedSerializerOrNull(@NotNull KClass kClass0, @NotNull List list0, @NotNull Function0 function00) {
        KSerializer kSerializer0;
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "serializers");
        Intrinsics.checkNotNullParameter(function00, "elementClassifierIfArray");
        if((((Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Collection.class)) ? true : Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(List.class))) ? true : Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(List.class))) ? true : Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(ArrayList.class)))) {
            kSerializer0 = new ArrayListSerializer(((KSerializer)list0.get(0)));
        }
        else if(Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            kSerializer0 = new HashSetSerializer(((KSerializer)list0.get(0)));
        }
        else if(((Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Set.class))) ? true : Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(LinkedHashSet.class)))) {
            kSerializer0 = new LinkedHashSetSerializer(((KSerializer)list0.get(0)));
        }
        else if(Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            kSerializer0 = new HashMapSerializer(((KSerializer)list0.get(0)), ((KSerializer)list0.get(1)));
        }
        else if(((Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Map.class))) ? true : Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(LinkedHashMap.class)))) {
            kSerializer0 = new LinkedHashMapSerializer(((KSerializer)list0.get(0)), ((KSerializer)list0.get(1)));
        }
        else if(Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            kSerializer0 = BuiltinSerializersKt.MapEntrySerializer(((KSerializer)list0.get(0)), ((KSerializer)list0.get(1)));
        }
        else if(Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Pair.class))) {
            kSerializer0 = BuiltinSerializersKt.PairSerializer(((KSerializer)list0.get(0)), ((KSerializer)list0.get(1)));
        }
        else if(Intrinsics.areEqual(kClass0, Reflection.getOrCreateKotlinClass(Triple.class))) {
            kSerializer0 = BuiltinSerializersKt.TripleSerializer(((KSerializer)list0.get(0)), ((KSerializer)list0.get(1)), ((KSerializer)list0.get(2)));
        }
        else if(PlatformKt.isReferenceArray(kClass0)) {
            Object object0 = function00.invoke();
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            kSerializer0 = BuiltinSerializersKt.ArraySerializer(((KClass)object0), ((KSerializer)list0.get(0)));
        }
        else {
            kSerializer0 = null;
        }
        if(kSerializer0 == null) {
            KSerializer[] arr_kSerializer = (KSerializer[])list0.toArray(new KSerializer[0]);
            return PlatformKt.constructSerializerForGivenTypeArgs(kClass0, ((KSerializer[])Arrays.copyOf(arr_kSerializer, arr_kSerializer.length)));
        }
        return kSerializer0;
    }

    public static final KSerializer serializer() {
        Intrinsics.reifiedOperationMarker(6, "T");
        return SerializersKt.serializer(null);
    }

    @NotNull
    public static final KSerializer serializer(@NotNull Type type0) {
        Intrinsics.checkNotNullParameter(type0, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type0);
    }

    @InternalSerializationApi
    @NotNull
    public static final KSerializer serializer(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        KSerializer kSerializer0 = SerializersKt.serializerOrNull(kClass0);
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        Platform_commonKt.serializerNotRegistered(kClass0);
        throw new KotlinNothingValueException();
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer serializer(@NotNull KClass kClass0, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(list0, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass0, list0, z);
    }

    @NotNull
    public static final KSerializer serializer(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kType0);
    }

    public static final KSerializer serializer(SerializersModule serializersModule0) {
        Intrinsics.reifiedOperationMarker(6, "T");
        return SerializersKt.serializer(serializersModule0, null);
    }

    @NotNull
    public static final KSerializer serializer(@NotNull SerializersModule serializersModule0, @NotNull Type type0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(type0, "type");
        KSerializer kSerializer0 = a.X(serializersModule0, type0, true);
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        PlatformKt.serializerNotRegistered(a.Q(type0));
        throw new KotlinNothingValueException();
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer serializer(@NotNull SerializersModule serializersModule0, @NotNull KClass kClass0, @NotNull List list0, boolean z) {
        KSerializer kSerializer1;
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "kClass");
        Intrinsics.checkNotNullParameter(list0, "typeArgumentsSerializers");
        KSerializer kSerializer0 = null;
        if(list0.isEmpty()) {
            kSerializer1 = SerializersKt.serializerOrNull(kClass0);
            if(kSerializer1 == null) {
                kSerializer1 = SerializersModule.getContextual$default(serializersModule0, kClass0, null, 2, null);
            }
        }
        else {
            try {
                KSerializer kSerializer2 = SerializersKt.parametrizedSerializerOrNull(kClass0, list0, h.w);
                kSerializer1 = kSerializer2 == null ? serializersModule0.getContextual(kClass0, list0) : kSerializer2;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", indexOutOfBoundsException0);
            }
        }
        if(kSerializer1 != null) {
            if(z) {
                kSerializer0 = BuiltinSerializersKt.getNullable(kSerializer1);
            }
            else {
                Intrinsics.checkNotNull(kSerializer1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
                kSerializer0 = kSerializer1;
            }
        }
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(kClass0);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final KSerializer serializer(@NotNull SerializersModule serializersModule0, @NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(kType0, "type");
        KSerializer kSerializer0 = b.B(serializersModule0, kType0, true);
        if(kSerializer0 != null) {
            return kSerializer0;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(kType0));
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final KSerializer serializerOrNull(@NotNull Type type0) {
        Intrinsics.checkNotNullParameter(type0, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type0);
    }

    @InternalSerializationApi
    @Nullable
    public static final KSerializer serializerOrNull(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        KSerializer kSerializer0 = PlatformKt.compiledSerializerImpl(kClass0);
        return kSerializer0 == null ? PrimitivesKt.builtinSerializerOrNull(kClass0) : kSerializer0;
    }

    @Nullable
    public static final KSerializer serializerOrNull(@NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), kType0);
    }

    @Nullable
    public static final KSerializer serializerOrNull(@NotNull SerializersModule serializersModule0, @NotNull Type type0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(type0, "type");
        return a.X(serializersModule0, type0, false);
    }

    @Nullable
    public static final KSerializer serializerOrNull(@NotNull SerializersModule serializersModule0, @NotNull KType kType0) {
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(kType0, "type");
        return b.B(serializersModule0, kType0, false);
    }

    @Nullable
    public static final List serializersForParameters(@NotNull SerializersModule serializersModule0, @NotNull List list0, boolean z) {
        ArrayList arrayList0;
        Intrinsics.checkNotNullParameter(serializersModule0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "typeArguments");
        if(z) {
            arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                arrayList0.add(SerializersKt.serializer(serializersModule0, ((KType)object0)));
            }
            return arrayList0;
        }
        arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object1: list0) {
            KSerializer kSerializer0 = SerializersKt.serializerOrNull(serializersModule0, ((KType)object1));
            if(kSerializer0 == null) {
                return null;
            }
            arrayList0.add(kSerializer0);
        }
        return arrayList0;
    }
}

