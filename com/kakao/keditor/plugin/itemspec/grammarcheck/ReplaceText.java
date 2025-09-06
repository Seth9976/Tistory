package com.kakao.keditor.plugin.itemspec.grammarcheck;

import com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u000E¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/grammarcheck/ReplaceText;", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarViewRequest;", "item", "Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "innerIndex", "", "start", "end", "changeText", "", "(Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;IIILjava/lang/String;)V", "getChangeText", "()Ljava/lang/String;", "getEnd", "()I", "getInnerIndex", "getItem", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "getStart", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ReplaceText extends GrammarViewRequest {
    @NotNull
    private final String changeText;
    private final int end;
    private final int innerIndex;
    @NotNull
    private final GrammarCheckTextItem item;
    private final int start;

    public ReplaceText(@NotNull GrammarCheckTextItem grammarCheckTextItem0, int v, int v1, int v2, @NotNull String s) {
        Intrinsics.checkNotNullParameter(grammarCheckTextItem0, "item");
        Intrinsics.checkNotNullParameter(s, "changeText");
        super(grammarCheckTextItem0);
        this.item = grammarCheckTextItem0;
        this.innerIndex = v;
        this.start = v1;
        this.end = v2;
        this.changeText = s;
    }

    public ReplaceText(GrammarCheckTextItem grammarCheckTextItem0, int v, int v1, int v2, String s, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        this(grammarCheckTextItem0, v, v1, v2, s);
    }

    @NotNull
    public final String getChangeText() {
        return this.changeText;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getInnerIndex() {
        return this.innerIndex;
    }

    @NotNull
    public final GrammarCheckTextItem getItem() {
        return this.item;
    }

    public final int getStart() {
        return this.start;
    }
}

