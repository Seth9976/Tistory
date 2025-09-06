package com.kakao.keditor.cdm;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001A\u0004\u0018\u00010\r\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\u0012J\u000B\u0010\'\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010(\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010)\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010*\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010+\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010,\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0017J\u0010\u0010-\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0017J\t\u0010.\u001A\u00020\u0005H\u00C6\u0003J\t\u0010/\u001A\u00020\u0005H\u00C6\u0003J\u000B\u00100\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u00101\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u00102\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u00103\u001A\u0004\u0018\u00010\rH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0019J\u00A6\u0001\u00104\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001\u00A2\u0006\u0002\u00105J\u0013\u00106\u001A\u00020\r2\b\u00107\u001A\u0004\u0018\u000108H\u00D6\u0003J\t\u00109\u001A\u00020\u0005H\u00D6\u0001J\b\u0010:\u001A\u00020\u0003H\u0016R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\u0018\u001A\u0004\b\u0016\u0010\u0017R\u0015\u0010\f\u001A\u0004\u0018\u00010\r\u00A2\u0006\n\n\u0002\u0010\u001A\u001A\u0004\b\f\u0010\u0019R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0014R\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0014R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u0014R\u0011\u0010\b\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u001FR\u0011\u0010\u0007\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010\u001FR\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\u0014\"\u0004\b\"\u0010#R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010\u0014R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010\u0014R\u0015\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\n\n\u0002\u0010\u0018\u001A\u0004\b&\u0010\u0017\u00A8\u0006;"}, d2 = {"Lcom/kakao/keditor/cdm/ImageAttribute;", "Lcom/kakao/keditor/cdm/KeditorModelAttribute;", "src", "", "width", "", "height", "originWidth", "originHeight", "style", "mobileStyle", "link", "isLinkNewWindow", "", "title", "alt", "caption", "mimeType", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getCaption", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLink", "getMimeType", "getMobileStyle", "getOriginHeight", "()I", "getOriginWidth", "getSrc", "setSrc", "(Ljava/lang/String;)V", "getStyle", "getTitle", "getWidth", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/keditor/cdm/ImageAttribute;", "equals", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorData.kt\ncom/kakao/keditor/cdm/ImageAttribute\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class ImageAttribute extends KeditorModelAttribute {
    @Nullable
    private final String alt;
    @Nullable
    private final String caption;
    @Nullable
    private final Integer height;
    @Nullable
    private final Boolean isLinkNewWindow;
    @Nullable
    private final String link;
    @Nullable
    private final String mimeType;
    @Nullable
    private final String mobileStyle;
    private final int originHeight;
    private final int originWidth;
    @Nullable
    private String src;
    @Nullable
    private final String style;
    @Nullable
    private final String title;
    @Nullable
    private final Integer width;

    public ImageAttribute(@Nullable String s, @Nullable Integer integer0, @Nullable Integer integer1, int v, int v1, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable Boolean boolean0, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7) {
        this.src = s;
        this.width = integer0;
        this.height = integer1;
        this.originWidth = v;
        this.originHeight = v1;
        this.style = s1;
        this.mobileStyle = s2;
        this.link = s3;
        this.isLinkNewWindow = boolean0;
        this.title = s4;
        this.alt = s5;
        this.caption = s6;
        this.mimeType = s7;
    }

    @Nullable
    public final String component1() {
        return this.src;
    }

    @Nullable
    public final String component10() {
        return this.title;
    }

    @Nullable
    public final String component11() {
        return this.alt;
    }

    @Nullable
    public final String component12() {
        return this.caption;
    }

    @Nullable
    public final String component13() {
        return this.mimeType;
    }

    @Nullable
    public final Integer component2() {
        return this.width;
    }

    @Nullable
    public final Integer component3() {
        return this.height;
    }

    public final int component4() {
        return this.originWidth;
    }

    public final int component5() {
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
        return this.link;
    }

    @Nullable
    public final Boolean component9() {
        return this.isLinkNewWindow;
    }

    @NotNull
    public final ImageAttribute copy(@Nullable String s, @Nullable Integer integer0, @Nullable Integer integer1, int v, int v1, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable Boolean boolean0, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7) {
        return new ImageAttribute(s, integer0, integer1, v, v1, s1, s2, s3, boolean0, s4, s5, s6, s7);
    }

    public static ImageAttribute copy$default(ImageAttribute imageAttribute0, String s, Integer integer0, Integer integer1, int v, int v1, String s1, String s2, String s3, Boolean boolean0, String s4, String s5, String s6, String s7, int v2, Object object0) {
        String s8 = (v2 & 1) == 0 ? s : imageAttribute0.src;
        Integer integer2 = (v2 & 2) == 0 ? integer0 : imageAttribute0.width;
        Integer integer3 = (v2 & 4) == 0 ? integer1 : imageAttribute0.height;
        int v3 = (v2 & 8) == 0 ? v : imageAttribute0.originWidth;
        int v4 = (v2 & 16) == 0 ? v1 : imageAttribute0.originHeight;
        String s9 = (v2 & 0x20) == 0 ? s1 : imageAttribute0.style;
        String s10 = (v2 & 0x40) == 0 ? s2 : imageAttribute0.mobileStyle;
        String s11 = (v2 & 0x80) == 0 ? s3 : imageAttribute0.link;
        Boolean boolean1 = (v2 & 0x100) == 0 ? boolean0 : imageAttribute0.isLinkNewWindow;
        String s12 = (v2 & 0x200) == 0 ? s4 : imageAttribute0.title;
        String s13 = (v2 & 0x400) == 0 ? s5 : imageAttribute0.alt;
        String s14 = (v2 & 0x800) == 0 ? s6 : imageAttribute0.caption;
        return (v2 & 0x1000) == 0 ? imageAttribute0.copy(s8, integer2, integer3, v3, v4, s9, s10, s11, boolean1, s12, s13, s14, s7) : imageAttribute0.copy(s8, integer2, integer3, v3, v4, s9, s10, s11, boolean1, s12, s13, s14, imageAttribute0.mimeType);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImageAttribute)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.src, ((ImageAttribute)object0).src)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.width, ((ImageAttribute)object0).width)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.height, ((ImageAttribute)object0).height)) {
            return false;
        }
        if(this.originWidth != ((ImageAttribute)object0).originWidth) {
            return false;
        }
        if(this.originHeight != ((ImageAttribute)object0).originHeight) {
            return false;
        }
        if(!Intrinsics.areEqual(this.style, ((ImageAttribute)object0).style)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.mobileStyle, ((ImageAttribute)object0).mobileStyle)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.link, ((ImageAttribute)object0).link)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.isLinkNewWindow, ((ImageAttribute)object0).isLinkNewWindow)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, ((ImageAttribute)object0).title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.alt, ((ImageAttribute)object0).alt)) {
            return false;
        }
        return Intrinsics.areEqual(this.caption, ((ImageAttribute)object0).caption) ? Intrinsics.areEqual(this.mimeType, ((ImageAttribute)object0).mimeType) : false;
    }

    @Nullable
    public final String getAlt() {
        return this.alt;
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final String getMobileStyle() {
        return this.mobileStyle;
    }

    public final int getOriginHeight() {
        return this.originHeight;
    }

    public final int getOriginWidth() {
        return this.originWidth;
    }

    @Nullable
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.c(this.originHeight, a.c(this.originWidth, (((this.src == null ? 0 : this.src.hashCode()) * 0x1F + (this.width == null ? 0 : this.width.hashCode())) * 0x1F + (this.height == null ? 0 : this.height.hashCode())) * 0x1F, 0x1F), 0x1F);
        int v2 = this.style == null ? 0 : this.style.hashCode();
        int v3 = this.mobileStyle == null ? 0 : this.mobileStyle.hashCode();
        int v4 = this.link == null ? 0 : this.link.hashCode();
        int v5 = this.isLinkNewWindow == null ? 0 : this.isLinkNewWindow.hashCode();
        int v6 = this.title == null ? 0 : this.title.hashCode();
        int v7 = this.alt == null ? 0 : this.alt.hashCode();
        int v8 = this.caption == null ? 0 : this.caption.hashCode();
        String s = this.mimeType;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v;
    }

    @Nullable
    public final Boolean isLinkNewWindow() {
        return this.isLinkNewWindow;
    }

    public final void setSrc(@Nullable String s) {
        this.src = s;
    }

    @Override
    @NotNull
    public String toString() {
        String s19;
        String s17;
        String s15;
        String s13;
        String s12;
        String s10;
        String s8;
        String s4;
        String s3;
        String s2;
        String s = this.src;
        String s1 = "";
        if(s == null) {
            s2 = "";
        }
        else {
            s2 = "src=" + s + ", ";
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
        String s5 = "originWidth=" + this.originWidth + ", " == null ? "" : "originWidth=" + this.originWidth + ", ";
        String s6 = "originHeight=" + this.originHeight + ", " == null ? "" : "originHeight=" + this.originHeight + ", ";
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
        String s11 = this.link;
        if(s11 == null) {
            s12 = "";
        }
        else {
            s12 = "link=" + s11 + ", ";
            if(s12 == null) {
                s12 = "";
            }
        }
        Boolean boolean0 = this.isLinkNewWindow;
        if(boolean0 == null) {
            s13 = "";
        }
        else {
            s13 = "isLinkNewWindow=" + boolean0 + ", ";
            if(s13 == null) {
                s13 = "";
            }
        }
        String s14 = this.title;
        if(s14 == null) {
            s15 = "";
        }
        else {
            s15 = "title=" + s14 + ", ";
            if(s15 == null) {
                s15 = "";
            }
        }
        String s16 = this.alt;
        if(s16 == null) {
            s17 = "";
        }
        else {
            s17 = "alt=" + s16 + ", ";
            if(s17 == null) {
                s17 = "";
            }
        }
        String s18 = this.caption;
        if(s18 == null) {
            s19 = "";
        }
        else {
            s19 = "caption=" + s18 + ", ";
            if(s19 == null) {
                s19 = "";
            }
        }
        String s20 = this.mimeType;
        if(s20 != null) {
            String s21 = "mimeType=" + s20 + ", ";
            if(s21 != null) {
                s1 = s21;
            }
        }
        StringBuilder stringBuilder0 = b.w("ImageAttribute(", s2, s3, s4, s5);
        androidx.room.a.w(stringBuilder0, s6, s8, s10, s12);
        androidx.room.a.w(stringBuilder0, s13, s15, s17, s19);
        return a.o(stringBuilder0, s1, ")");
    }
}

