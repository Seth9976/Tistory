package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

public final class FieldInfo.Builder {
    public Field a;
    public FieldType b;
    public int c;
    public Field d;
    public int e;
    public boolean f;
    public boolean g;
    public Object h;
    public EnumVerifier i;
    public Field j;

    public a1 build() {
        Object object0 = this.h;
        if(object0 != null) {
            Field field0 = this.a;
            int v = this.c;
            EnumVerifier internal$EnumVerifier0 = this.i;
            a1.a(v);
            Internal.a(field0, "field");
            return new a1(field0, v, FieldType.MAP, null, 0, false, true, object0, internal$EnumVerifier0, null);
        }
        Field field1 = this.d;
        if(field1 != null) {
            if(this.f) {
                Field field2 = this.a;
                int v1 = this.c;
                FieldType fieldType0 = this.b;
                int v2 = this.e;
                boolean z = this.g;
                EnumVerifier internal$EnumVerifier1 = this.i;
                a1.a(v1);
                Internal.a(field2, "field");
                Internal.a(fieldType0, "fieldType");
                if(v2 == 0 || (v2 - 1 & v2) != 0) {
                    throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + v2);
                }
                return new a1(field2, v1, fieldType0, field1, v2, true, z, null, internal$EnumVerifier1, null);
            }
            Field field3 = this.a;
            int v3 = this.c;
            FieldType fieldType1 = this.b;
            int v4 = this.e;
            boolean z1 = this.g;
            EnumVerifier internal$EnumVerifier2 = this.i;
            a1.a(v3);
            Internal.a(field3, "field");
            Internal.a(fieldType1, "fieldType");
            if(v4 == 0 || (v4 - 1 & v4) != 0) {
                throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + v4);
            }
            return new a1(field3, v3, fieldType1, field1, v4, false, z1, null, internal$EnumVerifier2, null);
        }
        EnumVerifier internal$EnumVerifier3 = this.i;
        if(internal$EnumVerifier3 != null) {
            Field field4 = this.j;
            if(field4 == null) {
                Field field5 = this.a;
                int v5 = this.c;
                FieldType fieldType2 = this.b;
                a1.a(v5);
                Internal.a(field5, "field");
                return new a1(field5, v5, fieldType2, null, 0, false, false, null, internal$EnumVerifier3, null);
            }
            Field field6 = this.a;
            int v6 = this.c;
            FieldType fieldType3 = this.b;
            a1.a(v6);
            Internal.a(field6, "field");
            return new a1(field6, v6, fieldType3, null, 0, false, false, null, internal$EnumVerifier3, field4);
        }
        Field field7 = this.j;
        if(field7 == null) {
            Field field8 = this.a;
            int v7 = this.c;
            FieldType fieldType4 = this.b;
            boolean z2 = this.g;
            a1.a(v7);
            Internal.a(field8, "field");
            Internal.a(fieldType4, "fieldType");
            if(fieldType4 == FieldType.MESSAGE_LIST || fieldType4 == FieldType.GROUP_LIST) {
                throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
            }
            return new a1(field8, v7, fieldType4, null, 0, false, z2, null, null, null);
        }
        Field field9 = this.a;
        int v8 = this.c;
        FieldType fieldType5 = this.b;
        a1.a(v8);
        Internal.a(field9, "field");
        Internal.a(fieldType5, "fieldType");
        if(fieldType5 == FieldType.MESSAGE_LIST || fieldType5 == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
        }
        return new a1(field9, v8, fieldType5, null, 0, false, false, null, null, field7);
    }

    public FieldInfo.Builder withCachedSizeField(Field field0) {
        this.j = field0;
        return this;
    }

    public FieldInfo.Builder withEnforceUtf8(boolean z) {
        this.g = z;
        return this;
    }

    public FieldInfo.Builder withEnumVerifier(EnumVerifier internal$EnumVerifier0) {
        this.i = internal$EnumVerifier0;
        return this;
    }

    public FieldInfo.Builder withField(Field field0) {
        this.a = field0;
        return this;
    }

    public FieldInfo.Builder withFieldNumber(int v) {
        this.c = v;
        return this;
    }

    public FieldInfo.Builder withMapDefaultEntry(Object object0) {
        this.h = object0;
        return this;
    }

    public FieldInfo.Builder withOneof(t2 t20, Class class0) {
        if(this.a != null || this.d != null) {
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }
        return this;
    }

    public FieldInfo.Builder withPresence(Field field0, int v) {
        Internal.a(field0, "presenceField");
        this.d = field0;
        this.e = v;
        return this;
    }

    public FieldInfo.Builder withRequired(boolean z) {
        this.f = z;
        return this;
    }

    public FieldInfo.Builder withType(FieldType fieldType0) {
        this.b = fieldType0;
        return this;
    }
}

