package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001JD\u0010\u000E\u001A\u00020\u000B2\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001D\u0010\u0013\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0016\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001A\u0004\b\u0015\u0010\u0012R\u001D\u0010\u0019\u001A\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001A\u0004\b\u0018\u0010\u0012R\u0011\u0010\u001C\u001A\u00020\u00078G¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u0011\u0010\u001E\u001A\u00020\u00078G¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001BR\u0017\u0010!\u001A\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0017\u0010#\u001A\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\"\u0010 R\u0011\u0010\'\u001A\u00020$8G¢\u0006\u0006\u001A\u0004\b%\u0010&\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "width", "height", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "", "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "DragHandle", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "b", "getSheetPeekHeight-D9Ej5fM", "SheetPeekHeight", "c", "getSheetMaxWidth-D9Ej5fM", "SheetMaxWidth", "getHiddenShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getExpandedShape", "ExpandedShape", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "ContainerColor", "getScrimColor", "ScrimColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n180#2:437\n1223#3,6:438\n148#4:444\n148#4:445\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n*L\n328#1:437\n331#1:438,6\n310#1:444\n313#1:445\n*E\n"})
public final class BottomSheetDefaults {
    public static final int $stable;
    @NotNull
    public static final BottomSheetDefaults INSTANCE;
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        BottomSheetDefaults.INSTANCE = new BottomSheetDefaults();  // 初始化器: Ljava/lang/Object;-><init>()V
        BottomSheetDefaults.a = SheetBottomTokens.INSTANCE.getDockedModalContainerElevation-D9Ej5fM();
        BottomSheetDefaults.b = 56.0f;
        BottomSheetDefaults.c = 640.0f;
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void DragHandle-lgZ2HuY(@Nullable Modifier modifier0, float f, float f1, @Nullable Shape shape0, long v, @Nullable Composer composer0, int v1, int v2) {
        long v5;
        float f5;
        float f4;
        Modifier modifier2;
        Shape shape2;
        float f7;
        float f6;
        Modifier modifier3;
        long v6;
        int v4;
        Shape shape1;
        float f3;
        float f2;
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xAEAEC815);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            modifier1 = modifier0;
        }
        else if((v1 & 6) == 0) {
            modifier1 = modifier0;
            v3 = (composer1.changed(modifier1) ? 4 : 2) | v1;
        }
        else {
            modifier1 = modifier0;
            v3 = v1;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            f2 = f;
        }
        else if((v1 & 0x30) == 0) {
            f2 = f;
            v3 |= (composer1.changed(f2) ? 0x20 : 16);
        }
        else {
            f2 = f;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            f3 = f1;
        }
        else if((v1 & 0x180) == 0) {
            f3 = f1;
            v3 |= (composer1.changed(f3) ? 0x100 : 0x80);
        }
        else {
            f3 = f1;
        }
        if((v1 & 0xC00) == 0) {
            if((v2 & 8) == 0) {
                shape1 = shape0;
                v4 = composer1.changed(shape1) ? 0x800 : 0x400;
            }
            else {
                shape1 = shape0;
                v4 = 0x400;
            }
            v3 |= v4;
        }
        else {
            shape1 = shape0;
        }
        if((v1 & 0x6000) == 0) {
            v3 |= ((v2 & 16) != 0 || !composer1.changed(v) ? 0x2000 : 0x4000);
        }
        if((v3 & 9363) != 9362 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v2 & 1) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v2 & 2) != 0) {
                    f2 = 0.0f;
                }
                if((v2 & 4) != 0) {
                    f3 = 0.0f;
                }
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                    shape1 = MaterialTheme.INSTANCE.getShapes(composer1, 6).getExtraLarge();
                }
                if((v2 & 16) == 0) {
                label_76:
                    modifier3 = modifier1;
                    f6 = f2;
                    f7 = f3;
                    shape2 = shape1;
                    v6 = v;
                }
                else {
                    v3 &= 0xFFFF1FFF;
                    v6 = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composer1, 6);
                    modifier3 = modifier1;
                    f6 = f2;
                    f7 = f3;
                    shape2 = shape1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 8) != 0) {
                    v3 &= 0xFFFFE3FF;
                }
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
                goto label_76;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAEAEC815, v3, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:326)");
            }
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_drag_handle_description, composer1, 0);
            Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(modifier3, 0.0f, 22.0f, 1, null);
            boolean z = composer1.changed(s);
            m m0 = composer1.rememberedValue();
            if(z || m0 == Composer.Companion.getEmpty()) {
                m0 = new m(s, 1);
                composer1.updateRememberedValue(m0);
            }
            SurfaceKt.Surface-T9BRK9s(SemanticsModifierKt.semantics$default(modifier4, false, m0, 1, null), shape2, v6, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(0xC2095FB0, true, new o1(f6, f7), composer1, 54), composer1, v3 >> 6 & 0x70 | 0xC00000 | v3 >> 6 & 0x380, 120);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f7;
            shape1 = shape2;
            v5 = v6;
            modifier2 = modifier3;
            f4 = f6;
        }
        else {
            composer1.skipToGroupEnd();
            modifier2 = modifier1;
            f4 = f2;
            f5 = f3;
            v5 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p1(this, modifier2, f4, f5, shape1, v5, v1, v2));
        }
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x19D4C8D8, v, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:299)");
        }
        long v1 = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getElevation-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getExpandedShape")
    @NotNull
    public final Shape getExpandedShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x645C7EF6, v, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:295)");
        }
        Shape shape0 = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getHiddenShape")
    @NotNull
    public final Shape getHiddenShape(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, v, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:291)");
        }
        Shape shape0 = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer0, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape0;
    }

    @Composable
    @JvmName(name = "getScrimColor")
    public final long getScrimColor(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, v, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:306)");
        }
        long v1 = Color.copy-wmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer0, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return v1;
    }

    public final float getSheetMaxWidth-D9Ej5fM() [...] // 潜在的解密器

    public final float getSheetPeekHeight-D9Ej5fM() [...] // 潜在的解密器

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, v, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:316)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composer0, 6), 0x20);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsets0;
    }
}

