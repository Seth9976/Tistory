package androidx.compose.foundation.gestures;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u0012\u001A\u00020\u00102#\u0010\u0011\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00100\u000BH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0003J@\u0010\u0015\u001A\u00020\u00102#\u0010\u0011\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000E\u0012\u0004\b\b(\u000F\u0012\u0004\u0012\u00020\u00040\u000BH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001A\u00020\u00102\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001D\u001A\u00020\u001A8F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "<init>", "()V", "", "isEmpty", "()Z", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "request", "enqueue", "(Landroidx/compose/foundation/gestures/ContentInViewNode$Request;)Z", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "bounds", "", "block", "forEachFromSmallest", "(Lkotlin/jvm/functions/Function1;)V", "resumeAndRemoveAll", "resumeAndRemoveWhile", "", "cause", "cancelAndRemoveAll", "(Ljava/lang/Throwable;)V", "", "getSize", "()I", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1208#2:139\n1187#2,2:140\n53#3:142\n523#3:143\n523#3:144\n492#3,11:145\n53#3:156\n523#3:157\n48#3:158\n664#3,2:159\n523#3:161\n13579#4,2:162\n1#5:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:139\n43#1:140,2\n72#1:142\n73#1:143\n91#1:144\n107#1:145,11\n111#1:156\n112#1:157\n121#1:158\n132#1:159,2\n132#1:161\n132#1:162,2\n*E\n"})
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable;
    public final MutableVector a;

    static {
        BringIntoViewRequestPriorityQueue.$stable = MutableVector.$stable;
    }

    public BringIntoViewRequestPriorityQueue() {
        this.a = new MutableVector(new Request[16], 0);
    }

    public final void cancelAndRemoveAll(@Nullable Throwable throwable0) {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.getSize();
        CancellableContinuation[] arr_cancellableContinuation = new CancellableContinuation[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_cancellableContinuation[v2] = ((Request)mutableVector0.getContent()[v2]).getContinuation();
        }
        for(int v1 = 0; v1 < v; ++v1) {
            arr_cancellableContinuation[v1].cancel(throwable0);
        }
        if(!mutableVector0.isEmpty()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean enqueue(@NotNull Request contentInViewNode$Request0) {
        Rect rect0 = (Rect)contentInViewNode$Request0.getCurrentBounds().invoke();
        if(rect0 == null) {
            contentInViewNode$Request0.getContinuation().resumeWith(Unit.INSTANCE);
            return false;
        }
        contentInViewNode$Request0.getContinuation().invokeOnCancellation(new h(this, contentInViewNode$Request0));
        MutableVector mutableVector0 = this.a;
        IntRange intRange0 = new IntRange(0, mutableVector0.getSize() - 1);
        int v = intRange0.getFirst();
        int v1 = intRange0.getLast();
        if(v <= v1) {
            while(true) {
                Rect rect1 = (Rect)((Request)mutableVector0.getContent()[v1]).getCurrentBounds().invoke();
                if(rect1 != null) {
                    Rect rect2 = rect0.intersect(rect1);
                    if(Intrinsics.areEqual(rect2, rect0)) {
                        mutableVector0.add(v1 + 1, contentInViewNode$Request0);
                        return true;
                    }
                    if(!Intrinsics.areEqual(rect2, rect1)) {
                        CancellationException cancellationException0 = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int v2 = mutableVector0.getSize() - 1;
                        if(v2 <= v1) {
                            while(true) {
                                ((Request)mutableVector0.getContent()[v1]).getContinuation().cancel(cancellationException0);
                                if(v2 == v1) {
                                    break;
                                }
                                ++v2;
                            }
                        }
                    }
                }
                if(v1 == v) {
                    break;
                }
                --v1;
            }
        }
        mutableVector0.add(0, contentInViewNode$Request0);
        return true;
    }

    public final void forEachFromSmallest(@NotNull Function1 function10) {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                function10.invoke(((Request)arr_object[v1]).getCurrentBounds().invoke());
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    public final int getSize() {
        return this.a.getSize();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        MutableVector mutableVector0 = this.a;
        IntRange intRange0 = new IntRange(0, mutableVector0.getSize() - 1);
        int v = intRange0.getFirst();
        int v1 = intRange0.getLast();
        if(v <= v1) {
            while(true) {
                ((Request)mutableVector0.getContent()[v]).getContinuation().resumeWith(Unit.INSTANCE);
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        mutableVector0.clear();
    }

    public final void resumeAndRemoveWhile(@NotNull Function1 function10) {
        while(this.a.isNotEmpty() && ((Boolean)function10.invoke(((Request)this.a.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((Request)this.a.removeAt(this.a.getSize() - 1)).getContinuation().resumeWith(Unit.INSTANCE);
        }
    }
}

