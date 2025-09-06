package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.m;
import androidx.compose.material3.mb;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.bb;
import p0.ib;
import p0.jb;
import p0.kb;
import p0.s4;
import p0.vb;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001A\u00E1\u0001\u0010\u0019\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0011\u0010\u0007\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u00062\u0006\u0010\t\u001A\u00020\b2\u0013\u0010\n\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000B\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u00062\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u00162\u0015\b\u0002\u0010\u0018\u001A\u000F\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u00A2\u0006\u0002\b\u0006H\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001AT\u0010&\u001A\u00020\u00052\u0006\u0010\u001C\u001A\u00020\u001B2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001D2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001F2 \u0010#\u001A\u001C\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u0006\u00A2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000H\u0001\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%\u001A#\u0010)\u001A\u00020\'*\u00020\'2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010(\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b)\u0010*\u001A\u0019\u0010.\u001A\u00020-2\b\u0010,\u001A\u0004\u0018\u00010+H\u0000\u00A2\u0006\u0004\b.\u0010/\u001A\u0019\u00100\u001A\u00020-2\b\u0010,\u001A\u0004\u0018\u00010+H\u0000\u00A2\u0006\u0004\b0\u0010/\"\u0014\u00101\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00103\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b3\u00102\"\u0014\u00104\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b4\u00102\"\u0014\u00105\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b5\u00102\"\u0014\u00106\u001A\u00020\u00028\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b6\u00102\"\u001A\u0010<\u001A\u0002078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;\"\u0014\u0010=\u001A\u00020-8\u0000X\u0080T\u00A2\u0006\u0006\n\u0004\b=\u0010>\"\u001A\u0010D\u001A\u00020?8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010C\"\u001A\u0010G\u001A\u00020?8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bE\u0010A\u001A\u0004\bF\u0010C\"\u001A\u0010L\u001A\u00020\'8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010K\"\u001A\u0010Q\u001A\u0004\u0018\u00010N*\u00020M8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006R"}, d2 = {"Landroidx/compose/material/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material/TextFieldColors;", "colors", "border", "CommonDecorationBox", "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "", "contentAlpha", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "content", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "defaultErrorSemantics", "(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "(Landroidx/compose/ui/layout/Placeable;)I", "heightOrZero", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "Landroidx/compose/ui/unit/Constraints;", "a", "J", "getZeroConstraints", "()J", "ZeroConstraints", "AnimationDuration", "I", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getTextFieldPadding", "()F", "TextFieldPadding", "c", "getHorizontalIconPadding", "HorizontalIconPadding", "d", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,369:1\n50#2:370\n49#2:371\n1116#3,6:372\n658#4:378\n646#4:379\n658#4:380\n646#4:381\n154#5:382\n154#5:383\n154#5:384\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n80#1:370\n80#1:371\n80#1:372,6\n111#1:378\n111#1:379\n114#1:380\n114#1:381\n365#1:382\n366#1:383\n368#1:384\n*E\n"})
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    @NotNull
    public static final String LabelId = "Label";
    @NotNull
    public static final String LeadingId = "Leading";
    @NotNull
    public static final String PlaceholderId = "Hint";
    @NotNull
    public static final String TextFieldId = "TextField";
    @NotNull
    public static final String TrailingId = "Trailing";
    public static final long a;
    public static final float b;
    public static final float c;
    public static final Modifier d;

    static {
        TextFieldImplKt.a = ConstraintsKt.Constraints(0, 0, 0, 0);
        TextFieldImplKt.b = 16.0f;
        TextFieldImplKt.c = 12.0f;
        TextFieldImplKt.d = SizeKt.defaultMinSize-VpY3zN4(Modifier.Companion, 48.0f, 48.0f);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CommonDecorationBox(@NotNull TextFieldType textFieldType0, @NotNull String s, @NotNull Function2 function20, @NotNull VisualTransformation visualTransformation0, @Nullable Function2 function21, @Nullable Function2 function22, @Nullable Function2 function23, @Nullable Function2 function24, boolean z, boolean z1, boolean z2, @NotNull InteractionSource interactionSource0, @NotNull PaddingValues paddingValues0, @NotNull TextFieldColors textFieldColors0, @Nullable Function2 function25, @Nullable Composer composer0, int v, int v1, int v2) {
        Function2 function29;
        boolean z5;
        boolean z4;
        boolean z3;
        Function2 function28;
        Function2 function27;
        Function2 function26;
        s4 s41;
        s4 s40;
        int v8;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xD58712FB);
        if((v2 & 1) == 0) {
            v3 = (v & 14) == 0 ? (composer1.changed(textFieldType0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        int v4 = 16;
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        int v5 = 0x100;
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        int v6 = 0x800;
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v3 |= (composer1.changed(visualTransformation0) ? 0x800 : 0x400);
        }
        int v7 = 0x4000;
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v3 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v3 |= (composer1.changedInstance(function22) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v3 |= (composer1.changedInstance(function23) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v3 |= (composer1.changedInstance(function24) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v3 |= (composer1.changed(z) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x70000000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v8 = (v1 & 14) == 0 ? v1 | (composer1.changed(z2) ? 4 : 2) : v1;
        }
        else {
            v8 = v1 | 6;
        }
        if((v2 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            if(composer1.changed(interactionSource0)) {
                v4 = 0x20;
            }
            v8 |= v4;
        }
        int v9 = v8;
        if((v2 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            if(!composer1.changed(paddingValues0)) {
                v5 = 0x80;
            }
            v9 |= v5;
        }
        if((v2 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            if(!composer1.changed(textFieldColors0)) {
                v6 = 0x400;
            }
            v9 |= v6;
        }
        if((v2 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            if(!composer1.changedInstance(function25)) {
                v7 = 0x2000;
            }
            v9 |= v7;
        }
        if((v3 & 0x5B6DB6DB) != 306783378 || (0xB6DB & v9) != 9362 || !composer1.getSkipping()) {
            Function2 function210 = (v2 & 0x20) == 0 ? function22 : null;
            Function2 function211 = (v2 & 0x40) == 0 ? function23 : null;
            Function2 function212 = (v2 & 0x80) == 0 ? function24 : null;
            boolean z6 = (v2 & 0x100) == 0 ? z : false;
            boolean z7 = (v2 & 0x200) == 0 ? z1 : true;
            boolean z8 = (v2 & 0x400) == 0 ? z2 : false;
            Function2 function213 = (v2 & 0x4000) == 0 ? function25 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD58712FB, v3, v9, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            composer1.startReplaceableGroup(0x1E7B2B64);
            boolean z9 = composer1.changed(s);
            boolean z10 = composer1.changed(visualTransformation0);
            TransformedText transformedText0 = composer1.rememberedValue();
            if(z9 || z10 || transformedText0 == Composer.Companion.getEmpty()) {
                transformedText0 = visualTransformation0.filter(new AnnotatedString(s, null, null, 6, null));
                composer1.updateRememberedValue(transformedText0);
            }
            composer1.endReplaceableGroup();
            String s1 = transformedText0.getText().getText();
            if(((Boolean)FocusInteractionKt.collectIsFocusedAsState(interactionSource0, composer1, v9 >> 3 & 14).getValue()).booleanValue()) {
                s40 = s4.a;
            }
            else {
                s40 = s1.length() == 0 ? s4.b : s4.c;
            }
            jb jb0 = new jb(interactionSource0, textFieldColors0, z7, z8);
            Typography typography0 = MaterialTheme.INSTANCE.getTypography(composer1, 6);
            TextStyle textStyle0 = typography0.getSubtitle1();
            TextStyle textStyle1 = typography0.getCaption();
            long v10 = textStyle0.getColor-0d7_KjU();
            MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
            boolean z11 = Color.equals-impl0(v10, 0L) && !Color.equals-impl0(textStyle1.getColor-0d7_KjU(), 0L) || !Color.equals-impl0(textStyle0.getColor-0d7_KjU(), 0L) && Color.equals-impl0(textStyle1.getColor-0d7_KjU(), 0L);
            vb vb0 = vb.a;
            composer1.startReplaceableGroup(2129140935);
            long v11 = materialTheme0.getTypography(composer1, 6).getCaption().getColor-0d7_KjU();
            if(!z11 || v11 != 0L) {
                s41 = s40;
            }
            else {
                s41 = s40;
                v11 = ((Color)jb0.invoke(s41, composer1, 0)).unbox-impl();
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x7EE81D86);
            long v12 = materialTheme0.getTypography(composer1, 6).getSubtitle1().getColor-0d7_KjU();
            if(z11 && v12 == 0L) {
                v12 = ((Color)jb0.invoke(s41, composer1, 0)).unbox-impl();
            }
            composer1.endReplaceableGroup();
            vb0.a(s41, v11, v12, jb0, function21 != null, ComposableLambdaKt.composableLambda(composer1, 0x146073D8, true, new ib(function21, function210, s1, textFieldColors0, z7, z8, interactionSource0, function211, function212, textFieldType0, function20, z6, paddingValues0, z11, function213)), composer1, 0x1B0000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function26 = function210;
            function27 = function211;
            function28 = function212;
            z3 = z6;
            function29 = function213;
            z4 = z7;
            z5 = z8;
        }
        else {
            composer1.skipToGroupEnd();
            function26 = function22;
            function27 = function23;
            function28 = function24;
            z3 = z;
            z4 = z1;
            z5 = z2;
            function29 = function25;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bb(textFieldType0, s, function20, visualTransformation0, function21, function26, function27, function28, z3, z4, z5, interactionSource0, paddingValues0, textFieldColors0, function29, v, v1, v2));
        }
    }

    @Composable
    @ComposableOpenTarget(index = 0)
    public static final void Decoration-euL9pac(long v, @Nullable TextStyle textStyle0, @Nullable Float float0, @NotNull Function2 function20, @Nullable Composer composer0, int v1, int v2) {
        Float float1;
        TextStyle textStyle1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xE8303724);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            textStyle1 = textStyle0;
        }
        else if((v1 & 0x70) == 0) {
            textStyle1 = textStyle0;
            v3 |= (composer1.changed(textStyle0) ? 0x20 : 16);
        }
        else {
            textStyle1 = textStyle0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            float1 = float0;
        }
        else if((v1 & 0x380) == 0) {
            float1 = float0;
            v3 |= (composer1.changed(float1) ? 0x100 : 0x80);
        }
        else {
            float1 = float0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if((v2 & 2) != 0) {
                textStyle1 = null;
            }
            if((v2 & 4) != 0) {
                float1 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE8303724, v3, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:223)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambda(composer1, 494684590, true, new kb(v, float1, function20));
            if(textStyle1 == null) {
                composer1.startReplaceableGroup(-2009953371);
                composableLambda0.invoke(composer1, 6);
            }
            else {
                composer1.startReplaceableGroup(-2009953423);
                TextKt.ProvideTextStyle(textStyle1, composableLambda0, composer1, v3 >> 3 & 14 | 0x30);
            }
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
            scopeUpdateScope0.updateScope(new mb(v, textStyle1, float1, function20, v1, v2));
        }
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final Modifier defaultErrorSemantics(@NotNull Modifier modifier0, boolean z, @NotNull String s) {
        return z ? SemanticsModifierKt.semantics$default(modifier0, false, new m(s, 17), 1, null) : modifier0;
    }

    public static final float getHorizontalIconPadding() [...] // 潜在的解密器

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return TextFieldImplKt.d;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable0) {
        Object object0 = intrinsicMeasurable0.getParentData();
        LayoutIdParentData layoutIdParentData0 = object0 instanceof LayoutIdParentData ? ((LayoutIdParentData)object0) : null;
        return layoutIdParentData0 == null ? null : layoutIdParentData0.getLayoutId();
    }

    public static final float getTextFieldPadding() [...] // 潜在的解密器

    public static final long getZeroConstraints() [...] // 潜在的解密器

    public static final int heightOrZero(@Nullable Placeable placeable0) {
        return placeable0 == null ? 0 : placeable0.getHeight();
    }

    public static final int widthOrZero(@Nullable Placeable placeable0) {
        return placeable0 == null ? 0 : placeable0.getWidth();
    }
}

