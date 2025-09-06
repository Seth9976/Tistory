package com.kakao.tistory.presentation.common;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.keditor.plugin.itemspec.grammarcheck.GrammarCheckResponse;
import com.kakao.keditor.plugin.itemspec.grammarcheck.SingleGrammarCheck;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarChecker;
import com.kakao.tistory.domain.entity.GrammarCheck;
import com.kakao.tistory.domain.entity.SentenceGrammarCheck;
import com.kakao.tistory.presentation.R.string;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BE\u0012(\u0010\b\u001A$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0004\b\r\u0010\u000EJ9\u0010\u0014\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u00032\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000B0\t2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00020\u00162\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/common/TistoryGrammarChecker;", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarChecker;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/GrammarCheck;", "", "checkGrammar", "Lkotlin/Function1;", "", "", "showGrammarCheckToast", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "checkString", "Lcom/kakao/keditor/plugin/itemspec/grammarcheck/GrammarCheckResponse;", "onGrammarErrorFound", "Lkotlin/Function0;", "onComplete", "grammarCheckAsync", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "checkedAllGrammarErrors", "applyResultToView", "onGrammarCheckerClosed", "(ZLkotlin/jvm/functions/Function0;)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryGrammarChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryGrammarChecker.kt\ncom/kakao/tistory/presentation/common/TistoryGrammarChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1549#2:83\n1620#2,2:84\n1549#2:86\n1620#2,3:87\n1622#2:90\n*S KotlinDebug\n*F\n+ 1 TistoryGrammarChecker.kt\ncom/kakao/tistory/presentation/common/TistoryGrammarChecker\n*L\n68#1:83\n68#1:84,2\n71#1:86\n71#1:87,3\n68#1:90\n*E\n"})
public final class TistoryGrammarChecker implements GrammarChecker {
    public static final int $stable = 8;
    public final Function2 a;
    public final Function1 b;
    public Job c;
    public final CoroutineScope d;

    public TistoryGrammarChecker(@NotNull Function2 function20, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function20, "checkGrammar");
        Intrinsics.checkNotNullParameter(function10, "showGrammarCheckToast");
        super();
        this.a = function20;
        this.b = function10;
        this.c = JobKt.Job$default(null, 1, null);
        this.d = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain()));
    }

    public static final GrammarCheckResponse access$toGrammarCheckResponseMapper(TistoryGrammarChecker tistoryGrammarChecker0, GrammarCheck grammarCheck0) {
        tistoryGrammarChecker0.getClass();
        List list0 = grammarCheck0.getSentences();
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object0: list0) {
                String s = ((SentenceGrammarCheck)object0).getSentence();
                List list1 = ((SentenceGrammarCheck)object0).getResult();
                ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list1, 10));
                for(Object object1: list1) {
                    arrayList1.add(new SingleGrammarCheck(((com.kakao.tistory.domain.entity.SingleGrammarCheck)object1).getInput(), ((com.kakao.tistory.domain.entity.SingleGrammarCheck)object1).getOutput(), ((com.kakao.tistory.domain.entity.SingleGrammarCheck)object1).getEtype()));
                }
                arrayList0.add(new com.kakao.keditor.plugin.itemspec.grammarcheck.SentenceGrammarCheck(s, arrayList1));
            }
            return new GrammarCheckResponse(arrayList0);
        }
        return new GrammarCheckResponse(null);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarChecker
    @Nullable
    public Integer getRequestCode() {
        return null;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarChecker
    public void grammarCheckAsync(@NotNull String s, @NotNull Function1 function10, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "checkString");
        Intrinsics.checkNotNullParameter(function10, "onGrammarErrorFound");
        Intrinsics.checkNotNullParameter(function00, "onComplete");
        Job job0 = this.c;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        c c0 = new c(s, this, function00, function10, null);
        this.c = BuildersKt.launch$default(this.d, null, null, c0, 3, null);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarChecker
    public void onGrammarCheckerClosed(boolean z, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "applyResultToView");
        if(z) {
            this.b.invoke(string.info_grammar_check_done);
        }
        function00.invoke();
    }
}

