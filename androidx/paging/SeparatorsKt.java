package androidx.paging;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s4.x1;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A=\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u0002H\u00022\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0000\u00A2\u0006\u0002\u0010\n\u001Ak\u0010\u000B\u001A\u00020\f\"\b\b\u0000\u0010\r*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u0002H\r*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00010\u000E2\b\u0010\u0004\u001A\u0004\u0018\u0001H\r2\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\u000E\u0010\u0010\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0000\u00A2\u0006\u0002\u0010\u0011\u001AI\u0010\u000B\u001A\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u000E2\b\u0010\u0004\u001A\u0004\u0018\u0001H\u00022\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0000\u00A2\u0006\u0002\u0010\u0012\u001Au\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00150\u0014\"\b\b\u0000\u0010\u0002*\u0002H\r\"\b\b\u0001\u0010\r*\u00020\u0003*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00150\u00142\u0006\u0010\u0016\u001A\u00020\u00172.\u0010\u0018\u001A*\b\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0000\u00A2\u0006\u0002\u0010\u001B\u001Ab\u0010\u001C\u001A\b\u0012\u0004\u0012\u0002H\r0\u0001\"\b\b\u0000\u0010\r*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u0002H\r*\b\u0012\u0004\u0012\u0002H\u00020\u00012.\u0010\u0018\u001A*\b\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\r0\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0080@\u00A2\u0006\u0002\u0010\u001D\u00A8\u0006\u001E"}, d2 = {"separatorPage", "Landroidx/paging/TransformablePage;", "T", "", "separator", "originalPageOffsets", "", "hintOriginalPageOffset", "", "hintOriginalIndex", "(Ljava/lang/Object;[III)Landroidx/paging/TransformablePage;", "addSeparatorPage", "", "R", "", "adjacentPageBefore", "adjacentPageAfter", "(Ljava/util/List;Ljava/lang/Object;Landroidx/paging/TransformablePage;Landroidx/paging/TransformablePage;II)V", "(Ljava/util/List;Ljava/lang/Object;[III)V", "insertEventSeparators", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PageEvent;", "terminalSeparatorType", "Landroidx/paging/TerminalSeparatorType;", "generator", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/Flow;Landroidx/paging/TerminalSeparatorType;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "insertInternalSeparators", "(Landroidx/paging/TransformablePage;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSeparators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorsKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,608:1\n53#2:609\n55#2:613\n50#3:610\n55#3:612\n107#4:611\n*S KotlinDebug\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorsKt\n*L\n606#1:609\n606#1:613\n606#1:610\n606#1:612\n606#1:611\n*E\n"})
public final class SeparatorsKt {
    public static final void addSeparatorPage(@NotNull List list0, @Nullable Object object0, @Nullable TransformablePage transformablePage0, @Nullable TransformablePage transformablePage1, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        int[] arr_v = null;
        int[] arr_v1 = transformablePage0 == null ? null : transformablePage0.getOriginalPageOffsets();
        if(transformablePage1 != null) {
            arr_v = transformablePage1.getOriginalPageOffsets();
        }
        if(arr_v1 != null && arr_v != null) {
            arr_v1 = CollectionsKt___CollectionsKt.toIntArray(CollectionsKt___CollectionsKt.sorted(ArraysKt___ArraysKt.distinct(ArraysKt___ArraysJvmKt.plus(arr_v1, arr_v))));
        }
        else if(arr_v1 == null && arr_v != null) {
            arr_v1 = arr_v;
        }
        else if(arr_v1 != null && arr_v == null) {
        }
        else {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        SeparatorsKt.addSeparatorPage(list0, object0, arr_v1, v, v1);
    }

    public static final void addSeparatorPage(@NotNull List list0, @Nullable Object object0, @NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(arr_v, "originalPageOffsets");
        if(object0 == null) {
            return;
        }
        list0.add(SeparatorsKt.separatorPage(object0, arr_v, v, v1));
    }

    @NotNull
    public static final Flow insertEventSeparators(@NotNull Flow flow0, @NotNull TerminalSeparatorType terminalSeparatorType0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(flow0, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType0, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(function30, "generator");
        return new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.paging.SeparatorsKt.insertEventSeparators..inlined.map.1.2 separatorsKt$insertEventSeparators$$inlined$map$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        FlowCollector flowCollector1;
                        androidx.paging.SeparatorsKt.insertEventSeparators..inlined.map.1.2.1 separatorsKt$insertEventSeparators$$inlined$map$1$2$10;
                        if(continuation0 instanceof androidx.paging.SeparatorsKt.insertEventSeparators..inlined.map.1.2.1) {
                            separatorsKt$insertEventSeparators$$inlined$map$1$2$10 = (androidx.paging.SeparatorsKt.insertEventSeparators..inlined.map.1.2.1)continuation0;
                            int v = separatorsKt$insertEventSeparators$$inlined$map$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                separatorsKt$insertEventSeparators$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;
                                    public FlowCollector q;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.p |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                separatorsKt$insertEventSeparators$$inlined$map$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            separatorsKt$insertEventSeparators$$inlined$map$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;
                                public FlowCollector q;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = separatorsKt$insertEventSeparators$$inlined$map$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(separatorsKt$insertEventSeparators$$inlined$map$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.b;
                                separatorsKt$insertEventSeparators$$inlined$map$1$2$10.q = flowCollector0;
                                separatorsKt$insertEventSeparators$$inlined$map$1$2$10.p = 1;
                                Object object3 = this.b.a(((PageEvent)object0), separatorsKt$insertEventSeparators$$inlined$map$1$2$10);
                                if(object3 == object2) {
                                    return object2;
                                }
                                object1 = object3;
                                flowCollector1 = flowCollector0;
                                break;
                            }
                            case 1: {
                                flowCollector1 = separatorsKt$insertEventSeparators$$inlined$map$1$2$10.q;
                                ResultKt.throwOnFailure(object1);
                                break;
                            }
                            case 2: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                        separatorsKt$insertEventSeparators$$inlined$map$1$2$10.q = null;
                        separatorsKt$insertEventSeparators$$inlined$map$1$2$10.p = 2;
                        return flowCollector1.emit(object1, separatorsKt$insertEventSeparators$$inlined$map$1$2$10) == object2 ? object2 : Unit.INSTANCE;
                    }
                };
                Object object0 = flow0.collect(separatorsKt$insertEventSeparators$$inlined$map$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    public static final Object insertInternalSeparators(@NotNull TransformablePage transformablePage0, @NotNull Function3 function30, @NotNull Continuation continuation0) {
        ArrayList arrayList6;
        ArrayList arrayList5;
        x1 x12;
        TransformablePage transformablePage2;
        Object object2;
        int v4;
        int v3;
        int v2;
        TransformablePage transformablePage1;
        Function3 function31;
        x1 x11;
        ArrayList arrayList2;
        ArrayList arrayList1;
        x1 x10;
        if(continuation0 instanceof x1) {
            x10 = (x1)continuation0;
            int v = x10.w;
            if((v & 0x80000000) == 0) {
                x10 = new x1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                x10.w = v ^ 0x80000000;
            }
        }
        else {
            x10 = new x1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = x10.v;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(x10.w) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(transformablePage0.getData().isEmpty()) {
                    Intrinsics.checkNotNull(transformablePage0, "null cannot be cast to non-null type androidx.paging.TransformablePage<R of androidx.paging.SeparatorsKt.insertInternalSeparators>");
                    return transformablePage0;
                }
                int v1 = transformablePage0.getData().size();
                ArrayList arrayList0 = new ArrayList(v1 + 4);
                arrayList1 = new ArrayList(v1 + 4);
                arrayList0.add(CollectionsKt___CollectionsKt.first(transformablePage0.getData()));
                List list0 = transformablePage0.getHintOriginalIndices();
                arrayList1.add(Boxing.boxInt((list0 == null ? 0 : ((Number)CollectionsKt___CollectionsKt.first(list0)).intValue())));
                arrayList2 = arrayList0;
                x11 = x10;
                function31 = function30;
                transformablePage1 = transformablePage0;
                v2 = transformablePage0.getData().size();
                v3 = 1;
                goto label_52;
            }
            case 1: {
                v2 = x10.u;
                v4 = x10.t;
                object2 = x10.s;
                ArrayList arrayList3 = x10.r;
                ArrayList arrayList4 = x10.q;
                Function3 function32 = x10.p;
                transformablePage2 = x10.o;
                ResultKt.throwOnFailure(object0);
                x12 = x10;
                function31 = function32;
                arrayList5 = arrayList4;
                arrayList6 = arrayList3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(object0 != null) {
                arrayList5.add(object0);
                arrayList6.add(Boxing.boxInt(v4));
            }
            arrayList5.add(object2);
            arrayList6.add(Boxing.boxInt(v4));
            v3 = v4 + 1;
            x11 = x12;
            arrayList1 = arrayList6;
            arrayList2 = arrayList5;
            transformablePage1 = transformablePage2;
        label_52:
            if(v3 >= v2) {
                break;
            }
            Object object3 = transformablePage1.getData().get(v3);
            Object object4 = transformablePage1.getData().get(v3 - 1);
            x11.o = transformablePage1;
            x11.p = function31;
            x11.q = arrayList2;
            x11.r = arrayList1;
            x11.s = object3;
            x11.t = v3;
            x11.u = v2;
            x11.w = 1;
            Object object5 = function31.invoke(object4, object3, x11);
            if(object5 == object1) {
                return object1;
            }
            transformablePage2 = transformablePage1;
            v4 = v3;
            object0 = object5;
            x12 = x11;
            object2 = object3;
            arrayList5 = arrayList2;
            arrayList6 = arrayList1;
        }
        if(arrayList2.size() == transformablePage1.getData().size()) {
            Intrinsics.checkNotNull(transformablePage1, "null cannot be cast to non-null type androidx.paging.TransformablePage<R of androidx.paging.SeparatorsKt.insertInternalSeparators>");
            return transformablePage1;
        }
        return new TransformablePage(transformablePage1.getOriginalPageOffsets(), arrayList2, transformablePage1.getHintOriginalPageOffset(), arrayList1);
    }

    @NotNull
    public static final TransformablePage separatorPage(@NotNull Object object0, @NotNull int[] arr_v, int v, int v1) {
        Intrinsics.checkNotNullParameter(object0, "separator");
        Intrinsics.checkNotNullParameter(arr_v, "originalPageOffsets");
        return new TransformablePage(arr_v, k.listOf(object0), v, k.listOf(v1));
    }
}

