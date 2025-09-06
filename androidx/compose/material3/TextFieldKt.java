package androidx.compose.material3;

import a5.b;
import aa.w;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.d;

@Metadata(d1 = {"\u0000\u008C\u0001\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u00DA\u0002\u0010&\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001A\u00020\u00072\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u001F\u001A\u00020\u001D2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010%\u001A\u00020$H\u0007\u00A2\u0006\u0004\b&\u0010\'\u001A\u00DA\u0002\u0010&\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020(2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001A\u00020\u00072\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u001F\u001A\u00020\u001D2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010%\u001A\u00020$H\u0007\u00A2\u0006\u0004\b&\u0010)\u001A\u00EE\u0001\u00103\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0011\u0010*\u001A\r\u0012\u0004\u0012\u00020\u00030\f\u00A2\u0006\u0002\b\r2\u0013\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0019\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\r2\u0013\u0010+\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010,\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010\u0012\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010\u0013\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0006\u0010\u001C\u001A\u00020\u00072\u0006\u0010.\u001A\u00020-2\u0011\u0010/\u001A\r\u0012\u0004\u0012\u00020\u00030\f\u00A2\u0006\u0002\b\r2\u0013\u00100\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0006\u00102\u001A\u000201H\u0001\u00A2\u0006\u0004\b3\u00104\u001A!\u00108\u001A\u00020\u0005*\u00020\u00052\f\u00107\u001A\b\u0012\u0004\u0012\u00020605H\u0000\u00A2\u0006\u0004\b8\u00109\"\u001A\u0010?\u001A\u00020:8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\u00A8\u0006@"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "TextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "TextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "drawIndicatorLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTextFieldWithLabelVerticalPadding", "()F", "TextFieldWithLabelVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1140:1\n77#2:1141\n77#2:1150\n77#2:1165\n1223#3,6:1142\n1223#3,6:1151\n1223#3,6:1159\n708#4:1148\n696#4:1149\n708#4:1157\n696#4:1158\n78#5,6:1166\n85#5,4:1181\n89#5,2:1191\n78#5,6:1200\n85#5,4:1215\n89#5,2:1225\n93#5:1231\n78#5,6:1239\n85#5,4:1254\n89#5,2:1264\n93#5:1270\n78#5,6:1285\n85#5,4:1300\n89#5,2:1310\n93#5:1316\n78#5,6:1325\n85#5,4:1340\n89#5,2:1350\n93#5:1356\n78#5,6:1365\n85#5,4:1380\n89#5,2:1390\n93#5:1396\n78#5,6:1407\n85#5,4:1422\n89#5,2:1432\n93#5:1438\n78#5,6:1447\n85#5,4:1462\n89#5,2:1472\n93#5:1478\n93#5:1482\n368#6,9:1172\n377#6:1193\n368#6,9:1206\n377#6:1227\n378#6,2:1229\n368#6,9:1245\n377#6:1266\n378#6,2:1268\n368#6,9:1291\n377#6:1312\n378#6,2:1314\n368#6,9:1331\n377#6:1352\n378#6,2:1354\n368#6,9:1371\n377#6:1392\n378#6,2:1394\n368#6,9:1413\n377#6:1434\n378#6,2:1436\n368#6,9:1453\n377#6:1474\n378#6,2:1476\n378#6,2:1480\n4032#7,6:1185\n4032#7,6:1219\n4032#7,6:1258\n4032#7,6:1304\n4032#7,6:1344\n4032#7,6:1384\n4032#7,6:1426\n4032#7,6:1466\n71#8:1194\n69#8,5:1195\n74#8:1228\n78#8:1232\n71#8:1233\n69#8,5:1234\n74#8:1267\n78#8:1271\n71#8:1278\n68#8,6:1279\n74#8:1313\n78#8:1317\n71#8:1318\n68#8,6:1319\n74#8:1353\n78#8:1357\n71#8:1358\n68#8,6:1359\n74#8:1393\n78#8:1397\n71#8:1400\n68#8,6:1401\n74#8:1435\n78#8:1439\n71#8:1440\n68#8,6:1441\n74#8:1475\n78#8:1479\n56#9:1272\n56#9:1275\n50#9:1483\n86#9:1484\n148#10:1273\n205#10:1274\n148#10:1276\n205#10:1277\n148#10:1398\n148#10:1399\n148#10:1485\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n*L\n202#1:1141\n358#1:1150\n459#1:1165\n222#1:1142,6\n378#1:1151,6\n456#1:1159,6\n225#1:1148\n225#1:1149\n381#1:1157\n381#1:1158\n460#1:1166,6\n460#1:1181,4\n460#1:1191,2\n469#1:1200,6\n469#1:1215,4\n469#1:1225,2\n469#1:1231\n477#1:1239,6\n477#1:1254,4\n477#1:1264,2\n477#1:1270\n502#1:1285,6\n502#1:1300,4\n502#1:1310,2\n502#1:1316\n512#1:1325,6\n512#1:1340,4\n512#1:1350,2\n512#1:1356\n523#1:1365,6\n523#1:1380,4\n523#1:1390,2\n523#1:1396\n551#1:1407,6\n551#1:1422,4\n551#1:1432,2\n551#1:1438\n560#1:1447,6\n560#1:1462,4\n560#1:1472,2\n560#1:1478\n460#1:1482\n460#1:1172,9\n460#1:1193\n469#1:1206,9\n469#1:1227\n469#1:1229,2\n477#1:1245,9\n477#1:1266\n477#1:1268,2\n502#1:1291,9\n502#1:1312\n502#1:1314,2\n512#1:1331,9\n512#1:1352\n512#1:1354,2\n523#1:1371,9\n523#1:1392\n523#1:1394,2\n551#1:1413,9\n551#1:1434\n551#1:1436,2\n560#1:1453,9\n560#1:1474\n560#1:1476,2\n460#1:1480,2\n460#1:1185,6\n469#1:1219,6\n477#1:1258,6\n502#1:1304,6\n512#1:1344,6\n523#1:1384,6\n551#1:1426,6\n560#1:1466,6\n469#1:1194\n469#1:1195,5\n469#1:1228\n469#1:1232\n477#1:1233\n477#1:1234,5\n477#1:1267\n477#1:1271\n502#1:1278\n502#1:1279,6\n502#1:1313\n502#1:1317\n512#1:1318\n512#1:1319,6\n512#1:1353\n512#1:1357\n523#1:1358\n523#1:1359,6\n523#1:1393\n523#1:1397\n551#1:1400\n551#1:1401,6\n551#1:1435\n551#1:1439\n560#1:1440\n560#1:1441,6\n560#1:1475\n560#1:1479\n490#1:1272\n496#1:1275\n960#1:1483\n965#1:1484\n490#1:1273\n490#1:1274\n496#1:1276\n496#1:1277\n544#1:1398\n545#1:1399\n1139#1:1485\n*E\n"})
public final class TextFieldKt {
    public static final float a;

    static {
        TextFieldKt.a = 8.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextField(@NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, @Nullable Function2 function26, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4, int v5) {
        TextFieldColors textFieldColors1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        int v14;
        int v13;
        boolean z7;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        VisualTransformation visualTransformation1;
        boolean z6;
        Function2 function213;
        Function2 function212;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        Function2 function28;
        Function2 function27;
        TextStyle textStyle1;
        boolean z5;
        boolean z4;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource5;
        Function2 function222;
        Function2 function221;
        Function2 function220;
        Function2 function219;
        int v18;
        int v17;
        TextFieldColors textFieldColors2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        int v16;
        int v15;
        boolean z11;
        KeyboardActions keyboardActions2;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        boolean z10;
        Function2 function218;
        Function2 function217;
        Function2 function216;
        Function2 function215;
        Function2 function214;
        TextStyle textStyle2;
        boolean z9;
        boolean z8;
        Modifier modifier2;
        int v19;
        int v12;
        int v11;
        int v9;
        int v6;
        Composer composer1 = composer0.startRestartGroup(0xB463CB90);
        if((v5 & 1) == 0) {
            v6 = (v2 & 6) == 0 ? (composer1.changed(textFieldValue0) ? 4 : 2) | v2 : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v5 & 2) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v6 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v5 & 4) != 0) {
            v6 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v6 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v7 = 0x800;
        if((v5 & 8) != 0) {
            v6 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v6 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v8 = 0x2000;
        if((v5 & 16) != 0) {
            v6 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v6 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x30000) == 0) {
            v6 |= ((v5 & 0x20) != 0 || !composer1.changed(textStyle0) ? 0x10000 : 0x20000);
        }
        if((v5 & 0x40) != 0) {
            v6 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v6 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v6 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x100) != 0) {
            v6 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v6 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((v2 & 0x30000000) == 0) {
            v6 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 0x400) == 0) {
            v9 = (v3 & 6) == 0 ? v3 | (composer1.changedInstance(function24) ? 4 : 2) : v3;
        }
        else {
            v9 = v3 | 6;
        }
        if((v5 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v9 |= (composer1.changedInstance(function25) ? 0x20 : 16);
        }
        int v10 = v9;
        if((v5 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v10 |= (composer1.changedInstance(function26) ? 0x100 : 0x80);
        }
        if((v5 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            if(!composer1.changed(z2)) {
                v7 = 0x400;
            }
            v10 |= v7;
        }
        if((v5 & 0x4000) == 0) {
            v11 = v5 & 0x4000;
            if((v3 & 0x6000) == 0) {
                if(composer1.changed(visualTransformation0)) {
                    v8 = 0x4000;
                }
                v10 |= v8;
            }
        }
        else {
            v10 |= 0x6000;
            v11 = v5 & 0x4000;
        }
        if((v5 & 0x8000) != 0) {
            v10 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v10 |= (composer1.changed(keyboardOptions0) ? 0x20000 : 0x10000);
        }
        if((v5 & 0x10000) != 0) {
            v10 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v10 |= (composer1.changed(keyboardActions0) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x20000) != 0) {
            v10 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v10 |= (composer1.changed(z3) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x6000000) == 0) {
            v10 |= ((v5 & 0x40000) != 0 || !composer1.changed(v) ? 0x2000000 : 0x4000000);
        }
        if((v5 & 0x80000) != 0) {
            v10 |= 0x30000000;
        }
        else if((v3 & 0x30000000) == 0) {
            v10 |= (composer1.changed(v1) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 0x100000) == 0) {
            v12 = (v4 & 6) == 0 ? v4 | (composer1.changed(mutableInteractionSource0) ? 4 : 2) : v4;
        }
        else {
            v12 = v4 | 6;
        }
        if((v4 & 0x30) == 0) {
            v12 |= ((v5 & 0x200000) != 0 || !composer1.changed(shape0) ? 16 : 0x20);
        }
        if((v4 & 0x180) == 0) {
            v12 |= ((v5 & 0x400000) != 0 || !composer1.changed(textFieldColors0) ? 0x80 : 0x100);
        }
        if((v6 & 306783379) != 306783378 || (306783379 & v10) != 306783378 || (v12 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v5 & 4) == 0 ? modifier0 : Modifier.Companion;
                z8 = (v5 & 8) == 0 ? z : true;
                if((v5 & 0x20) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v6 &= 0xFFF8FFFF;
                }
                MutableInteractionSource mutableInteractionSource3 = null;
                function215 = (v5 & 0x80) == 0 ? function21 : null;
                z10 = (v5 & 0x2000) == 0 ? z2 : false;
                VisualTransformation visualTransformation3 = v11 == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                KeyboardOptions keyboardOptions3 = (v5 & 0x8000) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                KeyboardActions keyboardActions3 = (v5 & 0x10000) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                boolean z12 = (v5 & 0x20000) == 0 ? z3 : false;
                if((v5 & 0x40000) == 0) {
                    v19 = v;
                }
                else {
                    v19 = z12 ? 1 : 0x7FFFFFFF;
                    v10 &= 0xF1FFFFFF;
                }
                if((v5 & 0x100000) == 0) {
                    mutableInteractionSource3 = mutableInteractionSource0;
                }
                Shape shape3 = (v5 & 0x200000) == 0 ? shape0 : TextFieldDefaults.INSTANCE.getShape(composer1, 6);
                if((v5 & 0x400000) == 0) {
                    shape2 = shape3;
                    textFieldColors2 = textFieldColors0;
                }
                else {
                    shape2 = shape3;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.colors(composer1, 6);
                }
                v17 = v6;
                z9 = (v5 & 16) == 0 ? z1 : false;
                visualTransformation2 = visualTransformation3;
                keyboardOptions2 = keyboardOptions3;
                mutableInteractionSource2 = mutableInteractionSource3;
                keyboardActions2 = keyboardActions3;
                z11 = z12;
                v15 = v19;
                v16 = (v5 & 0x80000) == 0 ? v1 : 1;
                function219 = (v5 & 0x400) == 0 ? function24 : null;
                function216 = (v5 & 0x100) == 0 ? function22 : null;
                function218 = (v5 & 0x1000) == 0 ? function26 : null;
                v18 = v10;
                function220 = (v5 & 0x800) == 0 ? function25 : null;
                function217 = (v5 & 0x200) == 0 ? function23 : null;
                function214 = (v5 & 0x40) == 0 ? function20 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v5 & 0x20) != 0) {
                    v6 &= 0xFFF8FFFF;
                }
                if((v5 & 0x40000) != 0) {
                    v10 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                z8 = z;
                z9 = z1;
                textStyle2 = textStyle0;
                function214 = function20;
                function215 = function21;
                function216 = function22;
                function217 = function23;
                function218 = function26;
                z10 = z2;
                visualTransformation2 = visualTransformation0;
                keyboardOptions2 = keyboardOptions0;
                keyboardActions2 = keyboardActions0;
                z11 = z3;
                v15 = v;
                v16 = v1;
                mutableInteractionSource2 = mutableInteractionSource0;
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                v17 = v6;
                v18 = v10;
                function219 = function24;
                function220 = function25;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                function221 = function220;
                function222 = function219;
                ComposerKt.traceEventStart(0xB463CB90, v17, v18, "androidx.compose.material3.TextField (TextField.kt:375)");
            }
            else {
                function222 = function219;
                function221 = function220;
            }
            composer1.startReplaceGroup(-508241210);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource4 = composer1.rememberedValue();
                if(mutableInteractionSource4 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource4 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource4);
                }
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            else {
                mutableInteractionSource5 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-508235100);
            long v20 = textStyle2.getColor-0d7_KjU();
            if(v20 == 16L) {
                v20 = textFieldColors2.textColor-XeAY9LY$material3_release(z8, z10, ((Boolean)FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, composer1, 0).getValue()).booleanValue());
            }
            composer1.endReplaceGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v20, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(0xBAA20050, true, new ro(modifier2, z10, textFieldColors2, textFieldValue0, function10, z8, z9, textStyle3, keyboardOptions2, keyboardActions2, z11, v15, v16, visualTransformation2, mutableInteractionSource5, function214, function215, function216, function217, function222, function221, function218, shape2), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z9;
            function27 = function214;
            textFieldColors1 = textFieldColors2;
            textStyle1 = textStyle2;
            visualTransformation1 = visualTransformation2;
            keyboardOptions1 = keyboardOptions2;
            keyboardActions1 = keyboardActions2;
            z7 = z11;
            v13 = v15;
            v14 = v16;
            mutableInteractionSource1 = mutableInteractionSource2;
            shape1 = shape2;
            function213 = function218;
            function212 = function221;
            z6 = z10;
            function28 = function215;
            function211 = function222;
            function29 = function216;
            modifier1 = modifier2;
            function210 = function217;
            z4 = z8;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z;
            z5 = z1;
            textStyle1 = textStyle0;
            function27 = function20;
            function28 = function21;
            function29 = function22;
            function210 = function23;
            function211 = function24;
            function212 = function25;
            function213 = function26;
            z6 = z2;
            visualTransformation1 = visualTransformation0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z7 = z3;
            v13 = v;
            v14 = v1;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ch(textFieldValue0, function10, modifier1, z4, z5, textStyle1, function27, function28, function29, function210, function211, function212, function213, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v13, v14, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, v5, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextField(@NotNull String s, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, @Nullable Function2 function26, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4, int v5) {
        TextFieldColors textFieldColors1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        int v14;
        int v13;
        boolean z7;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        VisualTransformation visualTransformation1;
        boolean z6;
        Function2 function213;
        Function2 function212;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        Function2 function28;
        Function2 function27;
        TextStyle textStyle1;
        boolean z5;
        boolean z4;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource5;
        Function2 function222;
        Function2 function221;
        Function2 function220;
        Function2 function219;
        int v18;
        int v17;
        TextFieldColors textFieldColors2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        int v16;
        int v15;
        boolean z11;
        KeyboardActions keyboardActions2;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        boolean z10;
        Function2 function218;
        Function2 function217;
        Function2 function216;
        Function2 function215;
        Function2 function214;
        TextStyle textStyle2;
        boolean z9;
        boolean z8;
        Modifier modifier2;
        int v19;
        int v12;
        int v11;
        int v9;
        int v6;
        Composer composer1 = composer0.startRestartGroup(0xD7B15C43);
        if((v5 & 1) == 0) {
            v6 = (v2 & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v5 & 2) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v6 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v5 & 4) != 0) {
            v6 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v6 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v7 = 0x800;
        if((v5 & 8) != 0) {
            v6 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            v6 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v8 = 0x2000;
        if((v5 & 16) != 0) {
            v6 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            v6 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x30000) == 0) {
            v6 |= ((v5 & 0x20) != 0 || !composer1.changed(textStyle0) ? 0x10000 : 0x20000);
        }
        if((v5 & 0x40) != 0) {
            v6 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v6 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v6 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x100) != 0) {
            v6 |= 0x6000000;
        }
        else if((v2 & 0x6000000) == 0) {
            v6 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((v2 & 0x30000000) == 0) {
            v6 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 0x400) == 0) {
            v9 = (v3 & 6) == 0 ? v3 | (composer1.changedInstance(function24) ? 4 : 2) : v3;
        }
        else {
            v9 = v3 | 6;
        }
        if((v5 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v9 |= (composer1.changedInstance(function25) ? 0x20 : 16);
        }
        int v10 = v9;
        if((v5 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v10 |= (composer1.changedInstance(function26) ? 0x100 : 0x80);
        }
        if((v5 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            if(!composer1.changed(z2)) {
                v7 = 0x400;
            }
            v10 |= v7;
        }
        if((v5 & 0x4000) == 0) {
            v11 = v5 & 0x4000;
            if((v3 & 0x6000) == 0) {
                if(composer1.changed(visualTransformation0)) {
                    v8 = 0x4000;
                }
                v10 |= v8;
            }
        }
        else {
            v10 |= 0x6000;
            v11 = v5 & 0x4000;
        }
        if((v5 & 0x8000) != 0) {
            v10 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v10 |= (composer1.changed(keyboardOptions0) ? 0x20000 : 0x10000);
        }
        if((v5 & 0x10000) != 0) {
            v10 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v10 |= (composer1.changed(keyboardActions0) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x20000) != 0) {
            v10 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v10 |= (composer1.changed(z3) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x6000000) == 0) {
            v10 |= ((v5 & 0x40000) != 0 || !composer1.changed(v) ? 0x2000000 : 0x4000000);
        }
        if((v5 & 0x80000) != 0) {
            v10 |= 0x30000000;
        }
        else if((v3 & 0x30000000) == 0) {
            v10 |= (composer1.changed(v1) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 0x100000) == 0) {
            v12 = (v4 & 6) == 0 ? v4 | (composer1.changed(mutableInteractionSource0) ? 4 : 2) : v4;
        }
        else {
            v12 = v4 | 6;
        }
        if((v4 & 0x30) == 0) {
            v12 |= ((v5 & 0x200000) != 0 || !composer1.changed(shape0) ? 16 : 0x20);
        }
        if((v4 & 0x180) == 0) {
            v12 |= ((v5 & 0x400000) != 0 || !composer1.changed(textFieldColors0) ? 0x80 : 0x100);
        }
        if((v6 & 306783379) != 306783378 || (306783379 & v10) != 306783378 || (v12 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v5 & 4) == 0 ? modifier0 : Modifier.Companion;
                z8 = (v5 & 8) == 0 ? z : true;
                if((v5 & 0x20) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v6 &= 0xFFF8FFFF;
                }
                MutableInteractionSource mutableInteractionSource3 = null;
                function215 = (v5 & 0x80) == 0 ? function21 : null;
                z10 = (v5 & 0x2000) == 0 ? z2 : false;
                VisualTransformation visualTransformation3 = v11 == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                KeyboardOptions keyboardOptions3 = (v5 & 0x8000) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                KeyboardActions keyboardActions3 = (v5 & 0x10000) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                boolean z12 = (v5 & 0x20000) == 0 ? z3 : false;
                if((v5 & 0x40000) == 0) {
                    v19 = v;
                }
                else {
                    v19 = z12 ? 1 : 0x7FFFFFFF;
                    v10 &= 0xF1FFFFFF;
                }
                if((v5 & 0x100000) == 0) {
                    mutableInteractionSource3 = mutableInteractionSource0;
                }
                Shape shape3 = (v5 & 0x200000) == 0 ? shape0 : TextFieldDefaults.INSTANCE.getShape(composer1, 6);
                if((v5 & 0x400000) == 0) {
                    shape2 = shape3;
                    textFieldColors2 = textFieldColors0;
                }
                else {
                    shape2 = shape3;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.colors(composer1, 6);
                }
                v17 = v6;
                z9 = (v5 & 16) == 0 ? z1 : false;
                visualTransformation2 = visualTransformation3;
                keyboardOptions2 = keyboardOptions3;
                mutableInteractionSource2 = mutableInteractionSource3;
                keyboardActions2 = keyboardActions3;
                z11 = z12;
                v15 = v19;
                v16 = (v5 & 0x80000) == 0 ? v1 : 1;
                function219 = (v5 & 0x400) == 0 ? function24 : null;
                function216 = (v5 & 0x100) == 0 ? function22 : null;
                function218 = (v5 & 0x1000) == 0 ? function26 : null;
                v18 = v10;
                function220 = (v5 & 0x800) == 0 ? function25 : null;
                function217 = (v5 & 0x200) == 0 ? function23 : null;
                function214 = (v5 & 0x40) == 0 ? function20 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v5 & 0x20) != 0) {
                    v6 &= 0xFFF8FFFF;
                }
                if((v5 & 0x40000) != 0) {
                    v10 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                z8 = z;
                z9 = z1;
                textStyle2 = textStyle0;
                function214 = function20;
                function215 = function21;
                function216 = function22;
                function217 = function23;
                function218 = function26;
                z10 = z2;
                visualTransformation2 = visualTransformation0;
                keyboardOptions2 = keyboardOptions0;
                keyboardActions2 = keyboardActions0;
                z11 = z3;
                v15 = v;
                v16 = v1;
                mutableInteractionSource2 = mutableInteractionSource0;
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                v17 = v6;
                v18 = v10;
                function219 = function24;
                function220 = function25;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                function221 = function220;
                function222 = function219;
                ComposerKt.traceEventStart(0xD7B15C43, v17, v18, "androidx.compose.material3.TextField (TextField.kt:219)");
            }
            else {
                function222 = function219;
                function221 = function220;
            }
            composer1.startReplaceGroup(-508515290);
            if(mutableInteractionSource2 == null) {
                MutableInteractionSource mutableInteractionSource4 = composer1.rememberedValue();
                if(mutableInteractionSource4 == Composer.Companion.getEmpty()) {
                    mutableInteractionSource4 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource4);
                }
                mutableInteractionSource5 = mutableInteractionSource4;
            }
            else {
                mutableInteractionSource5 = mutableInteractionSource2;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-508509180);
            long v20 = textStyle2.getColor-0d7_KjU();
            if(v20 == 16L) {
                v20 = textFieldColors2.textColor-XeAY9LY$material3_release(z8, z10, ((Boolean)FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, composer1, 0).getValue()).booleanValue());
            }
            composer1.endReplaceGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v20, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(0x6ED05103, true, new qo(modifier2, z10, textFieldColors2, s, function10, z8, z9, textStyle3, keyboardOptions2, keyboardActions2, z11, v15, v16, visualTransformation2, mutableInteractionSource5, function214, function215, function216, function217, function222, function221, function218, shape2), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z9;
            function27 = function214;
            textFieldColors1 = textFieldColors2;
            textStyle1 = textStyle2;
            visualTransformation1 = visualTransformation2;
            keyboardOptions1 = keyboardOptions2;
            keyboardActions1 = keyboardActions2;
            z7 = z11;
            v13 = v15;
            v14 = v16;
            mutableInteractionSource1 = mutableInteractionSource2;
            shape1 = shape2;
            function213 = function218;
            function212 = function221;
            z6 = z10;
            function28 = function215;
            function211 = function222;
            function29 = function216;
            modifier1 = modifier2;
            function210 = function217;
            z4 = z8;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z;
            z5 = z1;
            textStyle1 = textStyle0;
            function27 = function20;
            function28 = function21;
            function29 = function22;
            function210 = function23;
            function211 = function24;
            function212 = function25;
            function213 = function26;
            z6 = z2;
            visualTransformation1 = visualTransformation0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z7 = z3;
            v13 = v;
            v14 = v1;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new zg(s, function10, modifier1, z4, z5, textStyle1, function27, function28, function29, function210, function211, function212, function213, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v13, v14, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, v5, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@NotNull Modifier modifier0, @NotNull Function2 function20, @Nullable Function2 function21, @Nullable Function3 function30, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, boolean z, float f, @NotNull Function2 function26, @Nullable Function2 function27, @NotNull PaddingValues paddingValues0, @Nullable Composer composer0, int v, int v1) {
        float f3;
        int v6;
        Composer composer1 = composer0.startRestartGroup(-1830307184);
        int v2 = 4;
        int v3 = (v & 6) == 0 ? v | (composer1.changed(modifier0) ? 4 : 2) : v;
        int v4 = 16;
        if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v3 |= (composer1.changedInstance(function24) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v3 |= (composer1.changedInstance(function25) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v3 |= (composer1.changed(z) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v) == 0) {
            v3 |= (composer1.changed(f) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 6) == 0) {
            if(!composer1.changedInstance(function26)) {
                v2 = 2;
            }
            v6 = v1 | v2;
        }
        else {
            v6 = v1;
        }
        if((v1 & 0x30) == 0) {
            if(composer1.changedInstance(function27)) {
                v4 = 0x20;
            }
            v6 |= v4;
        }
        if((v1 & 0x180) == 0) {
            if(composer1.changed(paddingValues0)) {
                v5 = 0x100;
            }
            v6 |= v5;
        }
        if((v3 & 306783379) != 306783378 || (v6 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, v3, v6, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            uo uo0 = composer1.rememberedValue();
            if((((0x70000000 & v3) == 0x20000000 ? 1 : 0) | ((0xE000000 & v3) == 0x4000000 ? 1 : 0) | ((v6 & 0x380) == 0x100 ? 1 : 0)) != 0 || uo0 == Composer.Companion.getEmpty()) {
                uo0 = new uo(z, f, paddingValues0);
                composer1.updateRememberedValue(uo0);
            }
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer1, uo0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function28 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function28);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function26.invoke(composer1, ((int)(v6 & 14)));
            composer1.startReplaceGroup(0x4FF5ED83);
            if(function22 != null) {
                Modifier modifier2 = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function01);
                }
                else {
                    composer1.useNode();
                }
                Function2 function29 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                    a.t(v8, composer1, v8, function29);
                }
                Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v3 >> 12 & 14, function22);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x4FF61126);
            if(function23 != null) {
                Modifier modifier4 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
                Function0 function02 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function02);
                }
                else {
                    composer1.useNode();
                }
                Function2 function210 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                    a.t(v9, composer1, v9, function210);
                }
                Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v3 >> 15 & 14, function23);
            }
            composer1.endReplaceGroup();
            float f1 = PaddingKt.calculateStartPadding(paddingValues0, layoutDirection0);
            float f2 = PaddingKt.calculateEndPadding(paddingValues0, layoutDirection0);
            if(function22 != null) {
                f1 = c.coerceAtLeast(f1 - 12.0f, 0.0f);
            }
            if(function23 != null) {
                f2 = c.coerceAtLeast(f2 - 12.0f, 0.0f);
            }
            composer1.startReplaceGroup(0x4FF688BC);
            if(function24 != null) {
                Modifier modifier6 = PaddingKt.padding-qDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.heightIn-VpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Prefix"), 24.0f, 0.0f, 2, null), null, false, 3, null), f1, 0.0f, 2.0f, 0.0f, 10, null);
                MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
                Function0 function03 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function03);
                }
                else {
                    composer1.useNode();
                }
                Function2 function211 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                    a.t(v10, composer1, v10, function211);
                }
                Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v3 >> 18 & 14, function24);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x4FF6B77A);
            if(function25 != null) {
                Modifier modifier8 = PaddingKt.padding-qDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.heightIn-VpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Suffix"), 24.0f, 0.0f, 2, null), null, false, 3, null), 2.0f, 0.0f, f2, 0.0f, 10, null);
                MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap4 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier9 = ComposedModifierKt.materializeModifier(composer1, modifier8);
                Function0 function04 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function04);
                }
                else {
                    composer1.useNode();
                }
                Function2 function212 = a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap4);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                    a.t(v11, composer1, v11, function212);
                }
                Updater.set-impl(composer1, modifier9, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v3 >> 21 & 14, function25);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x4FF6E724);
            if(function21 == null) {
                f3 = f1;
            }
            else {
                Modifier modifier10 = PaddingKt.padding-qDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.heightIn-VpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Label"), DpKt.lerp-Md-fbLM(24.0f, 16.0f, f), 0.0f, 2, null), null, false, 3, null), f1, 0.0f, f2, 0.0f, 10, null);
                MeasurePolicy measurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap5 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier11 = ComposedModifierKt.materializeModifier(composer1, modifier10);
                Function0 function05 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function05);
                }
                else {
                    composer1.useNode();
                }
                Function2 function213 = a.r(composeUiNode$Companion0, composer1, measurePolicy4, composer1, compositionLocalMap5);
                if(composer1.getInserting()) {
                    f3 = f1;
                    a.t(v12, composer1, v12, function213);
                }
                else {
                    f3 = f1;
                    if(!Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                        a.t(v12, composer1, v12, function213);
                    }
                }
                Updater.set-impl(composer1, modifier11, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v3 >> 6 & 14, function21);
            }
            composer1.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier12 = SizeKt.wrapContentHeight$default(SizeKt.heightIn-VpY3zN4$default(modifier$Companion0, 24.0f, 0.0f, 2, null), null, false, 3, null);
            if(function25 != null) {
                f2 = 0.0f;
            }
            Modifier modifier13 = PaddingKt.padding-qDBjuR0$default(modifier12, (function24 == null ? f3 : 0.0f), 0.0f, f2, 0.0f, 10, null);
            composer1.startReplaceGroup(0x4FF75E6B);
            if(function30 != null) {
                function30.invoke(LayoutIdKt.layoutId(modifier$Companion0, "Hint").then(modifier13), composer1, ((int)(v3 >> 6 & 0x70)));
            }
            composer1.endReplaceGroup();
            Modifier modifier14 = LayoutIdKt.layoutId(modifier$Companion0, "TextField").then(modifier13);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), true);
            int v13 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap6 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier15 = ComposedModifierKt.materializeModifier(composer1, modifier14);
            Function0 function06 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function06);
            }
            else {
                composer1.useNode();
            }
            Function2 function214 = a.r(composeUiNode$Companion0, composer1, measurePolicy5, composer1, compositionLocalMap6);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v13)) {
                a.t(v13, composer1, v13, function214);
            }
            Updater.set-impl(composer1, modifier15, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v3 >> 3 & 14)));
            composer1.endNode();
            composer1.startReplaceGroup(0x4FF78960);
            if(function27 != null) {
                Modifier modifier16 = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.heightIn-VpY3zN4$default(LayoutIdKt.layoutId(modifier$Companion0, "Supporting"), 16.0f, 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.supportingTextPadding-a9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
                int v14 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap7 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier17 = ComposedModifierKt.materializeModifier(composer1, modifier16);
                Function0 function07 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function07);
                }
                else {
                    composer1.useNode();
                }
                Function2 function215 = a.r(composeUiNode$Companion0, composer1, measurePolicy6, composer1, compositionLocalMap7);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v14)) {
                    a.t(v14, composer1, v14, function215);
                }
                Updater.set-impl(composer1, modifier17, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v6 >> 3 & 14, function27);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new so(modifier0, function20, function21, function30, function22, function23, function24, function25, z, f, function26, function27, paddingValues0, v, v1));
        }
    }

    // 去混淆评级： 低(20)
    public static final int a(boolean z, int v, int v1, Placeable placeable0) {
        return z ? Alignment.Companion.getCenterVertically().align(placeable0.getHeight(), v) : v1;
    }

    public static final int access$calculateHeight-mKXJcVc(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, float f, long v8, float f1, PaddingValues paddingValues0) {
        float f2 = paddingValues0.calculateTopPadding-D9Ej5fM();
        float f3 = Dp.constructor-impl(paddingValues0.calculateBottomPadding-D9Ej5fM() + f2) * f1;
        if(v1 > 0) {
            f3 = f * f3 + (1.0f - f) * (32.0f * f1);
        }
        return Math.max(Constraints.getMinHeight-impl(v8), Math.max(v2, Math.max(v3, zd.c.roundToInt(f3 + ((float)MathHelpersKt.lerp(0, v1, f)) + ((float)d.maxOf(v, new int[]{v6, v4, v5, MathHelpersKt.lerp(v1, 0, f)}))))) + v7);
    }

    public static final int access$calculateWidth-yeHjK3Y(int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7) {
        return Math.max(Math.max(v4 + (v2 + v3), Math.max(v6 + (v2 + v3), v5)) + v + v1, Constraints.getMinWidth-impl(v7));
    }

    public static final void access$placeWithLabel(PlacementScope placeable$PlacementScope0, int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z, int v2, int v3, float f, float f1) {
        PlacementScope.place-70tqf50$default(placeable$PlacementScope0, placeable7, 0L, 0.0f, 2, null);
        int v4 = v1 - TextFieldImplKt.heightOrZero(placeable8);
        if(placeable3 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), v4), 0.0f, 4, null);
        }
        if(placeable1 != null) {
            int v5 = z ? Alignment.Companion.getCenterVertically().align(placeable1.getHeight(), v4) : zd.c.roundToInt(16.0f * f1);
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, TextFieldImplKt.widthOrZero(placeable3), v5 - zd.c.roundToInt(((float)(v5 - v2)) * f), 0.0f, 4, null);
        }
        if(placeable5 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable5, TextFieldImplKt.widthOrZero(placeable3), v3, 0.0f, 4, null);
        }
        int v6 = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, v6, v3, 0.0f, 4, null);
        if(placeable2 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable2, v6, v3, 0.0f, 4, null);
        }
        if(placeable6 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable6, v - TextFieldImplKt.widthOrZero(placeable4) - placeable6.getWidth(), v3, 0.0f, 4, null);
        }
        if(placeable4 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable4, v - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), v4), 0.0f, 4, null);
        }
        if(placeable8 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable8, 0, v4, 0.0f, 4, null);
        }
    }

    public static final void access$placeWithoutLabel(PlacementScope placeable$PlacementScope0, int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, boolean z, float f, PaddingValues paddingValues0) {
        PlacementScope.place-70tqf50$default(placeable$PlacementScope0, placeable6, 0L, 0.0f, 2, null);
        int v2 = v1 - TextFieldImplKt.heightOrZero(placeable7);
        int v3 = zd.c.roundToInt(paddingValues0.calculateTopPadding-D9Ej5fM() * f);
        if(placeable2 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable2, 0, Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), v2), 0.0f, 4, null);
        }
        if(placeable4 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable4, TextFieldImplKt.widthOrZero(placeable2), TextFieldKt.a(z, v2, v3, placeable4), 0.0f, 4, null);
        }
        int v4 = TextFieldImplKt.widthOrZero(placeable2) + TextFieldImplKt.widthOrZero(placeable4);
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, v4, TextFieldKt.a(z, v2, v3, placeable0), 0.0f, 4, null);
        if(placeable1 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, v4, TextFieldKt.a(z, v2, v3, placeable1), 0.0f, 4, null);
        }
        if(placeable5 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable5, v - TextFieldImplKt.widthOrZero(placeable3) - placeable5.getWidth(), TextFieldKt.a(z, v2, v3, placeable5), 0.0f, 4, null);
        }
        if(placeable3 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable3, v - placeable3.getWidth(), Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), v2), 0.0f, 4, null);
        }
        if(placeable7 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable7, 0, v2, 0.0f, 4, null);
        }
    }

    public static final int access$substractConstraintSafely(int v, int v1) {
        return v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v1;
    }

    @NotNull
    public static final Modifier drawIndicatorLine(@NotNull Modifier modifier0, @NotNull State state0) {
        return DrawModifierKt.drawWithContent(modifier0, new w(state0, 4));
    }

    public static final float getTextFieldWithLabelVerticalPadding() [...] // 潜在的解密器
}

