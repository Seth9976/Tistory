package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A2\u0010\u0000\u001A\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001A2\u0010\u0007\u001A\u00020\b2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0086\b\u00F8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001A\u0019\u0010\n\u001A\u00020\u000B*\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0002\u0010\r\u001A\u0016\u0010\n\u001A\u00020\u000B*\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000EH\u0007\u001A\u0014\u0010\n\u001A\u00020\u000B*\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u000F\u001A\u0014\u0010\n\u001A\u00020\u000B*\u00020\u00042\b\u0010\f\u001A\u0004\u0018\u00010\u0010\u001A!\u0010\u0011\u001A\u00020\u000B*\u00020\u00042\u000E\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0013H\u0007\u00A2\u0006\u0002\b\u0014\u001A!\u0010\u0011\u001A\u00020\u000B*\u00020\u00042\u000E\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F0\u0013H\u0007\u00A2\u0006\u0002\b\u0015\u001A!\u0010\u0011\u001A\u00020\u000B*\u00020\u00042\u000E\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0013H\u0007\u00A2\u0006\u0002\b\u0016\u001A#\u0010\u0017\u001A\u00020\u000B*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006\u001A#\u0010\u0018\u001A\u00020\u000B*\u00020\u00042\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006\u001A#\u0010\u0019\u001A\u0004\u0018\u00010\u001A*\u00020\t2\u0006\u0010\u001B\u001A\u00020\u00102\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0002\u0010\u001C\u001A \u0010\u0019\u001A\u0004\u0018\u00010\u001A*\u00020\t2\u0006\u0010\u001B\u001A\u00020\u00102\b\u0010\f\u001A\u0004\u0018\u00010\u000EH\u0007\u001A\u001E\u0010\u0019\u001A\u0004\u0018\u00010\u001A*\u00020\t2\u0006\u0010\u001B\u001A\u00020\u00102\b\u0010\f\u001A\u0004\u0018\u00010\u000F\u001A\u001E\u0010\u0019\u001A\u0004\u0018\u00010\u001A*\u00020\t2\u0006\u0010\u001B\u001A\u00020\u00102\b\u0010\f\u001A\u0004\u0018\u00010\u0010\u001A-\u0010\u001D\u001A\u0004\u0018\u00010\u001A*\u00020\t2\u0006\u0010\u001B\u001A\u00020\u00102\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006\u001A-\u0010\u001E\u001A\u0004\u0018\u00010\u001A*\u00020\t2\u0006\u0010\u001B\u001A\u00020\u00102\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u001F"}, d2 = {"buildJsonArray", "Lkotlinx/serialization/json/JsonArray;", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonArrayBuilder;", "", "Lkotlin/ExtensionFunctionType;", "buildJsonObject", "Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonObjectBuilder;", "add", "", "value", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/Boolean;)Z", "", "", "", "addAll", "values", "", "addAllBooleans", "addAllNumbers", "addAllStrings", "addJsonArray", "addJsonObject", "put", "Lkotlinx/serialization/json/JsonElement;", "key", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;", "putJsonArray", "putJsonObject", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJsonElementBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n28#1,4:232\n51#1,4:236\n28#1,4:240\n51#1,4:244\n1549#2:248\n1620#2,3:249\n1549#2:252\n1620#2,3:253\n1549#2:256\n1620#2,3:257\n*S KotlinDebug\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n82#1:232,4\n90#1:236,4\n189#1:240,4\n197#1:244,4\n207#1:248\n207#1:249,3\n217#1:252\n217#1:253,3\n227#1:256\n227#1:257,3\n*E\n"})
public final class JsonElementBuildersKt {
    public static final boolean add(@NotNull JsonArrayBuilder jsonArrayBuilder0, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        return jsonArrayBuilder0.add(JsonElementKt.JsonPrimitive(boolean0));
    }

    public static final boolean add(@NotNull JsonArrayBuilder jsonArrayBuilder0, @Nullable Number number0) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        return jsonArrayBuilder0.add(JsonElementKt.JsonPrimitive(number0));
    }

    public static final boolean add(@NotNull JsonArrayBuilder jsonArrayBuilder0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        return jsonArrayBuilder0.add(JsonElementKt.JsonPrimitive(s));
    }

    @ExperimentalSerializationApi
    public static final boolean add(@NotNull JsonArrayBuilder jsonArrayBuilder0, @Nullable Void void0) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        return jsonArrayBuilder0.add(JsonNull.INSTANCE);
    }

    @JvmName(name = "addAllBooleans")
    @ExperimentalSerializationApi
    public static final boolean addAllBooleans(@NotNull JsonArrayBuilder jsonArrayBuilder0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "values");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            arrayList0.add(JsonElementKt.JsonPrimitive(((Boolean)object0)));
        }
        return jsonArrayBuilder0.addAll(arrayList0);
    }

    @JvmName(name = "addAllNumbers")
    @ExperimentalSerializationApi
    public static final boolean addAllNumbers(@NotNull JsonArrayBuilder jsonArrayBuilder0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "values");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            arrayList0.add(JsonElementKt.JsonPrimitive(((Number)object0)));
        }
        return jsonArrayBuilder0.addAll(arrayList0);
    }

    @JvmName(name = "addAllStrings")
    @ExperimentalSerializationApi
    public static final boolean addAllStrings(@NotNull JsonArrayBuilder jsonArrayBuilder0, @NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "values");
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(collection0, 10));
        for(Object object0: collection0) {
            arrayList0.add(JsonElementKt.JsonPrimitive(((String)object0)));
        }
        return jsonArrayBuilder0.addAll(arrayList0);
    }

    public static final boolean addJsonArray(@NotNull JsonArrayBuilder jsonArrayBuilder0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        JsonArrayBuilder jsonArrayBuilder1 = new JsonArrayBuilder();
        function10.invoke(jsonArrayBuilder1);
        return jsonArrayBuilder0.add(jsonArrayBuilder1.build());
    }

    public static final boolean addJsonObject(@NotNull JsonArrayBuilder jsonArrayBuilder0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(jsonArrayBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        JsonObjectBuilder jsonObjectBuilder0 = new JsonObjectBuilder();
        function10.invoke(jsonObjectBuilder0);
        return jsonArrayBuilder0.add(jsonObjectBuilder0.build());
    }

    @NotNull
    public static final JsonArray buildJsonArray(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        JsonArrayBuilder jsonArrayBuilder0 = new JsonArrayBuilder();
        function10.invoke(jsonArrayBuilder0);
        return jsonArrayBuilder0.build();
    }

    @NotNull
    public static final JsonObject buildJsonObject(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        JsonObjectBuilder jsonObjectBuilder0 = new JsonObjectBuilder();
        function10.invoke(jsonObjectBuilder0);
        return jsonObjectBuilder0.build();
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder jsonObjectBuilder0, @NotNull String s, @Nullable Boolean boolean0) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        return jsonObjectBuilder0.put(s, JsonElementKt.JsonPrimitive(boolean0));
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder jsonObjectBuilder0, @NotNull String s, @Nullable Number number0) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        return jsonObjectBuilder0.put(s, JsonElementKt.JsonPrimitive(number0));
    }

    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder jsonObjectBuilder0, @NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        return jsonObjectBuilder0.put(s, JsonElementKt.JsonPrimitive(s1));
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final JsonElement put(@NotNull JsonObjectBuilder jsonObjectBuilder0, @NotNull String s, @Nullable Void void0) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        return jsonObjectBuilder0.put(s, JsonNull.INSTANCE);
    }

    @Nullable
    public static final JsonElement putJsonArray(@NotNull JsonObjectBuilder jsonObjectBuilder0, @NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        JsonArrayBuilder jsonArrayBuilder0 = new JsonArrayBuilder();
        function10.invoke(jsonArrayBuilder0);
        return jsonObjectBuilder0.put(s, jsonArrayBuilder0.build());
    }

    @Nullable
    public static final JsonElement putJsonObject(@NotNull JsonObjectBuilder jsonObjectBuilder0, @NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(jsonObjectBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        JsonObjectBuilder jsonObjectBuilder1 = new JsonObjectBuilder();
        function10.invoke(jsonObjectBuilder1);
        return jsonObjectBuilder0.put(s, jsonObjectBuilder1.build());
    }
}

