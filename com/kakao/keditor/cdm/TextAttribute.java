package com.kakao.keditor.cdm;

import a5.b;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u001B\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\u0002\u0010\rJ\u000B\u0010\u0019\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001A\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010\u001F\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0002\u0010\u0011J\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010!\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003Jz\u0010\"\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0003H\u00C6\u0001\u00A2\u0006\u0002\u0010#J\u0013\u0010$\u001A\u00020\n2\b\u0010%\u001A\u0004\u0018\u00010&H\u00D6\u0003J\t\u0010\'\u001A\u00020(H\u00D6\u0001J\b\u0010)\u001A\u00020\u0003H\u0016R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0015\u0010\t\u001A\u0004\u0018\u00010\n\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\t\u0010\u0011R\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000FR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u000FR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000FR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000F\u00A8\u0006*"}, d2 = {"Lcom/kakao/keditor/cdm/TextAttribute;", "Lcom/kakao/keditor/cdm/KeditorModelAttribute;", "text", "", "size", "textColor", "textStyle", "backgroundColor", "link", "isLinkNewWindow", "", "linkTitle", "fontFamily", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getFontFamily", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLink", "getLinkTitle", "getSize", "getText", "getTextColor", "getTextStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/keditor/cdm/TextAttribute;", "equals", "other", "", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorData.kt\ncom/kakao/keditor/cdm/TextAttribute\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class TextAttribute extends KeditorModelAttribute {
    @Nullable
    private final String backgroundColor;
    @Nullable
    private final String fontFamily;
    @Nullable
    private final Boolean isLinkNewWindow;
    @Nullable
    private final String link;
    @Nullable
    private final String linkTitle;
    @Nullable
    private final String size;
    @Nullable
    private final String text;
    @Nullable
    private final String textColor;
    @Nullable
    private final String textStyle;

    public TextAttribute(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable Boolean boolean0, @Nullable String s6, @Nullable String s7) {
        this.text = s;
        this.size = s1;
        this.textColor = s2;
        this.textStyle = s3;
        this.backgroundColor = s4;
        this.link = s5;
        this.isLinkNewWindow = boolean0;
        this.linkTitle = s6;
        this.fontFamily = s7;
    }

    @Nullable
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final String component2() {
        return this.size;
    }

    @Nullable
    public final String component3() {
        return this.textColor;
    }

    @Nullable
    public final String component4() {
        return this.textStyle;
    }

    @Nullable
    public final String component5() {
        return this.backgroundColor;
    }

    @Nullable
    public final String component6() {
        return this.link;
    }

    @Nullable
    public final Boolean component7() {
        return this.isLinkNewWindow;
    }

    @Nullable
    public final String component8() {
        return this.linkTitle;
    }

    @Nullable
    public final String component9() {
        return this.fontFamily;
    }

    @NotNull
    public final TextAttribute copy(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable Boolean boolean0, @Nullable String s6, @Nullable String s7) {
        return new TextAttribute(s, s1, s2, s3, s4, s5, boolean0, s6, s7);
    }

    public static TextAttribute copy$default(TextAttribute textAttribute0, String s, String s1, String s2, String s3, String s4, String s5, Boolean boolean0, String s6, String s7, int v, Object object0) {
        String s8 = (v & 1) == 0 ? s : textAttribute0.text;
        String s9 = (v & 2) == 0 ? s1 : textAttribute0.size;
        String s10 = (v & 4) == 0 ? s2 : textAttribute0.textColor;
        String s11 = (v & 8) == 0 ? s3 : textAttribute0.textStyle;
        String s12 = (v & 16) == 0 ? s4 : textAttribute0.backgroundColor;
        String s13 = (v & 0x20) == 0 ? s5 : textAttribute0.link;
        Boolean boolean1 = (v & 0x40) == 0 ? boolean0 : textAttribute0.isLinkNewWindow;
        String s14 = (v & 0x80) == 0 ? s6 : textAttribute0.linkTitle;
        return (v & 0x100) == 0 ? textAttribute0.copy(s8, s9, s10, s11, s12, s13, boolean1, s14, s7) : textAttribute0.copy(s8, s9, s10, s11, s12, s13, boolean1, s14, textAttribute0.fontFamily);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextAttribute)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.text, ((TextAttribute)object0).text)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.size, ((TextAttribute)object0).size)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.textColor, ((TextAttribute)object0).textColor)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.textStyle, ((TextAttribute)object0).textStyle)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.backgroundColor, ((TextAttribute)object0).backgroundColor)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.link, ((TextAttribute)object0).link)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.isLinkNewWindow, ((TextAttribute)object0).isLinkNewWindow)) {
            return false;
        }
        return Intrinsics.areEqual(this.linkTitle, ((TextAttribute)object0).linkTitle) ? Intrinsics.areEqual(this.fontFamily, ((TextAttribute)object0).fontFamily) : false;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getLinkTitle() {
        return this.linkTitle;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getTextStyle() {
        return this.textStyle;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.text == null ? 0 : this.text.hashCode();
        int v2 = this.size == null ? 0 : this.size.hashCode();
        int v3 = this.textColor == null ? 0 : this.textColor.hashCode();
        int v4 = this.textStyle == null ? 0 : this.textStyle.hashCode();
        int v5 = this.backgroundColor == null ? 0 : this.backgroundColor.hashCode();
        int v6 = this.link == null ? 0 : this.link.hashCode();
        int v7 = this.isLinkNewWindow == null ? 0 : this.isLinkNewWindow.hashCode();
        int v8 = this.linkTitle == null ? 0 : this.linkTitle.hashCode();
        String s = this.fontFamily;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v;
    }

    @Nullable
    public final Boolean isLinkNewWindow() {
        return this.isLinkNewWindow;
    }

    @Override
    @NotNull
    public String toString() {
        String s15;
        String s13;
        String s12;
        String s10;
        String s8;
        String s6;
        String s4;
        String s2;
        String s = this.text;
        String s1 = "";
        if(s == null) {
            s2 = "";
        }
        else {
            s2 = "text=" + s + ", ";
            if(s2 == null) {
                s2 = "";
            }
        }
        String s3 = this.size;
        if(s3 == null) {
            s4 = "";
        }
        else {
            s4 = "size=" + s3 + ", ";
            if(s4 == null) {
                s4 = "";
            }
        }
        String s5 = this.textColor;
        if(s5 == null) {
            s6 = "";
        }
        else {
            s6 = "textColor=" + s5 + ", ";
            if(s6 == null) {
                s6 = "";
            }
        }
        String s7 = this.textStyle;
        if(s7 == null) {
            s8 = "";
        }
        else {
            s8 = "textStyle=" + s7 + ", ";
            if(s8 == null) {
                s8 = "";
            }
        }
        String s9 = this.backgroundColor;
        if(s9 == null) {
            s10 = "";
        }
        else {
            s10 = "backgroundColor=" + s9 + ", ";
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
        String s14 = this.linkTitle;
        if(s14 == null) {
            s15 = "";
        }
        else {
            s15 = "linkTitle=" + s14 + ", ";
            if(s15 == null) {
                s15 = "";
            }
        }
        String s16 = this.fontFamily;
        if(s16 != null) {
            String s17 = "fontFamily=" + s16 + ", ";
            if(s17 != null) {
                s1 = s17;
            }
        }
        StringBuilder stringBuilder0 = b.w("TextAttribute(", s2, s4, s6, s8);
        a.w(stringBuilder0, s10, s12, s13, s15);
        return r0.a.o(stringBuilder0, s1, ")");
    }
}

