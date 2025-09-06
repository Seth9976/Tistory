package com.google.firebase.crashlytics.internal.model;

public final class o1 extends OsData {
    public final String a;
    public final String b;
    public final boolean c;

    public o1(String s, String s1, boolean z) {
        if(s == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = s1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof OsData) {
            String s = ((OsData)object0).osRelease();
            if(this.a.equals(s)) {
                String s1 = ((OsData)object0).osCodeName();
                if(this.b.equals(s1)) {
                    boolean z = ((OsData)object0).isRooted();
                    return this.c == z;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c ? ((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ 0x4CF : ((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ 0x4D5;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData
    public final boolean isRooted() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData
    public final String osCodeName() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData
    public final String osRelease() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}

