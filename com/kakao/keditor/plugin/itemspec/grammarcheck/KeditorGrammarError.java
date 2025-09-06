package com.kakao.keditor.plugin.itemspec.grammarcheck;

import com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÆ\u0003J;\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001F\u001A\u00020 HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\t\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u001A\u0010\b\u001A\u00020\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0010\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "", "grammarError", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SingleGrammarCheck;", "item", "Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "itemInnerIndex", "", "startIndex", "length", "(Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SingleGrammarCheck;Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;III)V", "getGrammarError", "()Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SingleGrammarCheck;", "getItem", "()Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "getItemInnerIndex", "()I", "getLength", "getStartIndex", "setStartIndex", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeditorGrammarError {
    @NotNull
    private final SingleGrammarCheck grammarError;
    @NotNull
    private final GrammarCheckTextItem item;
    private final int itemInnerIndex;
    private final int length;
    private int startIndex;

    public KeditorGrammarError(@NotNull SingleGrammarCheck singleGrammarCheck0, @NotNull GrammarCheckTextItem grammarCheckTextItem0, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(singleGrammarCheck0, "grammarError");
        Intrinsics.checkNotNullParameter(grammarCheckTextItem0, "item");
        super();
        this.grammarError = singleGrammarCheck0;
        this.item = grammarCheckTextItem0;
        this.itemInnerIndex = v;
        this.startIndex = v1;
        this.length = v2;
    }

    public KeditorGrammarError(SingleGrammarCheck singleGrammarCheck0, GrammarCheckTextItem grammarCheckTextItem0, int v, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 4) != 0) {
            v = 0;
        }
        if((v3 & 16) != 0) {
            v2 = singleGrammarCheck0.getInput().length();
        }
        this(singleGrammarCheck0, grammarCheckTextItem0, v, v1, v2);
    }

    @NotNull
    public final SingleGrammarCheck component1() {
        return this.grammarError;
    }

    @NotNull
    public final GrammarCheckTextItem component2() {
        return this.item;
    }

    public final int component3() {
        return this.itemInnerIndex;
    }

    public final int component4() {
        return this.startIndex;
    }

    public final int component5() {
        return this.length;
    }

    @NotNull
    public final KeditorGrammarError copy(@NotNull SingleGrammarCheck singleGrammarCheck0, @NotNull GrammarCheckTextItem grammarCheckTextItem0, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(singleGrammarCheck0, "grammarError");
        Intrinsics.checkNotNullParameter(grammarCheckTextItem0, "item");
        return new KeditorGrammarError(singleGrammarCheck0, grammarCheckTextItem0, v, v1, v2);
    }

    public static KeditorGrammarError copy$default(KeditorGrammarError keditorGrammarError0, SingleGrammarCheck singleGrammarCheck0, GrammarCheckTextItem grammarCheckTextItem0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            singleGrammarCheck0 = keditorGrammarError0.grammarError;
        }
        if((v3 & 2) != 0) {
            grammarCheckTextItem0 = keditorGrammarError0.item;
        }
        if((v3 & 4) != 0) {
            v = keditorGrammarError0.itemInnerIndex;
        }
        if((v3 & 8) != 0) {
            v1 = keditorGrammarError0.startIndex;
        }
        if((v3 & 16) != 0) {
            v2 = keditorGrammarError0.length;
        }
        return keditorGrammarError0.copy(singleGrammarCheck0, grammarCheckTextItem0, v, v1, v2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KeditorGrammarError)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.grammarError, ((KeditorGrammarError)object0).grammarError)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.item, ((KeditorGrammarError)object0).item)) {
            return false;
        }
        if(this.itemInnerIndex != ((KeditorGrammarError)object0).itemInnerIndex) {
            return false;
        }
        return this.startIndex == ((KeditorGrammarError)object0).startIndex ? this.length == ((KeditorGrammarError)object0).length : false;
    }

    @NotNull
    public final SingleGrammarCheck getGrammarError() {
        return this.grammarError;
    }

    @NotNull
    public final GrammarCheckTextItem getItem() {
        return this.item;
    }

    public final int getItemInnerIndex() {
        return this.itemInnerIndex;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    @Override
    public int hashCode() {
        return this.length + a.c(this.startIndex, a.c(this.itemInnerIndex, (this.item.hashCode() + this.grammarError.hashCode() * 0x1F) * 0x1F, 0x1F), 0x1F);
    }

    public final void setStartIndex(int v) {
        this.startIndex = v;
    }

    @Override
    @NotNull
    public String toString() {
        int v = this.startIndex;
        StringBuilder stringBuilder0 = new StringBuilder("KeditorGrammarError(grammarError=");
        stringBuilder0.append(this.grammarError);
        stringBuilder0.append(", item=");
        stringBuilder0.append(this.item);
        stringBuilder0.append(", itemInnerIndex=");
        a.A(stringBuilder0, this.itemInnerIndex, ", startIndex=", v, ", length=");
        return wb.a.c(this.length, ")", stringBuilder0);
    }
}

