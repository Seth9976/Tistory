package t8;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class d implements ObjectEncoderContext, ValueEncoderContext {
    public d a;
    public boolean b;
    public final JsonWriter c;
    public final HashMap d;
    public final HashMap e;
    public final ObjectEncoder f;
    public final boolean g;

    public d(Writer writer0, HashMap hashMap0, HashMap hashMap1, ObjectEncoder objectEncoder0, boolean z) {
        this.a = null;
        this.b = true;
        this.c = new JsonWriter(writer0);
        this.d = hashMap0;
        this.e = hashMap1;
        this.f = objectEncoder0;
        this.g = z;
    }

    public d(d d0) {
        this.a = null;
        this.b = true;
        this.c = d0.c;
        this.d = d0.d;
        this.e = d0.e;
        this.f = d0.f;
        this.g = d0.g;
    }

    public final d a(Object object0, String s) {
        JsonWriter jsonWriter0 = this.c;
        if(this.g) {
            if(object0 != null) {
                this.c();
                jsonWriter0.name(s);
                this.b(object0, false);
            }
            return this;
        }
        this.c();
        jsonWriter0.name(s);
        if(object0 == null) {
            jsonWriter0.nullValue();
            return this;
        }
        this.b(object0, false);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, double f) {
        this.c();
        this.c.name(fieldDescriptor0.getName());
        this.c();
        this.c.value(f);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, float f) {
        this.c();
        this.c.name(fieldDescriptor0.getName());
        this.c();
        this.c.value(((double)f));
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, int v) {
        this.c();
        this.c.name(fieldDescriptor0.getName());
        this.c();
        this.c.value(((long)v));
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, long v) {
        this.c();
        this.c.name(fieldDescriptor0.getName());
        this.c();
        this.c.value(v);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, Object object0) {
        return this.a(object0, fieldDescriptor0.getName());
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, boolean z) {
        this.c();
        this.c.name(fieldDescriptor0.getName());
        this.c();
        this.c.value(z);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, double f) {
        this.c();
        this.c.name(s);
        this.c();
        this.c.value(f);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, int v) {
        this.c();
        this.c.name(s);
        this.c();
        this.c.value(((long)v));
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, long v) {
        this.c();
        this.c.name(s);
        this.c();
        this.c.value(v);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, Object object0) {
        return this.a(object0, s);
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, boolean z) {
        this.c();
        this.c.name(s);
        this.c();
        this.c.value(z);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double f) {
        this.c();
        this.c.value(f);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        this.c();
        this.c.value(((double)f));
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int v) {
        this.c();
        this.c.value(((long)v));
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long v) {
        this.c();
        this.c.value(v);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String s) {
        this.c();
        this.c.value(s);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        this.c();
        this.c.value(z);
        return this;
    }

    @Override  // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] arr_b) {
        this.c();
        JsonWriter jsonWriter0 = this.c;
        if(arr_b == null) {
            jsonWriter0.nullValue();
            return this;
        }
        jsonWriter0.value(Base64.encodeToString(arr_b, 2));
        return this;
    }

    public final d b(Object object0, boolean z) {
        if(z && (object0 == null || object0.getClass().isArray() || object0 instanceof Collection || object0 instanceof Date || object0 instanceof Enum || object0 instanceof Number)) {
            throw new EncodingException((object0 == null ? null : object0.getClass()) + " cannot be encoded inline");
        }
        int v = 0;
        JsonWriter jsonWriter0 = this.c;
        if(object0 == null) {
            jsonWriter0.nullValue();
            return this;
        }
        if(object0 instanceof Number) {
            jsonWriter0.value(((Number)object0));
            return this;
        }
        if(object0.getClass().isArray()) {
            if(object0 instanceof byte[]) {
                this.c();
                jsonWriter0.value(Base64.encodeToString(((byte[])object0), 2));
                return this;
            }
            jsonWriter0.beginArray();
            if(object0 instanceof int[]) {
                while(v < ((int[])object0).length) {
                    jsonWriter0.value(((long)((int[])object0)[v]));
                    ++v;
                }
            }
            else if(object0 instanceof long[]) {
                while(v < ((long[])object0).length) {
                    long v1 = ((long[])object0)[v];
                    this.c();
                    jsonWriter0.value(v1);
                    ++v;
                }
            }
            else if(object0 instanceof double[]) {
                while(v < ((double[])object0).length) {
                    jsonWriter0.value(((double[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof boolean[]) {
                while(v < ((boolean[])object0).length) {
                    jsonWriter0.value(((boolean[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof Number[]) {
                for(int v2 = 0; v2 < ((Number[])object0).length; ++v2) {
                    this.b(((Number[])object0)[v2], false);
                }
            }
            else {
                for(int v3 = 0; v3 < ((Object[])object0).length; ++v3) {
                    this.b(((Object[])object0)[v3], false);
                }
            }
            jsonWriter0.endArray();
            return this;
        }
        if(object0 instanceof Collection) {
            jsonWriter0.beginArray();
            for(Object object1: ((Collection)object0)) {
                this.b(object1, false);
            }
            jsonWriter0.endArray();
            return this;
        }
        if(object0 instanceof Map) {
            jsonWriter0.beginObject();
            for(Object object2: ((Map)object0).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                Object object3 = map$Entry0.getKey();
                try {
                    this.a(map$Entry0.getValue(), ((String)object3));
                }
                catch(ClassCastException classCastException0) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", object3, object3.getClass()), classCastException0);
                }
            }
            jsonWriter0.endObject();
            return this;
        }
        Class class0 = object0.getClass();
        ObjectEncoder objectEncoder0 = (ObjectEncoder)this.d.get(class0);
        if(objectEncoder0 != null) {
            if(!z) {
                jsonWriter0.beginObject();
            }
            objectEncoder0.encode(object0, this);
            if(!z) {
                jsonWriter0.endObject();
            }
            return this;
        }
        Class class1 = object0.getClass();
        ValueEncoder valueEncoder0 = (ValueEncoder)this.e.get(class1);
        if(valueEncoder0 != null) {
            valueEncoder0.encode(object0, this);
            return this;
        }
        if(object0 instanceof Enum) {
            this.c();
            jsonWriter0.value(((Enum)object0).name());
            return this;
        }
        if(!z) {
            jsonWriter0.beginObject();
        }
        this.f.encode(object0, this);
        if(!z) {
            jsonWriter0.endObject();
        }
        return this;
    }

    public final void c() {
        if(!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        d d0 = this.a;
        if(d0 != null) {
            d0.c();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object object0) {
        this.b(object0, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor0) {
        return this.nested(fieldDescriptor0.getName());
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String s) {
        this.c();
        this.a = new d(this);
        this.c.name(s);
        this.c.beginObject();
        return this.a;
    }
}

