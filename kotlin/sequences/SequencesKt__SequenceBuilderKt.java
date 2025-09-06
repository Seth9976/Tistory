package kotlin.sequences;

import java.util.Iterator;
import kf.d;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

public abstract class SequencesKt__SequenceBuilderKt {
    // 检测为 Lambda 实现
    @SinceKotlin(version = "1.3")
    @NotNull
    public static Iterator iterator(@BuilderInference @NotNull Function2 function20) [...]

    @SinceKotlin(version = "1.3")
    @NotNull
    public static Sequence sequence(@BuilderInference @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        return () -> {
            Intrinsics.checkNotNullParameter(this.a, "block");
            Iterator iterator0 = new d();  // 初始化器: Lkotlin/sequences/SequenceScope;-><init>()V
            iterator0.d = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(this.a, iterator0, ((Continuation)iterator0));
            return iterator0;
        };

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000F\u0010\u0002\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
        public final class kotlin.sequences.SequencesKt__SequenceBuilderKt.sequence..inlined.Sequence.1 implements Sequence {
            public kotlin.sequences.SequencesKt__SequenceBuilderKt.sequence..inlined.Sequence.1(Function2 function20) {
            }

            @Override  // kotlin.sequences.Sequence
            @NotNull
            public Iterator iterator() {
                return SequencesKt__SequenceBuilderKt.iterator(this.a);
            }
        }

    }
}

