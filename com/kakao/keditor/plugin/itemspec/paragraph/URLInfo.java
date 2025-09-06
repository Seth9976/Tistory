package com.kakao.keditor.plugin.itemspec.paragraph;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/URLInfo;", "", "urlText", "", "linkUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getLinkUrl", "()Ljava/lang/String;", "getUrlText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class URLInfo {
    @NotNull
    private final String linkUrl;
    @NotNull
    private final String urlText;

    public URLInfo(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "urlText");
        Intrinsics.checkNotNullParameter(s1, "linkUrl");
        super();
        this.urlText = s;
        this.linkUrl = s1;
    }

    @NotNull
    public final String component1() {
        return this.urlText;
    }

    @NotNull
    public final String component2() {
        return this.linkUrl;
    }

    @NotNull
    public final URLInfo copy(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "urlText");
        Intrinsics.checkNotNullParameter(s1, "linkUrl");
        return new URLInfo(s, s1);
    }

    public static URLInfo copy$default(URLInfo uRLInfo0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = uRLInfo0.urlText;
        }
        if((v & 2) != 0) {
            s1 = uRLInfo0.linkUrl;
        }
        return uRLInfo0.copy(s, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof URLInfo)) {
            return false;
        }
        return Intrinsics.areEqual(this.urlText, ((URLInfo)object0).urlText) ? Intrinsics.areEqual(this.linkUrl, ((URLInfo)object0).linkUrl) : false;
    }

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    public final String getUrlText() {
        return this.urlText;
    }

    @Override
    public int hashCode() {
        return this.linkUrl.hashCode() + this.urlText.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "URLInfo(urlText=" + this.urlText + ", linkUrl=" + this.linkUrl + ")";
    }
}

