package com.google.firebase.crashlytics.internal.model;

import r0.a;

public final class a0 extends CustomAttribute {
    public final String a;
    public final String b;

    public a0(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof CustomAttribute) {
            String s = ((CustomAttribute)object0).getKey();
            if(this.a.equals(s)) {
                String s1 = ((CustomAttribute)object0).getValue();
                return this.b.equals(s1);
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute
    public final String getKey() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute
    public final String getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CustomAttribute{key=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", value=");
        return a.o(stringBuilder0, this.b, "}");
    }
}

