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
import h0.b;
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

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001AR\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000E\u001A>\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0002\b\u000F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"selectable", "Landroidx/compose/ui/Modifier;", "selected", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "selectable-O2vRcR0", "selectable-XHw0xAI", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,263:1\n135#2:264\n363#3,13:265\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n69#1:264\n142#1:265,13\n*E\n"})
public final class SelectableKt {
    @NotNull
    public static final Modifier selectable-O2vRcR0(@NotNull Modifier modifier0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, boolean z1, @Nullable Role role0, @NotNull Function0 function00) {
        if(indication0 instanceof IndicationNodeFactory) {
            return modifier0.then(new SelectableElement(z, mutableInteractionSource0, ((IndicationNodeFactory)indication0), z1, role0, function00));
        }
        if(indication0 == null) {
            return modifier0.then(new SelectableElement(z, mutableInteractionSource0, null, z1, role0, function00));
        }
        if(mutableInteractionSource0 != null) {
            return modifier0.then(IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, indication0).then(new SelectableElement(z, mutableInteractionSource0, null, z1, role0, function00)));
        }
        androidx.compose.foundation.selection.SelectableKt.selectable-O2vRcR0..inlined.clickableWithIndicationIfNeeded.1 selectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10 = new Function3(indication0, z, z1, role0, function00) {
            public final Function0 A;
            public final Indication w;
            public final boolean x;
            public final boolean y;
            public final Role z;

            {
                this.w = indication0;
                this.x = z;
                this.y = z1;
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
                Modifier modifier1 = IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, this.w).then(new SelectableElement(this.x, mutableInteractionSource0, null, this.y, this.z, this.A));
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
        return modifier0.then(ComposedModifierKt.composed$default(Modifier.Companion, null, selectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10, 1, null));
    }

    public static Modifier selectable-O2vRcR0$default(Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z1, Role role0, Function0 function00, int v, Object object0) {
        if((v & 8) != 0) {
            z1 = true;
        }
        if((v & 16) != 0) {
            role0 = null;
        }
        return SelectableKt.selectable-O2vRcR0(modifier0, z, mutableInteractionSource0, indication0, z1, role0, function00);
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier selectable-XHw0xAI(@NotNull Modifier modifier0, boolean z, boolean z1, @Nullable Role role0, @NotNull Function0 function00) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new b(z, z1, role0, function00));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,178:1\n70#2,6:179\n*E\n"})
        public final class androidx.compose.foundation.selection.SelectableKt.selectable-XHw0xAI..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final boolean w;
            public final boolean x;
            public final Role y;
            public final Function0 z;

            public androidx.compose.foundation.selection.SelectableKt.selectable-XHw0xAI..inlined.debugInspectorInfo.1(boolean z, boolean z1, Role role0, Function0 function00) {
                this.w = z;
                this.x = z1;
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
                inspectorInfo0.setName("selectable");
                ValueElementSequence valueElementSequence0 = a.k(this.w, inspectorInfo0.getProperties(), "selected", inspectorInfo0);
                a.k(this.x, valueElementSequence0, "enabled", inspectorInfo0).set("role", this.y);
                inspectorInfo0.getProperties().set("onClick", this.z);
            }
        }

    }

    public static Modifier selectable-XHw0xAI$default(Modifier modifier0, boolean z, boolean z1, Role role0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return SelectableKt.selectable-XHw0xAI(modifier0, z, z1, role0, function00);
    }
}

