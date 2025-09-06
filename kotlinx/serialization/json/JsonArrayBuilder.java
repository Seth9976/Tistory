package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u00020\u00062\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0001¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/json/JsonArrayBuilder;", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "", "add", "(Lkotlinx/serialization/json/JsonElement;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lkotlinx/serialization/json/JsonArray;", "build", "()Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@JsonDslMarker
public final class JsonArrayBuilder {
    public final ArrayList a;

    @PublishedApi
    public JsonArrayBuilder() {
        this.a = new ArrayList();
    }

    public final boolean add(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        this.a.add(jsonElement0);
        return true;
    }

    @ExperimentalSerializationApi
    public final boolean addAll(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.a.addAll(collection0);
    }

    @PublishedApi
    @NotNull
    public final JsonArray build() {
        return new JsonArray(this.a);
    }
}

