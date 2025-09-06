package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
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
import p0.b6;
import p0.c6;
import p0.f6;
import p0.g6;
import p0.lb;
import p0.mb;
import p0.nb;
import p0.pb;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001A\u0093\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010$\u001A\u0089\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010%\u001A\u0093\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020&2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010\'\u001A\u0089\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020&2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010(\u001A\u009C\u0001\u00100\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0011\u0010)\u001A\r\u0012\u0004\u0012\u00020\u00030\f\u00A2\u0006\u0002\b\r2\u0013\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0019\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\r2\u0013\u0010*\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010+\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0006\u0010\u0019\u001A\u00020\u00072\u0006\u0010-\u001A\u00020,2\u0006\u0010/\u001A\u00020.H\u0001\u00A2\u0006\u0004\b0\u00101\u001A\u001B\u00104\u001A\u00020\u0005*\u00020\u00052\u0006\u00103\u001A\u000202H\u0000\u00A2\u0006\u0004\b4\u00105\"\u001A\u0010;\u001A\u0002068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u001A\u0010>\u001A\u0002068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b<\u00108\u001A\u0004\b=\u0010:\"\u001A\u0010A\u001A\u0002068\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b?\u00108\u001A\u0004\b@\u0010:\u00A8\u0006B"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "TextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "TextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "drawIndicatorLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getFirstBaselineOffset", "()F", "FirstBaselineOffset", "b", "getTextFieldBottomPadding", "TextFieldBottomPadding", "c", "getTextFieldTopPadding", "TextFieldTopPadding", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,940:1\n74#2:941\n74#2:951\n74#2:959\n74#2:969\n74#2:987\n25#3:942\n25#3:952\n25#3:960\n25#3:970\n67#3,3:977\n66#3:980\n456#3,8:999\n464#3,3:1013\n456#3,8:1032\n464#3,3:1046\n467#3,3:1050\n456#3,8:1071\n464#3,3:1085\n467#3,3:1089\n456#3,8:1117\n464#3,3:1131\n467#3,3:1135\n456#3,8:1157\n464#3,3:1171\n467#3,3:1175\n467#3,3:1180\n1116#4,6:943\n1116#4,6:953\n1116#4,6:961\n1116#4,6:971\n1116#4,6:981\n658#5:949\n646#5:950\n658#5:967\n646#5:968\n79#6,11:988\n79#6,11:1021\n92#6:1053\n79#6,11:1060\n92#6:1092\n79#6,11:1106\n92#6:1138\n79#6,11:1146\n92#6:1178\n92#6:1183\n3737#7,6:1007\n3737#7,6:1040\n3737#7,6:1079\n3737#7,6:1125\n3737#7,6:1165\n69#8,5:1016\n74#8:1049\n78#8:1054\n69#8,5:1055\n74#8:1088\n78#8:1093\n68#8,6:1100\n74#8:1134\n78#8:1139\n68#8,6:1140\n74#8:1174\n78#8:1179\n58#9:1094\n58#9:1097\n154#10:1095\n211#10:1096\n154#10:1098\n211#10:1099\n154#10:1184\n154#10:1185\n154#10:1186\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n167#1:941\n244#1:951\n357#1:959\n433#1:969\n491#1:987\n179#1:942\n255#1:952\n369#1:960\n444#1:970\n488#1:977,3\n488#1:980\n492#1:999,8\n492#1:1013,3\n496#1:1032,8\n496#1:1046,3\n496#1:1050,3\n504#1:1071,8\n504#1:1085,3\n504#1:1089,3\n532#1:1117,8\n532#1:1131,3\n532#1:1135,3\n534#1:1157,8\n534#1:1171,3\n534#1:1175,3\n492#1:1180,3\n179#1:943,6\n255#1:953,6\n369#1:961,6\n444#1:971,6\n488#1:981,6\n185#1:949\n185#1:950\n374#1:967\n374#1:968\n492#1:988,11\n496#1:1021,11\n496#1:1053\n504#1:1060,11\n504#1:1092\n532#1:1106,11\n532#1:1138\n534#1:1146,11\n534#1:1178\n492#1:1183\n492#1:1007,6\n496#1:1040,6\n504#1:1079,6\n532#1:1125,6\n534#1:1165,6\n496#1:1016,5\n496#1:1049\n496#1:1054\n504#1:1055,5\n504#1:1088\n504#1:1093\n532#1:1100,6\n532#1:1134\n532#1:1139\n534#1:1140,6\n534#1:1174\n534#1:1179\n516#1:1094\n523#1:1097\n517#1:1095\n516#1:1096\n523#1:1098\n523#1:1099\n932#1:1184\n935#1:1185\n939#1:1186\n*E\n"})
public final class TextFieldKt {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        TextFieldKt.a = 20.0f;
        TextFieldKt.b = 10.0f;
        TextFieldKt.c = 2.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextField(@NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4) {
        TextFieldColors textFieldColors1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        int v11;
        int v10;
        boolean z7;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        VisualTransformation visualTransformation1;
        boolean z6;
        Function2 function27;
        Function2 function26;
        Function2 function25;
        Function2 function24;
        TextStyle textStyle1;
        boolean z5;
        boolean z4;
        Modifier modifier1;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions2;
        int v13;
        TextFieldColors textFieldColors2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        int v12;
        boolean z11;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        boolean z10;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        Function2 function28;
        TextStyle textStyle2;
        boolean z9;
        boolean z8;
        Modifier modifier2;
        int v16;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function213;
        int v15;
        int v14;
        KeyboardActions keyboardActions3;
        int v8;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xEA98457F);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(textFieldValue0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v5 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x70000) == 0) {
            v5 |= ((v4 & 0x20) != 0 || !composer1.changed(textStyle0) ? 0x10000 : 0x20000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v8 = (v3 & 14) == 0 ? v3 | (composer1.changed(z2) ? 4 : 2) : v3;
        }
        else {
            v8 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v8 |= (composer1.changed(visualTransformation0) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v4 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v9 |= (composer1.changed(keyboardOptions0) ? 0x100 : 0x80);
        }
        if((v3 & 0x1C00) == 0) {
            if((v4 & 0x2000) == 0 && composer1.changed(keyboardActions0)) {
                v6 = 0x800;
            }
            v9 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            if(composer1.changed(z3)) {
                v7 = 0x4000;
            }
            v9 |= v7;
        }
        if((v3 & 0x70000) == 0) {
            v9 |= ((v4 & 0x8000) != 0 || !composer1.changed(v) ? 0x10000 : 0x20000);
        }
        if((v4 & 0x10000) != 0) {
            v9 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v9 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x20000) != 0) {
            v9 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v9 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0xE000000) == 0) {
            v9 |= ((v4 & 0x40000) != 0 || !composer1.changed(shape0) ? 0x2000000 : 0x4000000);
        }
        if((v3 & 0x70000000) == 0) {
            v9 |= ((v4 & 0x80000) != 0 || !composer1.changed(textFieldColors0) ? 0x10000000 : 0x20000000);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (0x5B6DB6DB & v9) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                z8 = (v4 & 8) == 0 ? z : true;
                z9 = (v4 & 16) == 0 ? z1 : false;
                if((v4 & 0x20) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v5 &= 0xFFF8FFFF;
                }
                function28 = (v4 & 0x40) == 0 ? function20 : null;
                function29 = (v4 & 0x80) == 0 ? function21 : null;
                Function2 function212 = (v4 & 0x200) == 0 ? function23 : null;
                z10 = (v4 & 0x400) == 0 ? z2 : false;
                visualTransformation2 = (v4 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                keyboardOptions2 = (v4 & 0x1000) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                if((v4 & 0x2000) == 0) {
                    keyboardActions3 = keyboardActions0;
                }
                else {
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 0x3F, null);
                    v9 &= 0xFFFFE3FF;
                }
                z11 = (v4 & 0x4000) == 0 ? z3 : false;
                if((v4 & 0x8000) == 0) {
                    v14 = v9;
                    v15 = v;
                }
                else {
                    v14 = v9 & 0xFFF8FFFF;
                    v15 = z11 ? 1 : 0x7FFFFFFF;
                }
                v12 = (v4 & 0x10000) == 0 ? v1 : 1;
                if((v4 & 0x20000) == 0) {
                    function213 = function212;
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    function213 = function212;
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v4 & 0x40000) == 0) {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape0;
                    v16 = v14;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape(composer1, 6);
                    v16 = v14 & 0xF1FFFFFF;
                }
                if((v4 & 0x80000) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource5;
                    textFieldColors2 = textFieldColors0;
                    shape2 = shape3;
                    v13 = v5;
                    v = v15;
                }
                else {
                    v16 &= 0x8FFFFFFF;
                    mutableInteractionSource2 = mutableInteractionSource5;
                    shape2 = shape3;
                    v13 = v5;
                    v = v15;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.textFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
                }
                keyboardActions2 = keyboardActions3;
                function211 = function213;
                v9 = v16;
                function210 = (v4 & 0x100) == 0 ? function22 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x2000) != 0) {
                    v9 &= 0xFFFFE3FF;
                }
                if((v4 & 0x8000) != 0) {
                    v9 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40000) != 0) {
                    v9 &= 0xF1FFFFFF;
                }
                if((v4 & 0x80000) != 0) {
                    v9 &= 0x8FFFFFFF;
                }
                modifier2 = modifier0;
                z8 = z;
                z9 = z1;
                textStyle2 = textStyle0;
                function28 = function20;
                function29 = function21;
                function210 = function22;
                function211 = function23;
                z10 = z2;
                visualTransformation2 = visualTransformation0;
                keyboardOptions2 = keyboardOptions0;
                z11 = z3;
                v12 = v1;
                mutableInteractionSource2 = mutableInteractionSource0;
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                v13 = v5;
                keyboardActions2 = keyboardActions0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                keyboardOptions3 = keyboardOptions2;
                ComposerKt.traceEventStart(0xEA98457F, v13, v9, "androidx.compose.material.TextField (TextField.kt:371)");
            }
            else {
                keyboardOptions3 = keyboardOptions2;
            }
            composer1.startReplaceableGroup(-833018012);
            long v17 = textStyle2.getColor-0d7_KjU();
            if(v17 == 0L) {
                v17 = ((Color)textFieldColors2.textColor(z8, composer1, v13 >> 9 & 14 | v9 >> 24 & 0x70).getValue()).unbox-impl();
            }
            composer1.endReplaceableGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v17, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            int v18 = v9 >> 24 & 0x70;
            Modifier modifier3 = BackgroundKt.background-bw27NRU(modifier2, ((Color)textFieldColors2.backgroundColor(z8, composer1, v13 >> 9 & 14 | v18).getValue()).unbox-impl(), shape2);
            BasicTextFieldKt.BasicTextField(textFieldValue0, function10, SizeKt.defaultMinSize-VpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.indicatorLine-gv0btCI$default(TextFieldDefaults.INSTANCE, modifier3, z8, z10, mutableInteractionSource2, textFieldColors2, 0.0f, 0.0f, 0x30, null), z10, Strings_androidKt.getString-4foXLRw(3, composer1, 6)), 280.0f, 56.0f), z8, z9, textStyle3, keyboardOptions3, keyboardActions2, z11, v, v12, visualTransformation2, null, mutableInteractionSource2, new SolidColor(((Color)textFieldColors2.cursorColor(z10, composer1, v9 & 14 | v18).getValue()).unbox-impl(), null), ComposableLambdaKt.composableLambda(composer1, -126640971, true, new lb(textFieldValue0, z8, z11, visualTransformation2, mutableInteractionSource2, z10, function28, function29, function210, function211, textFieldColors2, 1)), composer1, 0xFC7E & v13 | v9 << 12 & 0x380000 | v9 << 12 & 0x1C00000 | v9 << 12 & 0xE000000 | v9 << 12 & 0x70000000, v9 >> 18 & 14 | 0x30000 | v9 & 0x70 | v9 >> 12 & 0x1C00, 0x1000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v;
            z7 = z11;
            function26 = function210;
            function25 = function29;
            textStyle1 = textStyle2;
            shape1 = shape2;
            textFieldColors1 = textFieldColors2;
            mutableInteractionSource1 = mutableInteractionSource2;
            z5 = z9;
            function24 = function28;
            v11 = v12;
            keyboardActions1 = keyboardActions2;
            keyboardOptions1 = keyboardOptions3;
            function27 = function211;
            visualTransformation1 = visualTransformation2;
            z4 = z8;
            z6 = z10;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z;
            z5 = z1;
            textStyle1 = textStyle0;
            function24 = function20;
            function25 = function21;
            function26 = function22;
            function27 = function23;
            z6 = z2;
            visualTransformation1 = visualTransformation0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z7 = z3;
            v10 = v;
            v11 = v1;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b6(textFieldValue0, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v10, v11, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final void TextField(TextFieldValue textFieldValue0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z2, VisualTransformation visualTransformation0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, MutableInteractionSource mutableInteractionSource0, Shape shape0, TextFieldColors textFieldColors0, Composer composer0, int v1, int v2, int v3) {
        TextFieldColors textFieldColors1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        int v9;
        boolean z7;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        VisualTransformation visualTransformation1;
        boolean z6;
        Function2 function27;
        Function2 function26;
        Function2 function25;
        Function2 function24;
        TextStyle textStyle1;
        boolean z5;
        boolean z4;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource6;
        MutableInteractionSource mutableInteractionSource2;
        KeyboardActions keyboardActions2;
        int v12;
        int v11;
        TextFieldColors textFieldColors2;
        Shape shape2;
        int v10;
        boolean z11;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        boolean z10;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        Function2 function28;
        TextStyle textStyle2;
        boolean z9;
        boolean z8;
        Modifier modifier2;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function214;
        KeyboardActions keyboardActions3;
        int v7;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xA206A4DC);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changed(textFieldValue0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v6 = 0x4000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x70000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(textStyle0) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0xE000000) == 0) {
            v4 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x70000000) == 0) {
            v4 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 14) == 0 ? v2 | (composer1.changed(z2) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v7 |= (composer1.changed(visualTransformation0) ? 0x20 : 16);
        }
        int v8 = v7;
        if((v3 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v8 |= (composer1.changed(keyboardOptions0) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            if((v3 & 0x2000) == 0 && composer1.changed(keyboardActions0)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            if(!composer1.changed(z3)) {
                v6 = 0x2000;
            }
            v8 |= v6;
        }
        if((v3 & 0x8000) != 0) {
            v8 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v8 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x10000) != 0) {
            v8 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v8 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x1C00000) == 0) {
            v8 |= ((v3 & 0x20000) != 0 || !composer1.changed(shape0) ? 0x400000 : 0x800000);
        }
        if((v2 & 0xE000000) == 0) {
            v8 |= ((v3 & 0x40000) != 0 || !composer1.changed(textFieldColors0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (0xB6DB6DB & v8) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                z8 = (v3 & 8) == 0 ? z : true;
                z9 = (v3 & 16) == 0 ? z1 : false;
                if((v3 & 0x20) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v4 &= 0xFFF8FFFF;
                }
                function28 = (v3 & 0x40) == 0 ? function20 : null;
                function29 = (v3 & 0x80) == 0 ? function21 : null;
                Function2 function212 = (v3 & 0x100) == 0 ? function22 : null;
                Function2 function213 = (v3 & 0x200) == 0 ? function23 : null;
                z10 = (v3 & 0x400) == 0 ? z2 : false;
                visualTransformation2 = (v3 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                keyboardOptions2 = (v3 & 0x1000) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                if((v3 & 0x2000) == 0) {
                    keyboardActions3 = keyboardActions0;
                }
                else {
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 0x3F, null);
                    v8 &= 0xFFFFE3FF;
                }
                z11 = (v3 & 0x4000) == 0 ? z3 : false;
                v10 = (v3 & 0x8000) == 0 ? v : 0x7FFFFFFF;
                if((v3 & 0x10000) == 0) {
                    function214 = function213;
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    function214 = function213;
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v3 & 0x20000) == 0) {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape0;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape(composer1, 6);
                    v8 &= 0xFE3FFFFF;
                }
                if((0x40000 & v3) == 0) {
                    function211 = function214;
                    textFieldColors2 = textFieldColors0;
                    shape2 = shape3;
                    v11 = v4;
                    v12 = v8;
                    function210 = function212;
                    keyboardActions2 = keyboardActions3;
                }
                else {
                    shape2 = shape3;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.textFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
                    v11 = v4;
                    v12 = v8 & 0xF1FFFFFF;
                    function210 = function212;
                    keyboardActions2 = keyboardActions3;
                    function211 = function214;
                }
                mutableInteractionSource2 = mutableInteractionSource5;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x2000) != 0) {
                    v8 &= 0xFFFFE3FF;
                }
                if((v3 & 0x20000) != 0) {
                    v8 &= 0xFE3FFFFF;
                }
                if((0x40000 & v3) != 0) {
                    v8 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                z8 = z;
                z9 = z1;
                textStyle2 = textStyle0;
                function28 = function20;
                function29 = function21;
                function210 = function22;
                function211 = function23;
                z10 = z2;
                visualTransformation2 = visualTransformation0;
                keyboardOptions2 = keyboardOptions0;
                z11 = z3;
                v10 = v;
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                v11 = v4;
                v12 = v8;
                keyboardActions2 = keyboardActions0;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                mutableInteractionSource6 = mutableInteractionSource2;
                ComposerKt.traceEventStart(0xA206A4DC, v11, v12, "androidx.compose.material.TextField (TextField.kt:446)");
            }
            else {
                mutableInteractionSource6 = mutableInteractionSource2;
            }
            TextFieldKt.TextField(textFieldValue0, function10, modifier2, z8, z9, textStyle2, function28, function29, function210, function211, z10, visualTransformation2, keyboardOptions2, keyboardActions2, z11, v10, 1, mutableInteractionSource6, shape2, textFieldColors2, composer1, v11 & 0x7FFFFFFE, v12 & 14 | 0x180000 | v12 & 0x70 | v12 & 0x380 | v12 & 0x1C00 | v12 & 0xE000 | v12 & 0x70000 | 0x1C00000 & v12 << 3 | 0xE000000 & v12 << 3 | v12 << 3 & 0x70000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource6;
            keyboardOptions1 = keyboardOptions2;
            z7 = z11;
            textStyle1 = textStyle2;
            shape1 = shape2;
            textFieldColors1 = textFieldColors2;
            function24 = function28;
            v9 = v10;
            function27 = function211;
            keyboardActions1 = keyboardActions2;
            z4 = z8;
            z6 = z10;
            modifier1 = modifier2;
            function25 = function29;
            function26 = function210;
            visualTransformation1 = visualTransformation2;
            z5 = z9;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z;
            z5 = z1;
            textStyle1 = textStyle0;
            function24 = function20;
            function25 = function21;
            function26 = function22;
            function27 = function23;
            z6 = z2;
            visualTransformation1 = visualTransformation0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z7 = z3;
            v9 = v;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c6(textFieldValue0, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v9, mutableInteractionSource1, shape1, textFieldColors1, v1, v2, v3, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextField(@NotNull String s, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4) {
        TextFieldColors textFieldColors1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        int v11;
        int v10;
        boolean z7;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        VisualTransformation visualTransformation1;
        boolean z6;
        Function2 function27;
        Function2 function26;
        Function2 function25;
        Function2 function24;
        TextStyle textStyle1;
        boolean z5;
        boolean z4;
        Modifier modifier1;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions2;
        int v13;
        TextFieldColors textFieldColors2;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        int v12;
        boolean z11;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        boolean z10;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        Function2 function28;
        TextStyle textStyle2;
        boolean z9;
        boolean z8;
        Modifier modifier2;
        int v16;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function213;
        int v15;
        int v14;
        KeyboardActions keyboardActions3;
        int v8;
        int v5;
        Composer composer1 = composer0.startRestartGroup(-1504264404);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v5 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x70000) == 0) {
            v5 |= ((v4 & 0x20) != 0 || !composer1.changed(textStyle0) ? 0x10000 : 0x20000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v8 = (v3 & 14) == 0 ? v3 | (composer1.changed(z2) ? 4 : 2) : v3;
        }
        else {
            v8 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v8 |= (composer1.changed(visualTransformation0) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v4 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v9 |= (composer1.changed(keyboardOptions0) ? 0x100 : 0x80);
        }
        if((v3 & 0x1C00) == 0) {
            if((v4 & 0x2000) == 0 && composer1.changed(keyboardActions0)) {
                v6 = 0x800;
            }
            v9 |= v6;
        }
        if((v4 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            if(composer1.changed(z3)) {
                v7 = 0x4000;
            }
            v9 |= v7;
        }
        if((v3 & 0x70000) == 0) {
            v9 |= ((v4 & 0x8000) != 0 || !composer1.changed(v) ? 0x10000 : 0x20000);
        }
        if((v4 & 0x10000) != 0) {
            v9 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v9 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x20000) != 0) {
            v9 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v9 |= (composer1.changed(mutableInteractionSource0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0xE000000) == 0) {
            v9 |= ((v4 & 0x40000) != 0 || !composer1.changed(shape0) ? 0x2000000 : 0x4000000);
        }
        if((v3 & 0x70000000) == 0) {
            v9 |= ((v4 & 0x80000) != 0 || !composer1.changed(textFieldColors0) ? 0x10000000 : 0x20000000);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (0x5B6DB6DB & v9) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v4 & 4) == 0 ? modifier0 : Modifier.Companion;
                z8 = (v4 & 8) == 0 ? z : true;
                z9 = (v4 & 16) == 0 ? z1 : false;
                if((v4 & 0x20) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v5 &= 0xFFF8FFFF;
                }
                function28 = (v4 & 0x40) == 0 ? function20 : null;
                function29 = (v4 & 0x80) == 0 ? function21 : null;
                Function2 function212 = (v4 & 0x200) == 0 ? function23 : null;
                z10 = (v4 & 0x400) == 0 ? z2 : false;
                visualTransformation2 = (v4 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                keyboardOptions2 = (v4 & 0x1000) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                if((v4 & 0x2000) == 0) {
                    keyboardActions3 = keyboardActions0;
                }
                else {
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 0x3F, null);
                    v9 &= 0xFFFFE3FF;
                }
                z11 = (v4 & 0x4000) == 0 ? z3 : false;
                if((v4 & 0x8000) == 0) {
                    v14 = v9;
                    v15 = v;
                }
                else {
                    v14 = v9 & 0xFFF8FFFF;
                    v15 = z11 ? 1 : 0x7FFFFFFF;
                }
                v12 = (v4 & 0x10000) == 0 ? v1 : 1;
                if((v4 & 0x20000) == 0) {
                    function213 = function212;
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    function213 = function212;
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v4 & 0x40000) == 0) {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape0;
                    v16 = v14;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                    v16 = v14 & 0xF1FFFFFF;
                }
                if((v4 & 0x80000) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource5;
                    textFieldColors2 = textFieldColors0;
                    shape2 = shape3;
                    v13 = v5;
                    v = v15;
                }
                else {
                    v16 &= 0x8FFFFFFF;
                    mutableInteractionSource2 = mutableInteractionSource5;
                    shape2 = shape3;
                    v13 = v5;
                    v = v15;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.textFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
                }
                function210 = (v4 & 0x100) == 0 ? function22 : null;
                keyboardActions2 = keyboardActions3;
                v9 = v16;
                function211 = function213;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x2000) != 0) {
                    v9 &= 0xFFFFE3FF;
                }
                if((v4 & 0x8000) != 0) {
                    v9 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40000) != 0) {
                    v9 &= 0xF1FFFFFF;
                }
                if((v4 & 0x80000) != 0) {
                    v9 &= 0x8FFFFFFF;
                }
                modifier2 = modifier0;
                z8 = z;
                z9 = z1;
                textStyle2 = textStyle0;
                function28 = function20;
                function29 = function21;
                function210 = function22;
                function211 = function23;
                z10 = z2;
                visualTransformation2 = visualTransformation0;
                keyboardOptions2 = keyboardOptions0;
                z11 = z3;
                v12 = v1;
                mutableInteractionSource2 = mutableInteractionSource0;
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                v13 = v5;
                keyboardActions2 = keyboardActions0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                keyboardOptions3 = keyboardOptions2;
                ComposerKt.traceEventStart(-1504264404, v13, v9, "androidx.compose.material.TextField (TextField.kt:182)");
            }
            else {
                keyboardOptions3 = keyboardOptions2;
            }
            composer1.startReplaceableGroup(0xCE5903A5);
            long v17 = textStyle2.getColor-0d7_KjU();
            if(v17 == 0L) {
                v17 = ((Color)textFieldColors2.textColor(z8, composer1, v13 >> 9 & 14 | v9 >> 24 & 0x70).getValue()).unbox-impl();
            }
            composer1.endReplaceableGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v17, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            int v18 = v9 >> 24 & 0x70;
            Modifier modifier3 = BackgroundKt.background-bw27NRU(modifier2, ((Color)textFieldColors2.backgroundColor(z8, composer1, v13 >> 9 & 14 | v18).getValue()).unbox-impl(), shape2);
            BasicTextFieldKt.BasicTextField(s, function10, SizeKt.defaultMinSize-VpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.indicatorLine-gv0btCI$default(TextFieldDefaults.INSTANCE, modifier3, z8, z10, mutableInteractionSource2, textFieldColors2, 0.0f, 0.0f, 0x30, null), z10, Strings_androidKt.getString-4foXLRw(3, composer1, 6)), 280.0f, 56.0f), z8, z9, textStyle3, keyboardOptions3, keyboardActions2, z11, v, v12, visualTransformation2, null, mutableInteractionSource2, new SolidColor(((Color)textFieldColors2.cursorColor(z10, composer1, v9 & 14 | v18).getValue()).unbox-impl(), null), ComposableLambdaKt.composableLambda(composer1, 0x3AFFAC62, true, new lb(s, z8, z11, visualTransformation2, mutableInteractionSource2, z10, function28, function29, function210, function211, textFieldColors2, 0)), composer1, 0xFC7E & v13 | v9 << 12 & 0x380000 | v9 << 12 & 0x1C00000 | v9 << 12 & 0xE000000 | v9 << 12 & 0x70000000, v9 >> 18 & 14 | 0x30000 | v9 & 0x70 | v9 >> 12 & 0x1C00, 0x1000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v;
            z7 = z11;
            function26 = function210;
            function25 = function29;
            textStyle1 = textStyle2;
            shape1 = shape2;
            textFieldColors1 = textFieldColors2;
            mutableInteractionSource1 = mutableInteractionSource2;
            z5 = z9;
            function24 = function28;
            v11 = v12;
            keyboardActions1 = keyboardActions2;
            keyboardOptions1 = keyboardOptions3;
            function27 = function211;
            visualTransformation1 = visualTransformation2;
            z4 = z8;
            z6 = z10;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z;
            z5 = z1;
            textStyle1 = textStyle0;
            function24 = function20;
            function25 = function21;
            function26 = function22;
            function27 = function23;
            z6 = z2;
            visualTransformation1 = visualTransformation0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z7 = z3;
            v10 = v;
            v11 = v1;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f6(s, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v10, v11, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final void TextField(String s, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z2, VisualTransformation visualTransformation0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, MutableInteractionSource mutableInteractionSource0, Shape shape0, TextFieldColors textFieldColors0, Composer composer0, int v1, int v2, int v3) {
        TextFieldColors textFieldColors1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
        int v9;
        boolean z7;
        KeyboardActions keyboardActions1;
        KeyboardOptions keyboardOptions1;
        VisualTransformation visualTransformation1;
        boolean z6;
        Function2 function27;
        Function2 function26;
        Function2 function25;
        Function2 function24;
        TextStyle textStyle1;
        boolean z5;
        boolean z4;
        Modifier modifier1;
        MutableInteractionSource mutableInteractionSource6;
        MutableInteractionSource mutableInteractionSource2;
        KeyboardActions keyboardActions2;
        int v12;
        int v11;
        TextFieldColors textFieldColors2;
        Shape shape2;
        int v10;
        boolean z11;
        KeyboardOptions keyboardOptions2;
        VisualTransformation visualTransformation2;
        boolean z10;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        Function2 function28;
        TextStyle textStyle2;
        boolean z9;
        boolean z8;
        Modifier modifier2;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function214;
        KeyboardActions keyboardActions3;
        int v7;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x9B36FD09);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v6 = 0x4000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x70000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(textStyle0) ? 0x10000 : 0x20000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v4 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0xE000000) == 0) {
            v4 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x70000000) == 0) {
            v4 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 14) == 0 ? v2 | (composer1.changed(z2) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v7 |= (composer1.changed(visualTransformation0) ? 0x20 : 16);
        }
        int v8 = v7;
        if((v3 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v8 |= (composer1.changed(keyboardOptions0) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            if((v3 & 0x2000) == 0 && composer1.changed(keyboardActions0)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            if(!composer1.changed(z3)) {
                v6 = 0x2000;
            }
            v8 |= v6;
        }
        if((v3 & 0x8000) != 0) {
            v8 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v8 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x10000) != 0) {
            v8 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v8 |= (composer1.changed(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x1C00000) == 0) {
            v8 |= ((v3 & 0x20000) != 0 || !composer1.changed(shape0) ? 0x400000 : 0x800000);
        }
        if((v2 & 0xE000000) == 0) {
            v8 |= ((v3 & 0x40000) != 0 || !composer1.changed(textFieldColors0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (0xB6DB6DB & v8) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                z8 = (v3 & 8) == 0 ? z : true;
                z9 = (v3 & 16) == 0 ? z1 : false;
                if((v3 & 0x20) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v4 &= 0xFFF8FFFF;
                }
                function28 = (v3 & 0x40) == 0 ? function20 : null;
                function29 = (v3 & 0x80) == 0 ? function21 : null;
                Function2 function212 = (v3 & 0x100) == 0 ? function22 : null;
                Function2 function213 = (v3 & 0x200) == 0 ? function23 : null;
                z10 = (v3 & 0x400) == 0 ? z2 : false;
                visualTransformation2 = (v3 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                keyboardOptions2 = (v3 & 0x1000) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                if((v3 & 0x2000) == 0) {
                    keyboardActions3 = keyboardActions0;
                }
                else {
                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 0x3F, null);
                    v8 &= 0xFFFFE3FF;
                }
                z11 = (v3 & 0x4000) == 0 ? z3 : false;
                v10 = (v3 & 0x8000) == 0 ? v : 0x7FFFFFFF;
                if((v3 & 0x10000) == 0) {
                    function214 = function213;
                    mutableInteractionSource4 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceableGroup(0xE2A708A4);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    function214 = function213;
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    composer1.endReplaceableGroup();
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                if((v3 & 0x20000) == 0) {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape0;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                    v8 &= 0xFE3FFFFF;
                }
                if((0x40000 & v3) == 0) {
                    function211 = function214;
                    textFieldColors2 = textFieldColors0;
                    shape2 = shape3;
                    v11 = v4;
                    v12 = v8;
                    function210 = function212;
                    keyboardActions2 = keyboardActions3;
                }
                else {
                    shape2 = shape3;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.textFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
                    v11 = v4;
                    v12 = v8 & 0xF1FFFFFF;
                    function210 = function212;
                    keyboardActions2 = keyboardActions3;
                    function211 = function214;
                }
                mutableInteractionSource2 = mutableInteractionSource5;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x2000) != 0) {
                    v8 &= 0xFFFFE3FF;
                }
                if((v3 & 0x20000) != 0) {
                    v8 &= 0xFE3FFFFF;
                }
                if((0x40000 & v3) != 0) {
                    v8 &= 0xF1FFFFFF;
                }
                modifier2 = modifier0;
                z8 = z;
                z9 = z1;
                textStyle2 = textStyle0;
                function28 = function20;
                function29 = function21;
                function210 = function22;
                function211 = function23;
                z10 = z2;
                visualTransformation2 = visualTransformation0;
                keyboardOptions2 = keyboardOptions0;
                z11 = z3;
                v10 = v;
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                v11 = v4;
                v12 = v8;
                keyboardActions2 = keyboardActions0;
                mutableInteractionSource2 = mutableInteractionSource0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                mutableInteractionSource6 = mutableInteractionSource2;
                ComposerKt.traceEventStart(0x9B36FD09, v11, v12, "androidx.compose.material.TextField (TextField.kt:258)");
            }
            else {
                mutableInteractionSource6 = mutableInteractionSource2;
            }
            TextFieldKt.TextField(s, function10, modifier2, z8, z9, textStyle2, function28, function29, function210, function211, z10, visualTransformation2, keyboardOptions2, keyboardActions2, z11, v10, 1, mutableInteractionSource6, shape2, textFieldColors2, composer1, v11 & 0x7FFFFFFE, v12 & 14 | 0x180000 | v12 & 0x70 | v12 & 0x380 | v12 & 0x1C00 | v12 & 0xE000 | v12 & 0x70000 | 0x1C00000 & v12 << 3 | 0xE000000 & v12 << 3 | v12 << 3 & 0x70000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource6;
            keyboardOptions1 = keyboardOptions2;
            z7 = z11;
            textStyle1 = textStyle2;
            shape1 = shape2;
            textFieldColors1 = textFieldColors2;
            function24 = function28;
            v9 = v10;
            function27 = function211;
            keyboardActions1 = keyboardActions2;
            z4 = z8;
            z6 = z10;
            modifier1 = modifier2;
            function25 = function29;
            function26 = function210;
            visualTransformation1 = visualTransformation2;
            z5 = z9;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z4 = z;
            z5 = z1;
            textStyle1 = textStyle0;
            function24 = function20;
            function25 = function21;
            function26 = function22;
            function27 = function23;
            z6 = z2;
            visualTransformation1 = visualTransformation0;
            keyboardOptions1 = keyboardOptions0;
            keyboardActions1 = keyboardActions0;
            z7 = z3;
            v9 = v;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g6(s, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v9, mutableInteractionSource1, shape1, textFieldColors1, v1, v2, v3, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@NotNull Modifier modifier0, @NotNull Function2 function20, @Nullable Function2 function21, @Nullable Function3 function30, @Nullable Function2 function22, @Nullable Function2 function23, boolean z, float f, @NotNull PaddingValues paddingValues0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2112507061);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function21) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v1 |= (composer1.changed(z) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v) == 0) {
            v1 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v) == 0) {
            v1 |= (composer1.changed(paddingValues0) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v1) != 0x2492492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, v1, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:486)");
            }
            composer1.startReplaceableGroup(0x607FB4C4);
            boolean z1 = composer1.changed(Boolean.valueOf(z));
            boolean z2 = composer1.changed(f);
            boolean z3 = composer1.changed(paddingValues0);
            pb pb0 = composer1.rememberedValue();
            if((z1 | z2 | z3) != 0 || pb0 == Composer.Companion.getEmpty()) {
                pb0 = new pb(z, f, paddingValues0);
                composer1.updateRememberedValue(pb0);
            }
            composer1.endReplaceableGroup();
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composer1.startReplaceableGroup(-1323940314);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier0);
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
            Updater.set-impl(composer1, pb0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function24 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function24);
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            composer1.startReplaceableGroup(0xF303E63);
            if(function22 != null) {
                Modifier modifier1 = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
                composer1.startReplaceableGroup(-1323940314);
                int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Function0 function01 = composeUiNode$Companion0.getConstructor();
                Function3 function32 = LayoutKt.modifierMaterializerOf(modifier1);
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
                Function2 function25 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                    a.t(v3, composer1, v3, function25);
                }
                r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function22.invoke(composer1, ((int)(v1 >> 12 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xF303F80);
            if(function23 != null) {
                Modifier modifier2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy1 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
                composer1.startReplaceableGroup(-1323940314);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Function0 function02 = composeUiNode$Companion0.getConstructor();
                Function3 function33 = LayoutKt.modifierMaterializerOf(modifier2);
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
                Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function26);
                }
                r0.a.w(0, function33, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function23.invoke(composer1, ((int)(v1 >> 15 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            float f1 = PaddingKt.calculateStartPadding(paddingValues0, layoutDirection0);
            float f2 = PaddingKt.calculateEndPadding(paddingValues0, layoutDirection0);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            if(function22 != null) {
                f1 = c.coerceAtLeast(f1 - 12.0f, 0.0f);
            }
            if(function23 != null) {
                f2 = c.coerceAtLeast(f2 - 12.0f, 0.0f);
            }
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, f1, 0.0f, f2, 0.0f, 10, null);
            composer1.startReplaceableGroup(0xF304373);
            if(function30 != null) {
                function30.invoke(LayoutIdKt.layoutId(modifier$Companion0, "Hint").then(modifier3), composer1, ((int)(v1 >> 6 & 0x70)));
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xF3043F4);
            if(function21 != null) {
                Modifier modifier4 = LayoutIdKt.layoutId(modifier$Companion0, "Label").then(modifier3);
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy2 = r0.a.i(Alignment.Companion, false, composer1, 0, -1323940314);
                int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
                Function0 function03 = composeUiNode$Companion0.getConstructor();
                Function3 function34 = LayoutKt.modifierMaterializerOf(modifier4);
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
                Function2 function27 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    a.t(v5, composer1, v5, function27);
                }
                r0.a.w(0, function34, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function21.invoke(composer1, ((int)(v1 >> 6 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            Modifier modifier5 = LayoutIdKt.layoutId(modifier$Companion0, "TextField").then(modifier3);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy3 = r0.a.i(Alignment.Companion, true, composer1, 0x30, -1323940314);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap4 = composer1.getCurrentCompositionLocalMap();
            Function0 function04 = composeUiNode$Companion0.getConstructor();
            Function3 function35 = LayoutKt.modifierMaterializerOf(modifier5);
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
            Function2 function28 = a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap4);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                a.t(v6, composer1, v6, function28);
            }
            r0.a.w(0, function35, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(v1 >> 3 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new mb(modifier0, function20, function21, function30, function22, function23, z, f, paddingValues0, v));
        }
    }

    public static final int access$calculateHeight-O3s9Psw(int v, boolean z, int v1, int v2, int v3, int v4, long v5, float f, PaddingValues paddingValues0) {
        float f1 = paddingValues0.calculateTopPadding-D9Ej5fM();
        float f2 = paddingValues0.calculateBottomPadding-D9Ej5fM() * f;
        int v6 = Math.max(v, v4);
        return z ? Math.max(zd.c.roundToInt(((float)v1) + TextFieldKt.c * f + ((float)v6) + f2), Math.max(Math.max(v2, v3), Constraints.getMinHeight-impl(v5))) : Math.max(zd.c.roundToInt(f1 * f + ((float)v6) + f2), Math.max(Math.max(v2, v3), Constraints.getMinHeight-impl(v5)));
    }

    public static final int access$calculateWidth-VsPV1Ek(int v, int v1, int v2, int v3, int v4, long v5) {
        return Math.max(Math.max(v2, Math.max(v3, v4)) + v + v1, Constraints.getMinWidth-impl(v5));
    }

    public static final void access$placeWithLabel(PlacementScope placeable$PlacementScope0, int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, int v2, int v3, float f, float f1) {
        if(placeable3 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), v1), 0.0f, 4, null);
        }
        if(placeable4 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable4, v - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), v1), 0.0f, 4, null);
        }
        if(placeable1 != null) {
            int v4 = z ? Alignment.Companion.getCenterVertically().align(placeable1.getHeight(), v1) : zd.c.roundToInt(16.0f * f1);
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, TextFieldImplKt.widthOrZero(placeable3), v4 - zd.c.roundToInt(((float)(v4 - v2)) * f), 0.0f, 4, null);
        }
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, TextFieldImplKt.widthOrZero(placeable3), v3, 0.0f, 4, null);
        if(placeable2 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable2, TextFieldImplKt.widthOrZero(placeable3), v3, 0.0f, 4, null);
        }
    }

    public static final void access$placeWithoutLabel(PlacementScope placeable$PlacementScope0, int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, boolean z, float f, PaddingValues paddingValues0) {
        int v2 = zd.c.roundToInt(paddingValues0.calculateTopPadding-D9Ej5fM() * f);
        if(placeable2 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable2, 0, Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), v1), 0.0f, 4, null);
        }
        if(placeable3 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable3, v - placeable3.getWidth(), Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), v1), 0.0f, 4, null);
        }
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, TextFieldImplKt.widthOrZero(placeable2), (z ? Alignment.Companion.getCenterVertically().align(placeable0.getHeight(), v1) : v2), 0.0f, 4, null);
        if(placeable1 != null) {
            if(z) {
                v2 = Alignment.Companion.getCenterVertically().align(placeable1.getHeight(), v1);
            }
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, TextFieldImplKt.widthOrZero(placeable2), v2, 0.0f, 4, null);
        }
    }

    @NotNull
    public static final Modifier drawIndicatorLine(@NotNull Modifier modifier0, @NotNull BorderStroke borderStroke0) {
        return DrawModifierKt.drawWithContent(modifier0, new nb(borderStroke0.getWidth-D9Ej5fM(), borderStroke0));
    }

    public static final float getFirstBaselineOffset() [...] // 潜在的解密器

    public static final float getTextFieldBottomPadding() [...] // 潜在的解密器

    public static final float getTextFieldTopPadding() [...] // 潜在的解密器
}

