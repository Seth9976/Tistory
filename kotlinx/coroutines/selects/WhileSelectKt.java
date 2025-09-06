package kotlinx.coroutines.selects;

import bg.g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A2\u0010\u0000\u001A\u00020\u00012\u001F\b\u0004\u0010\u0002\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0006H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"whileSelect", "", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,33:1\n55#2,8:34\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n31#1:34,8\n*E\n"})
public final class WhileSelectKt {
    @ExperimentalCoroutinesApi
    @Nullable
    public static final Object whileSelect(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.q;
            if((v & 0x80000000) == 0) {
                g0 = new g(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                g0.q = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = g0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(g0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_19;
            }
            case 1: {
                function10 = g0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(!((Boolean)object0).booleanValue()) {
                return Unit.INSTANCE;
            }
        label_19:
            SelectImplementation selectImplementation0 = new SelectImplementation(g0.getContext());
            function10.invoke(selectImplementation0);
            g0.o = function10;
            g0.q = 1;
            object0 = selectImplementation0.doSelect(g0);
        }
        while(object0 != object1);
        return object1;
    }
}

