package kotlinx.coroutines.selects;

import bg.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001=B\u000F\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001A\u00028\u0000H\u0091@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001A\u00020\u0010*\u00020\u000B2\u001C\u0010\u000F\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\fH\u0096\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0011\u001A\u00020\u0010\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00010\u00142\"\u0010\u000F\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\u0015H\u0096\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0016J[\u0010\u0011\u001A\u00020\u0010\"\u0004\b\u0001\u0010\u0017\"\u0004\b\u0002\u0010\u0013*\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00182\u0006\u0010\u0019\u001A\u00028\u00012\"\u0010\u000F\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\u0015H\u0096\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u001AJ\'\u0010\u001E\u001A\u00020\u0010*\f0\u001BR\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u001D\u001A\u00020\u001CH\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010\"\u001A\u00020\u00102\u0006\u0010!\u001A\u00020 H\u0016\u00A2\u0006\u0004\b\"\u0010#J#\u0010(\u001A\u00020\u00102\n\u0010%\u001A\u0006\u0012\u0002\b\u00030$2\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u0019\u0010+\u001A\u00020\u00102\b\u0010*\u001A\u0004\u0018\u00010\u000EH\u0016\u00A2\u0006\u0004\b+\u0010,J!\u0010/\u001A\u00020\u001C2\u0006\u0010-\u001A\u00020\u000E2\b\u0010.\u001A\u0004\u0018\u00010\u000EH\u0016\u00A2\u0006\u0004\b/\u00100J\u001F\u00102\u001A\u0002012\u0006\u0010-\u001A\u00020\u000E2\b\u0010.\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b2\u00103J\u001A\u0010\u0011\u001A\u00020\u00102\b\u00105\u001A\u0004\u0018\u000104H\u0096\u0002\u00A2\u0006\u0004\b\u0011\u00106R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0011\u0010<\u001A\b\u0012\u0004\u0012\u00020\u000E0;8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006>"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "doSelect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "reregister", "register", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Z)V", "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "disposeOnCompletion", "(Lkotlinx/coroutines/DisposableHandle;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", "", "index", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "internalResult", "selectInRegistrationPhase", "(Ljava/lang/Object;)V", "clauseObject", "result", "trySelect", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectDetailed", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "cause", "(Ljava/lang/Throwable;)V", "a", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/atomicfu/AtomicRef;", "state", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,873:1\n1#2:874\n2624#3,3:875\n1855#3,2:888\n1855#3,2:896\n1855#3,2:898\n314#4,9:878\n323#4,2:890\n19#5:887\n153#6,4:892\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n505#1:875,3\n569#1:888,2\n726#1:896,2\n751#1:898,2\n545#1:878,9\n545#1:890,2\n561#1:887\n711#1:892,4\n*E\n"})
public class SelectImplementation extends CancelHandler implements SelectBuilder, SelectInstanceInternal {
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u00B8\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012U\u0010\u000B\u001AQ\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n\u0012U\u0010\u000E\u001AQ\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0002\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\r\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000F\u001A\u00020\u0001\u0012g\u0010\u0014\u001Ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u0013\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001B\u0010\u0019\u001A\u00020\u00182\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u00012\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001D\u0010\u001F\u001A\u00028\u00002\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001H\u0086@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\r\u0010!\u001A\u00020\t\u00A2\u0006\u0004\b!\u0010\"J1\u0010#\u001A\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u00112\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001A\u00020\u00018\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0002\u0010%Ru\u0010\u0014\u001Ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0006\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0001\u00A2\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011\u0018\u00010\u0003j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\u0014\u0010&R\u0018\u0010\'\u001A\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b\'\u0010%R\u0016\u0010)\u001A\u00020(8\u0006@\u0006X\u0087\u000E\u00A2\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006+"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "block", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Lkotlinx/coroutines/selects/SelectImplementation;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Lkotlinx/coroutines/selects/SelectImplementation;", "", "tryRegisterAsWaiter", "(Lkotlinx/coroutines/selects/SelectImplementation;)Z", "result", "processResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "argument", "invokeBlock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "()V", "createOnCancellationAction", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "disposableHandleOrSegment", "", "indexInSegment", "I", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,873:1\n1#2:874\n*E\n"})
    public final class ClauseData {
        public final Function3 a;
        public final Function3 b;
        public final Object c;
        @JvmField
        @NotNull
        public final Object clauseObject;
        public final Object d;
        @JvmField
        @Nullable
        public Object disposableHandleOrSegment;
        public final SelectImplementation e;
        @JvmField
        public int indexInSegment;
        @JvmField
        @Nullable
        public final Function3 onCancellationConstructor;

        public ClauseData(@NotNull Object object0, @NotNull Function3 function30, @NotNull Function3 function31, @Nullable Object object1, @NotNull Object object2, @Nullable Function3 function32) {
            this.clauseObject = object0;
            this.a = function30;
            this.b = function31;
            this.c = object1;
            this.d = object2;
            this.onCancellationConstructor = function32;
            this.indexInSegment = -1;
        }

        @Nullable
        public final Function1 createOnCancellationAction(@NotNull SelectInstance selectInstance0, @Nullable Object object0) {
            return this.onCancellationConstructor == null ? null : ((Function1)this.onCancellationConstructor.invoke(selectInstance0, this.c, object0));
        }

        public final void dispose() {
            Object object0 = this.disposableHandleOrSegment;
            DisposableHandle disposableHandle0 = null;
            if(object0 instanceof Segment) {
                ((Segment)object0).onCancellation(this.indexInSegment, null, SelectImplementation.this.getContext());
                return;
            }
            if(object0 instanceof DisposableHandle) {
                disposableHandle0 = (DisposableHandle)object0;
            }
            if(disposableHandle0 != null) {
                disposableHandle0.dispose();
            }
        }

        @Nullable
        public final Object invokeBlock(@Nullable Object object0, @NotNull Continuation continuation0) {
            Object object1 = this.d;
            if(this.c == SelectKt.getPARAM_CLAUSE_0()) {
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1)object1).invoke(continuation0);
            }
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2)object1).invoke(object0, continuation0);
        }

        @Nullable
        public final Object processResult(@Nullable Object object0) {
            return this.b.invoke(this.clauseObject, this.c, object0);
        }

        public final boolean tryRegisterAsWaiter(@NotNull SelectImplementation selectImplementation0) {
            this.a.invoke(this.clauseObject, selectImplementation0, this.c);
            return selectImplementation0.e == SelectKt.e;
        }
    }

    public final CoroutineContext a;
    public ArrayList b;
    public Object c;
    public int d;
    public Object e;
    public static final AtomicReferenceFieldUpdater f;
    @Volatile
    @Nullable
    private volatile Object state;

    static {
        SelectImplementation.f = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state");
    }

    public SelectImplementation(@NotNull CoroutineContext coroutineContext0) {
        this.a = coroutineContext0;
        this.state = SelectKt.access$getSTATE_REG$p();
        this.b = new ArrayList(2);
        this.d = -1;
        this.e = SelectKt.access$getNO_RESULT$p();
    }

    public final Object a(Continuation continuation0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SelectImplementation.f;
        Object object0 = atomicReferenceFieldUpdater0.get(this);
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        Object object1 = this.e;
        ArrayList arrayList0 = this.b;
        if(arrayList0 != null) {
            for(Object object2: arrayList0) {
                ClauseData selectImplementation$ClauseData0 = (ClauseData)object2;
                if(selectImplementation$ClauseData0 != ((ClauseData)object0)) {
                    selectImplementation$ClauseData0.dispose();
                }
            }
            atomicReferenceFieldUpdater0.set(this, SelectKt.access$getSTATE_COMPLETED$p());
            this.e = SelectKt.access$getNO_RESULT$p();
            this.b = null;
        }
        return ((ClauseData)object0).invokeBlock(((ClauseData)object0).processResult(object1), continuation0);
    }

    public static final Object access$complete(SelectImplementation selectImplementation0, Continuation continuation0) {
        return selectImplementation0.a(continuation0);
    }

    public static final Object access$doSelectSuspend(SelectImplementation selectImplementation0, Continuation continuation0) {
        return selectImplementation0.b(continuation0);
    }

    public static final boolean access$getInRegistrationPhase(SelectImplementation selectImplementation0) {
        selectImplementation0.getClass();
        Object object0 = SelectImplementation.f.get(selectImplementation0);
        return object0 == SelectKt.access$getSTATE_REG$p() || object0 instanceof List;
    }

    public static final boolean access$isCancelled(SelectImplementation selectImplementation0) {
        selectImplementation0.getClass();
        return SelectImplementation.f.get(selectImplementation0) == SelectKt.access$getSTATE_CANCELLED$p();
    }

    public static final Object access$processResultAndInvokeBlockRecoveringException(SelectImplementation selectImplementation0, ClauseData selectImplementation$ClauseData0, Object object0, Continuation continuation0) {
        a a0;
        selectImplementation0.getClass();
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.q;
            if((v & 0x80000000) == 0) {
                a0 = new a(selectImplementation0, continuation0);
            }
            else {
                a0.q = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(selectImplementation0, continuation0);
        }
        Object object1 = a0.o;
        Object object2 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.q) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                Object object3 = selectImplementation$ClauseData0.processResult(object0);
                a0.q = 1;
                object1 = selectImplementation$ClauseData0.invokeBlock(object3, a0);
                return object1 == object2 ? object2 : object1;
            }
            case 1: {
                ResultKt.throwOnFailure(object1);
                return object1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final void access$reregisterClause(SelectImplementation selectImplementation0, Object object0) {
        ClauseData selectImplementation$ClauseData0 = selectImplementation0.c(object0);
        Intrinsics.checkNotNull(selectImplementation$ClauseData0);
        selectImplementation$ClauseData0.disposableHandleOrSegment = null;
        selectImplementation$ClauseData0.indexInSegment = -1;
        selectImplementation0.register(selectImplementation$ClauseData0, true);
    }

    public static final Object access$waitUntilSelected(SelectImplementation selectImplementation0, Continuation continuation0) {
        return selectImplementation0.e(continuation0);
    }

    public final Object b(Continuation continuation0) {
        SelectImplementation selectImplementation0;
        d d0;
        if(continuation0 instanceof d) {
            d0 = (d)continuation0;
            int v = d0.r;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, continuation0);
            }
            else {
                d0.r = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, continuation0);
        }
        Object object0 = d0.p;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(d0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                d0.o = this;
                d0.r = 1;
                if(this.e(d0) == object1) {
                    return object1;
                }
                selectImplementation0 = this;
                break;
            }
            case 1: {
                selectImplementation0 = d0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        d0.o = null;
        d0.r = 2;
        object0 = selectImplementation0.a(d0);
        return object0 == object1 ? object1 : object0;
    }

    public final ClauseData c(Object object0) {
        ArrayList arrayList0 = this.b;
        Object object1 = null;
        if(arrayList0 == null) {
            return null;
        }
        for(Object object2: arrayList0) {
            if(((ClauseData)object2).clauseObject == object0) {
                object1 = object2;
                break;
            }
            if(false) {
                break;
            }
        }
        if(((ClauseData)object1) == null) {
            throw new IllegalStateException(("Clause with object " + object0 + " is not found").toString());
        }
        return (ClauseData)object1;
    }

    public final int d(Object object0, Object object1) {
        boolean z;
        Object object2;
        while(true) {
            while(true) {
                while(true) {
                label_0:
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SelectImplementation.f;
                    object2 = atomicReferenceFieldUpdater0.get(this);
                    z = false;
                    if(!(object2 instanceof CancellableContinuation)) {
                        break;
                    }
                    ClauseData selectImplementation$ClauseData0 = this.c(object0);
                    if(selectImplementation$ClauseData0 != null) {
                        Function1 function10 = selectImplementation$ClauseData0.createOnCancellationAction(this, object1);
                        do {
                            if(atomicReferenceFieldUpdater0.compareAndSet(this, object2, selectImplementation$ClauseData0)) {
                                this.e = object1;
                                if(SelectKt.access$tryResume(((CancellableContinuation)object2), function10)) {
                                    return 0;
                                }
                                this.e = null;
                                return 2;
                            }
                        }
                        while(atomicReferenceFieldUpdater0.get(this) == object2);
                    }
                }
                if((Intrinsics.areEqual(object2, SelectKt.access$getSTATE_COMPLETED$p()) ? true : object2 instanceof ClauseData)) {
                    return 3;
                }
                if(Intrinsics.areEqual(object2, SelectKt.access$getSTATE_CANCELLED$p())) {
                    return 2;
                }
                if(Intrinsics.areEqual(object2, SelectKt.access$getSTATE_REG$p())) {
                    List list0 = k.listOf(object0);
                    do {
                        if(atomicReferenceFieldUpdater0.compareAndSet(this, object2, list0)) {
                            z = true;
                            break;
                        }
                    }
                    while(atomicReferenceFieldUpdater0.get(this) == object2);
                    if(z) {
                        return 1;
                    }
                    goto label_0;
                }
                break;
            }
            if(!(object2 instanceof List)) {
                break;
            }
            List list1 = CollectionsKt___CollectionsKt.plus(((Collection)object2), object0);
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object2, list1)) {
                    z = true;
                    break;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object2);
            if(z) {
                return 1;
            }
        }
        throw new IllegalStateException(("Unexpected state: " + object2).toString());
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(@NotNull DisposableHandle disposableHandle0) {
        this.c = disposableHandle0;
    }

    // 去混淆评级： 低(20)
    @PublishedApi
    @Nullable
    public Object doSelect(@NotNull Continuation continuation0) {
        return SelectImplementation.f.get(this) instanceof ClauseData ? this.a(continuation0) : this.b(continuation0);
    }

    public final Object e(Continuation continuation0) {
        Object object0;
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SelectImplementation.f;
        while(true) {
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == SelectKt.access$getSTATE_REG$p()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = SelectImplementation.f;
                do {
                    if(atomicReferenceFieldUpdater1.compareAndSet(this, object0, cancellableContinuationImpl0)) {
                        cancellableContinuationImpl0.invokeOnCancellation(this);
                        goto label_26;
                    }
                }
                while(atomicReferenceFieldUpdater1.get(this) == object0);
            }
            else {
                if(!(object0 instanceof List)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = SelectImplementation.f;
                Symbol symbol0 = SelectKt.access$getSTATE_REG$p();
                do {
                    if(atomicReferenceFieldUpdater2.compareAndSet(this, object0, symbol0)) {
                        for(Object object1: ((Iterable)object0)) {
                            SelectImplementation.access$reregisterClause(this, object1);
                        }
                        break;
                    }
                }
                while(atomicReferenceFieldUpdater2.get(this) == object0);
            }
        }
        if(!(object0 instanceof ClauseData)) {
            throw new IllegalStateException(("unexpected state: " + object0).toString());
        }
        Function1 function10 = ((ClauseData)object0).createOnCancellationAction(this, this.e);
        cancellableContinuationImpl0.resume(Unit.INSTANCE, function10);
    label_26:
        Object object2 = cancellableContinuationImpl0.getResult();
        if(object2 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object2 == qd.a.getCOROUTINE_SUSPENDED() ? object2 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    @NotNull
    public CoroutineContext getContext() {
        return this.a;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((Throwable)object0));
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.CancelHandlerBase
    public void invoke(@Nullable Throwable throwable0) {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SelectImplementation.f;
            Object object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == SelectKt.access$getSTATE_COMPLETED$p()) {
                return;
            }
            Symbol symbol0 = SelectKt.access$getSTATE_CANCELLED$p();
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, symbol0)) {
                    ArrayList arrayList0 = this.b;
                    if(arrayList0 == null) {
                        return;
                    }
                    for(Object object1: arrayList0) {
                        ((ClauseData)object1).dispose();
                    }
                    this.e = SelectKt.access$getNO_RESULT$p();
                    this.b = null;
                    return;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object0);
        }
    }

    @Override  // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@NotNull SelectClause0 selectClause00, @NotNull Function1 function10) {
        SelectImplementation.register$default(this, new ClauseData(this, selectClause00.getClauseObject(), selectClause00.getRegFunc(), selectClause00.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), function10, selectClause00.getOnCancellationConstructor()), false, 1, null);
    }

    @Override  // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@NotNull SelectClause1 selectClause10, @NotNull Function2 function20) {
        SelectImplementation.register$default(this, new ClauseData(this, selectClause10.getClauseObject(), selectClause10.getRegFunc(), selectClause10.getProcessResFunc(), null, function20, selectClause10.getOnCancellationConstructor()), false, 1, null);
    }

    @Override  // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@NotNull SelectClause2 selectClause20, Object object0, @NotNull Function2 function20) {
        SelectImplementation.register$default(this, new ClauseData(this, selectClause20.getClauseObject(), selectClause20.getRegFunc(), selectClause20.getProcessResFunc(), object0, function20, selectClause20.getOnCancellationConstructor()), false, 1, null);
    }

    @Override  // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@NotNull SelectClause2 selectClause20, @NotNull Function2 function20) {
        DefaultImpls.invoke(this, selectClause20, function20);
    }

    @Override  // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(@NotNull Segment segment0, int v) {
        this.c = segment0;
        this.d = v;
    }

    @Override  // kotlinx.coroutines.selects.SelectBuilder
    @Deprecated(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @ReplaceWith(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @LowPriorityInOverloadResolution
    @ExperimentalCoroutinesApi
    public void onTimeout(long v, @NotNull Function1 function10) {
        DefaultImpls.onTimeout(this, v, function10);
    }

    @JvmName(name = "register")
    public final void register(@NotNull ClauseData selectImplementation$ClauseData0, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SelectImplementation.f;
        if(atomicReferenceFieldUpdater0.get(this) instanceof ClauseData) {
            return;
        }
        if(!z) {
            Object object0 = selectImplementation$ClauseData0.clauseObject;
            ArrayList arrayList0 = this.b;
            Intrinsics.checkNotNull(arrayList0);
            if(arrayList0 == null || !arrayList0.isEmpty()) {
                for(Object object1: arrayList0) {
                    if(((ClauseData)object1).clauseObject == object0) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + object0).toString());
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        if(selectImplementation$ClauseData0.tryRegisterAsWaiter(this)) {
            if(!z) {
                ArrayList arrayList1 = this.b;
                Intrinsics.checkNotNull(arrayList1);
                arrayList1.add(selectImplementation$ClauseData0);
            }
            selectImplementation$ClauseData0.disposableHandleOrSegment = this.c;
            selectImplementation$ClauseData0.indexInSegment = this.d;
            this.c = null;
            this.d = -1;
            return;
        }
        atomicReferenceFieldUpdater0.set(this, selectImplementation$ClauseData0);
    }

    public static void register$default(SelectImplementation selectImplementation0, ClauseData selectImplementation$ClauseData0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if((v & 1) != 0) {
            z = false;
        }
        selectImplementation0.register(selectImplementation$ClauseData0, z);
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(@Nullable Object object0) {
        this.e = object0;
    }

    @Override  // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(@NotNull Object object0, @Nullable Object object1) {
        return this.d(object0, object1) == 0;
    }

    @NotNull
    public final TrySelectDetailedResult trySelectDetailed(@NotNull Object object0, @Nullable Object object1) {
        return SelectKt.access$TrySelectDetailedResult(this.d(object0, object1));
    }
}

