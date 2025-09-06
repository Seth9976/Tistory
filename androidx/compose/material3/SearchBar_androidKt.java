package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.room.a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001A\u009B\u0001\u0010\u0018\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\u001C\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u0091\u0001\u0010\u001B\u001A\u00020\u00012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\u001C\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u0093\u0002\u0010\u0018\u001A\u00020\u00012\u0006\u0010\u001D\u001A\u00020\u001C2\u0012\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010 \u001A\u00020\u00042\u0012\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\"\u001A\u00020\u00042\u0015\b\u0002\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\u0015\b\u0002\u0010$\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\u0015\b\u0002\u0010%\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\u001C\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010)\u001A\u0089\u0002\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u001D\u001A\u00020\u001C2\u0012\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010 \u001A\u00020\u00042\u0012\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\"\u001A\u00020\u00042\u0015\b\u0002\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\u0015\b\u0002\u0010$\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\u0015\b\u0002\u0010%\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010&2\u001C\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+\u001A\u00BB\u0001\u00108\u001A\u00020\u00012\u0012\u0010/\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,2\u0006\u00101\u001A\u0002002\u000E\u00104\u001A\n\u0012\u0006\u0012\u0004\u0018\u000103022\u000E\u00105\u001A\n\u0012\u0006\u0012\u0004\u0018\u000103022\b\b\u0002\u0010\t\u001A\u00020\b2\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\u00022\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\u001C\u0010\u0015\u001A\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0006\u00A2\u0006\u0002\b\u0002\u00A2\u0006\u0002\b\u0014H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b6\u00107\"\u001A\u0010=\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010<\"\u001A\u0010@\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b>\u0010:\u001A\u0004\b?\u0010<\"\u001A\u0010C\u001A\u00020\u000E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bA\u0010:\u001A\u0004\bB\u0010<\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006F\u00B2\u0006\f\u0010D\u001A\u00020\u00048\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010E\u001A\u00020\u00048\nX\u008A\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "inputField", "", "expanded", "Lkotlin/Function1;", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/SearchBarColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "SearchBar-Y92LkZI", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SearchBar", "DockedSearchBar-EQC0FA8", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DockedSearchBar", "", "query", "onQueryChange", "onSearch", "active", "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animationProgress", "Landroidx/compose/runtime/MutableFloatState;", "finalBackProgress", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "firstBackEvent", "currentBackEvent", "SearchBarImpl-j1jLAyQ", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarImpl", "c", "F", "getDockedExpandedTableMinHeight", "()F", "DockedExpandedTableMinHeight", "d", "getSearchBarMinWidth", "SearchBarMinWidth", "f", "getSearchBarVerticalPadding", "SearchBarVerticalPadding", "useFullScreenShape", "showContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1243:1\n1223#2,6:1244\n1223#2,6:1250\n1223#2,6:1256\n1223#2,6:1262\n1223#2,6:1268\n1223#2,6:1274\n1223#2,6:1280\n1223#2,6:1286\n1223#2,6:1293\n1223#2,6:1299\n1223#2,6:1305\n1223#2,6:1311\n1223#2,6:1317\n1223#2,6:1323\n77#3:1292\n78#4,6:1329\n85#4,4:1344\n89#4,2:1354\n78#4,6:1364\n85#4,4:1379\n89#4,2:1389\n93#4:1395\n78#4,6:1404\n85#4,4:1419\n89#4,2:1429\n93#4:1435\n78#4,6:1444\n85#4,4:1459\n89#4,2:1469\n93#4:1475\n93#4:1479\n368#5,9:1335\n377#5:1356\n368#5,9:1370\n377#5:1391\n378#5,2:1393\n368#5,9:1410\n377#5:1431\n378#5,2:1433\n368#5,9:1450\n377#5:1471\n378#5,2:1473\n378#5,2:1477\n4032#6,6:1348\n4032#6,6:1383\n4032#6,6:1423\n4032#6,6:1463\n71#7:1357\n68#7,6:1358\n74#7:1392\n78#7:1396\n71#7:1397\n68#7,6:1398\n74#7:1432\n78#7:1436\n71#7:1437\n68#7,6:1438\n74#7:1472\n78#7:1476\n81#8:1480\n81#8:1481\n71#9:1482\n148#10:1483\n148#10:1484\n148#10:1485\n148#10:1486\n148#10:1487\n148#10:1488\n148#10:1489\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n179#1:1244,6\n180#1:1250,6\n181#1:1256,6\n182#1:1262,6\n184#1:1268,6\n200#1:1274,6\n201#1:1280,6\n326#1:1286,6\n873#1:1293,6\n877#1:1299,6\n904#1:1305,6\n946#1:1311,6\n951#1:1317,6\n966#1:1323,6\n869#1:1292\n947#1:1329,6\n947#1:1344,4\n947#1:1354,2\n956#1:1364,6\n956#1:1379,4\n956#1:1389,2\n956#1:1395\n957#1:1404,6\n957#1:1419,4\n957#1:1429,2\n957#1:1435\n961#1:1444,6\n961#1:1459,4\n961#1:1469,2\n961#1:1475\n947#1:1479\n947#1:1335,9\n947#1:1356\n956#1:1370,9\n956#1:1391\n956#1:1393,2\n957#1:1410,9\n957#1:1431\n957#1:1433,2\n961#1:1450,9\n961#1:1471\n961#1:1473,2\n947#1:1477,2\n947#1:1348,6\n956#1:1383,6\n957#1:1423,6\n961#1:1463,6\n956#1:1357\n956#1:1358,6\n956#1:1392\n956#1:1396\n957#1:1397\n957#1:1398,6\n957#1:1432\n957#1:1436\n961#1:1437\n961#1:1438,6\n961#1:1472\n961#1:1476\n873#1:1480\n904#1:1481\n1191#1:1482\n1192#1:1483\n1194#1:1484\n1195#1:1485\n1196#1:1486\n1198#1:1487\n1200#1:1488\n1202#1:1489\n*E\n"})
public final class SearchBar_androidKt {
    public static final TextFieldColors a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final TweenSpec j;
    public static final TweenSpec k;
    public static final TweenSpec l;
    public static final EnterTransition m;
    public static final ExitTransition n;

    // 去混淆评级： 低(42)
    static {
        SearchBar_androidKt.a = new TextFieldColors(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, new TextSelectionColors(0L, 0L, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null);
        SearchBar_androidKt.b = 0.0f;
        SearchBar_androidKt.c = 240.0f;
        SearchBar_androidKt.d = 360.0f;
        SearchBar_androidKt.e = 720.0f;
        SearchBar_androidKt.f = 8.0f;
        SearchBar_androidKt.g = 4.0f;
        SearchBar_androidKt.h = 8.0f;
        SearchBar_androidKt.i = 24.0f;
        CubicBezierEasing cubicBezierEasing0 = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        CubicBezierEasing cubicBezierEasing1 = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        TweenSpec tweenSpec0 = AnimationSpecKt.tween(600, 100, cubicBezierEasing0);
        SearchBar_androidKt.j = tweenSpec0;
        TweenSpec tweenSpec1 = AnimationSpecKt.tween(350, 100, cubicBezierEasing1);
        SearchBar_androidKt.k = tweenSpec1;
        SearchBar_androidKt.l = AnimationSpecKt.tween$default(350, 0, cubicBezierEasing1, 2, null);
        TweenSpec tweenSpec2 = AnimationSpecKt.tween(600, 100, cubicBezierEasing0);
        TweenSpec tweenSpec3 = AnimationSpecKt.tween(350, 100, cubicBezierEasing1);
        SearchBar_androidKt.m = EnterExitTransitionKt.fadeIn$default(tweenSpec0, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpec2, null, false, null, 14, null));
        SearchBar_androidKt.n = EnterExitTransitionKt.fadeOut$default(tweenSpec1, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpec3, null, false, null, 14, null));
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DockedSearchBar-EQC0FA8(@NotNull Function2 function20, boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable Shape shape0, @Nullable SearchBarColors searchBarColors0, float f, float f1, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        float f3;
        SearchBarColors searchBarColors1;
        Shape shape1;
        float f2;
        SearchBarColors searchBarColors2;
        Shape shape2;
        int v3;
        float f4;
        SearchBarColors searchBarColors3;
        int v4;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1209217899);
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
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            modifier1 = modifier0;
        }
        else if((v & 0xC00) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x800 : 0x400);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((0x30000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(searchBarColors0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((0x180000 & v) == 0) {
            v2 |= (composer1.changed(f) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(f1) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 8) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 16) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = SearchBarDefaults.INSTANCE.getDockedShape(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) == 0) {
                    v4 = v1 & 0x80;
                    searchBarColors3 = searchBarColors0;
                }
                else {
                    v4 = v1 & 0x80;
                    searchBarColors3 = SearchBarDefaults.INSTANCE.colors-dgg9oW8(0L, 0L, composer1, 0x180, 3);
                    v2 &= 0xFFF8FFFF;
                }
                f3 = (v1 & 0x40) == 0 ? f : 0.0f;
                f4 = v4 == 0 ? f1 : 0.0f;
                v3 = v2;
                searchBarColors2 = searchBarColors3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                f4 = f1;
                v3 = v2;
                shape2 = shape0;
                searchBarColors2 = searchBarColors0;
                f3 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1209217899, v3, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:292)");
            }
            long v5 = ColorSchemeKt.contentColorFor-ek8zF_U(searchBarColors2.getContainerColor-0d7_KjU(), composer1, 0);
            boolean z1 = true;
            SurfaceKt.Surface-T9BRK9s(SizeKt.width-3ABfNKs(ZIndexModifierKt.zIndex(modifier1, 1.0f), SearchBar_androidKt.d), shape2, searchBarColors2.getContainerColor-0d7_KjU(), v5, f3, f4, null, ComposableLambdaKt.rememberComposableLambda(0x345C6870, true, new aj(function20, z, searchBarColors2, function30), composer1, 54), composer1, v3 >> 9 & 0x70 | 0xC00000 | v3 >> 6 & 0xE000 | v3 >> 6 & 0x70000, 0x40);
            if((v3 & 0x380) != 0x100) {
                z1 = false;
            }
            s9 s90 = composer1.rememberedValue();
            if(z1 || s90 == Composer.Companion.getEmpty()) {
                s90 = new s9(function10, 1);
                composer1.updateRememberedValue(s90);
            }
            BackHandlerKt.BackHandler(z, s90, composer1, v3 >> 3 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape2;
            f2 = f4;
            searchBarColors1 = searchBarColors2;
        }
        else {
            composer1.skipToGroupEnd();
            f2 = f1;
            shape1 = shape0;
            searchBarColors1 = searchBarColors0;
            f3 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bj(function20, z, function10, modifier1, shape1, searchBarColors1, f3, f2, function30, v, v1));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    public static final void DockedSearchBar-eWTbjVg(@NotNull String s, @NotNull Function1 function10, @NotNull Function1 function11, boolean z, @NotNull Function1 function12, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, @Nullable SearchBarColors searchBarColors0, float f, float f1, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1, int v2) {
        SearchBarColors searchBarColors1;
        boolean z2;
        MutableInteractionSource mutableInteractionSource1;
        float f3;
        float f2;
        Shape shape1;
        Function2 function25;
        Function2 function24;
        Function2 function23;
        Modifier modifier1;
        int v14;
        boolean z3;
        int v10;
        SearchBarColors searchBarColors2;
        Shape shape2;
        Function2 function28;
        Function2 function27;
        Function2 function26;
        Modifier modifier2;
        SearchBarColors searchBarColors3;
        int v13;
        int v12;
        int v11;
        Shape shape3;
        int v9;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x4D6DFFC5);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        int v4 = 0x400;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v5 = 0x2000;
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function12) ? 0x4000 : 0x2000);
        }
        int v6 = 0x10000;
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000000 : 0x10000000);
        }
        int v7 = (v1 & 6) == 0 ? v1 | ((v2 & 0x400) != 0 || !composer1.changed(shape0) ? 2 : 4) : v1;
        if((v1 & 0x30) == 0) {
            v7 |= ((v2 & 0x800) != 0 || !composer1.changed(searchBarColors0) ? 16 : 0x20);
        }
        int v8 = v7;
        if((v2 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v8 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v2 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            if(composer1.changed(f1)) {
                v4 = 0x800;
            }
            v8 |= v4;
        }
        if((v2 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            if(composer1.changed(mutableInteractionSource0)) {
                v5 = 0x4000;
            }
            v8 |= v5;
        }
        if((v2 & 0x8000) != 0) {
            v8 |= 0x30000;
            v9 = v2 & 0x4000;
        }
        else if((v1 & 0x30000) == 0) {
            v9 = v2 & 0x4000;
            if(composer1.changedInstance(function30)) {
                v6 = 0x20000;
            }
            v8 |= v6;
        }
        else {
            v9 = v2 & 0x4000;
        }
        if((v3 & 306783379) != 306783378 || (74899 & v8) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 0x20) == 0 ? modifier0 : Modifier.Companion;
                boolean z4 = (v2 & 0x40) == 0 ? z1 : true;
                Function2 function29 = (v2 & 0x200) == 0 ? function22 : null;
                if((v2 & 0x400) == 0) {
                    shape3 = shape0;
                }
                else {
                    v8 &= -15;
                    shape3 = SearchBarDefaults.INSTANCE.getDockedShape(composer1, 6);
                }
                if((v2 & 0x800) == 0) {
                    v10 = v3;
                    v11 = v2 & 0x2000;
                    v12 = v2 & 0x1000;
                    v13 = v9;
                    searchBarColors3 = searchBarColors0;
                }
                else {
                    v10 = v3;
                    v11 = v2 & 0x2000;
                    v12 = v2 & 0x1000;
                    v13 = v9;
                    searchBarColors3 = SearchBarDefaults.INSTANCE.colors-dgg9oW8(0L, 0L, composer1, 0x180, 3);
                    v8 &= 0xFFFFFF8F;
                }
                float f4 = v12 == 0 ? f : 0.0f;
                float f5 = v11 == 0 ? f1 : 0.0f;
                if(v13 == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                    function28 = function29;
                    searchBarColors2 = searchBarColors3;
                    f2 = f4;
                    f3 = f5;
                    modifier2 = modifier3;
                    z3 = z4;
                }
                else {
                    function28 = function29;
                    searchBarColors2 = searchBarColors3;
                    f2 = f4;
                    f3 = f5;
                    modifier2 = modifier3;
                    z3 = z4;
                    mutableInteractionSource1 = null;
                }
                function26 = (v2 & 0x80) == 0 ? function20 : null;
                function27 = (v2 & 0x100) == 0 ? function21 : null;
                shape2 = shape3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x400) != 0) {
                    v8 &= -15;
                }
                if((v2 & 0x800) != 0) {
                    v8 &= 0xFFFFFF8F;
                }
                modifier2 = modifier0;
                function26 = function20;
                function27 = function21;
                function28 = function22;
                shape2 = shape0;
                searchBarColors2 = searchBarColors0;
                f2 = f;
                f3 = f1;
                mutableInteractionSource1 = mutableInteractionSource0;
                v10 = v3;
                z3 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v14 = v10;
                ComposerKt.traceEventStart(0x4D6DFFC5, v14, v8, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:825)");
            }
            else {
                v14 = v10;
            }
            SearchBar_androidKt.DockedSearchBar-EQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new cj(searchBarColors2, s, function10, function11, z, function12, z3, function26, function27, function28, mutableInteractionSource1), composer1, 54), z, function12, modifier2, shape2, searchBarColors2, f2, f3, function30, composer1, v14 >> 6 & 0x1C00 | (v14 >> 6 & 0x70 | 6 | v14 >> 6 & 0x380) | 0xE000 & v8 << 12 | 0x70000 & v8 << 12 | 0x380000 & v8 << 12 | v8 << 12 & 0x1C00000 | v8 << 9 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            z2 = z3;
            function23 = function26;
            function24 = function27;
            function25 = function28;
            shape1 = shape2;
            searchBarColors1 = searchBarColors2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function23 = function20;
            function24 = function21;
            function25 = function22;
            shape1 = shape0;
            f2 = f;
            f3 = f1;
            mutableInteractionSource1 = mutableInteractionSource0;
            z2 = z1;
            searchBarColors1 = searchBarColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new dj(s, function10, function11, z, function12, modifier1, z2, function23, function24, function25, shape1, searchBarColors1, f2, f3, mutableInteractionSource1, function30, v, v1, v2));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    public static final void SearchBar-WuY5d9Q(@NotNull String s, @NotNull Function1 function10, @NotNull Function1 function11, boolean z, @NotNull Function1 function12, @Nullable Modifier modifier0, boolean z1, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Shape shape0, @Nullable SearchBarColors searchBarColors0, float f, float f1, @Nullable WindowInsets windowInsets0, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1, int v2) {
        boolean z2;
        MutableInteractionSource mutableInteractionSource1;
        WindowInsets windowInsets1;
        float f3;
        float f2;
        SearchBarColors searchBarColors1;
        Shape shape1;
        Function2 function25;
        Function2 function24;
        Function2 function23;
        Modifier modifier1;
        int v16;
        Function2 function28;
        int v11;
        boolean z3;
        int v10;
        float f4;
        SearchBarColors searchBarColors2;
        Shape shape2;
        Function2 function27;
        Function2 function26;
        Modifier modifier2;
        int v15;
        WindowInsets windowInsets2;
        SearchBarColors searchBarColors3;
        int v14;
        int v13;
        Shape shape3;
        int v9;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1001512593);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function11) ? 0x100 : 0x80);
        }
        int v4 = 0x400;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v5 = 0x2000;
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function12) ? 0x4000 : 0x2000);
        }
        int v6 = 0x20000;
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000000 : 0x10000000);
        }
        int v7 = (v1 & 6) == 0 ? v1 | ((v2 & 0x400) != 0 || !composer1.changed(shape0) ? 2 : 4) : v1;
        if((v1 & 0x30) == 0) {
            v7 |= ((v2 & 0x800) != 0 || !composer1.changed(searchBarColors0) ? 16 : 0x20);
        }
        int v8 = v7;
        if((v2 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v8 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v2 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            if(composer1.changed(f1)) {
                v4 = 0x800;
            }
            v8 |= v4;
        }
        if((v1 & 0x6000) == 0) {
            if((v2 & 0x4000) == 0 && composer1.changed(windowInsets0)) {
                v5 = 0x4000;
            }
            v8 |= v5;
        }
        if((v2 & 0x8000) != 0) {
            v8 |= 0x30000;
            v9 = v2 & 0x2000;
        }
        else if((v1 & 0x30000) == 0) {
            v9 = v2 & 0x2000;
            if(!composer1.changed(mutableInteractionSource0)) {
                v6 = 0x10000;
            }
            v8 |= v6;
        }
        else {
            v9 = v2 & 0x2000;
        }
        if((v2 & 0x10000) != 0) {
            v8 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v8 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v3 & 306783379) != 306783378 || (0x92493 & v8) != 0x92492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 0x20) == 0 ? modifier0 : Modifier.Companion;
                boolean z4 = (v2 & 0x40) == 0 ? z1 : true;
                if((v2 & 0x400) == 0) {
                    shape3 = shape0;
                }
                else {
                    v8 &= -15;
                    shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(composer1, 6);
                }
                int v12 = v8;
                if((v2 & 0x800) == 0) {
                    v10 = v3;
                    v13 = v9;
                    v14 = v2 & 0x1000;
                    searchBarColors3 = searchBarColors0;
                }
                else {
                    v10 = v3;
                    v13 = v9;
                    v14 = v2 & 0x1000;
                    searchBarColors3 = SearchBarDefaults.INSTANCE.colors-dgg9oW8(0L, 0L, composer1, 0x180, 3);
                    v12 &= 0xFFFFFF8F;
                }
                float f5 = v14 == 0 ? f : 0.0f;
                float f6 = v13 == 0 ? f1 : 0.0f;
                if((v2 & 0x4000) == 0) {
                    windowInsets2 = windowInsets0;
                    v15 = v12;
                }
                else {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v15 = v12 & 0xFFFF1FFF;
                }
                if((v2 & 0x8000) == 0) {
                    mutableInteractionSource1 = mutableInteractionSource0;
                    searchBarColors2 = searchBarColors3;
                    f4 = f5;
                    f3 = f6;
                    windowInsets1 = windowInsets2;
                    v11 = v15;
                    z3 = z4;
                }
                else {
                    searchBarColors2 = searchBarColors3;
                    f4 = f5;
                    f3 = f6;
                    windowInsets1 = windowInsets2;
                    v11 = v15;
                    z3 = z4;
                    mutableInteractionSource1 = null;
                }
                function28 = (v2 & 0x80) == 0 ? function20 : null;
                function26 = (v2 & 0x100) == 0 ? function21 : null;
                shape2 = shape3;
                function27 = (v2 & 0x200) == 0 ? function22 : null;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x400) != 0) {
                    v8 &= -15;
                }
                if((v2 & 0x800) != 0) {
                    v8 &= 0xFFFFFF8F;
                }
                if((v2 & 0x4000) != 0) {
                    v8 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                function26 = function21;
                function27 = function22;
                shape2 = shape0;
                searchBarColors2 = searchBarColors0;
                f4 = f;
                f3 = f1;
                windowInsets1 = windowInsets0;
                mutableInteractionSource1 = mutableInteractionSource0;
                v10 = v3;
                z3 = z1;
                v11 = v8;
                function28 = function20;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                v16 = v10;
                ComposerKt.traceEventStart(1001512593, v16, v11, "androidx.compose.material3.SearchBar (SearchBar.android.kt:745)");
            }
            else {
                v16 = v10;
            }
            SearchBar_androidKt.SearchBar-Y92LkZI(ComposableLambdaKt.rememberComposableLambda(0xBAF89FB1, true, new jj(searchBarColors2, s, function10, function11, z, function12, z3, function28, function26, function27, mutableInteractionSource1), composer1, 54), z, function12, modifier2, shape2, searchBarColors2, f4, f3, windowInsets1, function30, composer1, 6 | v16 >> 6 & 0x70 | v16 >> 6 & 0x380 | v16 >> 6 & 0x1C00 | 0xE000 & v11 << 12 | 0x70000 & v11 << 12 | 0x380000 & v11 << 12 | 0x1C00000 & v11 << 12 | v11 << 12 & 0xE000000 | v11 << 9 & 0x70000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function24 = function26;
            function25 = function27;
            shape1 = shape2;
            searchBarColors1 = searchBarColors2;
            f2 = f4;
            z2 = z3;
            function23 = function28;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function23 = function20;
            function24 = function21;
            function25 = function22;
            shape1 = shape0;
            searchBarColors1 = searchBarColors0;
            f2 = f;
            f3 = f1;
            windowInsets1 = windowInsets0;
            mutableInteractionSource1 = mutableInteractionSource0;
            z2 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new kj(s, function10, function11, z, function12, modifier1, z2, function23, function24, function25, shape1, searchBarColors1, f2, f3, windowInsets1, mutableInteractionSource1, function30, v, v1, v2));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SearchBar-Y92LkZI(@NotNull Function2 function20, boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, @Nullable Shape shape0, @Nullable SearchBarColors searchBarColors0, float f, float f1, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        SearchBarColors searchBarColors1;
        Shape shape1;
        Modifier modifier2;
        float f4;
        WindowInsets windowInsets1;
        int v5;
        Animatable animatable1;
        Boolean boolean1;
        int v3;
        float f5;
        SearchBarColors searchBarColors2;
        Shape shape2;
        Modifier modifier3;
        WindowInsets windowInsets2;
        SearchBarColors searchBarColors3;
        Shape shape3;
        float f3;
        float f2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x561B9AC9);
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
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            modifier1 = modifier0;
        }
        else if((v & 0xC00) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x800 : 0x400);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(shape0) ? 0x2000 : 0x4000);
        }
        if((0x30000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(searchBarColors0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
            f2 = f;
        }
        else if((0x180000 & v) == 0) {
            f2 = f;
            v2 |= (composer1.changed(f2) ? 0x100000 : 0x80000);
        }
        else {
            f2 = f;
        }
        if((v1 & 0x80) == 0) {
            f3 = f1;
            if((v & 0xC00000) == 0) {
                v2 |= (composer1.changed(f3) ? 0x800000 : 0x400000);
            }
        }
        else {
            v2 |= 0xC00000;
            f3 = f1;
        }
        if((v & 0x6000000) == 0) {
            v2 |= ((v1 & 0x100) != 0 || !composer1.changed(windowInsets0) ? 0x2000000 : 0x4000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 8) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v1 & 16) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) == 0) {
                    searchBarColors3 = searchBarColors0;
                }
                else {
                    searchBarColors3 = SearchBarDefaults.INSTANCE.colors-dgg9oW8(0L, 0L, composer1, 0x180, 3);
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x80) != 0) {
                    f3 = 0.0f;
                }
                if((v1 & 0x100) == 0) {
                    windowInsets2 = windowInsets0;
                    shape2 = shape3;
                    v3 = v2;
                }
                else {
                    shape2 = shape3;
                    v3 = v2 & 0xF1FFFFFF;
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                }
                f4 = f3;
                modifier3 = modifier1;
                searchBarColors2 = searchBarColors3;
                f5 = (v1 & 0x40) == 0 ? f : 0.0f;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                windowInsets2 = windowInsets0;
                f4 = f3;
                modifier3 = modifier1;
                shape2 = shape0;
                searchBarColors2 = searchBarColors0;
                f5 = f2;
                v3 = v2;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x561B9AC9, v3, -1, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)");
            }
            Animatable animatable0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(animatable0 == composer$Companion0.getEmpty()) {
                animatable0 = AnimatableKt.Animatable$default((z ? 1.0f : 0.0f), 0.0f, 2, null);
                composer1.updateRememberedValue(animatable0);
            }
            MutableFloatState mutableFloatState0 = composer1.rememberedValue();
            if(mutableFloatState0 == composer$Companion0.getEmpty()) {
                mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(NaNf);
                composer1.updateRememberedValue(mutableFloatState0);
            }
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableState mutableState1 = composer1.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            Boolean boolean0 = Boolean.valueOf(z);
            boolean z1 = composer1.changedInstance(animatable0);
            ej ej0 = composer1.rememberedValue();
            if(z1 || (v3 & 0x70) == 0x20 || ej0 == composer$Companion0.getEmpty()) {
                boolean1 = boolean0;
                ej ej1 = new ej(animatable0, z, mutableFloatState0, mutableState0, mutableState1, null);
                composer1.updateRememberedValue(ej1);
                ej0 = ej1;
            }
            else {
                boolean1 = boolean0;
            }
            int v4 = v3 >> 3 & 14;
            EffectsKt.LaunchedEffect(boolean1, ej0, composer1, v4);
            MutatorMutex mutatorMutex0 = composer1.rememberedValue();
            if(mutatorMutex0 == composer$Companion0.getEmpty()) {
                mutatorMutex0 = new MutatorMutex();
                composer1.updateRememberedValue(mutatorMutex0);
            }
            boolean z2 = composer1.changedInstance(animatable0);
            hj hj0 = composer1.rememberedValue();
            if(z2 || (v3 & 0x380) == 0x100 || hj0 == composer$Companion0.getEmpty()) {
                animatable1 = animatable0;
                v5 = v3;
                hj0 = new hj(mutatorMutex0, mutableFloatState0, animatable1, function10, mutableState0, mutableState1, null);
                composer1.updateRememberedValue(hj0);
            }
            else {
                animatable1 = animatable0;
                v5 = v3;
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z, hj0, composer1, v4, 0);
            SearchBar_androidKt.SearchBarImpl-j1jLAyQ(animatable1, mutableFloatState0, mutableState0, mutableState1, modifier3, function20, shape2, searchBarColors2, f5, f4, windowInsets2, function30, composer1, Animatable.$stable | 0xDB0 | 0xE000 & v5 << 3 | v5 << 15 & 0x70000 | 0x380000 & v5 << 6 | 0x1C00000 & v5 << 6 | 0xE000000 & v5 << 6 | v5 << 6 & 0x70000000, v5 >> 24 & 0x7E, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            shape1 = shape2;
            searchBarColors1 = searchBarColors2;
            f2 = f5;
            windowInsets1 = windowInsets2;
        }
        else {
            composer1.skipToGroupEnd();
            windowInsets1 = windowInsets0;
            f4 = f3;
            modifier2 = modifier1;
            shape1 = shape0;
            searchBarColors1 = searchBarColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new ij(function20, z, function10, modifier2, shape1, searchBarColors1, f2, f4, windowInsets1, function30, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SearchBarImpl-j1jLAyQ(@NotNull Animatable animatable0, @NotNull MutableFloatState mutableFloatState0, @NotNull MutableState mutableState0, @NotNull MutableState mutableState1, @Nullable Modifier modifier0, @NotNull Function2 function20, @Nullable Shape shape0, @Nullable SearchBarColors searchBarColors0, float f, float f1, @Nullable WindowInsets windowInsets0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1, int v2) {
        SearchBarColors searchBarColors1;
        Shape shape2;
        float f3;
        Modifier modifier1;
        WindowInsets windowInsets1;
        float f2;
        Shape shape7;
        SearchBarColors searchBarColors2;
        Modifier modifier2;
        int v7;
        Shape shape3;
        float f5;
        float f4;
        int v10;
        SearchBarColors searchBarColors3;
        int v9;
        int v8;
        Modifier modifier4;
        int v5;
        int v4;
        Shape shape1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-440333505);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(animatable0) : composer1.changedInstance(animatable0)) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(mutableFloatState0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changed(mutableState0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(mutableState1) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            shape1 = shape0;
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(shape1) ? 0x80000 : 0x100000);
        }
        else {
            shape1 = shape0;
        }
        if((v & 0xC00000) == 0) {
            v3 |= ((v2 & 0x80) != 0 || !composer1.changed(searchBarColors0) ? 0x400000 : 0x800000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
            v4 = v2 & 0x100;
        }
        else if((v & 0x6000000) == 0) {
            v4 = v2 & 0x100;
            v3 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        else {
            v4 = v2 & 0x100;
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
            v5 = v2 & 0x200;
        }
        else if((v & 0x30000000) == 0) {
            v5 = v2 & 0x200;
            v3 |= (composer1.changed(f1) ? 0x20000000 : 0x10000000);
        }
        else {
            v5 = v2 & 0x200;
        }
        int v6 = (v1 & 6) == 0 ? v1 | ((v2 & 0x400) != 0 || !composer1.changed(windowInsets0) ? 2 : 4) : v1;
        if((v2 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v6 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((306783379 & v3) != 306783378 || (v6 & 19) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 16) == 0 ? modifier0 : Modifier.Companion;
                if((v2 & 0x40) != 0) {
                    shape1 = SearchBarDefaults.INSTANCE.getInputFieldShape(composer1, 6);
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x80) == 0) {
                    modifier4 = modifier3;
                    v8 = v4;
                    v9 = v5;
                    searchBarColors3 = searchBarColors0;
                    v10 = v3;
                }
                else {
                    modifier4 = modifier3;
                    v8 = v4;
                    v9 = v5;
                    searchBarColors3 = SearchBarDefaults.INSTANCE.colors-dgg9oW8(0L, 0L, composer1, 0x180, 3);
                    v10 = v3 & 0xFE3FFFFF;
                }
                float f6 = v8 == 0 ? f : 0.0f;
                float f7 = v9 == 0 ? f1 : 0.0f;
                if((v2 & 0x400) == 0) {
                    windowInsets1 = windowInsets0;
                    searchBarColors2 = searchBarColors3;
                    v3 = v10;
                    f4 = f6;
                    f5 = f7;
                    v7 = v6;
                    shape3 = shape1;
                    modifier2 = modifier4;
                }
                else {
                    searchBarColors2 = searchBarColors3;
                    v3 = v10;
                    f4 = f6;
                    windowInsets1 = SearchBarDefaults.INSTANCE.getWindowInsets(composer1, 6);
                    v7 = v6 & -15;
                    shape3 = shape1;
                    modifier2 = modifier4;
                    f5 = f7;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                if((v2 & 0x80) != 0) {
                    v3 &= 0xFE3FFFFF;
                }
                if((v2 & 0x400) != 0) {
                    v6 &= -15;
                }
                f4 = f;
                windowInsets1 = windowInsets0;
                f5 = f1;
                shape3 = shape1;
                v7 = v6;
                modifier2 = modifier0;
                searchBarColors2 = searchBarColors0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-440333505, v3, v7, "androidx.compose.material3.SearchBarImpl (SearchBar.android.kt:867)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            Shape shape4 = SearchBarDefaults.INSTANCE.getInputFieldShape(composer1, 6);
            Shape shape5 = SearchBarDefaults.INSTANCE.getFullScreenShape(composer1, 6);
            State state0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(state0 == composer$Companion0.getEmpty()) {
                state0 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new nj(animatable0, 1));
                composer1.updateRememberedValue(state0);
            }
            boolean z = composer1.changed(((Boolean)state0.getValue()).booleanValue());
            boolean z1 = (v3 & 0x380000 ^ 0x180000) > 0x100000 && composer1.changed(shape3) || (v3 & 0x180000) == 0x100000;
            Shape shape6 = composer1.rememberedValue();
            if(z || z1 || shape6 == composer$Companion0.getEmpty()) {
                if(Intrinsics.areEqual(shape3, shape4)) {
                    shape7 = new GenericShape(new mj(density0, animatable0));
                }
                else {
                    shape7 = ((Boolean)state0.getValue()).booleanValue() ? shape5 : shape3;
                }
                composer1.updateRememberedValue(shape7);
                shape6 = shape7;
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new oj(shape6, searchBarColors2, f4, f5), composer1, 54);
            State state1 = composer1.rememberedValue();
            if(state1 == composer$Companion0.getEmpty()) {
                state1 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new nj(animatable0, 0));
                composer1.updateRememberedValue(state1);
            }
            composer1.startReplaceGroup(-1567201454);
            ComposableLambda composableLambda1 = ((Boolean)state1.getValue()).booleanValue() ? ComposableLambdaKt.rememberComposableLambda(0x8CFEAEC, true, new pj(animatable0, searchBarColors2, function30), composer1, 54) : null;
            composer1.endReplaceGroup();
            SearchBar_androidKt.a(animatable0, mutableFloatState0, mutableState0, mutableState1, modifier2, windowInsets1, function20, composableLambda0, composableLambda1, composer1, Animatable.$stable | 0xC00000 | v3 & 14 | v3 & 0x70 | v3 & 0x380 | v3 & 0x1C00 | 0xE000 & v3 | v7 << 15 & 0x70000 | v3 << 3 & 0x380000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f5;
            f2 = f4;
            searchBarColors1 = searchBarColors2;
            modifier1 = modifier2;
            shape2 = shape3;
        }
        else {
            composer1.skipToGroupEnd();
            f2 = f;
            windowInsets1 = windowInsets0;
            modifier1 = modifier0;
            f3 = f1;
            shape2 = shape1;
            searchBarColors1 = searchBarColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new lj(animatable0, mutableFloatState0, mutableState0, mutableState1, modifier1, function20, shape2, searchBarColors1, f2, f3, windowInsets1, function30, v, v1, v2));
        }
    }

    public static final void a(Animatable animatable0, MutableFloatState mutableFloatState0, MutableState mutableState0, MutableState mutableState1, Modifier modifier0, WindowInsets windowInsets0, Function2 function20, Function2 function21, Function2 function22, Composer composer0, int v) {
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x42C90FC);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? composer1.changed(animatable0) : composer1.changedInstance(animatable0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(mutableFloatState0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changed(mutableState0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (composer1.changed(mutableState1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (composer1.changed(windowInsets0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v1) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x42C90FC, v1, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            MutableWindowInsets mutableWindowInsets0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableWindowInsets0 == composer$Companion0.getEmpty()) {
                mutableWindowInsets0 = new MutableWindowInsets(null, 1, null);
                composer1.updateRememberedValue(mutableWindowInsets0);
            }
            Modifier modifier1 = ZIndexModifierKt.zIndex(modifier0, 1.0f);
            ji ji0 = composer1.rememberedValue();
            if((v1 & 0x70000) == 0x20000 || ji0 == composer$Companion0.getEmpty()) {
                ji0 = new ji(mutableWindowInsets0, windowInsets0, 1);
                composer1.updateRememberedValue(ji0);
            }
            Modifier modifier2 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier1, ji0), windowInsets0);
            int v2 = (v1 & 14) == 4 || (v1 & 8) != 0 && composer1.changedInstance(animatable0) ? 1 : 0;
            rj rj0 = composer1.rememberedValue();
            if((v2 | ((v1 & 0x1C00) == 0x800 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 0x380) == 0x100 ? 1 : 0)) != 0 || rj0 == composer$Companion0.getEmpty()) {
                v3 = v1;
                rj rj1 = new rj(animatable0, mutableWindowInsets0, mutableState1, mutableFloatState0, mutableState0);
                composer1.updateRememberedValue(rj1);
                rj0 = rj1;
            }
            else {
                v3 = v1;
            }
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer1, rj0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function23);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier4 = LayoutIdKt.layoutId(modifier$Companion0, "Surface");
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), true);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            Function2 function24 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function24);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function21.invoke(composer1, ((int)(v3 >> 21 & 14)));
            composer1.endNode();
            Modifier modifier6 = LayoutIdKt.layoutId(modifier$Companion0, "InputField");
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), true);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
            Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function25);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v3 >> 18 & 14)));
            composer1.endNode();
            composer1.startReplaceGroup(0xBE01B49F);
            if(function22 != null) {
                Modifier modifier8 = LayoutIdKt.layoutId(modifier$Companion0, "Content");
                MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), true);
                int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier9 = ComposedModifierKt.materializeModifier(composer1, modifier8);
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
                Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                    a.t(v7, composer1, v7, function26);
                }
                function22.invoke(composer1, r0.a.l(composeUiNode$Companion0, composer1, modifier9, 0));
                composer1.endNode();
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
            scopeUpdateScope0.updateScope(new o6(animatable0, mutableFloatState0, mutableState0, mutableState1, modifier0, windowInsets0, function20, function21, function22, v, 1));
        }
    }

    public static final float access$calculatePredictiveBackMultiplier(BackEventCompat backEventCompat0, float f, float f1) {
        if(backEventCompat0 != null) {
            if(Float.isNaN(f1)) {
                return 1.0f;
            }
            return f1 <= 0.0f ? 0.0f : f / f1;
        }
        return 0.0f;
    }

    public static final int access$calculatePredictiveBackOffsetX-rOvwMX4(long v, int v1, BackEventCompat backEventCompat0, LayoutDirection layoutDirection0, float f, float f1) {
        int v2 = -1;
        if(backEventCompat0 != null && f1 != 0.0f) {
            int v3 = backEventCompat0.getSwipeEdge() == 0 ? 1 : -1;
            if(layoutDirection0 == LayoutDirection.Ltr) {
                v2 = 1;
            }
            return c.roundToInt((1.0f - f) * (((float)Constraints.getMaxWidth-impl(v)) * 0.05f - ((float)v1)) * f1 * ((float)v3) * ((float)v2));
        }
        return 0;
    }

    public static final int access$calculatePredictiveBackOffsetY-dzo92Q0(long v, int v1, BackEventCompat backEventCompat0, BackEventCompat backEventCompat1, int v2, int v3, float f) {
        if(backEventCompat1 != null && backEventCompat0 != null && f != 0.0f) {
            float f1 = backEventCompat0.getTouchY() - backEventCompat1.getTouchY();
            return c.roundToInt(((float)MathHelpersKt.lerp(0, Math.min(Math.max(0, (Constraints.getMaxHeight-impl(v) - v2) / 2 - v1), v3), Math.abs(f1) / ((float)Constraints.getMaxHeight-impl(v)))) * f * Math.signum(f1));
        }
        return 0;
    }

    public static final float access$getSearchBarMaxWidth$p() [...] // 潜在的解密器

    public static final float access$getSearchBarPredictiveBackMaxOffsetY$p() [...] // 潜在的解密器

    public static final float access$getSearchBarPredictiveBackMinMargin$p() [...] // 潜在的解密器

    public static final TextFieldColors access$getUnspecifiedTextFieldColors$p() {
        return SearchBar_androidKt.a;
    }

    public static final float getDockedExpandedTableMinHeight() {
        return SearchBar_androidKt.c;
    }

    public static final float getSearchBarMinWidth() [...] // 潜在的解密器

    public static final float getSearchBarVerticalPadding() [...] // 潜在的解密器
}

