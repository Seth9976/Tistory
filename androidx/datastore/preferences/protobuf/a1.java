package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

public final class a1 implements Comparable {
    public final Field a;
    public final FieldType b;
    public final int c;
    public final Field d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final Field h;
    public final Object i;
    public final EnumVerifier j;

    public a1(Field field0, int v, FieldType fieldType0, Field field1, int v1, boolean z, boolean z1, Object object0, EnumVerifier internal$EnumVerifier0, Field field2) {
        this.a = field0;
        this.b = fieldType0;
        this.c = v;
        this.d = field1;
        this.e = v1;
        this.f = z;
        this.g = z1;
        this.i = object0;
        this.j = internal$EnumVerifier0;
        this.h = field2;
    }

    public static void a(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("fieldNumber must be positive: " + v);
        }
    }

    @Override
    public final int compareTo(Object object0) {
        return this.c - ((a1)object0).c;
    }
}

