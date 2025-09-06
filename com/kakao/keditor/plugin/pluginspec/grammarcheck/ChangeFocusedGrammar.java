package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import com.kakao.keditor.plugin.itemspec.grammarcheck.KeditorGrammarError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001F\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/ChangeFocusedGrammar;", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarRequest;", "previous", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "current", "(Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;)V", "getCurrent", "()Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "getPrevious", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ChangeFocusedGrammar implements GrammarRequest {
    @NotNull
    private final KeditorGrammarError current;
    @Nullable
    private final KeditorGrammarError previous;

    public ChangeFocusedGrammar(@Nullable KeditorGrammarError keditorGrammarError0, @NotNull KeditorGrammarError keditorGrammarError1) {
        Intrinsics.checkNotNullParameter(keditorGrammarError1, "current");
        super();
        this.previous = keditorGrammarError0;
        this.current = keditorGrammarError1;
    }

    @Nullable
    public final KeditorGrammarError component1() {
        return this.previous;
    }

    @NotNull
    public final KeditorGrammarError component2() {
        return this.current;
    }

    @NotNull
    public final ChangeFocusedGrammar copy(@Nullable KeditorGrammarError keditorGrammarError0, @NotNull KeditorGrammarError keditorGrammarError1) {
        Intrinsics.checkNotNullParameter(keditorGrammarError1, "current");
        return new ChangeFocusedGrammar(keditorGrammarError0, keditorGrammarError1);
    }

    public static ChangeFocusedGrammar copy$default(ChangeFocusedGrammar changeFocusedGrammar0, KeditorGrammarError keditorGrammarError0, KeditorGrammarError keditorGrammarError1, int v, Object object0) {
        if((v & 1) != 0) {
            keditorGrammarError0 = changeFocusedGrammar0.previous;
        }
        if((v & 2) != 0) {
            keditorGrammarError1 = changeFocusedGrammar0.current;
        }
        return changeFocusedGrammar0.copy(keditorGrammarError0, keditorGrammarError1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ChangeFocusedGrammar)) {
            return false;
        }
        return Intrinsics.areEqual(this.previous, ((ChangeFocusedGrammar)object0).previous) ? Intrinsics.areEqual(this.current, ((ChangeFocusedGrammar)object0).current) : false;
    }

    @NotNull
    public final KeditorGrammarError getCurrent() {
        return this.current;
    }

    @Nullable
    public final KeditorGrammarError getPrevious() {
        return this.previous;
    }

    @Override
    public int hashCode() {
        return this.previous == null ? this.current.hashCode() : this.current.hashCode() + this.previous.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ChangeFocusedGrammar(previous=" + this.previous + ", current=" + this.current + ")";
    }
}

