package com.google.gson;

import a5.b;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class ToNumberPolicy extends Enum implements ToNumberStrategy {
    public static final enum ToNumberPolicy BIG_DECIMAL;
    public static final enum ToNumberPolicy DOUBLE;
    public static final enum ToNumberPolicy LAZILY_PARSED_NUMBER;
    public static final enum ToNumberPolicy LONG_OR_DOUBLE;
    public static final ToNumberPolicy[] a;

    static {
        com.google.gson.ToNumberPolicy.n n0 = new ToNumberPolicy() {
            @Override  // com.google.gson.ToNumberStrategy
            public final Number readNumber(JsonReader jsonReader0) {
                return jsonReader0.nextDouble();
            }
        };
        ToNumberPolicy.DOUBLE = n0;
        com.google.gson.ToNumberPolicy.o o0 = new ToNumberPolicy() {
            @Override  // com.google.gson.ToNumberStrategy
            public final Number readNumber(JsonReader jsonReader0) {
                return new LazilyParsedNumber(jsonReader0.nextString());
            }
        };
        ToNumberPolicy.LAZILY_PARSED_NUMBER = o0;
        com.google.gson.ToNumberPolicy.p p0 = new ToNumberPolicy() {
            @Override  // com.google.gson.ToNumberStrategy
            public final Number readNumber(JsonReader jsonReader0) {
                String s = jsonReader0.nextString();
                try {
                    return Long.parseLong(s);
                }
                catch(NumberFormatException unused_ex) {
                    try {
                        Number number0 = Double.valueOf(s);
                        if((((Double)number0).isInfinite() || ((Double)number0).isNaN()) && !jsonReader0.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + number0 + "; at path " + jsonReader0.getPreviousPath());
                        }
                        return number0;
                    }
                    catch(NumberFormatException numberFormatException0) {
                    }
                    StringBuilder stringBuilder0 = b.v("Cannot parse ", s, "; at path ");
                    stringBuilder0.append(jsonReader0.getPreviousPath());
                    throw new JsonParseException(stringBuilder0.toString(), numberFormatException0);
                }
            }
        };
        ToNumberPolicy.LONG_OR_DOUBLE = p0;
        com.google.gson.ToNumberPolicy.q q0 = new ToNumberPolicy() {
            @Override  // com.google.gson.ToNumberStrategy
            public final Number readNumber(JsonReader jsonReader0) {
                String s = jsonReader0.nextString();
                try {
                    return new BigDecimal(s);
                }
                catch(NumberFormatException numberFormatException0) {
                    StringBuilder stringBuilder0 = b.v("Cannot parse ", s, "; at path ");
                    stringBuilder0.append(jsonReader0.getPreviousPath());
                    throw new JsonParseException(stringBuilder0.toString(), numberFormatException0);
                }
            }
        };
        ToNumberPolicy.BIG_DECIMAL = q0;
        ToNumberPolicy.a = new ToNumberPolicy[]{n0, o0, p0, q0};
    }

    public static ToNumberPolicy valueOf(String s) {
        return (ToNumberPolicy)Enum.valueOf(ToNumberPolicy.class, s);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[])ToNumberPolicy.a.clone();
    }
}

