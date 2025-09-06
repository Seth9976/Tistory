package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\n\b\u00C7\u0002\u0018\u00002\u00020\u0001J\\\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012JJ\u0010\u0016\u001A\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u00A8\u0002\u0010)\u001A\u00020\u00102\u0006\u0010\u0018\u001A\u00020\u00172\u0011\u0010\u001B\u001A\r\u0012\u0004\u0012\u00020\u00100\u0019\u00A2\u0006\u0002\b\u001A2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u00022\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u0015\b\u0002\u0010\u001F\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u00A2\u0006\u0002\b\u001A2\u0015\b\u0002\u0010 \u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u00A2\u0006\u0002\b\u001A2\u0015\b\u0002\u0010!\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u00A2\u0006\u0002\b\u001A2\u0015\b\u0002\u0010\"\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u00A2\u0006\u0002\b\u001A2\u0015\b\u0002\u0010#\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u00A2\u0006\u0002\b\u001A2\u0015\b\u0002\u0010$\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u00A2\u0006\u0002\b\u001A2\u0015\b\u0002\u0010%\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019\u00A2\u0006\u0002\b\u001A2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\'\u001A\u00020&2\u0013\b\u0002\u0010(\u001A\r\u0012\u0004\u0012\u00020\u00100\u0019\u00A2\u0006\u0002\b\u001AH\u0007\u00A2\u0006\u0004\b)\u0010*J8\u00101\u001A\u00020&2\b\b\u0002\u0010+\u001A\u00020\r2\b\b\u0002\u0010,\u001A\u00020\r2\b\b\u0002\u0010-\u001A\u00020\r2\b\b\u0002\u0010.\u001A\u00020\r\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100J8\u00103\u001A\u00020&2\b\b\u0002\u0010+\u001A\u00020\r2\b\b\u0002\u0010-\u001A\u00020\r2\b\b\u0002\u0010,\u001A\u00020\r2\b\b\u0002\u0010.\u001A\u00020\r\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00100J:\u00105\u001A\u00020&2\b\b\u0002\u0010+\u001A\u00020\r2\b\b\u0002\u0010-\u001A\u00020\r2\b\b\u0002\u0010,\u001A\u00020\r2\b\b\u0002\u0010.\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b4\u00100J\u000F\u0010\n\u001A\u00020\tH\u0007\u00A2\u0006\u0004\b\n\u00106J\u00C2\u0003\u0010\n\u001A\u00020\t2\b\b\u0002\u00108\u001A\u0002072\b\b\u0002\u00109\u001A\u0002072\b\b\u0002\u0010:\u001A\u0002072\b\b\u0002\u0010;\u001A\u0002072\b\b\u0002\u0010<\u001A\u0002072\b\b\u0002\u0010=\u001A\u0002072\b\b\u0002\u0010>\u001A\u0002072\b\b\u0002\u0010?\u001A\u0002072\b\b\u0002\u0010@\u001A\u0002072\b\b\u0002\u0010A\u001A\u0002072\n\b\u0002\u0010C\u001A\u0004\u0018\u00010B2\b\b\u0002\u0010D\u001A\u0002072\b\b\u0002\u0010E\u001A\u0002072\b\b\u0002\u0010F\u001A\u0002072\b\b\u0002\u0010G\u001A\u0002072\b\b\u0002\u0010H\u001A\u0002072\b\b\u0002\u0010I\u001A\u0002072\b\b\u0002\u0010J\u001A\u0002072\b\b\u0002\u0010K\u001A\u0002072\b\b\u0002\u0010L\u001A\u0002072\b\b\u0002\u0010M\u001A\u0002072\b\b\u0002\u0010N\u001A\u0002072\b\b\u0002\u0010O\u001A\u0002072\b\b\u0002\u0010P\u001A\u0002072\b\b\u0002\u0010Q\u001A\u0002072\b\b\u0002\u0010R\u001A\u0002072\b\b\u0002\u0010S\u001A\u0002072\b\b\u0002\u0010T\u001A\u0002072\b\b\u0002\u0010U\u001A\u0002072\b\b\u0002\u0010V\u001A\u0002072\b\b\u0002\u0010W\u001A\u0002072\b\b\u0002\u0010X\u001A\u0002072\b\b\u0002\u0010Y\u001A\u0002072\b\b\u0002\u0010Z\u001A\u0002072\b\b\u0002\u0010[\u001A\u0002072\b\b\u0002\u0010\\\u001A\u0002072\b\b\u0002\u0010]\u001A\u0002072\b\b\u0002\u0010^\u001A\u0002072\b\b\u0002\u0010_\u001A\u0002072\b\b\u0002\u0010`\u001A\u0002072\b\b\u0002\u0010a\u001A\u0002072\b\b\u0002\u0010b\u001A\u0002072\b\b\u0002\u0010c\u001A\u000207H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bd\u0010eJ9\u0010f\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\bf\u0010gJ:\u0010i\u001A\u00020&2\b\b\u0002\u0010+\u001A\u00020\r2\b\b\u0002\u0010,\u001A\u00020\r2\b\b\u0002\u0010-\u001A\u00020\r2\b\b\u0002\u0010.\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bh\u00100J:\u0010k\u001A\u00020&2\b\b\u0002\u0010+\u001A\u00020\r2\b\b\u0002\u0010-\u001A\u00020\r2\b\b\u0002\u0010,\u001A\u00020\r2\b\b\u0002\u0010.\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bj\u00100J:\u0010m\u001A\u00020&2\b\b\u0002\u0010+\u001A\u00020\r2\b\b\u0002\u0010-\u001A\u00020\r2\b\b\u0002\u0010,\u001A\u00020\r2\b\b\u0002\u0010.\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bl\u00100R\u001D\u0010r\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010qR\u001D\u0010u\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bs\u0010o\u001A\u0004\bt\u0010qR\u001D\u0010x\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bv\u0010o\u001A\u0004\bw\u0010qR\u001D\u0010{\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\by\u0010o\u001A\u0004\bz\u0010qR\'\u0010\u0080\u0001\u001A\u00020\r8\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b|\u0010o\u0012\u0004\b~\u0010\u007F\u001A\u0004\b}\u0010qR*\u0010\u0084\u0001\u001A\u00020\r8\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0015\n\u0005\b\u0081\u0001\u0010o\u0012\u0005\b\u0083\u0001\u0010\u007F\u001A\u0005\b\u0082\u0001\u0010qR\u0013\u0010\f\u001A\u00020\u000B8G\u00A2\u0006\b\u001A\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001C\u0010\u008A\u0001\u001A\u00020\t*\u00030\u0087\u00018AX\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001E\u0010\u008D\u0001\u001A\u00020\u000B8GX\u0087\u0004\u00A2\u0006\u000F\u0012\u0005\b\u008C\u0001\u0010\u007F\u001A\u0006\b\u008B\u0001\u0010\u0086\u0001R\u001E\u0010\u0090\u0001\u001A\u00020\u000B8GX\u0087\u0004\u00A2\u0006\u000F\u0012\u0005\b\u008F\u0001\u0010\u007F\u001A\u0006\b\u008E\u0001\u0010\u0086\u0001\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0091\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "Container", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithLabel", "contentPaddingWithoutLabel-a9UjIt4", "contentPaddingWithoutLabel", "supportingTextPadding-a9UjIt4$material3_release", "supportingTextPadding", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "a", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "b", "getMinWidth-D9Ej5fM", "MinWidth", "c", "getUnfocusedIndicatorThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "d", "getFocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "e", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "()V", "UnfocusedBorderThickness", "f", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultTextFieldColors", "getOutlinedShape", "getOutlinedShape$annotations", "outlinedShape", "getFilledShape", "getFilledShape$annotations", "filledShape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1698:1\n135#2:1699\n148#3:1700\n148#3:1703\n148#3:1704\n148#3:1705\n148#3:1706\n77#4:1701\n1#5:1702\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n160#1:1699\n330#1:1700\n67#1:1703\n73#1:1704\n76#1:1705\n79#1:1706\n502#1:1701\n*E\n"})
public final class TextFieldDefaults {
    public static final int $stable;
    @NotNull
    public static final TextFieldDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        TextFieldDefaults.INSTANCE = new TextFieldDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        TextFieldDefaults.a = 56.0f;
        TextFieldDefaults.b = 280.0f;
        TextFieldDefaults.c = 1.0f;
        TextFieldDefaults.d = 2.0f;
        TextFieldDefaults.e = 1.0f;
        TextFieldDefaults.f = 2.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void Container-4EFweAY(boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @Nullable Modifier modifier0, @Nullable TextFieldColors textFieldColors0, @Nullable Shape shape0, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        Shape shape2;
        TextFieldColors textFieldColors2;
        float f4;
        float f3;
        Modifier modifier2;
        int v5;
        float f2;
        int v4;
        Shape shape1;
        int v3;
        TextFieldColors textFieldColors1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xCF343886);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(interactionSource0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                textFieldColors1 = textFieldColors0;
                v3 = composer1.changed(textFieldColors1) ? 0x4000 : 0x2000;
            }
            else {
                textFieldColors1 = textFieldColors0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            textFieldColors1 = textFieldColors0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                shape1 = shape0;
                v4 = composer1.changed(shape1) ? 0x20000 : 0x10000;
            }
            else {
                shape1 = shape0;
                v4 = 0x10000;
            }
            v2 |= v4;
        }
        else {
            shape1 = shape0;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                f2 = f;
                v5 = composer1.changed(f2) ? 0x100000 : 0x80000;
            }
            else {
                f2 = f;
                v5 = 0x80000;
            }
            v2 |= v5;
        }
        else {
            f2 = f;
        }
        if((0xC00000 & v) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(f1) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(this) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 16) != 0) {
                    TextFieldColors textFieldColors3 = this.colors(composer1, v2 >> 24 & 14);
                    v2 &= 0xFFFF1FFF;
                    textFieldColors1 = textFieldColors3;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    shape1 = TextFieldDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                    f2 = TextFieldDefaults.d;
                }
                if((v1 & 0x80) == 0) {
                    f3 = f2;
                    f4 = f1;
                }
                else {
                    v2 &= 0xFE3FFFFF;
                    f4 = TextFieldDefaults.c;
                    f3 = f2;
                }
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                f3 = f2;
                f4 = f1;
                modifier2 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCF343886, v2, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:109)");
            }
            BoxKt.Box(this.indicatorLine-gv0btCI(TextFieldImplKt.textFieldBackground(modifier2, new po(new rg(0, SingleValueAnimationKt.animateColorAsState-euL9pac(textFieldColors1.containerColor-XeAY9LY$material3_release(z, z1, ((Boolean)FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer1, v2 >> 6 & 14).getValue()).booleanValue()), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer1, 0x30, 12), State.class, "value", "getValue()Ljava/lang/Object;", 1)), shape1), z, z1, interactionSource0, textFieldColors1, f3, f4), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape1;
            textFieldColors2 = textFieldColors1;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            f3 = f2;
            f4 = f1;
            textFieldColors2 = textFieldColors1;
            shape2 = shape1;
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sg(this, z, z1, interactionSource0, modifier1, textFieldColors2, shape2, f3, f4, v, v1, 1));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    public final void ContainerBox(boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @NotNull TextFieldColors textFieldColors0, @Nullable Shape shape0, @Nullable Composer composer0, int v, int v1) {
        int v3;
        Shape shape1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(918564008);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(interactionSource0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(textFieldColors0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                shape1 = shape0;
                v3 = composer1.changed(shape1) ? 0x4000 : 0x2000;
            }
            else {
                shape1 = shape0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            shape1 = shape0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changed(this) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) != 0 && !composer1.getDefaultsInvalid()) {
                composer1.skipToGroupEnd();
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
            }
            else if((v1 & 16) != 0) {
                shape1 = TextFieldDefaults.INSTANCE.getShape(composer1, 6);
                v2 &= 0xFFFF1FFF;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(918564008, v2, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:592)");
            }
            this.Container-4EFweAY(z, z1, interactionSource0, Modifier.Companion, textFieldColors0, shape1, TextFieldDefaults.d, TextFieldDefaults.c, composer1, v2 & 14 | 0xC00 | v2 & 0x70 | v2 & 0x380 | 0xE000 & v2 << 3 | v2 << 3 & 0x70000 | v2 << 9 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d3(this, z, z1, interactionSource0, textFieldColors0, shape1, v, v1));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void DecorationBox(@NotNull String s, @NotNull Function2 function20, boolean z, boolean z1, @NotNull VisualTransformation visualTransformation0, @NotNull InteractionSource interactionSource0, boolean z2, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, @Nullable Function2 function26, @Nullable Function2 function27, @Nullable Shape shape0, @Nullable TextFieldColors textFieldColors0, @Nullable PaddingValues paddingValues0, @Nullable Function2 function28, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function216;
        PaddingValues paddingValues1;
        TextFieldColors textFieldColors1;
        Shape shape1;
        Function2 function215;
        Function2 function214;
        Function2 function213;
        Function2 function212;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        boolean z3;
        Function2 function223;
        int v8;
        Function2 function222;
        TextFieldColors textFieldColors2;
        Shape shape2;
        Function2 function221;
        Function2 function220;
        Function2 function219;
        Function2 function218;
        Function2 function217;
        boolean z4;
        int v9;
        PaddingValues paddingValues2;
        Shape shape3;
        int v6;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x11438FFC);
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
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        int v4 = 0x400;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        int v5 = 0x2000;
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(visualTransformation0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changed(interactionSource0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v3 |= (composer1.changed(z2) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v6 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function24) ? 4 : 2) : v1;
        }
        else {
            v6 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v6 |= (composer1.changedInstance(function25) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v2 & 0x1000) != 0) {
            v7 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v7 |= (composer1.changedInstance(function26) ? 0x100 : 0x80);
        }
        if((v2 & 0x2000) != 0) {
            v7 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            if(composer1.changedInstance(function27)) {
                v4 = 0x800;
            }
            v7 |= v4;
        }
        if((v1 & 0x6000) == 0) {
            if((v2 & 0x4000) == 0 && composer1.changed(shape0)) {
                v5 = 0x4000;
            }
            v7 |= v5;
        }
        if((v1 & 0x30000) == 0) {
            v7 |= ((v2 & 0x8000) != 0 || !composer1.changed(textFieldColors0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x180000) == 0) {
            v7 |= ((v2 & 0x10000) != 0 || !composer1.changed(paddingValues0) ? 0x80000 : 0x100000);
        }
        if((v2 & 0x20000) != 0) {
            v7 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v7 |= (composer1.changedInstance(function28) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x40000) != 0) {
            v7 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v7 |= (composer1.changed(this) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 306783379) != 306783378 || (0x2492493 & v7) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                z4 = (v2 & 0x40) == 0 ? z2 : false;
                Function2 function224 = null;
                function217 = (v2 & 0x80) == 0 ? function21 : null;
                function210 = (v2 & 0x100) == 0 ? function22 : null;
                function218 = (v2 & 0x200) == 0 ? function23 : null;
                function219 = (v2 & 0x400) == 0 ? function24 : null;
                function220 = (v2 & 0x800) == 0 ? function25 : null;
                function221 = (v2 & 0x1000) == 0 ? function26 : null;
                if((v2 & 0x2000) == 0) {
                    function224 = function27;
                }
                if((v2 & 0x4000) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = TextFieldDefaults.INSTANCE.getShape(composer1, 6);
                    v7 &= 0xFFFF1FFF;
                }
                if((v2 & 0x8000) == 0) {
                    textFieldColors2 = textFieldColors0;
                }
                else {
                    textFieldColors2 = this.colors(composer1, v7 >> 24 & 14);
                    v7 &= 0xFFF8FFFF;
                }
                if((v2 & 0x10000) == 0) {
                    paddingValues2 = paddingValues0;
                }
                else {
                    paddingValues2 = function217 == null ? TextFieldDefaults.contentPaddingWithoutLabel-a9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : TextFieldDefaults.contentPaddingWithLabel-a9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    v7 &= 0xFFC7FFFF;
                }
                if((v2 & 0x20000) == 0) {
                    v9 = v7;
                    function222 = function28;
                }
                else {
                    v9 = v7;
                    function222 = ComposableLambdaKt.rememberComposableLambda(0xE60A6F31, true, new mo(z, z4, interactionSource0, textFieldColors2, shape3), composer1, 54);
                }
                shape2 = shape3;
                function223 = function224;
                paddingValues1 = paddingValues2;
                v8 = v9;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x4000) != 0) {
                    v7 &= 0xFFFF1FFF;
                }
                if((0x8000 & v2) != 0) {
                    v7 &= 0xFFF8FFFF;
                }
                if((v2 & 0x10000) != 0) {
                    v7 &= 0xFFC7FFFF;
                }
                z4 = z2;
                function217 = function21;
                function210 = function22;
                function218 = function23;
                function219 = function24;
                function220 = function25;
                function221 = function26;
                shape2 = shape0;
                textFieldColors2 = textFieldColors0;
                paddingValues1 = paddingValues0;
                function222 = function28;
                v8 = v7;
                function223 = function27;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x11438FFC, v3, v8, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:276)");
            }
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, s, function20, visualTransformation0, function217, function210, function218, function219, function220, function221, function223, z1, z, z4, interactionSource0, paddingValues1, textFieldColors2, function222, composer1, v3 << 3 & 0x380 | (v3 << 3 & 0x70 | 6) | v3 >> 3 & 0x1C00 | v3 >> 9 & 0xE000 | v3 >> 9 & 0x70000 | v3 >> 9 & 0x380000 | v8 << 21 & 0x1C00000 | v8 << 21 & 0xE000000 | v8 << 21 & 0x70000000, v3 & 0x380 | (v8 >> 9 & 14 | v3 >> 6 & 0x70) | v3 >> 9 & 0x1C00 | 0xE000 & v3 >> 3 | v8 >> 3 & 0x70000 | 0x380000 & v8 << 3 | v8 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape1 = shape2;
            function212 = function219;
            function213 = function220;
            function215 = function223;
            function214 = function221;
            z3 = z4;
            textFieldColors1 = textFieldColors2;
            function216 = function222;
            function211 = function218;
            function29 = function217;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z2;
            function29 = function21;
            function210 = function22;
            function211 = function23;
            function212 = function24;
            function213 = function25;
            function214 = function26;
            function215 = function27;
            shape1 = shape0;
            textFieldColors1 = textFieldColors0;
            paddingValues1 = paddingValues0;
            function216 = function28;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new no(this, s, function20, z, z1, visualTransformation0, interactionSource0, z3, function29, function210, function211, function212, function213, function214, function215, shape1, textFieldColors1, paddingValues1, function216, v, v1, v2));
        }
    }

    @Composable
    @NotNull
    public final TextFieldColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3193361C, v, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors textFieldColors0 = this.getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), composer0, v << 3 & 0x70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    // 去混淆评级： 中等(143)
    @Composable
    @NotNull
    public final TextFieldColors colors-0hiis_0(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, @Nullable TextSelectionColors textSelectionColors0, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, long v22, long v23, long v24, long v25, long v26, long v27, long v28, long v29, long v30, long v31, long v32, long v33, long v34, long v35, long v36, long v37, long v38, long v39, long v40, long v41, @Nullable Composer composer0, int v42, int v43, int v44, int v45, int v46, int v47, int v48) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5A33CFBB, v42, v43, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        }
        TextFieldColors textFieldColors0 = this.getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), composer0, v46 >> 6 & 0x70).copy-ejIjP34(((v47 & 1) == 0 ? v : 0L), ((v47 & 2) == 0 ? v1 : 0L), ((v47 & 4) == 0 ? v2 : 0L), ((v47 & 8) == 0 ? v3 : 0L), ((v47 & 16) == 0 ? v4 : 0L), ((v47 & 0x20) == 0 ? v5 : 0L), ((v47 & 0x40) == 0 ? v6 : 0L), ((v47 & 0x80) == 0 ? v7 : 0L), ((v47 & 0x100) == 0 ? v8 : 0L), ((v47 & 0x200) == 0 ? v9 : 0L), ((v47 & 0x400) == 0 ? textSelectionColors0 : null), ((v47 & 0x800) == 0 ? v10 : 0L), ((v47 & 0x1000) == 0 ? v11 : 0L), ((v47 & 0x2000) == 0 ? v12 : 0L), ((v47 & 0x4000) == 0 ? v13 : 0L), ((0x8000 & v47) == 0 ? v14 : 0L), ((0x10000 & v47) == 0 ? v15 : 0L), ((0x20000 & v47) == 0 ? v16 : 0L), ((0x40000 & v47) == 0 ? v17 : 0L), ((0x80000 & v47) == 0 ? v18 : 0L), ((0x100000 & v47) == 0 ? v19 : 0L), ((0x200000 & v47) == 0 ? v20 : 0L), ((0x400000 & v47) == 0 ? v21 : 0L), ((0x800000 & v47) == 0 ? v22 : 0L), ((0x1000000 & v47) == 0 ? v23 : 0L), ((0x2000000 & v47) == 0 ? v24 : 0L), ((0x4000000 & v47) == 0 ? v25 : 0L), ((0x8000000 & v47) == 0 ? v26 : 0L), ((0x10000000 & v47) == 0 ? v27 : 0L), ((0x20000000 & v47) == 0 ? v28 : 0L), ((v47 & 0x40000000) == 0 ? v29 : 0L), ((v48 & 1) == 0 ? v30 : 0L), ((v48 & 2) == 0 ? v31 : 0L), ((v48 & 4) == 0 ? v32 : 0L), ((v48 & 8) == 0 ? v33 : 0L), ((v48 & 16) == 0 ? v34 : 0L), ((v48 & 0x20) == 0 ? v35 : 0L), ((v48 & 0x40) == 0 ? v36 : 0L), ((v48 & 0x80) == 0 ? v37 : 0L), ((v48 & 0x100) == 0 ? v38 : 0L), ((v48 & 0x200) == 0 ? v39 : 0L), ((v48 & 0x400) == 0 ? v40 : 0L), ((v48 & 0x800) == 0 ? v41 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @NotNull
    public final PaddingValues contentPaddingWithLabel-a9UjIt4(float f, float f1, float f2, float f3) {
        return PaddingKt.PaddingValues-a9UjIt4(f, f2, f1, f3);
    }

    public static PaddingValues contentPaddingWithLabel-a9UjIt4$default(TextFieldDefaults textFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 16.0f;
        }
        if((v & 2) != 0) {
            f1 = 16.0f;
        }
        if((v & 4) != 0) {
            f2 = 8.0f;
        }
        if((v & 8) != 0) {
            f3 = 8.0f;
        }
        return textFieldDefaults0.contentPaddingWithLabel-a9UjIt4(f, f1, f2, f3);
    }

    @NotNull
    public final PaddingValues contentPaddingWithoutLabel-a9UjIt4(float f, float f1, float f2, float f3) {
        return PaddingKt.PaddingValues-a9UjIt4(f, f1, f2, f3);
    }

    public static PaddingValues contentPaddingWithoutLabel-a9UjIt4$default(TextFieldDefaults textFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 16.0f;
        }
        if((v & 2) != 0) {
            f1 = 16.0f;
        }
        if((v & 4) != 0) {
            f2 = 16.0f;
        }
        if((v & 8) != 0) {
            f3 = 16.0f;
        }
        return textFieldDefaults0.contentPaddingWithoutLabel-a9UjIt4(f, f1, f2, f3);
    }

    @Composable
    @JvmName(name = "getDefaultTextFieldColors")
    @NotNull
    public final TextFieldColors getDefaultTextFieldColors(@NotNull ColorScheme colorScheme0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4FFCD785, v, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors textFieldColors0 = colorScheme0.getDefaultTextFieldColorsCached$material3_release();
        composer0.startReplaceGroup(27085453);
        if(textFieldColors0 == null) {
            textFieldColors0 = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getCaretColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor()), ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors())), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getLabelColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getSupportingColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme0.setDefaultTextFieldColorsCached$material3_release(textFieldColors0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @Composable
    @JvmName(name = "getFilledShape")
    @NotNull
    public final Shape getFilledShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x247941E1, v, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
        }
        Shape shape0 = this.getShape(composer0, v & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static void getFilledShape$annotations() {
    }

    public final float getFocusedBorderThickness-D9Ej5fM() {
        return TextFieldDefaults.f;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    public static void getFocusedBorderThickness-D9Ej5fM$annotations() {
    }

    public final float getFocusedIndicatorThickness-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinWidth-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDD256F21, v, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
        }
        Shape shape0 = OutlinedTextFieldDefaults.INSTANCE.getShape(composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static void getOutlinedShape$annotations() {
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8C49B19D, v, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape shape0 = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getUnfocusedBorderThickness-D9Ej5fM() {
        return TextFieldDefaults.e;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    public static void getUnfocusedBorderThickness-D9Ej5fM$annotations() {
    }

    public final float getUnfocusedIndicatorThickness-D9Ej5fM() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @ExperimentalMaterial3Api
    @NotNull
    public final Modifier indicatorLine-gv0btCI(@NotNull Modifier modifier0, boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @NotNull TextFieldColors textFieldColors0, float f, float f1) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new oo(z, z1, interactionSource0, textFieldColors0, f, f1));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n1#1,178:1\n161#2,8:179\n*E\n"})
        public final class androidx.compose.material3.TextFieldDefaults.indicatorLine-gv0btCI..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float A;
            public final float B;
            public final boolean w;
            public final boolean x;
            public final InteractionSource y;
            public final TextFieldColors z;

            public androidx.compose.material3.TextFieldDefaults.indicatorLine-gv0btCI..inlined.debugInspectorInfo.1(boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, float f, float f1) {
                this.w = z;
                this.x = z1;
                this.y = interactionSource0;
                this.z = textFieldColors0;
                this.A = f;
                this.B = f1;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("indicatorLine");
                ValueElementSequence valueElementSequence0 = a.k(this.w, inspectorInfo0.getProperties(), "enabled", inspectorInfo0);
                a.k(this.x, valueElementSequence0, "isError", inspectorInfo0).set("interactionSource", this.y);
                inspectorInfo0.getProperties().set("colors", this.z);
                a.j(this.A, inspectorInfo0.getProperties(), "focusedIndicatorLineThickness", inspectorInfo0).set("unfocusedIndicatorLineThickness", Dp.box-impl(this.B));
            }
        }

    }

    public static Modifier indicatorLine-gv0btCI$default(TextFieldDefaults textFieldDefaults0, Modifier modifier0, boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, float f, float f1, int v, Object object0) {
        float f2 = (v & 16) == 0 ? f : TextFieldDefaults.d;
        return (v & 0x20) == 0 ? textFieldDefaults0.indicatorLine-gv0btCI(modifier0, z, z1, interactionSource0, textFieldColors0, f2, f1) : textFieldDefaults0.indicatorLine-gv0btCI(modifier0, z, z1, interactionSource0, textFieldColors0, f2, TextFieldDefaults.c);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @NotNull
    public final PaddingValues outlinedTextFieldPadding-a9UjIt4(float f, float f1, float f2, float f3) {
        return OutlinedTextFieldDefaults.INSTANCE.contentPadding-a9UjIt4(f, f1, f2, f3);
    }

    public static PaddingValues outlinedTextFieldPadding-a9UjIt4$default(TextFieldDefaults textFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 16.0f;
        }
        if((v & 2) != 0) {
            f1 = 16.0f;
        }
        if((v & 4) != 0) {
            f2 = 16.0f;
        }
        if((v & 8) != 0) {
            f3 = 16.0f;
        }
        return textFieldDefaults0.outlinedTextFieldPadding-a9UjIt4(f, f1, f2, f3);
    }

    @NotNull
    public final PaddingValues supportingTextPadding-a9UjIt4$material3_release(float f, float f1, float f2, float f3) {
        return PaddingKt.PaddingValues-a9UjIt4(f, f1, f2, f3);
    }

    public static PaddingValues supportingTextPadding-a9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 16.0f;
        }
        if((v & 2) != 0) {
            f1 = 4.0f;
        }
        if((v & 4) != 0) {
            f2 = 16.0f;
        }
        if((v & 8) != 0) {
            f3 = 0.0f;
        }
        return textFieldDefaults0.supportingTextPadding-a9UjIt4$material3_release(f, f1, f2, f3);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    public final PaddingValues textFieldWithLabelPadding-a9UjIt4(float f, float f1, float f2, float f3) {
        return this.contentPaddingWithLabel-a9UjIt4(f, f1, f2, f3);
    }

    public static PaddingValues textFieldWithLabelPadding-a9UjIt4$default(TextFieldDefaults textFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 16.0f;
        }
        if((v & 2) != 0) {
            f1 = 16.0f;
        }
        if((v & 4) != 0) {
            f2 = 8.0f;
        }
        if((v & 8) != 0) {
            f3 = 8.0f;
        }
        return textFieldDefaults0.textFieldWithLabelPadding-a9UjIt4(f, f1, f2, f3);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    public final PaddingValues textFieldWithoutLabelPadding-a9UjIt4(float f, float f1, float f2, float f3) {
        return this.contentPaddingWithoutLabel-a9UjIt4(f, f1, f2, f3);
    }

    public static PaddingValues textFieldWithoutLabelPadding-a9UjIt4$default(TextFieldDefaults textFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 16.0f;
        }
        if((v & 2) != 0) {
            f1 = 16.0f;
        }
        if((v & 4) != 0) {
            f2 = 16.0f;
        }
        if((v & 8) != 0) {
            f3 = 16.0f;
        }
        return textFieldDefaults0.textFieldWithoutLabelPadding-a9UjIt4(f, f1, f2, f3);
    }
}

