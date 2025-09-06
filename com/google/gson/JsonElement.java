package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonElement {
    public abstract JsonElement deepCopy();

    public BigDecimal getAsBigDecimal() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public BigInteger getAsBigInteger() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean getAsBoolean() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public byte getAsByte() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    @Deprecated
    public char getAsCharacter() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public double getAsDouble() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public float getAsFloat() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public int getAsInt() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    // 去混淆评级： 低(30)
    public JsonArray getAsJsonArray() {
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    // 去混淆评级： 低(30)
    public JsonNull getAsJsonNull() {
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    // 去混淆评级： 低(30)
    public JsonObject getAsJsonObject() {
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    // 去混淆评级： 低(30)
    public JsonPrimitive getAsJsonPrimitive() {
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long getAsLong() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public Number getAsNumber() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public short getAsShort() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String getAsString() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public boolean isJsonArray() [...] // 潜在的解密器

    public boolean isJsonNull() [...] // 潜在的解密器

    public boolean isJsonObject() [...] // 潜在的解密器

    public boolean isJsonPrimitive() [...] // 潜在的解密器

    @Override
    public String toString() {
        try {
            StringWriter stringWriter0 = new StringWriter();
            JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
            jsonWriter0.setLenient(true);
            Streams.write(this, jsonWriter0);
            return stringWriter0.toString();
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

