package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001D\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0010\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0012\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001F\u0010\u0014\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0017\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\tH\u0016¢\u0006\u0004\b\u001A\u0010\rR\u0014\u0010\u001D\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "applier", "", "offset", "<init>", "(Landroidx/compose/runtime/Applier;I)V", "node", "", "down", "(Ljava/lang/Object;)V", "up", "()V", "index", "instance", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "count", "remove", "(II)V", "from", "to", "move", "(III)V", "clear", "getCurrent", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4551#2,7:290\n4551#2,7:297\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,7\n286#1:297,7\n*E\n"})
public final class OffsetApplier implements Applier {
    public static final int $stable = 8;
    public final Applier a;
    public final int b;
    public int c;

    public OffsetApplier(@NotNull Applier applier0, int v) {
        this.a = applier0;
        this.b = v;
    }

    @Override  // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override  // androidx.compose.runtime.Applier
    public void down(Object object0) {
        ++this.c;
        this.a.down(object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public Object getCurrent() {
        return this.a.getCurrent();
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertBottomUp(int v, Object object0) {
        this.a.insertBottomUp(v + (this.c == 0 ? this.b : 0), object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertTopDown(int v, Object object0) {
        this.a.insertTopDown(v + (this.c == 0 ? this.b : 0), object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void move(int v, int v1, int v2) {
        int v3 = this.c == 0 ? this.b : 0;
        this.a.move(v + v3, v1 + v3, v2);
    }

    @Override  // androidx.compose.runtime.Applier
    public void remove(int v, int v1) {
        this.a.remove(v + (this.c == 0 ? this.b : 0), v1);
    }

    @Override  // androidx.compose.runtime.Applier
    public void up() {
        if(this.c <= 0) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        --this.c;
        this.a.up();
    }
}

