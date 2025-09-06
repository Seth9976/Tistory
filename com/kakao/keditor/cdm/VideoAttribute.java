package com.kakao.keditor.cdm;

import a5.b;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\u000FJ\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010!\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\"\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010#\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0013J\u0010\u0010$\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0013J\u0010\u0010%\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0013J\u0010\u0010&\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0013J\u000B\u0010\'\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010(\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010)\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010*\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0092\u0001\u0010+\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001\u00A2\u0006\u0002\u0010,J\u0013\u0010-\u001A\u00020.2\b\u0010/\u001A\u0004\u0018\u000100H\u00D6\u0003J\t\u00101\u001A\u000202H\u00D6\u0001J\b\u00103\u001A\u00020\u0003H\u0016R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0011R\u0015\u0010\b\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0017\u0010\u0013R\u0015\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0018\u0010\u0013R\u0013\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0011R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0011R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0011R\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u0011\"\u0004\b\u001D\u0010\u001ER\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u001F\u0010\u0013\u00A8\u00064"}, d2 = {"Lcom/kakao/keditor/cdm/VideoAttribute;", "Lcom/kakao/keditor/cdm/KeditorModelAttribute;", "url", "", "width", "", "height", "originWidth", "originHeight", "style", "mobileStyle", "thumbnail", "service", "host", "caption", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCaption", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHost", "getMobileStyle", "getOriginHeight", "getOriginWidth", "getService", "getStyle", "getThumbnail", "getUrl", "setUrl", "(Ljava/lang/String;)V", "getWidth", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/keditor/cdm/VideoAttribute;", "equals", "", "other", "", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorData.kt\ncom/kakao/keditor/cdm/VideoAttribute\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class VideoAttribute extends KeditorModelAttribute {
    @Nullable
    private final String caption;
    @Nullable
    private final Float height;
    @Nullable
    private final String host;
    @Nullable
    private final String mobileStyle;
    @Nullable
    private final Float originHeight;
    @Nullable
    private final Float originWidth;
    @Nullable
    private final String service;
    @Nullable
    private final String style;
    @Nullable
    private final String thumbnail;
    @Nullable
    private String url;
    @Nullable
    private final Float width;

    public VideoAttribute() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0x7FF, null);
    }

    public VideoAttribute(@Nullable String s, @Nullable Float float0, @Nullable Float float1, @Nullable Float float2, @Nullable Float float3, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
        this.url = s;
        this.width = float0;
        this.height = float1;
        this.originWidth = float2;
        this.originHeight = float3;
        this.style = s1;
        this.mobileStyle = s2;
        this.thumbnail = s3;
        this.service = s4;
        this.host = s5;
        this.caption = s6;
    }

    public VideoAttribute(String s, Float float0, Float float1, Float float2, Float float3, String s1, String s2, String s3, String s4, String s5, String s6, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? float0 : null), ((v & 4) == 0 ? float1 : null), ((v & 8) == 0 ? float2 : null), ((v & 16) == 0 ? float3 : null), ((v & 0x20) == 0 ? s1 : null), ((v & 0x40) == 0 ? s2 : null), ((v & 0x80) == 0 ? s3 : null), ((v & 0x100) == 0 ? s4 : null), ((v & 0x200) == 0 ? s5 : null), ((v & 0x400) == 0 ? s6 : null));
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component10() {
        return this.host;
    }

    @Nullable
    public final String component11() {
        return this.caption;
    }

    @Nullable
    public final Float component2() {
        return this.width;
    }

    @Nullable
    public final Float component3() {
        return this.height;
    }

    @Nullable
    public final Float component4() {
        return this.originWidth;
    }

    @Nullable
    public final Float component5() {
        return this.originHeight;
    }

    @Nullable
    public final String component6() {
        return this.style;
    }

    @Nullable
    public final String component7() {
        return this.mobileStyle;
    }

    @Nullable
    public final String component8() {
        return this.thumbnail;
    }

    @Nullable
    public final String component9() {
        return this.service;
    }

    @NotNull
    public final VideoAttribute copy(@Nullable String s, @Nullable Float float0, @Nullable Float float1, @Nullable Float float2, @Nullable Float float3, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
        return new VideoAttribute(s, float0, float1, float2, float3, s1, s2, s3, s4, s5, s6);
    }

    public static VideoAttribute copy$default(VideoAttribute videoAttribute0, String s, Float float0, Float float1, Float float2, Float float3, String s1, String s2, String s3, String s4, String s5, String s6, int v, Object object0) {
        String s7 = (v & 1) == 0 ? s : videoAttribute0.url;
        Float float4 = (v & 2) == 0 ? float0 : videoAttribute0.width;
        Float float5 = (v & 4) == 0 ? float1 : videoAttribute0.height;
        Float float6 = (v & 8) == 0 ? float2 : videoAttribute0.originWidth;
        Float float7 = (v & 16) == 0 ? float3 : videoAttribute0.originHeight;
        String s8 = (v & 0x20) == 0 ? s1 : videoAttribute0.style;
        String s9 = (v & 0x40) == 0 ? s2 : videoAttribute0.mobileStyle;
        String s10 = (v & 0x80) == 0 ? s3 : videoAttribute0.thumbnail;
        String s11 = (v & 0x100) == 0 ? s4 : videoAttribute0.service;
        String s12 = (v & 0x200) == 0 ? s5 : videoAttribute0.host;
        return (v & 0x400) == 0 ? videoAttribute0.copy(s7, float4, float5, float6, float7, s8, s9, s10, s11, s12, s6) : videoAttribute0.copy(s7, float4, float5, float6, float7, s8, s9, s10, s11, s12, videoAttribute0.caption);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof VideoAttribute)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.url, ((VideoAttribute)object0).url)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.width, ((VideoAttribute)object0).width)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.height, ((VideoAttribute)object0).height)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.originWidth, ((VideoAttribute)object0).originWidth)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.originHeight, ((VideoAttribute)object0).originHeight)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.style, ((VideoAttribute)object0).style)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.mobileStyle, ((VideoAttribute)object0).mobileStyle)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.thumbnail, ((VideoAttribute)object0).thumbnail)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.service, ((VideoAttribute)object0).service)) {
            return false;
        }
        return Intrinsics.areEqual(this.host, ((VideoAttribute)object0).host) ? Intrinsics.areEqual(this.caption, ((VideoAttribute)object0).caption) : false;
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final String getMobileStyle() {
        return this.mobileStyle;
    }

    @Nullable
    public final Float getOriginHeight() {
        return this.originHeight;
    }

    @Nullable
    public final Float getOriginWidth() {
        return this.originWidth;
    }

    @Nullable
    public final String getService() {
        return this.service;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Float getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.url == null ? 0 : this.url.hashCode();
        int v2 = this.width == null ? 0 : this.width.hashCode();
        int v3 = this.height == null ? 0 : this.height.hashCode();
        int v4 = this.originWidth == null ? 0 : this.originWidth.hashCode();
        int v5 = this.originHeight == null ? 0 : this.originHeight.hashCode();
        int v6 = this.style == null ? 0 : this.style.hashCode();
        int v7 = this.mobileStyle == null ? 0 : this.mobileStyle.hashCode();
        int v8 = this.thumbnail == null ? 0 : this.thumbnail.hashCode();
        int v9 = this.service == null ? 0 : this.service.hashCode();
        int v10 = this.host == null ? 0 : this.host.hashCode();
        String s = this.caption;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v;
    }

    public final void setUrl(@Nullable String s) {
        this.url = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s16;
        String s14;
        String s12;
        String s10;
        String s8;
        String s6;
        String s5;
        String s4;
        String s3;
        String s2;
        String s = this.url;
        String s1 = "";
        if(s == null) {
            s2 = "";
        }
        else {
            s2 = "url=" + s + ", ";
            if(s2 == null) {
                s2 = "";
            }
        }
        if(this.width == null) {
            s3 = "";
        }
        else {
            s3 = "width=" + this.width + ", ";
            if(s3 == null) {
                s3 = "";
            }
        }
        if(this.height == null) {
            s4 = "";
        }
        else {
            s4 = "height=" + this.height + ", ";
            if(s4 == null) {
                s4 = "";
            }
        }
        if(this.originWidth == null) {
            s5 = "";
        }
        else {
            s5 = "originWidth=" + this.originWidth + ", ";
            if(s5 == null) {
                s5 = "";
            }
        }
        if(this.originHeight == null) {
            s6 = "";
        }
        else {
            s6 = "originHeight=" + this.originHeight + ", ";
            if(s6 == null) {
                s6 = "";
            }
        }
        String s7 = this.style;
        if(s7 == null) {
            s8 = "";
        }
        else {
            s8 = "style=" + s7 + ", ";
            if(s8 == null) {
                s8 = "";
            }
        }
        String s9 = this.mobileStyle;
        if(s9 == null) {
            s10 = "";
        }
        else {
            s10 = "mobileStyle=" + s9 + ", ";
            if(s10 == null) {
                s10 = "";
            }
        }
        String s11 = this.thumbnail;
        if(s11 == null) {
            s12 = "";
        }
        else {
            s12 = "thumbnail=" + s11 + ", ";
            if(s12 == null) {
                s12 = "";
            }
        }
        String s13 = this.service;
        if(s13 == null) {
            s14 = "";
        }
        else {
            s14 = "service=" + s13 + ", ";
            if(s14 == null) {
                s14 = "";
            }
        }
        String s15 = this.host;
        if(s15 == null) {
            s16 = "";
        }
        else {
            s16 = "host=" + s15 + ", ";
            if(s16 == null) {
                s16 = "";
            }
        }
        String s17 = this.caption;
        if(s17 != null) {
            String s18 = "caption=" + s17 + ", ";
            if(s18 != null) {
                s1 = s18;
            }
        }
        StringBuilder stringBuilder0 = b.w("VideoAttribute(", s2, s3, s4, s5);
        a.w(stringBuilder0, s6, s8, s10, s12);
        return b.r(stringBuilder0, s14, s16, s1, ")");
    }
}

