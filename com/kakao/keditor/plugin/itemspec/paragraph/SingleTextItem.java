package com.kakao.keditor.plugin.itemspec.paragraph;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\b&\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/SingleTextItem;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "hasPendingFocus", "", "(Z)V", "parseGrammarCheckTexts", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SingleTextItem extends GrammarCheckTextItem {
    public SingleTextItem() {
        this(false, 1, null);
    }

    public SingleTextItem(boolean z) {
        super(z);
    }

    public SingleTextItem(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem
    @NotNull
    public List parseGrammarCheckTexts() {
        String s = this.getText().toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return k.listOf(s);
    }
}

