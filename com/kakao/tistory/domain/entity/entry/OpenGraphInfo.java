package com.kakao.tistory.domain.entity.entry;

import a5.b;
import androidx.room.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\rJ\u000B\u0010$\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010%\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010&\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\'\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010(\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0011\u0010)\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tH\u00C6\u0003J\u000B\u0010*\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003J\u000B\u0010+\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003Jo\u0010,\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001J\u0013\u0010-\u001A\u00020.2\b\u0010/\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u00100\u001A\u000201H\u00D6\u0001J\t\u00102\u001A\u00020\u0003H\u00D6\u0001R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001C\u0010\f\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000F\"\u0004\b\u0013\u0010\u0011R\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u000F\"\u0004\b\u0015\u0010\u0011R\"\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\u000F\"\u0004\b\u001B\u0010\u0011R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u000F\"\u0004\b\u001D\u0010\u0011R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u000F\"\u0004\b\u001F\u0010\u0011R\u001C\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#\u00A8\u00063"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/OpenGraphInfo;", "", "host", "", "title", "description", "type", "url", "image", "", "video", "Lcom/kakao/tistory/domain/entity/entry/OpenGraphVideoInfo;", "embedUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/kakao/tistory/domain/entity/entry/OpenGraphVideoInfo;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getEmbedUrl", "setEmbedUrl", "getHost", "setHost", "getImage", "()Ljava/util/List;", "setImage", "(Ljava/util/List;)V", "getTitle", "setTitle", "getType", "setType", "getUrl", "setUrl", "getVideo", "()Lcom/kakao/tistory/domain/entity/entry/OpenGraphVideoInfo;", "setVideo", "(Lcom/kakao/tistory/domain/entity/entry/OpenGraphVideoInfo;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OpenGraphInfo {
    @Nullable
    private String description;
    @Nullable
    private String embedUrl;
    @Nullable
    private String host;
    @Nullable
    private List image;
    @Nullable
    private String title;
    @Nullable
    private String type;
    @Nullable
    private String url;
    @Nullable
    private OpenGraphVideoInfo video;

    public OpenGraphInfo() {
        this(null, null, null, null, null, null, null, null, 0xFF, null);
    }

    public OpenGraphInfo(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable List list0, @Nullable OpenGraphVideoInfo openGraphVideoInfo0, @Nullable String s5) {
        this.host = s;
        this.title = s1;
        this.description = s2;
        this.type = s3;
        this.url = s4;
        this.image = list0;
        this.video = openGraphVideoInfo0;
        this.embedUrl = s5;
    }

    public OpenGraphInfo(String s, String s1, String s2, String s3, String s4, List list0, OpenGraphVideoInfo openGraphVideoInfo0, String s5, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? s4 : null), ((v & 0x20) == 0 ? list0 : null), ((v & 0x40) == 0 ? openGraphVideoInfo0 : null), ((v & 0x80) == 0 ? s5 : null));
    }

    @Nullable
    public final String component1() {
        return this.host;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.description;
    }

    @Nullable
    public final String component4() {
        return this.type;
    }

    @Nullable
    public final String component5() {
        return this.url;
    }

    @Nullable
    public final List component6() {
        return this.image;
    }

    @Nullable
    public final OpenGraphVideoInfo component7() {
        return this.video;
    }

    @Nullable
    public final String component8() {
        return this.embedUrl;
    }

    @NotNull
    public final OpenGraphInfo copy(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable List list0, @Nullable OpenGraphVideoInfo openGraphVideoInfo0, @Nullable String s5) {
        return new OpenGraphInfo(s, s1, s2, s3, s4, list0, openGraphVideoInfo0, s5);
    }

    public static OpenGraphInfo copy$default(OpenGraphInfo openGraphInfo0, String s, String s1, String s2, String s3, String s4, List list0, OpenGraphVideoInfo openGraphVideoInfo0, String s5, int v, Object object0) {
        String s6 = (v & 1) == 0 ? s : openGraphInfo0.host;
        String s7 = (v & 2) == 0 ? s1 : openGraphInfo0.title;
        String s8 = (v & 4) == 0 ? s2 : openGraphInfo0.description;
        String s9 = (v & 8) == 0 ? s3 : openGraphInfo0.type;
        String s10 = (v & 16) == 0 ? s4 : openGraphInfo0.url;
        List list1 = (v & 0x20) == 0 ? list0 : openGraphInfo0.image;
        OpenGraphVideoInfo openGraphVideoInfo1 = (v & 0x40) == 0 ? openGraphVideoInfo0 : openGraphInfo0.video;
        return (v & 0x80) == 0 ? openGraphInfo0.copy(s6, s7, s8, s9, s10, list1, openGraphVideoInfo1, s5) : openGraphInfo0.copy(s6, s7, s8, s9, s10, list1, openGraphVideoInfo1, openGraphInfo0.embedUrl);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OpenGraphInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.host, ((OpenGraphInfo)object0).host)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, ((OpenGraphInfo)object0).title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.description, ((OpenGraphInfo)object0).description)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.type, ((OpenGraphInfo)object0).type)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.url, ((OpenGraphInfo)object0).url)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.image, ((OpenGraphInfo)object0).image)) {
            return false;
        }
        return Intrinsics.areEqual(this.video, ((OpenGraphInfo)object0).video) ? Intrinsics.areEqual(this.embedUrl, ((OpenGraphInfo)object0).embedUrl) : false;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getEmbedUrl() {
        return this.embedUrl;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final List getImage() {
        return this.image;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final OpenGraphVideoInfo getVideo() {
        return this.video;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.host == null ? 0 : this.host.hashCode();
        int v2 = this.title == null ? 0 : this.title.hashCode();
        int v3 = this.description == null ? 0 : this.description.hashCode();
        int v4 = this.type == null ? 0 : this.type.hashCode();
        int v5 = this.url == null ? 0 : this.url.hashCode();
        int v6 = this.image == null ? 0 : this.image.hashCode();
        int v7 = this.video == null ? 0 : this.video.hashCode();
        String s = this.embedUrl;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v;
    }

    public final void setDescription(@Nullable String s) {
        this.description = s;
    }

    public final void setEmbedUrl(@Nullable String s) {
        this.embedUrl = s;
    }

    public final void setHost(@Nullable String s) {
        this.host = s;
    }

    public final void setImage(@Nullable List list0) {
        this.image = list0;
    }

    public final void setTitle(@Nullable String s) {
        this.title = s;
    }

    public final void setType(@Nullable String s) {
        this.type = s;
    }

    public final void setUrl(@Nullable String s) {
        this.url = s;
    }

    public final void setVideo(@Nullable OpenGraphVideoInfo openGraphVideoInfo0) {
        this.video = openGraphVideoInfo0;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.description;
        String s1 = this.type;
        String s2 = this.url;
        List list0 = this.image;
        OpenGraphVideoInfo openGraphVideoInfo0 = this.video;
        String s3 = this.embedUrl;
        StringBuilder stringBuilder0 = b.w("OpenGraphInfo(host=", this.host, ", title=", this.title, ", description=");
        a.w(stringBuilder0, s, ", type=", s1, ", url=");
        stringBuilder0.append(s2);
        stringBuilder0.append(", image=");
        stringBuilder0.append(list0);
        stringBuilder0.append(", video=");
        stringBuilder0.append(openGraphVideoInfo0);
        stringBuilder0.append(", embedUrl=");
        stringBuilder0.append(s3);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

