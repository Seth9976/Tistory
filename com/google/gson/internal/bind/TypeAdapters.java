package com.google.gson.internal.bind;

import a5.b;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    static final class EnumTypeAdapter extends TypeAdapter {
        public final HashMap a;
        public final HashMap b;
        public final HashMap c;

        public EnumTypeAdapter(Class class0) {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            try {
                Field[] arr_field = (Field[])AccessController.doPrivileged(new i(class0));
                for(int v = 0; v < arr_field.length; ++v) {
                    Field field0 = arr_field[v];
                    Enum enum0 = (Enum)field0.get(null);
                    String s = enum0.name();
                    String s1 = enum0.toString();
                    SerializedName serializedName0 = (SerializedName)field0.getAnnotation(SerializedName.class);
                    if(serializedName0 != null) {
                        s = serializedName0.value();
                        String[] arr_s = serializedName0.alternate();
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            this.a.put(arr_s[v1], enum0);
                        }
                    }
                    this.a.put(s, enum0);
                    this.b.put(s1, enum0);
                    this.c.put(enum0, s);
                }
                return;
            }
            catch(IllegalAccessException illegalAccessException0) {
            }
            throw new AssertionError(illegalAccessException0);
        }

        @Override  // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader0) {
            if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.nextNull();
                return null;
            }
            String s = jsonReader0.nextString();
            Enum enum0 = (Enum)this.a.get(s);
            return enum0 == null ? ((Enum)this.b.get(s)) : enum0;
        }

        @Override  // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter0, Object object0) {
            jsonWriter0.value((((Enum)object0) == null ? null : ((String)this.c.get(((Enum)object0)))));
        }
    }

    public static final TypeAdapter ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter ATOMIC_INTEGER;
    public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter BIG_DECIMAL;
    public static final TypeAdapter BIG_INTEGER;
    public static final TypeAdapter BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter BOOLEAN;
    public static final TypeAdapter BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter DOUBLE;
    public static final TypeAdapterFactory ENUM_FACTORY;
    public static final TypeAdapter FLOAT;
    public static final TypeAdapter INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter LAZILY_PARSED_NUMBER;
    public static final TypeAdapter LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter LONG;
    public static final TypeAdapter SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter STRING;
    public static final TypeAdapter STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapter URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    static {
        TypeAdapter typeAdapter0 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class)object0).getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        TypeAdapters.CLASS = typeAdapter0;
        TypeAdapters.CLASS_FACTORY = TypeAdapters.newFactory(Class.class, typeAdapter0);
        TypeAdapter typeAdapter1 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                BitSet bitSet0 = new BitSet();
                jsonReader0.beginArray();
                JsonToken jsonToken0 = jsonReader0.peek();
                int v = 0;
                while(jsonToken0 != JsonToken.END_ARRAY) {
                    boolean z = true;
                    switch(h.a[jsonToken0.ordinal()]) {
                        case 1: 
                        case 2: {
                            int v1 = jsonReader0.nextInt();
                            if(v1 == 0) {
                                z = false;
                            }
                            else if(v1 != 1) {
                                StringBuilder stringBuilder0 = b.s(v1, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                stringBuilder0.append(jsonReader0.getPreviousPath());
                                throw new JsonSyntaxException(stringBuilder0.toString());
                            }
                            break;
                        }
                        case 3: {
                            z = jsonReader0.nextBoolean();
                            break;
                        }
                        default: {
                            throw new JsonSyntaxException("Invalid bitset value type: " + jsonToken0 + "; at path " + jsonReader0.getPath());
                        }
                    }
                    if(z) {
                        bitSet0.set(v);
                    }
                    ++v;
                    jsonToken0 = jsonReader0.peek();
                }
                jsonReader0.endArray();
                return bitSet0;
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.beginArray();
                int v = ((BitSet)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    jsonWriter0.value(((long)((BitSet)object0).get(v1)));
                }
                jsonWriter0.endArray();
            }
        }.nullSafe();
        TypeAdapters.BIT_SET = typeAdapter1;
        TypeAdapters.BIT_SET_FACTORY = TypeAdapters.newFactory(BitSet.class, typeAdapter1);
        com.google.gson.internal.bind.TypeAdapters.3 typeAdapters$30 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                JsonToken jsonToken0 = jsonReader0.peek();
                if(jsonToken0 == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return jsonToken0 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader0.nextString())) : Boolean.valueOf(jsonReader0.nextBoolean());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((Boolean)object0));
            }
        };
        TypeAdapters.BOOLEAN = typeAdapters$30;
        TypeAdapters.BOOLEAN_AS_STRING = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader0.nextString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((Boolean)object0) == null ? "null" : ((Boolean)object0).toString()));
            }
        };
        TypeAdapters.BOOLEAN_FACTORY = TypeAdapters.newFactory(Boolean.TYPE, Boolean.class, typeAdapters$30);
        com.google.gson.internal.bind.TypeAdapters.5 typeAdapters$50 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                int v;
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                try {
                    v = jsonReader0.nextInt();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new JsonSyntaxException(numberFormatException0);
                }
                if(v <= 0xFF && v >= 0xFFFFFF80) {
                    return (byte)v;
                }
                StringBuilder stringBuilder0 = b.s(v, "Lossy conversion from ", " to byte; at path ");
                stringBuilder0.append(jsonReader0.getPreviousPath());
                throw new JsonSyntaxException(stringBuilder0.toString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                if(((Number)object0) == null) {
                    jsonWriter0.nullValue();
                    return;
                }
                jsonWriter0.value(((long)((Number)object0).byteValue()));
            }
        };
        TypeAdapters.BYTE = typeAdapters$50;
        TypeAdapters.BYTE_FACTORY = TypeAdapters.newFactory(Byte.TYPE, Byte.class, typeAdapters$50);
        com.google.gson.internal.bind.TypeAdapters.6 typeAdapters$60 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                int v;
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                try {
                    v = jsonReader0.nextInt();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new JsonSyntaxException(numberFormatException0);
                }
                if(v <= 0xFFFF && v >= 0xFFFF8000) {
                    return (short)v;
                }
                StringBuilder stringBuilder0 = b.s(v, "Lossy conversion from ", " to short; at path ");
                stringBuilder0.append(jsonReader0.getPreviousPath());
                throw new JsonSyntaxException(stringBuilder0.toString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                if(((Number)object0) == null) {
                    jsonWriter0.nullValue();
                    return;
                }
                jsonWriter0.value(((long)((Number)object0).shortValue()));
            }
        };
        TypeAdapters.SHORT = typeAdapters$60;
        TypeAdapters.SHORT_FACTORY = TypeAdapters.newFactory(Short.TYPE, Short.class, typeAdapters$60);
        com.google.gson.internal.bind.TypeAdapters.7 typeAdapters$70 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                try {
                    return jsonReader0.nextInt();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new JsonSyntaxException(numberFormatException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                if(((Number)object0) == null) {
                    jsonWriter0.nullValue();
                    return;
                }
                jsonWriter0.value(((long)((Number)object0).intValue()));
            }
        };
        TypeAdapters.INTEGER = typeAdapters$70;
        TypeAdapters.INTEGER_FACTORY = TypeAdapters.newFactory(Integer.TYPE, Integer.class, typeAdapters$70);
        TypeAdapter typeAdapter2 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                try {
                    return new AtomicInteger(jsonReader0.nextInt());
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new JsonSyntaxException(numberFormatException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((long)((AtomicInteger)object0).get()));
            }
        }.nullSafe();
        TypeAdapters.ATOMIC_INTEGER = typeAdapter2;
        TypeAdapters.ATOMIC_INTEGER_FACTORY = TypeAdapters.newFactory(AtomicInteger.class, typeAdapter2);
        TypeAdapter typeAdapter3 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                return new AtomicBoolean(jsonReader0.nextBoolean());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((AtomicBoolean)object0).get());
            }
        }.nullSafe();
        TypeAdapters.ATOMIC_BOOLEAN = typeAdapter3;
        TypeAdapters.ATOMIC_BOOLEAN_FACTORY = TypeAdapters.newFactory(AtomicBoolean.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                ArrayList arrayList0 = new ArrayList();
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    try {
                        arrayList0.add(jsonReader0.nextInt());
                    }
                    catch(NumberFormatException numberFormatException0) {
                        throw new JsonSyntaxException(numberFormatException0);
                    }
                }
                jsonReader0.endArray();
                int v = arrayList0.size();
                AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    atomicIntegerArray0.set(v1, ((int)(((Integer)arrayList0.get(v1)))));
                }
                return atomicIntegerArray0;
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.beginArray();
                int v = ((AtomicIntegerArray)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    jsonWriter0.value(((long)((AtomicIntegerArray)object0).get(v1)));
                }
                jsonWriter0.endArray();
            }
        }.nullSafe();
        TypeAdapters.ATOMIC_INTEGER_ARRAY = typeAdapter4;
        TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY = TypeAdapters.newFactory(AtomicIntegerArray.class, typeAdapter4);
        TypeAdapters.LONG = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                try {
                    return jsonReader0.nextLong();
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new JsonSyntaxException(numberFormatException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                if(((Number)object0) == null) {
                    jsonWriter0.nullValue();
                    return;
                }
                jsonWriter0.value(((Number)object0).longValue());
            }
        };
        TypeAdapters.FLOAT = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return (float)jsonReader0.nextDouble();
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                Number number0 = (Number)object0;
                if(number0 == null) {
                    jsonWriter0.nullValue();
                    return;
                }
                if(!(number0 instanceof Float)) {
                    number0 = number0.floatValue();
                }
                jsonWriter0.value(number0);
            }
        };
        TypeAdapters.DOUBLE = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return jsonReader0.nextDouble();
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                if(((Number)object0) == null) {
                    jsonWriter0.nullValue();
                    return;
                }
                jsonWriter0.value(((Number)object0).doubleValue());
            }
        };
        com.google.gson.internal.bind.TypeAdapters.14 typeAdapters$140 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                String s = jsonReader0.nextString();
                if(s.length() == 1) {
                    return Character.valueOf(s.charAt(0));
                }
                StringBuilder stringBuilder0 = b.v("Expecting character, got: ", s, "; at ");
                stringBuilder0.append(jsonReader0.getPreviousPath());
                throw new JsonSyntaxException(stringBuilder0.toString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((Character)object0) == null ? null : String.valueOf(((Character)object0))));
            }
        };
        TypeAdapters.CHARACTER = typeAdapters$140;
        TypeAdapters.CHARACTER_FACTORY = TypeAdapters.newFactory(Character.TYPE, Character.class, typeAdapters$140);
        com.google.gson.internal.bind.TypeAdapters.15 typeAdapters$150 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                JsonToken jsonToken0 = jsonReader0.peek();
                if(jsonToken0 == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return jsonToken0 == JsonToken.BOOLEAN ? Boolean.toString(jsonReader0.nextBoolean()) : jsonReader0.nextString();
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((String)object0));
            }
        };
        TypeAdapters.STRING = typeAdapters$150;
        TypeAdapters.BIG_DECIMAL = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                String s = jsonReader0.nextString();
                try {
                    return new BigDecimal(s);
                }
                catch(NumberFormatException numberFormatException0) {
                    StringBuilder stringBuilder0 = b.v("Failed parsing \'", s, "\' as BigDecimal; at path ");
                    stringBuilder0.append(jsonReader0.getPreviousPath());
                    throw new JsonSyntaxException(stringBuilder0.toString(), numberFormatException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((BigDecimal)object0));
            }
        };
        TypeAdapters.BIG_INTEGER = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                String s = jsonReader0.nextString();
                try {
                    return new BigInteger(s);
                }
                catch(NumberFormatException numberFormatException0) {
                    StringBuilder stringBuilder0 = b.v("Failed parsing \'", s, "\' as BigInteger; at path ");
                    stringBuilder0.append(jsonReader0.getPreviousPath());
                    throw new JsonSyntaxException(stringBuilder0.toString(), numberFormatException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((BigInteger)object0));
            }
        };
        TypeAdapters.LAZILY_PARSED_NUMBER = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return new LazilyParsedNumber(jsonReader0.nextString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((LazilyParsedNumber)object0));
            }
        };
        TypeAdapters.STRING_FACTORY = TypeAdapters.newFactory(String.class, typeAdapters$150);
        com.google.gson.internal.bind.TypeAdapters.19 typeAdapters$190 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader0.nextString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((StringBuilder)object0) == null ? null : ((StringBuilder)object0).toString()));
            }
        };
        TypeAdapters.STRING_BUILDER = typeAdapters$190;
        TypeAdapters.STRING_BUILDER_FACTORY = TypeAdapters.newFactory(StringBuilder.class, typeAdapters$190);
        com.google.gson.internal.bind.TypeAdapters.20 typeAdapters$200 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader0.nextString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((StringBuffer)object0) == null ? null : ((StringBuffer)object0).toString()));
            }
        };
        TypeAdapters.STRING_BUFFER = typeAdapters$200;
        TypeAdapters.STRING_BUFFER_FACTORY = TypeAdapters.newFactory(StringBuffer.class, typeAdapters$200);
        com.google.gson.internal.bind.TypeAdapters.21 typeAdapters$210 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                String s = jsonReader0.nextString();
                return "null".equals(s) ? null : new URL(s);
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((URL)object0) == null ? null : ((URL)object0).toExternalForm()));
            }
        };
        TypeAdapters.URL = typeAdapters$210;
        TypeAdapters.URL_FACTORY = TypeAdapters.newFactory(URL.class, typeAdapters$210);
        com.google.gson.internal.bind.TypeAdapters.22 typeAdapters$220 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                try {
                    String s = jsonReader0.nextString();
                    return "null".equals(s) ? null : new URI(s);
                }
                catch(URISyntaxException uRISyntaxException0) {
                    throw new JsonIOException(uRISyntaxException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((URI)object0) == null ? null : ((URI)object0).toASCIIString()));
            }
        };
        TypeAdapters.URI = typeAdapters$220;
        TypeAdapters.URI_FACTORY = TypeAdapters.newFactory(URI.class, typeAdapters$220);
        com.google.gson.internal.bind.TypeAdapters.23 typeAdapters$230 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader0.nextString());
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((InetAddress)object0) == null ? null : ((InetAddress)object0).getHostAddress()));
            }
        };
        TypeAdapters.INET_ADDRESS = typeAdapters$230;
        TypeAdapters.INET_ADDRESS_FACTORY = TypeAdapters.newTypeHierarchyFactory(InetAddress.class, typeAdapters$230);
        com.google.gson.internal.bind.TypeAdapters.24 typeAdapters$240 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                String s = jsonReader0.nextString();
                try {
                    return UUID.fromString(s);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    StringBuilder stringBuilder0 = b.v("Failed parsing \'", s, "\' as UUID; at path ");
                    stringBuilder0.append(jsonReader0.getPreviousPath());
                    throw new JsonSyntaxException(stringBuilder0.toString(), illegalArgumentException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((UUID)object0) == null ? null : ((UUID)object0).toString()));
            }
        };
        TypeAdapters.UUID = typeAdapters$240;
        TypeAdapters.UUID_FACTORY = TypeAdapters.newFactory(UUID.class, typeAdapters$240);
        TypeAdapter typeAdapter5 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                String s = jsonReader0.nextString();
                try {
                    return Currency.getInstance(s);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    StringBuilder stringBuilder0 = b.v("Failed parsing \'", s, "\' as Currency; at path ");
                    stringBuilder0.append(jsonReader0.getPreviousPath());
                    throw new JsonSyntaxException(stringBuilder0.toString(), illegalArgumentException0);
                }
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value(((Currency)object0).getCurrencyCode());
            }
        }.nullSafe();
        TypeAdapters.CURRENCY = typeAdapter5;
        TypeAdapters.CURRENCY_FACTORY = TypeAdapters.newFactory(Currency.class, typeAdapter5);
        com.google.gson.internal.bind.TypeAdapters.26 typeAdapters$260 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                jsonReader0.beginObject();
                int v = 0;
                int v1 = 0;
                int v2 = 0;
                int v3 = 0;
                int v4 = 0;
                int v5 = 0;
                while(jsonReader0.peek() != JsonToken.END_OBJECT) {
                    String s = jsonReader0.nextName();
                    int v6 = jsonReader0.nextInt();
                    if("year".equals(s)) {
                        v = v6;
                    }
                    else if("month".equals(s)) {
                        v1 = v6;
                    }
                    else if("dayOfMonth".equals(s)) {
                        v2 = v6;
                    }
                    else if("hourOfDay".equals(s)) {
                        v3 = v6;
                    }
                    else if("minute".equals(s)) {
                        v4 = v6;
                    }
                    else if("second".equals(s)) {
                        v5 = v6;
                    }
                }
                jsonReader0.endObject();
                return new GregorianCalendar(v, v1, v2, v3, v4, v5);
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                if(((Calendar)object0) == null) {
                    jsonWriter0.nullValue();
                    return;
                }
                jsonWriter0.beginObject();
                jsonWriter0.name("year");
                jsonWriter0.value(((long)((Calendar)object0).get(1)));
                jsonWriter0.name("month");
                jsonWriter0.value(((long)((Calendar)object0).get(2)));
                jsonWriter0.name("dayOfMonth");
                jsonWriter0.value(((long)((Calendar)object0).get(5)));
                jsonWriter0.name("hourOfDay");
                jsonWriter0.value(((long)((Calendar)object0).get(11)));
                jsonWriter0.name("minute");
                jsonWriter0.value(((long)((Calendar)object0).get(12)));
                jsonWriter0.name("second");
                jsonWriter0.value(((long)((Calendar)object0).get(13)));
                jsonWriter0.endObject();
            }
        };
        TypeAdapters.CALENDAR = typeAdapters$260;
        TypeAdapters.CALENDAR_FACTORY = TypeAdapters.newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, typeAdapters$260);
        com.google.gson.internal.bind.TypeAdapters.27 typeAdapters$270 = new TypeAdapter() {
            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                String s = null;
                if(jsonReader0.peek() == JsonToken.NULL) {
                    jsonReader0.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer0 = new StringTokenizer(jsonReader0.nextString(), "_");
                String s1 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
                String s2 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
                if(stringTokenizer0.hasMoreElements()) {
                    s = stringTokenizer0.nextToken();
                }
                if(s2 == null && s == null) {
                    return new Locale(s1);
                }
                return s == null ? new Locale(s1, s2) : new Locale(s1, s2, s);
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                jsonWriter0.value((((Locale)object0) == null ? null : ((Locale)object0).toString()));
            }
        };
        TypeAdapters.LOCALE = typeAdapters$270;
        TypeAdapters.LOCALE_FACTORY = TypeAdapters.newFactory(Locale.class, typeAdapters$270);
        com.google.gson.internal.bind.TypeAdapters.28 typeAdapters$280 = new TypeAdapter() {
            public static JsonElement a(JsonReader jsonReader0, JsonToken jsonToken0) {
                switch(h.a[jsonToken0.ordinal()]) {
                    case 1: {
                        return new JsonPrimitive(new LazilyParsedNumber(jsonReader0.nextString()));
                    }
                    case 2: {
                        return new JsonPrimitive(jsonReader0.nextString());
                    }
                    case 3: {
                        return new JsonPrimitive(Boolean.valueOf(jsonReader0.nextBoolean()));
                    }
                    case 6: {
                        jsonReader0.nextNull();
                        return JsonNull.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("Unexpected token: " + jsonToken0);
                    }
                }
            }

            public static JsonElement b(JsonReader jsonReader0, JsonToken jsonToken0) {
                switch(h.a[jsonToken0.ordinal()]) {
                    case 4: {
                        jsonReader0.beginArray();
                        return new JsonArray();
                    }
                    case 5: {
                        jsonReader0.beginObject();
                        return new JsonObject();
                    }
                    default: {
                        return null;
                    }
                }
            }

            // 去混淆评级： 低(40)
            public static void c(JsonElement jsonElement0, JsonWriter jsonWriter0) {
                if(jsonElement0 != null) {
                    throw new IllegalArgumentException("Couldn\'t write " + jsonElement0.getClass());
                }
                jsonWriter0.nullValue();
            }

            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(jsonReader0 instanceof JsonTreeReader) {
                    JsonToken jsonToken0 = ((JsonTreeReader)jsonReader0).peek();
                    if(jsonToken0 == JsonToken.NAME || jsonToken0 == JsonToken.END_ARRAY || jsonToken0 == JsonToken.END_OBJECT || jsonToken0 == JsonToken.END_DOCUMENT) {
                        throw new IllegalStateException("Unexpected " + jsonToken0 + " when reading a JsonElement.");
                    }
                    JsonElement jsonElement0 = (JsonElement)((JsonTreeReader)jsonReader0).t();
                    ((JsonTreeReader)jsonReader0).skipValue();
                    return jsonElement0;
                }
                JsonToken jsonToken1 = jsonReader0.peek();
                JsonElement jsonElement1 = com.google.gson.internal.bind.TypeAdapters.28.b(jsonReader0, jsonToken1);
                if(jsonElement1 == null) {
                    return com.google.gson.internal.bind.TypeAdapters.28.a(jsonReader0, jsonToken1);
                }
                ArrayDeque arrayDeque0 = new ArrayDeque();
                while(true) {
                    if(jsonReader0.hasNext()) {
                        String s = jsonElement1 instanceof JsonObject ? jsonReader0.nextName() : null;
                        JsonToken jsonToken2 = jsonReader0.peek();
                        JsonElement jsonElement2 = com.google.gson.internal.bind.TypeAdapters.28.b(jsonReader0, jsonToken2);
                        boolean z = jsonElement2 != null;
                        if(jsonElement2 == null) {
                            jsonElement2 = com.google.gson.internal.bind.TypeAdapters.28.a(jsonReader0, jsonToken2);
                        }
                        if(jsonElement1 instanceof JsonArray) {
                            ((JsonArray)jsonElement1).add(jsonElement2);
                        }
                        else {
                            ((JsonObject)jsonElement1).add(s, jsonElement2);
                        }
                        if(!z) {
                            continue;
                        }
                        arrayDeque0.addLast(jsonElement1);
                        jsonElement1 = jsonElement2;
                    }
                    else {
                        if(jsonElement1 instanceof JsonArray) {
                            jsonReader0.endArray();
                        }
                        else {
                            jsonReader0.endObject();
                        }
                        if(arrayDeque0.isEmpty()) {
                            break;
                        }
                        jsonElement1 = (JsonElement)arrayDeque0.removeLast();
                    }
                }
                return jsonElement1;
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                com.google.gson.internal.bind.TypeAdapters.28.c(((JsonElement)object0), jsonWriter0);
            }
        };
        TypeAdapters.JSON_ELEMENT = typeAdapters$280;
        TypeAdapters.JSON_ELEMENT_FACTORY = TypeAdapters.newTypeHierarchyFactory(JsonElement.class, typeAdapters$280);
        TypeAdapters.ENUM_FACTORY = new TypeAdapterFactory() {
            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                Class class0 = typeToken0.getRawType();
                if(Enum.class.isAssignableFrom(class0) && class0 != Enum.class) {
                    if(!class0.isEnum()) {
                        class0 = class0.getSuperclass();
                    }
                    return new EnumTypeAdapter(class0);
                }
                return null;
            }
        };
    }

    public static TypeAdapterFactory newFactory(TypeToken typeToken0, TypeAdapter typeAdapter0) {
        return new TypeAdapterFactory() {
            public final TypeToken a;
            public final TypeAdapter b;

            {
                TypeToken typeToken0 = typeToken0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                TypeAdapter typeAdapter0 = typeAdapter0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = typeToken0;
                this.b = typeAdapter0;
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                return typeToken0.equals(this.a) ? this.b : null;
            }
        };
    }

    public static TypeAdapterFactory newFactory(Class class0, TypeAdapter typeAdapter0) {
        return new TypeAdapterFactory() {
            public final Class a;
            public final TypeAdapter b;

            {
                Class class0 = class0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                TypeAdapter typeAdapter0 = typeAdapter0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = class0;
                this.b = typeAdapter0;
            }

            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                return typeToken0.getRawType() == this.a ? this.b : null;
            }

            @Override
            public final String toString() {
                return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
            }
        };
    }

    public static TypeAdapterFactory newFactory(Class class0, Class class1, TypeAdapter typeAdapter0) {
        return new TypeAdapterFactory() {
            public final Class a;
            public final Class b;
            public final TypeAdapter c;

            {
                Class class0 = class0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Class class1 = class1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                TypeAdapter typeAdapter0 = typeAdapter0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = class0;
                this.b = class1;
                this.c = typeAdapter0;
            }

            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                Class class0 = typeToken0.getRawType();
                return class0 == this.a || class0 == this.b ? this.c : null;
            }

            @Override
            public final String toString() {
                return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
            }
        };
    }

    public static TypeAdapterFactory newFactoryForMultipleTypes(Class class0, Class class1, TypeAdapter typeAdapter0) {
        return new TypeAdapterFactory() {
            public final Class a;
            public final Class b;
            public final TypeAdapter c;

            {
                Class class0 = class0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Class class1 = class1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                TypeAdapter typeAdapter0 = typeAdapter0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = class0;
                this.b = class1;
                this.c = typeAdapter0;
            }

            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                Class class0 = typeToken0.getRawType();
                return class0 == this.a || class0 == this.b ? this.c : null;
            }

            @Override
            public final String toString() {
                return "Factory[type=" + this.a.getName() + "+" + this.b.getName() + ",adapter=" + this.c + "]";
            }
        };
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(Class class0, TypeAdapter typeAdapter0) {
        return new TypeAdapterFactory() {
            public final Class a;
            public final TypeAdapter b;

            {
                Class class0 = class0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                TypeAdapter typeAdapter0 = typeAdapter0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = class0;
                this.b = typeAdapter0;
            }

            @Override  // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson0, TypeToken typeToken0) {
                Class class0 = typeToken0.getRawType();
                return !this.a.isAssignableFrom(class0) ? null : new TypeAdapters.34.1(this, class0);
            }

            @Override
            public final String toString() {
                return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
            }
        };
    }
}

