package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder DEFAULT;
    public double a;
    public int b;
    public boolean c;
    public boolean d;
    public List e;
    public List f;

    static {
        Excluder.DEFAULT = new Excluder();
    }

    public Excluder() {
        this.a = -1.0;
        this.b = 0x88;
        this.c = true;
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
    }

    public final boolean a(Class class0) {
        if(Double.compare(this.a, -1.0) != 0) {
            Since since0 = (Since)class0.getAnnotation(Since.class);
            Until until0 = (Until)class0.getAnnotation(Until.class);
            if(since0 != null) {
                double f = since0.value();
                if(this.a >= f) {
                    goto label_6;
                }
                return true;
            }
        label_6:
            if(until0 != null) {
                double f1 = until0.value();
                if(this.a >= f1) {
                    return true;
                }
            }
        }
        return this.c || !class0.isMemberClass() || (class0.getModifiers() & 8) != 0 ? Excluder.c(class0) : true;
    }

    public final boolean b(Class class0, boolean z) {
        for(Object object0: (z ? this.e : this.f)) {
            if(((ExclusionStrategy)object0).shouldSkipClass(class0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    // 去混淆评级： 低(30)
    public static boolean c(Class class0) {
        return !Enum.class.isAssignableFrom(class0) && (class0.getModifiers() & 8) == 0 && (class0.isAnonymousClass() || class0.isLocalClass());
    }

    public Excluder clone() {
        try {
            return (Excluder)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Override  // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(Gson gson0, TypeToken typeToken0) {
        Class class0 = typeToken0.getRawType();
        boolean z = this.a(class0);
        boolean z1 = z || this.b(class0, true);
        boolean z2 = z || this.b(class0, false);
        return !z1 && !z2 ? null : new TypeAdapter() {
            public TypeAdapter a;
            public final Excluder f;

            @Override  // com.google.gson.TypeAdapter
            public final Object read(JsonReader jsonReader0) {
                if(z2) {
                    jsonReader0.skipValue();
                    return null;
                }
                TypeAdapter typeAdapter0 = this.a;
                if(typeAdapter0 == null) {
                    typeAdapter0 = gson0.getDelegateAdapter(Excluder.this, typeToken0);
                    this.a = typeAdapter0;
                }
                return typeAdapter0.read(jsonReader0);
            }

            @Override  // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter0, Object object0) {
                if(z1) {
                    jsonWriter0.nullValue();
                    return;
                }
                TypeAdapter typeAdapter0 = this.a;
                if(typeAdapter0 == null) {
                    typeAdapter0 = gson0.getDelegateAdapter(Excluder.this, typeToken0);
                    this.a = typeAdapter0;
                }
                typeAdapter0.write(jsonWriter0, object0);
            }
        };
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluder0 = this.clone();
        excluder0.c = false;
        return excluder0;
    }

    // 去混淆评级： 低(20)
    public boolean excludeClass(Class class0, boolean z) {
        return this.a(class0) || this.b(class0, z);
    }

    public boolean excludeField(Field field0, boolean z) {
        if((this.b & field0.getModifiers()) != 0) {
            return true;
        }
        if(this.a != -1.0) {
            Since since0 = (Since)field0.getAnnotation(Since.class);
            Until until0 = (Until)field0.getAnnotation(Until.class);
            if(since0 != null) {
                double f = since0.value();
                if(this.a >= f) {
                    goto label_8;
                }
                return true;
            }
        label_8:
            if(until0 != null) {
                double f1 = until0.value();
                if(this.a >= f1) {
                    return true;
                }
            }
        }
        if(field0.isSynthetic()) {
            return true;
        }
        if(this.d) {
            Expose expose0 = (Expose)field0.getAnnotation(Expose.class);
            if(expose0 == null) {
                return true;
            }
            if(z) {
                if(!expose0.serialize()) {
                    return true;
                }
            }
            else if(!expose0.deserialize()) {
                return true;
            }
        }
        if(!this.c) {
            Class class0 = field0.getType();
            if(class0.isMemberClass() && (class0.getModifiers() & 8) == 0) {
                return true;
            }
        }
        if(Excluder.c(field0.getType())) {
            return true;
        }
        List list0 = z ? this.e : this.f;
        if(!list0.isEmpty()) {
            FieldAttributes fieldAttributes0 = new FieldAttributes(field0);
            for(Object object0: list0) {
                if(((ExclusionStrategy)object0).shouldSkipField(fieldAttributes0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluder0 = this.clone();
        excluder0.d = true;
        return excluder0;
    }

    public Excluder withExclusionStrategy(ExclusionStrategy exclusionStrategy0, boolean z, boolean z1) {
        Excluder excluder0 = this.clone();
        if(z) {
            ArrayList arrayList0 = new ArrayList(this.e);
            excluder0.e = arrayList0;
            arrayList0.add(exclusionStrategy0);
        }
        if(z1) {
            ArrayList arrayList1 = new ArrayList(this.f);
            excluder0.f = arrayList1;
            arrayList1.add(exclusionStrategy0);
        }
        return excluder0;
    }

    public Excluder withModifiers(int[] arr_v) {
        Excluder excluder0 = this.clone();
        excluder0.b = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            excluder0.b |= arr_v[v];
        }
        return excluder0;
    }

    public Excluder withVersion(double f) {
        Excluder excluder0 = this.clone();
        excluder0.a = f;
        return excluder0;
    }
}

