package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import t8.a;
import u8.b;

public final class c implements ObjectEncoderContext {
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final ObjectEncoder d;
    public final b e;
    public static final Charset f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;
    public static final a i;

    static {
        c.f = Charset.forName("UTF-8");
        c.g = androidx.room.a.e(1, FieldDescriptor.builder("key"));
        c.h = androidx.room.a.e(2, FieldDescriptor.builder("value"));
        c.i = new a(1);
    }

    public c(OutputStream outputStream0, HashMap hashMap0, HashMap hashMap1, ObjectEncoder objectEncoder0) {
        this.e = new b(this);
        this.a = outputStream0;
        this.b = hashMap0;
        this.c = hashMap1;
        this.d = objectEncoder0;
    }

    public final c a(FieldDescriptor fieldDescriptor0, Object object0, boolean z) {
        if(object0 == null) {
            return this;
        }
        if(object0 instanceof CharSequence) {
            if(z && ((CharSequence)object0).length() == 0) {
                return this;
            }
            this.i(c.h(fieldDescriptor0) << 3 | 2);
            byte[] arr_b = ((CharSequence)object0).toString().getBytes(c.f);
            this.i(arr_b.length);
            this.a.write(arr_b);
            return this;
        }
        if(object0 instanceof Collection) {
            for(Object object1: ((Collection)object0)) {
                this.a(fieldDescriptor0, object1, false);
            }
            return this;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                this.f(c.i, fieldDescriptor0, ((Map.Entry)object2), false);
            }
            return this;
        }
        if(object0 instanceof Double) {
            this.b(fieldDescriptor0, ((double)(((Double)object0))), z);
            return this;
        }
        if(object0 instanceof Float) {
            this.c(fieldDescriptor0, ((float)(((Float)object0))), z);
            return this;
        }
        if(object0 instanceof Number) {
            this.e(fieldDescriptor0, ((Number)object0).longValue(), z);
            return this;
        }
        if(object0 instanceof Boolean) {
            this.d(fieldDescriptor0, ((int)((Boolean)object0).booleanValue()), z);
            return this;
        }
        if(object0 instanceof byte[]) {
            if(z && ((byte[])object0).length == 0) {
                return this;
            }
            this.i(c.h(fieldDescriptor0) << 3 | 2);
            this.i(((byte[])object0).length);
            this.a.write(((byte[])object0));
            return this;
        }
        Class class0 = object0.getClass();
        ObjectEncoder objectEncoder0 = (ObjectEncoder)this.b.get(class0);
        if(objectEncoder0 != null) {
            this.f(objectEncoder0, fieldDescriptor0, object0, z);
            return this;
        }
        Class class1 = object0.getClass();
        ValueEncoder valueEncoder0 = (ValueEncoder)this.c.get(class1);
        if(valueEncoder0 != null) {
            this.e.a = false;
            this.e.c = fieldDescriptor0;
            this.e.b = z;
            valueEncoder0.encode(object0, this.e);
            return this;
        }
        if(object0 instanceof ProtoEnum) {
            this.d(fieldDescriptor0, ((ProtoEnum)object0).getNumber(), true);
            return this;
        }
        if(object0 instanceof Enum) {
            this.d(fieldDescriptor0, ((Enum)object0).ordinal(), true);
            return this;
        }
        this.f(this.d, fieldDescriptor0, object0, z);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, double f) {
        this.b(fieldDescriptor0, f, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, float f) {
        this.c(fieldDescriptor0, f, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, int v) {
        this.d(fieldDescriptor0, v, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, long v) {
        this.e(fieldDescriptor0, v, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, Object object0) {
        this.a(fieldDescriptor0, object0, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor0, boolean z) {
        this.d(fieldDescriptor0, ((int)z), true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, double f) {
        this.b(FieldDescriptor.of(s), f, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, int v) {
        this.d(FieldDescriptor.of(s), v, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, long v) {
        this.e(FieldDescriptor.of(s), v, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, Object object0) {
        this.a(FieldDescriptor.of(s), object0, true);
        return this;
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String s, boolean z) {
        this.d(FieldDescriptor.of(s), ((int)z), true);
        return this;
    }

    public final void b(FieldDescriptor fieldDescriptor0, double f, boolean z) {
        if(z && f == 0.0) {
            return;
        }
        this.i(c.h(fieldDescriptor0) << 3 | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(f).array());
    }

    public final void c(FieldDescriptor fieldDescriptor0, float f, boolean z) {
        if(z && f == 0.0f) {
            return;
        }
        this.i(c.h(fieldDescriptor0) << 3 | 5);
        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array());
    }

    public final void d(FieldDescriptor fieldDescriptor0, int v, boolean z) {
        if(z && v == 0) {
            return;
        }
        Protobuf protobuf0 = (Protobuf)fieldDescriptor0.getProperty(Protobuf.class);
        if(protobuf0 == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int v1 = com.google.firebase.encoders.proto.b.a[((com.google.firebase.encoders.proto.a)protobuf0).b.ordinal()];
        int v2 = ((com.google.firebase.encoders.proto.a)protobuf0).a;
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    this.i(v2 << 3);
                    this.i(v << 1 ^ v >> 0x1F);
                    return;
                }
                case 3: {
                    this.i(v2 << 3 | 5);
                    this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array());
                    return;
                }
                default: {
                    return;
                }
            }
        }
        this.i(v2 << 3);
        this.i(v);
    }

    public final void e(FieldDescriptor fieldDescriptor0, long v, boolean z) {
        if(z && v == 0L) {
            return;
        }
        Protobuf protobuf0 = (Protobuf)fieldDescriptor0.getProperty(Protobuf.class);
        if(protobuf0 == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int v1 = com.google.firebase.encoders.proto.b.a[((com.google.firebase.encoders.proto.a)protobuf0).b.ordinal()];
        int v2 = ((com.google.firebase.encoders.proto.a)protobuf0).a;
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    this.i(v2 << 3);
                    this.j(v >> 0x3F ^ v << 1);
                    return;
                }
                case 3: {
                    this.i(v2 << 3 | 1);
                    this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(v).array());
                    return;
                }
                default: {
                    return;
                }
            }
        }
        this.i(v2 << 3);
        this.j(v);
    }

    public final void f(ObjectEncoder objectEncoder0, FieldDescriptor fieldDescriptor0, Object object0, boolean z) {
        long v1;
        try(u8.a a0 = new u8.a()) {  // 初始化器: Ljava/io/OutputStream;-><init>()V
            a0.a = 0L;
            OutputStream outputStream0 = this.a;
            this.a = a0;
            try {
                objectEncoder0.encode(object0, this);
            }
            finally {
                this.a = outputStream0;
            }
        }
        v1 = a0.a;
        if(z && v1 == 0L) {
            return;
        }
        this.i(c.h(fieldDescriptor0) << 3 | 2);
        this.j(v1);
        objectEncoder0.encode(object0, this);
    }

    public final void g(Object object0) {
        if(object0 == null) {
            return;
        }
        Class class0 = object0.getClass();
        ObjectEncoder objectEncoder0 = (ObjectEncoder)this.b.get(class0);
        if(objectEncoder0 == null) {
            throw new EncodingException("No encoder for " + object0.getClass());
        }
        objectEncoder0.encode(object0, this);
    }

    public static int h(FieldDescriptor fieldDescriptor0) {
        Protobuf protobuf0 = (Protobuf)fieldDescriptor0.getProperty(Protobuf.class);
        if(protobuf0 == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        return ((com.google.firebase.encoders.proto.a)protobuf0).a;
    }

    public final void i(int v) {
        while(((long)(v & 0xFFFFFF80)) != 0L) {
            this.a.write(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(v & 0x7F);
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object object0) {
        this.g(object0);
        return this;
    }

    public final void j(long v) {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.a.write(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(((int)v) & 0x7F);
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor0) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override  // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String s) {
        this.nested(FieldDescriptor.of(s));
        throw null;
    }
}

