package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class JsonObject extends JsonElement {
    public final LinkedTreeMap a;

    public JsonObject() {
        this.a = new LinkedTreeMap(false);
    }

    public void add(String s, JsonElement jsonElement0) {
        if(jsonElement0 == null) {
            jsonElement0 = JsonNull.INSTANCE;
        }
        this.a.put(s, jsonElement0);
    }

    public void addProperty(String s, Boolean boolean0) {
        JsonNull jsonNull0 = boolean0 == null ? JsonNull.INSTANCE : new JsonPrimitive(boolean0);
        this.add(s, jsonNull0);
    }

    public void addProperty(String s, Character character0) {
        JsonNull jsonNull0 = character0 == null ? JsonNull.INSTANCE : new JsonPrimitive(character0);
        this.add(s, jsonNull0);
    }

    public void addProperty(String s, Number number0) {
        JsonNull jsonNull0 = number0 == null ? JsonNull.INSTANCE : new JsonPrimitive(number0);
        this.add(s, jsonNull0);
    }

    public void addProperty(String s, String s1) {
        JsonNull jsonNull0 = s1 == null ? JsonNull.INSTANCE : new JsonPrimitive(s1);
        this.add(s, jsonNull0);
    }

    public Map asMap() {
        return this.a;
    }

    @Override  // com.google.gson.JsonElement
    public JsonElement deepCopy() {
        return this.deepCopy();
    }

    public JsonObject deepCopy() {
        JsonObject jsonObject0 = new JsonObject();
        for(Object object0: this.a.entrySet()) {
            jsonObject0.add(((String)((Map.Entry)object0).getKey()), ((JsonElement)((Map.Entry)object0).getValue()).deepCopy());
        }
        return jsonObject0;
    }

    public Set entrySet() {
        return this.a.entrySet();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof JsonObject && ((JsonObject)object0).a.equals(this.a);
    }

    public JsonElement get(String s) {
        return (JsonElement)this.a.get(s);
    }

    public JsonArray getAsJsonArray(String s) {
        return (JsonArray)this.a.get(s);
    }

    public JsonObject getAsJsonObject(String s) {
        return (JsonObject)this.a.get(s);
    }

    public JsonPrimitive getAsJsonPrimitive(String s) {
        return (JsonPrimitive)this.a.get(s);
    }

    public boolean has(String s) {
        return this.a.containsKey(s);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isEmpty() {
        return this.a.size() == 0;
    }

    public Set keySet() {
        return this.a.keySet();
    }

    public JsonElement remove(String s) {
        return (JsonElement)this.a.remove(s);
    }

    public int size() {
        return this.a.size();
    }
}

