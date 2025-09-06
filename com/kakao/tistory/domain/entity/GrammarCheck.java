package com.kakao.tistory.domain.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000E\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001B\u0010\t\u001A\u00020\u00002\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/domain/entity/GrammarCheck;", "", "sentences", "", "Lcom/kakao/tistory/domain/entity/SentenceGrammarCheck;", "(Ljava/util/List;)V", "getSentences", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GrammarCheck {
    @Nullable
    private final List sentences;

    public GrammarCheck(@Nullable List list0) {
        this.sentences = list0;
    }

    @Nullable
    public final List component1() {
        return this.sentences;
    }

    @NotNull
    public final GrammarCheck copy(@Nullable List list0) {
        return new GrammarCheck(list0);
    }

    public static GrammarCheck copy$default(GrammarCheck grammarCheck0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = grammarCheck0.sentences;
        }
        return grammarCheck0.copy(list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GrammarCheck ? Intrinsics.areEqual(this.sentences, ((GrammarCheck)object0).sentences) : false;
    }

    @Nullable
    public final List getSentences() {
        return this.sentences;
    }

    @Override
    public int hashCode() {
        return this.sentences == null ? 0 : this.sentences.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "GrammarCheck(sentences=" + this.sentences + ")";
    }
}

