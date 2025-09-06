package com.squareup.moshi;

import r0.a;

public final class t extends JsonAdapter {
    public final JsonAdapter a;
    public final String b;

    public t(JsonAdapter jsonAdapter0, String s) {
        this.a = jsonAdapter0;
        this.b = s;
        super();
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final boolean a() {
        return this.a.a();
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        return this.a.fromJson(jsonReader0);
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        jsonWriter0.setIndent(this.b);
        try {
            this.a.toJson(jsonWriter0, object0);
        }
        finally {
            jsonWriter0.setIndent("");
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append(".indent(\"");
        return a.o(stringBuilder0, this.b, "\")");
    }
}

