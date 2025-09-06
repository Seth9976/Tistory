package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001A\u00020\f*\u00020\u00072\u001C\u0010\u000B\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJG\u0010\r\u001A\u00020\f\"\u0004\b\u0001\u0010\u000F*\b\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\u000B\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012J[\u0010\r\u001A\u00020\f\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\u000F*\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0015\u001A\u00028\u00012\"\u0010\u000B\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0016J\u0013\u0010\u0017\u001A\u00028\u0000H\u0091@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectImplementation;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "doSelect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n63#1:69,2\n*E\n"})
public class UnbiasedSelectImplementation extends SelectImplementation {
    public final ArrayList g;

    public UnbiasedSelectImplementation(@NotNull CoroutineContext coroutineContext0) {
        super(coroutineContext0);
        this.g = new ArrayList();
    }

    @Override  // kotlinx.coroutines.selects.SelectImplementation
    @PublishedApi
    @Nullable
    public Object doSelect(@NotNull Continuation continuation0) {
        ArrayList arrayList0;
        try {
            arrayList0 = this.g;
            Collections.shuffle(arrayList0);
            for(Object object0: arrayList0) {
                SelectImplementation.register$default(this, ((ClauseData)object0), false, 1, null);
            }
        }
        finally {
            arrayList0.clear();
        }
        return super.doSelect(continuation0);
    }

    @Override  // kotlinx.coroutines.selects.SelectImplementation
    public void invoke(@NotNull SelectClause0 selectClause00, @NotNull Function1 function10) {
        ClauseData selectImplementation$ClauseData0 = new ClauseData(this, selectClause00.getClauseObject(), selectClause00.getRegFunc(), selectClause00.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), function10, selectClause00.getOnCancellationConstructor());
        this.g.add(selectImplementation$ClauseData0);
    }

    @Override  // kotlinx.coroutines.selects.SelectImplementation
    public void invoke(@NotNull SelectClause1 selectClause10, @NotNull Function2 function20) {
        ClauseData selectImplementation$ClauseData0 = new ClauseData(this, selectClause10.getClauseObject(), selectClause10.getRegFunc(), selectClause10.getProcessResFunc(), null, function20, selectClause10.getOnCancellationConstructor());
        this.g.add(selectImplementation$ClauseData0);
    }

    @Override  // kotlinx.coroutines.selects.SelectImplementation
    public void invoke(@NotNull SelectClause2 selectClause20, Object object0, @NotNull Function2 function20) {
        ClauseData selectImplementation$ClauseData0 = new ClauseData(this, selectClause20.getClauseObject(), selectClause20.getRegFunc(), selectClause20.getProcessResFunc(), object0, function20, selectClause20.getOnCancellationConstructor());
        this.g.add(selectImplementation$ClauseData0);
    }
}

