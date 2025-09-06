package com.kakao.keditor.plugin.attrs.text.spans;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0010\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0011H\u0016R\u0015\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\u0005\u0010\tR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/KeURLSpan;", "Landroid/text/style/CharacterStyle;", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeAttributeSpan;", "url", "", "isLinkNewWindow", "", "linkTitle", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLinkTitle", "()Ljava/lang/String;", "getUrl", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeURLSpan extends CharacterStyle implements KeAttributeSpan {
    @Nullable
    private final Boolean isLinkNewWindow;
    @Nullable
    private final String linkTitle;
    @NotNull
    private final String url;

    public KeURLSpan(@Nullable String s, @Nullable Boolean boolean0, @Nullable String s1) {
        this.isLinkNewWindow = boolean0;
        this.linkTitle = s1;
        if(s == null) {
            s = "";
        }
        this.url = s;
    }

    public KeURLSpan(String s, Boolean boolean0, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            boolean0 = Boolean.TRUE;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        this(s, boolean0, s1);
    }

    @Nullable
    public final String getLinkTitle() {
        return this.linkTitle;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Boolean isLinkNewWindow() {
        return this.isLinkNewWindow;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "tp");
        textPaint0.setColor(textPaint0.linkColor);
        textPaint0.setUnderlineText(true);
    }
}

