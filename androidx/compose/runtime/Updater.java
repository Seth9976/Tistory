package androidx.compose.runtime;

import aa.e;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006JH\u0010\u0011\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072.\b\b\u0010\u000E\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t\u00A2\u0006\u0002\b\rH\u0086\b\u00A2\u0006\u0004\b\u000F\u0010\u0010JI\u0010\u0011\u001A\u00020\f\"\u0004\b\u0001\u0010\u00122\u0006\u0010\b\u001A\u00028\u00012,\u0010\u000E\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t\u00A2\u0006\u0002\b\r\u00A2\u0006\u0004\b\u000F\u0010\u0013JH\u0010\u0015\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\u00072.\b\b\u0010\u000E\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t\u00A2\u0006\u0002\b\rH\u0086\b\u00A2\u0006\u0004\b\u0014\u0010\u0010JI\u0010\u0015\u001A\u00020\f\"\u0004\b\u0001\u0010\u00122\u0006\u0010\b\u001A\u00028\u00012,\u0010\u000E\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t\u00A2\u0006\u0002\b\r\u00A2\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u0019\u001A\u00020\f2\u0017\u0010\u000E\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0016\u00A2\u0006\u0002\b\r\u00A2\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001B\u001A\u00020\f2\u0017\u0010\u000E\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0016\u00A2\u0006\u0002\b\r\u00A2\u0006\u0004\b\u001A\u0010\u0018J\u0010\u0010\u001F\u001A\u00020\u001CH\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\"\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b \u0010!J\u001A\u0010\'\u001A\u00020$2\b\u0010#\u001A\u0004\u0018\u00010\u0002H\u00D6\u0003\u00A2\u0006\u0004\b%\u0010&R\u001A\u0010\u0004\u001A\u00020\u00038\u0000X\u0081\u0004\u00A2\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010+\u0088\u0001\u0004\u0092\u0001\u00020\u0003\u00A8\u0006,"}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "block", "set-impl", "(Landroidx/compose/runtime/Composer;ILkotlin/jvm/functions/Function2;)V", "set", "V", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "init", "reconcile-impl", "reconcile", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "a", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class Updater {
    public final Composer a;

    public Updater(Composer composer0) {
        this.a = composer0;
    }

    public static final Updater box-impl(Composer composer0) {
        return new Updater(composer0);
    }

    @NotNull
    public static Composer constructor-impl(@NotNull Composer composer0) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return Updater.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Composer composer0, Object object0) {
        return object0 instanceof Updater ? Intrinsics.areEqual(composer0, ((Updater)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Composer composer0, Composer composer1) {
        return Intrinsics.areEqual(composer0, composer1);
    }

    @PublishedApi
    public static void getComposer$annotations() {
    }

    @Override
    public int hashCode() {
        return Updater.hashCode-impl(this.a);
    }

    public static int hashCode-impl(Composer composer0) {
        return composer0.hashCode();
    }

    public static final void init-impl(Composer composer0, @NotNull Function1 function10) {
        if(composer0.getInserting()) {
            e e0 = new e(function10, 5);
            composer0.apply(Unit.INSTANCE, e0);
        }
    }

    public static final void reconcile-impl(Composer composer0, @NotNull Function1 function10) {
        e e0 = new e(function10, 6);
        composer0.apply(Unit.INSTANCE, e0);
    }

    public static final void set-impl(Composer composer0, int v, @NotNull Function2 function20) {
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v)) {
            a.t(v, composer0, v, function20);
        }
    }

    public static final void set-impl(Composer composer0, Object object0, @NotNull Function2 function20) {
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), object0)) {
            composer0.updateRememberedValue(object0);
            composer0.apply(object0, function20);
        }
    }

    @Override
    public String toString() {
        return "Updater(composer=" + this.a + ')';
    }

    public static String toString-impl(Composer composer0) [...] // Inlined contents

    public final Composer unbox-impl() {
        return this.a;
    }

    public static final void update-impl(Composer composer0, int v, @NotNull Function2 function20) {
        boolean z = composer0.getInserting();
        if(z || !Intrinsics.areEqual(composer0.rememberedValue(), v)) {
            composer0.updateRememberedValue(v);
            if(!z) {
                composer0.apply(v, function20);
            }
        }
    }

    public static final void update-impl(Composer composer0, Object object0, @NotNull Function2 function20) {
        boolean z = composer0.getInserting();
        if(z || !Intrinsics.areEqual(composer0.rememberedValue(), object0)) {
            composer0.updateRememberedValue(object0);
            if(!z) {
                composer0.apply(object0, function20);
            }
        }
    }
}

