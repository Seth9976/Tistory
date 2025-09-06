package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
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
import p0.e6;
import p0.f6;
import p0.g6;
import p0.h6;
import p0.i6;
import p0.k6;
import p0.r;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001A\u0093\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010$\u001A\u0089\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010%\u001A\u0093\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020&2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010\'\u001A\u0089\u0002\u0010#\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020&2\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0018\u001A\u00020\u00172\b\b\u0002\u0010\u0019\u001A\u00020\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\u001D2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\b#\u0010(\u001A\u00C3\u0001\u00103\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0011\u0010)\u001A\r\u0012\u0004\u0012\u00020\u00030\f\u00A2\u0006\u0002\b\r2\u0019\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00A2\u0006\u0002\b\r2\u0013\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010*\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0013\u0010+\u001A\u000F\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u00A2\u0006\u0002\b\r2\u0006\u0010\u0019\u001A\u00020\u00072\u0006\u0010-\u001A\u00020,2\u0012\u0010/\u001A\u000E\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00100\u001A\r\u0012\u0004\u0012\u00020\u00030\f\u00A2\u0006\u0002\b\r2\u0006\u00102\u001A\u000201H\u0001\u00A2\u0006\u0004\b3\u00104\u001A&\u00108\u001A\u00020\u0005*\u00020\u00052\u0006\u00105\u001A\u00020.2\u0006\u00102\u001A\u000201H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b6\u00107\"\u001A\u0010>\u001A\u0002098\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0014\u0010?\u001A\u00020\u00008\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006A"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "border", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "outlineCutout", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextFieldTopPadding", "BorderId", "Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,984:1\n74#2:985\n74#2:995\n74#2:1003\n74#2:1013\n74#2:1030\n25#3:986\n25#3:996\n25#3:1004\n25#3:1014\n83#3,3:1021\n456#3,8:1042\n464#3,3:1056\n456#3,8:1075\n464#3,3:1089\n467#3,3:1093\n456#3,8:1114\n464#3,3:1128\n467#3,3:1132\n456#3,8:1160\n464#3,3:1174\n467#3,3:1178\n456#3,8:1200\n464#3,3:1214\n467#3,3:1218\n467#3,3:1223\n1116#4,6:987\n1116#4,6:997\n1116#4,6:1005\n1116#4,6:1015\n1116#4,6:1024\n658#5:993\n646#5:994\n658#5:1011\n646#5:1012\n79#6,11:1031\n79#6,11:1064\n92#6:1096\n79#6,11:1103\n92#6:1135\n79#6,11:1149\n92#6:1181\n79#6,11:1189\n92#6:1221\n92#6:1226\n3737#7,6:1050\n3737#7,6:1083\n3737#7,6:1122\n3737#7,6:1168\n3737#7,6:1208\n69#8,5:1059\n74#8:1092\n78#8:1097\n69#8,5:1098\n74#8:1131\n78#8:1136\n68#8,6:1143\n74#8:1177\n78#8:1182\n68#8,6:1183\n74#8:1217\n78#8:1222\n58#9:1137\n58#9:1140\n51#9:1227\n154#10:1138\n211#10:1139\n154#10:1141\n211#10:1142\n154#10:1228\n154#10:1229\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n*L\n142#1:985\n233#1:995\n344#1:1003\n435#1:1013\n502#1:1030\n154#1:986\n244#1:996\n356#1:1004\n446#1:1014\n494#1:1021,3\n503#1:1042,8\n503#1:1056,3\n514#1:1075,8\n514#1:1089,3\n514#1:1093,3\n522#1:1114,8\n522#1:1128,3\n522#1:1132,3\n550#1:1160,8\n550#1:1174,3\n550#1:1178,3\n558#1:1200,8\n558#1:1214,3\n558#1:1218,3\n503#1:1223,3\n154#1:987,6\n244#1:997,6\n356#1:1005,6\n446#1:1015,6\n494#1:1024,6\n159#1:993\n159#1:994\n361#1:1011\n361#1:1012\n503#1:1031,11\n514#1:1064,11\n514#1:1096\n522#1:1103,11\n522#1:1135\n550#1:1149,11\n550#1:1181\n558#1:1189,11\n558#1:1221\n503#1:1226\n503#1:1050,6\n514#1:1083,6\n522#1:1122,6\n550#1:1168,6\n558#1:1208,6\n514#1:1059,5\n514#1:1092\n514#1:1097\n522#1:1098,5\n522#1:1131\n522#1:1136\n550#1:1143,6\n550#1:1177\n550#1:1182\n558#1:1183,6\n558#1:1217\n558#1:1222\n534#1:1137\n541#1:1140\n815#1:1227\n535#1:1138\n534#1:1139\n541#1:1141\n541#1:1142\n973#1:1228\n981#1:1229\n*E\n"})
public final class OutlinedTextFieldKt {
    @NotNull
    public static final String BorderId = "border";
    public static final float a;
    public static final float b;

    static {
        OutlinedTextFieldKt.a = 4.0f;
        OutlinedTextFieldKt.b = 8.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextField(@NotNull TextFieldValue textFieldValue0, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4) {
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
        int v14;
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
        int v17;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function213;
        int v16;
        int v15;
        KeyboardActions keyboardActions3;
        int v8;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xE2BB703);
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
                    v15 = v9;
                    v16 = v;
                }
                else {
                    v15 = v9 & 0xFFF8FFFF;
                    v16 = z11 ? 1 : 0x7FFFFFFF;
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
                    v17 = v15;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composer1, 6);
                    v17 = v15 & 0xF1FFFFFF;
                }
                if((v4 & 0x80000) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource5;
                    textFieldColors2 = textFieldColors0;
                    shape2 = shape3;
                    v13 = v5;
                    v14 = v16;
                }
                else {
                    v17 &= 0x8FFFFFFF;
                    mutableInteractionSource2 = mutableInteractionSource5;
                    shape2 = shape3;
                    v13 = v5;
                    v14 = v16;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.outlinedTextFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
                }
                keyboardActions2 = keyboardActions3;
                function211 = function213;
                v9 = v17;
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
                v14 = v;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                keyboardOptions3 = keyboardOptions2;
                ComposerKt.traceEventStart(0xE2BB703, v13, v9, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:358)");
            }
            else {
                keyboardOptions3 = keyboardOptions2;
            }
            composer1.startReplaceableGroup(1961404947);
            long v18 = textStyle2.getColor-0d7_KjU();
            if(v18 == 0L) {
                v18 = ((Color)textFieldColors2.textColor(z8, composer1, v13 >> 9 & 14 | v9 >> 24 & 0x70).getValue()).unbox-impl();
            }
            composer1.endReplaceableGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v18, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            int v19 = v9 >> 24 & 0x70;
            BasicTextFieldKt.BasicTextField(textFieldValue0, function10, SizeKt.defaultMinSize-VpY3zN4(TextFieldImplKt.defaultErrorSemantics(BackgroundKt.background-bw27NRU((function28 == null ? modifier2 : PaddingKt.padding-qDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, r.L), 0.0f, OutlinedTextFieldKt.b, 0.0f, 0.0f, 13, null)), ((Color)textFieldColors2.backgroundColor(z8, composer1, v13 >> 9 & 14 | v19).getValue()).unbox-impl(), shape2), z10, Strings_androidKt.getString-4foXLRw(3, composer1, 6)), 280.0f, 56.0f), z8, z9, textStyle3, keyboardOptions3, keyboardActions2, z11, v14, v12, visualTransformation2, null, mutableInteractionSource2, new SolidColor(((Color)textFieldColors2.cursorColor(z10, composer1, v9 & 14 | v19).getValue()).unbox-impl(), null), ComposableLambdaKt.composableLambda(composer1, -1001528775, true, new e6(textFieldValue0, z8, z11, visualTransformation2, mutableInteractionSource2, z10, function28, function29, function210, function211, textFieldColors2, shape2, 1)), composer1, 0xFC7E & v13 | v9 << 12 & 0x380000 | v9 << 12 & 0x1C00000 | v9 << 12 & 0xE000000 | v9 << 12 & 0x70000000, v9 >> 18 & 14 | 0x30000 | v9 & 0x70 | v9 >> 12 & 0x1C00, 0x1000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v14;
            function26 = function210;
            function27 = function211;
            z7 = z11;
            textStyle1 = textStyle2;
            shape1 = shape2;
            textFieldColors1 = textFieldColors2;
            mutableInteractionSource1 = mutableInteractionSource2;
            z5 = z9;
            function24 = function28;
            v11 = v12;
            keyboardActions1 = keyboardActions2;
            keyboardOptions1 = keyboardOptions3;
            function25 = function29;
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
            scopeUpdateScope0.updateScope(new b6(textFieldValue0, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v10, v11, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final void OutlinedTextField(TextFieldValue textFieldValue0, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z2, VisualTransformation visualTransformation0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, MutableInteractionSource mutableInteractionSource0, Shape shape0, TextFieldColors textFieldColors0, Composer composer0, int v1, int v2, int v3) {
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
        Composer composer1 = composer0.startRestartGroup(0xEEC63A60);
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
                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composer1, 6);
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
                    textFieldColors2 = TextFieldDefaults.INSTANCE.outlinedTextFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
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
                ComposerKt.traceEventStart(0xEEC63A60, v11, v12, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:448)");
            }
            else {
                mutableInteractionSource6 = mutableInteractionSource2;
            }
            OutlinedTextFieldKt.OutlinedTextField(textFieldValue0, function10, modifier2, z8, z9, textStyle2, function28, function29, function210, function211, z10, visualTransformation2, keyboardOptions2, keyboardActions2, z11, v10, 1, mutableInteractionSource6, shape2, textFieldColors2, composer1, v11 & 0x7FFFFFFE, v12 & 14 | 0x180000 | v12 & 0x70 | v12 & 0x380 | v12 & 0x1C00 | v12 & 0xE000 | v12 & 0x70000 | 0x1C00000 & v12 << 3 | 0xE000000 & v12 << 3 | v12 << 3 & 0x70000000, 0);
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
            scopeUpdateScope0.updateScope(new c6(textFieldValue0, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v9, mutableInteractionSource1, shape1, textFieldColors1, v1, v2, v3, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextField(@NotNull String s, @NotNull Function1 function10, @Nullable Modifier modifier0, boolean z, boolean z1, @Nullable TextStyle textStyle0, @Nullable Function2 function20, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, boolean z2, @Nullable VisualTransformation visualTransformation0, @Nullable KeyboardOptions keyboardOptions0, @Nullable KeyboardActions keyboardActions0, boolean z3, int v, int v1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable Composer composer0, int v2, int v3, int v4) {
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
        Function2 function214;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        int v15;
        int v14;
        int v13;
        TextFieldColors textFieldColors2;
        Shape shape2;
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
        int v18;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource5;
        MutableInteractionSource mutableInteractionSource4;
        Function2 function213;
        int v17;
        int v16;
        int v8;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0xDAEE55B0);
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
        int v6 = 0x800;
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
        if((v4 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            if(!composer1.changed(keyboardActions0)) {
                v6 = 0x400;
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
                KeyboardActions keyboardActions3 = (v4 & 0x2000) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                z11 = (v4 & 0x4000) == 0 ? z3 : false;
                if((v4 & 0x8000) == 0) {
                    v16 = v9;
                    v17 = v;
                }
                else {
                    v16 = v9 & 0xFFF8FFFF;
                    v17 = z11 ? 1 : 0x7FFFFFFF;
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
                    v18 = v16;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall();
                    v18 = v16 & 0xF1FFFFFF;
                }
                if((v4 & 0x80000) == 0) {
                    textFieldColors2 = textFieldColors0;
                    shape2 = shape3;
                    v14 = v17;
                    keyboardActions2 = keyboardActions3;
                }
                else {
                    v18 &= 0x8FFFFFFF;
                    shape2 = shape3;
                    v14 = v17;
                    keyboardActions2 = keyboardActions3;
                    textFieldColors2 = TextFieldDefaults.INSTANCE.outlinedTextFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
                }
                function210 = (v4 & 0x100) == 0 ? function22 : null;
                v13 = v18;
                v15 = v5;
                function211 = function213;
                mutableInteractionSource2 = mutableInteractionSource5;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
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
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                v13 = v9;
                v14 = v;
                v15 = v5;
                mutableInteractionSource2 = mutableInteractionSource0;
                keyboardActions2 = keyboardActions0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                keyboardOptions3 = keyboardOptions2;
                function214 = function211;
                ComposerKt.traceEventStart(0xDAEE55B0, v15, v13, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:156)");
            }
            else {
                function214 = function211;
                keyboardOptions3 = keyboardOptions2;
            }
            composer1.startReplaceableGroup(1961395303);
            long v19 = textStyle2.getColor-0d7_KjU();
            if(v19 == 0L) {
                v19 = ((Color)textFieldColors2.textColor(z8, composer1, v15 >> 9 & 14 | v13 >> 24 & 0x70).getValue()).unbox-impl();
            }
            composer1.endReplaceableGroup();
            TextStyle textStyle3 = textStyle2.merge(new TextStyle(v19, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null));
            int v20 = v13 >> 24 & 0x70;
            BasicTextFieldKt.BasicTextField(s, function10, SizeKt.defaultMinSize-VpY3zN4(TextFieldImplKt.defaultErrorSemantics(BackgroundKt.background-bw27NRU((function28 == null ? modifier2 : PaddingKt.padding-qDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, r.K), 0.0f, OutlinedTextFieldKt.b, 0.0f, 0.0f, 13, null)), ((Color)textFieldColors2.backgroundColor(z8, composer1, v15 >> 9 & 14 | v20).getValue()).unbox-impl(), shape2), z10, Strings_androidKt.getString-4foXLRw(3, composer1, 6)), 280.0f, 56.0f), z8, z9, textStyle3, keyboardOptions3, keyboardActions2, z11, v14, v12, visualTransformation2, null, mutableInteractionSource2, new SolidColor(((Color)textFieldColors2.cursorColor(z10, composer1, v13 & 14 | v20).getValue()).unbox-impl(), null), ComposableLambdaKt.composableLambda(composer1, 1710364390, true, new e6(s, z8, z11, visualTransformation2, mutableInteractionSource2, z10, function28, function29, function210, function214, textFieldColors2, shape2, 0)), composer1, v15 & 0xFC7E | v13 << 12 & 0x380000 | v13 << 12 & 0x1C00000 | v13 << 12 & 0xE000000 | v13 << 12 & 0x70000000, v13 >> 18 & 14 | 0x30000 | v13 & 0x70 | v13 >> 12 & 0x1C00, 0x1000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v10 = v14;
            function26 = function210;
            mutableInteractionSource1 = mutableInteractionSource2;
            function25 = function29;
            shape1 = shape2;
            textStyle1 = textStyle2;
            textFieldColors1 = textFieldColors2;
            z5 = z9;
            function24 = function28;
            v11 = v12;
            keyboardActions1 = keyboardActions2;
            keyboardOptions1 = keyboardOptions3;
            function27 = function214;
            z7 = z11;
            z6 = z10;
            modifier1 = modifier2;
            visualTransformation1 = visualTransformation2;
            z4 = z8;
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
            scopeUpdateScope0.updateScope(new f6(s, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v10, v11, mutableInteractionSource1, shape1, textFieldColors1, v2, v3, v4, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    public static final void OutlinedTextField(String s, Function1 function10, Modifier modifier0, boolean z, boolean z1, TextStyle textStyle0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, boolean z2, VisualTransformation visualTransformation0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, MutableInteractionSource mutableInteractionSource0, Shape shape0, TextFieldColors textFieldColors0, Composer composer0, int v1, int v2, int v3) {
        TextFieldColors textFieldColors1;
        Shape shape1;
        MutableInteractionSource mutableInteractionSource1;
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
        Shape shape4;
        Shape shape2;
        MutableInteractionSource mutableInteractionSource2;
        int v13;
        int v12;
        TextFieldColors textFieldColors2;
        int v11;
        boolean z11;
        KeyboardActions keyboardActions2;
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
        Function2 function213;
        int v9;
        int v7;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-2099955827);
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
        int v6 = 0x2000;
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
        if((v3 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            if(composer1.changed(keyboardActions0)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v3 & 0x4000) != 0) {
            v8 |= 0x6000;
            v9 = v3 & 0x4000;
        }
        else if((v2 & 0xE000) == 0) {
            v9 = v3 & 0x4000;
            if(composer1.changed(z3)) {
                v6 = 0x4000;
            }
            v8 |= v6;
        }
        else {
            v9 = v3 & 0x4000;
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
                Function2 function212 = (v3 & 0x200) == 0 ? function23 : null;
                z10 = (v3 & 0x400) == 0 ? z2 : false;
                visualTransformation2 = (v3 & 0x800) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                keyboardOptions2 = (v3 & 0x1000) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                keyboardActions2 = (v3 & 0x2000) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                z11 = v9 == 0 ? z3 : false;
                v11 = (v3 & 0x8000) == 0 ? v : 0x7FFFFFFF;
                if((v3 & 0x10000) == 0) {
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
                if((v3 & 0x20000) == 0) {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape0;
                }
                else {
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getSmall();
                    v8 &= 0xFE3FFFFF;
                }
                if((0x40000 & v3) == 0) {
                    function211 = function213;
                    textFieldColors2 = textFieldColors0;
                    v12 = v4;
                    v13 = v8;
                }
                else {
                    textFieldColors2 = TextFieldDefaults.INSTANCE.outlinedTextFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, 0x30, 0x1FFFFF);
                    v12 = v4;
                    v13 = v8 & 0xF1FFFFFF;
                    function211 = function213;
                }
                mutableInteractionSource2 = mutableInteractionSource5;
                shape2 = shape3;
                function210 = (v3 & 0x100) == 0 ? function22 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
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
                keyboardActions2 = keyboardActions0;
                z11 = z3;
                v11 = v;
                textFieldColors2 = textFieldColors0;
                v12 = v4;
                v13 = v8;
                mutableInteractionSource2 = mutableInteractionSource0;
                shape2 = shape0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                shape4 = shape2;
                ComposerKt.traceEventStart(-2099955827, v12, v13, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:246)");
            }
            else {
                shape4 = shape2;
            }
            OutlinedTextFieldKt.OutlinedTextField(s, function10, modifier2, z8, z9, textStyle2, function28, function29, function210, function211, z10, visualTransformation2, keyboardOptions2, keyboardActions2, z11, v11, 1, mutableInteractionSource2, shape4, textFieldColors2, composer1, v12 & 0x7FFFFFFE, v13 & 14 | 0x180000 | v13 & 0x70 | v13 & 0x380 | v13 & 0x1C00 | v13 & 0xE000 | v13 & 0x70000 | 0x1C00000 & v13 << 3 | 0xE000000 & v13 << 3 | v13 << 3 & 0x70000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape4;
            mutableInteractionSource1 = mutableInteractionSource2;
            keyboardOptions1 = keyboardOptions2;
            z4 = z8;
            textStyle1 = textStyle2;
            textFieldColors1 = textFieldColors2;
            function24 = function28;
            z7 = z11;
            v10 = v11;
            z6 = z10;
            modifier1 = modifier2;
            function25 = function29;
            keyboardActions1 = keyboardActions2;
            function26 = function210;
            function27 = function211;
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
            v10 = v;
            mutableInteractionSource1 = mutableInteractionSource0;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g6(s, function10, modifier1, z4, z5, textStyle1, function24, function25, function26, function27, z6, visualTransformation1, keyboardOptions1, keyboardActions1, z7, v10, mutableInteractionSource1, shape1, textFieldColors1, v1, v2, v3, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull Modifier modifier0, @NotNull Function2 function20, @Nullable Function3 function30, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, boolean z, float f, @NotNull Function1 function10, @NotNull Function2 function24, @NotNull PaddingValues paddingValues0, @Nullable Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x85D68F52);
        int v2 = (v & 14) == 0 ? v | (composer1.changed(modifier0) ? 4 : 2) : v;
        if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function22) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v2 |= (composer1.changedInstance(function23) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v2 |= (composer1.changed(z) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v) == 0) {
            v2 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000000 : 0x2000000);
        }
        if((0x70000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function24) ? 0x20000000 : 0x10000000);
        }
        int v3 = (v1 & 14) == 0 ? v1 | (composer1.changed(paddingValues0) ? 4 : 2) : v1;
        if((v2 & 0x5B6DB6DB) != 306783378 || (v3 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x85D68F52, v2, v3, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:492)");
            }
            Object[] arr_object = {function10, Boolean.valueOf(z), f, paddingValues0};
            composer1.startReplaceableGroup(0xDE219177);
            boolean z1 = false;
            for(int v4 = 0; v4 < 4; ++v4) {
                z1 |= composer1.changed(arr_object[v4]);
            }
            k6 k60 = composer1.rememberedValue();
            if(z1 || k60 == Composer.Companion.getEmpty()) {
                k60 = new k6(function10, z, f, paddingValues0);
                composer1.updateRememberedValue(k60);
            }
            composer1.endReplaceableGroup();
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            composer1.startReplaceableGroup(-1323940314);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Updater.set-impl(composer1, k60, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
            Function2 function25 = composeUiNode$Companion0.getSetCompositeKeyHash();
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function25);
            }
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function24.invoke(composer1, ((int)(v2 >> 27 & 14)));
            composer1.startReplaceableGroup(0x45BB897E);
            if(function22 != null) {
                Modifier modifier1 = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy0 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
                composer1.startReplaceableGroup(-1323940314);
                int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
                Function2 function26 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                    a.t(v6, composer1, v6, function26);
                }
                r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function22.invoke(composer1, ((int)(v2 >> 12 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x45BB8A9B);
            if(function23 != null) {
                Modifier modifier2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy1 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getCenter(), false, composer1, 6);
                composer1.startReplaceableGroup(-1323940314);
                int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
                Function2 function27 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                    a.t(v7, composer1, v7, function27);
                }
                r0.a.w(0, function33, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function23.invoke(composer1, ((int)(v2 >> 15 & 14)));
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
            composer1.startReplaceableGroup(1169919630);
            if(function30 != null) {
                function30.invoke(LayoutIdKt.layoutId(modifier$Companion0, "Hint").then(modifier3), composer1, ((int)(v2 >> 3 & 0x70)));
            }
            composer1.endReplaceableGroup();
            Modifier modifier4 = LayoutIdKt.layoutId(modifier$Companion0, "TextField").then(modifier3);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy2 = r0.a.i(alignment$Companion0, true, composer1, 0x30, -1323940314);
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function28 = a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                a.t(v8, composer1, v8, function28);
            }
            r0.a.w(0, function34, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function20.invoke(composer1, ((int)(v2 >> 3 & 14)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xDB63EF33);
            if(function21 != null) {
                Modifier modifier5 = LayoutIdKt.layoutId(modifier$Companion0, "Label");
                composer1.startReplaceableGroup(0x2BB5B5D7);
                MeasurePolicy measurePolicy3 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
                int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
                Function2 function29 = a.r(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap4);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                    a.t(v9, composer1, v9, function29);
                }
                r0.a.w(0, function35, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
                function21.invoke(composer1, ((int)(v2 >> 9 & 14)));
                composer1.endReplaceableGroup();
                composer1.endNode();
                composer1.endReplaceableGroup();
                composer1.endReplaceableGroup();
            }
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
            scopeUpdateScope0.updateScope(new h6(modifier0, function20, function30, function21, function22, function23, z, f, function10, function24, paddingValues0, v, v1));
        }
    }

    public static final int access$calculateHeight-O3s9Psw(int v, int v1, int v2, int v3, int v4, float f, long v5, float f1, PaddingValues paddingValues0) {
        float f2 = paddingValues0.calculateTopPadding-D9Ej5fM() * f1;
        return Math.max(Constraints.getMinHeight-impl(v5), Math.max(v, Math.max(v1, zd.c.roundToInt(f * Math.max(f2, ((float)v3) / 2.0f) + (1.0f - f) * f2 + ((float)Math.max(v2, Math.max(v4, MathHelpersKt.lerp(v3, 0, f)))) + paddingValues0.calculateBottomPadding-D9Ej5fM() * f1))));
    }

    public static final int access$calculateWidth-O3s9Psw(int v, int v1, int v2, int v3, int v4, float f, long v5, float f1, PaddingValues paddingValues0) {
        float f2 = paddingValues0.calculateLeftPadding-u2uoSUM(LayoutDirection.Ltr);
        return Math.max(Math.max(v2, Math.max(MathHelpersKt.lerp(v3, 0, f), v4)) + v + v1, Math.max(zd.c.roundToInt((((float)v3) + Dp.constructor-impl(paddingValues0.calculateRightPadding-u2uoSUM(LayoutDirection.Ltr) + f2) * f1) * f), Constraints.getMinWidth-impl(v5)));
    }

    public static final float access$getOutlinedTextFieldInnerPadding$p() [...] // 潜在的解密器

    public static final void access$place(PlacementScope placeable$PlacementScope0, int v, int v1, Placeable placeable0, Placeable placeable1, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, float f, boolean z, float f1, LayoutDirection layoutDirection0, PaddingValues paddingValues0) {
        int v2 = zd.c.roundToInt(paddingValues0.calculateTopPadding-D9Ej5fM() * f1);
        int v3 = zd.c.roundToInt(PaddingKt.calculateStartPadding(paddingValues0, layoutDirection0) * f1);
        if(placeable0 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable0, 0, Alignment.Companion.getCenterVertically().align(placeable0.getHeight(), v), 0.0f, 4, null);
        }
        if(placeable1 != null) {
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable1, v1 - placeable1.getWidth(), Alignment.Companion.getCenterVertically().align(placeable1.getHeight(), v), 0.0f, 4, null);
        }
        if(placeable3 != null) {
            int v4 = MathHelpersKt.lerp((z ? Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), v) : v2), -(placeable3.getHeight() / 2), f);
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable3, zd.c.roundToInt((placeable0 == null ? 0.0f : (((float)TextFieldImplKt.widthOrZero(placeable0)) - 12.0f * f1) * (1.0f - f))) + v3, v4, 0.0f, 4, null);
        }
        PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable2, TextFieldImplKt.widthOrZero(placeable0), Math.max((z ? Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), v) : v2), TextFieldImplKt.heightOrZero(placeable3) / 2), 0.0f, 4, null);
        if(placeable4 != null) {
            if(z) {
                v2 = Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), v);
            }
            PlacementScope.placeRelative$default(placeable$PlacementScope0, placeable4, TextFieldImplKt.widthOrZero(placeable0), Math.max(v2, TextFieldImplKt.heightOrZero(placeable3) / 2), 0.0f, 4, null);
        }
        PlacementScope.place-70tqf50$default(placeable$PlacementScope0, placeable5, 0L, 0.0f, 2, null);
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldKt.b;
    }

    @NotNull
    public static final Modifier outlineCutout-12SF9DM(@NotNull Modifier modifier0, long v, @NotNull PaddingValues paddingValues0) {
        return DrawModifierKt.drawWithContent(modifier0, new i6(v, paddingValues0));
    }
}

