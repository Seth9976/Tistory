package com.kakao.keditor.plugin.pluginspec.contentsearch.webview;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000B\u001A\u00020\u0001HÆ\u0003J\u001D\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0001HÆ\u0001J\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/webview/ContentSearchWebViewMessage;", "", "type", "", "payload", "(Ljava/lang/String;Ljava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentSearchWebViewMessage {
    @NotNull
    private final Object payload;
    @NotNull
    private final String type;

    public ContentSearchWebViewMessage(@NotNull String s, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(object0, "payload");
        super();
        this.type = s;
        this.payload = object0;
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final Object component2() {
        return this.payload;
    }

    @NotNull
    public final ContentSearchWebViewMessage copy(@NotNull String s, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(object0, "payload");
        return new ContentSearchWebViewMessage(s, object0);
    }

    public static ContentSearchWebViewMessage copy$default(ContentSearchWebViewMessage contentSearchWebViewMessage0, String s, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            s = contentSearchWebViewMessage0.type;
        }
        if((v & 2) != 0) {
            object0 = contentSearchWebViewMessage0.payload;
        }
        return contentSearchWebViewMessage0.copy(s, object0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContentSearchWebViewMessage)) {
            return false;
        }
        return Intrinsics.areEqual(this.type, ((ContentSearchWebViewMessage)object0).type) ? Intrinsics.areEqual(this.payload, ((ContentSearchWebViewMessage)object0).payload) : false;
    }

    @NotNull
    public final Object getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return this.payload.hashCode() + this.type.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ContentSearchWebViewMessage(type=" + this.type + ", payload=" + this.payload + ")";
    }
}

