package com.google.firebase.crashlytics.internal.model;

public final class l1 extends StaticSessionData {
    public final AppData a;
    public final OsData b;
    public final DeviceData c;

    public l1(AppData staticSessionData$AppData0, OsData staticSessionData$OsData0, DeviceData staticSessionData$DeviceData0) {
        if(staticSessionData$AppData0 == null) {
            throw new NullPointerException("Null appData");
        }
        this.a = staticSessionData$AppData0;
        if(staticSessionData$OsData0 == null) {
            throw new NullPointerException("Null osData");
        }
        this.b = staticSessionData$OsData0;
        if(staticSessionData$DeviceData0 == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.c = staticSessionData$DeviceData0;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final AppData appData() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final DeviceData deviceData() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof StaticSessionData) {
            AppData staticSessionData$AppData0 = ((StaticSessionData)object0).appData();
            if(this.a.equals(staticSessionData$AppData0)) {
                OsData staticSessionData$OsData0 = ((StaticSessionData)object0).osData();
                if(this.b.equals(staticSessionData$OsData0)) {
                    DeviceData staticSessionData$DeviceData0 = ((StaticSessionData)object0).deviceData();
                    return this.c.equals(staticSessionData$DeviceData0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override  // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final OsData osData() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}

