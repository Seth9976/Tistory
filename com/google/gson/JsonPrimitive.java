package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class JsonPrimitive extends JsonElement {
    public final Serializable a;

    public JsonPrimitive(Boolean boolean0) {
        Objects.requireNonNull(boolean0);
        this.a = boolean0;
    }

    public JsonPrimitive(Character character0) {
        Objects.requireNonNull(character0);
        this.a = character0.toString();
    }

    public JsonPrimitive(Number number0) {
        Objects.requireNonNull(number0);
        this.a = number0;
    }

    public JsonPrimitive(String s) {
        Objects.requireNonNull(s);
        this.a = s;
    }

    // 去混淆评级： 中等(60)
    public static boolean a(JsonPrimitive jsonPrimitive0) {
        return jsonPrimitive0.a instanceof Number && (((Number)jsonPrimitive0.a) instanceof BigInteger || ((Number)jsonPrimitive0.a) instanceof Long || ((Number)jsonPrimitive0.a) instanceof Integer || ((Number)jsonPrimitive0.a) instanceof Short || ((Number)jsonPrimitive0.a) instanceof Byte);
    }

    @Override  // com.google.gson.JsonElement
    public JsonElement deepCopy() {
        return this;
    }

    public JsonPrimitive deepCopy() [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(JsonPrimitive.class == class0) {
                Serializable serializable0 = this.a;
                Serializable serializable1 = ((JsonPrimitive)object0).a;
                if(serializable0 == null) {
                    return serializable1 == null;
                }
                if(JsonPrimitive.a(this) && JsonPrimitive.a(((JsonPrimitive)object0))) {
                    return this.getAsNumber().longValue() == ((JsonPrimitive)object0).getAsNumber().longValue();
                }
                if(serializable0 instanceof Number && serializable1 instanceof Number) {
                    double f = this.getAsNumber().doubleValue();
                    double f1 = ((JsonPrimitive)object0).getAsNumber().doubleValue();
                    return f == f1 || Double.isNaN(f) && Double.isNaN(f1);
                }
                return serializable0.equals(serializable1);
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return this.a instanceof BigDecimal ? ((BigDecimal)this.a) : new BigDecimal(this.getAsString());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return this.a instanceof BigInteger ? ((BigInteger)this.a) : new BigInteger(this.getAsString());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return this.isBoolean() ? ((Boolean)this.a).booleanValue() : Boolean.parseBoolean(this.getAsString());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public byte getAsByte() {
        return this.isNumber() ? this.getAsNumber().byteValue() : Byte.parseByte(this.getAsString());
    }

    @Override  // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        String s = this.getAsString();
        if(s.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return s.charAt(0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public double getAsDouble() {
        return this.isNumber() ? this.getAsNumber().doubleValue() : Double.parseDouble(this.getAsString());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public float getAsFloat() {
        return this.isNumber() ? this.getAsNumber().floatValue() : Float.parseFloat(this.getAsString());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public int getAsInt() {
        return this.isNumber() ? this.getAsNumber().intValue() : Integer.parseInt(this.getAsString());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public long getAsLong() {
        return this.isNumber() ? this.getAsNumber().longValue() : Long.parseLong(this.getAsString());
    }

    @Override  // com.google.gson.JsonElement
    public Number getAsNumber() {
        Serializable serializable0 = this.a;
        if(serializable0 instanceof Number) {
            return (Number)serializable0;
        }
        if(!(serializable0 instanceof String)) {
            throw new UnsupportedOperationException("Primitive is neither a number nor a string");
        }
        return new LazilyParsedNumber(((String)serializable0));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.JsonElement
    public short getAsShort() {
        return this.isNumber() ? this.getAsNumber().shortValue() : Short.parseShort(this.getAsString());
    }

    @Override  // com.google.gson.JsonElement
    public String getAsString() {
        Serializable serializable0 = this.a;
        if(serializable0 instanceof String) {
            return (String)serializable0;
        }
        if(this.isNumber()) {
            return this.getAsNumber().toString();
        }
        if(!this.isBoolean()) {
            throw new AssertionError("Unexpected value type: " + serializable0.getClass());
        }
        return ((Boolean)serializable0).toString();
    }

    @Override
    public int hashCode() {
        long v;
        Serializable serializable0 = this.a;
        if(serializable0 == null) {
            return 0x1F;
        }
        if(JsonPrimitive.a(this)) {
            v = this.getAsNumber().longValue();
            return (int)(v ^ v >>> 0x20);
        }
        if(serializable0 instanceof Number) {
            v = Double.doubleToLongBits(this.getAsNumber().doubleValue());
            return (int)(v ^ v >>> 0x20);
        }
        return serializable0.hashCode();
    }

    public boolean isBoolean() {
        return this.a instanceof Boolean;
    }

    public boolean isNumber() {
        return this.a instanceof Number;
    }

    public boolean isString() {
        return this.a instanceof String;
    }
}

