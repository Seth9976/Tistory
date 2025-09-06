package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;

public final class EncodedPayload {
    public final Encoding a;
    public final byte[] b;

    public EncodedPayload(@NonNull Encoding encoding0, @NonNull byte[] arr_b) {
        if(encoding0 == null) {
            throw new NullPointerException("encoding is null");
        }
        if(arr_b == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = encoding0;
        this.b = arr_b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EncodedPayload)) {
            return false;
        }
        return this.a.equals(((EncodedPayload)object0).a) ? Arrays.equals(this.b, ((EncodedPayload)object0).b) : false;
    }

    public byte[] getBytes() {
        return this.b;
    }

    public Encoding getEncoding() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}

