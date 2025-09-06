package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.gd;
import androidx.compose.material3.p9;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.room.a;
import d0.s;
import j0.a2;
import j0.b2;
import j0.i1;
import j0.j1;
import j0.k1;
import j0.o1;
import j0.p1;
import j0.r1;
import j0.u1;
import j0.v1;
import j0.w1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001Að\u0001\u0010\"\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0015\u001A\u00020\u00132\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u00112\b\b\u0002\u0010\u001B\u001A\u00020\u001123\b\u0002\u0010!\u001A-\u0012\u001E\u0012\u001C\u0012\u0004\u0012\u00020\u00030\u001C¢\u0006\u0002\b\u001D¢\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001DH\u0001¢\u0006\u0004\b\"\u0010#\u001A4\u0010*\u001A\u00020\u0003*\u00020$2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010&\u001A\u00020%2\u0006\u0010\'\u001A\u00020\u000B2\u0006\u0010)\u001A\u00020(H\u0080@¢\u0006\u0004\b*\u0010+\u001A\u0017\u0010.\u001A\u00020\u00032\u0006\u0010-\u001A\u00020,H\u0001¢\u0006\u0004\b.\u0010/¨\u00061²\u0006\f\u00100\u001A\u00020\u00118\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "CoreTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "bringSelectionEndIntoView", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "writeable", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1252:1\n1223#2,6:1253\n1223#2,6:1259\n1223#2,6:1265\n1223#2,6:1277\n1223#2,6:1283\n1223#2,6:1289\n1223#2,6:1295\n1223#2,6:1301\n1223#2,3:1315\n1226#2,3:1321\n1223#2,6:1325\n1223#2,6:1331\n1223#2,6:1337\n1223#2,6:1343\n1223#2,6:1349\n1223#2,6:1355\n1223#2,6:1361\n1223#2,6:1367\n1223#2,6:1373\n1223#2,6:1379\n1223#2,6:1385\n1223#2,6:1432\n1223#2,6:1439\n1223#2,6:1445\n1223#2,6:1451\n77#3:1271\n77#3:1272\n77#3:1273\n77#3:1274\n77#3:1275\n77#3:1276\n77#3:1307\n77#3:1308\n77#3:1309\n77#3:1438\n488#4:1310\n487#4,4:1311\n491#4,2:1318\n495#4:1324\n487#5:1320\n71#6:1391\n68#6,6:1392\n74#6:1426\n78#6:1430\n78#7,6:1398\n85#7,4:1413\n89#7,2:1423\n93#7:1429\n368#8,9:1404\n377#8:1425\n378#8,2:1427\n4032#9,6:1417\n1#10:1431\n602#11,8:1457\n81#12:1465\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n222#1:1253,6\n223#1:1259,6\n224#1:1265,6\n242#1:1277,6\n245#1:1283,6\n259#1:1289,6\n288#1:1295,6\n291#1:1301,6\n304#1:1315,3\n304#1:1321,3\n305#1:1325,6\n312#1:1331,6\n354#1:1337,6\n380#1:1343,6\n381#1:1349,6\n409#1:1355,6\n426#1:1361,6\n463#1:1367,6\n617#1:1373,6\n621#1:1379,6\n648#1:1385,6\n1192#1:1432,6\n1195#1:1439,6\n1197#1:1445,6\n1209#1:1451,6\n229#1:1271\n230#1:1272\n231#1:1273\n232#1:1274\n233#1:1275\n234#1:1276\n297#1:1307\n298#1:1308\n299#1:1309\n1193#1:1438\n304#1:1310\n304#1:1311,4\n304#1:1318,2\n304#1:1324\n304#1:1320\n803#1:1391\n803#1:1392,6\n803#1:1426\n803#1:1430\n803#1:1398,6\n803#1:1413,4\n803#1:1423,2\n803#1:1429\n803#1:1404,9\n803#1:1425\n803#1:1427,2\n803#1:1417,6\n1237#1:1457,8\n353#1:1465\n*E\n"})
public final class CoreTextFieldKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    public static final void CoreTextField(@NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable TextStyle textStyle0, @Nullable VisualTransformation visualTransformation0, @Nullable Function1 function11, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Brush brush0, boolean z, int v, int v1, @Nullable ImeOptions imeOptions0, @Nullable KeyboardActions keyboardActions0, boolean z1, boolean z2, @Nullable Function3 function30, @Nullable Composer composer0, int v2, int v3, int v4) {
        int v12;
        Function3 function31;
        boolean z5;
        boolean z4;
        KeyboardActions keyboardActions1;
        ImeOptions imeOptions1;
        int v11;
        boolean z3;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        TextStyle textStyle1;
        Modifier modifier1;
        int v21;
        Modifier modifier6;
        int v20;
        int v19;
        int v18;
        ImeOptions imeOptions5;
        ImeOptions imeOptions4;
        MutableInteractionSource mutableInteractionSource3;
        Function3 function32;
        boolean z8;
        boolean z7;
        KeyboardActions keyboardActions2;
        ImeOptions imeOptions2;
        int v14;
        int v13;
        boolean z6;
        Brush brush2;
        MutableInteractionSource mutableInteractionSource2;
        Function1 function13;
        VisualTransformation visualTransformation2;
        TextStyle textStyle2;
        Modifier modifier2;
        ImeOptions imeOptions3;
        Brush brush3;
        Modifier modifier4;
        int v9;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-958708118);
        if((v4 & 1) == 0) {
            v5 = (v2 & 6) == 0 ? (composer1.changed(textFieldValue0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v5 |= (composer1.changed(textStyle0) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v5 |= (composer1.changed(visualTransformation0) ? 0x4000 : 0x2000);
        }
        int v8 = 0x10000;
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v5 |= (composer1.changedInstance(function11) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v5 |= (composer1.changed(brush0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v5 |= (composer1.changed(z) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x30000000) == 0) {
            v5 |= (composer1.changed(v) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v9 = (v3 & 6) == 0 ? v3 | (composer1.changed(v1) ? 4 : 2) : v3;
        }
        else {
            v9 = v3 | 6;
        }
        if((v3 & 0x30) == 0) {
            v9 |= ((v4 & 0x800) != 0 || !composer1.changed(imeOptions0) ? 16 : 0x20);
        }
        int v10 = v9;
        if((v4 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v10 |= (composer1.changed(keyboardActions0) ? 0x100 : 0x80);
        }
        if((v4 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            if(composer1.changed(z1)) {
                v6 = 0x800;
            }
            v10 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v10 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            if(composer1.changed(z2)) {
                v7 = 0x4000;
            }
            v10 |= v7;
        }
        if((v4 & 0x8000) != 0) {
            v10 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            if(composer1.changedInstance(function30)) {
                v8 = 0x20000;
            }
            v10 |= v8;
        }
        if((v5 & 306783379) != 306783378 || (74899 & v10) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                TextStyle textStyle3 = (v4 & 8) == 0 ? textStyle0 : TextStyle.Companion.getDefault();
                VisualTransformation visualTransformation3 = (v4 & 16) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                Function1 function14 = (v4 & 0x20) == 0 ? function11 : i1.w;
                if((v4 & 0x80) == 0) {
                    modifier4 = modifier3;
                    brush3 = brush0;
                }
                else {
                    modifier4 = modifier3;
                    brush3 = new SolidColor(0L, null);
                }
                boolean z9 = (v4 & 0x100) == 0 ? z : true;
                int v15 = (v4 & 0x400) == 0 ? v1 : 1;
                if((v4 & 0x800) == 0) {
                    imeOptions3 = imeOptions0;
                }
                else {
                    imeOptions3 = ImeOptions.Companion.getDefault();
                    v10 &= 0xFFFFFF8F;
                }
                KeyboardActions keyboardActions3 = (v4 & 0x1000) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                z7 = (v4 & 0x2000) == 0 ? z1 : true;
                boolean z10 = (v4 & 0x4000) == 0 ? z2 : false;
                if((v4 & 0x8000) == 0) {
                    modifier2 = modifier4;
                    function32 = function30;
                    z6 = z9;
                    v14 = v15;
                    keyboardActions2 = keyboardActions3;
                    brush2 = brush3;
                    z8 = z10;
                }
                else {
                    modifier2 = modifier4;
                    z6 = z9;
                    v14 = v15;
                    keyboardActions2 = keyboardActions3;
                    brush2 = brush3;
                    z8 = z10;
                    function32 = ComposableSingletons.CoreTextFieldKt.INSTANCE.getLambda-1$foundation_release();
                }
                visualTransformation2 = visualTransformation3;
                function13 = function14;
                v13 = (v4 & 0x200) == 0 ? v : 0x7FFFFFFF;
                imeOptions2 = imeOptions3;
                textStyle2 = textStyle3;
                mutableInteractionSource2 = (v4 & 0x40) == 0 ? mutableInteractionSource0 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x800) != 0) {
                    v10 &= 0xFFFFFF8F;
                }
                modifier2 = modifier0;
                textStyle2 = textStyle0;
                visualTransformation2 = visualTransformation0;
                function13 = function11;
                mutableInteractionSource2 = mutableInteractionSource0;
                brush2 = brush0;
                z6 = z;
                v13 = v;
                v14 = v1;
                imeOptions2 = imeOptions0;
                keyboardActions2 = keyboardActions0;
                z7 = z1;
                z8 = z2;
                function32 = function30;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-958708118, v5, v10, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)");
            }
            FocusRequester focusRequester0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter0 = composer1.rememberedValue();
            if(legacyPlatformTextInputServiceAdapter0 == composer$Companion0.getEmpty()) {
                legacyPlatformTextInputServiceAdapter0 = LegacyPlatformTextInputServiceAdapter_androidKt.createLegacyPlatformTextInputServiceAdapter();
                composer1.updateRememberedValue(legacyPlatformTextInputServiceAdapter0);
            }
            TextInputService textInputService0 = composer1.rememberedValue();
            if(textInputService0 == composer$Companion0.getEmpty()) {
                textInputService0 = new TextInputService(legacyPlatformTextInputServiceAdapter0);
                composer1.updateRememberedValue(textInputService0);
            }
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            Resolver fontFamily$Resolver0 = (Resolver)composer1.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            long v16 = ((TextSelectionColors)composer1.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).getBackgroundColor-0d7_KjU();
            FocusManager focusManager0 = (FocusManager)composer1.consume(CompositionLocalsKt.getLocalFocusManager());
            WindowInfo windowInfo0 = (WindowInfo)composer1.consume(CompositionLocalsKt.getLocalWindowInfo());
            SoftwareKeyboardController softwareKeyboardController0 = (SoftwareKeyboardController)composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Orientation orientation0 = v13 != 1 || z6 || !imeOptions2.getSingleLine() ? Orientation.Vertical : Orientation.Horizontal;
            Object[] arr_object = {orientation0};
            Saver saver0 = TextFieldScrollerPosition.Companion.getSaver();
            boolean z11 = composer1.changed(orientation0);
            s s0 = composer1.rememberedValue();
            if(z11) {
                mutableInteractionSource3 = mutableInteractionSource2;
                s0 = new s(orientation0, 26);
                composer1.updateRememberedValue(s0);
            }
            else {
                mutableInteractionSource3 = mutableInteractionSource2;
                if(s0 == composer$Companion0.getEmpty()) {
                    s0 = new s(orientation0, 26);
                    composer1.updateRememberedValue(s0);
                }
            }
            TextFieldScrollerPosition textFieldScrollerPosition0 = (TextFieldScrollerPosition)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, s0, composer1, 0, 4);
            TransformedText transformedText0 = composer1.rememberedValue();
            if((((v5 & 0xE000) == 0x4000 ? 1 : 0) | ((v5 & 14) == 4 ? 1 : 0)) != 0 || transformedText0 == composer$Companion0.getEmpty()) {
                TransformedText transformedText1 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue0.getAnnotatedString());
                TextRange textRange0 = textFieldValue0.getComposition-MzsxiRA();
                if(textRange0 == null) {
                    imeOptions4 = imeOptions2;
                    transformedText0 = transformedText1;
                }
                else {
                    imeOptions4 = imeOptions2;
                    TransformedText transformedText2 = TextFieldDelegate.Companion.applyCompositionDecoration-72CqOWE(textRange0.unbox-impl(), transformedText1);
                    transformedText0 = transformedText2 == null ? transformedText1 : transformedText2;
                }
                composer1.updateRememberedValue(transformedText0);
            }
            else {
                imeOptions4 = imeOptions2;
            }
            AnnotatedString annotatedString0 = transformedText0.getText();
            OffsetMapping offsetMapping0 = transformedText0.getOffsetMapping();
            RecomposeScope recomposeScope0 = ComposablesKt.getCurrentRecomposeScope(composer1, 0);
            boolean z12 = composer1.changed(softwareKeyboardController0);
            LegacyTextFieldState legacyTextFieldState0 = composer1.rememberedValue();
            if(z12 || legacyTextFieldState0 == composer$Companion0.getEmpty()) {
                legacyTextFieldState0 = new LegacyTextFieldState(new TextDelegate(annotatedString0, textStyle2, 0, 0, z6, 0, ((Density)object0), fontFamily$Resolver0, null, 300, null), recomposeScope0, softwareKeyboardController0);
                composer1.updateRememberedValue(legacyTextFieldState0);
            }
            legacyTextFieldState0.update-fnh65Uc(textFieldValue0.getAnnotatedString(), annotatedString0, textStyle2, z6, ((Density)object0), fontFamily$Resolver0, function10, keyboardActions2, focusManager0, v16);
            legacyTextFieldState0.getProcessor().reset(textFieldValue0, legacyTextFieldState0.getInputSession());
            UndoManager undoManager0 = composer1.rememberedValue();
            if(undoManager0 == composer$Companion0.getEmpty()) {
                undoManager0 = new UndoManager(0, 1, null);
                composer1.updateRememberedValue(undoManager0);
            }
            UndoManager.snapshotIfNeeded$default(undoManager0, textFieldValue0, 0L, 2, null);
            TextFieldSelectionManager textFieldSelectionManager0 = composer1.rememberedValue();
            if(textFieldSelectionManager0 == composer$Companion0.getEmpty()) {
                textFieldSelectionManager0 = new TextFieldSelectionManager(undoManager0);
                composer1.updateRememberedValue(textFieldSelectionManager0);
            }
            textFieldSelectionManager0.setOffsetMapping$foundation_release(offsetMapping0);
            textFieldSelectionManager0.setVisualTransformation$foundation_release(visualTransformation2);
            textFieldSelectionManager0.setOnValueChange$foundation_release(legacyTextFieldState0.getOnValueChange());
            textFieldSelectionManager0.setState$foundation_release(legacyTextFieldState0);
            textFieldSelectionManager0.setValue$foundation_release(textFieldValue0);
            textFieldSelectionManager0.setClipboardManager$foundation_release(((ClipboardManager)composer1.consume(CompositionLocalsKt.getLocalClipboardManager())));
            textFieldSelectionManager0.setTextToolbar(((TextToolbar)composer1.consume(CompositionLocalsKt.getLocalTextToolbar())));
            textFieldSelectionManager0.setHapticFeedBack(((HapticFeedback)composer1.consume(CompositionLocalsKt.getLocalHapticFeedback())));
            textFieldSelectionManager0.setFocusRequester(focusRequester0);
            textFieldSelectionManager0.setEditable(!z8);
            textFieldSelectionManager0.setEnabled(z7);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            BringIntoViewRequester bringIntoViewRequester0 = composer1.rememberedValue();
            if(bringIntoViewRequester0 == composer$Companion0.getEmpty()) {
                bringIntoViewRequester0 = BringIntoViewRequesterKt.BringIntoViewRequester();
                composer1.updateRememberedValue(bringIntoViewRequester0);
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            boolean z13 = composer1.changedInstance(legacyTextFieldState0);
            boolean z14 = composer1.changedInstance(textInputService0);
            int v17 = v10 & 0x70 ^ 0x30;
            if(v17 > 0x20) {
                imeOptions5 = imeOptions4;
                if(composer1.changed(imeOptions5)) {
                    v18 = v10;
                    v19 = v10 & 0xE000;
                    v20 = 1;
                }
                else {
                    v19 = v10 & 0xE000;
                    v18 = v10;
                    v20 = (v10 & 0x30) == 0x20 ? 1 : 0;
                }
            }
            else {
                imeOptions5 = imeOptions4;
                v19 = v10 & 0xE000;
                v18 = v10;
                v20 = (v10 & 0x30) == 0x20 ? 1 : 0;
            }
            boolean z15 = composer1.changedInstance(offsetMapping0);
            boolean z16 = composer1.changedInstance(coroutineScope0);
            boolean z17 = composer1.changedInstance(bringIntoViewRequester0);
            boolean z18 = composer1.changedInstance(textFieldSelectionManager0);
            r1 r10 = composer1.rememberedValue();
            if((v20 | (z13 | (v10 & 0x1C00) == 0x800 | ((v10 & 0xE000) == 0x4000 ? 1 : 0) | z14 | ((v5 & 14) == 4 ? 1 : 0)) | z15 | z16 | z17 | z18) != 0 || r10 == composer$Companion0.getEmpty()) {
                r10 = new r1(legacyTextFieldState0, z7, z8, textInputService0, textFieldValue0, imeOptions5, offsetMapping0, textFieldSelectionManager0, coroutineScope0, bringIntoViewRequester0);
                composer1.updateRememberedValue(r10);
            }
            Modifier modifier5 = TextFieldGestureModifiersKt.textFieldFocusModifier(modifier$Companion0, z7, focusRequester0, mutableInteractionSource3, r10);
            State state0 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z7 && !z8), composer1, 0);
            Unit unit0 = Unit.INSTANCE;
            boolean z19 = composer1.changed(state0);
            boolean z20 = composer1.changedInstance(legacyTextFieldState0);
            boolean z21 = composer1.changedInstance(textInputService0);
            boolean z22 = composer1.changedInstance(textFieldSelectionManager0);
            if(v17 <= 0x20 || !composer1.changed(imeOptions5)) {
                modifier6 = modifier5;
                v21 = (v18 & 0x30) == 0x20 ? 1 : 0;
            }
            else {
                modifier6 = modifier5;
                v21 = 1;
            }
            j1 j10 = composer1.rememberedValue();
            if((z19 | z20 | z21 | z22 | v21) != 0 || j10 == composer$Companion0.getEmpty()) {
                j10 = new j1(legacyTextFieldState0, state0, textInputService0, textFieldSelectionManager0, imeOptions5, null);
                composer1.updateRememberedValue(j10);
            }
            EffectsKt.LaunchedEffect(unit0, j10, composer1, 6);
            boolean z23 = composer1.changedInstance(legacyTextFieldState0);
            p1 p10 = composer1.rememberedValue();
            if(z23 || p10 == composer$Companion0.getEmpty()) {
                p10 = new p1(legacyTextFieldState0, 1);
                composer1.updateRememberedValue(p10);
            }
            Modifier modifier7 = SelectionGesturesKt.updateSelectionTouchMode(modifier$Companion0, p10);
            boolean z24 = composer1.changedInstance(legacyTextFieldState0);
            boolean z25 = composer1.changedInstance(offsetMapping0);
            boolean z26 = composer1.changedInstance(textFieldSelectionManager0);
            d d0 = composer1.rememberedValue();
            if((z24 | v19 == 0x4000 | ((v10 & 0x1C00) == 0x800 ? 1 : 0) | z25 | z26) != 0 || d0 == composer$Companion0.getEmpty()) {
                d0 = new d(legacyTextFieldState0, focusRequester0, z8, z7, textFieldSelectionManager0, offsetMapping0);
                composer1.updateRememberedValue(d0);
            }
            Modifier modifier8 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(modifier7, mutableInteractionSource3, z7, d0), textFieldSelectionManager0.getMouseSelectionObserver$foundation_release(), textFieldSelectionManager0.getTouchSelectionObserver$foundation_release()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
            boolean z27 = composer1.changedInstance(legacyTextFieldState0);
            boolean z28 = composer1.changedInstance(offsetMapping0);
            b b0 = composer1.rememberedValue();
            if((z27 | (v5 & 14) == 4 | z28) != 0 || b0 == composer$Companion0.getEmpty()) {
                b0 = new b(legacyTextFieldState0, textFieldValue0, offsetMapping0);
                composer1.updateRememberedValue(b0);
            }
            Modifier modifier9 = DrawModifierKt.drawBehind(modifier$Companion0, b0);
            boolean z29 = composer1.changedInstance(legacyTextFieldState0);
            boolean z30 = composer1.changed(windowInfo0);
            boolean z31 = composer1.changedInstance(textFieldSelectionManager0);
            boolean z32 = composer1.changedInstance(offsetMapping0);
            c c0 = composer1.rememberedValue();
            if((z29 | (v10 & 0x1C00) == 0x800 | z30 | z31 | ((v5 & 14) == 4 ? 1 : 0) | z32) != 0 || c0 == composer$Companion0.getEmpty()) {
                c0 = new c(legacyTextFieldState0, z7, windowInfo0, textFieldSelectionManager0, textFieldValue0, offsetMapping0);
                composer1.updateRememberedValue(c0);
            }
            Modifier modifier10 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier$Companion0, c0);
            boolean z33 = composer1.changedInstance(transformedText0);
            boolean z34 = composer1.changed(visualTransformation2 instanceof PasswordVisualTransformation);
            boolean z35 = composer1.changedInstance(legacyTextFieldState0);
            boolean z36 = composer1.changedInstance(offsetMapping0);
            boolean z37 = composer1.changedInstance(textFieldSelectionManager0);
            int v22 = (v17 <= 0x20 || !composer1.changed(imeOptions5)) && (v18 & 0x30) != 0x20 ? 0 : 1;
            u1 u10 = composer1.rememberedValue();
            if((((v10 & 0x1C00) == 0x800 ? 1 : 0) | (z33 | (v5 & 14) == 4) | z34 | (v19 == 0x4000 ? 1 : 0) | z35 | z36 | z37 | v22) != 0 || u10 == composer$Companion0.getEmpty()) {
                u10 = new u1(transformedText0, textFieldValue0, z7, visualTransformation2 instanceof PasswordVisualTransformation, z8, imeOptions5, legacyTextFieldState0, offsetMapping0, textFieldSelectionManager0, focusRequester0);
                composer1.updateRememberedValue(u10);
            }
            Modifier modifier11 = SemanticsModifierKt.semantics(modifier$Companion0, true, u10);
            Modifier modifier12 = TextFieldCursorKt.cursor(modifier$Companion0, legacyTextFieldState0, textFieldValue0, offsetMapping0, brush2, z7 && !z8 && windowInfo0.isWindowFocused() && !legacyTextFieldState0.hasHighlight());
            boolean z38 = composer1.changedInstance(textFieldSelectionManager0);
            k1 k10 = composer1.rememberedValue();
            if(z38 || k10 == composer$Companion0.getEmpty()) {
                k10 = new k1(textFieldSelectionManager0, 0);
                composer1.updateRememberedValue(k10);
            }
            EffectsKt.DisposableEffect(textFieldSelectionManager0, k10, composer1, 0);
            boolean z39 = composer1.changedInstance(legacyTextFieldState0);
            boolean z40 = composer1.changedInstance(textInputService0);
            int v23 = (v17 <= 0x20 || !composer1.changed(imeOptions5)) && (v18 & 0x30) != 0x20 ? 0 : 1;
            androidx.compose.foundation.text.a a0 = composer1.rememberedValue();
            if((((v5 & 14) == 4 ? 1 : 0) | (z39 | z40) | v23) != 0 || a0 == composer$Companion0.getEmpty()) {
                a0 = new androidx.compose.foundation.text.a(legacyTextFieldState0, textInputService0, textFieldValue0, imeOptions5);
                composer1.updateRememberedValue(a0);
            }
            EffectsKt.DisposableEffect(imeOptions5, a0, composer1, v18 >> 3 & 14);
            Modifier modifier13 = TextFieldKeyInputKt.textFieldKeyInput-2WJ9YEU(modifier$Companion0, legacyTextFieldState0, textFieldSelectionManager0, textFieldValue0, legacyTextFieldState0.getOnValueChange(), !z8, v13 == 1, offsetMapping0, undoManager0, imeOptions5.getImeAction-eUduSuo());
            boolean z41 = ((Boolean)state0.getValue()).booleanValue();
            boolean z42 = composer1.changedInstance(legacyTextFieldState0);
            boolean z43 = v17 > 0x20 && composer1.changed(imeOptions5) || (v18 & 0x30) == 0x20;
            boolean z44 = composer1.changedInstance(legacyPlatformTextInputServiceAdapter0);
            v1 v10_1 = composer1.rememberedValue();
            if((z42 | z43 | z44) != 0 || v10_1 == composer$Companion0.getEmpty()) {
                v10_1 = new v1(legacyTextFieldState0, focusRequester0, imeOptions5, legacyPlatformTextInputServiceAdapter0);
                composer1.updateRememberedValue(v10_1);
            }
            Modifier modifier14 = StylusHandwritingKt.stylusHandwriting(modifier$Companion0, z41, v10_1);
            Modifier modifier15 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(KeyInputModifierKt.onPreviewKeyEvent(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier2, legacyPlatformTextInputServiceAdapter0, legacyTextFieldState0, textFieldSelectionManager0).then(modifier14).then(modifier6), legacyTextFieldState0, focusManager0), new b2(0, legacyTextFieldState0, textFieldSelectionManager0)).then(modifier13), textFieldScrollerPosition0, mutableInteractionSource3, z7).then(modifier8).then(modifier11), new p1(legacyTextFieldState0, 0));
            boolean z45 = z7 && legacyTextFieldState0.getHasFocus() && legacyTextFieldState0.isInTouchMode() && windowInfo0.isWindowFocused();
            Modifier modifier16 = z45 ? TextFieldSelectionManager_androidKt.textFieldMagnifier(modifier$Companion0, textFieldSelectionManager0) : modifier$Companion0;
            CoreTextFieldKt.a(modifier15, textFieldSelectionManager0, ComposableLambdaKt.rememberComposableLambda(0xE9B00DE0, true, new o1(function32, legacyTextFieldState0, textStyle2, v14, v13, textFieldScrollerPosition0, textFieldValue0, visualTransformation2, modifier12, modifier9, modifier10, modifier16, bringIntoViewRequester0, textFieldSelectionManager0, z45, z8, function13, offsetMapping0, ((Density)object0)), composer1, 54), composer1, 0x180);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle1 = textStyle2;
            function12 = function13;
            visualTransformation1 = visualTransformation2;
            brush1 = brush2;
            z3 = z6;
            v12 = v14;
            modifier1 = modifier2;
            keyboardActions1 = keyboardActions2;
            z4 = z7;
            imeOptions1 = imeOptions5;
            v11 = v13;
            mutableInteractionSource1 = mutableInteractionSource3;
            z5 = z8;
            function31 = function32;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            z3 = z;
            v11 = v;
            imeOptions1 = imeOptions0;
            keyboardActions1 = keyboardActions0;
            z4 = z1;
            z5 = z2;
            function31 = function30;
            v12 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0.s(textFieldValue0, function10, modifier1, textStyle1, visualTransformation1, function12, mutableInteractionSource1, brush1, z3, v11, v12, imeOptions1, keyboardActions1, z4, z5, function31, v2, v3, v4));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TextFieldCursorHandle(@NotNull TextFieldSelectionManager textFieldSelectionManager0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1436003720);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(textFieldSelectionManager0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, v1, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
            if(legacyTextFieldState0 == null || !legacyTextFieldState0.getShowCursorHandle()) {
                composer1.startReplaceGroup(0xEF0E94BE);
            }
            else {
                AnnotatedString annotatedString0 = textFieldSelectionManager0.getTransformedText$foundation_release();
                if(annotatedString0 == null || annotatedString0.length() <= 0) {
                    composer1.startReplaceGroup(0xEF0E94BE);
                }
                else {
                    composer1.startReplaceGroup(0xEEFC6D68);
                    boolean z = composer1.changed(textFieldSelectionManager0);
                    TextDragObserver textDragObserver0 = composer1.rememberedValue();
                    if(z || textDragObserver0 == Composer.Companion.getEmpty()) {
                        textDragObserver0 = textFieldSelectionManager0.cursorDragObserver$foundation_release();
                        composer1.updateRememberedValue(textDragObserver0);
                    }
                    long v2 = textFieldSelectionManager0.getCursorPosition-tuRUvjQ$foundation_release(((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())));
                    boolean z1 = composer1.changed(v2);
                    w1 w10 = composer1.rememberedValue();
                    if(z1 || w10 == Composer.Companion.getEmpty()) {
                        w10 = new w1(v2);
                        composer1.updateRememberedValue(w10);
                    }
                    androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                    boolean z2 = composer1.changedInstance(textDragObserver0);
                    boolean z3 = composer1.changedInstance(textFieldSelectionManager0);
                    a2 a20 = composer1.rememberedValue();
                    if(z2 || z3 || a20 == Composer.Companion.getEmpty()) {
                        a20 = new a2(textDragObserver0, textFieldSelectionManager0, null);
                        composer1.updateRememberedValue(a20);
                    }
                    Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, textDragObserver0, a20);
                    boolean z4 = composer1.changed(v2);
                    aa.c c0 = composer1.rememberedValue();
                    if(z4 || c0 == Composer.Companion.getEmpty()) {
                        c0 = new aa.c(v2, 1);
                        composer1.updateRememberedValue(c0);
                    }
                    AndroidCursorHandle_androidKt.CursorHandle-USBMPiE(w10, SemanticsModifierKt.semantics$default(modifier0, false, c0, 1, null), 0L, composer1, 0, 4);
                }
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(textFieldSelectionManager0, v, 8));
        }
    }

    public static final void a(Modifier modifier0, TextFieldSelectionManager textFieldSelectionManager0, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-20551815);
        int v1 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changedInstance(textFieldSelectionManager0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20551815, v1, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager0, function20, composer1, v1 >> 3 & 0x7E);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(v, 9, modifier0, textFieldSelectionManager0, function20));
        }
    }

    public static final boolean access$CoreTextField$lambda$11(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final void access$SelectionToolbarAndHandles(TextFieldSelectionManager textFieldSelectionManager0, boolean z, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(626339208);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(textFieldSelectionManager0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, v1, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if(z) {
                composer1.startReplaceGroup(0xB3557EDE);
                LegacyTextFieldState legacyTextFieldState0 = textFieldSelectionManager0.getState$foundation_release();
                TextLayoutResult textLayoutResult0 = null;
                if(legacyTextFieldState0 != null) {
                    TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
                    if(textLayoutResultProxy0 != null) {
                        TextLayoutResult textLayoutResult1 = textLayoutResultProxy0.getValue();
                        if(textLayoutResult1 != null) {
                            LegacyTextFieldState legacyTextFieldState1 = textFieldSelectionManager0.getState$foundation_release();
                            if(!(legacyTextFieldState1 == null ? true : legacyTextFieldState1.isLayoutResultStale())) {
                                textLayoutResult0 = textLayoutResult1;
                            }
                        }
                    }
                }
                if(textLayoutResult0 == null) {
                    composer1.startReplaceGroup(0xB3596F74);
                }
                else {
                    composer1.startReplaceGroup(0xB3596F75);
                    if(TextRange.getCollapsed-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE())) {
                        composer1.startReplaceGroup(0x9BE2C2DA);
                    }
                    else {
                        composer1.startReplaceGroup(-1680616096);
                        int v2 = textFieldSelectionManager0.getOffsetMapping$foundation_release().originalToTransformed(TextRange.getStart-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE()));
                        int v3 = textFieldSelectionManager0.getOffsetMapping$foundation_release().originalToTransformed(TextRange.getEnd-impl(textFieldSelectionManager0.getValue$foundation_release().getSelection-d9O1mEE()));
                        ResolvedTextDirection resolvedTextDirection0 = textLayoutResult0.getBidiRunDirection(v2);
                        ResolvedTextDirection resolvedTextDirection1 = textLayoutResult0.getBidiRunDirection(Math.max(v3 - 1, 0));
                        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager0.getState$foundation_release();
                        if(legacyTextFieldState2 == null || !legacyTextFieldState2.getShowSelectionHandleStart()) {
                            composer1.startReplaceGroup(-1679975078);
                        }
                        else {
                            composer1.startReplaceGroup(0x9BD9EF1F);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, resolvedTextDirection0, textFieldSelectionManager0, composer1, v1 << 6 & 0x380 | 6);
                        }
                        composer1.endReplaceGroup();
                        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager0.getState$foundation_release();
                        if(legacyTextFieldState3 == null || !legacyTextFieldState3.getShowSelectionHandleEnd()) {
                            composer1.startReplaceGroup(0x9BE27D1A);
                        }
                        else {
                            composer1.startReplaceGroup(0x9BDED2A0);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, resolvedTextDirection1, textFieldSelectionManager0, composer1, v1 << 6 & 0x380 | 6);
                        }
                        composer1.endReplaceGroup();
                    }
                    composer1.endReplaceGroup();
                    LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager0.getState$foundation_release();
                    if(legacyTextFieldState4 != null) {
                        if(textFieldSelectionManager0.isTextChanged$foundation_release()) {
                            legacyTextFieldState4.setShowFloatingToolbar(false);
                        }
                        if(legacyTextFieldState4.getHasFocus()) {
                            if(legacyTextFieldState4.getShowFloatingToolbar()) {
                                textFieldSelectionManager0.showSelectionToolbar$foundation_release();
                            }
                            else {
                                textFieldSelectionManager0.hideSelectionToolbar$foundation_release();
                            }
                        }
                    }
                }
                composer1.endReplaceGroup();
                composer1.endReplaceGroup();
            }
            else {
                composer1.startReplaceGroup(0x26D2223F);
                composer1.endReplaceGroup();
                textFieldSelectionManager0.hideSelectionToolbar$foundation_release();
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p9(v, z, 1, textFieldSelectionManager0));
        }
    }

    public static final void access$endInputSession(LegacyTextFieldState legacyTextFieldState0) {
        TextInputSession textInputSession0 = legacyTextFieldState0.getInputSession();
        if(textInputSession0 != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(textInputSession0, legacyTextFieldState0.getProcessor(), legacyTextFieldState0.getOnValueChange());
        }
        legacyTextFieldState0.setInputSession(null);
    }

    public static final void access$startInputSession(TextInputService textInputService0, LegacyTextFieldState legacyTextFieldState0, TextFieldValue textFieldValue0, ImeOptions imeOptions0, OffsetMapping offsetMapping0) {
        legacyTextFieldState0.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService0, textFieldValue0, legacyTextFieldState0.getProcessor(), imeOptions0, legacyTextFieldState0.getOnValueChange(), legacyTextFieldState0.getOnImeActionPerformed()));
        CoreTextFieldKt.b(legacyTextFieldState0, textFieldValue0, offsetMapping0);
    }

    public static final void access$tapToFocus(LegacyTextFieldState legacyTextFieldState0, FocusRequester focusRequester0, boolean z) {
        if(!legacyTextFieldState0.getHasFocus()) {
            focusRequester0.requestFocus();
            return;
        }
        if(z) {
            SoftwareKeyboardController softwareKeyboardController0 = legacyTextFieldState0.getKeyboardController();
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.show();
            }
        }
    }

    public static final void b(LegacyTextFieldState legacyTextFieldState0, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0) {
        androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0 = Snapshot.Companion;
        Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
        try {
            TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
            if(textLayoutResultProxy0 == null) {
                return;
            }
            TextInputSession textInputSession0 = legacyTextFieldState0.getInputSession();
            if(textInputSession0 == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates0 = legacyTextFieldState0.getLayoutCoordinates();
            if(layoutCoordinates0 == null) {
                return;
            }
            boolean z = legacyTextFieldState0.getHasFocus();
            TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue0, legacyTextFieldState0.getTextDelegate(), textLayoutResultProxy0.getValue(), layoutCoordinates0, textInputSession0, z, offsetMapping0);
        }
        finally {
            snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
        }
    }

    @Nullable
    public static final Object bringSelectionEndIntoView(@NotNull BringIntoViewRequester bringIntoViewRequester0, @NotNull TextFieldValue textFieldValue0, @NotNull TextDelegate textDelegate0, @NotNull TextLayoutResult textLayoutResult0, @NotNull OffsetMapping offsetMapping0, @NotNull Continuation continuation0) {
        Rect rect0;
        int v = offsetMapping0.originalToTransformed(TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()));
        if(v < textLayoutResult0.getLayoutInput().getText().length()) {
            rect0 = textLayoutResult0.getBoundingBox(v);
        }
        else {
            rect0 = v == 0 ? new Rect(0.0f, 0.0f, 1.0f, ((float)IntSize.getHeight-impl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate0.getStyle(), textDelegate0.getDensity(), textDelegate0.getFontFamilyResolver(), null, 0, 24, null)))) : textLayoutResult0.getBoundingBox(v - 1);
        }
        Object object0 = bringIntoViewRequester0.bringIntoView(rect0, continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

