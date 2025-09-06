package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\'¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/Job;", "parentCancelled", "", "parentJob", "Lkotlinx/coroutines/ParentJob;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@InternalCoroutinesApi
public interface ChildJob extends Job {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static void cancel(ChildJob childJob0) {
            kotlinx.coroutines.Job.DefaultImpls.cancel(childJob0);
        }

        public static Object fold(@NotNull ChildJob childJob0, Object object0, @NotNull Function2 function20) {
            return kotlinx.coroutines.Job.DefaultImpls.fold(childJob0, object0, function20);
        }

        @Nullable
        public static Element get(@NotNull ChildJob childJob0, @NotNull Key coroutineContext$Key0) {
            return kotlinx.coroutines.Job.DefaultImpls.get(childJob0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull ChildJob childJob0, @NotNull Key coroutineContext$Key0) {
            return kotlinx.coroutines.Job.DefaultImpls.minusKey(childJob0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull ChildJob childJob0, @NotNull CoroutineContext coroutineContext0) {
            return kotlinx.coroutines.Job.DefaultImpls.plus(childJob0, coroutineContext0);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static Job plus(@NotNull ChildJob childJob0, @NotNull Job job0) {
            return job0;
        }
    }

    @InternalCoroutinesApi
    void parentCancelled(@NotNull ParentJob arg1);
}

