package com.kakao.keditor.event.common;

import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001A\u001A\u00020\bHÆ\u0003J\t\u0010\u001B\u001A\u00020\bHÆ\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u0005HÆ\u0003JU\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001F\u001A\u00020 2\b\u0010!\u001A\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001A\u00020\u0003HÖ\u0001J\t\u0010$\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0010R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000E¨\u0006%"}, d2 = {"Lcom/kakao/keditor/event/common/OnVideoUrlFound;", "Lcom/kakao/keditor/event/Event;", "position", "", "url", "", "host", "width", "", "height", "thumbnail", "title", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Number;", "getHost", "()Ljava/lang/String;", "getPosition", "()I", "getThumbnail", "getTitle", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnVideoUrlFound implements Event {
    @NotNull
    private final Number height;
    @Nullable
    private final String host;
    private final int position;
    @Nullable
    private final String thumbnail;
    @Nullable
    private final String title;
    @NotNull
    private final String url;
    @NotNull
    private final Number width;

    public OnVideoUrlFound(int v, @NotNull String s, @Nullable String s1, @NotNull Number number0, @NotNull Number number1, @Nullable String s2, @Nullable String s3) {
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(number0, "width");
        Intrinsics.checkNotNullParameter(number1, "height");
        super();
        this.position = v;
        this.url = s;
        this.host = s1;
        this.width = number0;
        this.height = number1;
        this.thumbnail = s2;
        this.title = s3;
    }

    public OnVideoUrlFound(int v, String s, String s1, Number number0, Number number1, String s2, String s3, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        Number number2 = (v1 & 8) == 0 ? number0 : 0;
        Number number3 = (v1 & 16) == 0 ? number1 : 0;
        this(v, s, s1, number2, number3, ((v1 & 0x20) == 0 ? s2 : null), s3);
    }

    public final int component1() {
        return this.position;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @Nullable
    public final String component3() {
        return this.host;
    }

    @NotNull
    public final Number component4() {
        return this.width;
    }

    @NotNull
    public final Number component5() {
        return this.height;
    }

    @Nullable
    public final String component6() {
        return this.thumbnail;
    }

    @Nullable
    public final String component7() {
        return this.title;
    }

    @NotNull
    public final OnVideoUrlFound copy(int v, @NotNull String s, @Nullable String s1, @NotNull Number number0, @NotNull Number number1, @Nullable String s2, @Nullable String s3) {
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(number0, "width");
        Intrinsics.checkNotNullParameter(number1, "height");
        return new OnVideoUrlFound(v, s, s1, number0, number1, s2, s3);
    }

    public static OnVideoUrlFound copy$default(OnVideoUrlFound onVideoUrlFound0, int v, String s, String s1, Number number0, Number number1, String s2, String s3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = onVideoUrlFound0.position;
        }
        if((v1 & 2) != 0) {
            s = onVideoUrlFound0.url;
        }
        if((v1 & 4) != 0) {
            s1 = onVideoUrlFound0.host;
        }
        if((v1 & 8) != 0) {
            number0 = onVideoUrlFound0.width;
        }
        if((v1 & 16) != 0) {
            number1 = onVideoUrlFound0.height;
        }
        if((v1 & 0x20) != 0) {
            s2 = onVideoUrlFound0.thumbnail;
        }
        if((v1 & 0x40) != 0) {
            s3 = onVideoUrlFound0.title;
        }
        return onVideoUrlFound0.copy(v, s, s1, number0, number1, s2, s3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OnVideoUrlFound)) {
            return false;
        }
        if(this.position != ((OnVideoUrlFound)object0).position) {
            return false;
        }
        if(!Intrinsics.areEqual(this.url, ((OnVideoUrlFound)object0).url)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.host, ((OnVideoUrlFound)object0).host)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.width, ((OnVideoUrlFound)object0).width)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.height, ((OnVideoUrlFound)object0).height)) {
            return false;
        }
        return Intrinsics.areEqual(this.thumbnail, ((OnVideoUrlFound)object0).thumbnail) ? Intrinsics.areEqual(this.title, ((OnVideoUrlFound)object0).title) : false;
    }

    @NotNull
    public final Number getHeight() {
        return this.height;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final Number getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        int v = q.c(this.position * 0x1F, 0x1F, this.url);
        int v1 = 0;
        int v2 = this.host == null ? 0 : this.host.hashCode();
        int v3 = this.width.hashCode();
        int v4 = this.height.hashCode();
        int v5 = this.thumbnail == null ? 0 : this.thumbnail.hashCode();
        String s = this.title;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v4 + (v3 + (v + v2) * 0x1F) * 0x1F) * 0x1F + v5) * 0x1F + v1;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OnVideoUrlFound(position=");
        stringBuilder0.append(this.position);
        stringBuilder0.append(", url=");
        stringBuilder0.append(this.url);
        stringBuilder0.append(", host=");
        stringBuilder0.append(this.host);
        stringBuilder0.append(", width=");
        stringBuilder0.append(this.width);
        stringBuilder0.append(", height=");
        stringBuilder0.append(this.height);
        stringBuilder0.append(", thumbnail=");
        stringBuilder0.append(this.thumbnail);
        stringBuilder0.append(", title=");
        return a.o(stringBuilder0, this.title, ")");
    }
}

