package com.google.android.datatransport.cct.internal;

import s6.e;

public final class c extends Builder {
    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final AndroidClientInfo build() {
        return new e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setApplicationBuild(String s) {
        this.l = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setCountry(String s) {
        this.j = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setDevice(String s) {
        this.d = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setFingerprint(String s) {
        this.h = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setHardware(String s) {
        this.c = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setLocale(String s) {
        this.i = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setManufacturer(String s) {
        this.g = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setMccMnc(String s) {
        this.k = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setModel(String s) {
        this.b = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setOsBuild(String s) {
        this.f = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setProduct(String s) {
        this.e = s;
        return this;
    }

    @Override  // com.google.android.datatransport.cct.internal.AndroidClientInfo$Builder
    public final Builder setSdkVersion(Integer integer0) {
        this.a = integer0;
        return this;
    }
}

