package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public class WebMessageCompat {
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING;
    public final WebMessagePortCompat[] a;
    public final String b;
    public final byte[] c;
    public final int d;

    public WebMessageCompat(@Nullable String s) {
        this(s, null);
    }

    public WebMessageCompat(@Nullable String s, @Nullable WebMessagePortCompat[] arr_webMessagePortCompat) {
        this.b = s;
        this.c = null;
        this.a = arr_webMessagePortCompat;
        this.d = 0;
    }

    public WebMessageCompat(@NonNull byte[] arr_b) {
        this(arr_b, null);
    }

    public WebMessageCompat(@NonNull byte[] arr_b, @Nullable WebMessagePortCompat[] arr_webMessagePortCompat) {
        Objects.requireNonNull(arr_b);
        this.c = arr_b;
        this.b = null;
        this.a = arr_webMessagePortCompat;
        this.d = 1;
    }

    public final void a(int v) {
        String s1;
        int v1 = this.d;
        if(v == v1) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder("Wrong data accessor type detected. ");
        String s = "String";
        switch(v1) {
            case 0: {
                s1 = "String";
                break;
            }
            case 1: {
                s1 = "ArrayBuffer";
                break;
            }
            default: {
                s1 = "Unknown";
            }
        }
        stringBuilder0.append(s1);
        stringBuilder0.append(" expected, but got ");
        if(v != 0) {
            s = v == 1 ? "ArrayBuffer" : "Unknown";
        }
        stringBuilder0.append(s);
        throw new IllegalStateException(stringBuilder0.toString());
    }

    @NonNull
    public byte[] getArrayBuffer() {
        this.a(1);
        Objects.requireNonNull(this.c);
        return this.c;
    }

    @Nullable
    public String getData() {
        this.a(0);
        return this.b;
    }

    @Nullable
    public WebMessagePortCompat[] getPorts() {
        return this.a;
    }

    public int getType() {
        return this.d;
    }
}

