package androidx.compose.material3.internal;

import aa.l;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.Typography;
import androidx.compose.material3.m2;
import androidx.compose.material3.m;
import androidx.compose.material3.ua;
import androidx.compose.material3.vg;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color.Companion;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import bb.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import oa.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.eb;
import u2.b;
import w0.c1;
import w0.d1;
import w0.e1;
import w0.f1;
import w0.g1;
import w0.h1;
import w0.i1;
import w0.v0;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001A\u00A2\u0002\u0010\u001C\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0011\u0010\u0007\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u00062\u0006\u0010\t\u001A\u00020\b2\u0013\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000B\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000E\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000F\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0010\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0011\u0010\u001B\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u0006H\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A#\u0010 \u001A\u00020\u001E*\u00020\u001E2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u001F\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b \u0010!\u001A#\u0010&\u001A\u00020\u001E*\u00020\u001E2\u0006\u0010#\u001A\u00020\"2\u0006\u0010%\u001A\u00020$H\u0000\u00A2\u0006\u0004\b&\u0010\'\u001A\u0019\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u0000\u00A2\u0006\u0004\b+\u0010,\u001A\u0019\u0010-\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u0000\u00A2\u0006\u0004\b-\u0010,\u001AH\u00106\u001A\b\u0012\u0004\u0012\u000203022\u0006\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010.\u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u00100\u001A\u00020/2\u0006\u00101\u001A\u00020/H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u00105\"\u0014\u00107\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b7\u00108\"\u0014\u00109\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b9\u00108\"\u0014\u0010:\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b:\u00108\"\u0014\u0010;\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b;\u00108\"\u0014\u0010<\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b<\u00108\"\u0014\u0010=\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b=\u00108\"\u0014\u0010>\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b>\u00108\"\u0014\u0010?\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b?\u00108\"\u0014\u0010@\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b@\u00108\"\u001A\u0010F\u001A\u00020A8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0014\u0010G\u001A\u00020*8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\bG\u0010H\"\u001A\u0010M\u001A\u00020/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010L\"\u001A\u0010P\u001A\u00020/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bN\u0010J\u001A\u0004\bO\u0010L\"\u001A\u0010S\u001A\u00020/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bQ\u0010J\u001A\u0004\bR\u0010L\"\u001A\u0010V\u001A\u00020/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bT\u0010J\u001A\u0004\bU\u0010L\"\u001A\u0010Y\u001A\u00020/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bW\u0010J\u001A\u0004\bX\u0010L\"\u001A\u0010\\\u001A\u00020/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bZ\u0010J\u001A\u0004\b[\u0010L\"\u001A\u0010_\u001A\u00020/8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b]\u0010J\u001A\u0004\b^\u0010L\"\u001A\u0010d\u001A\u00020\u001E8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u0010c\"\u001A\u0010i\u001A\u0004\u0018\u00010f*\u00020e8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bg\u0010h\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006l\u00B2\u0006\f\u0010j\u001A\u00020\u00118\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010k\u001A\u00020\u00118\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material3/TextFieldColors;", "colors", "container", "CommonDecorationBox", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "defaultErrorSemantics", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Landroidx/compose/ui/graphics/Shape;", "shape", "textFieldBackground", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "(Landroidx/compose/ui/layout/Placeable;)I", "heightOrZero", "focused", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animateBorderStrokeAsState", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "PrefixId", "SuffixId", "SupportingId", "ContainerId", "Landroidx/compose/ui/unit/Constraints;", "a", "J", "getZeroConstraints", "()J", "ZeroConstraints", "TextFieldAnimationDuration", "I", "b", "F", "getTextFieldPadding", "()F", "TextFieldPadding", "c", "getHorizontalIconPadding", "HorizontalIconPadding", "d", "getSupportingTopPadding", "SupportingTopPadding", "e", "getPrefixSuffixTextPadding", "PrefixSuffixTextPadding", "f", "getMinTextLineHeight", "MinTextLineHeight", "g", "getMinFocusedLabelLineHeight", "MinFocusedLabelLineHeight", "h", "getMinSupportingTextLineHeight", "MinSupportingTextLineHeight", "i", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "showPlaceholder", "showPrefixSuffix", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,501:1\n346#1,9:512\n357#1,4:525\n352#1:533\n365#1,2:534\n387#1,4:539\n364#1:547\n395#1,2:548\n399#1,4:553\n394#1:561\n407#1,3:562\n411#1,3:567\n406#1:586\n419#1,4:587\n418#1,13:600\n432#1:637\n1223#2,6:502\n1223#2,3:571\n1226#2,3:575\n1223#2,3:592\n1226#2,3:596\n1223#2,6:613\n1223#2,6:619\n1223#2,6:625\n1223#2,6:631\n1223#2,3:665\n1226#2,3:669\n1223#2,3:683\n1226#2,3:687\n708#3:508\n696#3:509\n708#3:510\n696#3:511\n1967#4:521\n1882#4,3:522\n1885#4,4:529\n1882#4,3:536\n1885#4,4:543\n1882#4,3:550\n1885#4,4:557\n1882#4,7:579\n1967#4:638\n1882#4,7:639\n1967#4:646\n1882#4,7:647\n1967#4:654\n1882#4,7:655\n1882#4,7:673\n1882#4,7:691\n68#5,2:565\n70#5:570\n71#5:574\n74#5:578\n70#5:591\n71#5:595\n74#5:599\n68#5,3:662\n71#5:668\n74#5:672\n68#5,3:680\n71#5:686\n74#5:690\n81#6:698\n81#6:699\n148#7:700\n148#7:701\n148#7:702\n148#7:703\n148#7:704\n148#7:705\n148#7:706\n148#7:707\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/internal/TextFieldImplKt\n*L\n122#1:512,9\n122#1:525,4\n122#1:533\n122#1:534,2\n122#1:539,4\n122#1:547\n122#1:548,2\n122#1:553,4\n122#1:561\n122#1:562,3\n122#1:567,3\n122#1:586\n122#1:587,4\n122#1:600,13\n122#1:637\n99#1:502,6\n122#1:571,3\n122#1:575,3\n122#1:592,3\n122#1:596,3\n156#1:613,6\n173#1:619,6\n254#1:625,6\n276#1:631,6\n407#1:665,3\n407#1:669,3\n419#1:683,3\n419#1:687,3\n126#1:508\n126#1:509\n130#1:510\n130#1:511\n122#1:521\n122#1:522,3\n122#1:529,4\n122#1:536,3\n122#1:543,4\n122#1:550,3\n122#1:557,4\n122#1:579,7\n353#1:638\n353#1:639,7\n365#1:646\n365#1:647,7\n395#1:654\n395#1:655,7\n407#1:673,7\n419#1:691,7\n122#1:565,2\n122#1:570\n122#1:574\n122#1:578\n122#1:591\n122#1:595\n122#1:599\n407#1:662,3\n407#1:668\n407#1:672\n419#1:680,3\n419#1:686\n419#1:690\n156#1:698\n173#1:699\n492#1:700\n493#1:701\n494#1:702\n495#1:703\n496#1:704\n497#1:705\n498#1:706\n500#1:707\n*E\n"})
public final class TextFieldImplKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[TextFieldType.values().length];
            try {
                arr_v[TextFieldType.Filled.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TextFieldType.Outlined.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[v0.values().length];
            try {
                arr_v1[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[2] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @NotNull
    public static final String ContainerId = "Container";
    @NotNull
    public static final String LabelId = "Label";
    @NotNull
    public static final String LeadingId = "Leading";
    @NotNull
    public static final String PlaceholderId = "Hint";
    @NotNull
    public static final String PrefixId = "Prefix";
    @NotNull
    public static final String SuffixId = "Suffix";
    @NotNull
    public static final String SupportingId = "Supporting";
    public static final int TextFieldAnimationDuration = 150;
    @NotNull
    public static final String TextFieldId = "TextField";
    @NotNull
    public static final String TrailingId = "Trailing";
    public static final long a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final Modifier i;

    static {
        TextFieldImplKt.a = ConstraintsKt.Constraints(0, 0, 0, 0);
        TextFieldImplKt.b = 16.0f;
        TextFieldImplKt.c = 12.0f;
        TextFieldImplKt.d = 4.0f;
        TextFieldImplKt.e = 2.0f;
        TextFieldImplKt.f = 24.0f;
        TextFieldImplKt.g = 16.0f;
        TextFieldImplKt.h = 16.0f;
        TextFieldImplKt.i = SizeKt.defaultMinSize-VpY3zN4(Modifier.Companion, 48.0f, 48.0f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CommonDecorationBox(@NotNull TextFieldType textFieldType0, @NotNull String s, @NotNull Function2 function20, @NotNull VisualTransformation visualTransformation0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, @Nullable Function2 function26, @Nullable Function2 function27, boolean z, boolean z1, boolean z2, @NotNull InteractionSource interactionSource0, @NotNull PaddingValues paddingValues0, @NotNull TextFieldColors textFieldColors0, @NotNull Function2 function28, @Nullable Composer composer0, int v, int v1, int v2) {
        boolean z5;
        boolean z4;
        boolean z3;
        Function2 function214;
        Function2 function213;
        Function2 function212;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        boolean z15;
        ComposableLambda composableLambda5;
        Function2 function224;
        ComposableLambda composableLambda4;
        Function2 function223;
        State state8;
        State state3;
        float f5;
        float f4;
        float f3;
        boolean z12;
        float f2;
        boolean z11;
        float f1;
        boolean z10;
        Function2 function222;
        float f;
        String s2;
        Function2 function221;
        v0 v00;
        TransformedText transformedText0;
        int v11;
        int v10;
        int v8;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x5A44F6EF);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(textFieldType0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        int v4 = 16;
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(visualTransformation0) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function24) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changedInstance(function25) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function26) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v8 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function27) ? 4 : 2) : v1;
        }
        else {
            v8 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            if(composer1.changed(z)) {
                v4 = 0x20;
            }
            v8 |= v4;
        }
        int v9 = v8;
        if((v2 & 0x1000) == 0) {
            v10 = v2 & 0x1000;
            if((v1 & 0x180) == 0) {
                if(composer1.changed(z1)) {
                    v5 = 0x100;
                }
                v9 |= v5;
            }
        }
        else {
            v9 |= 0x180;
            v10 = v2 & 0x1000;
        }
        if((v2 & 0x2000) == 0) {
            v11 = v2 & 0x2000;
            if((v1 & 0xC00) == 0) {
                if(composer1.changed(z2)) {
                    v6 = 0x800;
                }
                v9 |= v6;
            }
        }
        else {
            v9 |= 0xC00;
            v11 = v2 & 0x2000;
        }
        if((v2 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            if(composer1.changed(interactionSource0)) {
                v7 = 0x4000;
            }
            v9 |= v7;
        }
        if((0x8000 & v2) != 0) {
            v9 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v9 |= (composer1.changed(paddingValues0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x10000) != 0) {
            v9 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v9 |= (composer1.changed(textFieldColors0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x20000) != 0) {
            v9 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v9 |= (composer1.changedInstance(function28) ? 0x800000 : 0x400000);
        }
        if((306783379 & v3) != 306783378 || (0x492493 & v9) != 4793490 || !composer1.getSkipping()) {
            Function2 function215 = (v2 & 0x20) == 0 ? function22 : null;
            Function2 function216 = (v2 & 0x40) == 0 ? function23 : null;
            Function2 function217 = (v2 & 0x80) == 0 ? function24 : null;
            Function2 function218 = (v2 & 0x100) == 0 ? function25 : null;
            Function2 function219 = (v2 & 0x200) == 0 ? function26 : null;
            Function2 function220 = (v2 & 0x400) == 0 ? function27 : null;
            boolean z6 = v10 == 0 ? z1 : true;
            boolean z7 = v11 == 0 ? z2 : false;
            z3 = (v2 & 0x800) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5A44F6EF, v3, v9, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
            }
            Object object0 = composer1.rememberedValue();
            if((((v3 & 0x1C00) == 0x800 ? 1 : 0) | ((v3 & 0x70) == 0x20 ? 1 : 0)) != 0 || object0 == Composer.Companion.getEmpty()) {
                transformedText0 = visualTransformation0.filter(new AnnotatedString(s, null, null, 6, null));
                composer1.updateRememberedValue(transformedText0);
            }
            else {
                transformedText0 = object0;
            }
            String s1 = transformedText0.getText().getText();
            boolean z8 = ((Boolean)FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer1, v9 >> 12 & 14).getValue()).booleanValue();
            if(z8) {
                v00 = v0.a;
            }
            else {
                v00 = s1.length() == 0 ? v0.b : v0.c;
            }
            long v12 = textFieldColors0.labelColor-XeAY9LY$material3_release(z6, z7, z8);
            Typography typography0 = MaterialTheme.INSTANCE.getTypography(composer1, 6);
            TextStyle textStyle0 = typography0.getBodyLarge();
            TextStyle textStyle1 = typography0.getBodySmall();
            long v13 = textStyle0.getColor-0d7_KjU();
            Companion color$Companion0 = Color.Companion;
            boolean z9 = Color.equals-impl0(v13, 0L) && !Color.equals-impl0(textStyle1.getColor-0d7_KjU(), 0L) || !Color.equals-impl0(textStyle0.getColor-0d7_KjU(), 0L) && Color.equals-impl0(textStyle1.getColor-0d7_KjU(), 0L);
            long v14 = textStyle1.getColor-0d7_KjU();
            if(z9 && v14 == 16L) {
                v14 = v12;
            }
            long v15 = textStyle0.getColor-0d7_KjU();
            if(z9 && v15 == 16L) {
                v15 = v12;
            }
            long v16 = v14;
            Transition transition0 = TransitionKt.updateTransition(v00, "TextFieldInputState", composer1, 0x30, 0);
            TextFieldImplKt.TextFieldTransitionScope.labelProgress.1 textFieldImplKt$TextFieldTransitionScope$labelProgress$10 = TextFieldImplKt.TextFieldTransitionScope.labelProgress.1.INSTANCE;
            FloatCompanionObject floatCompanionObject0 = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            v0 v01 = (v0)transition0.getCurrentState();
            composer1.startReplaceGroup(0x8699F621);
            if(ComposerKt.isTraceInProgress()) {
                function221 = function218;
                s2 = s1;
                ComposerKt.traceEventStart(0x8699F621, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            else {
                function221 = function218;
                s2 = s1;
            }
            switch(v01.ordinal()) {
                case 1: {
                    f = 0.0f;
                    break;
                }
                case 0: 
                case 2: {
                    f = 1.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Float float0 = f;
            v0 v02 = (v0)transition0.getTargetState();
            composer1.startReplaceGroup(0x8699F621);
            if(ComposerKt.isTraceInProgress()) {
                function222 = function215;
                z10 = z6;
                ComposerKt.traceEventStart(0x8699F621, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
            }
            else {
                function222 = function215;
                z10 = z6;
            }
            switch(v02.ordinal()) {
                case 1: {
                    f1 = 0.0f;
                    break;
                }
                case 0: 
                case 2: {
                    f1 = 1.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            State state0 = TransitionKt.createTransitionAnimation(transition0, float0, f1, ((FiniteAnimationSpec)textFieldImplKt$TextFieldTransitionScope$labelProgress$10.invoke(transition0.getSegment(), composer1, 0)), twoWayConverter0, "LabelProgress", composer1, 0x30000);
            TextFieldImplKt.TextFieldTransitionScope.placeholderOpacity.1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$10 = TextFieldImplKt.TextFieldTransitionScope.placeholderOpacity.1.INSTANCE;
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            v0 v03 = (v0)transition0.getCurrentState();
            composer1.startReplaceGroup(0x55952420);
            if(ComposerKt.isTraceInProgress()) {
                z11 = z7;
                ComposerKt.traceEventStart(0x55952420, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            else {
                z11 = z7;
            }
            switch(v03.ordinal()) {
                case 0: {
                    f2 = 1.0f;
                    break;
                }
                case 1: {
                    f2 = function21 == null ? 1.0f : 0.0f;
                    break;
                }
                case 2: {
                    f2 = 0.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Float float1 = f2;
            v0 v04 = (v0)transition0.getTargetState();
            composer1.startReplaceGroup(0x55952420);
            if(ComposerKt.isTraceInProgress()) {
                z12 = z8;
                ComposerKt.traceEventStart(0x55952420, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
            }
            else {
                z12 = z8;
            }
            switch(v04.ordinal()) {
                case 0: {
                    f3 = 1.0f;
                    break;
                }
                case 1: {
                    f3 = function21 == null ? 1.0f : 0.0f;
                    break;
                }
                case 2: {
                    f3 = 0.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            State state1 = TransitionKt.createTransitionAnimation(transition0, float1, f3, ((FiniteAnimationSpec)textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$10.invoke(transition0.getSegment(), composer1, 0)), twoWayConverter1, "PlaceholderOpacity", composer1, 0x30000);
            TextFieldImplKt.TextFieldTransitionScope.prefixSuffixOpacity.1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$10 = TextFieldImplKt.TextFieldTransitionScope.prefixSuffixOpacity.1.INSTANCE;
            TwoWayConverter twoWayConverter2 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
            v0 v05 = (v0)transition0.getCurrentState();
            composer1.startReplaceGroup(1128033978);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            switch(v05.ordinal()) {
                case 1: {
                    f4 = function21 == null ? 1.0f : 0.0f;
                    break;
                }
                case 0: 
                case 2: {
                    f4 = 1.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Float float2 = f4;
            v0 v06 = (v0)transition0.getTargetState();
            composer1.startReplaceGroup(1128033978);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
            }
            switch(v06.ordinal()) {
                case 1: {
                    f5 = function21 == null ? 1.0f : 0.0f;
                    break;
                }
                case 0: 
                case 2: {
                    f5 = 1.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            State state2 = TransitionKt.createTransitionAnimation(transition0, float2, f5, ((FiniteAnimationSpec)textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$10.invoke(transition0.getSegment(), composer1, 0)), twoWayConverter2, "PrefixSuffixOpacity", composer1, 0x30000);
            TextFieldImplKt.TextFieldTransitionScope.labelTextStyleColor.1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$10 = TextFieldImplKt.TextFieldTransitionScope.labelTextStyleColor.1.INSTANCE;
            v0 v07 = (v0)transition0.getTargetState();
            composer1.startReplaceGroup(0xF998B741);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF998B741, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            int[] arr_v = WhenMappings.$EnumSwitchMapping$1;
            long v17 = arr_v[v07.ordinal()] == 1 ? v16 : v15;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            ColorSpace colorSpace0 = Color.getColorSpace-impl(v17);
            boolean z13 = composer1.changed(colorSpace0);
            TwoWayConverter twoWayConverter3 = composer1.rememberedValue();
            if(z13 || twoWayConverter3 == Composer.Companion.getEmpty()) {
                twoWayConverter3 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(color$Companion0).invoke(colorSpace0);
                composer1.updateRememberedValue(twoWayConverter3);
            }
            v0 v08 = (v0)transition0.getCurrentState();
            composer1.startReplaceGroup(0xF998B741);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF998B741, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            long v18 = arr_v[v08.ordinal()] == 1 ? v16 : v15;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Color color0 = Color.box-impl(v18);
            v0 v09 = (v0)transition0.getTargetState();
            composer1.startReplaceGroup(0xF998B741);
            if(ComposerKt.isTraceInProgress()) {
                state3 = state2;
                ComposerKt.traceEventStart(0xF998B741, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
            }
            else {
                state3 = state2;
            }
            if(arr_v[v09.ordinal()] != 1) {
                v16 = v15;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            State state4 = TransitionKt.createTransitionAnimation(transition0, color0, Color.box-impl(v16), ((FiniteAnimationSpec)textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$10.invoke(transition0.getSegment(), composer1, 0)), twoWayConverter3, "LabelTextStyleColor", composer1, 0x30000);
            TextFieldImplKt.TextFieldTransitionScope.labelContentColor.1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$10 = TextFieldImplKt.TextFieldTransitionScope.labelContentColor.1.INSTANCE;
            v0 v010 = (v0)transition0.getTargetState();
            composer1.startReplaceGroup(0x3CFF1B76);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3CFF1B76, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            ColorSpace colorSpace1 = Color.getColorSpace-impl(v12);
            boolean z14 = composer1.changed(colorSpace1);
            TwoWayConverter twoWayConverter4 = composer1.rememberedValue();
            if(z14 || twoWayConverter4 == Composer.Companion.getEmpty()) {
                twoWayConverter4 = (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(color$Companion0).invoke(colorSpace1);
                composer1.updateRememberedValue(twoWayConverter4);
            }
            v0 v011 = (v0)transition0.getCurrentState();
            composer1.startReplaceGroup(0x3CFF1B76);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3CFF1B76, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            Color color1 = Color.box-impl(v12);
            v0 v012 = (v0)transition0.getTargetState();
            composer1.startReplaceGroup(0x3CFF1B76);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3CFF1B76, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer1.endReplaceGroup();
            State state5 = TransitionKt.createTransitionAnimation(transition0, color1, Color.box-impl(v12), ((FiniteAnimationSpec)textFieldImplKt$TextFieldTransitionScope$labelContentColor$10.invoke(transition0.getSegment(), composer1, 0)), twoWayConverter4, "LabelContentColor", composer1, 0x30000);
            float f6 = ((Number)state0.getValue()).floatValue();
            composer1.startReplaceGroup(-156998101);
            ComposableLambda composableLambda0 = function21 == null ? null : ComposableLambdaKt.rememberComposableLambda(0xB64B33A0, true, new f1(textStyle0, textStyle1, f6, state5, function21, z9, state4), composer1, 54);
            composer1.endReplaceGroup();
            long v19 = textFieldColors0.placeholderColor-XeAY9LY$material3_release(z10, z11, z12);
            State state6 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(state6 == composer$Companion0.getEmpty()) {
                state6 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new l(state1, 29));
                composer1.updateRememberedValue(state6);
            }
            composer1.startReplaceGroup(-156965270);
            ComposableLambda composableLambda1 = function222 == null || s2.length() != 0 || !((Boolean)state6.getValue()).booleanValue() ? null : ComposableLambdaKt.rememberComposableLambda(-660524084, true, new h(state1, v19, textStyle0, function222, 2), composer1, 54);
            composer1.endReplaceGroup();
            long v20 = textFieldColors0.prefixColor-XeAY9LY$material3_release(z10, z11, z12);
            State state7 = composer1.rememberedValue();
            if(state7 == composer$Companion0.getEmpty()) {
                state8 = state3;
                state7 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new i1(state8, 0));
                composer1.updateRememberedValue(state7);
            }
            else {
                state8 = state3;
            }
            composer1.startReplaceGroup(-156940524);
            ComposableLambda composableLambda2 = function221 == null || !((Boolean)state7.getValue()).booleanValue() ? null : ComposableLambdaKt.rememberComposableLambda(0x105AFDE6, true, new g1(state8, v20, textStyle0, function221), composer1, 54);
            composer1.endReplaceGroup();
            long v21 = textFieldColors0.suffixColor-XeAY9LY$material3_release(z10, z11, z12);
            composer1.startReplaceGroup(0xF6A58F94);
            ComposableLambda composableLambda3 = function219 == null || !((Boolean)state7.getValue()).booleanValue() ? null : ComposableLambdaKt.rememberComposableLambda(0xA5079665, true, new h1(state8, v21, textStyle0, function219), composer1, 54);
            composer1.endReplaceGroup();
            long v22 = textFieldColors0.leadingIconColor-XeAY9LY$material3_release(z10, z11, z12);
            composer1.startReplaceGroup(-156902962);
            if(function216 == null) {
                function223 = null;
                composableLambda4 = null;
            }
            else {
                function223 = function216;
                composableLambda4 = ComposableLambdaKt.rememberComposableLambda(-130107406, true, new ua(v22, function223, 4), composer1, 54);
            }
            composer1.endReplaceGroup();
            long v23 = textFieldColors0.trailingIconColor-XeAY9LY$material3_release(z10, z11, z12);
            composer1.startReplaceGroup(0xF6A5FD0F);
            if(function217 == null) {
                function224 = null;
                composableLambda5 = null;
            }
            else {
                function224 = function217;
                composableLambda5 = ComposableLambdaKt.rememberComposableLambda(0x7BF77BE6, true, new ua(v23, function224, 5), composer1, 54);
            }
            composer1.endReplaceGroup();
            long v24 = textFieldColors0.supportingTextColor-XeAY9LY$material3_release(z10, z11, z12);
            composer1.startReplaceGroup(0xF6A6220A);
            ComposableLambda composableLambda6 = function220 == null ? null : ComposableLambdaKt.rememberComposableLambda(1263707005, true, new m2(v24, textStyle1, function220, 3), composer1, 54);
            composer1.endReplaceGroup();
            switch(WhenMappings.$EnumSwitchMapping$0[textFieldType0.ordinal()]) {
                case 1: {
                    z4 = z10;
                    z15 = z11;
                    composer1.startReplaceGroup(-568105095);
                    ComposableLambda composableLambda7 = ComposableLambdaKt.rememberComposableLambda(1750327932, true, new e1(function28), composer1, 54);
                    TextFieldKt.TextFieldLayout(Modifier.Companion, function20, composableLambda0, composableLambda1, composableLambda4, composableLambda5, composableLambda2, composableLambda3, z3, f6, composableLambda7, composableLambda6, paddingValues0, composer1, v3 >> 3 & 0x70 | 6 | v9 << 21 & 0xE000000, v9 >> 9 & 0x380 | 6);
                    composer1.endReplaceGroup();
                    break;
                }
                case 2: {
                    composer1.startReplaceGroup(0xDE33FB91);
                    MutableState mutableState0 = composer1.rememberedValue();
                    if(mutableState0 == composer$Companion0.getEmpty()) {
                        mutableState0 = SnapshotStateKt.mutableStateOf$default(Size.box-impl(0L), null, 2, null);
                        composer1.updateRememberedValue(mutableState0);
                    }
                    z4 = z10;
                    z15 = z11;
                    ComposableLambda composableLambda8 = ComposableLambdaKt.rememberComposableLambda(0x96014D9, true, new d1(mutableState0, paddingValues0, function28), composer1, 54);
                    androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                    boolean z16 = composer1.changed(f6);
                    eb eb0 = composer1.rememberedValue();
                    if(z16 || eb0 == composer$Companion0.getEmpty()) {
                        eb0 = new eb(f6, mutableState0, 1);
                        composer1.updateRememberedValue(eb0);
                    }
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier$Companion0, function20, composableLambda1, composableLambda0, composableLambda4, composableLambda5, composableLambda2, composableLambda3, z3, f6, eb0, composableLambda8, composableLambda6, paddingValues0, composer1, v3 >> 3 & 0x70 | 6 | v9 << 21 & 0xE000000, v9 >> 6 & 0x1C00 | 0x30);
                    composer1.endReplaceGroup();
                    break;
                }
                default: {
                    composer1.startReplaceGroup(0xDE4EA561);
                    composer1.endReplaceGroup();
                    z4 = z10;
                    z15 = z11;
                }
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function211 = function224;
            function210 = function223;
            function213 = function219;
            function214 = function220;
            function212 = function221;
            function29 = function222;
            z5 = z15;
        }
        else {
            composer1.skipToGroupEnd();
            function29 = function22;
            function210 = function23;
            function211 = function24;
            function212 = function25;
            function213 = function26;
            function214 = function27;
            z3 = z;
            z4 = z1;
            z5 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vg(textFieldType0, s, function20, visualTransformation0, function21, function29, function210, function211, function212, function213, function214, z3, z4, z5, interactionSource0, paddingValues0, textFieldColors0, function28, v, v1, v2));
        }
    }

    public static final void access$Decoration-3J-VO9M(long v, TextStyle textStyle0, Function2 function20, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x480B140C);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x480B140C, v2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(v, textStyle0, function20, composer1, v2 & 0x3FE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c1(v, textStyle0, function20, v1, 1));
        }
    }

    public static final void access$Decoration-Iv8Zu3U(long v, Function2 function20, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(660142980);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660142980, v2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(v)), function20, composer1, v2 & 0x70 | ProvidedValue.$stable);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, function20, v1));
        }
    }

    @Composable
    @NotNull
    public static final State animateBorderStrokeAsState-NuRrP5Q(boolean z, boolean z1, boolean z2, @NotNull TextFieldColors textFieldColors0, float f, float f1, @Nullable Composer composer0, int v) {
        State state1;
        State state0;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7A02F0B5, v, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long v1 = textFieldColors0.indicatorColor-XeAY9LY$material3_release(z, z1, z2);
        if(z) {
            composer0.startReplaceGroup(0x3CFA90AE);
            state0 = SingleValueAnimationKt.animateColorAsState-euL9pac(v1, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer0, 0x30, 12);
        }
        else {
            composer0.startReplaceGroup(1023165505);
            state0 = SnapshotStateKt.rememberUpdatedState(Color.box-impl(v1), composer0, 0);
        }
        composer0.endReplaceGroup();
        if(z) {
            composer0.startReplaceGroup(0x3CFDDA29);
            state1 = AnimateAsStateKt.animateDpAsState-AjpBEmI((z2 ? f : f1), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer0, 0x30, 12);
        }
        else {
            composer0.startReplaceGroup(0x3D010A74);
            state1 = SnapshotStateKt.rememberUpdatedState(Dp.box-impl(f1), composer0, v >> 15 & 14);
        }
        composer0.endReplaceGroup();
        State state2 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.BorderStroke-cXLIe8U(((Dp)state1.getValue()).unbox-impl(), ((Color)state0.getValue()).unbox-impl()), composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state2;
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final Modifier defaultErrorSemantics(@NotNull Modifier modifier0, boolean z, @NotNull String s) {
        return z ? SemanticsModifierKt.semantics$default(modifier0, false, new m(s, 20), 1, null) : modifier0;
    }

    public static final float getHorizontalIconPadding() [...] // 潜在的解密器

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return TextFieldImplKt.i;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable0) {
        Object object0 = intrinsicMeasurable0.getParentData();
        LayoutIdParentData layoutIdParentData0 = object0 instanceof LayoutIdParentData ? ((LayoutIdParentData)object0) : null;
        return layoutIdParentData0 == null ? null : layoutIdParentData0.getLayoutId();
    }

    public static final float getMinFocusedLabelLineHeight() [...] // 潜在的解密器

    public static final float getMinSupportingTextLineHeight() [...] // 潜在的解密器

    public static final float getMinTextLineHeight() [...] // 潜在的解密器

    public static final float getPrefixSuffixTextPadding() [...] // 潜在的解密器

    public static final float getSupportingTopPadding() [...] // 潜在的解密器

    public static final float getTextFieldPadding() [...] // 潜在的解密器

    public static final long getZeroConstraints() [...] // 潜在的解密器

    public static final int heightOrZero(@Nullable Placeable placeable0) {
        return placeable0 == null ? 0 : placeable0.getHeight();
    }

    @NotNull
    public static final Modifier textFieldBackground(@NotNull Modifier modifier0, @NotNull ColorProducer colorProducer0, @NotNull Shape shape0) {
        return DrawModifierKt.drawWithCache(modifier0, new b(5, shape0, colorProducer0));
    }

    public static final int widthOrZero(@Nullable Placeable placeable0) {
        return placeable0 == null ? 0 : placeable0.getWidth();
    }
}

