package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C7\u0002\u0018\u00002\u00020\u0001J\\\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u009E\u0002\u0010&\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u00142\u0011\u0010\u0018\u001A\r\u0012\u0004\u0012\u00020\u00100\u0016\u00A2\u0006\u0002\b\u00172\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u0015\b\u0002\u0010\u001C\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016\u00A2\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001D\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016\u00A2\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001E\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016\u00A2\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u001F\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016\u00A2\u0006\u0002\b\u00172\u0015\b\u0002\u0010 \u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016\u00A2\u0006\u0002\b\u00172\u0015\b\u0002\u0010!\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016\u00A2\u0006\u0002\b\u00172\u0015\b\u0002\u0010\"\u001A\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016\u00A2\u0006\u0002\b\u00172\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020#2\u0013\b\u0002\u0010%\u001A\r\u0012\u0004\u0012\u00020\u00100\u0016\u00A2\u0006\u0002\b\u0017H\u0007\u00A2\u0006\u0004\b&\u0010\'J8\u0010$\u001A\u00020#2\b\b\u0002\u0010(\u001A\u00020\r2\b\b\u0002\u0010)\u001A\u00020\r2\b\b\u0002\u0010*\u001A\u00020\r2\b\b\u0002\u0010+\u001A\u00020\r\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-J\u000F\u0010\n\u001A\u00020\tH\u0007\u00A2\u0006\u0004\b\n\u0010.J\u00C2\u0003\u0010\n\u001A\u00020\t2\b\b\u0002\u00100\u001A\u00020/2\b\b\u0002\u00101\u001A\u00020/2\b\b\u0002\u00102\u001A\u00020/2\b\b\u0002\u00103\u001A\u00020/2\b\b\u0002\u00104\u001A\u00020/2\b\b\u0002\u00105\u001A\u00020/2\b\b\u0002\u00106\u001A\u00020/2\b\b\u0002\u00107\u001A\u00020/2\b\b\u0002\u00108\u001A\u00020/2\b\b\u0002\u00109\u001A\u00020/2\n\b\u0002\u0010;\u001A\u0004\u0018\u00010:2\b\b\u0002\u0010<\u001A\u00020/2\b\b\u0002\u0010=\u001A\u00020/2\b\b\u0002\u0010>\u001A\u00020/2\b\b\u0002\u0010?\u001A\u00020/2\b\b\u0002\u0010@\u001A\u00020/2\b\b\u0002\u0010A\u001A\u00020/2\b\b\u0002\u0010B\u001A\u00020/2\b\b\u0002\u0010C\u001A\u00020/2\b\b\u0002\u0010D\u001A\u00020/2\b\b\u0002\u0010E\u001A\u00020/2\b\b\u0002\u0010F\u001A\u00020/2\b\b\u0002\u0010G\u001A\u00020/2\b\b\u0002\u0010H\u001A\u00020/2\b\b\u0002\u0010I\u001A\u00020/2\b\b\u0002\u0010J\u001A\u00020/2\b\b\u0002\u0010K\u001A\u00020/2\b\b\u0002\u0010L\u001A\u00020/2\b\b\u0002\u0010M\u001A\u00020/2\b\b\u0002\u0010N\u001A\u00020/2\b\b\u0002\u0010O\u001A\u00020/2\b\b\u0002\u0010P\u001A\u00020/2\b\b\u0002\u0010Q\u001A\u00020/2\b\b\u0002\u0010R\u001A\u00020/2\b\b\u0002\u0010S\u001A\u00020/2\b\b\u0002\u0010T\u001A\u00020/2\b\b\u0002\u0010U\u001A\u00020/2\b\b\u0002\u0010V\u001A\u00020/2\b\b\u0002\u0010W\u001A\u00020/2\b\b\u0002\u0010X\u001A\u00020/2\b\b\u0002\u0010Y\u001A\u00020/2\b\b\u0002\u0010Z\u001A\u00020/2\b\b\u0002\u0010[\u001A\u00020/H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\\\u0010]JR\u0010`\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b^\u0010_R\u001D\u0010e\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\ba\u0010b\u001A\u0004\bc\u0010dR\u001D\u0010h\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bf\u0010b\u001A\u0004\bg\u0010dR\u001D\u0010k\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bi\u0010b\u001A\u0004\bj\u0010dR\u001D\u0010n\u001A\u00020\r8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bl\u0010b\u001A\u0004\bm\u0010dR\u0011\u0010\f\u001A\u00020\u000B8G\u00A2\u0006\u0006\u001A\u0004\bo\u0010pR\u0018\u0010t\u001A\u00020\t*\u00020q8AX\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\br\u0010s\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006u"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "Container", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "container", "DecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "start", "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "a", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "b", "getMinWidth-D9Ej5fM", "MinWidth", "c", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "d", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1698:1\n77#2:1699\n1#3:1700\n148#4:1701\n148#4:1702\n148#4:1703\n148#4:1704\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1087#1:1699\n736#1:1701\n742#1:1702\n745#1:1703\n748#1:1704\n*E\n"})
public final class OutlinedTextFieldDefaults {
    public static final int $stable;
    @NotNull
    public static final OutlinedTextFieldDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        OutlinedTextFieldDefaults.INSTANCE = new OutlinedTextFieldDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        OutlinedTextFieldDefaults.a = 56.0f;
        OutlinedTextFieldDefaults.b = 280.0f;
        OutlinedTextFieldDefaults.c = 1.0f;
        OutlinedTextFieldDefaults.d = 2.0f;
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
        Composer composer1 = composer0.startRestartGroup(1035477640);
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
                    shape1 = OutlinedTextFieldDefaults.INSTANCE.getShape(composer1, 6);
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                    f2 = OutlinedTextFieldDefaults.d;
                }
                if((v1 & 0x80) == 0) {
                    f3 = f2;
                    f4 = f1;
                    modifier2 = modifier3;
                }
                else {
                    v2 &= 0xFE3FFFFF;
                    modifier2 = modifier3;
                    f4 = OutlinedTextFieldDefaults.c;
                    f3 = f2;
                }
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
                ComposerKt.traceEventStart(1035477640, v2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)");
            }
            boolean z2 = ((Boolean)FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer1, v2 >> 6 & 14).getValue()).booleanValue();
            State state0 = TextFieldImplKt.animateBorderStrokeAsState-NuRrP5Q(z, z1, z2, textFieldColors1, f3, f4, composer1, v2 >> 3 & 0x1C00 | v2 & 0x7E | 0xE000 & v2 >> 6 | v2 >> 6 & 0x70000);
            State state1 = SingleValueAnimationKt.animateColorAsState-euL9pac(textFieldColors1.containerColor-XeAY9LY$material3_release(z, z1, z2), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer1, 0x30, 12);
            BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier2, ((BorderStroke)state0.getValue()), shape1), new po(new rg(0, state1, State.class, "value", "getValue()Ljava/lang/Object;", 0)), shape1), composer1, 0);
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
            scopeUpdateScope0.updateScope(new sg(this, z, z1, interactionSource0, modifier1, textFieldColors2, shape2, f3, f4, v, v1, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to OutlinedTextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n    focusedBorderThickness = focusedBorderThickness,\n    unfocusedBorderThickness = unfocusedBorderThickness,\n)", imports = {}))
    public final void ContainerBox-nbWgWpA(boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @Nullable TextFieldColors textFieldColors0, @Nullable Shape shape0, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        TextFieldColors textFieldColors2;
        float f5;
        float f4;
        Shape shape2;
        int v6;
        float f3;
        int v5;
        float f2;
        int v4;
        Shape shape1;
        int v3;
        TextFieldColors textFieldColors1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x5720B56A);
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
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                textFieldColors1 = textFieldColors0;
                v3 = composer1.changed(textFieldColors1) ? 0x800 : 0x400;
            }
            else {
                textFieldColors1 = textFieldColors0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            textFieldColors1 = textFieldColors0;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                shape1 = shape0;
                v4 = composer1.changed(shape1) ? 0x4000 : 0x2000;
            }
            else {
                shape1 = shape0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            shape1 = shape0;
        }
        if((0x30000 & v) == 0) {
            if((v1 & 0x20) == 0) {
                f2 = f;
                v5 = composer1.changed(f2) ? 0x20000 : 0x10000;
            }
            else {
                f2 = f;
                v5 = 0x10000;
            }
            v2 |= v5;
        }
        else {
            f2 = f;
        }
        if((0x180000 & v) == 0) {
            if((v1 & 0x40) == 0) {
                f3 = f1;
                v6 = composer1.changed(f3) ? 0x100000 : 0x80000;
            }
            else {
                f3 = f1;
                v6 = 0x80000;
            }
            v2 |= v6;
        }
        else {
            f3 = f1;
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(this) ? 0x800000 : 0x400000);
        }
        if((0x492493 & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 8) != 0) {
                    textFieldColors1 = this.colors(composer1, v2 >> 21 & 14);
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    shape1 = OutlinedTextFieldDefaults.INSTANCE.getShape(composer1, 6);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    f2 = OutlinedTextFieldDefaults.d;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                    f3 = OutlinedTextFieldDefaults.c;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5720B56A, v2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1179)");
            }
            this.Container-4EFweAY(z, z1, interactionSource0, Modifier.Companion, textFieldColors1, shape1, f2, f3, composer1, v2 & 14 | 0xC00 | v2 & 0x70 | v2 & 0x380 | 0xE000 & v2 << 3 | 0x70000 & v2 << 3 | 0x380000 & v2 << 3 | 0x1C00000 & v2 << 3 | v2 << 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textFieldColors2 = textFieldColors1;
            shape2 = shape1;
            f4 = f2;
            f5 = f3;
        }
        else {
            composer1.skipToGroupEnd();
            shape2 = shape1;
            f4 = f2;
            f5 = f3;
            textFieldColors2 = textFieldColors1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new tg(this, z, z1, interactionSource0, textFieldColors2, shape2, f4, f5, v, v1, 0));
        }
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void DecorationBox(@NotNull String s, @NotNull Function2 function20, boolean z, boolean z1, @NotNull VisualTransformation visualTransformation0, @NotNull InteractionSource interactionSource0, boolean z2, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable Function2 function25, @Nullable Function2 function26, @Nullable Function2 function27, @Nullable TextFieldColors textFieldColors0, @Nullable PaddingValues paddingValues0, @Nullable Function2 function28, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function216;
        PaddingValues paddingValues1;
        TextFieldColors textFieldColors1;
        Function2 function215;
        Function2 function214;
        Function2 function213;
        Function2 function212;
        Function2 function211;
        Function2 function210;
        Function2 function29;
        boolean z3;
        PaddingValues paddingValues2;
        int v8;
        Function2 function224;
        TextFieldColors textFieldColors2;
        Function2 function223;
        Function2 function222;
        Function2 function221;
        Function2 function220;
        Function2 function219;
        Function2 function218;
        Function2 function217;
        boolean z4;
        boolean z6;
        PaddingValues paddingValues3;
        int v6;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-350442135);
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
            if((v2 & 0x4000) == 0 && composer1.changed(textFieldColors0)) {
                v5 = 0x4000;
            }
            v7 |= v5;
        }
        if((v1 & 0x30000) == 0) {
            v7 |= ((v2 & 0x8000) != 0 || !composer1.changed(paddingValues0) ? 0x10000 : 0x20000);
        }
        if((v2 & 0x10000) != 0) {
            v7 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v7 |= (composer1.changedInstance(function28) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x20000) != 0) {
            v7 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v7 |= (composer1.changed(this) ? 0x800000 : 0x400000);
        }
        if((v3 & 306783379) != 306783378 || (0x492493 & v7) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                boolean z5 = (v2 & 0x40) == 0 ? z2 : false;
                function223 = null;
                function217 = (v2 & 0x80) == 0 ? function21 : null;
                function218 = (v2 & 0x100) == 0 ? function22 : null;
                Function2 function225 = (v2 & 0x200) == 0 ? function23 : null;
                Function2 function226 = (v2 & 0x400) == 0 ? function24 : null;
                function221 = (v2 & 0x800) == 0 ? function25 : null;
                function222 = (v2 & 0x1000) == 0 ? function26 : null;
                if((v2 & 0x2000) == 0) {
                    function223 = function27;
                }
                if((v2 & 0x4000) == 0) {
                    textFieldColors2 = textFieldColors0;
                }
                else {
                    textFieldColors2 = this.colors(composer1, v7 >> 21 & 14);
                    v7 &= 0xFFFF1FFF;
                }
                if((v2 & 0x8000) == 0) {
                    paddingValues3 = paddingValues0;
                }
                else {
                    paddingValues3 = OutlinedTextFieldDefaults.contentPadding-a9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    v7 &= 0xFFF8FFFF;
                }
                if((v2 & 0x10000) == 0) {
                    z6 = z5;
                    function219 = function225;
                    function220 = function226;
                    function224 = function28;
                }
                else {
                    z6 = z5;
                    function219 = function225;
                    function220 = function226;
                    function224 = ComposableLambdaKt.rememberComposableLambda(-1448570018, true, new ug(z, z5, interactionSource0, textFieldColors2), composer1, 54);
                }
                v8 = v7;
                z4 = z6;
                paddingValues2 = paddingValues3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x4000) != 0) {
                    v7 &= 0xFFFF1FFF;
                }
                if((0x8000 & v2) != 0) {
                    v7 &= 0xFFF8FFFF;
                }
                z4 = z2;
                function217 = function21;
                function218 = function22;
                function219 = function23;
                function220 = function24;
                function221 = function25;
                function222 = function26;
                function223 = function27;
                textFieldColors2 = textFieldColors0;
                function224 = function28;
                v8 = v7;
                paddingValues2 = paddingValues0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350442135, v3, v8, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)");
            }
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, s, function20, visualTransformation0, function217, function218, function219, function220, function221, function222, function223, z1, z, z4, interactionSource0, paddingValues2, textFieldColors2, function224, composer1, v3 << 3 & 0x380 | (v3 << 3 & 0x70 | 6) | v3 >> 3 & 0x1C00 | v3 >> 9 & 0xE000 | v3 >> 9 & 0x70000 | v3 >> 9 & 0x380000 | v8 << 21 & 0x1C00000 | v8 << 21 & 0xE000000 | v8 << 21 & 0x70000000, v3 & 0x380 | (v8 >> 9 & 14 | v3 >> 6 & 0x70) | v3 >> 9 & 0x1C00 | 0xE000 & v3 >> 3 | 0x70000 & v8 | v8 << 6 & 0x380000 | v8 << 3 & 0x1C00000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function212 = function220;
            paddingValues1 = paddingValues2;
            function214 = function222;
            textFieldColors1 = textFieldColors2;
            function210 = function218;
            function215 = function223;
            function216 = function224;
            function211 = function219;
            function213 = function221;
            function29 = function217;
            z3 = z4;
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
            textFieldColors1 = textFieldColors0;
            paddingValues1 = paddingValues0;
            function216 = function28;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new vg(this, s, function20, z, z1, visualTransformation0, interactionSource0, z3, function29, function210, function211, function212, function213, function214, function215, textFieldColors1, paddingValues1, function216, v, v1, v2));
        }
    }

    @Composable
    @NotNull
    public final TextFieldColors colors(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, v, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        TextFieldColors textFieldColors0 = this.getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), composer0, v << 3 & 0x70);
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
            ComposerKt.traceEventStart(0x695BB4BD, v42, v43, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
        }
        TextFieldColors textFieldColors0 = this.getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer0, 6), composer0, v46 >> 6 & 0x70).copy-ejIjP34(((v47 & 1) == 0 ? v : 0L), ((v47 & 2) == 0 ? v1 : 0L), ((v47 & 4) == 0 ? v2 : 0L), ((v47 & 8) == 0 ? v3 : 0L), ((v47 & 16) == 0 ? v4 : 0L), ((v47 & 0x20) == 0 ? v5 : 0L), ((v47 & 0x40) == 0 ? v6 : 0L), ((v47 & 0x80) == 0 ? v7 : 0L), ((v47 & 0x100) == 0 ? v8 : 0L), ((v47 & 0x200) == 0 ? v9 : 0L), ((v47 & 0x400) == 0 ? textSelectionColors0 : null), ((v47 & 0x800) == 0 ? v10 : 0L), ((v47 & 0x1000) == 0 ? v11 : 0L), ((v47 & 0x2000) == 0 ? v12 : 0L), ((v47 & 0x4000) == 0 ? v13 : 0L), ((0x8000 & v47) == 0 ? v14 : 0L), ((0x10000 & v47) == 0 ? v15 : 0L), ((0x20000 & v47) == 0 ? v16 : 0L), ((0x40000 & v47) == 0 ? v17 : 0L), ((0x80000 & v47) == 0 ? v18 : 0L), ((0x100000 & v47) == 0 ? v19 : 0L), ((0x200000 & v47) == 0 ? v20 : 0L), ((0x400000 & v47) == 0 ? v21 : 0L), ((0x800000 & v47) == 0 ? v22 : 0L), ((0x1000000 & v47) == 0 ? v23 : 0L), ((0x2000000 & v47) == 0 ? v24 : 0L), ((0x4000000 & v47) == 0 ? v25 : 0L), ((0x8000000 & v47) == 0 ? v26 : 0L), ((0x10000000 & v47) == 0 ? v27 : 0L), ((0x20000000 & v47) == 0 ? v28 : 0L), ((v47 & 0x40000000) == 0 ? v29 : 0L), ((v48 & 1) == 0 ? v30 : 0L), ((v48 & 2) == 0 ? v31 : 0L), ((v48 & 4) == 0 ? v32 : 0L), ((v48 & 8) == 0 ? v33 : 0L), ((v48 & 16) == 0 ? v34 : 0L), ((v48 & 0x20) == 0 ? v35 : 0L), ((v48 & 0x40) == 0 ? v36 : 0L), ((v48 & 0x80) == 0 ? v37 : 0L), ((v48 & 0x100) == 0 ? v38 : 0L), ((v48 & 0x200) == 0 ? v39 : 0L), ((v48 & 0x400) == 0 ? v40 : 0L), ((v48 & 0x800) == 0 ? v41 : 0L));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    @NotNull
    public final PaddingValues contentPadding-a9UjIt4(float f, float f1, float f2, float f3) {
        return PaddingKt.PaddingValues-a9UjIt4(f, f1, f2, f3);
    }

    public static PaddingValues contentPadding-a9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
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
        return outlinedTextFieldDefaults0.contentPadding-a9UjIt4(f, f1, f2, f3);
    }

    @Composable
    @JvmName(name = "getDefaultOutlinedTextFieldColors")
    @NotNull
    public final TextFieldColors getDefaultOutlinedTextFieldColors(@NotNull ColorScheme colorScheme0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEE92E2C7, v, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        TextFieldColors textFieldColors0 = colorScheme0.getDefaultOutlinedTextFieldColorsCached$material3_release();
        composer0.startReplaceGroup(1540400102);
        if(textFieldColors0 == null) {
            textFieldColors0 = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor()), 0L, 0L, 0L, 0L, ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getCaretColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor()), ((TextSelectionColors)composer0.consume(TextSelectionColorsKt.getLocalTextSelectionColors())), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.copy-wmQWz5c$default(ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme0, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme0.setDefaultOutlinedTextFieldColorsCached$material3_release(textFieldColors0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors0;
    }

    public final float getFocusedBorderThickness-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinWidth-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC06A949F, v, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        Shape shape0 = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getUnfocusedBorderThickness-D9Ej5fM() [...] // 潜在的解密器
}

