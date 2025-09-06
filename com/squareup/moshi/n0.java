package com.squareup.moshi;

public final class n0 extends JsonAdapter {
    public final int a;

    public n0(int v) {
        this.a = v;
        super();
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        switch(this.a) {
            case 0: {
                return jsonReader0.nextString();
            }
            case 1: {
                return Boolean.valueOf(jsonReader0.nextBoolean());
            }
            case 2: {
                return (byte)s0.a(jsonReader0, "a byte", 0xFFFFFF80, 0xFF);
            }
            case 3: {
                String s = jsonReader0.nextString();
                if(s.length() > 1) {
                    throw new JsonDataException("Expected a char but was " + ("\"" + s + '\"') + " at path " + "$");
                }
                return Character.valueOf(s.charAt(0));
            }
            case 4: {
                return jsonReader0.nextDouble();
            }
            case 5: {
                float f = (float)jsonReader0.nextDouble();
                if(!jsonReader0.isLenient() && Float.isInfinite(f)) {
                    throw new JsonDataException("JSON forbids NaN and infinities: " + f + " at path " + "$");
                }
                return f;
            }
            case 6: {
                return jsonReader0.nextInt();
            }
            case 7: {
                return jsonReader0.nextLong();
            }
            default: {
                return (short)s0.a(jsonReader0, "a short", 0xFFFF8000, 0x7FFF);
            }
        }
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        switch(this.a) {
            case 0: {
                jsonWriter0.value(((String)object0));
                return;
            }
            case 1: {
                jsonWriter0.value(((Boolean)object0).booleanValue());
                return;
            }
            case 2: {
                jsonWriter0.value(((long)(((Byte)object0).intValue() & 0xFF)));
                return;
            }
            case 3: {
                jsonWriter0.value(((Character)object0).toString());
                return;
            }
            case 4: {
                jsonWriter0.value(((double)(((Double)object0))));
                return;
            }
            case 5: {
                ((Float)object0).getClass();
                jsonWriter0.value(((Float)object0));
                return;
            }
            case 6: {
                jsonWriter0.value(((long)(((int)(((Integer)object0))))));
                return;
            }
            case 7: {
                jsonWriter0.value(((long)(((Long)object0))));
                return;
            }
            default: {
                jsonWriter0.value(((long)((Short)object0).intValue()));
            }
        }
    }

    @Override
    public final String toString() {
        switch(this.a) {
            case 0: {
                return "JsonAdapter(String)";
            }
            case 1: {
                return "JsonAdapter(Boolean)";
            }
            case 2: {
                return "JsonAdapter(Byte)";
            }
            case 3: {
                return "JsonAdapter(Character)";
            }
            case 4: {
                return "JsonAdapter(Double)";
            }
            case 5: {
                return "JsonAdapter(Float)";
            }
            case 6: {
                return "JsonAdapter(Integer)";
            }
            case 7: {
                return "JsonAdapter(Long)";
            }
            default: {
                return "JsonAdapter(Short)";
            }
        }
    }
}

