package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public enum zznf {
    INT(0),
    LONG(0L),
    FLOAT(0.0f),
    DOUBLE(0.0),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzje.zzb),
    ENUM(null),
    MESSAGE(null);

    public final Serializable a;

    public zznf(Serializable serializable0) {
        this.a = serializable0;
    }
}

