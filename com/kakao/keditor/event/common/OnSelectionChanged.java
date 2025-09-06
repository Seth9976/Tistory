package com.kakao.keditor.event.common;

import android.text.Editable;
import com.kakao.keditor.event.Event;
import com.kakao.keditor.plugin.attrs.Alignment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\n\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0002\u0010\fJ\u000F\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001A\u00020\bHÆ\u0003J\t\u0010\u0019\u001A\u00020\nHÆ\u0003J\t\u0010\u001A\u001A\u00020\nHÆ\u0003JA\u0010\u001B\u001A\u00020\u00002\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\nHÆ\u0001J\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001FHÖ\u0003J\u0006\u0010 \u001A\u00020\u001DJ\t\u0010!\u001A\u00020\nHÖ\u0001J\t\u0010\"\u001A\u00020#HÖ\u0001R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u000B\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0010¨\u0006$"}, d2 = {"Lcom/kakao/keditor/event/common/OnSelectionChanged;", "Lcom/kakao/keditor/event/Event;", "spans", "", "Landroid/text/style/CharacterStyle;", "s", "Landroid/text/Editable;", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "start", "", "end", "(Ljava/util/List;Landroid/text/Editable;Lcom/kakao/keditor/plugin/attrs/Alignment;II)V", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "getEnd", "()I", "getS", "()Landroid/text/Editable;", "getSpans", "()Ljava/util/List;", "getStart", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hasLength", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnSelectionChanged implements Event {
    @NotNull
    private final Alignment alignment;
    private final int end;
    @NotNull
    private final Editable s;
    @NotNull
    private final List spans;
    private final int start;

    public OnSelectionChanged(@NotNull List list0, @NotNull Editable editable0, @NotNull Alignment alignment0, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "spans");
        Intrinsics.checkNotNullParameter(editable0, "s");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        super();
        this.spans = list0;
        this.s = editable0;
        this.alignment = alignment0;
        this.start = v;
        this.end = v1;
    }

    @NotNull
    public final List component1() {
        return this.spans;
    }

    @NotNull
    public final Editable component2() {
        return this.s;
    }

    @NotNull
    public final Alignment component3() {
        return this.alignment;
    }

    public final int component4() {
        return this.start;
    }

    public final int component5() {
        return this.end;
    }

    @NotNull
    public final OnSelectionChanged copy(@NotNull List list0, @NotNull Editable editable0, @NotNull Alignment alignment0, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "spans");
        Intrinsics.checkNotNullParameter(editable0, "s");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        return new OnSelectionChanged(list0, editable0, alignment0, v, v1);
    }

    public static OnSelectionChanged copy$default(OnSelectionChanged onSelectionChanged0, List list0, Editable editable0, Alignment alignment0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            list0 = onSelectionChanged0.spans;
        }
        if((v2 & 2) != 0) {
            editable0 = onSelectionChanged0.s;
        }
        if((v2 & 4) != 0) {
            alignment0 = onSelectionChanged0.alignment;
        }
        if((v2 & 8) != 0) {
            v = onSelectionChanged0.start;
        }
        if((v2 & 16) != 0) {
            v1 = onSelectionChanged0.end;
        }
        return onSelectionChanged0.copy(list0, editable0, alignment0, v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OnSelectionChanged)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.spans, ((OnSelectionChanged)object0).spans)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.s, ((OnSelectionChanged)object0).s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.alignment, ((OnSelectionChanged)object0).alignment)) {
            return false;
        }
        return this.start == ((OnSelectionChanged)object0).start ? this.end == ((OnSelectionChanged)object0).end : false;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final Editable getS() {
        return this.s;
    }

    @NotNull
    public final List getSpans() {
        return this.spans;
    }

    public final int getStart() {
        return this.start;
    }

    public final boolean hasLength() {
        return this.end > this.start;
    }

    @Override
    public int hashCode() {
        return this.end + a.c(this.start, (this.alignment.hashCode() + (this.s.hashCode() + this.spans.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F);
    }

    @Override  // com.kakao.keditor.event.Event
    @Nullable
    public Function1 pendingEvent() {
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OnSelectionChanged(spans=");
        stringBuilder0.append(this.spans);
        stringBuilder0.append(", s=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", alignment=");
        stringBuilder0.append(this.alignment);
        stringBuilder0.append(", start=");
        stringBuilder0.append(this.start);
        stringBuilder0.append(", end=");
        return wb.a.c(this.end, ")", stringBuilder0);
    }
}

