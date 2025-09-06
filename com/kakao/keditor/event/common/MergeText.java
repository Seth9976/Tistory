package com.kakao.keditor.event.common;

import com.kakao.keditor.event.Event;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/kakao/keditor/event/common/MergeText;", "Lcom/kakao/keditor/event/Event;", "from", "", "text", "", "to", "(ILjava/lang/CharSequence;I)V", "getFrom", "()I", "getText", "()Ljava/lang/CharSequence;", "getTo", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MergeText implements Event {
    private final int from;
    @NotNull
    private final CharSequence text;
    private final int to;

    public MergeText(int v, @NotNull CharSequence charSequence0, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        super();
        this.from = v;
        this.text = charSequence0;
        this.to = v1;
    }

    public final int component1() {
        return this.from;
    }

    @NotNull
    public final CharSequence component2() {
        return this.text;
    }

    public final int component3() {
        return this.to;
    }

    @NotNull
    public final MergeText copy(int v, @NotNull CharSequence charSequence0, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        return new MergeText(v, charSequence0, v1);
    }

    public static MergeText copy$default(MergeText mergeText0, int v, CharSequence charSequence0, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = mergeText0.from;
        }
        if((v2 & 2) != 0) {
            charSequence0 = mergeText0.text;
        }
        if((v2 & 4) != 0) {
            v1 = mergeText0.to;
        }
        return mergeText0.copy(v, charSequence0, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MergeText)) {
            return false;
        }
        if(this.from != ((MergeText)object0).from) {
            return false;
        }
        return Intrinsics.areEqual(this.text, ((MergeText)object0).text) ? this.to == ((MergeText)object0).to : false;
    }

    public final int getFrom() {
        return this.from;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    public final int getTo() {
        return this.to;
    }

    @Override
    public int hashCode() {
        return this.to + (this.text.hashCode() + this.from * 0x1F) * 0x1F;
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MergeText(from=");
        stringBuilder0.append(this.from);
        stringBuilder0.append(", text=");
        stringBuilder0.append(this.text);
        stringBuilder0.append(", to=");
        return a.c(this.to, ")", stringBuilder0);
    }
}

