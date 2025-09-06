package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class g1 extends Log {
    public final String a;

    public g1(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof Log) {
            String s = ((Log)object0).getContent();
            return this.a.equals(s);
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log
    public final String getContent() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return a.o(new StringBuilder("Log{content="), this.a, "}");
    }
}

