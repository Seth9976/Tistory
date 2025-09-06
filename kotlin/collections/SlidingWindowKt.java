package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0000\u001AH\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0000\u001AD\u0010\r\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000E\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000E2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0000¨\u0006\u000F"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class SlidingWindowKt {
    public static final void checkWindowSizeStep(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException((v == v1 ? "size " + v + " must be greater than zero." : "Both size " + v + " and step " + v1 + " must be greater than zero.").toString());
        }
    }

    // 检测为 Lambda 实现
    @NotNull
    public static final Iterator windowedIterator(@NotNull Iterator iterator0, int v, int v1, boolean z, boolean z1) [...]

    @NotNull
    public static final Sequence windowedSequence(@NotNull Sequence sequence0, int v, int v1, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        SlidingWindowKt.checkWindowSizeStep(v, v1);
        return () -> {
            Intrinsics.checkNotNullParameter(this.a.iterator(), "iterator");
            return !this.a.iterator().hasNext() ? EmptyIterator.INSTANCE : SequencesKt__SequenceBuilderKt.iterator(new h0(this.b, this.c, this.a.iterator(), this.e, this.d, null));
        };

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000F\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
        public final class kotlin.collections.SlidingWindowKt.windowedSequence..inlined.Sequence.1 implements Sequence {
            public kotlin.collections.SlidingWindowKt.windowedSequence..inlined.Sequence.1(Sequence sequence0, int v, int v1, boolean z, boolean z1) {
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return SlidingWindowKt.windowedIterator(this.a.iterator(), this.b, this.c, this.d, this.e);
            }
        }

    }
}

