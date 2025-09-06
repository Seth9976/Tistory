package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import u.b1;
import u.c1;
import u.h1;
import u.x0;
import u.y0;

@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001Ax\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\t\u001A\u0004\u0018\u00010\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\f2\u0006\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u00062\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\b\u0012\u001AV\u0010\u0013\u001A\u00020\u0014*\u00020\u00142\b\u0010\t\u001A\u0004\u0018\u00010\n2\b\u0010\u0015\u001A\u0004\u0018\u00010\u00162\b\b\u0002\u0010\r\u001A\u00020\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u00F8\u0001\u0000\u00A2\u0006\u0002\b\u0017\u001AB\u0010\u0013\u001A\u00020\u0014*\u00020\u00142\b\b\u0002\u0010\r\u001A\u00020\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u00F8\u0001\u0000\u00A2\u0006\u0002\b\u0018\u001AA\u0010\u0019\u001A\u00020\u0014*\u00020\u00142\b\u0010\t\u001A\u0004\u0018\u00010\n2\b\u0010\u0015\u001A\u0004\u0018\u00010\u00162\u001E\b\u0004\u0010\u001A\u001A\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00140\u001BH\u0080\b\u001A\u0088\u0001\u0010\u001C\u001A\u00020\u0014*\u00020\u00142\b\u0010\t\u001A\u0004\u0018\u00010\n2\b\u0010\u0015\u001A\u0004\u0018\u00010\u00162\b\b\u0002\u0010\r\u001A\u00020\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\b\u001D\u001At\u0010\u001C\u001A\u00020\u0014*\u00020\u00142\b\b\u0002\u0010\r\u001A\u00020\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\b\u001E\u001A\u009E\u0001\u0010\u001F\u001A\u00020\u0014*\u00020\u00142\u0006\u0010\t\u001A\u00020\n2\b\u0010\u0015\u001A\u0004\u0018\u00010\u00162\u0006\u0010 \u001A\u00020!2\u0012\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#2\f\u0010&\u001A\b\u0012\u0004\u0012\u00020(0\'2\b\b\u0002\u0010\r\u001A\u00020\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0002\b)\u001A\f\u0010*\u001A\u00020\u000E*\u00020+H\u0000\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006,"}, d2 = {"CombinedClickableNode", "Landroidx/compose/foundation/CombinedClickableNode;", "onClick", "Lkotlin/Function0;", "", "onLongClickLabel", "", "onLongClick", "onDoubleClick", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "", "onClickLabel", "role", "Landroidx/compose/ui/semantics/Role;", "CombinedClickableNode-nSzSaCc", "clickable", "Landroidx/compose/ui/Modifier;", "indication", "Landroidx/compose/foundation/Indication;", "clickable-O2vRcR0", "clickable-XHw0xAI", "clickableWithIndicationIfNeeded", "createClickable", "Lkotlin/Function2;", "combinedClickable", "combinedClickable-XVZzFYc", "combinedClickable-cJG_KMw", "genericClickableWithoutGesture", "indicationScope", "Lkotlinx/coroutines/CoroutineScope;", "currentKeyPressInteractions", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "keyClickOffset", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/geometry/Offset;", "genericClickableWithoutGesture-Kqv-Bsg", "hasScrollableContainer", "Landroidx/compose/ui/node/TraversableNode;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1301:1\n363#1,13:1303\n363#1,13:1317\n135#2:1302\n135#2:1316\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n182#1:1303,13\n336#1:1317,13\n105#1:1302\n242#1:1316\n*E\n"})
public final class ClickableKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final CombinedClickableNode CombinedClickableNode-nSzSaCc(@NotNull Function0 function00, @Nullable String s, @Nullable Function0 function01, @Nullable Function0 function02, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable IndicationNodeFactory indicationNodeFactory0, boolean z, @Nullable String s1, @Nullable Role role0) {
        return new h1(function00, s, function01, function02, mutableInteractionSource0, indicationNodeFactory0, z, s1, role0);
    }

    @NotNull
    public static final Modifier clickable-O2vRcR0(@NotNull Modifier modifier0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, boolean z, @Nullable String s, @Nullable Role role0, @NotNull Function0 function00) {
        if(indication0 instanceof IndicationNodeFactory) {
            return modifier0.then(new ClickableElement(mutableInteractionSource0, ((IndicationNodeFactory)indication0), z, s, role0, function00));
        }
        if(indication0 == null) {
            return modifier0.then(new ClickableElement(mutableInteractionSource0, null, z, s, role0, function00));
        }
        if(mutableInteractionSource0 != null) {
            return modifier0.then(IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, indication0).then(new ClickableElement(mutableInteractionSource0, null, z, s, role0, function00)));
        }
        androidx.compose.foundation.ClickableKt.clickable-O2vRcR0..inlined.clickableWithIndicationIfNeeded.1 clickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10 = new Function3(indication0, z, s, role0, function00) {
            public final Function0 A;
            public final Indication w;
            public final boolean x;
            public final String y;
            public final Role z;

            {
                this.w = indication0;
                this.x = z;
                this.y = s;
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
                Modifier modifier1 = IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, this.w).then(new ClickableElement(mutableInteractionSource0, null, this.x, this.y, this.z, this.A));
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
        return modifier0.then(ComposedModifierKt.composed$default(Modifier.Companion, null, clickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$10, 1, null));
    }

    public static Modifier clickable-O2vRcR0$default(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, String s, Role role0, Function0 function00, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        String s1 = (v & 8) == 0 ? s : null;
        return (v & 16) == 0 ? ClickableKt.clickable-O2vRcR0(modifier0, mutableInteractionSource0, indication0, z, s1, role0, function00) : ClickableKt.clickable-O2vRcR0(modifier0, mutableInteractionSource0, indication0, z, s1, null, function00);
    }

    // 去混淆评级： 低(30)
    @NotNull
    public static final Modifier clickable-XHw0xAI(@NotNull Modifier modifier0, boolean z, @Nullable String s, @Nullable Role role0, @NotNull Function0 function00) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new x0(z, s, role0, function00));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,178:1\n106#2,6:179\n*E\n"})
        public final class androidx.compose.foundation.ClickableKt.clickable-XHw0xAI..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final boolean w;
            public final String x;
            public final Role y;
            public final Function0 z;

            public androidx.compose.foundation.ClickableKt.clickable-XHw0xAI..inlined.debugInspectorInfo.1(boolean z, String s, Role role0, Function0 function00) {
                this.w = z;
                this.x = s;
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
                inspectorInfo0.setName("clickable");
                a.k(this.w, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("onClickLabel", this.x);
                inspectorInfo0.getProperties().set("role", this.y);
                inspectorInfo0.getProperties().set("onClick", this.z);
            }
        }

    }

    public static Modifier clickable-XHw0xAI$default(Modifier modifier0, boolean z, String s, Role role0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return ClickableKt.clickable-XHw0xAI(modifier0, z, s, role0, function00);
    }

    @NotNull
    public static final Modifier clickableWithIndicationIfNeeded(@NotNull Modifier modifier0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, @NotNull Function2 function20) {
        if(indication0 instanceof IndicationNodeFactory) {
            return modifier0.then(((Modifier)function20.invoke(mutableInteractionSource0, indication0)));
        }
        if(indication0 == null) {
            return modifier0.then(((Modifier)function20.invoke(mutableInteractionSource0, null)));
        }
        if(mutableInteractionSource0 != null) {
            return modifier0.then(IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, indication0).then(((Modifier)function20.invoke(mutableInteractionSource0, null))));
        }
        androidx.compose.foundation.ClickableKt.clickableWithIndicationIfNeeded.1 clickableKt$clickableWithIndicationIfNeeded$10 = new Function3(indication0, function20) {
            public final Indication w;
            public final Function2 x;

            {
                this.w = indication0;
                this.x = function20;
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
                Modifier modifier1 = IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, this.w).then(((Modifier)this.x.invoke(mutableInteractionSource0, null)));
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
        return modifier0.then(ComposedModifierKt.composed$default(Modifier.Companion, null, clickableKt$clickableWithIndicationIfNeeded$10, 1, null));
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier combinedClickable-XVZzFYc(@NotNull Modifier modifier0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, boolean z, @Nullable String s, @Nullable Role role0, @Nullable String s1, @Nullable Function0 function00, @Nullable Function0 function01, @NotNull Function0 function02) {
        if(indication0 instanceof IndicationNodeFactory) {
            return modifier0.then(new CombinedClickableElement(function02, s, function00, function01, mutableInteractionSource0, ((IndicationNodeFactory)indication0), z, s1, role0));
        }
        if(indication0 == null) {
            return modifier0.then(new CombinedClickableElement(function02, s, function00, function01, mutableInteractionSource0, null, z, s1, role0));
        }
        if(mutableInteractionSource0 != null) {
            return modifier0.then(IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, indication0).then(new CombinedClickableElement(function02, s, function00, function01, mutableInteractionSource0, null, z, s1, role0)));
        }
        androidx.compose.foundation.ClickableKt.combinedClickable-XVZzFYc..inlined.clickableWithIndicationIfNeeded.1 clickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$10 = new Function3(indication0, z, s, role0, function02, s1, function00, function01) {
            public final Function0 A;
            public final String B;
            public final Function0 C;
            public final Function0 D;
            public final Indication w;
            public final boolean x;
            public final String y;
            public final Role z;

            {
                this.w = indication0;
                this.x = z;
                this.y = s;
                this.z = role0;
                this.A = function00;
                this.B = s1;
                this.C = function01;
                this.D = function02;
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
                Modifier modifier1 = IndicationKt.indication(Modifier.Companion, mutableInteractionSource0, this.w).then(new CombinedClickableElement(this.A, this.y, this.C, this.D, mutableInteractionSource0, null, this.x, this.B, this.z));
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
        return modifier0.then(ComposedModifierKt.composed$default(Modifier.Companion, null, clickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$10, 1, null));
    }

    public static Modifier combinedClickable-XVZzFYc$default(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, String s, Role role0, String s1, Function0 function00, Function0 function01, Function0 function02, int v, Object object0) {
        boolean z1 = (v & 4) == 0 ? z : true;
        String s2 = (v & 8) == 0 ? s : null;
        Role role1 = (v & 16) == 0 ? role0 : null;
        String s3 = (v & 0x20) == 0 ? s1 : null;
        Function0 function03 = (v & 0x40) == 0 ? function00 : null;
        return (v & 0x80) == 0 ? ClickableKt.combinedClickable-XVZzFYc(modifier0, mutableInteractionSource0, indication0, z1, s2, role1, s3, function03, function01, function02) : ClickableKt.combinedClickable-XVZzFYc(modifier0, mutableInteractionSource0, indication0, z1, s2, role1, s3, function03, null, function02);
    }

    // 去混淆评级： 低(30)
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier combinedClickable-cJG_KMw(@NotNull Modifier modifier0, boolean z, @Nullable String s, @Nullable Role role0, @Nullable String s1, @Nullable Function0 function00, @Nullable Function0 function01, @NotNull Function0 function02) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new y0(z, s, role0, function00, function01, function02, s1));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,178:1\n243#2,9:179\n*E\n"})
        public final class androidx.compose.foundation.ClickableKt.combinedClickable-cJG_KMw..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final Function0 A;
            public final Function0 B;
            public final String C;
            public final boolean w;
            public final String x;
            public final Role y;
            public final Function0 z;

            public androidx.compose.foundation.ClickableKt.combinedClickable-cJG_KMw..inlined.debugInspectorInfo.1(boolean z, String s, Role role0, Function0 function00, Function0 function01, Function0 function02, String s1) {
                this.w = z;
                this.x = s;
                this.y = role0;
                this.z = function00;
                this.A = function01;
                this.B = function02;
                this.C = s1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("combinedClickable");
                a.k(this.w, inspectorInfo0.getProperties(), "enabled", inspectorInfo0).set("onClickLabel", this.x);
                inspectorInfo0.getProperties().set("role", this.y);
                inspectorInfo0.getProperties().set("onClick", this.z);
                inspectorInfo0.getProperties().set("onDoubleClick", this.A);
                inspectorInfo0.getProperties().set("onLongClick", this.B);
                inspectorInfo0.getProperties().set("onLongClickLabel", this.C);
            }
        }

    }

    public static Modifier combinedClickable-cJG_KMw$default(Modifier modifier0, boolean z, String s, Role role0, String s1, Function0 function00, Function0 function01, Function0 function02, int v, Object object0) {
        boolean z1 = (v & 1) == 0 ? z : true;
        String s2 = (v & 2) == 0 ? s : null;
        Role role1 = (v & 4) == 0 ? role0 : null;
        String s3 = (v & 8) == 0 ? s1 : null;
        Function0 function03 = (v & 16) == 0 ? function00 : null;
        return (v & 0x20) == 0 ? ClickableKt.combinedClickable-cJG_KMw(modifier0, z1, s2, role1, s3, function03, function01, function02) : ClickableKt.combinedClickable-cJG_KMw(modifier0, z1, s2, role1, s3, function03, null, function02);
    }

    @NotNull
    public static final Modifier genericClickableWithoutGesture-Kqv-Bsg(@NotNull Modifier modifier0, @NotNull MutableInteractionSource mutableInteractionSource0, @Nullable Indication indication0, @NotNull CoroutineScope coroutineScope0, @NotNull Map map0, @NotNull State state0, boolean z, @Nullable String s, @Nullable Role role0, @Nullable String s1, @Nullable Function0 function00, @NotNull Function0 function01) {
        return modifier0.then(FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(KeyInputModifierKt.onKeyEvent(new ClickableSemanticsElement(z, role0, s1, function00, s, function01), new b1(z, map0, state0, coroutineScope0, function01, mutableInteractionSource0)), mutableInteractionSource0, indication0), mutableInteractionSource0, z), z, mutableInteractionSource0));
    }

    public static Modifier genericClickableWithoutGesture-Kqv-Bsg$default(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, Indication indication0, CoroutineScope coroutineScope0, Map map0, State state0, boolean z, String s, Role role0, String s1, Function0 function00, Function0 function01, int v, Object object0) {
        boolean z1 = (v & 0x20) == 0 ? z : true;
        String s2 = (v & 0x40) == 0 ? s : null;
        Role role1 = (v & 0x80) == 0 ? role0 : null;
        String s3 = (v & 0x100) == 0 ? s1 : null;
        return (v & 0x200) == 0 ? ClickableKt.genericClickableWithoutGesture-Kqv-Bsg(modifier0, mutableInteractionSource0, indication0, coroutineScope0, map0, state0, z1, s2, role1, s3, function00, function01) : ClickableKt.genericClickableWithoutGesture-Kqv-Bsg(modifier0, mutableInteractionSource0, indication0, coroutineScope0, map0, state0, z1, s2, role1, s3, null, function01);
    }

    public static final boolean hasScrollableContainer(@NotNull TraversableNode traversableNode0) {
        BooleanRef ref$BooleanRef0 = new BooleanRef();
        c1 c10 = new c1(ref$BooleanRef0);
        TraversableNodeKt.traverseAncestors(traversableNode0, ScrollableContainerNode.TraverseKey, c10);
        return ref$BooleanRef0.element;
    }
}

