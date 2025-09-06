package jg;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

public final class h extends e {
    public String h;
    public boolean i;

    @Override  // jg.e
    public final JsonElement a() {
        return new JsonObject(((LinkedHashMap)this.g));
    }

    @Override  // jg.e
    public final void b(String s, JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        if(this.i) {
            if(jsonElement0 instanceof JsonPrimitive) {
                this.h = ((JsonPrimitive)jsonElement0).getContent();
                this.i = false;
                return;
            }
            if(jsonElement0 instanceof JsonObject) {
                throw JsonExceptionsKt.InvalidKeyKindException(JsonObjectSerializer.INSTANCE.getDescriptor());
            }
            if(!(jsonElement0 instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw JsonExceptionsKt.InvalidKeyKindException(JsonArraySerializer.INSTANCE.getDescriptor());
        }
        LinkedHashMap linkedHashMap0 = (LinkedHashMap)this.g;
        String s1 = this.h;
        if(s1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
            s1 = null;
        }
        linkedHashMap0.put(s1, jsonElement0);
        this.i = true;
        return;
    }
}

