package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.selects.SelectClause0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 -2\u00020\u0001:\u0001-J\u0010\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\'J\b\u0010\u0018\u001A\u00020\u0019H\u0017J\u0014\u0010\u0018\u001A\u00020\u00072\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001BH\'J\u001A\u0010\u0018\u001A\u00020\u00192\u0010\b\u0002\u0010\u001A\u001A\n\u0018\u00010\u001Cj\u0004\u0018\u0001`\u001DH&J\f\u0010\u001E\u001A\u00060\u001Cj\u0002`\u001DH\'JE\u0010\u001F\u001A\u00020 2\b\b\u0002\u0010!\u001A\u00020\u00072\b\b\u0002\u0010\"\u001A\u00020\u00072\'\u0010#\u001A#\u0012\u0015\u0012\u0013\u0018\u00010\u001B\u00A2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00190$j\u0002`\'H\'J1\u0010\u001F\u001A\u00020 2\'\u0010#\u001A#\u0012\u0015\u0012\u0013\u0018\u00010\u001B\u00A2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00190$j\u0002`\'H&J\u0011\u0010(\u001A\u00020\u0019H\u00A6@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010)J\u0011\u0010*\u001A\u00020\u00002\u0006\u0010+\u001A\u00020\u0000H\u0097\u0002J\b\u0010,\u001A\u00020\u0007H&R\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00000\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\t\u0010\bR\u0012\u0010\n\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\bR\u0012\u0010\u000B\u001A\u00020\fX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u001C\u0010\u000F\u001A\u0004\u0018\u00010\u00008&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006."}, d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parent", "getParent$annotations", "()V", "getParent", "()Lkotlinx/coroutines/Job;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus", "other", "start", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Job extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void cancel(Job job0) {
            job0.cancel(null);
        }

        public static void cancel$default(Job job0, CancellationException cancellationException0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                cancellationException0 = null;
            }
            job0.cancel(cancellationException0);
        }

        public static boolean cancel$default(Job job0, Throwable throwable0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if((v & 1) != 0) {
                throwable0 = null;
            }
            return job0.cancel(throwable0);
        }

        public static Object fold(@NotNull Job job0, Object object0, @NotNull Function2 function20) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(job0, object0, function20);
        }

        @Nullable
        public static Element get(@NotNull Job job0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(job0, coroutineContext$Key0);
        }

        @ExperimentalCoroutinesApi
        public static void getParent$annotations() {
        }

        public static DisposableHandle invokeOnCompletion$default(Job job0, boolean z, boolean z1, Function1 function10, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if((v & 1) != 0) {
                z = false;
            }
            if((v & 2) != 0) {
                z1 = true;
            }
            return job0.invokeOnCompletion(z, z1, function10);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull Job job0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(job0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull Job job0, @NotNull CoroutineContext coroutineContext0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(job0, coroutineContext0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static Job plus(@NotNull Job job0, @NotNull Job job1) [...] // Inlined contents
    }

    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/Job$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class kotlinx.coroutines.Job.Key implements Key {
        public static final kotlinx.coroutines.Job.Key a;

        static {
            kotlinx.coroutines.Job.Key.a = new kotlinx.coroutines.Job.Key();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final kotlinx.coroutines.Job.Key Key;

    static {
        Job.Key = kotlinx.coroutines.Job.Key.a;
    }

    @InternalCoroutinesApi
    @NotNull
    ChildHandle attachChild(@NotNull ChildJob arg1);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    void cancel();

    void cancel(@Nullable CancellationException arg1);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    boolean cancel(Throwable arg1);

    @InternalCoroutinesApi
    @NotNull
    CancellationException getCancellationException();

    @NotNull
    Sequence getChildren();

    @NotNull
    SelectClause0 getOnJoin();

    @Nullable
    Job getParent();

    @NotNull
    DisposableHandle invokeOnCompletion(@NotNull Function1 arg1);

    @InternalCoroutinesApi
    @NotNull
    DisposableHandle invokeOnCompletion(boolean arg1, boolean arg2, @NotNull Function1 arg3);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @Nullable
    Object join(@NotNull Continuation arg1);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    Job plus(@NotNull Job arg1);

    boolean start();
}

