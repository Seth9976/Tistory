package com.kakao.editortracker.data;

import a5.b;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0015\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003JS\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001J\t\u0010 \u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\fR\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/kakao/editortracker/data/UserAgent;", "", "os", "", "os_version", "browser", "browser_version", "device_type", "device_model", "platform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrowser", "()Ljava/lang/String;", "getBrowser_version", "getDevice_model", "getDevice_type", "getOs", "getOs_version", "getPlatform", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UserAgent {
    @Nullable
    private final String browser;
    @Nullable
    private final String browser_version;
    @NotNull
    private final String device_model;
    @NotNull
    private final String device_type;
    @NotNull
    private final String os;
    @NotNull
    private final String os_version;
    @NotNull
    private final String platform;

    public UserAgent(@NotNull String s, @NotNull String s1, @Nullable String s2, @Nullable String s3, @NotNull String s4, @NotNull String s5, @NotNull String s6) {
        Intrinsics.checkNotNullParameter(s, "os");
        Intrinsics.checkNotNullParameter(s1, "os_version");
        Intrinsics.checkNotNullParameter(s4, "device_type");
        Intrinsics.checkNotNullParameter(s5, "device_model");
        Intrinsics.checkNotNullParameter(s6, "platform");
        super();
        this.os = s;
        this.os_version = s1;
        this.browser = s2;
        this.browser_version = s3;
        this.device_type = s4;
        this.device_model = s5;
        this.platform = s6;
    }

    public UserAgent(String s, String s1, String s2, String s3, String s4, String s5, String s6, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, s1, ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), s4, s5, s6);
    }

    @NotNull
    public final String component1() {
        return this.os;
    }

    @NotNull
    public final String component2() {
        return this.os_version;
    }

    @Nullable
    public final String component3() {
        return this.browser;
    }

    @Nullable
    public final String component4() {
        return this.browser_version;
    }

    @NotNull
    public final String component5() {
        return this.device_type;
    }

    @NotNull
    public final String component6() {
        return this.device_model;
    }

    @NotNull
    public final String component7() {
        return this.platform;
    }

    @NotNull
    public final UserAgent copy(@NotNull String s, @NotNull String s1, @Nullable String s2, @Nullable String s3, @NotNull String s4, @NotNull String s5, @NotNull String s6) {
        Intrinsics.checkNotNullParameter(s, "os");
        Intrinsics.checkNotNullParameter(s1, "os_version");
        Intrinsics.checkNotNullParameter(s4, "device_type");
        Intrinsics.checkNotNullParameter(s5, "device_model");
        Intrinsics.checkNotNullParameter(s6, "platform");
        return new UserAgent(s, s1, s2, s3, s4, s5, s6);
    }

    public static UserAgent copy$default(UserAgent userAgent0, String s, String s1, String s2, String s3, String s4, String s5, String s6, int v, Object object0) {
        if((v & 1) != 0) {
            s = userAgent0.os;
        }
        if((v & 2) != 0) {
            s1 = userAgent0.os_version;
        }
        if((v & 4) != 0) {
            s2 = userAgent0.browser;
        }
        if((v & 8) != 0) {
            s3 = userAgent0.browser_version;
        }
        if((v & 16) != 0) {
            s4 = userAgent0.device_type;
        }
        if((v & 0x20) != 0) {
            s5 = userAgent0.device_model;
        }
        if((v & 0x40) != 0) {
            s6 = userAgent0.platform;
        }
        return userAgent0.copy(s, s1, s2, s3, s4, s5, s6);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UserAgent)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.os, ((UserAgent)object0).os)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.os_version, ((UserAgent)object0).os_version)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.browser, ((UserAgent)object0).browser)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.browser_version, ((UserAgent)object0).browser_version)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.device_type, ((UserAgent)object0).device_type)) {
            return false;
        }
        return Intrinsics.areEqual(this.device_model, ((UserAgent)object0).device_model) ? Intrinsics.areEqual(this.platform, ((UserAgent)object0).platform) : false;
    }

    @Nullable
    public final String getBrowser() {
        return this.browser;
    }

    @Nullable
    public final String getBrowser_version() {
        return this.browser_version;
    }

    @NotNull
    public final String getDevice_model() {
        return this.device_model;
    }

    @NotNull
    public final String getDevice_type() {
        return this.device_type;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOs_version() {
        return this.os_version;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Override
    public int hashCode() {
        int v = q.c(this.os.hashCode() * 0x1F, 0x1F, this.os_version);
        int v1 = 0;
        int v2 = this.browser == null ? 0 : this.browser.hashCode();
        String s = this.browser_version;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.platform.hashCode() + q.c(q.c(((v + v2) * 0x1F + v1) * 0x1F, 0x1F, this.device_type), 0x1F, this.device_model);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("UserAgent(os=", this.os, ", os_version=", this.os_version, ", browser=");
        a.w(stringBuilder0, this.browser, ", browser_version=", this.browser_version, ", device_type=");
        a.w(stringBuilder0, this.device_type, ", device_model=", this.device_model, ", platform=");
        return r0.a.o(stringBuilder0, this.platform, ")");
    }
}

