package com.kakao.keditor.plugin.itemspec.grammarcheck;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\u000F\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0016"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SentenceGrammarCheck;", "Ljava/io/Serializable;", "sentence", "", "result", "", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/SingleGrammarCheck;", "(Ljava/lang/String;Ljava/util/List;)V", "getResult", "()Ljava/util/List;", "getSentence", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SentenceGrammarCheck implements Serializable {
    @NotNull
    private final List result;
    @NotNull
    private final String sentence;

    public SentenceGrammarCheck(@NotNull String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "sentence");
        Intrinsics.checkNotNullParameter(list0, "result");
        super();
        this.sentence = s;
        this.result = list0;
    }

    @NotNull
    public final String component1() {
        return this.sentence;
    }

    @NotNull
    public final List component2() {
        return this.result;
    }

    @NotNull
    public final SentenceGrammarCheck copy(@NotNull String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "sentence");
        Intrinsics.checkNotNullParameter(list0, "result");
        return new SentenceGrammarCheck(s, list0);
    }

    public static SentenceGrammarCheck copy$default(SentenceGrammarCheck sentenceGrammarCheck0, String s, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            s = sentenceGrammarCheck0.sentence;
        }
        if((v & 2) != 0) {
            list0 = sentenceGrammarCheck0.result;
        }
        return sentenceGrammarCheck0.copy(s, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SentenceGrammarCheck)) {
            return false;
        }
        return Intrinsics.areEqual(this.sentence, ((SentenceGrammarCheck)object0).sentence) ? Intrinsics.areEqual(this.result, ((SentenceGrammarCheck)object0).result) : false;
    }

    @NotNull
    public final List getResult() {
        return this.result;
    }

    @NotNull
    public final String getSentence() {
        return this.sentence;
    }

    @Override
    public int hashCode() {
        return this.result.hashCode() + this.sentence.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "SentenceGrammarCheck(sentence=" + this.sentence + ", result=" + this.result + ")";
    }
}

