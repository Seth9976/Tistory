package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\u00032\b\u0010\n\u001A\u0004\u0018\u00010\u000BHÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u000FHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/FinishGrammarCheck;", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarRequest;", "checkedAllErrors", "", "(Z)V", "getCheckedAllErrors", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FinishGrammarCheck implements GrammarRequest {
    private final boolean checkedAllErrors;

    public FinishGrammarCheck(boolean z) {
        this.checkedAllErrors = z;
    }

    public final boolean component1() {
        return this.checkedAllErrors;
    }

    @NotNull
    public final FinishGrammarCheck copy(boolean z) {
        return new FinishGrammarCheck(z);
    }

    public static FinishGrammarCheck copy$default(FinishGrammarCheck finishGrammarCheck0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = finishGrammarCheck0.checkedAllErrors;
        }
        return finishGrammarCheck0.copy(z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FinishGrammarCheck ? this.checkedAllErrors == ((FinishGrammarCheck)object0).checkedAllErrors : false;
    }

    public final boolean getCheckedAllErrors() {
        return this.checkedAllErrors;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(this.checkedAllErrors);
    }

    @Override
    @NotNull
    public String toString() {
        return "FinishGrammarCheck(checkedAllErrors=" + this.checkedAllErrors + ")";
    }
}

