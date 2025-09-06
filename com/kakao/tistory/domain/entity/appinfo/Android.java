package com.kakao.tistory.domain.entity.appinfo;

import a5.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000E\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001A\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/entity/appinfo/Android;", "", "latestVersion", "", "deprecatedVersion", "store", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeprecatedVersion", "()Ljava/lang/String;", "getLatestVersion", "getStore", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Android {
    @SerializedName("deprecated_version")
    @Nullable
    private final String deprecatedVersion;
    @SerializedName("latest_version")
    @Nullable
    private final String latestVersion;
    @Nullable
    private final String store;

    public Android(@Nullable String s, @Nullable String s1, @Nullable String s2) {
        this.latestVersion = s;
        this.deprecatedVersion = s1;
        this.store = s2;
    }

    @Nullable
    public final String component1() {
        return this.latestVersion;
    }

    @Nullable
    public final String component2() {
        return this.deprecatedVersion;
    }

    @Nullable
    public final String component3() {
        return this.store;
    }

    @NotNull
    public final Android copy(@Nullable String s, @Nullable String s1, @Nullable String s2) {
        return new Android(s, s1, s2);
    }

    public static Android copy$default(Android android0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = android0.latestVersion;
        }
        if((v & 2) != 0) {
            s1 = android0.deprecatedVersion;
        }
        if((v & 4) != 0) {
            s2 = android0.store;
        }
        return android0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Android)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.latestVersion, ((Android)object0).latestVersion)) {
            return false;
        }
        return Intrinsics.areEqual(this.deprecatedVersion, ((Android)object0).deprecatedVersion) ? Intrinsics.areEqual(this.store, ((Android)object0).store) : false;
    }

    @Nullable
    public final String getDeprecatedVersion() {
        return this.deprecatedVersion;
    }

    @Nullable
    public final String getLatestVersion() {
        return this.latestVersion;
    }

    @Nullable
    public final String getStore() {
        return this.store;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.latestVersion == null ? 0 : this.latestVersion.hashCode();
        int v2 = this.deprecatedVersion == null ? 0 : this.deprecatedVersion.hashCode();
        String s = this.store;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return a.o(b.w("Android(latestVersion=", this.latestVersion, ", deprecatedVersion=", this.deprecatedVersion, ", store="), this.store, ")");
    }
}

