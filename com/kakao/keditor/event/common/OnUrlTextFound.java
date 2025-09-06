package com.kakao.keditor.event.common;

import com.kakao.keditor.event.Event;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem;
import com.kakao.keditor.plugin.itemspec.paragraph.URLInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/event/common/OnUrlTextFound;", "Lcom/kakao/keditor/event/Event;", "position", "", "urlInfo", "Lcom/kakao/keditor/plugin/itemspec/paragraph/URLInfo;", "next", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "(ILcom/kakao/keditor/plugin/itemspec/paragraph/URLInfo;Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;)V", "getNext", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "getPosition", "()I", "getUrlInfo", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/URLInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnUrlTextFound implements Event {
    @Nullable
    private final ParagraphItem next;
    private final int position;
    @NotNull
    private final URLInfo urlInfo;

    public OnUrlTextFound(int v, @NotNull URLInfo uRLInfo0, @Nullable ParagraphItem paragraphItem0) {
        Intrinsics.checkNotNullParameter(uRLInfo0, "urlInfo");
        super();
        this.position = v;
        this.urlInfo = uRLInfo0;
        this.next = paragraphItem0;
    }

    public final int component1() {
        return this.position;
    }

    @NotNull
    public final URLInfo component2() {
        return this.urlInfo;
    }

    @Nullable
    public final ParagraphItem component3() {
        return this.next;
    }

    @NotNull
    public final OnUrlTextFound copy(int v, @NotNull URLInfo uRLInfo0, @Nullable ParagraphItem paragraphItem0) {
        Intrinsics.checkNotNullParameter(uRLInfo0, "urlInfo");
        return new OnUrlTextFound(v, uRLInfo0, paragraphItem0);
    }

    public static OnUrlTextFound copy$default(OnUrlTextFound onUrlTextFound0, int v, URLInfo uRLInfo0, ParagraphItem paragraphItem0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = onUrlTextFound0.position;
        }
        if((v1 & 2) != 0) {
            uRLInfo0 = onUrlTextFound0.urlInfo;
        }
        if((v1 & 4) != 0) {
            paragraphItem0 = onUrlTextFound0.next;
        }
        return onUrlTextFound0.copy(v, uRLInfo0, paragraphItem0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OnUrlTextFound)) {
            return false;
        }
        if(this.position != ((OnUrlTextFound)object0).position) {
            return false;
        }
        return Intrinsics.areEqual(this.urlInfo, ((OnUrlTextFound)object0).urlInfo) ? Intrinsics.areEqual(this.next, ((OnUrlTextFound)object0).next) : false;
    }

    @Nullable
    public final ParagraphItem getNext() {
        return this.next;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final URLInfo getUrlInfo() {
        return this.urlInfo;
    }

    @Override
    public int hashCode() {
        int v = this.urlInfo.hashCode();
        return this.next == null ? (v + this.position * 0x1F) * 0x1F : (v + this.position * 0x1F) * 0x1F + this.next.hashCode();
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        return "OnUrlTextFound(position=" + this.position + ", urlInfo=" + this.urlInfo + ", next=" + this.next + ")";
    }
}

