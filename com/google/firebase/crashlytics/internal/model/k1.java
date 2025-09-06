package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class k1 extends User {
    public final String a;

    public k1(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof User) {
            String s = ((User)object0).getIdentifier();
            return this.a.equals(s);
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User
    public final String getIdentifier() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return a.o(new StringBuilder("User{identifier="), this.a, "}");
    }
}

