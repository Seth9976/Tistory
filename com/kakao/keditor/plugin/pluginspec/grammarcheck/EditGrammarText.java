package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import com.kakao.keditor.plugin.itemspec.grammarcheck.KeditorGrammarError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/EditGrammarText;", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarRequest;", "error", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "changeText", "", "(Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;Ljava/lang/String;)V", "getChangeText", "()Ljava/lang/String;", "getError", "()Lcom/kakao/keditor/plugin/itemspec/grammarcheck/KeditorGrammarError;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditGrammarText implements GrammarRequest {
    @NotNull
    private final String changeText;
    @NotNull
    private final KeditorGrammarError error;

    public EditGrammarText(@NotNull KeditorGrammarError keditorGrammarError0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(keditorGrammarError0, "error");
        Intrinsics.checkNotNullParameter(s, "changeText");
        super();
        this.error = keditorGrammarError0;
        this.changeText = s;
    }

    @NotNull
    public final KeditorGrammarError component1() {
        return this.error;
    }

    @NotNull
    public final String component2() {
        return this.changeText;
    }

    @NotNull
    public final EditGrammarText copy(@NotNull KeditorGrammarError keditorGrammarError0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(keditorGrammarError0, "error");
        Intrinsics.checkNotNullParameter(s, "changeText");
        return new EditGrammarText(keditorGrammarError0, s);
    }

    public static EditGrammarText copy$default(EditGrammarText editGrammarText0, KeditorGrammarError keditorGrammarError0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            keditorGrammarError0 = editGrammarText0.error;
        }
        if((v & 2) != 0) {
            s = editGrammarText0.changeText;
        }
        return editGrammarText0.copy(keditorGrammarError0, s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EditGrammarText)) {
            return false;
        }
        return Intrinsics.areEqual(this.error, ((EditGrammarText)object0).error) ? Intrinsics.areEqual(this.changeText, ((EditGrammarText)object0).changeText) : false;
    }

    @NotNull
    public final String getChangeText() {
        return this.changeText;
    }

    @NotNull
    public final KeditorGrammarError getError() {
        return this.error;
    }

    @Override
    public int hashCode() {
        return this.changeText.hashCode() + this.error.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "EditGrammarText(error=" + this.error + ", changeText=" + this.changeText + ")";
    }
}

