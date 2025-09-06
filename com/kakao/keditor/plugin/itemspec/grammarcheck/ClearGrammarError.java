package com.kakao.keditor.plugin.itemspec.grammarcheck;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/grammarcheck/ClearGrammarError;", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarViewRequest;", "grammarError", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "(Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;)V", "getGrammarError", "()Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ClearGrammarError extends GrammarViewRequest {
    @NotNull
    private final KeditorGrammarError grammarError;

    public ClearGrammarError(@NotNull KeditorGrammarError keditorGrammarError0) {
        Intrinsics.checkNotNullParameter(keditorGrammarError0, "grammarError");
        super(keditorGrammarError0.getItem());
        this.grammarError = keditorGrammarError0;
    }

    @NotNull
    public final KeditorGrammarError component1() {
        return this.grammarError;
    }

    @NotNull
    public final ClearGrammarError copy(@NotNull KeditorGrammarError keditorGrammarError0) {
        Intrinsics.checkNotNullParameter(keditorGrammarError0, "grammarError");
        return new ClearGrammarError(keditorGrammarError0);
    }

    public static ClearGrammarError copy$default(ClearGrammarError clearGrammarError0, KeditorGrammarError keditorGrammarError0, int v, Object object0) {
        if((v & 1) != 0) {
            keditorGrammarError0 = clearGrammarError0.grammarError;
        }
        return clearGrammarError0.copy(keditorGrammarError0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ClearGrammarError ? Intrinsics.areEqual(this.grammarError, ((ClearGrammarError)object0).grammarError) : false;
    }

    @NotNull
    public final KeditorGrammarError getGrammarError() {
        return this.grammarError;
    }

    @Override
    public int hashCode() {
        return this.grammarError.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "ClearGrammarError(grammarError=" + this.grammarError + ")";
    }
}

