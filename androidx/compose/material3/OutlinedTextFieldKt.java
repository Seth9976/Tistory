package androidx.compose.material3;

import a5.b;
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
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
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

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u00DA\u0002\u0010&\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001A\u00020\u00072\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u001F\u001A\u00020\u001D2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010%\u001A\u00020$H\u0007\u00A2\u0006\u0004\b&\u0010\'\u001A\u00DA\u0002\u0010&\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020(2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001A\u00020\u00072\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010\u001F\u001A\u00020\u001D2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001A\u00020\"2\b\b\u0002\u0010%\u001A\u00020$H\u0007\u00A2\u0006\u0004\b&\u0010)\u001A\u0082\u0002\u00105\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0011\u0010*\u001A\r\u0012\u0004\u0012\u00020\u00030\f\u00A2\u0006\u0002\b\r2\u0019\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\r2\u0013\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010+\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010,\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010\u0012\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010\u0013\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0006\u0010\u001C\u001A\u00020\u00072\u0006\u0010.\u001A\u00020-2\u0012\u00100\u001A\u000E\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00101\u001A\r\u0012\u0004\u0012\u00020\u00030\f\u00A2\u0006\u0002\b\r2\u0013\u00102\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0006\u00104\u001A\u000203H\u0001\u00A2\u0006\u0004\b5\u00106\u001A)\u00108\u001A\u00020\u0005*\u00020\u00052\f\u00107\u001A\b\u0012\u0004\u0012\u00020/0\f2\u0006\u00104\u001A\u000203H\u0000\u00A2\u0006\u0004\b8\u00109\"\u001A\u0010?\u001A\u00020:8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\u00A8\u0006@"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "labelSize", "outlineCutout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "b", "J", "getOutlinedTextFieldTopPadding", "()J", "OutlinedTextFieldTopPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,1155:1\n77#2:1156\n77#2:1165\n77#2:1166\n77#2:1175\n77#2:1182\n1223#3,6:1157\n1223#3,6:1167\n1223#3,6:1176\n708#4:1163\n696#4:1164\n708#4:1173\n696#4:1174\n78#5,6:1183\n85#5,4:1198\n89#5,2:1208\n78#5,6:1217\n85#5,4:1232\n89#5,2:1242\n93#5:1248\n78#5,6:1256\n85#5,4:1271\n89#5,2:1281\n93#5:1287\n78#5,6:1302\n85#5,4:1317\n89#5,2:1327\n93#5:1333\n78#5,6:1342\n85#5,4:1357\n89#5,2:1367\n93#5:1373\n78#5,6:1384\n85#5,4:1399\n89#5,2:1409\n93#5:1415\n78#5,6:1424\n85#5,4:1439\n89#5,2:1449\n93#5:1455\n78#5,6:1464\n85#5,4:1479\n89#5,2:1489\n93#5:1495\n93#5:1499\n368#6,9:1189\n377#6:1210\n368#6,9:1223\n377#6:1244\n378#6,2:1246\n368#6,9:1262\n377#6:1283\n378#6,2:1285\n368#6,9:1308\n377#6:1329\n378#6,2:1331\n368#6,9:1348\n377#6:1369\n378#6,2:1371\n368#6,9:1390\n377#6:1411\n378#6,2:1413\n368#6,9:1430\n377#6:1451\n378#6,2:1453\n368#6,9:1470\n377#6:1491\n378#6,2:1493\n378#6,2:1497\n4032#7,6:1202\n4032#7,6:1236\n4032#7,6:1275\n4032#7,6:1321\n4032#7,6:1361\n4032#7,6:1403\n4032#7,6:1443\n4032#7,6:1483\n71#8:1211\n69#8,5:1212\n74#8:1245\n78#8:1249\n71#8:1250\n69#8,5:1251\n74#8:1284\n78#8:1288\n71#8:1295\n68#8,6:1296\n74#8:1330\n78#8:1334\n71#8:1335\n68#8,6:1336\n74#8:1370\n78#8:1374\n71#8:1377\n68#8,6:1378\n74#8:1412\n78#8:1416\n71#8:1417\n68#8,6:1418\n74#8:1452\n78#8:1456\n71#8:1457\n68#8,6:1458\n74#8:1492\n78#8:1496\n56#9:1289\n56#9:1292\n50#9:1500\n148#10:1290\n205#10:1291\n148#10:1293\n205#10:1294\n148#10:1375\n148#10:1376\n148#10:1501\n134#11,2:1502\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n*L\n176#1:1156\n205#1:1165\n351#1:1166\n380#1:1175\n479#1:1182\n196#1:1157,6\n371#1:1167,6\n471#1:1176,6\n199#1:1163\n199#1:1164\n374#1:1173\n374#1:1174\n480#1:1183,6\n480#1:1198,4\n480#1:1208,2\n486#1:1217,6\n486#1:1232,4\n486#1:1242,2\n486#1:1248\n494#1:1256,6\n494#1:1271,4\n494#1:1281,2\n494#1:1287\n519#1:1302,6\n519#1:1317,4\n519#1:1327,2\n519#1:1333\n529#1:1342,6\n529#1:1357,4\n529#1:1367,2\n529#1:1373\n551#1:1384,6\n551#1:1399,4\n551#1:1409,2\n551#1:1415\n559#1:1424,6\n559#1:1439,4\n559#1:1449,2\n559#1:1455\n576#1:1464,6\n576#1:1479,4\n576#1:1489,2\n576#1:1495\n480#1:1499\n480#1:1189,9\n480#1:1210\n486#1:1223,9\n486#1:1244\n486#1:1246,2\n494#1:1262,9\n494#1:1283\n494#1:1285,2\n519#1:1308,9\n519#1:1329\n519#1:1331,2\n529#1:1348,9\n529#1:1369\n529#1:1371,2\n551#1:1390,9\n551#1:1411\n551#1:1413,2\n559#1:1430,9\n559#1:1451\n559#1:1453,2\n576#1:1470,9\n576#1:1491\n576#1:1493,2\n480#1:1497,2\n480#1:1202,6\n486#1:1236,6\n494#1:1275,6\n519#1:1321,6\n529#1:1361,6\n551#1:1403,6\n559#1:1443,6\n576#1:1483,6\n486#1:1211\n486#1:1212,5\n486#1:1245\n486#1:1249\n494#1:1250\n494#1:1251,5\n494#1:1284\n494#1:1288\n519#1:1295\n519#1:1296,6\n519#1:1330\n519#1:1334\n529#1:1335\n529#1:1336,6\n529#1:1370\n529#1:1374\n551#1:1377\n551#1:1378,6\n551#1:1412\n551#1:1416\n559#1:1417\n559#1:1418,6\n559#1:1452\n559#1:1456\n576#1:1457\n576#1:1458,6\n576#1:1492\n576#1:1496\n507#1:1289\n513#1:1292\n966#1:1500\n507#1:1290\n507#1:1291\n513#1:1293\n513#1:1294\n543#1:1375\n544#1:1376\n1146#1:1501\n1154#1:1502,2\n*E\n"})
public final class OutlinedTextFieldKt {
    public static final float a;
    public static final long b;

    static {
        OutlinedTextFieldKt.a = 4.0f;
        long v = TypeScaleTokens.INSTANCE.getBodySmallLineHeight-XSAIIZE();
        TextUnitKt.checkArithmetic--R2X_6o(v);
        OutlinedTextFieldKt.b = TextUnitKt.pack(v & 0xFF00000000L, TextUnit.getValue-impl(v) / 2.0f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextField(@NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, @Nullable Function2 function26, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4, int v5) {
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
        Composer composer1 = composer0.startRestartGroup(-1570442800);
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
                Shape shape3 = (v5 & 0x200000) == 0 ? shape0 : OutlinedTextFieldDefaults.INSTANCE.getShape(composer1, 6);
                if((v5 & 0x400000) == 0) {
                    shape2 = shape3;
                    textFieldColors2 = textFieldColors0;
                }
                else {
                    shape2 = shape3;
                    textFieldColors2 = OutlinedTextFieldDefaults.INSTANCE.colors(composer1, 6);
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
                ComposerKt.traceEventStart(-1570442800, v17, v18, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:368)");
            }
            else {
                function222 = function219;
                function221 = function220;
            }
            composer1.startReplaceGroup(0x1CF6244);
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
            composer1.startReplaceGroup(0x1CF7A22);
            long v20 = textStyle2.getColor-0d7_KjU();
            if(v20 == 16L) {
                v20 = textFieldColors2.textColor-XeAY9LY$material3_release(z8, z10, ((Boolean)FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, composer1, 0).getValue()).booleanValue());
            }
            composer1.endReplaceGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v20, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(0x6D21A690, true, new bh(modifier2, function214, ((Density)object0), z10, textFieldColors2, textFieldValue0, function10, z8, z9, textStyle3, keyboardOptions2, keyboardActions2, z11, v15, v16, visualTransformation2, mutableInteractionSource5, function215, function216, function217, function222, function221, function218, shape2), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
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
            scopeUpdateScope0.updateScope(new ch(textFieldValue0, function10, modifier1, z4, z5, textStyle1, function27, function28, function29, function210, function211, function212, function213, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v13, v14, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, v5, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextField(@NotNull String s, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, @Nullable Function2 function26, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4, int v5) {
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
        Composer composer1 = composer0.startRestartGroup(-1922450045);
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
                Shape shape3 = (v5 & 0x200000) == 0 ? shape0 : OutlinedTextFieldDefaults.INSTANCE.getShape(composer1, 6);
                if((v5 & 0x400000) == 0) {
                    shape2 = shape3;
                    textFieldColors2 = textFieldColors0;
                }
                else {
                    shape2 = shape3;
                    textFieldColors2 = OutlinedTextFieldDefaults.INSTANCE.colors(composer1, 6);
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
                ComposerKt.traceEventStart(-1922450045, v17, v18, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:193)");
            }
            else {
                function222 = function219;
                function221 = function220;
            }
            composer1.startReplaceGroup(30062948);
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
            composer1.startReplaceGroup(30069058);
            long v20 = textStyle2.getColor-0d7_KjU();
            if(v20 == 16L) {
                v20 = textFieldColors2.textColor-XeAY9LY$material3_release(z8, z10, ((Boolean)FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, composer1, 0).getValue()).booleanValue());
            }
            composer1.endReplaceGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v20, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColors2.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(0x8F873243, true, new yg(modifier2, function214, ((Density)object0), z10, textFieldColors2, s, function10, z8, z9, textStyle3, keyboardOptions2, keyboardActions2, z11, v15, v16, visualTransformation2, mutableInteractionSource5, function215, function216, function217, function222, function221, function218, shape2), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
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
            scopeUpdateScope0.updateScope(new zg(s, function10, modifier1, z4, z5, textStyle1, function27, function28, function29, function210, function211, function212, function213, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v13, v14, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, v5, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull Modifier modifier0, @NotNull Function2 function20, @Nullable Function3 function30, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, boolean z, float f, @NotNull Function1 function10, @NotNull Function2 function26, @Nullable Function2 function27, @NotNull PaddingValues paddingValues0, @Nullable Composer composer0, int v, int v1) {
        float f3;
        Composer composer1 = composer0.startRestartGroup(1408290209);
        int v2 = (v & 6) == 0 ? v | (composer1.changed(modifier0) ? 4 : 2) : v;
        int v3 = 16;
        if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        int v4 = 0x80;
        if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v2 |= (composer1.changedInstance(function24) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v2 |= (composer1.changedInstance(function25) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v2 |= (composer1.changed(z) ? 0x4000000 : 0x2000000);
        }
        if((0x30000000 & v) == 0) {
            v2 |= (composer1.changed(f) ? 0x20000000 : 0x10000000);
        }
        int v6 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function10) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            if(composer1.changedInstance(function26)) {
                v3 = 0x20;
            }
            v6 |= v3;
        }
        if((v1 & 0x180) == 0) {
            if(composer1.changedInstance(function27)) {
                v4 = 0x100;
            }
            v6 |= v4;
        }
        if((v1 & 0xC00) == 0) {
            if(composer1.changed(paddingValues0)) {
                v5 = 0x800;
            }
            v6 |= v5;
        }
        if((v2 & 306783379) != 306783378 || (v6 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, v2, v6, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            gh gh0 = composer1.rememberedValue();
            if((((v6 & 14) == 4 ? 1 : 0) | ((0xE000000 & v2) == 0x4000000 ? 1 : 0) | ((0x70000000 & v2) == 0x20000000 ? 1 : 0) | ((v6 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || gh0 == Composer.Companion.getEmpty()) {
                gh0 = new gh(function10, z, f, paddingValues0);
                composer1.updateRememberedValue(gh0);
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
            Updater.set-impl(composer1, gh0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function28 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function28);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function26.invoke(composer1, ((int)(v6 >> 3 & 14)));
            composer1.startReplaceGroup(250370369);
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
                b.y(composer1, v2 >> 12 & 14, function22);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(250379492);
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
                b.y(composer1, v2 >> 15 & 14, function23);
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
            composer1.startReplaceGroup(250410106);
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
                b.y(composer1, v2 >> 18 & 14, function24);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(250422072);
            if(function25 == null) {
                f3 = f2;
            }
            else {
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
                if(composer1.getInserting()) {
                    f3 = f2;
                    a.t(v11, composer1, v11, function212);
                }
                else {
                    f3 = f2;
                    if(!Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                        a.t(v11, composer1, v11, function212);
                    }
                }
                Updater.set-impl(composer1, modifier9, composeUiNode$Companion0.getSetModifier());
                b.y(composer1, v2 >> 21 & 14, function25);
            }
            composer1.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier10 = SizeKt.wrapContentHeight$default(SizeKt.heightIn-VpY3zN4$default(modifier$Companion0, 24.0f, 0.0f, 2, null), null, false, 3, null);
            if(function24 != null) {
                f1 = 0.0f;
            }
            Modifier modifier11 = PaddingKt.padding-qDBjuR0$default(modifier10, f1, 0.0f, (function25 == null ? f3 : 0.0f), 0.0f, 10, null);
            composer1.startReplaceGroup(250444361);
            if(function30 != null) {
                function30.invoke(LayoutIdKt.layoutId(modifier$Companion0, "Hint").then(modifier11), composer1, ((int)(v2 >> 3 & 0x70)));
            }
            composer1.endReplaceGroup();
            Modifier modifier12 = LayoutIdKt.layoutId(modifier$Companion0, "TextField").then(modifier11);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), true);
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap5 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier13 = ComposedModifierKt.materializeModifier(composer1, modifier12);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                a.t(v12, composer1, v12, function213);
            }
            Updater.set-impl(composer1, modifier13, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v2 >> 3 & 14)));
            composer1.endNode();
            composer1.startReplaceGroup(250455481);
            if(function21 != null) {
                Modifier modifier14 = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.heightIn-VpY3zN4$default(modifier$Companion0, DpKt.lerp-Md-fbLM(24.0f, 16.0f, f), 0.0f, 2, null), null, false, 3, null), "Label");
                MeasurePolicy measurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
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
                b.y(composer1, v2 >> 9 & 14, function21);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(250473414);
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
                b.y(composer1, v6 >> 6 & 14, function27);
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
            scopeUpdateScope0.updateScope(new dh(modifier0, function20, function30, function21, function22, function23, function24, function25, z, f, function10, function26, function27, paddingValues0, v, v1));
        }
    }

    public static final int a(boolean z, int v, int v1, Placeable placeable0, Placeable placeable1) {
        if(z) {
            v1 = Alignment.Companion.getCenterVertically().align(placeable1.getHeight(), v);
        }
        return Math.max(v1, TextFieldImplKt.heightOrZero(placeable0) / 2);
    }

    public static final int access$calculateHeight-mKXJcVc(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, float f, long v8, float f1, PaddingValues paddingValues0) {
        int v9 = d.maxOf(v4, new int[]{v6, v2, v3, MathHelpersKt.lerp(v5, 0, f)});
        float f2 = paddingValues0.calculateTopPadding-D9Ej5fM() * f1;
        return Math.max(Constraints.getMinHeight-impl(v8), Math.max(v, Math.max(v1, zd.c.roundToInt(f * Math.max(f2, ((float)v5) / 2.0f) + (1.0f - f) * f2 + ((float)v9) + paddingValues0.calculateBottomPadding-D9Ej5fM() * f1))) + v7);
    }

    public static final int access$calculateWidth-DHJA7U0(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f, long v7, float f1, PaddingValues paddingValues0) {
        float f2 = paddingValues0.calculateLeftPadding-u2uoSUM(LayoutDirection.Ltr);
        return Math.max(Math.max(v4 + (v2 + v3), Math.max(v6 + (v2 + v3), MathHelpersKt.lerp(v5, 0, f))) + v + v1, Math.max(zd.c.roundToInt((((float)v5) + Dp.constructor-impl(paddingValues0.calculateRightPadding-u2uoSUM(LayoutDirection.Ltr) + f2) * f1) * f), Constraints.getMinWidth-impl(v7)));
    }

    public static final float access$getOutlinedTextFieldInnerPadding$p() [...] // 潜在的解密器

    public static final void access$place(PlacementScope placeable$PlacementScope0, int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f, boolean z, float f1, LayoutDirection layoutDirection0, PaddingValues paddingValues0) {
        PlacementScope.place-70tqf50$default(placeable$PlacementScope0, placeable7, 0L, 0.0f, 2, null);
        int v2 = v - TextFieldImplKt.heightOrZero(placeable8);
        int v3 = zd.c.roundToInt(paddingValues0.calculateTopPadding-D9Ej5fM() * f1);
        int v4 = zd.c.roundToInt(PaddingKt.calculateStartPadding(paddingValues0, layoutDirection0) * f1);
        if(placeable0 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, 0, Alignment.Companion.getCenterVertically().align(placeable0.getHeight(), v2), 0.0f, 4, null);
        }
        if(placeable5 != null) {
            int v5 = MathHelpersKt.lerp((z ? Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), v2) : v3), -(placeable5.getHeight() / 2), f);
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable5, zd.c.roundToInt((placeable0 == null ? 0.0f : (((float)TextFieldImplKt.widthOrZero(placeable0)) - 12.0f * f1) * (1.0f - f))) + v4, v5, 0.0f, 4, null);
        }
        if(placeable2 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable2, TextFieldImplKt.widthOrZero(placeable0), OutlinedTextFieldKt.a(z, v2, v3, placeable5, placeable2), 0.0f, 4, null);
        }
        int v6 = TextFieldImplKt.widthOrZero(placeable2) + TextFieldImplKt.widthOrZero(placeable0);
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable4, v6, OutlinedTextFieldKt.a(z, v2, v3, placeable5, placeable4), 0.0f, 4, null);
        if(placeable6 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable6, v6, OutlinedTextFieldKt.a(z, v2, v3, placeable5, placeable6), 0.0f, 4, null);
        }
        if(placeable3 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable3, v1 - TextFieldImplKt.widthOrZero(placeable1) - placeable3.getWidth(), OutlinedTextFieldKt.a(z, v2, v3, placeable5, placeable3), 0.0f, 4, null);
        }
        if(placeable1 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, v1 - placeable1.getWidth(), Alignment.Companion.getCenterVertically().align(placeable1.getHeight(), v2), 0.0f, 4, null);
        }
        if(placeable8 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable8, 0, v2, 0.0f, 4, null);
        }
    }

    public static final int access$substractConstraintSafely(int v, int v1) {
        return v == 0x7FFFFFFF ? 0x7FFFFFFF : v - v1;
    }

    public static final long getOutlinedTextFieldTopPadding() [...] // 潜在的解密器

    @NotNull
    public static final Modifier outlineCutout(@NotNull Modifier modifier0, @NotNull Function0 function00, @NotNull PaddingValues paddingValues0) {
        return DrawModifierKt.drawWithContent(modifier0, new eh(function00, paddingValues0));
    }
}

