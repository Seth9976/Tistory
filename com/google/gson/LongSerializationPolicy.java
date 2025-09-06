package com.google.gson;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class LongSerializationPolicy extends Enum {
    public static final enum LongSerializationPolicy DEFAULT;
    public static final enum LongSerializationPolicy STRING;
    public static final LongSerializationPolicy[] a;

    static {
        com.google.gson.LongSerializationPolicy.h h0 = new LongSerializationPolicy() {
            @Override  // com.google.gson.LongSerializationPolicy
            public final JsonElement serialize(Long long0) {
                return long0 == null ? JsonNull.INSTANCE : new JsonPrimitive(long0);
            }
        };
        LongSerializationPolicy.DEFAULT = h0;
        com.google.gson.LongSerializationPolicy.i i0 = new LongSerializationPolicy() {
            @Override  // com.google.gson.LongSerializationPolicy
            public final JsonElement serialize(Long long0) {
                return long0 == null ? JsonNull.INSTANCE : new JsonPrimitive(long0.toString());
            }
        };
        LongSerializationPolicy.STRING = i0;
        LongSerializationPolicy.a = new LongSerializationPolicy[]{h0, i0};
    }

    public abstract JsonElement serialize(Long arg1);

    public static LongSerializationPolicy valueOf(String s) {
        return (LongSerializationPolicy)Enum.valueOf(LongSerializationPolicy.class, s);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[])LongSerializationPolicy.a.clone();
    }
}

