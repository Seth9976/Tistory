package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0007\u001A<\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0019\b\u0004\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001AH\u0010\n\u001A\u00020\u0007*\u00020\u00072\u0019\b\b\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0000¢\u0006\u0002\b\u0003H\u0087\b¢\u0006\u0004\b\n\u0010\u000B\u001A4\u0010\r\u001A\u00020\u0007*\u00020\u00072\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0006\u0010\f\u001A\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000E\"(\u0010\u0013\u001A\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00038\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\"\u0010\u0017\u001A\u00020\u00148\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "definitions", "debugInspectorInfo", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "factory", "inspectable", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "wrapped", "inspectableWrapper", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "a", "Lkotlin/jvm/functions/Function1;", "getNoInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "NoInspectorInfo", "", "b", "Z", "isDebugInspectorInfoEnabled", "()Z", "setDebugInspectorInfoEnabled", "(Z)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InspectableValueKt {
    public static final f a;
    public static boolean b;

    static {
        InspectableValueKt.a = f.I;
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Function1 debugInspectorInfo(@NotNull Function1 function10) {
        return InspectableValueKt.getNoInspectorInfo();

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n*L\n1#1,178:1\n*E\n"})
        public final class androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final Function1 w;

            public androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1(Function1 function10) {
                this.w = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                this.w.invoke(inspectorInfo0);
            }
        }

    }

    @NotNull
    public static final Function1 getNoInspectorInfo() {
        return InspectableValueKt.a;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it\'s use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
    @NotNull
    public static final Modifier inspectable(@NotNull Modifier modifier0, @NotNull Function1 function10, @NotNull Function1 function11) {
        return InspectableValueKt.inspectableWrapper(modifier0, function10, ((Modifier)function11.invoke(Modifier.Companion)));
    }

    @PublishedApi
    @NotNull
    public static final Modifier inspectableWrapper(@NotNull Modifier modifier0, @NotNull Function1 function10, @NotNull Modifier modifier1) {
        InspectableModifier inspectableModifier0 = new InspectableModifier(function10);
        return modifier0.then(inspectableModifier0).then(modifier1).then(inspectableModifier0.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() [...] // 潜在的解密器

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        InspectableValueKt.b = z;
    }
}

