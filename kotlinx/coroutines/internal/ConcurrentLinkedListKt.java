package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u001Al\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t\"\u000E\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001A\u00020\u000226\u0010\b\u001A2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A#\u0010\u000E\u001A\u00028\u0000\"\u000E\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A?\u0010\u0017\u001A\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00112!\u0010\u0016\u001A\u001D\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "close", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "cur", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
public final class ConcurrentLinkedListKt {
    public static final Symbol a;

    static {
        ConcurrentLinkedListKt.a = new Symbol("CLOSED");
    }

    @NotNull
    public static final ConcurrentLinkedListNode close(@NotNull ConcurrentLinkedListNode concurrentLinkedListNode0) {
        while(true) {
            Object object0 = ConcurrentLinkedListNode.access$getNextOrClosed(concurrentLinkedListNode0);
            if(object0 == ConcurrentLinkedListKt.a) {
                return concurrentLinkedListNode0;
            }
            if(((ConcurrentLinkedListNode)object0) == null) {
                if(!concurrentLinkedListNode0.markAsClosed()) {
                    continue;
                }
                return concurrentLinkedListNode0;
            }
            concurrentLinkedListNode0 = (ConcurrentLinkedListNode)object0;
        }
    }

    @NotNull
    public static final Object findSegmentAndMoveForward$atomicfu(@Nullable Object object0, @NotNull AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, long v, @NotNull Segment segment0, @NotNull Function2 function20) {
        Object object1;
    alab1:
        while(true) {
            object1 = ConcurrentLinkedListKt.findSegmentInternal(segment0, v, function20);
            if(SegmentOrClosed.isClosed-impl(object1)) {
                break;
            }
            Segment segment1 = SegmentOrClosed.getSegment-impl(object1);
            while(true) {
                Segment segment2 = (Segment)atomicReferenceFieldUpdater0.get(object0);
                if(segment2.id >= segment1.id) {
                    break alab1;
                }
                if(!segment1.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(object0, segment2, segment1)) {
                        if(!segment2.decPointers$kotlinx_coroutines_core()) {
                            break alab1;
                        }
                        segment2.remove();
                        return object1;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(object0) == segment2);
                if(segment1.decPointers$kotlinx_coroutines_core()) {
                    segment1.remove();
                }
            }
        }
        return object1;
    }

    @NotNull
    public static final Object findSegmentAndMoveForward$atomicfu$array(@Nullable Object object0, @NotNull AtomicReferenceArray atomicReferenceArray0, int v, long v1, @NotNull Segment segment0, @NotNull Function2 function20) {
        Object object1;
    alab1:
        while(true) {
            object1 = ConcurrentLinkedListKt.findSegmentInternal(segment0, v1, function20);
            if(SegmentOrClosed.isClosed-impl(object1)) {
                break;
            }
            Segment segment1 = SegmentOrClosed.getSegment-impl(object1);
            while(true) {
                Segment segment2 = (Segment)atomicReferenceArray0.get(v);
                if(segment2.id >= segment1.id) {
                    break alab1;
                }
                if(!segment1.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if(atomicReferenceArray0.compareAndSet(v, segment2, segment1)) {
                        if(!segment2.decPointers$kotlinx_coroutines_core()) {
                            break alab1;
                        }
                        segment2.remove();
                        return object1;
                    }
                }
                while(atomicReferenceArray0.get(v) == segment2);
                if(segment1.decPointers$kotlinx_coroutines_core()) {
                    segment1.remove();
                }
            }
        }
        return object1;
    }

    @NotNull
    public static final Object findSegmentInternal(@NotNull Segment segment0, long v, @NotNull Function2 function20) {
        while(true) {
            if(segment0.id >= v && !segment0.isRemoved()) {
                return segment0;
            }
            Object object0 = ConcurrentLinkedListNode.access$getNextOrClosed(segment0);
            if(object0 == ConcurrentLinkedListKt.a) {
                return ConcurrentLinkedListKt.a;
            }
            Segment segment1 = (Segment)(((ConcurrentLinkedListNode)object0));
            if(segment1 == null) {
                segment1 = (Segment)function20.invoke(((long)(segment0.id + 1L)), segment0);
                if(!segment0.trySetNext(segment1)) {
                    continue;
                }
                if(segment0.isRemoved()) {
                    segment0.remove();
                }
            }
            segment0 = segment1;
        }
    }

    public static final boolean moveForward$atomicfu(@Nullable Object object0, @NotNull AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, @NotNull Segment segment0) {
        while(true) {
            Segment segment1 = (Segment)atomicReferenceFieldUpdater0.get(object0);
            if(Long.compare(segment1.id, segment0.id) >= 0) {
                return true;
            }
            if(!segment0.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(object0, segment1, segment0)) {
                    if(segment1.decPointers$kotlinx_coroutines_core()) {
                        segment1.remove();
                    }
                    return true;
                }
            }
            while(atomicReferenceFieldUpdater0.get(object0) == segment1);
            if(segment0.decPointers$kotlinx_coroutines_core()) {
                segment0.remove();
            }
        }
    }

    public static final boolean moveForward$atomicfu$array(@Nullable Object object0, @NotNull AtomicReferenceArray atomicReferenceArray0, int v, @NotNull Segment segment0) {
        while(true) {
            Segment segment1 = (Segment)atomicReferenceArray0.get(v);
            if(Long.compare(segment1.id, segment0.id) >= 0) {
                return true;
            }
            if(!segment0.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            do {
                if(atomicReferenceArray0.compareAndSet(v, segment1, segment0)) {
                    if(segment1.decPointers$kotlinx_coroutines_core()) {
                        segment1.remove();
                    }
                    return true;
                }
            }
            while(atomicReferenceArray0.get(v) == segment1);
            if(segment0.decPointers$kotlinx_coroutines_core()) {
                segment0.remove();
            }
        }
    }
}

