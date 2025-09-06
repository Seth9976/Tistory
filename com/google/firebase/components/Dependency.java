package com.google.firebase.components;

import r0.a;

public final class Dependency {
    public final Class a;
    public final int b;
    public final int c;

    public Dependency(int v, int v1, Class class0) {
        this.a = (Class)Preconditions.checkNotNull(class0, "Null dependency anInterface.");
        this.b = v;
        this.c = v1;
    }

    public static Dependency deferred(Class class0) {
        return new Dependency(0, 2, class0);
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof Dependency && this.a == ((Dependency)object0).a && this.b == ((Dependency)object0).b && this.c == ((Dependency)object0).c;
    }

    public Class getInterface() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    public boolean isDeferred() {
        return this.c == 2;
    }

    public boolean isDirectInjection() {
        return this.c == 0;
    }

    public boolean isRequired() {
        return this.b == 1;
    }

    public boolean isSet() {
        return this.b == 2;
    }

    @Deprecated
    public static Dependency optional(Class class0) {
        return new Dependency(0, 0, class0);
    }

    public static Dependency optionalProvider(Class class0) {
        return new Dependency(0, 1, class0);
    }

    public static Dependency required(Class class0) {
        return new Dependency(1, 0, class0);
    }

    public static Dependency requiredProvider(Class class0) {
        return new Dependency(1, 1, class0);
    }

    public static Dependency setOf(Class class0) {
        return new Dependency(2, 0, class0);
    }

    public static Dependency setOfProvider(Class class0) {
        return new Dependency(2, 1, class0);
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Dependency{anInterface=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", type=");
        int v = this.b;
        if(v == 1) {
            s = "required";
        }
        else {
            s = v == 0 ? "optional" : "set";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", injection=");
        int v1 = this.c;
        switch(v1) {
            case 0: {
                return a.o(stringBuilder0, "direct", "}");
            }
            case 1: {
                return a.o(stringBuilder0, "provider", "}");
            }
            default: {
                if(v1 != 2) {
                    throw new AssertionError("Unsupported injection: " + v1);
                }
                return a.o(stringBuilder0, "deferred", "}");
            }
        }
    }
}

