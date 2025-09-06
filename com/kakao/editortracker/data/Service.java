package com.kakao.editortracker.data;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/kakao/editortracker/data/Service;", "", "key", "", "domain", "referrer", "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "getReferrer", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Service {
    @NotNull
    private final String domain;
    @NotNull
    private final String key;
    @NotNull
    private final String referrer;
    @NotNull
    private final String version;

    public Service(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "domain");
        Intrinsics.checkNotNullParameter(s2, "referrer");
        Intrinsics.checkNotNullParameter(s3, "version");
        super();
        this.key = s;
        this.domain = s1;
        this.referrer = s2;
        this.version = s3;
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final String component2() {
        return this.domain;
    }

    @NotNull
    public final String component3() {
        return this.referrer;
    }

    @NotNull
    public final String component4() {
        return this.version;
    }

    @NotNull
    public final Service copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(s1, "domain");
        Intrinsics.checkNotNullParameter(s2, "referrer");
        Intrinsics.checkNotNullParameter(s3, "version");
        return new Service(s, s1, s2, s3);
    }

    public static Service copy$default(Service service0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = service0.key;
        }
        if((v & 2) != 0) {
            s1 = service0.domain;
        }
        if((v & 4) != 0) {
            s2 = service0.referrer;
        }
        if((v & 8) != 0) {
            s3 = service0.version;
        }
        return service0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Service)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.key, ((Service)object0).key)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.domain, ((Service)object0).domain)) {
            return false;
        }
        return Intrinsics.areEqual(this.referrer, ((Service)object0).referrer) ? Intrinsics.areEqual(this.version, ((Service)object0).version) : false;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getReferrer() {
        return this.referrer;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @Override
    public int hashCode() {
        return this.version.hashCode() + q.c(q.c(this.key.hashCode() * 0x1F, 0x1F, this.domain), 0x1F, this.referrer);
    }

    @Override
    @NotNull
    public String toString() {
        return b.r(b.w("Service(key=", this.key, ", domain=", this.domain, ", referrer="), this.referrer, ", version=", this.version, ")");
    }
}

