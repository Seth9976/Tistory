package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.List;

public final class FontRequest {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;

    public FontRequest(@NonNull String s, @NonNull String s1, @NonNull String s2, @ArrayRes int v) {
        this.a = (String)Preconditions.checkNotNull(s);
        this.b = (String)Preconditions.checkNotNull(s1);
        this.c = (String)Preconditions.checkNotNull(s2);
        this.d = null;
        Preconditions.checkArgument(v != 0);
        this.e = v;
        this.f = s + "-" + s1 + "-" + s2;
    }

    public FontRequest(@NonNull String s, @NonNull String s1, @NonNull String s2, @NonNull List list0) {
        this.a = (String)Preconditions.checkNotNull(s);
        this.b = (String)Preconditions.checkNotNull(s1);
        this.c = (String)Preconditions.checkNotNull(s2);
        this.d = (List)Preconditions.checkNotNull(list0);
        this.e = 0;
        this.f = s + "-" + s1 + "-" + s2;
    }

    @Nullable
    public List getCertificates() {
        return this.d;
    }

    @ArrayRes
    public int getCertificatesArrayResId() {
        return this.e;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String getIdentifier() {
        return this.f;
    }

    @NonNull
    public String getProviderAuthority() {
        return this.a;
    }

    @NonNull
    public String getProviderPackage() {
        return this.b;
    }

    @NonNull
    public String getQuery() {
        return this.c;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for(int v = 0; true; ++v) {
            List list0 = this.d;
            if(v >= list0.size()) {
                break;
            }
            stringBuilder0.append(" [");
            List list1 = (List)list0.get(v);
            for(int v1 = 0; v1 < list1.size(); ++v1) {
                stringBuilder0.append(" \"");
                stringBuilder0.append(Base64.encodeToString(((byte[])list1.get(v1)), 0));
                stringBuilder0.append("\"");
            }
            stringBuilder0.append(" ]");
        }
        stringBuilder0.append("}");
        stringBuilder0.append("mCertificatesArray: " + this.e);
        return stringBuilder0.toString();
    }
}

