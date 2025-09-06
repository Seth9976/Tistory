package jg;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.c;

public final class g extends c {
    public final JsonObject j;
    public final List k;
    public final int l;
    public int m;

    public g(Json json0, JsonObject jsonObject0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(jsonObject0, "value");
        super(json0, jsonObject0, null, null);
        this.j = jsonObject0;
        List list0 = CollectionsKt___CollectionsKt.toList(jsonObject0.keySet());
        this.k = list0;
        this.l = list0.size() * 2;
        this.m = -1;
    }

    @Override  // kotlinx.serialization.json.internal.c
    public final JsonElement a(String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        return this.m % 2 == 0 ? JsonElementKt.JsonPrimitive(s) : ((JsonElement)x.getValue(this.j, s));
    }

    @Override  // kotlinx.serialization.json.internal.c
    public final JsonElement d() {
        return this.j;
    }

    @Override  // kotlinx.serialization.json.internal.c
    public final int decodeElementIndex(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        int v = this.m;
        if(v < this.l - 1) {
            this.m = v + 1;
            return v + 1;
        }
        return -1;
    }

    @Override  // kotlinx.serialization.json.internal.c
    public final String elementName(SerialDescriptor serialDescriptor0, int v) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
        return (String)this.k.get(v / 2);
    }

    @Override  // kotlinx.serialization.json.internal.c
    public final void endStructure(SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
    }

    @Override  // kotlinx.serialization.json.internal.c
    public final JsonObject f() {
        return this.j;
    }
}

