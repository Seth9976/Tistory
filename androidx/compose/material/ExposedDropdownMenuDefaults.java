package androidx.compose.material;

import androidx.compose.material3.o9;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.e4;
import p0.f4;
import p0.k3;
import p0.r;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\b\u00C7\u0002\u0018\u00002\u00020\u0001J\'\u0010\u0007\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00A2\u0006\u0004\b\u0007\u0010\bJ\u00EE\u0001\u0010#\u001A\u00020 2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\t2\b\b\u0002\u0010\u0010\u001A\u00020\t2\b\b\u0002\u0010\u0011\u001A\u00020\t2\b\b\u0002\u0010\u0012\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\t2\b\b\u0002\u0010\u0017\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"J\u00EE\u0001\u0010)\u001A\u00020 2\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t2\b\b\u0002\u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\t2\b\b\u0002\u0010&\u001A\u00020\t2\b\b\u0002\u0010\'\u001A\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\t2\b\b\u0002\u0010\u0014\u001A\u00020\t2\b\b\u0002\u0010\u0015\u001A\u00020\t2\b\b\u0002\u0010\u0016\u001A\u00020\t2\b\b\u0002\u0010\u0017\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\t2\b\b\u0002\u0010\u001A\u001A\u00020\t2\b\b\u0002\u0010\u001B\u001A\u00020\t2\b\b\u0002\u0010\u001C\u001A\u00020\t2\b\b\u0002\u0010\u001D\u001A\u00020\t2\b\b\u0002\u0010\u001E\u001A\u00020\t2\b\b\u0002\u0010\u001F\u001A\u00020\tH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010\"\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006*"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "", "expanded", "Lkotlin/Function0;", "", "onIconClick", "TrailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "Landroidx/compose/material/TextFieldColors;", "textFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-DlUQjxs", "outlinedTextFieldColors", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,740:1\n74#2:741\n74#2:742\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n359#1:741\n462#1:742\n*E\n"})
public final class ExposedDropdownMenuDefaults {
    public static final int $stable;
    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE;

    static {
        ExposedDropdownMenuDefaults.INSTANCE = new ExposedDropdownMenuDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @ExperimentalMaterialApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void TrailingIcon(boolean z, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(1752693020);
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
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                function00 = e4.w;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1752693020, v2, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:294)");
            }
            IconButtonKt.IconButton(function00, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, r.G), false, null, ComposableLambdaKt.composableLambda(composer1, 0xD6EC7CB8, true, new f4(z)), composer1, v2 >> 3 & 14 | 0x6000, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o9(this, z, function00, v, v1, 3));
        }
    }

    @Composable
    @NotNull
    public final TextFieldColors outlinedTextFieldColors-DlUQjxs(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, @Nullable Composer composer0, int v22, int v23, int v24, int v25) {
        composer0.startReplaceableGroup(0x6DC525FD);
        long v26 = (v25 & 1) == 0 ? v : Color.copy-wmQWz5c$default(((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Number)composer0.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        long v27 = (v25 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(v26, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v28 = (v25 & 8) == 0 ? v3 : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v29 = (v25 & 16) == 0 ? v4 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v30 = (v25 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v31 = (v25 & 0x40) == 0 ? v6 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v32 = (v25 & 0x80) == 0 ? v7 : Color.copy-wmQWz5c$default(v31, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v33 = (v25 & 0x100) == 0 ? v8 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v34 = (v25 & 0x200) == 0 ? v9 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v35 = (v25 & 0x400) == 0 ? v10 : Color.copy-wmQWz5c$default(v34, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v36 = (v25 & 0x1000) == 0 ? v12 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v37 = (v25 & 0x2000) == 0 ? v13 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v38 = (v25 & 0x4000) == 0 ? v14 : Color.copy-wmQWz5c$default(v36, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v39 = (0x8000 & v25) == 0 ? v15 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v40 = (0x10000 & v25) == 0 ? v16 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v41 = (0x20000 & v25) == 0 ? v17 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v42 = (0x40000 & v25) == 0 ? v18 : Color.copy-wmQWz5c$default(v41, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v43 = (0x80000 & v25) == 0 ? v19 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v44 = (0x100000 & v25) == 0 ? v20 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v45 = (v25 & 0x200000) == 0 ? v21 : Color.copy-wmQWz5c$default(v44, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6DC525FD, v22, v23, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:490)");
        }
        TextFieldColors textFieldColors0 = new k3(v26, v27, v28, v29, v30, v31, v33, v32, v34, v35, ((v25 & 0x800) == 0 ? v11 : v34), v36, v37, v38, v39, ((v25 & 4) == 0 ? v2 : 0L), v40, v41, v42, v43, v44, v45);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return textFieldColors0;
    }

    @Composable
    @NotNull
    public final TextFieldColors textFieldColors-DlUQjxs(long v, long v1, long v2, long v3, long v4, long v5, long v6, long v7, long v8, long v9, long v10, long v11, long v12, long v13, long v14, long v15, long v16, long v17, long v18, long v19, long v20, long v21, @Nullable Composer composer0, int v22, int v23, int v24, int v25) {
        composer0.startReplaceableGroup(0x39C9F2BF);
        long v26 = (v25 & 1) == 0 ? v : Color.copy-wmQWz5c$default(((Color)composer0.consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Number)composer0.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        long v27 = (v25 & 2) == 0 ? v1 : Color.copy-wmQWz5c$default(v26, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v28 = (v25 & 4) == 0 ? v2 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        long v29 = (v25 & 8) == 0 ? v3 : MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU();
        long v30 = (v25 & 16) == 0 ? v4 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v31 = (v25 & 0x20) == 0 ? v5 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v32 = (v25 & 0x40) == 0 ? v6 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null);
        long v33 = (v25 & 0x80) == 0 ? v7 : Color.copy-wmQWz5c$default(v32, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v34 = (v25 & 0x100) == 0 ? v8 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v35 = (v25 & 0x200) == 0 ? v9 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v36 = (v25 & 0x400) == 0 ? v10 : Color.copy-wmQWz5c$default(v35, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v37 = (v25 & 0x1000) == 0 ? v12 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
        long v38 = (v25 & 0x2000) == 0 ? v13 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v39 = (v25 & 0x4000) == 0 ? v14 : Color.copy-wmQWz5c$default(v37, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v40 = (0x8000 & v25) == 0 ? v15 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v41 = (0x10000 & v25) == 0 ? v16 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getPrimary-0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v42 = (0x20000 & v25) == 0 ? v17 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v43 = (0x40000 & v25) == 0 ? v18 : Color.copy-wmQWz5c$default(v42, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v44 = (0x80000 & v25) == 0 ? v19 : MaterialTheme.INSTANCE.getColors(composer0, 6).getError-0d7_KjU();
        long v45 = (0x100000 & v25) == 0 ? v20 : Color.copy-wmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer0, 6).getOnSurface-0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        long v46 = (v25 & 0x200000) == 0 ? v21 : Color.copy-wmQWz5c$default(v45, ContentAlpha.INSTANCE.getDisabled(composer0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x39C9F2BF, v22, v23, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:390)");
        }
        TextFieldColors textFieldColors0 = new k3(v26, v27, v29, v30, v31, v32, v34, v33, v35, v36, ((v25 & 0x800) == 0 ? v11 : v35), v37, v38, v39, v40, v28, v41, v42, v43, v44, v45, v46);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return textFieldColors0;
    }
}

