package androidx.compose.material3;

import aa.b;
import aa.m;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R.string;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A-\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00A2\u0006\u0004\b\u0006\u0010\u0007\u001A`\u0010\u0015\u001A\u00020\t2\u0011\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00032\b\b\u0002\u0010\u0011\u001A\u00020\u00102\u0011\u0010\u0012\u001A\r\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001AS\u0010\u0016\u001A\u00020\t2\u0011\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00032\u0011\u0010\u0012\u001A\r\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A?\u0010\u0018\u001A\u00020\t2\u0011\u0010\u000B\u001A\r\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001A\u00020\f2\u0011\u0010\u0012\u001A\r\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\nH\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001Al\u0010&\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u00102\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b#H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%\u001At\u0010&\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u00102\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b#H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(\u001Al\u0010*\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u00102\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b#H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010%\u001At\u0010*\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u00102\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b#H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010(\u001Al\u0010-\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u00102\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b#H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010%\u001At\u00102\u001A\u00020\t2\b\u0010/\u001A\u0004\u0018\u00010.2\u0006\u0010!\u001A\u00020 2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u00102\b\b\u0002\u0010\u001D\u001A\u00020\u00102\b\b\u0002\u0010\u001F\u001A\u00020\u001E2\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002\u00A2\u0006\u0002\b\n\u00A2\u0006\u0002\b#H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101\u001A\u0090\u0001\u0010=\u001A\u00020\t2\u0011\u00103\u001A\r\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0002\b\n2\u0006\u00104\u001A\u00020\u00032\f\u00105\u001A\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001A\u00020\f2\u0015\b\u0002\u00106\u001A\u000F\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00A2\u0006\u0002\b\n2\u0015\b\u0002\u00107\u001A\u000F\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00A2\u0006\u0002\b\n2\b\b\u0002\u00108\u001A\u00020\u001A2\b\b\u0002\u0010:\u001A\u0002092\n\b\u0002\u0010<\u001A\u0004\u0018\u00010;H\u0007\u00A2\u0006\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006B\u00B2\u0006\u000E\u0010?\u001A\u00020\u00038\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010A\u001A\u00020@8\n@\nX\u008A\u008E\u0002\u00B2\u0006\u000E\u0010?\u001A\u00020\u00038\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material3/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "content", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalNavigationDrawer", "DismissibleNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "drawerContainerColor", "drawerContentColor", "Landroidx/compose/ui/unit/Dp;", "drawerTonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-Snr_uVM", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleDrawerSheet-afqeVBk", "DismissibleDrawerSheet", "DismissibleDrawerSheet-Snr_uVM", "PermanentDrawerSheet-afqeVBk", "PermanentDrawerSheet", "Landroidx/compose/material3/DrawerPredictiveBackState;", "drawerPredictiveBackState", "DrawerSheet-7zSek6w", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "label", "selected", "onClick", "icon", "badge", "shape", "Landroidx/compose/material3/NavigationDrawerItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationDrawerItem", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "anchorsInitialized", "", "minValue", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1161:1\n1223#2,6:1162\n1223#2,3:1173\n1226#2,3:1179\n1223#2,6:1185\n1223#2,6:1191\n1223#2,6:1197\n1223#2,6:1281\n1223#2,6:1287\n1223#2,6:1293\n1223#2,6:1299\n1223#2,6:1305\n1223#2,6:1346\n1223#2,6:1353\n1223#2,3:1364\n1226#2,3:1370\n1223#2,6:1412\n1223#2,6:1449\n1223#2,6:1625\n1223#2,6:1633\n1223#2,6:1639\n1223#2,6:1645\n488#3:1168\n487#3,4:1169\n491#3,2:1176\n495#3:1182\n488#3:1359\n487#3,4:1360\n491#3,2:1367\n495#3:1373\n487#4:1178\n487#4:1369\n234#5:1183\n234#5:1374\n234#5:1624\n237#5:1632\n77#6:1184\n77#6:1203\n77#6:1352\n77#6:1375\n77#6:1631\n71#7:1204\n68#7,6:1205\n74#7:1239\n71#7:1240\n67#7,7:1241\n74#7:1276\n78#7:1280\n78#7:1345\n71#7:1376\n68#7,6:1377\n74#7:1411\n71#7:1455\n68#7,6:1456\n74#7:1490\n78#7:1494\n71#7:1495\n67#7,7:1496\n74#7:1531\n78#7:1535\n78#7:1542\n71#7:1579\n67#7,7:1580\n74#7:1615\n78#7:1619\n78#8,6:1211\n85#8,4:1226\n89#8,2:1236\n78#8,6:1248\n85#8,4:1263\n89#8,2:1273\n93#8:1279\n78#8,6:1311\n85#8,4:1326\n89#8,2:1336\n93#8:1341\n93#8:1344\n78#8,6:1383\n85#8,4:1398\n89#8,2:1408\n78#8:1418\n76#8,8:1419\n85#8,4:1436\n89#8,2:1446\n78#8,6:1462\n85#8,4:1477\n89#8,2:1487\n93#8:1493\n78#8,6:1503\n85#8,4:1518\n89#8,2:1528\n93#8:1534\n93#8:1538\n93#8:1541\n78#8,6:1550\n85#8,4:1565\n89#8,2:1575\n78#8,6:1587\n85#8,4:1602\n89#8,2:1612\n93#8:1618\n93#8:1622\n368#9,9:1217\n377#9:1238\n368#9,9:1254\n377#9:1275\n378#9,2:1277\n368#9,9:1317\n377#9,3:1338\n378#9,2:1342\n368#9,9:1389\n377#9:1410\n368#9,9:1427\n377#9:1448\n368#9,9:1468\n377#9:1489\n378#9,2:1491\n368#9,9:1509\n377#9:1530\n378#9,2:1532\n378#9,2:1536\n378#9,2:1539\n368#9,9:1556\n377#9:1577\n368#9,9:1593\n377#9:1614\n378#9,2:1616\n378#9,2:1620\n4032#10,6:1230\n4032#10,6:1267\n4032#10,6:1330\n4032#10,6:1402\n4032#10,6:1440\n4032#10,6:1481\n4032#10,6:1522\n4032#10,6:1569\n4032#10,6:1606\n98#11:1543\n95#11,6:1544\n101#11:1578\n105#11:1623\n81#12:1651\n107#12,2:1652\n81#12:1657\n107#12,2:1658\n76#13:1654\n109#13,2:1655\n148#14:1660\n148#14:1661\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n287#1:1162,6\n322#1:1173,3\n322#1:1179,3\n325#1:1185,6\n326#1:1191,6\n329#1:1197,6\n345#1:1281,6\n353#1:1287,6\n359#1:1293,6\n365#1:1299,6\n380#1:1305,6\n439#1:1346,6\n441#1:1353,6\n443#1:1364,3\n443#1:1370,3\n478#1:1412,6\n458#1:1449,6\n745#1:1625,6\n1140#1:1633,6\n1141#1:1639,6\n1152#1:1645,6\n322#1:1168\n322#1:1169,4\n322#1:1176,2\n322#1:1182\n443#1:1359\n443#1:1360,4\n443#1:1367,2\n443#1:1373\n322#1:1178\n443#1:1369\n323#1:1183\n444#1:1374\n741#1:1624\n1137#1:1632\n324#1:1184\n331#1:1203\n440#1:1352\n446#1:1375\n765#1:1631\n332#1:1204\n332#1:1205,6\n332#1:1239\n342#1:1240\n342#1:1241,7\n342#1:1276\n342#1:1280\n332#1:1345\n447#1:1376\n447#1:1377,6\n447#1:1411\n457#1:1455\n457#1:1456,6\n457#1:1490\n457#1:1494\n476#1:1495\n476#1:1496,7\n476#1:1531\n476#1:1535\n447#1:1542\n535#1:1579\n535#1:1580,7\n535#1:1615\n535#1:1619\n332#1:1211,6\n332#1:1226,4\n332#1:1236,2\n342#1:1248,6\n342#1:1263,4\n342#1:1273,2\n342#1:1279\n356#1:1311,6\n356#1:1326,4\n356#1:1336,2\n356#1:1341\n332#1:1344\n447#1:1383,6\n447#1:1398,4\n447#1:1408,2\n455#1:1418\n455#1:1419,8\n455#1:1436,4\n455#1:1446,2\n457#1:1462,6\n457#1:1477,4\n457#1:1487,2\n457#1:1493\n476#1:1503,6\n476#1:1518,4\n476#1:1528,2\n476#1:1534\n455#1:1538\n447#1:1541\n533#1:1550,6\n533#1:1565,4\n533#1:1575,2\n535#1:1587,6\n535#1:1602,4\n535#1:1612,2\n535#1:1618\n533#1:1622\n332#1:1217,9\n332#1:1238\n342#1:1254,9\n342#1:1275\n342#1:1277,2\n356#1:1317,9\n356#1:1338,3\n332#1:1342,2\n447#1:1389,9\n447#1:1410\n455#1:1427,9\n455#1:1448\n457#1:1468,9\n457#1:1489\n457#1:1491,2\n476#1:1509,9\n476#1:1530\n476#1:1532,2\n455#1:1536,2\n447#1:1539,2\n533#1:1556,9\n533#1:1577\n535#1:1593,9\n535#1:1614\n535#1:1616,2\n533#1:1620,2\n332#1:1230,6\n342#1:1267,6\n356#1:1330,6\n447#1:1402,6\n455#1:1440,6\n457#1:1481,6\n476#1:1522,6\n533#1:1569,6\n535#1:1606,6\n533#1:1543\n533#1:1544,6\n533#1:1578\n533#1:1623\n325#1:1651\n325#1:1652,2\n439#1:1657\n439#1:1658,2\n326#1:1654\n326#1:1655,2\n1156#1:1660\n1157#1:1661\n*E\n"})
public final class NavigationDrawerKt {
    public static final float a;
    public static final float b;
    public static final TweenSpec c;

    static {
        NavigationDrawerKt.a = 400.0f;
        NavigationDrawerKt.b = 240.0f;
        NavigationDrawerKt.c = new TweenSpec(0x100, 0, null, 6, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DismissibleDrawerSheet-Snr_uVM(@NotNull DrawerState drawerState0, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, float f, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        Shape shape1;
        WindowInsets windowInsets1;
        Modifier modifier1;
        WindowInsets windowInsets2;
        float f2;
        Modifier modifier2;
        float f1;
        long v7;
        int v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1473549901);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(drawerState0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v4 |= (composer1.changed(shape0) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x800 : 0x400;
            }
            else {
                v5 = v;
                v6 = 0x400;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0x6000) == 0) {
            v7 = v1;
            v4 |= ((v3 & 16) != 0 || !composer1.changed(v7) ? 0x2000 : 0x4000);
        }
        else {
            v7 = v1;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            f1 = f;
        }
        else if((0x30000 & v2) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x20000 : 0x10000);
        }
        else {
            f1 = f;
        }
        if((v2 & 0x180000) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(windowInsets0) ? 0x80000 : 0x100000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                shape1 = (v3 & 4) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
                if((v3 & 8) != 0) {
                    v5 = DrawerDefaults.INSTANCE.getStandardContainerColor(composer1, 6);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 9 & 14);
                    v4 &= 0xFFFF1FFF;
                }
                f2 = (v3 & 0x20) == 0 ? f1 : 0.0f;
                if((v3 & 0x40) == 0) {
                    windowInsets2 = windowInsets0;
                }
                else {
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v4 &= 0xFFC7FFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                shape1 = shape0;
                f2 = f1;
                windowInsets2 = windowInsets0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1473549901, v4, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:699)");
            }
            NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState0, ComposableLambdaKt.rememberComposableLambda(0xCFD79302, true, new ye(windowInsets2, modifier2, shape1, v5, v7, f2, function30, 0), composer1, 54), composer1, v4 & 14 | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            f1 = f2;
            windowInsets1 = windowInsets2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            windowInsets1 = windowInsets0;
            shape1 = shape0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ze(drawerState0, modifier1, shape1, v5, v7, f1, windowInsets1, function30, v2, v3, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DismissibleDrawerSheet-afqeVBk(@Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, float f, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        WindowInsets windowInsets1;
        float f2;
        long v8;
        Modifier modifier1;
        WindowInsets windowInsets2;
        float f3;
        Modifier modifier2;
        float f1;
        long v7;
        int v6;
        long v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-588600583);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            shape1 = shape0;
        }
        else if((v2 & 0x30) == 0) {
            shape1 = shape0;
            v4 |= (composer1.changed(shape1) ? 0x20 : 16);
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100 : 0x80;
            }
            else {
                v5 = v;
                v6 = 0x80;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0xC00) == 0) {
            v7 = v1;
            v4 |= ((v3 & 8) != 0 || !composer1.changed(v7) ? 0x400 : 0x800);
        }
        else {
            v7 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            f1 = f;
        }
        else if((v2 & 0x6000) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((0x30000 & v2) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(windowInsets0) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    shape1 = RectangleShapeKt.getRectangleShape();
                }
                if((v3 & 4) != 0) {
                    v5 = DrawerDefaults.INSTANCE.getStandardContainerColor(composer1, 6);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    f1 = 0.0f;
                }
                if((v3 & 0x20) == 0) {
                    f3 = f1;
                    windowInsets2 = windowInsets0;
                }
                else {
                    v4 &= 0xFFF8FFFF;
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    f3 = f1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                f3 = f1;
                windowInsets2 = windowInsets0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-588600583, v4, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:655)");
            }
            NavigationDrawerKt.DrawerSheet-7zSek6w(null, windowInsets2, modifier2, shape1, v5, v7, f3, function30, composer1, 6 | v4 >> 12 & 0x70 | v4 << 6 & 0x380 | v4 << 6 & 0x1C00 | 0xE000 & v4 << 6 | 0x70000 & v4 << 6 | v4 << 6 & 0x380000 | v4 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v8 = v5;
            windowInsets1 = windowInsets2;
            f2 = f3;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v8 = v5;
            f2 = f1;
            windowInsets1 = windowInsets0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new xe(modifier1, shape1, v8, v7, f2, windowInsets1, function30, v2, v3, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DismissibleNavigationDrawer(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable DrawerState drawerState0, boolean z, @NotNull Function2 function21, @Nullable Composer composer0, int v, int v1) {
        boolean z2;
        boolean z1;
        int v3;
        DrawerState drawerState1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x17C56426);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            if((v1 & 4) == 0) {
                drawerState1 = drawerState0;
                v3 = composer1.changed(drawerState1) ? 0x100 : 0x80;
            }
            else {
                drawerState1 = drawerState0;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            drawerState1 = drawerState0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 4) != 0) {
                    v2 &= -897;
                    drawerState1 = NavigationDrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer1, 6, 2);
                }
                if((v1 & 8) != 0) {
                    z1 = true;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x17C56426, v2, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:437)");
            }
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            int v4 = v2 & 0x380 ^ 0x180;
            boolean z3 = v4 > 0x100 && composer1.changed(drawerState1) || (v2 & 0x180) == 0x100;
            boolean z4 = composer1.changed(density0);
            af af0 = composer1.rememberedValue();
            if(z3 || z4 || af0 == composer$Companion0.getEmpty()) {
                af0 = new af(drawerState1, density0, 0);
                composer1.updateRememberedValue(af0);
            }
            EffectsKt.SideEffect(af0, composer1, 0);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            String s = Strings_androidKt.getString-2EP1pXo(string.navigation_menu, composer1, 0);
            boolean z5 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Modifier modifier2 = AnchoredDraggableKt.anchoredDraggable$default(modifier1, drawerState1.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z1, z5, null, 16, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            boolean z6 = v4 > 0x100 && composer1.changed(drawerState1) || (v2 & 0x180) == 0x100;
            gf gf0 = composer1.rememberedValue();
            if(z6 || gf0 == composer$Companion0.getEmpty()) {
                gf0 = new gf(0, drawerState1, mutableState0);
                composer1.updateRememberedValue(gf0);
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, gf0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function23);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            boolean z7 = composer1.changed(s);
            boolean z8 = v4 > 0x100 && composer1.changed(drawerState1) || (v2 & 0x180) == 0x100;
            boolean z9 = composer1.changedInstance(coroutineScope0);
            df df0 = composer1.rememberedValue();
            if((z7 | z8 | z9) != 0 || df0 == composer$Companion0.getEmpty()) {
                df0 = new df(s, drawerState1, coroutineScope0, 0);
                composer1.updateRememberedValue(df0);
            }
            Modifier modifier5 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, df0, 1, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function24);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v2 & 14)));
            composer1.endNode();
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                a.t(v8, composer1, v8, function25);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            function21.invoke(composer1, ((int)(v2 >> 12 & 14)));
            composer1.endNode();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        z2 = z1;
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vb(function20, modifier1, drawerState1, z2, function21, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DrawerSheet-7zSek6w(@Nullable DrawerPredictiveBackState drawerPredictiveBackState0, @NotNull WindowInsets windowInsets0, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, float f, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        long v6;
        Shape shape2;
        Modifier modifier2;
        long v9;
        int v8;
        long v7;
        long v10;
        float f1;
        long v5;
        Shape shape1;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xF6F76B83);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(drawerPredictiveBackState0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(windowInsets0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v2 & 0x180) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            shape1 = shape0;
        }
        else if((v2 & 0xC00) == 0) {
            shape1 = shape0;
            v4 |= (composer1.changed(shape1) ? 0x800 : 0x400);
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0x6000) == 0) {
            v5 = v;
            v4 |= ((v3 & 16) != 0 || !composer1.changed(v5) ? 0x2000 : 0x4000);
        }
        else {
            v5 = v;
        }
        if((0x30000 & v2) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(v1) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) == 0) {
            f1 = f;
            if((v2 & 0x180000) == 0) {
                v4 |= (composer1.changed(f1) ? 0x100000 : 0x80000);
            }
        }
        else {
            v4 |= 0x180000;
            f1 = f;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v4) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 4) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v3 & 8) != 0) {
                    shape1 = RectangleShapeKt.getRectangleShape();
                }
                if((v3 & 16) != 0) {
                    v5 = DrawerDefaults.INSTANCE.getStandardContainerColor(composer1, 6);
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) == 0) {
                    v10 = v1;
                }
                else {
                    v10 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 12 & 14);
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    f1 = 0.0f;
                }
                v8 = v4;
                v9 = v5;
                v7 = v10;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                v7 = v1;
                v8 = v4;
                v9 = v5;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF6F76B83, v8, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:763)");
            }
            boolean z = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            if(drawerPredictiveBackState0 == null) {
                modifier2 = Modifier.Companion;
            }
            else {
                vf vf0 = new vf(drawerPredictiveBackState0, z, 1);
                modifier2 = GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, vf0);
            }
            SurfaceKt.Surface-T9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.sizeIn-qDBjuR0$default(modifier1, NavigationDrawerKt.b, 0.0f, 0.0f, 0.0f, 10, null).then(modifier2), 0.0f, 1, null), shape1, v9, v7, f1, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(669057502, true, new hf(drawerPredictiveBackState0, z, windowInsets0, function30), composer1, 54), composer1, v8 >> 6 & 0x70 | 0xC00000 | v8 >> 6 & 0x380 | v8 >> 6 & 0x1C00 | v8 >> 6 & 0xE000, 0x60);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v5 = v9;
            shape2 = shape1;
            v6 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            shape2 = shape1;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z(drawerPredictiveBackState0, windowInsets0, modifier1, shape2, v5, v6, f1, function30, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalDrawerSheet-Snr_uVM(@NotNull DrawerState drawerState0, @Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, float f, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        long v7;
        long v6;
        Shape shape1;
        Modifier modifier1;
        Modifier modifier2;
        int v5;
        WindowInsets windowInsets1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x5A2EF71C);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(drawerState0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v4 |= ((v3 & 4) != 0 || !composer1.changed(shape0) ? 0x80 : 0x100);
        }
        if((v2 & 0xC00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(v) ? 0x400 : 0x800);
        }
        if((v2 & 0x6000) == 0) {
            v4 |= ((v3 & 16) != 0 || !composer1.changed(v1) ? 0x2000 : 0x4000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x30000 & v2) == 0) {
            v4 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v2) == 0) {
            if((v3 & 0x40) == 0) {
                windowInsets1 = windowInsets0;
                v5 = composer1.changed(windowInsets1) ? 0x100000 : 0x80000;
            }
            else {
                windowInsets1 = windowInsets0;
                v5 = 0x80000;
            }
            v4 |= v5;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0xC00000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 4) == 0) {
                    shape1 = shape0;
                }
                else {
                    shape1 = DrawerDefaults.INSTANCE.getShape(composer1, 6);
                    v4 &= -897;
                }
                if((v3 & 8) == 0) {
                    v6 = v;
                }
                else {
                    v6 = DrawerDefaults.INSTANCE.getModalContainerColor(composer1, 6);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) == 0) {
                    v7 = v1;
                }
                else {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 9 & 14);
                    v4 &= 0xFFFF1FFF;
                }
                f1 = (v3 & 0x20) == 0 ? f : 0.0f;
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                    windowInsets1 = DrawerDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                shape1 = shape0;
                v6 = v;
                v7 = v1;
                f1 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5A2EF71C, v4, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:611)");
            }
            NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState0, ComposableLambdaKt.rememberComposableLambda(0x5C86DF91, true, new ye(windowInsets1, modifier2, shape1, v6, v7, f1, function30, 1), composer1, 54), composer1, v4 & 14 | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            v6 = v;
            v7 = v1;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ze(drawerState0, modifier1, shape1, v6, v7, f1, windowInsets1, function30, v2, v3, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ModalDrawerSheet-afqeVBk(@Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, float f, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        Shape shape2;
        WindowInsets windowInsets2;
        float f2;
        Modifier modifier2;
        int v10;
        WindowInsets windowInsets1;
        float f1;
        int v9;
        long v8;
        int v7;
        long v6;
        int v5;
        Shape shape1;
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1001163336);
        if((v3 & 1) != 0) {
            v4 = v2 | 6;
            modifier1 = modifier0;
        }
        else if((v2 & 6) == 0) {
            modifier1 = modifier0;
            v4 = (composer1.changed(modifier1) ? 4 : 2) | v2;
        }
        else {
            modifier1 = modifier0;
            v4 = v2;
        }
        if((v2 & 0x30) == 0) {
            if((v3 & 2) == 0) {
                shape1 = shape0;
                v5 = composer1.changed(shape1) ? 0x20 : 16;
            }
            else {
                shape1 = shape0;
                v5 = 16;
            }
            v4 |= v5;
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                v6 = v;
                v7 = composer1.changed(v6) ? 0x100 : 0x80;
            }
            else {
                v6 = v;
                v7 = 0x80;
            }
            v4 |= v7;
        }
        else {
            v6 = v;
        }
        if((v2 & 0xC00) == 0) {
            if((v3 & 8) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x800 : 0x400;
            }
            else {
                v8 = v1;
                v9 = 0x400;
            }
            v4 |= v9;
        }
        else {
            v8 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            f1 = f;
        }
        else if((v2 & 0x6000) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((0x30000 & v2) == 0) {
            if((v3 & 0x20) == 0) {
                windowInsets1 = windowInsets0;
                v10 = composer1.changed(windowInsets1) ? 0x20000 : 0x10000;
            }
            else {
                windowInsets1 = windowInsets0;
                v10 = 0x10000;
            }
            v4 |= v10;
        }
        else {
            windowInsets1 = windowInsets0;
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((0x92493 & v4) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier1 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                    shape1 = DrawerDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                    v6 = DrawerDefaults.INSTANCE.getModalContainerColor(composer1, 6);
                }
                if((v3 & 8) != 0) {
                    long v11 = ColorSchemeKt.contentColorFor-ek8zF_U(v6, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                    v8 = v11;
                }
                if((v3 & 16) != 0) {
                    f1 = 0.0f;
                }
                if((v3 & 0x20) == 0) {
                    f2 = f1;
                    windowInsets2 = windowInsets1;
                }
                else {
                    v4 &= 0xFFF8FFFF;
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    f2 = f1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier1;
                f2 = f1;
                windowInsets2 = windowInsets1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001163336, v4, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:567)");
            }
            NavigationDrawerKt.DrawerSheet-7zSek6w(null, windowInsets2, modifier2, shape1, v6, v8, f2, function30, composer1, v4 >> 12 & 0x70 | 6 | v4 << 6 & 0x380 | v4 << 6 & 0x1C00 | 0xE000 & v4 << 6 | 0x70000 & v4 << 6 | v4 << 6 & 0x380000 | v4 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            windowInsets1 = windowInsets2;
            shape2 = shape1;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            shape2 = shape1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new xe(modifier1, shape2, v6, v8, f1, windowInsets1, function30, v2, v3, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ModalNavigationDrawer-FHprtrg(@NotNull Function2 function20, @Nullable Modifier modifier0, @Nullable DrawerState drawerState0, boolean z, long v, @NotNull Function2 function21, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier2;
        long v7;
        boolean z2;
        DrawerState drawerState2;
        MutableState mutableState1;
        long v9;
        int v8;
        boolean z3;
        long v6;
        int v5;
        boolean z1;
        int v4;
        DrawerState drawerState1;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1169303680);
        if((v2 & 1) == 0) {
            v3 = (v1 & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v1 & 0x30) == 0) {
            modifier1 = modifier0;
            v3 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 0x180) == 0) {
            if((v2 & 4) == 0) {
                drawerState1 = drawerState0;
                v4 = composer1.changed(drawerState1) ? 0x100 : 0x80;
            }
            else {
                drawerState1 = drawerState0;
                v4 = 0x80;
            }
            v3 |= v4;
        }
        else {
            drawerState1 = drawerState0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            z1 = z;
        }
        else if((v1 & 0xC00) == 0) {
            z1 = z;
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v1 & 0x6000) == 0) {
            v5 = v2 & 2;
            v6 = v;
            v3 |= ((v2 & 16) != 0 || !composer1.changed(v6) ? 0x2000 : 0x4000);
        }
        else {
            v5 = v2 & 2;
            v6 = v;
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x20000 : 0x10000);
        }
        if((74899 & v3) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if(v5 != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 4) != 0) {
                    drawerState1 = NavigationDrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer1, 6, 2);
                    v3 &= -897;
                }
                if((v2 & 8) != 0) {
                    z1 = true;
                }
                if((v2 & 16) == 0) {
                    z3 = z1;
                    v8 = v3;
                    v9 = v6;
                }
                else {
                    v9 = DrawerDefaults.INSTANCE.getScrimColor(composer1, 6);
                    v8 = v3 & 0xFFFF1FFF;
                    z3 = z1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 4) != 0) {
                    v3 &= -897;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                z3 = z1;
                v8 = v3;
                v9 = v6;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169303680, v8, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:320)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            String s = Strings_androidKt.getString-2EP1pXo(string.navigation_menu, composer1, 0);
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            boolean z4 = composer1.changed(density0);
            MutableFloatState mutableFloatState0 = composer1.rememberedValue();
            if(z4 || mutableFloatState0 == composer$Companion0.getEmpty()) {
                mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer1.updateRememberedValue(mutableFloatState0);
            }
            int v10 = v8 & 0x380 ^ 0x180;
            boolean z5 = v10 > 0x100 && composer1.changed(drawerState1) || (v8 & 0x180) == 0x100;
            boolean z6 = composer1.changed(density0);
            af af0 = composer1.rememberedValue();
            if(z5 || z6 || af0 == composer$Companion0.getEmpty()) {
                af0 = new af(drawerState1, density0, 1);
                composer1.updateRememberedValue(af0);
            }
            EffectsKt.SideEffect(af0, composer1, 0);
            boolean z7 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Modifier modifier3 = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier1, 0.0f, 1, null), drawerState1.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z3, z7, null, 16, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                mutableState1 = mutableState0;
                a.t(v11, composer1, v11, function22);
            }
            else {
                mutableState1 = mutableState0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                    a.t(v11, composer1, v11, function22);
                }
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                a.t(v12, composer1, v12, function23);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function21.invoke(composer1, ((int)(v8 >> 15 & 14)));
            composer1.endNode();
            boolean z8 = drawerState1.isOpen();
            int v13 = (v10 <= 0x100 || !composer1.changed(drawerState1)) && (v8 & 0x180) != 0x100 ? 0 : 1;
            boolean z9 = composer1.changedInstance(coroutineScope0);
            jf jf0 = composer1.rememberedValue();
            if((((v8 & 0x1C00) == 0x800 ? 1 : 0) | v13 | z9) != 0 || jf0 == composer$Companion0.getEmpty()) {
                jf0 = new jf(z3, drawerState1, coroutineScope0, 0);
                composer1.updateRememberedValue(jf0);
            }
            boolean z10 = composer1.changed(mutableFloatState0);
            boolean z11 = v10 > 0x100 && composer1.changed(drawerState1) || (v8 & 0x180) == 0x100;
            m m0 = composer1.rememberedValue();
            if(z10 || z11 || m0 == composer$Companion0.getEmpty()) {
                m0 = new m(3, drawerState1, mutableFloatState0);
                composer1.updateRememberedValue(m0);
            }
            NavigationDrawerKt.a(z8, jf0, m0, v9, composer1, v8 >> 3 & 0x1C00);
            boolean z12 = v10 > 0x100 && composer1.changed(drawerState1) || (v8 & 0x180) == 0x100;
            kf kf0 = composer1.rememberedValue();
            if(z12 || kf0 == composer$Companion0.getEmpty()) {
                kf0 = new kf(drawerState1);
                composer1.updateRememberedValue(kf0);
            }
            Modifier modifier6 = OffsetKt.offset(modifier$Companion0, kf0);
            boolean z13 = composer1.changed(s);
            boolean z14 = v10 > 0x100 && composer1.changed(drawerState1) || (v8 & 0x180) == 0x100;
            boolean z15 = composer1.changedInstance(coroutineScope0);
            df df0 = composer1.rememberedValue();
            if((z13 | z14 | z15) != 0 || df0 == composer$Companion0.getEmpty()) {
                df0 = new df(s, drawerState1, coroutineScope0, 1);
                composer1.updateRememberedValue(df0);
            }
            Modifier modifier7 = SemanticsModifierKt.semantics$default(modifier6, false, df0, 1, null);
            boolean z16 = v10 > 0x100 && composer1.changed(drawerState1) || (v8 & 0x180) == 0x100;
            boolean z17 = composer1.changed(mutableFloatState0);
            of of0 = composer1.rememberedValue();
            if(z17 || z16 || of0 == composer$Companion0.getEmpty()) {
                of0 = new of(drawerState1, mutableState1, mutableFloatState0);
                composer1.updateRememberedValue(of0);
            }
            int v14 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, of0, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v14)) {
                a.t(v14, composer1, v14, function24);
            }
            Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(((v8 & 14) << 6 & 0x380 | 6) >> 6 & 14)));
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
            drawerState2 = drawerState1;
            modifier2 = modifier1;
            v7 = v9;
        }
        else {
            composer1.skipToGroupEnd();
            drawerState2 = drawerState1;
            z2 = z1;
            v7 = v6;
            modifier2 = modifier1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new pf(function20, modifier2, drawerState2, z2, v7, function21, v1, v2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationDrawerItem(@NotNull Function2 function20, boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, @Nullable NavigationDrawerItemColors navigationDrawerItemColors0, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Composer composer0, int v, int v1) {
        Shape shape1;
        Function2 function26;
        Function2 function25;
        MutableInteractionSource mutableInteractionSource1;
        NavigationDrawerItemColors navigationDrawerItemColors1;
        Modifier modifier1;
        Shape shape2;
        Function2 function28;
        Function2 function27;
        int v3;
        MutableInteractionSource mutableInteractionSource2;
        NavigationDrawerItemColors navigationDrawerItemColors2;
        Modifier modifier2;
        Shape shape3;
        Function2 function24;
        Function2 function23;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xB23CFA91);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function23 = function21;
        }
        else if((v & 0x6000) == 0) {
            function23 = function21;
            v2 |= (composer1.changedInstance(function23) ? 0x4000 : 0x2000);
        }
        else {
            function23 = function21;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            function24 = function22;
        }
        else if((0x30000 & v) == 0) {
            function24 = function22;
            v2 |= (composer1.changedInstance(function24) ? 0x20000 : 0x10000);
        }
        else {
            function24 = function22;
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(shape0) ? 0x80000 : 0x100000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(navigationDrawerItemColors0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(mutableInteractionSource0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 16) != 0) {
                    function23 = null;
                }
                if((v1 & 0x20) != 0) {
                    function24 = null;
                }
                if((v1 & 0x40) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) == 0) {
                    navigationDrawerItemColors2 = navigationDrawerItemColors0;
                }
                else {
                    navigationDrawerItemColors2 = NavigationDrawerItemDefaults.INSTANCE.colors-oq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0x6000000, 0xFF);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier2 = modifier3;
                    shape2 = shape3;
                }
                else {
                    modifier2 = modifier3;
                    shape2 = shape3;
                    mutableInteractionSource2 = null;
                }
                function27 = function23;
                function28 = function24;
                v3 = v2;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                navigationDrawerItemColors2 = navigationDrawerItemColors0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v3 = v2;
                function27 = function23;
                function28 = function24;
                shape2 = shape0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB23CFA91, v3, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:928)");
            }
            SurfaceKt.Surface-d85dljk(z, function00, SizeKt.fillMaxWidth$default(SizeKt.heightIn-VpY3zN4$default(SemanticsModifierKt.semantics$default(modifier2, false, qf.w, 1, null), 0.0f, 0.0f, 2, null), 0.0f, 1, null), false, shape2, ((Color)navigationDrawerItemColors2.containerColor(z, composer1, v3 >> 3 & 14 | v3 >> 18 & 0x70).getValue()).unbox-impl(), 0L, 0.0f, 0.0f, null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(0xB69E1A7, true, new rf(function27, navigationDrawerItemColors2, z, function28, function20), composer1, 54), composer1, v3 >> 3 & 0x7E | v3 >> 6 & 0xE000, v3 >> 24 & 14 | 0x30, 968);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function25 = function27;
            function26 = function28;
            shape1 = shape2;
            mutableInteractionSource1 = mutableInteractionSource2;
            modifier1 = modifier2;
            navigationDrawerItemColors1 = navigationDrawerItemColors2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            navigationDrawerItemColors1 = navigationDrawerItemColors0;
            mutableInteractionSource1 = mutableInteractionSource0;
            function25 = function23;
            function26 = function24;
            shape1 = shape0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(function20, z, function00, modifier1, function25, function26, shape1, navigationDrawerItemColors1, mutableInteractionSource1, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void PermanentDrawerSheet-afqeVBk(@Nullable Modifier modifier0, @Nullable Shape shape0, long v, long v1, float f, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        WindowInsets windowInsets1;
        Shape shape2;
        Modifier modifier1;
        long v8;
        float f2;
        long v9;
        Shape shape3;
        Modifier modifier2;
        float f1;
        long v7;
        int v6;
        long v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x98AF20E7);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            shape1 = shape0;
        }
        else if((v2 & 0x30) == 0) {
            shape1 = shape0;
            v4 |= (composer1.changed(shape1) ? 0x20 : 16);
        }
        else {
            shape1 = shape0;
        }
        if((v2 & 0x180) == 0) {
            if((v3 & 4) == 0) {
                v5 = v;
                v6 = composer1.changed(v5) ? 0x100 : 0x80;
            }
            else {
                v5 = v;
                v6 = 0x80;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v2 & 0xC00) == 0) {
            v7 = v1;
            v4 |= ((v3 & 8) != 0 || !composer1.changed(v7) ? 0x400 : 0x800);
        }
        else {
            v7 = v1;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            f1 = f;
        }
        else if((v2 & 0x6000) == 0) {
            f1 = f;
            v4 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        if((v2 & 0x30000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(windowInsets0) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x180000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x92493) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    shape1 = RectangleShapeKt.getRectangleShape();
                }
                if((v3 & 4) != 0) {
                    v5 = DrawerDefaults.INSTANCE.getStandardContainerColor(composer1, 6);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v7 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 6 & 14);
                    v4 &= 0xFFFFE3FF;
                }
                float f3 = (v3 & 16) == 0 ? f : 0.0f;
                if((v3 & 0x20) == 0) {
                    windowInsets1 = windowInsets0;
                    f2 = f3;
                }
                else {
                    v4 &= 0xFFF8FFFF;
                    f2 = f3;
                    windowInsets1 = DrawerDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                shape3 = shape1;
                v9 = v5;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                modifier2 = modifier0;
                shape3 = shape1;
                v9 = v5;
                f2 = f1;
                windowInsets1 = windowInsets0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x98AF20E7, v4, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:739)");
            }
            String s = Strings_androidKt.getString-2EP1pXo(string.navigation_menu, composer1, 0);
            boolean z = composer1.changed(s);
            androidx.compose.material3.m m0 = composer1.rememberedValue();
            if(z || m0 == Composer.Companion.getEmpty()) {
                m0 = new androidx.compose.material3.m(s, 4);
                composer1.updateRememberedValue(m0);
            }
            NavigationDrawerKt.DrawerSheet-7zSek6w(null, windowInsets1, SemanticsModifierKt.semantics$default(modifier2, false, m0, 1, null), shape3, v9, v7, f2, function30, composer1, v4 >> 12 & 0x70 | 6 | v4 << 6 & 0x1C00 | 0xE000 & v4 << 6 | 0x70000 & v4 << 6 | v4 << 6 & 0x380000 | v4 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v5 = v9;
            modifier1 = modifier2;
            f1 = f2;
            shape2 = shape3;
            v8 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            v8 = v7;
            modifier1 = modifier0;
            shape2 = shape1;
            windowInsets1 = windowInsets0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new xe(modifier1, shape2, v5, v8, f1, windowInsets1, function30, v2, v3, 2));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void PermanentNavigationDrawer(@NotNull Function2 function20, @Nullable Modifier modifier0, @NotNull Function2 function21, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xEF7FB3A8);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEF7FB3A8, v2, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:531)");
            }
            Modifier modifier1 = SizeKt.fillMaxSize$default(modifier0, 0.0f, 1, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function22);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v2 & 14)));
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, Modifier.Companion);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function23);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function21.invoke(composer1, ((int)(v2 >> 6 & 14)));
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new sf(function20, modifier0, function21, v, v1, 0));
        }
    }

    public static final void a(boolean z, Function0 function00, Function0 function01, long v, Composer composer0, int v1) {
        Modifier modifier1;
        Composer composer1 = composer0.startRestartGroup(2106487387);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, v2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1135)");
            }
            String s = Strings_androidKt.getString-2EP1pXo(string.close_drawer, composer1, 0);
            composer1.startReplaceGroup(0x959ECD9D);
            if(z) {
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                uf uf0 = composer1.rememberedValue();
                if((v2 & 0x70) == 0x20 || uf0 == Composer.Companion.getEmpty()) {
                    uf0 = new uf(function00, null);
                    composer1.updateRememberedValue(uf0);
                }
                Modifier modifier0 = SuspendingPointerInputFilterKt.pointerInput(modifier$Companion0, function00, uf0);
                boolean z1 = composer1.changed(s);
                ge ge0 = composer1.rememberedValue();
                if((v2 & 0x70) == 0x20 || z1 || ge0 == Composer.Companion.getEmpty()) {
                    ge0 = new ge(s, function00, 1);
                    composer1.updateRememberedValue(ge0);
                }
                modifier1 = SemanticsModifierKt.semantics(modifier0, true, ge0);
            }
            else {
                modifier1 = Modifier.Companion;
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier1);
            b b0 = composer1.rememberedValue();
            if((((v2 & 0x380) == 0x100 ? 1 : 0) | ((v2 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(v, function01, 1);
                composer1.updateRememberedValue(b0);
            }
            CanvasKt.Canvas(modifier2, b0, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new tf(z, function00, function01, v, v1, 0));
        }
    }

    public static final boolean access$DismissibleNavigationDrawer$lambda$16(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$DismissibleNavigationDrawer$lambda$17(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final boolean access$ModalNavigationDrawer_FHprtrg$lambda$2(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$ModalNavigationDrawer_FHprtrg$lambda$3(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final float access$ModalNavigationDrawer_FHprtrg$lambda$5(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$ModalNavigationDrawer_FHprtrg$lambda$6(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final float access$calculateFraction(float f, float f1, float f2) {
        return c.coerceIn((f2 - f) / (f1 - f), 0.0f, 1.0f);
    }

    public static final float access$calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope0, DrawerPredictiveBackState drawerPredictiveBackState0) {
        float f = Size.getWidth-impl(graphicsLayerScope0.getSize-NH-jbRc());
        if(!Float.isNaN(f) && f != 0.0f) {
            return drawerPredictiveBackState0.getSwipeEdgeMatchesDrawer() ? 1.0f + drawerPredictiveBackState0.getScaleXDistance() * 1.0f / f : 1.0f + drawerPredictiveBackState0.getScaleXDistance() * -1.0f / f;
        }
        return 1.0f;
    }

    public static final float access$calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope0, DrawerPredictiveBackState drawerPredictiveBackState0) {
        float f = Size.getHeight-impl(graphicsLayerScope0.getSize-NH-jbRc());
        return Float.isNaN(f) || f == 0.0f ? 1.0f : 1.0f - drawerPredictiveBackState0.getScaleYDistance() / f;
    }

    public static final TweenSpec access$getAnimationSpec$p() {
        return NavigationDrawerKt.c;
    }

    public static final float access$getDrawerPositionalThreshold$p() [...] // Inlined contents

    public static final float access$getDrawerVelocityThreshold$p() [...] // 潜在的解密器

    public static final float access$getMinimumDrawerWidth$p() [...] // 潜在的解密器

    public static final Modifier access$predictiveBackDrawerChild(Modifier modifier0, DrawerPredictiveBackState drawerPredictiveBackState0, boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier0, new vf(drawerPredictiveBackState0, z, 0));
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull DrawerValue drawerValue0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        if((v1 & 2) != 0) {
            function10 = wf.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, v, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
        }
        int v2 = 0;
        Saver saver0 = DrawerState.Companion.Saver(function10);
        int v3 = ((v & 14 ^ 6) <= 4 || !composer0.changed(drawerValue0)) && (v & 6) != 4 ? 0 : 1;
        if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(function10) || (v & 0x30) == 0x20) {
            v2 = 1;
        }
        m m0 = composer0.rememberedValue();
        if((v3 | v2) != 0 || m0 == Composer.Companion.getEmpty()) {
            m0 = new m(4, drawerValue0, function10);
            composer0.updateRememberedValue(m0);
        }
        DrawerState drawerState0 = (DrawerState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, m0, composer0, 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState0;
    }
}

