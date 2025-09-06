package jg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

public final class f extends a {
    public final JsonArray e;
    public final int f;
    public int g;

    public f(Json json0, JsonArray jsonArray0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(jsonArray0, "value");
        super(json0);
        this.e = jsonArray0;
        this.f = jsonArray0.size();
        this.g = -1;
    }

    @Override  // jg.a
    public final JsonElement a(String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        int v = Integer.parseInt(s);
        return this.e.get(v);
    }

    @Override  // jg.a
    public final JsonElement d() {
        return this.e;
    }

    @Override  // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        int v = this.g;
        if(v < this.f - 1) {
            this.g = v + 1;
            return v + 1;
        }
        return -1;
    }

    @Override  // kotlinx.serialization.internal.NamedValueDecoder
    public final String elementName(SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return String.valueOf(v);
    }
}

