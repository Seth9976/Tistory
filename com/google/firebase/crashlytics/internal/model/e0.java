package com.google.firebase.crashlytics.internal.model;

import java.util.Arrays;

public final class e0 extends File {
    public final String a;
    public final byte[] b;

    public e0(String s, byte[] arr_b) {
        this.a = s;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof File) {
            String s = ((File)object0).getFilename();
            if(this.a.equals(s)) {
                byte[] arr_b = ((File)object0) instanceof e0 ? ((e0)(((File)object0))).b : ((File)object0).getContents();
                return Arrays.equals(this.b, arr_b);
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File
    public final byte[] getContents() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File
    public final String getFilename() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}

