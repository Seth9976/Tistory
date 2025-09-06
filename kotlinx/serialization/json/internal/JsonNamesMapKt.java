package kotlinx.serialization.json.internal;

import j0.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind.ENUM;
import kotlinx.serialization.descriptors.StructureKind.CLASS;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001A\'\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0000\u00A2\u0006\u0004\b\u0006\u0010\u0007\u001A)\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00040\u000B*\u00020\u00012\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\f\u0010\r\u001A#\u0010\u000F\u001A\u00020\u0004*\u00020\u00012\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010\u001A\u001D\u0010\u0011\u001A\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\b\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A#\u0010\u0014\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015\u001A-\u0010\u0017\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00042\b\b\u0002\u0010\u0016\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001Aj\u0010\"\u001A\u00020\u001A*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u00052!\u0010\u001D\u001A\u001D\u0012\u0013\u0012\u00110\u001A\u00A2\u0006\f\b\u001B\u0012\b\b\u0013\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u001A0\u00192\u000E\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001E2\u000E\b\u0002\u0010!\u001A\b\u0012\u0004\u0012\u00020 0\u001EH\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#\",\u0010)\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030$8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"&\u0010,\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B0$8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b*\u0010&\u001A\u0004\b+\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006-"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "", "deserializationNamesMap", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", "json", "Lkotlinx/serialization/json/JsonNamingStrategy;", "strategy", "", "serializationNamesIndices", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonNamingStrategy;)[Ljava/lang/String;", "index", "getJsonElementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;I)Ljava/lang/String;", "namingStrategy", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/JsonNamingStrategy;", "name", "getJsonNameIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;)I", "suffix", "getJsonNameIndexOrThrow", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;Ljava/lang/String;)I", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "consume", "peekNull", "Lkotlin/Function0;", "peekString", "", "onEnumCoercing", "tryCoerceValue", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "a", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "getJsonDeserializationNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonDeserializationNamesKey", "b", "getJsonSerializationNamesKey", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n800#2,11:138\n13309#3,2:149\n1#4:151\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:138,11\n35#1:149,2\n*E\n"})
public final class JsonNamesMapKt {
    public static final Key a;
    public static final Key b;

    static {
        JsonNamesMapKt.a = new Key();
        JsonNamesMapKt.b = new Key();
    }

    public static final void a(LinkedHashMap linkedHashMap0, SerialDescriptor serialDescriptor0, String s, int v) {
        String s1 = Intrinsics.areEqual(serialDescriptor0.getKind(), ENUM.INSTANCE) ? "enum value" : "property";
        if(linkedHashMap0.containsKey(s)) {
            throw new JsonException("The suggested name \'" + s + "\' for " + s1 + ' ' + serialDescriptor0.getElementName(v) + " is already one of the names for " + s1 + ' ' + serialDescriptor0.getElementName(((Number)x.getValue(linkedHashMap0, s)).intValue()) + " in " + serialDescriptor0);
        }
        linkedHashMap0.put(s, v);
    }

    public static final Map access$buildDeserializationNamesMap(SerialDescriptor serialDescriptor0, Json json0) {
        String s1;
        Map map0 = new LinkedHashMap();
        boolean z = json0.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual(serialDescriptor0.getKind(), ENUM.INSTANCE);
        JsonNamingStrategy jsonNamingStrategy0 = JsonNamesMapKt.namingStrategy(serialDescriptor0, json0);
        int v = serialDescriptor0.getElementsCount();
        for(int v1 = 0; v1 < v; ++v1) {
            Iterable iterable0 = serialDescriptor0.getElementAnnotations(v1);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(object0 instanceof JsonNames) {
                    arrayList0.add(object0);
                }
            }
            JsonNames jsonNames0 = (JsonNames)CollectionsKt___CollectionsKt.singleOrNull(arrayList0);
            if(jsonNames0 != null) {
                String[] arr_s = jsonNames0.names();
                if(arr_s != null) {
                    int v2 = arr_s.length;
                    for(int v3 = 0; v3 < v2; ++v3) {
                        String s = arr_s[v3];
                        if(z) {
                            s = s.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
                        }
                        JsonNamesMapKt.a(((LinkedHashMap)map0), serialDescriptor0, s, v1);
                    }
                }
            }
            if(z) {
                s1 = serialDescriptor0.getElementName(v1).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
            }
            else {
                s1 = jsonNamingStrategy0 == null ? null : jsonNamingStrategy0.serialNameForJson(serialDescriptor0, v1, serialDescriptor0.getElementName(v1));
            }
            if(s1 != null) {
                JsonNamesMapKt.a(((LinkedHashMap)map0), serialDescriptor0, s1, v1);
            }
        }
        return map0.isEmpty() ? x.emptyMap() : map0;
    }

    public static final int b(SerialDescriptor serialDescriptor0, Json json0, String s) {
        Integer integer0 = (Integer)JsonNamesMapKt.deserializationNamesMap(json0, serialDescriptor0).get(s);
        return integer0 == null ? -3 : ((int)integer0);
    }

    @NotNull
    public static final Map deserializationNamesMap(@NotNull Json json0, @NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        DescriptorSchemaCache descriptorSchemaCache0 = JsonSchemaCacheKt.getSchemaCache(json0);
        t1 t10 = new t1(5, serialDescriptor0, json0);
        return (Map)descriptorSchemaCache0.getOrPut(serialDescriptor0, JsonNamesMapKt.a, t10);
    }

    @NotNull
    public static final Key getJsonDeserializationNamesKey() {
        return JsonNamesMapKt.a;
    }

    @NotNull
    public static final String getJsonElementName(@NotNull SerialDescriptor serialDescriptor0, @NotNull Json json0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(json0, "json");
        JsonNamingStrategy jsonNamingStrategy0 = JsonNamesMapKt.namingStrategy(serialDescriptor0, json0);
        return jsonNamingStrategy0 == null ? serialDescriptor0.getElementName(v) : JsonNamesMapKt.serializationNamesIndices(serialDescriptor0, json0, jsonNamingStrategy0)[v];
    }

    public static final int getJsonNameIndex(@NotNull SerialDescriptor serialDescriptor0, @NotNull Json json0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(s, "name");
        if(json0.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual(serialDescriptor0.getKind(), ENUM.INSTANCE)) {
            String s1 = s.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
            return JsonNamesMapKt.b(serialDescriptor0, json0, s1);
        }
        if(JsonNamesMapKt.namingStrategy(serialDescriptor0, json0) != null) {
            return JsonNamesMapKt.b(serialDescriptor0, json0, s);
        }
        int v = serialDescriptor0.getElementIndex(s);
        if(v != -3) {
            return v;
        }
        return json0.getConfiguration().getUseAlternativeNames() ? JsonNamesMapKt.b(serialDescriptor0, json0, s) : -3;
    }

    public static final int getJsonNameIndexOrThrow(@NotNull SerialDescriptor serialDescriptor0, @NotNull Json json0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "suffix");
        int v = JsonNamesMapKt.getJsonNameIndex(serialDescriptor0, json0, s);
        if(v == -3) {
            throw new SerializationException(serialDescriptor0.getSerialName() + " does not contain element with name \'" + s + '\'' + s1);
        }
        return v;
    }

    public static int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor0, Json json0, String s, String s1, int v, Object object0) {
        if((v & 4) != 0) {
            s1 = "";
        }
        return JsonNamesMapKt.getJsonNameIndexOrThrow(serialDescriptor0, json0, s, s1);
    }

    @NotNull
    public static final Key getJsonSerializationNamesKey() {
        return JsonNamesMapKt.b;
    }

    @Nullable
    public static final JsonNamingStrategy namingStrategy(@NotNull SerialDescriptor serialDescriptor0, @NotNull Json json0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(json0, "json");
        return Intrinsics.areEqual(serialDescriptor0.getKind(), CLASS.INSTANCE) ? json0.getConfiguration().getNamingStrategy() : null;
    }

    @NotNull
    public static final String[] serializationNamesIndices(@NotNull SerialDescriptor serialDescriptor0, @NotNull Json json0, @NotNull JsonNamingStrategy jsonNamingStrategy0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(jsonNamingStrategy0, "strategy");
        DescriptorSchemaCache descriptorSchemaCache0 = JsonSchemaCacheKt.getSchemaCache(json0);
        t1 t10 = new t1(6, serialDescriptor0, jsonNamingStrategy0);
        return (String[])descriptorSchemaCache0.getOrPut(serialDescriptor0, JsonNamesMapKt.b, t10);
    }

    public static final boolean tryCoerceValue(@NotNull Json json0, @NotNull SerialDescriptor serialDescriptor0, int v, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(function10, "peekNull");
        Intrinsics.checkNotNullParameter(function00, "peekString");
        Intrinsics.checkNotNullParameter(function01, "onEnumCoercing");
        if(!serialDescriptor0.isElementOptional(v)) {
            return false;
        }
        SerialDescriptor serialDescriptor1 = serialDescriptor0.getElementDescriptor(v);
        if(!serialDescriptor1.isNullable() && ((Boolean)function10.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if(!Intrinsics.areEqual(serialDescriptor1.getKind(), ENUM.INSTANCE) || serialDescriptor1.isNullable() && ((Boolean)function10.invoke(Boolean.FALSE)).booleanValue()) {
            return false;
        }
        String s = (String)function00.invoke();
        if(s == null) {
            return false;
        }
        if(JsonNamesMapKt.getJsonNameIndex(serialDescriptor1, json0, s) == -3) {
            function01.invoke();
            return true;
        }
        return false;
    }

    public static boolean tryCoerceValue$default(Json json0, SerialDescriptor serialDescriptor0, int v, Function1 function10, Function0 function00, Function0 function01, int v1, Object object0) {
        if((v1 & 16) != 0) {
            function01 = kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        Intrinsics.checkNotNullParameter(function10, "peekNull");
        Intrinsics.checkNotNullParameter(function00, "peekString");
        Intrinsics.checkNotNullParameter(function01, "onEnumCoercing");
        if(!serialDescriptor0.isElementOptional(v)) {
            return false;
        }
        SerialDescriptor serialDescriptor1 = serialDescriptor0.getElementDescriptor(v);
        if(!serialDescriptor1.isNullable() && ((Boolean)function10.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if(!Intrinsics.areEqual(serialDescriptor1.getKind(), ENUM.INSTANCE) || serialDescriptor1.isNullable() && ((Boolean)function10.invoke(Boolean.FALSE)).booleanValue()) {
            return false;
        }
        String s = (String)function00.invoke();
        if(s == null) {
            return false;
        }
        if(JsonNamesMapKt.getJsonNameIndex(serialDescriptor1, json0, s) == -3) {
            function01.invoke();
            return true;
        }
        return false;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt$tryCoerceValue$1\n*L\n1#1,137:1\n*E\n"})
        public final class kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1 extends Lambda implements Function0 {
            public static final kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1 INSTANCE;

            static {
                kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1.INSTANCE = new kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1();
            }

            public kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return Unit.INSTANCE;
            }

            public final void invoke() {
            }
        }

    }
}

