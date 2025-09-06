package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import g2.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u001E\b\u0002\u0010\u0006\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u0007\u0010\u000BB7\b\u0010\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u001C\u0010\u0006\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\fJ!\u0010\u000F\u001A\u0004\u0018\u00018\u00002\b\u0010\r\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u000E\u001A\u00028\u0000¢\u0006\u0004\b\u000F\u0010\u0010J$\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u00112\n\u0010\u0014\u001A\u0006\u0012\u0002\b\u00030\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0012\u001A\u00020\u00112\n\u0010\u0014\u001A\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001A\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u001CR0\u0010\u0006\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R$\u0010\n\u001A\u00020\t2\u0006\u0010$\u001A\u00020\t8\u0000@BX\u0080\u000E¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(¨\u0006)"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "T", "", "", "name", "Lkotlin/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "isImportantForAccessibility", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "parentValue", "childValue", "merge", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "b", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "<set-?>", "c", "Z", "isImportantForAccessibility$ui_release", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SemanticsPropertyKey {
    public static final int $stable = 8;
    public final String a;
    public final Function2 b;
    public final boolean c;

    public SemanticsPropertyKey(@NotNull String s, @NotNull Function2 function20) {
        this.a = s;
        this.b = function20;
    }

    public SemanticsPropertyKey(String s, Function2 function20, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function20 = c.J;
        }
        this(s, function20);
    }

    public SemanticsPropertyKey(@NotNull String s, boolean z) {
        this(s, null, 2, null);
        this.c = z;
    }

    public SemanticsPropertyKey(@NotNull String s, boolean z, @NotNull Function2 function20) {
        this(s, function20);
        this.c = z;
    }

    @NotNull
    public final Function2 getMergePolicy$ui_release() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public final Object getValue(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull KProperty kProperty0) {
        return SemanticsPropertiesKt.access$throwSemanticsGetNotSupported();
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.c;
    }

    @Nullable
    public final Object merge(@Nullable Object object0, Object object1) {
        return this.b.invoke(object0, object1);
    }

    public final void setValue(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0, @NotNull KProperty kProperty0, Object object0) {
        semanticsPropertyReceiver0.set(this, object0);
    }

    @Override
    @NotNull
    public String toString() {
        return "AccessibilityKey: " + this.a;
    }
}

