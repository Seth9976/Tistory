package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.re;
import androidx.compose.material3.tg;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.ScopeUpdateScope;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.bb;
import p0.cb;
import p0.db;
import p0.j3;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u000F\b\u00C7\u0002\u0018\u00002\u00020\u0001JJ\u0010\u000F\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJP\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\n2\b\b\u0002\u0010\u0013\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u001F\u001A\u00020\u001C2\b\b\u0002\u0010\u0018\u001A\u00020\n2\b\b\u0002\u0010\u0019\u001A\u00020\n2\b\b\u0002\u0010\u001A\u001A\u00020\n2\b\b\u0002\u0010\u001B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ:\u0010!\u001A\u00020\u001C2\b\b\u0002\u0010\u0018\u001A\u00020\n2\b\b\u0002\u0010\u001A\u001A\u00020\n2\b\b\u0002\u0010\u0019\u001A\u00020\n2\b\b\u0002\u0010\u001B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001EJ:\u0010#\u001A\u00020\u001C2\b\b\u0002\u0010\u0018\u001A\u00020\n2\b\b\u0002\u0010\u001A\u001A\u00020\n2\b\b\u0002\u0010\u0019\u001A\u00020\n2\b\b\u0002\u0010\u001B\u001A\u00020\nH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010\u001EJ\u00E4\u0001\u0010<\u001A\u00020\b2\b\b\u0002\u0010%\u001A\u00020$2\b\b\u0002\u0010&\u001A\u00020$2\b\b\u0002\u0010\'\u001A\u00020$2\b\b\u0002\u0010(\u001A\u00020$2\b\b\u0002\u0010)\u001A\u00020$2\b\b\u0002\u0010*\u001A\u00020$2\b\b\u0002\u0010+\u001A\u00020$2\b\b\u0002\u0010,\u001A\u00020$2\b\b\u0002\u0010-\u001A\u00020$2\b\b\u0002\u0010.\u001A\u00020$2\b\b\u0002\u0010/\u001A\u00020$2\b\b\u0002\u00100\u001A\u00020$2\b\b\u0002\u00101\u001A\u00020$2\b\b\u0002\u00102\u001A\u00020$2\b\b\u0002\u00103\u001A\u00020$2\b\b\u0002\u00104\u001A\u00020$2\b\b\u0002\u00105\u001A\u00020$2\b\b\u0002\u00106\u001A\u00020$2\b\b\u0002\u00107\u001A\u00020$2\b\b\u0002\u00108\u001A\u00020$2\b\b\u0002\u00109\u001A\u00020$H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010;J\u00E4\u0001\u0010B\u001A\u00020\b2\b\b\u0002\u0010%\u001A\u00020$2\b\b\u0002\u0010&\u001A\u00020$2\b\b\u0002\u0010\'\u001A\u00020$2\b\b\u0002\u0010(\u001A\u00020$2\b\b\u0002\u0010)\u001A\u00020$2\b\b\u0002\u0010=\u001A\u00020$2\b\b\u0002\u0010>\u001A\u00020$2\b\b\u0002\u0010?\u001A\u00020$2\b\b\u0002\u0010@\u001A\u00020$2\b\b\u0002\u0010.\u001A\u00020$2\b\b\u0002\u0010/\u001A\u00020$2\b\b\u0002\u00100\u001A\u00020$2\b\b\u0002\u00101\u001A\u00020$2\b\b\u0002\u00102\u001A\u00020$2\b\b\u0002\u00103\u001A\u00020$2\b\b\u0002\u00104\u001A\u00020$2\b\b\u0002\u00105\u001A\u00020$2\b\b\u0002\u00106\u001A\u00020$2\b\b\u0002\u00107\u001A\u00020$2\b\b\u0002\u00108\u001A\u00020$2\b\b\u0002\u00109\u001A\u00020$H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010;J\u00C4\u0001\u0010P\u001A\u00020\u00142\u0006\u0010D\u001A\u00020C2\u0011\u0010G\u001A\r\u0012\u0004\u0012\u00020\u00140E\u00A2\u0006\u0002\bF2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010H\u001A\u00020\u00032\u0006\u0010J\u001A\u00020I2\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0005\u001A\u00020\u00032\u0015\b\u0002\u0010K\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010O\u001A\u00020\u001CH\u0007\u00A2\u0006\u0004\bP\u0010QJ\u00D9\u0001\u0010S\u001A\u00020\u00142\u0006\u0010D\u001A\u00020C2\u0011\u0010G\u001A\r\u0012\u0004\u0012\u00020\u00140E\u00A2\u0006\u0002\bF2\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010H\u001A\u00020\u00032\u0006\u0010J\u001A\u00020I2\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0005\u001A\u00020\u00032\u0015\b\u0002\u0010K\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001A\u000F\u0012\u0004\u0012\u00020\u0014\u0018\u00010E\u00A2\u0006\u0002\bF2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010O\u001A\u00020\u001C2\u0013\b\u0002\u0010R\u001A\r\u0012\u0004\u0012\u00020\u00140E\u00A2\u0006\u0002\bFH\u0007\u00A2\u0006\u0004\bS\u0010TR\u001D\u0010Y\u001A\u00020\n8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010XR\u001D\u0010\\\u001A\u00020\n8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bZ\u0010V\u001A\u0004\b[\u0010XR\u0014\u0010^\u001A\u00020]8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b^\u0010VR\u001D\u0010a\u001A\u00020\n8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b_\u0010V\u001A\u0004\b`\u0010XR\u001D\u0010d\u001A\u00020\n8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bb\u0010V\u001A\u0004\bc\u0010XR\u0014\u0010e\u001A\u00020]8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\be\u0010VR\u0014\u0010f\u001A\u00020]8\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\bf\u0010VR\u0011\u0010i\u001A\u00020\u00108G\u00A2\u0006\u0006\u001A\u0004\bg\u0010hR\u0011\u0010k\u001A\u00020\u00108G\u00A2\u0006\u0006\u001A\u0004\bj\u0010h\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006l"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "BorderBox", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "outlinedTextFieldColors", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "border", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "a", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "b", "getMinWidth-D9Ej5fM", "MinWidth", "", "IconOpacity", "c", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "d", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getOutlinedTextFieldShape", "OutlinedTextFieldShape", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n135#2:907\n74#3:908\n74#3:909\n154#4:910\n154#4:911\n154#4:912\n154#4:913\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n291#1:907\n396#1:908\n454#1:909\n214#1:910\n220#1:911\n249#1:912\n255#1:913\n*E\n"})
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    @NotNull
    public static final TextFieldDefaults INSTANCE = null;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        TextFieldDefaults.INSTANCE = new TextFieldDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        TextFieldDefaults.a = 56.0f;
        TextFieldDefaults.b = 280.0f;
        TextFieldDefaults.c = 1.0f;
        TextFieldDefaults.d = 2.0f;
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void BorderBox-nbWgWpA(boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @NotNull TextFieldColors textFieldColors0, @Nullable Shape shape0, float f, float f1, @Nullable Composer composer0, int v, int v1) {
        Shape shape2;
        float f4;
        float f3;
        float f6;
        float f5;
        Shape shape3;
        int v4;
        float f2;
        int v3;
        Shape shape1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x38408B26);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(interactionSource0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(textFieldColors0) ? 0x800 : 0x400);
        }
        if((v & 0xE000) == 0) {
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
        if((v & 0x70000) == 0) {
            if((v1 & 0x20) == 0) {
                f2 = f;
                v4 = composer1.changed(f2) ? 0x20000 : 0x10000;
            }
            else {
                f2 = f;
                v4 = 0x10000;
            }
            v2 |= v4;
        }
        else {
            f2 = f;
        }
        if((0x380000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(f1) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.changed(this) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 16) != 0) {
                    shape1 = this.getOutlinedTextFieldShape(composer1, v2 >> 21 & 14);
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                    f2 = TextFieldDefaults.d;
                }
                if((v1 & 0x40) == 0) {
                label_81:
                    shape3 = shape1;
                    f6 = f2;
                    f5 = f1;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    shape3 = shape1;
                    f5 = TextFieldDefaults.c;
                    f6 = f2;
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
                goto label_81;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x38408B26, v2, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:335)");
            }
            BorderStroke borderStroke0 = (BorderStroke)TextFieldDefaultsKt.access$animateBorderStrokeAsState-NuRrP5Q(z, z1, interactionSource0, textFieldColors0, f6, f5, composer1, v2 & 0x1FFE | 0xE000 & v2 >> 3 | v2 >> 3 & 0x70000).getValue();
            BoxKt.Box(BorderKt.border(Modifier.Companion, borderStroke0, shape3), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape3;
            f3 = f6;
            f4 = f5;
        }
        else {
            composer1.skipToGroupEnd();
            f3 = f2;
            f4 = f1;
            shape2 = shape1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new tg(this, z, z1, interactionSource0, textFieldColors0, shape2, f3, f4, v, v1, 1));
        }
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void OutlinedTextFieldDecorationBox(@NotNull String s, @NotNull Function2 function20, boolean z, boolean z1, @NotNull VisualTransformation visualTransformation0, @NotNull InteractionSource interactionSource0, boolean z2, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable TextFieldColors textFieldColors0, @Nullable PaddingValues paddingValues0, @Nullable Function2 function25, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function210;
        Function2 function29;
        PaddingValues paddingValues1;
        TextFieldColors textFieldColors1;
        Function2 function28;
        Function2 function27;
        Function2 function26;
        boolean z3;
        Function2 function215;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors2;
        Function2 function214;
        Function2 function213;
        Function2 function212;
        Function2 function211;
        boolean z4;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues3;
        TextFieldColors textFieldColors3;
        int v7;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-1280721485);
        if((v2 & 1) == 0) {
            v3 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        int v4 = 0x100;
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        int v6 = 0x2000;
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v3 |= (composer1.changed(visualTransformation0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v3 |= (composer1.changed(interactionSource0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v3 |= (composer1.changed(z2) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x70000000) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v7 = (v1 & 14) == 0 ? v1 | (composer1.changedInstance(function24) ? 4 : 2) : v1;
        }
        else {
            v7 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            v7 |= ((v2 & 0x800) != 0 || !composer1.changed(textFieldColors0) ? 16 : 0x20);
        }
        if((v1 & 0x380) == 0) {
            if((v2 & 0x1000) != 0 || !composer1.changed(paddingValues0)) {
                v4 = 0x80;
            }
            v7 |= v4;
        }
        int v8 = v7;
        if((v2 & 0x2000) != 0) {
            v8 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            if(composer1.changedInstance(function25)) {
                v5 = 0x800;
            }
            v8 |= v5;
        }
        if((v2 & 0x4000) != 0) {
            v8 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            if(composer1.changed(this)) {
                v6 = 0x4000;
            }
            v8 |= v6;
        }
        if((v3 & 0x5B6DB6DB) != 306783378 || (0xB6DB & v8) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                boolean z5 = (v2 & 0x40) == 0 ? z2 : false;
                Function2 function216 = null;
                Function2 function217 = (v2 & 0x200) == 0 ? function23 : null;
                if((v2 & 0x400) == 0) {
                    function216 = function24;
                }
                if((v2 & 0x800) == 0) {
                    textFieldColors3 = textFieldColors0;
                }
                else {
                    textFieldColors3 = this.outlinedTextFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, v8 >> 9 & 0x70, 0x1FFFFF);
                    v8 &= 0xFFFFFF8F;
                }
                if((v2 & 0x1000) == 0) {
                    paddingValues3 = paddingValues0;
                }
                else {
                    paddingValues3 = TextFieldDefaults.outlinedTextFieldPadding-a9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    v8 &= -897;
                }
                if((v2 & 0x2000) == 0) {
                    textFieldColors4 = textFieldColors3;
                    paddingValues2 = paddingValues3;
                    function215 = function25;
                    function213 = function217;
                }
                else {
                    textFieldColors4 = textFieldColors3;
                    paddingValues2 = paddingValues3;
                    function213 = function217;
                    function215 = ComposableLambdaKt.composableLambda(composer1, 0x4B37506D, true, new re(interactionSource0, textFieldColors3, z, z5));
                }
                function211 = (v2 & 0x80) == 0 ? function21 : null;
                function212 = (v2 & 0x100) == 0 ? function22 : null;
                z4 = z5;
                function214 = function216;
                textFieldColors2 = textFieldColors4;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x800) != 0) {
                    v8 &= 0xFFFFFF8F;
                }
                if((v2 & 0x1000) != 0) {
                    v8 &= -897;
                }
                z4 = z2;
                function211 = function21;
                function212 = function22;
                function213 = function23;
                function214 = function24;
                textFieldColors2 = textFieldColors0;
                paddingValues2 = paddingValues0;
                function215 = function25;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1280721485, v3, v8, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:669)");
            }
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, s, function20, visualTransformation0, function211, function212, function213, function214, z1, z, z4, interactionSource0, paddingValues2, textFieldColors2, function215, composer1, v3 << 3 & 0x380 | (v3 << 3 & 0x70 | 6) | v3 >> 3 & 0x1C00 | v3 >> 9 & 0xE000 | 0x70000 & v3 >> 9 | v3 >> 9 & 0x380000 | v8 << 21 & 0x1C00000 | v3 << 15 & 0xE000000 | v3 << 21 & 0x70000000, v3 >> 12 & 0x70 | v3 >> 18 & 14 | v8 & 0x380 | v8 << 6 & 0x1C00 | v8 << 3 & 0xE000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z4;
            function26 = function211;
            function210 = function212;
            function27 = function213;
            function28 = function214;
            textFieldColors1 = textFieldColors2;
            paddingValues1 = paddingValues2;
            function29 = function215;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z2;
            function26 = function21;
            function27 = function23;
            function28 = function24;
            textFieldColors1 = textFieldColors0;
            paddingValues1 = paddingValues0;
            function29 = function25;
            function210 = function22;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bb(this, s, function20, z, z1, visualTransformation0, interactionSource0, z3, function26, function210, function27, function28, textFieldColors1, paddingValues1, function29, v, v1, v2));
        }
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void TextFieldDecorationBox(@NotNull String s, @NotNull Function2 function20, boolean z, boolean z1, @NotNull VisualTransformation visualTransformation0, @NotNull InteractionSource interactionSource0, boolean z2, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, @Nullable TextFieldColors textFieldColors0, @Nullable PaddingValues paddingValues0, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function29;
        Function2 function28;
        PaddingValues paddingValues1;
        TextFieldColors textFieldColors1;
        Function2 function27;
        Function2 function26;
        boolean z3;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors2;
        Function2 function212;
        Function2 function211;
        Function2 function210;
        boolean z4;
        int v5;
        Function2 function25;
        int v3;
        Composer composer1 = composer0.startRestartGroup(1171040065);
        if((v2 & 1) == 0) {
            v3 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        int v4 = 0x400;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v3 |= (composer1.changed(visualTransformation0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v3 |= (composer1.changed(interactionSource0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v3 |= (composer1.changed(z2) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) == 0) {
            function25 = function21;
            if((v & 0x1C00000) == 0) {
                v3 |= (composer1.changedInstance(function25) ? 0x800000 : 0x400000);
            }
        }
        else {
            v3 |= 0xC00000;
            function25 = function21;
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x70000000) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v5 = (v1 & 14) == 0 ? v1 | (composer1.changedInstance(function24) ? 4 : 2) : v1;
        }
        else {
            v5 = v1 | 6;
        }
        if((v1 & 0x70) == 0) {
            v5 |= ((v2 & 0x800) != 0 || !composer1.changed(textFieldColors0) ? 16 : 0x20);
        }
        if((v1 & 0x380) == 0) {
            v5 |= ((v2 & 0x1000) != 0 || !composer1.changed(paddingValues0) ? 0x80 : 0x100);
        }
        int v6 = v5;
        if((v2 & 0x2000) != 0) {
            v6 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            if(composer1.changed(this)) {
                v4 = 0x800;
            }
            v6 |= v4;
        }
        if((v3 & 0x5B6DB6DB) != 306783378 || (v6 & 5851) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                z4 = (v2 & 0x40) == 0 ? z2 : false;
                function212 = null;
                if((v2 & 0x80) != 0) {
                    function25 = null;
                }
                function210 = (v2 & 0x100) == 0 ? function22 : null;
                function211 = (v2 & 0x200) == 0 ? function23 : null;
                if((v2 & 0x400) == 0) {
                    function212 = function24;
                }
                if((v2 & 0x800) == 0) {
                    textFieldColors2 = textFieldColors0;
                }
                else {
                    textFieldColors2 = this.textFieldColors-dx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer1, 0, 0, v6 >> 6 & 0x70, 0x1FFFFF);
                    v6 &= 0xFFFFFF8F;
                }
                if((v2 & 0x1000) == 0) {
                    paddingValues2 = paddingValues0;
                }
                else {
                    paddingValues2 = function25 == null ? TextFieldDefaults.textFieldWithoutLabelPadding-a9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : TextFieldDefaults.textFieldWithLabelPadding-a9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    v6 &= -897;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x800) != 0) {
                    v6 &= 0xFFFFFF8F;
                }
                if((v2 & 0x1000) != 0) {
                    v6 &= -897;
                }
                z4 = z2;
                function210 = function22;
                function211 = function23;
                function212 = function24;
                textFieldColors2 = textFieldColors0;
                paddingValues2 = paddingValues0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1171040065, v3, v6, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:579)");
            }
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, s, function20, visualTransformation0, function25, function210, function211, function212, z1, z, z4, interactionSource0, paddingValues2, textFieldColors2, null, composer1, v3 << 3 & 0x380 | (v3 << 3 & 0x70 | 6) | v3 >> 3 & 0x1C00 | v3 >> 9 & 0xE000 | v3 >> 9 & 0x70000 | v3 >> 9 & 0x380000 | v6 << 21 & 0x1C00000 | v3 << 15 & 0xE000000 | v3 << 21 & 0x70000000, v3 >> 12 & 0x70 | v3 >> 18 & 14 | v6 & 0x380 | v6 << 6 & 0x1C00, 0x4000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textFieldColors1 = textFieldColors2;
            z3 = z4;
            function27 = function212;
            function28 = function25;
            paddingValues1 = paddingValues2;
            function26 = function211;
            function29 = function210;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z2;
            function26 = function23;
            function27 = function24;
            textFieldColors1 = textFieldColors0;
            paddingValues1 = paddingValues0;
            function28 = function25;
            function29 = function22;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new cb(this, s, function20, z, z1, visualTransformation0, interactionSource0, z3, function28, function29, function26, function27, textFieldColors1, paddingValues1, v, v1, v2));
        }
    }

    public final float getFocusedBorderThickness-D9Ej5fM() {
        return TextFieldDefaults.d;
    }

    public final float getMinHeight-D9Ej5fM() [...] // 潜在的解密器

    public final float getMinWidth-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getOutlinedTextFieldShape")
    @NotNull
    public final Shape getOutlinedTextFieldShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, v, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:242)");
        }
        Shape shape0 = MaterialTheme.INSTANCE.getShapes(composer0, 6).getSmall();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getTextFieldShape")
    @NotNull
    public final Shape getTextFieldShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBD68E2F8, v, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:233)");
        }
        Shape shape0 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer0, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    public final float getUnfocusedBorderThickness-D9Ej5fM() {
        return TextFieldDefaults.c;
    }

    // 去混淆评级： 低(30)
    @ExperimentalMaterialApi
    @NotNull
    public final Modifier indicatorLine-gv0btCI(@NotNull Modifier modifier0, boolean z, boolean z1, @NotNull InteractionSource interactionSource0, @NotNull TextFieldColors textFieldColors0, float f, float f1) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new db(z, z1, interactionSource0, textFieldColors0, f, f1));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n1#1,170:1\n292#2,8:171\n*E\n"})
        public final class androidx.compose.material.TextFieldDefaults.indicatorLine-gv0btCI..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final float A;
            public final float B;
            public final boolean w;
            public final boolean x;
            public final InteractionSource y;
            public final TextFieldColors z;

            public androidx.compose.material.TextFieldDefaults.indicatorLine-gv0btCI..inlined.debugInspectorInfo.1(boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, float f, float f1) {
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

    @Composable
    @NotNull
    public final TextFieldColors outlinedTextFieldColors-dx8h9Zs(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, @Nullable Composer composer0, int v21, int v22, int v23, int v24) {
        composer0.startReplaceableGroup(0x69102B35);
        long v25 = (v24 & 1) == 0 ? v : Color.copy-wmQWz5c$default(((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Number)composer0.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        long v26 = (v24 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(v25, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v27 = (v24 & 8) == 0 ? v3 : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v28 = (v24 & 16) == 0 ? v4 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v29 = (v24 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v30 = (v24 & 0x40) == 0 ? v6 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v31 = (v24 & 0x80) == 0 ? v7 : Color.copy-wmQWz5c$default(v30, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v32 = (v24 & 0x100) == 0 ? v8 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v33 = (v24 & 0x200) == 0 ? v9 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v34 = (v24 & 0x400) == 0 ? v10 : Color.copy-wmQWz5c$default(v33, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v35 = (v24 & 0x1000) == 0 ? v12 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v36 = (v24 & 0x2000) == 0 ? v13 : Color.copy-wmQWz5c$default(v35, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v37 = (v24 & 0x4000) == 0 ? v14 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v38 = (0x8000 & v24) == 0 ? v15 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v39 = (0x10000 & v24) == 0 ? v16 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v40 = (0x20000 & v24) == 0 ? v17 : Color.copy-wmQWz5c$default(v39, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v41 = (0x40000 & v24) == 0 ? v18 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v42 = (0x80000 & v24) == 0 ? v19 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v43 = (v24 & 0x100000) == 0 ? v20 : Color.copy-wmQWz5c$default(v42, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x69102B35, v21, v22, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:480)");
        }
        TextFieldColors textFieldColors0 = new j3(v25, v26, v27, v28, v29, v30, v32, v31, v33, v34, ((v24 & 0x800) == 0 ? v11 : v33), v35, v36, v37, ((v24 & 4) == 0 ? v2 : 0L), v38, v39, v40, v41, v42, v43);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return textFieldColors0;
    }

    @ExperimentalMaterialApi
    @NotNull
    public final PaddingValues outlinedTextFieldPadding-a9UjIt4(float f, float f1, float f2, float f3) {
        return PaddingKt.PaddingValues-a9UjIt4(f, f1, f2, f3);
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

    @Composable
    @NotNull
    public final TextFieldColors textFieldColors-dx8h9Zs(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, @Nullable Composer composer0, int v21, int v22, int v23, int v24) {
        composer0.startReplaceableGroup(0xDD26677);
        long v25 = (v24 & 1) == 0 ? v : Color.copy-wmQWz5c$default(((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Number)composer0.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        long v26 = (v24 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(v25, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v27 = (v24 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        long v28 = (v24 & 8) == 0 ? v3 : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v29 = (v24 & 16) == 0 ? v4 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v30 = (v24 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v31 = (v24 & 0x40) == 0 ? v6 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null);
        long v32 = (v24 & 0x80) == 0 ? v7 : Color.copy-wmQWz5c$default(v31, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v33 = (v24 & 0x100) == 0 ? v8 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v34 = (v24 & 0x200) == 0 ? v9 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v35 = (v24 & 0x400) == 0 ? v10 : Color.copy-wmQWz5c$default(v34, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v36 = (v24 & 0x1000) == 0 ? v12 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v37 = (v24 & 0x2000) == 0 ? v13 : Color.copy-wmQWz5c$default(v36, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v38 = (v24 & 0x4000) == 0 ? v14 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v39 = (0x8000 & v24) == 0 ? v15 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v40 = (0x10000 & v24) == 0 ? v16 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v41 = (0x20000 & v24) == 0 ? v17 : Color.copy-wmQWz5c$default(v40, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v42 = (0x40000 & v24) == 0 ? v18 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v43 = (0x80000 & v24) == 0 ? v19 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v44 = (v24 & 0x100000) == 0 ? v20 : Color.copy-wmQWz5c$default(v43, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDD26677, v21, v22, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        }
        TextFieldColors textFieldColors0 = new j3(v25, v26, v28, v29, v30, v31, v33, v32, v34, v35, ((v24 & 0x800) == 0 ? v11 : v34), v36, v37, v38, v27, v39, v40, v41, v42, v43, v44);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return textFieldColors0;
    }

    @ExperimentalMaterialApi
    @NotNull
    public final PaddingValues textFieldWithLabelPadding-a9UjIt4(float f, float f1, float f2, float f3) {
        return PaddingKt.PaddingValues-a9UjIt4(f, f2, f1, f3);
    }

    public static PaddingValues textFieldWithLabelPadding-a9UjIt4$default(TextFieldDefaults textFieldDefaults0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = 16.0f;
        }
        if((v & 2) != 0) {
            f1 = 16.0f;
        }
        if((v & 4) != 0) {
            f2 = 20.0f;
        }
        if((v & 8) != 0) {
            f3 = 10.0f;
        }
        return textFieldDefaults0.textFieldWithLabelPadding-a9UjIt4(f, f1, f2, f3);
    }

    @ExperimentalMaterialApi
    @NotNull
    public final PaddingValues textFieldWithoutLabelPadding-a9UjIt4(float f, float f1, float f2, float f3) {
        return PaddingKt.PaddingValues-a9UjIt4(f, f1, f2, f3);
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

