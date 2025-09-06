package com.google.gson;

import com.google.gson.internal.NonNullElementWrapperList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JsonArray extends JsonElement implements Iterable {
    public final ArrayList a;

    public JsonArray() {
        this.a = new ArrayList();
    }

    public JsonArray(int v) {
        this.a = new ArrayList(v);
    }

    public final JsonElement a() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        if(v != 1) {
            throw new IllegalStateException("Array must have size 1, but has size " + v);
        }
        return (JsonElement)arrayList0.get(0);
    }

    public void add(JsonElement jsonElement0) {
        if(jsonElement0 == null) {
            jsonElement0 = JsonNull.INSTANCE;
        }
        this.a.add(jsonElement0);
    }

    public void add(Boolean boolean0) {
        JsonNull jsonNull0 = boolean0 == null ? JsonNull.INSTANCE : new JsonPrimitive(boolean0);
        this.a.add(jsonNull0);
    }

    public void add(Character character0) {
        JsonNull jsonNull0 = character0 == null ? JsonNull.INSTANCE : new JsonPrimitive(character0);
        this.a.add(jsonNull0);
    }

    public void add(Number number0) {
        JsonNull jsonNull0 = number0 == null ? JsonNull.INSTANCE : new JsonPrimitive(number0);
        this.a.add(jsonNull0);
    }

    public void add(String s) {
        JsonNull jsonNull0 = s == null ? JsonNull.INSTANCE : new JsonPrimitive(s);
        this.a.add(jsonNull0);
    }

    public void addAll(JsonArray jsonArray0) {
        this.a.addAll(jsonArray0.a);
    }

    public List asList() {
        return new NonNullElementWrapperList(this.a);
    }

    public boolean contains(JsonElement jsonElement0) {
        return this.a.contains(jsonElement0);
    }

    public JsonArray deepCopy() {
        ArrayList arrayList0 = this.a;
        if(!arrayList0.isEmpty()) {
            JsonArray jsonArray0 = new JsonArray(arrayList0.size());
            for(Object object0: arrayList0) {
                jsonArray0.add(((JsonElement)object0).deepCopy());
            }
            return jsonArray0;
        }
        return new JsonArray();
    }

    @Override  // com.google.gson.JsonElement
    public JsonElement deepCopy() {
        return this.deepCopy();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof JsonArray && ((JsonArray)object0).a.equals(this.a);
    }

    public JsonElement get(int v) {
        return (JsonElement)this.a.get(v);
    }

    @Override  // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return this.a().getAsBigDecimal();
    }

    @Override  // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return this.a().getAsBigInteger();
    }

    @Override  // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return this.a().getAsBoolean();
    }

    @Override  // com.google.gson.JsonElement
    public byte getAsByte() {
        return this.a().getAsByte();
    }

    @Override  // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        return this.a().getAsCharacter();
    }

    @Override  // com.google.gson.JsonElement
    public double getAsDouble() {
        return this.a().getAsDouble();
    }

    @Override  // com.google.gson.JsonElement
    public float getAsFloat() {
        return this.a().getAsFloat();
    }

    @Override  // com.google.gson.JsonElement
    public int getAsInt() {
        return this.a().getAsInt();
    }

    @Override  // com.google.gson.JsonElement
    public long getAsLong() {
        return this.a().getAsLong();
    }

    @Override  // com.google.gson.JsonElement
    public Number getAsNumber() {
        return this.a().getAsNumber();
    }

    @Override  // com.google.gson.JsonElement
    public short getAsShort() {
        return this.a().getAsShort();
    }

    @Override  // com.google.gson.JsonElement
    public String getAsString() {
        return this.a().getAsString();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }

    public JsonElement remove(int v) {
        return (JsonElement)this.a.remove(v);
    }

    public boolean remove(JsonElement jsonElement0) {
        return this.a.remove(jsonElement0);
    }

    public JsonElement set(int v, JsonElement jsonElement0) {
        if(jsonElement0 == null) {
            jsonElement0 = JsonNull.INSTANCE;
        }
        return (JsonElement)this.a.set(v, jsonElement0);
    }

    public int size() {
        return this.a.size();
    }
}

