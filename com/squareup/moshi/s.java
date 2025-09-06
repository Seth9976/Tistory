package com.squareup.moshi;

public final class s extends JsonAdapter {
    public final JsonAdapter a;

    public s(JsonAdapter jsonAdapter0) {
        this.a = jsonAdapter0;
        super();
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        jsonReader0.setLenient(true);
        try {
            return this.a.fromJson(jsonReader0);
        }
        finally {
            jsonReader0.setLenient(jsonReader0.isLenient());
        }
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        jsonWriter0.setLenient(true);
        try {
            this.a.toJson(jsonWriter0, object0);
        }
        finally {
            jsonWriter0.setLenient(jsonWriter0.isLenient());
        }
    }

    @Override
    public final String toString() {
        return this.a + ".lenient()";
    }
}

