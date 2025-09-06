package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

public final class a extends CrashlyticsReportWithSessionId {
    public final CrashlyticsReport a;
    public final String b;
    public final File c;

    public a(CrashlyticsReport crashlyticsReport0, String s, File file0) {
        if(crashlyticsReport0 == null) {
            throw new NullPointerException("Null report");
        }
        this.a = crashlyticsReport0;
        if(s == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = s;
        if(file0 == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof CrashlyticsReportWithSessionId) {
            CrashlyticsReport crashlyticsReport0 = ((CrashlyticsReportWithSessionId)object0).getReport();
            if(this.a.equals(crashlyticsReport0)) {
                String s = ((CrashlyticsReportWithSessionId)object0).getSessionId();
                if(this.b.equals(s)) {
                    File file0 = ((CrashlyticsReportWithSessionId)object0).getReportFile();
                    return this.c.equals(file0);
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final CrashlyticsReport getReport() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final File getReportFile() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final String getSessionId() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}

