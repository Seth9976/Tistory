package com.squareup.moshi;

public final class r extends JsonAdapter {
    public final int a;
    public final JsonAdapter b;

    public r(JsonAdapter jsonAdapter0, int v) {
        this.a = v;
        this.b = jsonAdapter0;
        super();
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final boolean a() {
        return this.b.a();
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        if(this.a != 0) {
            jsonReader0.setFailOnUnknown(true);
            try {
                return this.b.fromJson(jsonReader0);
            }
            finally {
                jsonReader0.setFailOnUnknown(jsonReader0.failOnUnknown());
            }
        }
        return this.b.fromJson(jsonReader0);
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        if(this.a != 0) {
            this.b.toJson(jsonWriter0, object0);
            return;
        }
        jsonWriter0.setSerializeNulls(true);
        try {
            this.b.toJson(jsonWriter0, object0);
        }
        finally {
            jsonWriter0.setSerializeNulls(jsonWriter0.getSerializeNulls());
        }
    }

    @Override
    public final String toString() {
        return this.a == 0 ? this.b + ".serializeNulls()" : this.b + ".failOnUnknown()";
    }
}

