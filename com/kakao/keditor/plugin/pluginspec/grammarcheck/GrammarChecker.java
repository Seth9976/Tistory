package com.kakao.keditor.plugin.pluginspec.grammarcheck;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000B2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\u000EH&J\u001E\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\u00112\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00070\u000EH\u0016R\u0016\u0010\u0002\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarChecker;", "", "requestCode", "", "getRequestCode", "()Ljava/lang/Integer;", "grammarCheckAsync", "", "checkString", "", "onGrammarErrorFound", "Lkotlin/Function1;", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarCheckResponse;", "onComplete", "Lkotlin/Function0;", "onGrammarCheckerClosed", "checkedAllGrammarErrors", "", "applyResultToView", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface GrammarChecker {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Nullable
        public static Integer getRequestCode(@NotNull GrammarChecker grammarChecker0) [...] // Inlined contents

        public static void onGrammarCheckerClosed(@NotNull GrammarChecker grammarChecker0, boolean z, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "applyResultToView");
            function00.invoke();
        }
    }

    @Nullable
    Integer getRequestCode();

    void grammarCheckAsync(@NotNull String arg1, @NotNull Function1 arg2, @NotNull Function0 arg3);

    void onGrammarCheckerClosed(boolean arg1, @NotNull Function0 arg2);
}

