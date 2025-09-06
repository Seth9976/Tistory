package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import k1.a;
import k1.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001AJ\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u00042\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001\u00A2\u0006\u0002\b\u0006\u00A2\u0006\u0002\b\u0004\u00A2\u0006\u0004\b\b\u0010\t\u001A^\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u00042\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001\u00A2\u0006\u0002\b\u0006\u00A2\u0006\u0002\b\u0004H\u0007\u00A2\u0006\u0004\b\b\u0010\u000E\u001Ah\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u00042\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001\u00A2\u0006\u0002\b\u0006\u00A2\u0006\u0002\b\u0004H\u0007\u00A2\u0006\u0004\b\b\u0010\u0010\u001Ar\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\f2\b\u0010\u0011\u001A\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u00042\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001\u00A2\u0006\u0002\b\u0006\u00A2\u0006\u0002\b\u0004H\u0007\u00A2\u0006\u0004\b\b\u0010\u0012\u001Al\u0010\b\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\u0016\u0010\u0014\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0013\"\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00A2\u0006\u0002\b\u00042\u001C\u0010\u0007\u001A\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001\u00A2\u0006\u0002\b\u0006\u00A2\u0006\u0002\b\u0004H\u0007\u00A2\u0006\u0004\b\b\u0010\u0015\u001A\u001B\u0010\u001A\u001A\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u001B\u0010\u001B\u001A\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u0019\u001A\u001B\u0010\u001C\u001A\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b\u001C\u0010\u0019\u00A8\u0006\u001D"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "", "fullyQualifiedName", "", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materializeModifier", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "materialize", "materializeWithCompositionLocalInjection", "materializeWithCompositionLocalInjectionInternal", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ComposedModifierKt {
    public static final Modifier a(Composer composer0, Modifier modifier0) {
        if(modifier0.all(c.w)) {
            return modifier0;
        }
        composer0.startReplaceableGroup(1219399079);
        d d0 = new d(composer0);
        Modifier modifier1 = (Modifier)modifier0.foldIn(Modifier.Companion, d0);
        composer0.endReplaceableGroup();
        return modifier1;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier0, @NotNull String s, @Nullable Object object0, @Nullable Object object1, @Nullable Object object2, @NotNull Function1 function10, @NotNull Function3 function30) {
        return modifier0.then(new k1.c(s, object0, object1, object2, function10, function30));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier0, @NotNull String s, @Nullable Object object0, @Nullable Object object1, @NotNull Function1 function10, @NotNull Function3 function30) {
        return modifier0.then(new b(s, object0, object1, function10, function30));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier0, @NotNull String s, @Nullable Object object0, @NotNull Function1 function10, @NotNull Function3 function30) {
        return modifier0.then(new a(s, object0, function10, function30));
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier0, @NotNull String s, @NotNull Object[] arr_object, @NotNull Function1 function10, @NotNull Function3 function30) {
        return modifier0.then(new k1.d(s, arr_object, function10, function30));
    }

    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier0, @NotNull Function1 function10, @NotNull Function3 function30) {
        return modifier0.then(new androidx.compose.ui.b(function10, function30));
    }

    public static Modifier composed$default(Modifier modifier0, String s, Object object0, Object object1, Object object2, Function1 function10, Function3 function30, int v, Object object3) {
        if((v & 16) != 0) {
            function10 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier0, s, object0, object1, object2, function10, function30);
    }

    public static Modifier composed$default(Modifier modifier0, String s, Object object0, Object object1, Function1 function10, Function3 function30, int v, Object object2) {
        if((v & 8) != 0) {
            function10 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier0, s, object0, object1, function10, function30);
    }

    public static Modifier composed$default(Modifier modifier0, String s, Object object0, Function1 function10, Function3 function30, int v, Object object1) {
        if((v & 4) != 0) {
            function10 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier0, s, object0, function10, function30);
    }

    public static Modifier composed$default(Modifier modifier0, String s, Object[] arr_object, Function1 function10, Function3 function30, int v, Object object0) {
        if((v & 4) != 0) {
            function10 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier0, s, arr_object, function10, function30);
    }

    public static Modifier composed$default(Modifier modifier0, Function1 function10, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier0, function10, function30);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for backwards compatibility only. If you are recompiling, use materialize.", replaceWith = @ReplaceWith(expression = "materialize", imports = {}))
    @JvmName(name = "materialize")
    public static final Modifier materialize(Composer composer0, Modifier modifier0) {
        return ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer0, modifier0);
    }

    @JvmName(name = "materializeModifier")
    @NotNull
    public static final Modifier materializeModifier(@NotNull Composer composer0, @NotNull Modifier modifier0) {
        composer0.startReplaceGroup(0x1A365F2C);
        Modifier modifier1 = ComposedModifierKt.a(composer0, modifier0);
        composer0.endReplaceGroup();
        return modifier1;
    }

    @NotNull
    public static final Modifier materializeWithCompositionLocalInjectionInternal(@NotNull Composer composer0, @NotNull Modifier modifier0) {
        return modifier0 == Modifier.Companion ? modifier0 : ComposedModifierKt.materializeModifier(composer0, new CompositionLocalMapInjectionElement(composer0.getCurrentCompositionLocalMap()).then(modifier0));
    }
}

