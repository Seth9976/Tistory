package kotlin.sequences;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0016\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lkotlin/sequences/DropTakeSequence;", "T", "Lkotlin/sequences/Sequence;", "drop", "n", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface DropTakeSequence extends Sequence {
    @NotNull
    Sequence drop(int arg1);

    @NotNull
    Sequence take(int arg1);
}

