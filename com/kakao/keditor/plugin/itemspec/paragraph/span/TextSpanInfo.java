package com.kakao.keditor.plugin.itemspec.paragraph.span;

import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00000\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\u0006HÆ\u0003J\u000F\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00000\bHÆ\u0003J9\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00000\bHÆ\u0001J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001C\u001A\u00020\u0003HÖ\u0001J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001R\u0017\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00000\b¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0004\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000F¨\u0006\u001F"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/span/TextSpanInfo;", "", "start", "", "end", "span", "Landroid/text/style/CharacterStyle;", "children", "", "(IILandroid/text/style/CharacterStyle;Ljava/util/List;)V", "getChildren", "()Ljava/util/List;", "getEnd", "()I", "setEnd", "(I)V", "getSpan", "()Landroid/text/style/CharacterStyle;", "getStart", "setStart", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextSpanInfo {
    @NotNull
    private final List children;
    private int end;
    @Nullable
    private final CharacterStyle span;
    private int start;

    public TextSpanInfo(int v, int v1, @Nullable CharacterStyle characterStyle0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "children");
        super();
        this.start = v;
        this.end = v1;
        this.span = characterStyle0;
        this.children = list0;
    }

    public TextSpanInfo(int v, int v1, CharacterStyle characterStyle0, List list0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            characterStyle0 = null;
        }
        if((v2 & 8) != 0) {
            list0 = new ArrayList();
        }
        this(v, v1, characterStyle0, list0);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    @Nullable
    public final CharacterStyle component3() {
        return this.span;
    }

    @NotNull
    public final List component4() {
        return this.children;
    }

    @NotNull
    public final TextSpanInfo copy(int v, int v1, @Nullable CharacterStyle characterStyle0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "children");
        return new TextSpanInfo(v, v1, characterStyle0, list0);
    }

    public static TextSpanInfo copy$default(TextSpanInfo textSpanInfo0, int v, int v1, CharacterStyle characterStyle0, List list0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = textSpanInfo0.start;
        }
        if((v2 & 2) != 0) {
            v1 = textSpanInfo0.end;
        }
        if((v2 & 4) != 0) {
            characterStyle0 = textSpanInfo0.span;
        }
        if((v2 & 8) != 0) {
            list0 = textSpanInfo0.children;
        }
        return textSpanInfo0.copy(v, v1, characterStyle0, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextSpanInfo)) {
            return false;
        }
        if(this.start != ((TextSpanInfo)object0).start) {
            return false;
        }
        if(this.end != ((TextSpanInfo)object0).end) {
            return false;
        }
        return Intrinsics.areEqual(this.span, ((TextSpanInfo)object0).span) ? Intrinsics.areEqual(this.children, ((TextSpanInfo)object0).children) : false;
    }

    @NotNull
    public final List getChildren() {
        return this.children;
    }

    public final int getEnd() {
        return this.end;
    }

    @Nullable
    public final CharacterStyle getSpan() {
        return this.span;
    }

    public final int getStart() {
        return this.start;
    }

    @Override
    public int hashCode() {
        int v = a.c(this.end, this.start * 0x1F, 0x1F);
        return this.span == null ? this.children.hashCode() + v * 0x1F : this.children.hashCode() + (v + this.span.hashCode()) * 0x1F;
    }

    public final void setEnd(int v) {
        this.end = v;
    }

    public final void setStart(int v) {
        this.start = v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = q.u("TextSpanInfo(start=", this.start, ", end=", this.end, ", span=");
        stringBuilder0.append(this.span);
        stringBuilder0.append(", children=");
        stringBuilder0.append(this.children);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

