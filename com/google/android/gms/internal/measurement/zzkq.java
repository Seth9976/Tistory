package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public enum zzkq {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, 0.0f),
    DOUBLE(Double.class, 0.0),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(zzje.class, zzje.zzb),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class a;
    public final Serializable b;

    public zzkq(Class class0, Serializable serializable0) {
        this.a = class0;
        this.b = serializable0;
    }

    public final Class zza() {
        return this.a;
    }
}

