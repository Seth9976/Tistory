package kotlinx.coroutines.debug.internal;

import _COROUTINE.ArtificialStackFrames;
import a5.b;
import androidx.room.a;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.c;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.k;
import kotlin.text.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wf.h;
import wf.i;
import wf.j;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00C1\u0002\u0018\u00002\u00020\u0001:\u0001DJ\u000F\u0010\u0005\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0007\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00010\u000E\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00110\u0015\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u0015\u00A2\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u001AH\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ)\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001E0\u00152\u0006\u0010\u0012\u001A\u00020\u00112\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u001E0\u0015\u00A2\u0006\u0004\b \u0010!J\u001B\u0010&\u001A\u00020\u00022\n\u0010#\u001A\u0006\u0012\u0002\b\u00030\"H\u0000\u00A2\u0006\u0004\b$\u0010%J\u001B\u0010(\u001A\u00020\u00022\n\u0010#\u001A\u0006\u0012\u0002\b\u00030\"H\u0000\u00A2\u0006\u0004\b\'\u0010%J)\u0010-\u001A\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010)2\f\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000\"H\u0000\u00A2\u0006\u0004\b+\u0010,R\"\u00105\u001A\u00020.8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001A\u00020.8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b6\u00100\u001A\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010=\u001A\u00020.8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b:\u00100\u001A\u0004\b;\u00102\"\u0004\b<\u00104R\u0011\u0010?\u001A\u00020.8G\u00A2\u0006\u0006\u001A\u0004\b>\u00102R\u000B\u0010A\u001A\u00020@8\u0002X\u0082\u0004R\u000B\u0010C\u001A\u00020B8\u0002X\u0082\u0004\u00A8\u0006E"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "", "install$kotlinx_coroutines_core", "()V", "install", "uninstall$kotlinx_coroutines_core", "uninstall", "Lkotlinx/coroutines/Job;", "job", "", "hierarchyToString$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "hierarchyToString", "", "dumpCoroutinesInfoAsJsonAndReferences", "()[Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "info", "enhanceStackTraceWithThreadDumpAsJson", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;)Ljava/lang/String;", "", "dumpCoroutinesInfo", "()Ljava/util/List;", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "Ljava/io/PrintStream;", "out", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "Lkotlin/coroutines/Continuation;", "frame", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "T", "completion", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "", "e", "Z", "getSanitizeStackTraces$kotlinx_coroutines_core", "()Z", "setSanitizeStackTraces$kotlinx_coroutines_core", "(Z)V", "sanitizeStackTraces", "f", "getEnableCreationStackTraces$kotlinx_coroutines_core", "setEnableCreationStackTraces$kotlinx_coroutines_core", "enableCreationStackTraces", "g", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "ignoreCoroutinesWithEmptyContext", "isInstalled$kotlinx_coroutines_debug", "isInstalled", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,620:1\n150#1:638\n151#1,4:640\n156#1,5:645\n150#1:650\n151#1,4:652\n156#1,5:657\n1#2:621\n1#2:639\n1#2:651\n766#3:622\n857#3,2:623\n1208#3,2:625\n1238#3,4:627\n1855#3,2:665\n350#3,7:673\n1819#3,8:680\n603#4:631\n603#4:644\n603#4:656\n603#4:662\n1295#4,2:663\n37#5,2:632\n37#5,2:634\n37#5,2:636\n1627#6,6:667\n1735#6,6:688\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n245#1:638\n245#1:640,4\n245#1:645,5\n252#1:650\n252#1:652,4\n252#1:657,5\n245#1:639\n252#1:651\n110#1:622\n110#1:623,2\n111#1:625,2\n111#1:627,4\n307#1:665,2\n416#1:673,7\n506#1:680,8\n154#1:631\n245#1:644\n252#1:656\n287#1:662\n288#1:663,2\n211#1:632,2\n212#1:634,2\n213#1:636,2\n355#1:667,6\n558#1:688,6\n*E\n"})
public final class DebugProbesImpl {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u001F\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ \u0010\u000F\u001A\u00020\u000E2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0019\u001A\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001C\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001D"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "info", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class CoroutineOwner implements Continuation, CoroutineStackFrame {
        @JvmField
        @NotNull
        public final Continuation delegate;
        @JvmField
        @NotNull
        public final DebugCoroutineInfoImpl info;

        public CoroutineOwner(@NotNull Continuation continuation0, @NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl0) {
            this.delegate = continuation0;
            this.info = debugCoroutineInfoImpl0;
        }

        @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            StackTraceFrame stackTraceFrame0 = this.info.getCreationStackBottom$kotlinx_coroutines_core();
            return stackTraceFrame0 == null ? null : stackTraceFrame0.getCallerFrame();
        }

        @Override  // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame stackTraceFrame0 = this.info.getCreationStackBottom$kotlinx_coroutines_core();
            return stackTraceFrame0 == null ? null : stackTraceFrame0.getStackTraceElement();
        }

        @Override  // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object object0) {
            DebugProbesImpl.access$probeCoroutineCompleted(DebugProbesImpl.INSTANCE, this);
            this.delegate.resumeWith(object0);
        }

        @Override
        @NotNull
        public String toString() {
            return this.delegate.toString();
        }
    }

    @NotNull
    public static final DebugProbesImpl INSTANCE;
    public static final StackTraceElement a;
    public static final SimpleDateFormat b;
    public static Thread c;
    public static final ConcurrentWeakMap d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static final Function1 h;
    public static final ConcurrentWeakMap i;
    public static final h j;
    public static final i k;

    static {
        Object object2;
        DebugProbesImpl.INSTANCE = new DebugProbesImpl();  // 初始化器: Ljava/lang/Object;-><init>()V
        DebugProbesImpl.a = new ArtificialStackFrames().coroutineCreation();
        DebugProbesImpl.b = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Object object0 = null;
        DebugProbesImpl.d = new ConcurrentWeakMap(false, 1, null);
        DebugProbesImpl.e = true;
        DebugProbesImpl.f = true;
        DebugProbesImpl.g = true;
        try {
            Object object1 = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            object2 = Result.constructor-impl(((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object1, 1)));
        }
        catch(Throwable throwable0) {
            object2 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        if(!Result.isFailure-impl(object2)) {
            object0 = object2;
        }
        DebugProbesImpl.h = (Function1)object0;
        DebugProbesImpl.i = new ConcurrentWeakMap(true);
        DebugProbesImpl.j = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
        DebugProbesImpl.k = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(Job job0, LinkedHashMap linkedHashMap0, StringBuilder stringBuilder0, String s) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl0 = (DebugCoroutineInfoImpl)linkedHashMap0.get(job0);
        if(debugCoroutineInfoImpl0 != null) {
            StackTraceElement stackTraceElement0 = (StackTraceElement)CollectionsKt___CollectionsKt.firstOrNull(debugCoroutineInfoImpl0.lastObservedStackTrace$kotlinx_coroutines_core());
            StringBuilder stringBuilder2 = b.t(s);
            a.w(stringBuilder2, (job0 instanceof JobSupport ? ((JobSupport)job0).toDebugString() : job0.toString()), ", continuation is ", debugCoroutineInfoImpl0.getState$kotlinx_coroutines_core(), " at line ");
            stringBuilder2.append(stackTraceElement0);
            stringBuilder2.append('\n');
            stringBuilder0.append(stringBuilder2.toString());
            s = s + '\t';
        }
        else if(!(job0 instanceof ScopeCoroutine)) {
            StringBuilder stringBuilder1 = b.t(s);
            stringBuilder1.append((job0 instanceof JobSupport ? ((JobSupport)job0).toDebugString() : job0.toString()));
            stringBuilder1.append('\n');
            stringBuilder0.append(stringBuilder1.toString());
            s = s + '\t';
        }
        for(Object object0: job0.getChildren()) {
            DebugProbesImpl.a(((Job)object0), linkedHashMap0, stringBuilder0, s);
        }
    }

    public static final boolean access$isFinished(DebugProbesImpl debugProbesImpl0, CoroutineOwner debugProbesImpl$CoroutineOwner0) {
        debugProbesImpl0.getClass();
        CoroutineContext coroutineContext0 = debugProbesImpl$CoroutineOwner0.info.getContext();
        if(coroutineContext0 != null) {
            Job job0 = (Job)coroutineContext0.get(Job.Key);
            if(job0 != null && job0.isCompleted()) {
                DebugProbesImpl.d.remove(debugProbesImpl$CoroutineOwner0);
                return true;
            }
        }
        return false;
    }

    public static final void access$probeCoroutineCompleted(DebugProbesImpl debugProbesImpl0, CoroutineOwner debugProbesImpl$CoroutineOwner0) {
        debugProbesImpl0.getClass();
        DebugProbesImpl.d.remove(debugProbesImpl$CoroutineOwner0);
        CoroutineStackFrame coroutineStackFrame0 = debugProbesImpl$CoroutineOwner0.info.getLastObservedFrame$kotlinx_coroutines_core();
        if(coroutineStackFrame0 != null) {
            do {
                coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
                if(coroutineStackFrame0 == null) {
                    coroutineStackFrame0 = null;
                    break;
                }
            }
            while(coroutineStackFrame0.getStackTraceElement() == null);
            if(coroutineStackFrame0 != null) {
                DebugProbesImpl.i.remove(coroutineStackFrame0);
            }
        }
    }

    public final void b(PrintStream printStream0) {
        if(!this.isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream0.print("Coroutines dump 2025/09/06 08:10:40");
        for(Object object0: SequencesKt___SequencesKt.sortedWith(SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(DebugProbesImpl.d.keySet()), kotlinx.coroutines.debug.internal.a.w), new DebugProbesImpl.dumpCoroutinesSynchronized..inlined.sortedBy.1())) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl0 = ((CoroutineOwner)object0).info;
            List list0 = debugCoroutineInfoImpl0.lastObservedStackTrace$kotlinx_coroutines_core();
            Thread thread0 = debugCoroutineInfoImpl0.lastObservedThread;
            DebugProbesImpl.INSTANCE.getClass();
            List list1 = DebugProbesImpl.c(debugCoroutineInfoImpl0.getState$kotlinx_coroutines_core(), thread0, list0);
            String s = !Intrinsics.areEqual(debugCoroutineInfoImpl0.getState$kotlinx_coroutines_core(), "RUNNING") || list1 != list0 ? debugCoroutineInfoImpl0.getState$kotlinx_coroutines_core() : debugCoroutineInfoImpl0.getState$kotlinx_coroutines_core() + " (Last suspension stacktrace, not an actual stacktrace)";
            printStream0.print("\n\nCoroutine " + ((CoroutineOwner)object0).delegate + ", state: " + s);
            if(list0.isEmpty()) {
                printStream0.print("\n\tat " + DebugProbesImpl.a);
                DebugProbesImpl.d(printStream0, debugCoroutineInfoImpl0.getCreationStackTrace());
            }
            else {
                DebugProbesImpl.d(printStream0, list1);
            }
        }
    }

    public static List c(String s, Thread thread0, List list0) {
        Pair pair0;
        int v3;
        Object object0;
        if(Intrinsics.areEqual(s, "RUNNING") && thread0 != null) {
            try {
                object0 = Result.constructor-impl(thread0.getStackTrace());
            }
            catch(Throwable throwable0) {
                object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            if(Result.isFailure-impl(object0)) {
                object0 = null;
            }
            if(((StackTraceElement[])object0) == null) {
                return list0;
            }
            int v1;
            for(v1 = 0; true; ++v1) {
                if(v1 >= ((StackTraceElement[])object0).length) {
                    v1 = -1;
                    break;
                }
                StackTraceElement stackTraceElement0 = ((StackTraceElement[])object0)[v1];
                if(Intrinsics.areEqual(stackTraceElement0.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement0.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement0.getFileName(), "ContinuationImpl.kt")) {
                    break;
                }
            }
            int v2 = 0;
            while(true) {
                if(v2 >= 3) {
                    pair0 = TuplesKt.to(-1, 0);
                    break;
                }
                DebugProbesImpl.INSTANCE.getClass();
                StackTraceElement stackTraceElement1 = (StackTraceElement)ArraysKt___ArraysKt.getOrNull(((StackTraceElement[])object0), v1 - 1 - v2);
                if(stackTraceElement1 != null) {
                    v3 = 0;
                    for(Object object1: list0) {
                        StackTraceElement stackTraceElement2 = (StackTraceElement)object1;
                        if(Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement1.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement1.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement1.getMethodName())) {
                            goto label_32;
                        }
                        ++v3;
                    }
                }
                v3 = -1;
            label_32:
                if(v3 == -1) {
                    ++v2;
                    continue;
                }
                else {
                    pair0 = TuplesKt.to(v3, v2);
                }
                break;
            }
            int v4 = ((Number)pair0.component1()).intValue();
            int v5 = ((Number)pair0.component2()).intValue();
            if(v4 == -1) {
                return list0;
            }
            List list1 = new ArrayList(list0.size() + v1 - v4 - 1 - v5);
            for(int v = 0; v < v1 - v5; ++v) {
                ((ArrayList)list1).add(((StackTraceElement[])object0)[v]);
            }
            int v6 = v4 + 1;
            int v7 = list0.size();
            while(v6 < v7) {
                ((ArrayList)list1).add(list0.get(v6));
                ++v6;
            }
            return list1;
        }
        return list0;
    }

    public static void d(PrintStream printStream0, List list0) {
        for(Object object0: list0) {
            printStream0.print("\n\tat " + ((StackTraceElement)object0));
        }
    }

    @JvmName(name = "dumpCoroutines")
    public final void dumpCoroutines(@NotNull PrintStream printStream0) {
        synchronized(printStream0) {
            DebugProbesImpl.INSTANCE.b(printStream0);
        }
    }

    @NotNull
    public final List dumpCoroutinesInfo() {
        if(!this.isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.sortedWith(CollectionsKt___CollectionsKt.asSequence(DebugProbesImpl.d.keySet()), new DebugProbesImpl.dumpCoroutinesInfoImpl..inlined.sortedBy.1()), new kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfo..inlined.dumpCoroutinesInfoImpl.1()));

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "R", "", "owner", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,620:1\n1#2:621\n245#3:622\n*E\n"})
        public final class kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfo..inlined.dumpCoroutinesInfoImpl.1 extends Lambda implements Function1 {
            public kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfo..inlined.dumpCoroutinesInfoImpl.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((CoroutineOwner)object0));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineOwner debugProbesImpl$CoroutineOwner0) {
                if(!DebugProbesImpl.access$isFinished(DebugProbesImpl.INSTANCE, debugProbesImpl$CoroutineOwner0)) {
                    CoroutineContext coroutineContext0 = debugProbesImpl$CoroutineOwner0.info.getContext();
                    return coroutineContext0 == null ? null : new DebugCoroutineInfo(debugProbesImpl$CoroutineOwner0.info, coroutineContext0);
                }
                return null;
            }
        }

    }

    @NotNull
    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String s1;
        List list0 = this.dumpCoroutinesInfo();
        int v = list0.size();
        ArrayList arrayList0 = new ArrayList(v);
        ArrayList arrayList1 = new ArrayList(v);
        ArrayList arrayList2 = new ArrayList(v);
        for(Object object0: list0) {
            CoroutineContext coroutineContext0 = ((DebugCoroutineInfo)object0).getContext();
            CoroutineName coroutineName0 = (CoroutineName)coroutineContext0.get(CoroutineName.Key);
            Long long0 = null;
            if(coroutineName0 == null) {
                s1 = null;
            }
            else {
                String s = coroutineName0.getName();
                if(s != null) {
                    s1 = DebugProbesImplKt.access$repr(s.toString());
                }
            }
            String s2 = ((CoroutineDispatcher)coroutineContext0.get(CoroutineDispatcher.Key)) == null ? null : "\"CoroutineDispatcher@5c6abdab\"";
            StringBuilder stringBuilder0 = b.v("\n                {\n                    \"name\": ", s1, ",\n                    \"id\": ");
            CoroutineId coroutineId0 = (CoroutineId)coroutineContext0.get(CoroutineId.Key);
            if(coroutineId0 != null) {
                long0 = coroutineId0.getId();
            }
            stringBuilder0.append(long0);
            stringBuilder0.append(",\n                    \"dispatcher\": ");
            stringBuilder0.append(s2);
            stringBuilder0.append(",\n                    \"sequenceNumber\": ");
            stringBuilder0.append(((DebugCoroutineInfo)object0).getSequenceNumber());
            stringBuilder0.append(",\n                    \"state\": \"");
            stringBuilder0.append(((DebugCoroutineInfo)object0).getState());
            stringBuilder0.append("\"\n                } \n                ");
            arrayList2.add(k.trimIndent(stringBuilder0.toString()));
            arrayList1.add(((DebugCoroutineInfo)object0).getLastObservedFrame());
            arrayList0.add(((DebugCoroutineInfo)object0).getLastObservedThread());
        }
        StringBuilder stringBuilder1 = new StringBuilder("[");
        return new Object[]{wb.a.b(']', CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 0x3F, null), stringBuilder1), arrayList0.toArray(new Thread[0]), arrayList1.toArray(new CoroutineStackFrame[0]), list0.toArray(new DebugCoroutineInfo[0])};
    }

    @NotNull
    public final List dumpDebuggerInfo() {
        if(!this.isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.sortedWith(CollectionsKt___CollectionsKt.asSequence(DebugProbesImpl.d.keySet()), new DebugProbesImpl.dumpCoroutinesInfoImpl..inlined.sortedBy.1()), new kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpDebuggerInfo..inlined.dumpCoroutinesInfoImpl.1()));

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "R", "", "owner", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Ljava/lang/Object;", "kotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,620:1\n1#2:621\n252#3:622\n*E\n"})
        public final class kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpDebuggerInfo..inlined.dumpCoroutinesInfoImpl.1 extends Lambda implements Function1 {
            public kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpDebuggerInfo..inlined.dumpCoroutinesInfoImpl.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((CoroutineOwner)object0));
            }

            @Nullable
            public final Object invoke(@NotNull CoroutineOwner debugProbesImpl$CoroutineOwner0) {
                if(!DebugProbesImpl.access$isFinished(DebugProbesImpl.INSTANCE, debugProbesImpl$CoroutineOwner0)) {
                    CoroutineContext coroutineContext0 = debugProbesImpl$CoroutineOwner0.info.getContext();
                    return coroutineContext0 == null ? null : new DebuggerInfo(debugProbesImpl$CoroutineOwner0.info, coroutineContext0);
                }
                return null;
            }
        }

    }

    public final void e(String s, Continuation continuation0) {
        CoroutineOwner debugProbesImpl$CoroutineOwner0;
        CoroutineStackFrame coroutineStackFrame0 = null;
        if(!this.isInstalled$kotlinx_coroutines_debug()) {
            return;
        }
        if(DebugProbesImpl.g && continuation0.getContext() == EmptyCoroutineContext.INSTANCE) {
            return;
        }
        if(Intrinsics.areEqual(s, "RUNNING")) {
            CoroutineStackFrame coroutineStackFrame1 = continuation0 instanceof CoroutineStackFrame ? ((CoroutineStackFrame)continuation0) : null;
            if(coroutineStackFrame1 == null) {
                return;
            }
            if(this.isInstalled$kotlinx_coroutines_debug()) {
                ConcurrentWeakMap concurrentWeakMap0 = DebugProbesImpl.i;
                DebugCoroutineInfoImpl debugCoroutineInfoImpl0 = (DebugCoroutineInfoImpl)concurrentWeakMap0.remove(coroutineStackFrame1);
                if(debugCoroutineInfoImpl0 == null) {
                    CoroutineStackFrame coroutineStackFrame2 = coroutineStackFrame1;
                    while(true) {
                        if(coroutineStackFrame2 instanceof CoroutineOwner) {
                            debugProbesImpl$CoroutineOwner0 = (CoroutineOwner)coroutineStackFrame2;
                            break;
                        }
                        coroutineStackFrame2 = coroutineStackFrame2.getCallerFrame();
                        if(coroutineStackFrame2 == null) {
                            debugProbesImpl$CoroutineOwner0 = null;
                            break;
                        }
                    }
                    if(debugProbesImpl$CoroutineOwner0 != null) {
                        debugCoroutineInfoImpl0 = debugProbesImpl$CoroutineOwner0.info;
                        if(debugCoroutineInfoImpl0 != null) {
                            CoroutineStackFrame coroutineStackFrame3 = debugCoroutineInfoImpl0.getLastObservedFrame$kotlinx_coroutines_core();
                            if(coroutineStackFrame3 == null) {
                            label_34:
                                coroutineStackFrame3 = null;
                            }
                            else {
                                do {
                                    coroutineStackFrame3 = coroutineStackFrame3.getCallerFrame();
                                    if(coroutineStackFrame3 == null) {
                                        goto label_34;
                                    }
                                }
                                while(coroutineStackFrame3.getStackTraceElement() == null);
                            }
                            if(coroutineStackFrame3 != null) {
                                concurrentWeakMap0.remove(coroutineStackFrame3);
                            }
                            Intrinsics.checkNotNull(coroutineStackFrame1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
                            debugCoroutineInfoImpl0.updateState$kotlinx_coroutines_core(s, ((Continuation)coroutineStackFrame1), true);
                            while(true) {
                            label_39:
                                coroutineStackFrame1 = coroutineStackFrame1.getCallerFrame();
                                if(coroutineStackFrame1 == null) {
                                    break;
                                }
                                if(coroutineStackFrame1.getStackTraceElement() != null) {
                                    coroutineStackFrame0 = coroutineStackFrame1;
                                    break;
                                }
                            }
                            if(coroutineStackFrame0 != null) {
                                concurrentWeakMap0.put(coroutineStackFrame0, debugCoroutineInfoImpl0);
                            }
                        }
                    }
                }
                else {
                    Intrinsics.checkNotNull(coroutineStackFrame1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
                    debugCoroutineInfoImpl0.updateState$kotlinx_coroutines_core(s, ((Continuation)coroutineStackFrame1), false);
                    goto label_39;
                }
            }
            return;
        }
        CoroutineStackFrame coroutineStackFrame4 = continuation0 instanceof CoroutineStackFrame ? ((CoroutineStackFrame)continuation0) : null;
        if(coroutineStackFrame4 != null) {
            while(true) {
                if(coroutineStackFrame4 instanceof CoroutineOwner) {
                    coroutineStackFrame0 = (CoroutineOwner)coroutineStackFrame4;
                    break;
                }
                coroutineStackFrame4 = coroutineStackFrame4.getCallerFrame();
                if(coroutineStackFrame4 == null) {
                    break;
                }
            }
        }
        if(coroutineStackFrame0 == null) {
            return;
        }
        if(this.isInstalled$kotlinx_coroutines_debug()) {
            coroutineStackFrame0.info.updateState$kotlinx_coroutines_core(s, continuation0, true);
        }
    }

    @NotNull
    public final List enhanceStackTraceWithThreadDump(@NotNull DebugCoroutineInfo debugCoroutineInfo0, @NotNull List list0) {
        return DebugProbesImpl.c(debugCoroutineInfo0.getState(), debugCoroutineInfo0.getLastObservedThread(), list0);
    }

    @NotNull
    public final String enhanceStackTraceWithThreadDumpAsJson(@NotNull DebugCoroutineInfo debugCoroutineInfo0) {
        List list0 = this.enhanceStackTraceWithThreadDump(debugCoroutineInfo0, debugCoroutineInfo0.lastObservedStackTrace());
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s = ((StackTraceElement)object0).getFileName();
            arrayList0.add(k.trimIndent(("\n                {\n                    \"declaringClass\": \"" + ((StackTraceElement)object0).getClassName() + "\",\n                    \"methodName\": \"" + ((StackTraceElement)object0).getMethodName() + "\",\n                    \"fileName\": " + (s == null ? null : DebugProbesImplKt.access$repr(s.toString())) + ",\n                    \"lineNumber\": " + ((StackTraceElement)object0).getLineNumber() + "\n                }\n                ")));
        }
        StringBuilder stringBuilder0 = new StringBuilder("[");
        return wb.a.b(']', CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null), stringBuilder0);
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() [...] // 潜在的解密器

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return DebugProbesImpl.g;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return DebugProbesImpl.e;
    }

    @NotNull
    public final String hierarchyToString$kotlinx_coroutines_core(@NotNull Job job0) {
        if(!this.isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Iterable iterable0 = DebugProbesImpl.d.keySet();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((CoroutineOwner)object0).delegate.getContext().get(Job.Key) != null) {
                arrayList0.add(object0);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(arrayList0, 10)), 16));
        for(Object object1: arrayList0) {
            linkedHashMap0.put(JobKt.getJob(((CoroutineOwner)object1).delegate.getContext()), ((CoroutineOwner)object1).info);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        DebugProbesImpl.INSTANCE.getClass();
        DebugProbesImpl.a(job0, linkedHashMap0, stringBuilder0, "");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void install$kotlinx_coroutines_core() {
        if(h.a.incrementAndGet(DebugProbesImpl.j) > 1) {
            return;
        }
        DebugProbesImpl.c = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, j.w, 21, null);
        Function1 function10 = DebugProbesImpl.h;
        if(function10 != null) {
            function10.invoke(Boolean.TRUE);
        }
    }

    @JvmName(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return h.a.get(DebugProbesImpl.j) > 0;
    }

    @NotNull
    public final Continuation probeCoroutineCreated$kotlinx_coroutines_core(@NotNull Continuation continuation0) {
        ArrayList arrayList0;
        CoroutineOwner debugProbesImpl$CoroutineOwner0;
        StackTraceFrame stackTraceFrame0 = null;
        if(!this.isInstalled$kotlinx_coroutines_debug()) {
            return continuation0;
        }
        if(DebugProbesImpl.g && continuation0.getContext() == EmptyCoroutineContext.INSTANCE) {
            return continuation0;
        }
        CoroutineStackFrame coroutineStackFrame0 = continuation0 instanceof CoroutineStackFrame ? ((CoroutineStackFrame)continuation0) : null;
        if(coroutineStackFrame0 != null) {
            while(true) {
                if(coroutineStackFrame0 instanceof CoroutineOwner) {
                    debugProbesImpl$CoroutineOwner0 = (CoroutineOwner)coroutineStackFrame0;
                    goto label_13;
                }
                coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
                if(coroutineStackFrame0 == null) {
                    break;
                }
            }
        }
        debugProbesImpl$CoroutineOwner0 = null;
    label_13:
        if(debugProbesImpl$CoroutineOwner0 != null) {
            return continuation0;
        }
        if(DebugProbesImpl.f) {
            StackTraceElement[] arr_stackTraceElement = new Exception().getStackTrace();
            int v = -1;
            int v1 = arr_stackTraceElement.length - 1;
            if(v1 >= 0) {
                while(true) {
                    if(Intrinsics.areEqual(arr_stackTraceElement[v1].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                        v = v1;
                        break;
                    }
                    if(v1 - 1 < 0) {
                        break;
                    }
                    --v1;
                }
            }
            int v2 = v + 1;
            if(DebugProbesImpl.e) {
                ArrayList arrayList1 = new ArrayList(arr_stackTraceElement.length - v2 + 1);
                while(v2 < arr_stackTraceElement.length) {
                    if(p.startsWith$default(arr_stackTraceElement[v2].getClassName(), "kotlinx.coroutines", false, 2, null)) {
                        arrayList1.add(arr_stackTraceElement[v2]);
                        int v5;
                        for(v5 = v2 + 1; v5 < arr_stackTraceElement.length && p.startsWith$default(arr_stackTraceElement[v5].getClassName(), "kotlinx.coroutines", false, 2, null); ++v5) {
                        }
                        int v6;
                        for(v6 = v5 - 1; v6 > v2 && arr_stackTraceElement[v6].getFileName() == null; --v6) {
                        }
                        if(v6 > v2 && v6 < v5 - 1) {
                            arrayList1.add(arr_stackTraceElement[v6]);
                        }
                        arrayList1.add(arr_stackTraceElement[v5 - 1]);
                        v2 = v5;
                    }
                    else {
                        arrayList1.add(arr_stackTraceElement[v2]);
                        ++v2;
                    }
                }
                arrayList0 = arrayList1;
            }
            else {
                int v4 = arr_stackTraceElement.length - v2;
                arrayList0 = new ArrayList(v4);
                for(int v3 = 0; v3 < v4; ++v3) {
                    arrayList0.add(arr_stackTraceElement[v3 + v2]);
                }
            }
            if(!arrayList0.isEmpty()) {
                ListIterator listIterator0 = arrayList0.listIterator(arrayList0.size());
                while(listIterator0.hasPrevious()) {
                    stackTraceFrame0 = new StackTraceFrame(stackTraceFrame0, ((StackTraceElement)listIterator0.previous()));
                }
            }
            stackTraceFrame0 = new StackTraceFrame(stackTraceFrame0, DebugProbesImpl.a);
        }
        if(this.isInstalled$kotlinx_coroutines_debug()) {
            CoroutineOwner debugProbesImpl$CoroutineOwner1 = new CoroutineOwner(continuation0, new DebugCoroutineInfoImpl(continuation0.getContext(), stackTraceFrame0, i.a.incrementAndGet(DebugProbesImpl.k)));
            ConcurrentWeakMap concurrentWeakMap0 = DebugProbesImpl.d;
            concurrentWeakMap0.put(debugProbesImpl$CoroutineOwner1, Boolean.TRUE);
            if(!this.isInstalled$kotlinx_coroutines_debug()) {
                concurrentWeakMap0.clear();
            }
            return debugProbesImpl$CoroutineOwner1;
        }
        return continuation0;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(@NotNull Continuation continuation0) {
        this.e("RUNNING", continuation0);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(@NotNull Continuation continuation0) {
        this.e("SUSPENDED", continuation0);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z) {
        DebugProbesImpl.f = z;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z) {
        DebugProbesImpl.g = z;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z) {
        DebugProbesImpl.e = z;
    }

    public final void uninstall$kotlinx_coroutines_core() {
        if(!this.isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if(h.a.decrementAndGet(DebugProbesImpl.j) != 0) {
            return;
        }
        Thread thread0 = DebugProbesImpl.c;
        if(thread0 != null) {
            DebugProbesImpl.c = null;
            thread0.interrupt();
            thread0.join();
        }
        DebugProbesImpl.d.clear();
        DebugProbesImpl.i.clear();
        Function1 function10 = DebugProbesImpl.h;
        if(function10 != null) {
            function10.invoke(Boolean.FALSE);
        }
    }
}

