package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\b\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0001¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "<init>", "()V", "", "key", "Lkotlinx/serialization/json/JsonElement;", "element", "put", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonObject;", "build", "()Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@JsonDslMarker
public final class JsonObjectBuilder {
    public final LinkedHashMap a;

    @PublishedApi
    public JsonObjectBuilder() {
        this.a = new LinkedHashMap();
    }

    @PublishedApi
    @NotNull
    public final JsonObject build() {
        return new JsonObject(this.a);
    }

    @Nullable
    public final JsonElement put(@NotNull String s, @NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        return (JsonElement)this.a.put(s, jsonElement0);
    }
}

