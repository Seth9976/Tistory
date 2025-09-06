package com.squareup.moshi;

import java.util.Arrays;

public final class q0 extends JsonAdapter {
    public final Class a;
    public final String[] b;
    public final Enum[] c;
    public final Options d;

    public q0(Class class0) {
        this.a = class0;
        try {
            Enum[] arr_enum = (Enum[])class0.getEnumConstants();
            this.c = arr_enum;
            this.b = new String[arr_enum.length];
            for(int v = 0; true; ++v) {
                Enum[] arr_enum1 = this.c;
                if(v >= arr_enum1.length) {
                    break;
                }
                Enum enum0 = arr_enum1[v];
                Json json0 = (Json)class0.getField(enum0.name()).getAnnotation(Json.class);
                this.b[v] = json0 == null ? enum0.name() : json0.name();
            }
            this.d = Options.of(this.b);
            return;
        }
        catch(NoSuchFieldException noSuchFieldException0) {
        }
        throw new AssertionError("Missing field in " + class0.getName(), noSuchFieldException0);
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        int v = jsonReader0.selectString(this.d);
        if(v != -1) {
            return this.c[v];
        }
        String s = jsonReader0.nextString();
        throw new JsonDataException("Expected one of " + Arrays.asList(this.b) + " but was " + s + " at path " + "$");
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        jsonWriter0.value(this.b[((Enum)object0).ordinal()]);
    }

    @Override
    public final String toString() {
        return "JsonAdapter(" + this.a.getName() + ")";
    }
}

