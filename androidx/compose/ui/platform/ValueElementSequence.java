package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/platform/ValueElementSequence;", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "name", "", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ValueElementSequence implements Sequence {
    public static final int $stable = 8;
    public final ArrayList a;

    public ValueElementSequence() {
        this.a = new ArrayList();
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return this.a.iterator();
    }

    public final void set(@NotNull String s, @Nullable Object object0) {
        ValueElement valueElement0 = new ValueElement(s, object0);
        this.a.add(valueElement0);
    }
}

