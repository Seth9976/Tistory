package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/UpdateGrammarIndex;", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarRequest;", "currentIndex", "", "totalCount", "(II)V", "getCurrentIndex", "()I", "getTotalCount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UpdateGrammarIndex implements GrammarRequest {
    private final int currentIndex;
    private final int totalCount;

    public UpdateGrammarIndex(int v, int v1) {
        this.currentIndex = v;
        this.totalCount = v1;
    }

    public final int component1() {
        return this.currentIndex;
    }

    public final int component2() {
        return this.totalCount;
    }

    @NotNull
    public final UpdateGrammarIndex copy(int v, int v1) {
        return new UpdateGrammarIndex(v, v1);
    }

    public static UpdateGrammarIndex copy$default(UpdateGrammarIndex updateGrammarIndex0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = updateGrammarIndex0.currentIndex;
        }
        if((v2 & 2) != 0) {
            v1 = updateGrammarIndex0.totalCount;
        }
        return updateGrammarIndex0.copy(v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof UpdateGrammarIndex)) {
            return false;
        }
        return this.currentIndex == ((UpdateGrammarIndex)object0).currentIndex ? this.totalCount == ((UpdateGrammarIndex)object0).totalCount : false;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    @Override
    public int hashCode() {
        return this.totalCount + this.currentIndex * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "UpdateGrammarIndex(currentIndex=" + this.currentIndex + ", totalCount=" + this.totalCount + ")";
    }
}

