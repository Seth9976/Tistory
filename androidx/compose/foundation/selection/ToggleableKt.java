package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import h0.d;
import h0.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AX\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000E\u001AD\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000F\u001AR\u0010\u0010\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00122\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000¢\u0006\u0002\b\u0015\u001A>\u0010\u0010\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00122\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\r0\u0014ø\u0001\u0000¢\u0006\u0002\b\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"toggleable", "Landroidx/compose/ui/Modifier;", "value", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onValueChange", "Lkotlin/Function1;", "", "toggleable-O2vRcR0", "toggleable-XHw0xAI", "triStateToggleable", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "triStateToggleable-O2vRcR0", "triStateToggleable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,493:1\n135#2:494\n135#2:508\n363#3,13:495\n363#3,13:509\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n67#1:494\n299#1:508\n136#1:495,13\n371#1:509,13\n*E\n"})
public final class ToggleableKt {
    @NotNull
    public static final Modifier toggleable-O2vRcR0(@NotNull Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, boolean z1, @Nullable Role role0, @NotNull Function1 function10) {
        if(indication0 instanceof IndicationNodeFactory) {
            return modifier0.then(new ToggleableElement(z, mutableInteractionSource0, ((IndicationNodeFactory)indication0), z1, role0, function10));
        }
        if(indication0 == null) {
            return modifier0.then(new ToggleableElement(z, mutableInteractionSource0, null, z1, role0, function10));
        }
        if(mutableInteractionSource0 != null) {
            return modifier0.then(IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, indication0).then(new ToggleableElement(z, mutableInteractionSource0, null, z1, role0, function10)));
        }
        androidx.compose.foundation.selection.ToggleableKt.toggleable-O2vRcR0..inlined.clickableWithIndicationIfNeeded.1 toggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10 = new Function3(indication0, z, z1, role0, function10) {
            public final Function1 A;
            public final Indication w;
            public final boolean x;
            public final boolean y;
            public final Role z;

            {
                this.w = indication0;
                this.x = z;
                this.y = z1;
                this.z = role0;
                this.A = function10;
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0xA50F4C47);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xA50F4C47, v, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
                }
                MutableInteractionSource mutableInteractionSource0 = composer0.rememberedValue();
                if(mutableInteractionSource0 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                    composer0.updateRememberedValue(mutableInteractionSource0);
                }
                Modifier modifier1 = IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, this.w).then(new ToggleableElement(this.x, mutableInteractionSource0, null, this.y, this.z, this.A));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return modifier1;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        };
        return modifier0.then(ComposedModifierKt.composed$default(Modifier.Companion, null, toggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10, 1, null));
    }

    public static Modifier toggleable-O2vRcR0$default(Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z1, Role role0, Function1 function10, int v, Object object0) {
        if((v & 8) != 0) {
            z1 = true;
        }
        if((v & 16) != 0) {
            role0 = null;
        }
        return ToggleableKt.toggleable-O2vRcR0(modifier0, z, mutableInteractionSource0, indication0, z1, role0, function10);
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier toggleable-XHw0xAI(@NotNull Modifier modifier0, boolean z, boolean z1, @Nullable Role role0, @NotNull Function1 function10) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new d(z, z1, role0, function10));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,178:1\n68#2,6:179\n*E\n"})
        public final class androidx.compose.foundation.selection.ToggleableKt.toggleable-XHw0xAI..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final boolean w;
            public final boolean x;
            public final Role y;
            public final Function1 z;

            public androidx.compose.foundation.selection.ToggleableKt.toggleable-XHw0xAI..inlined.debugInspectorInfo.1(boolean z, boolean z1, Role role0, Function1 function10) {
                this.w = z;
                this.x = z1;
                this.y = role0;
                this.z = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("toggleable");
                ValueElementSequence valueElementSequence0 = a.k(this.w, inspectorInfo0.getProperties(), "value", inspectorInfo0);
                a.k(this.x, valueElementSequence0, "enabled", inspectorInfo0).set("role", this.y);
                inspectorInfo0.getProperties().set("onValueChange", this.z);
            }
        }

    }

    public static Modifier toggleable-XHw0xAI$default(Modifier modifier0, boolean z, boolean z1, Role role0, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return ToggleableKt.toggleable-XHw0xAI(modifier0, z, z1, role0, function10);
    }

    @NotNull
    public static final Modifier triStateToggleable-O2vRcR0(@NotNull Modifier modifier0, @NotNull ToggleableState toggleableState0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, boolean z, @Nullable Role role0, @NotNull Function0 function00) {
        if(indication0 instanceof IndicationNodeFactory) {
            return modifier0.then(new TriStateToggleableElement(toggleableState0, mutableInteractionSource0, ((IndicationNodeFactory)indication0), z, role0, function00));
        }
        if(indication0 == null) {
            return modifier0.then(new TriStateToggleableElement(toggleableState0, mutableInteractionSource0, null, z, role0, function00));
        }
        if(mutableInteractionSource0 != null) {
            return modifier0.then(IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, indication0).then(new TriStateToggleableElement(toggleableState0, mutableInteractionSource0, null, z, role0, function00)));
        }
        androidx.compose.foundation.selection.ToggleableKt.triStateToggleable-O2vRcR0..inlined.clickableWithIndicationIfNeeded.1 toggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10 = new Function3(indication0, toggleableState0, z, role0, function00) {
            public final Function0 A;
            public final Indication w;
            public final ToggleableState x;
            public final boolean y;
            public final Role z;

            {
                this.w = indication0;
                this.x = toggleableState0;
                this.y = z;
                this.z = role0;
                this.A = function00;
                super(3);
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
                composer0.startReplaceGroup(0xA50F4C47);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xA50F4C47, v, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
                }
                MutableInteractionSource mutableInteractionSource0 = composer0.rememberedValue();
                if(mutableInteractionSource0 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                    composer0.updateRememberedValue(mutableInteractionSource0);
                }
                Modifier modifier1 = IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, this.w).then(new TriStateToggleableElement(this.x, mutableInteractionSource0, null, this.y, this.z, this.A));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer0.endReplaceGroup();
                return modifier1;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        };
        return modifier0.then(ComposedModifierKt.composed$default(Modifier.Companion, null, toggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10, 1, null));
    }

    public static Modifier triStateToggleable-O2vRcR0$default(Modifier modifier0, ToggleableState toggleableState0, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, Role role0, Function0 function00, int v, Object object0) {
        if((v & 8) != 0) {
            z = true;
        }
        if((v & 16) != 0) {
            role0 = null;
        }
        return ToggleableKt.triStateToggleable-O2vRcR0(modifier0, toggleableState0, mutableInteractionSource0, indication0, z, role0, function00);
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier triStateToggleable-XHw0xAI(@NotNull Modifier modifier0, @NotNull ToggleableState toggleableState0, boolean z, @Nullable Role role0, @NotNull Function0 function00) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new e(toggleableState0, z, role0, function00));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n1#1,178:1\n300#2,6:179\n*E\n"})
        public final class androidx.compose.foundation.selection.ToggleableKt.triStateToggleable-XHw0xAI..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final ToggleableState w;
            public final boolean x;
            public final Role y;
            public final Function0 z;

            public androidx.compose.foundation.selection.ToggleableKt.triStateToggleable-XHw0xAI..inlined.debugInspectorInfo.1(ToggleableState toggleableState0, boolean z, Role role0, Function0 function00) {
                this.w = toggleableState0;
                this.x = z;
                this.y = role0;
                this.z = function00;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("triStateToggleable");
                inspectorInfo0.getProperties().set("state", this.w);
                a.k(this.x, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("role", this.y);
                inspectorInfo0.getProperties().set("onClick", this.z);
            }
        }

    }

    public static Modifier triStateToggleable-XHw0xAI$default(Modifier modifier0, ToggleableState toggleableState0, boolean z, Role role0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return ToggleableKt.triStateToggleable-XHw0xAI(modifier0, toggleableState0, z, role0, function00);
    }
}

