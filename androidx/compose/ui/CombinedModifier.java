package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000B\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001A\u00028\u00002\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ7\u0010\r\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001A\u00028\u00002\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0011\u001A\u00020\u000F2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000F0\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001A\u00020\u000F2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000F0\u000EH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001A\u0010\u0016\u001A\u00020\u000F2\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u001A\u0010\u0003\u001A\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001F\u001A\u0004\b#\u0010!¨\u0006$"}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/Modifier;", "outer", "inner", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/Modifier;", "getOuter$ui_release", "()Landroidx/compose/ui/Modifier;", "b", "getInner$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CombinedModifier implements Modifier {
    public static final int $stable;
    public final Modifier a;
    public final Modifier b;

    public CombinedModifier(@NotNull Modifier modifier0, @NotNull Modifier modifier1) {
        this.a = modifier0;
        this.b = modifier1;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1 function10) {
        return this.a.all(function10) && this.b.all(function10);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1 function10) {
        return this.a.any(function10) || this.b.any(function10);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof CombinedModifier && Intrinsics.areEqual(this.a, ((CombinedModifier)object0).a) && Intrinsics.areEqual(this.b, ((CombinedModifier)object0).b);
    }

    @Override  // androidx.compose.ui.Modifier
    public Object foldIn(Object object0, @NotNull Function2 function20) {
        Object object1 = this.a.foldIn(object0, function20);
        return this.b.foldIn(object1, function20);
    }

    @Override  // androidx.compose.ui.Modifier
    public Object foldOut(Object object0, @NotNull Function2 function20) {
        Object object1 = this.b.foldOut(object0, function20);
        return this.a.foldOut(object1, function20);
    }

    @NotNull
    public final Modifier getInner$ui_release() {
        return this.b;
    }

    @NotNull
    public final Modifier getOuter$ui_release() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        return a.b(']', ((String)this.foldIn("", androidx.compose.ui.a.w)), stringBuilder0);
    }
}

