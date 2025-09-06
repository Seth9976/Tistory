package jg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

public final class d extends a {
    public final JsonElement e;

    public d(Json json0, JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(jsonElement0, "value");
        super(json0);
        this.e = jsonElement0;
        this.pushTag("primitive");
    }

    @Override  // jg.a
    public final JsonElement a(String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        if(s != "primitive") {
            throw new IllegalArgumentException("This input can only handle primitives with \'primitive\' tag");
        }
        return this.e;
    }

    @Override  // jg.a
    public final JsonElement d() {
        return this.e;
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return 0;
    }
}

