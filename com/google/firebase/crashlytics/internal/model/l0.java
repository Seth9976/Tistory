package com.google.firebase.crashlytics.internal.model;

public final class l0 extends Builder {
    public Integer a;
    public String b;
    public Integer c;
    public Long d;
    public Long e;
    public Boolean f;
    public Integer g;
    public String h;
    public String i;

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Device build() {
        String s = this.a == null ? " arch" : "";
        if(this.b == null) {
            s = s + " model";
        }
        if(this.c == null) {
            s = s + " cores";
        }
        if(this.d == null) {
            s = s + " ram";
        }
        if(this.e == null) {
            s = s + " diskSpace";
        }
        if(this.f == null) {
            s = s + " simulator";
        }
        if(this.g == null) {
            s = s + " state";
        }
        if(this.h == null) {
            s = s + " manufacturer";
        }
        if(this.i == null) {
            s = s + " modelClass";
        }
        if(!s.isEmpty()) {
            throw new IllegalStateException("Missing required properties:" + s);
        }
        return new m0(((int)this.a), this.b, ((int)this.c), ((long)this.d), ((long)this.e), this.f.booleanValue(), ((int)this.g), this.h, this.i);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setArch(int v) {
        this.a = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setCores(int v) {
        this.c = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setDiskSpace(long v) {
        this.e = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setManufacturer(String s) {
        if(s == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.h = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setModel(String s) {
        if(s == null) {
            throw new NullPointerException("Null model");
        }
        this.b = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setModelClass(String s) {
        if(s == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.i = s;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setRam(long v) {
        this.d = v;
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setSimulator(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder
    public final Builder setState(int v) {
        this.g = v;
        return this;
    }
}

