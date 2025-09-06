package kotlinx.serialization.json;

import ig.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.internal.PolymorphismValidator;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A0\u0010\u0007\u001A\u00020\u00002\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001A$\u0010\f\u001A\u00020\u000B\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\u00002\u0006\u0010\n\u001A\u00028\u0000H\u0086\b¢\u0006\u0004\b\f\u0010\r\u001A$\u0010\u000F\u001A\u00028\u0000\"\u0006\b\u0000\u0010\t\u0018\u0001*\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u000BH\u0086\b¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/json/Json;", "from", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Json", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/Json;", "T", "value", "Lkotlinx/serialization/json/JsonElement;", "encodeToJsonElement", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "json", "decodeFromJsonElement", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class JsonKt {
    @NotNull
    public static final Json Json(@NotNull Json json0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(json0, "from");
        Intrinsics.checkNotNullParameter(function10, "builderAction");
        JsonBuilder jsonBuilder0 = new JsonBuilder(json0);
        function10.invoke(jsonBuilder0);
        JsonConfiguration jsonConfiguration0 = jsonBuilder0.build$kotlinx_serialization_json();
        SerializersModule serializersModule0 = jsonBuilder0.getSerializersModule();
        Intrinsics.checkNotNullParameter(jsonConfiguration0, "configuration");
        Intrinsics.checkNotNullParameter(serializersModule0, "module");
        Json json1 = new d(jsonConfiguration0, serializersModule0, null);  // 初始化器: Lkotlinx/serialization/json/Json;-><init>(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/modules/SerializersModule;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        if(!Intrinsics.areEqual(json1.getSerializersModule(), SerializersModuleBuildersKt.EmptySerializersModule())) {
            json1.getSerializersModule().dumpTo(new PolymorphismValidator(json1.getConfiguration().getUseArrayPolymorphism(), json1.getConfiguration().getClassDiscriminator()));
        }
        return json1;
    }

    public static Json Json$default(Json json0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            json0 = Json.Default;
        }
        return JsonKt.Json(json0, function10);
    }

    public static final Object decodeFromJsonElement(Json json0, JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(jsonElement0, "json");
        Intrinsics.reifiedOperationMarker(6, "T");
        return json0.decodeFromJsonElement(SerializersKt.serializer(json0.getSerializersModule(), null), jsonElement0);
    }

    public static final JsonElement encodeToJsonElement(Json json0, Object object0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.reifiedOperationMarker(6, "T");
        return json0.encodeToJsonElement(SerializersKt.serializer(json0.getSerializersModule(), null), object0);
    }
}

