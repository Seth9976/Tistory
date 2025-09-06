package androidx.compose.ui.graphics.vector;

import androidx.compose.material3.j6;
import androidx.compose.material3.ua;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0096\u0001\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2@\u0010\u0011\u001A<\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A\u00A0\u0001\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u0017\u001A\u00020\u00162@\u0010\u0011\u001A<\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003\u00A2\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000E0\f\u00A2\u0006\u0002\b\u000F\u00A2\u0006\u0002\b\u0010H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u0017\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u001B\u001A\u00020\u001AH\u0007\u00A2\u0006\u0004\b\u0015\u0010\u001C\u001AD\u0010$\u001A\u00020\u0012*\u00020\u00122\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u001F\u001A\u00020\u001D2\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\u0010!\u001A\u0004\u0018\u00010 2\b\b\u0002\u0010\u0017\u001A\u00020\u0016H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#\u001A\'\u0010*\u001A\u00020\u00122\u0006\u0010&\u001A\u00020%2\u0006\u0010\'\u001A\u00020\u001A2\u0006\u0010)\u001A\u00020(H\u0000\u00A2\u0006\u0004\b*\u0010+\u001A\u001B\u0010.\u001A\u00020(*\u00020(2\u0006\u0010-\u001A\u00020,H\u0000\u00A2\u0006\u0004\b.\u0010/\u001A-\u00104\u001A\u00020\u000E2\u0006\u00100\u001A\u00020,2\u0014\b\u0002\u00103\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020201H\u0007\u00A2\u0006\u0004\b4\u00105\"\u0014\u00106\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00068"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "", "autoMirror", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/geometry/Size;", "defaultSize", "viewportSize", "Landroidx/compose/ui/graphics/ColorFilter;", "intrinsicColorFilter", "configureVectorPainter-T4PVSW8", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "configureVectorPainter", "Landroidx/compose/ui/unit/Density;", "density", "imageVector", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "createVectorPainterFromImageVector", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/graphics/vector/GroupComponent;)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "currentGroup", "createGroupComponent", "(Landroidx/compose/ui/graphics/vector/GroupComponent;Landroidx/compose/ui/graphics/vector/VectorGroup;)Landroidx/compose/ui/graphics/vector/GroupComponent;", "group", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "configs", "RenderVectorGroup", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "RootGroupName", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,520:1\n77#2:521\n77#2:540\n1223#3,6:522\n1223#3,6:528\n1223#3,6:534\n1223#3,6:544\n63#4,3:541\n184#5,6:550\n272#5,14:556\n696#6:570\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n132#1:521\n173#1:540\n135#1:522,6\n138#1:528,6\n147#1:534,6\n175#1:544,6\n174#1:541,3\n270#1:550,6\n270#1:556,14\n330#1:570\n*E\n"})
public final class VectorPainterKt {
    @NotNull
    public static final String RootGroupName = "VectorRootGroup";

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    public static final void RenderVectorGroup(@NotNull VectorGroup vectorGroup0, @Nullable Map map0, @Nullable Composer composer0, int v, int v1) {
        Map map1;
        Map map3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xE567D85F);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(vectorGroup0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(map0) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !composer1.getSkipping()) {
            Map map2 = (v1 & 2) == 0 ? map0 : x.emptyMap();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE567D85F, v2, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:430)");
            }
            for(Object object0: vectorGroup0) {
                VectorNode vectorNode0 = (VectorNode)object0;
                if(vectorNode0 instanceof VectorPath) {
                    composer1.startReplaceGroup(0xFE9729C0);
                    if(((VectorConfig)map2.get(((VectorPath)vectorNode0).getName())) == null) {
                        new VectorConfig() {  // 初始化器: Ljava/lang/Object;-><init>()V
                        };
                    }
                    VectorComposeKt.Path-9cdaXJ4(((VectorPath)vectorNode0).getPathData(), ((VectorPath)vectorNode0).getPathFillType-Rg-k1Os(), ((VectorPath)vectorNode0).getName(), ((VectorPath)vectorNode0).getFill(), ((VectorPath)vectorNode0).getFillAlpha(), ((VectorPath)vectorNode0).getStroke(), ((VectorPath)vectorNode0).getStrokeAlpha(), ((VectorPath)vectorNode0).getStrokeLineWidth(), ((VectorPath)vectorNode0).getStrokeLineCap-KaPHkGw(), ((VectorPath)vectorNode0).getStrokeLineJoin-LxFBmk8(), ((VectorPath)vectorNode0).getStrokeLineMiter(), ((VectorPath)vectorNode0).getTrimPathStart(), ((VectorPath)vectorNode0).getTrimPathEnd(), ((VectorPath)vectorNode0).getTrimPathOffset(), composer1, 0, 0, 0);
                    composer1.endReplaceGroup();
                }
                else {
                    if(vectorNode0 instanceof VectorGroup) {
                        composer1.startReplaceGroup(0xFEB31EFF);
                        map3 = map2;
                        if(((VectorConfig)map3.get("")) == null) {
                            new VectorConfig() {  // 初始化器: Ljava/lang/Object;-><init>()V
                            };
                        }
                        VectorComposeKt.Group("", ((VectorGroup)vectorNode0).getRotation(), ((VectorGroup)vectorNode0).getPivotX(), ((VectorGroup)vectorNode0).getPivotY(), ((VectorGroup)vectorNode0).getScaleX(), ((VectorGroup)vectorNode0).getScaleY(), ((VectorGroup)vectorNode0).getTranslationX(), ((VectorGroup)vectorNode0).getTranslationY(), ((VectorGroup)vectorNode0).getClipPathData(), ComposableLambdaKt.rememberComposableLambda(1450046638, true, new aa.x(29, ((VectorGroup)vectorNode0), map3), composer1, 54), composer1, 0x30000000, 0);
                    }
                    else {
                        map3 = map2;
                        composer1.startReplaceGroup(-20402883);
                    }
                    composer1.endReplaceGroup();
                    map2 = map3;
                }
            }
            map1 = map2;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            map1 = map0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j6(vectorGroup0, map1, v, v1));
        }
    }

    @NotNull
    public static final VectorPainter configureVectorPainter-T4PVSW8(@NotNull VectorPainter vectorPainter0, long v, long v1, @NotNull String s, @Nullable ColorFilter colorFilter0, boolean z) {
        vectorPainter0.setSize-uvyYCjk$ui_release(v);
        vectorPainter0.setAutoMirror$ui_release(z);
        vectorPainter0.setIntrinsicColorFilter$ui_release(colorFilter0);
        vectorPainter0.setViewportSize-uvyYCjk$ui_release(v1);
        vectorPainter0.setName$ui_release(s);
        return vectorPainter0;
    }

    public static VectorPainter configureVectorPainter-T4PVSW8$default(VectorPainter vectorPainter0, long v, long v1, String s, ColorFilter colorFilter0, boolean z, int v2, Object object0) {
        String s1 = (v2 & 4) == 0 ? s : "VectorRootGroup";
        return (v2 & 16) == 0 ? VectorPainterKt.configureVectorPainter-T4PVSW8(vectorPainter0, v, v1, s1, colorFilter0, z) : VectorPainterKt.configureVectorPainter-T4PVSW8(vectorPainter0, v, v1, s1, colorFilter0, false);
    }

    @NotNull
    public static final GroupComponent createGroupComponent(@NotNull GroupComponent groupComponent0, @NotNull VectorGroup vectorGroup0) {
        int v = vectorGroup0.getSize();
        for(int v1 = 0; v1 < v; ++v1) {
            VectorNode vectorNode0 = vectorGroup0.get(v1);
            if(vectorNode0 instanceof VectorPath) {
                PathComponent pathComponent0 = new PathComponent();
                pathComponent0.setPathData(((VectorPath)vectorNode0).getPathData());
                pathComponent0.setPathFillType-oQ8Xj4U(((VectorPath)vectorNode0).getPathFillType-Rg-k1Os());
                pathComponent0.setName(((VectorPath)vectorNode0).getName());
                pathComponent0.setFill(((VectorPath)vectorNode0).getFill());
                pathComponent0.setFillAlpha(((VectorPath)vectorNode0).getFillAlpha());
                pathComponent0.setStroke(((VectorPath)vectorNode0).getStroke());
                pathComponent0.setStrokeAlpha(((VectorPath)vectorNode0).getStrokeAlpha());
                pathComponent0.setStrokeLineWidth(((VectorPath)vectorNode0).getStrokeLineWidth());
                pathComponent0.setStrokeLineCap-BeK7IIE(((VectorPath)vectorNode0).getStrokeLineCap-KaPHkGw());
                pathComponent0.setStrokeLineJoin-Ww9F2mQ(((VectorPath)vectorNode0).getStrokeLineJoin-LxFBmk8());
                pathComponent0.setStrokeLineMiter(((VectorPath)vectorNode0).getStrokeLineMiter());
                pathComponent0.setTrimPathStart(((VectorPath)vectorNode0).getTrimPathStart());
                pathComponent0.setTrimPathEnd(((VectorPath)vectorNode0).getTrimPathEnd());
                pathComponent0.setTrimPathOffset(((VectorPath)vectorNode0).getTrimPathOffset());
                groupComponent0.insertAt(v1, pathComponent0);
            }
            else if(vectorNode0 instanceof VectorGroup) {
                GroupComponent groupComponent1 = new GroupComponent();
                groupComponent1.setName(((VectorGroup)vectorNode0).getName());
                groupComponent1.setRotation(((VectorGroup)vectorNode0).getRotation());
                groupComponent1.setScaleX(((VectorGroup)vectorNode0).getScaleX());
                groupComponent1.setScaleY(((VectorGroup)vectorNode0).getScaleY());
                groupComponent1.setTranslationX(((VectorGroup)vectorNode0).getTranslationX());
                groupComponent1.setTranslationY(((VectorGroup)vectorNode0).getTranslationY());
                groupComponent1.setPivotX(((VectorGroup)vectorNode0).getPivotX());
                groupComponent1.setPivotY(((VectorGroup)vectorNode0).getPivotY());
                groupComponent1.setClipPathData(((VectorGroup)vectorNode0).getClipPathData());
                VectorPainterKt.createGroupComponent(groupComponent1, ((VectorGroup)vectorNode0));
                groupComponent0.insertAt(v1, groupComponent1);
            }
        }
        return groupComponent0;
    }

    @NotNull
    public static final VectorPainter createVectorPainterFromImageVector(@NotNull Density density0, @NotNull ImageVector imageVector0, @NotNull GroupComponent groupComponent0) {
        long v = SizeKt.Size(density0.toPx-0680j_4(imageVector0.getDefaultWidth-D9Ej5fM()), density0.toPx-0680j_4(imageVector0.getDefaultHeight-D9Ej5fM()));
        float f = imageVector0.getViewportWidth();
        float f1 = imageVector0.getViewportHeight();
        if(Float.isNaN(f)) {
            f = Size.getWidth-impl(v);
        }
        if(Float.isNaN(f1)) {
            f1 = Size.getHeight-impl(v);
        }
        long v1 = SizeKt.Size(f, f1);
        VectorPainter vectorPainter0 = new VectorPainter(groupComponent0);
        String s = imageVector0.getName();
        long v2 = imageVector0.getTintColor-0d7_KjU();
        return v2 == 16L ? VectorPainterKt.configureVectorPainter-T4PVSW8(vectorPainter0, v, v1, s, null, imageVector0.getAutoMirror()) : VectorPainterKt.configureVectorPainter-T4PVSW8(vectorPainter0, v, v1, s, ColorFilter.Companion.tint-xETnrds(v2, imageVector0.getTintBlendMode-0nO6VwU()), imageVector0.getAutoMirror());
    }

    @Composable
    @NotNull
    public static final VectorPainter rememberVectorPainter(@NotNull ImageVector imageVector0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x544566B0, v, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:171)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = composer0.changed(((long)Float.floatToRawIntBits(density0.getDensity())) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(imageVector0.getGenId$ui_release())) << 0x20);
        VectorPainter vectorPainter0 = composer0.rememberedValue();
        if(z || vectorPainter0 == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent0 = new GroupComponent();
            VectorPainterKt.createGroupComponent(groupComponent0, imageVector0.getRoot());
            vectorPainter0 = VectorPainterKt.createVectorPainterFromImageVector(density0, imageVector0, groupComponent0);
            composer0.updateRememberedValue(vectorPainter0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter0;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @Deprecated(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @ReplaceWith(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @NotNull
    public static final VectorPainter rememberVectorPainter-mlNsNFs(float f, float f1, float f2, float f3, @Nullable String s, long v, int v1, @NotNull Function4 function40, @Nullable Composer composer0, int v2, int v3) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC684F466, v2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:86)");
        }
        VectorPainter vectorPainter0 = VectorPainterKt.rememberVectorPainter-vIP8VLU(f, f1, ((v3 & 4) == 0 ? f2 : NaNf), ((v3 & 8) == 0 ? f3 : NaNf), ((v3 & 16) == 0 ? s : "VectorRootGroup"), ((v3 & 0x20) == 0 ? v : 0L), ((v3 & 0x40) == 0 ? v1 : 5), false, function40, composer0, v2 & 14 | 0xC00000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | 0x70000 & v2 | 0x380000 & v2 | v2 << 3 & 0xE000000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter0;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @NotNull
    public static final VectorPainter rememberVectorPainter-vIP8VLU(float f, float f1, float f2, float f3, @Nullable String s, long v, int v1, boolean z, @NotNull Function4 function40, @Nullable Composer composer0, int v2, int v3) {
        float f4 = NaNf;
        float f5 = (v3 & 4) == 0 ? f2 : NaNf;
        if((v3 & 8) == 0) {
            f4 = f3;
        }
        long v4 = (v3 & 0x20) == 0 ? v : 0L;
        int v5 = (v3 & 0x40) == 0 ? v1 : 5;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1068590786, v2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:130)");
        }
        Density density0 = (Density)composer0.consume(CompositionLocalsKt.getLocalDensity());
        long v6 = SizeKt.Size(density0.toPx-0680j_4(f), density0.toPx-0680j_4(f1));
        long v7 = SizeKt.Size((Float.isNaN(f5) ? Size.getWidth-impl(v6) : f5), (Float.isNaN(f4) ? Size.getHeight-impl(v6) : f4));
        int v8 = ((0x70000 & v2 ^ 0x30000) <= 0x20000 || !composer0.changed(v4)) && (v2 & 0x30000) != 0x20000 ? 0 : 1;
        int v9 = ((0x380000 & v2 ^ 0x180000) <= 0x100000 || !composer0.changed(v5)) && (v2 & 0x180000) != 0x100000 ? 0 : 1;
        ColorFilter colorFilter0 = composer0.rememberedValue();
        if((v9 | v8) != 0 || colorFilter0 == Composer.Companion.getEmpty()) {
            colorFilter0 = v4 == 16L ? null : ColorFilter.Companion.tint-xETnrds(v4, v5);
            composer0.updateRememberedValue(colorFilter0);
        }
        composer0.startReplaceGroup(-1837510348);
        VectorPainter vectorPainter0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(vectorPainter0 == composer$Companion0.getEmpty()) {
            vectorPainter0 = new VectorPainter(null, 1, null);
            composer0.updateRememberedValue(vectorPainter0);
        }
        VectorPainterKt.configureVectorPainter-T4PVSW8(vectorPainter0, v6, v7, ((v3 & 16) == 0 ? s : "VectorRootGroup"), colorFilter0, ((v3 & 0x80) == 0 ? z : false));
        CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer0, 0);
        int v10 = ((v2 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(f5)) && (v2 & 0x180) != 0x100 ? 0 : 1;
        int v11 = ((v2 & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(f4)) && (v2 & 0xC00) != 0x800 ? 0 : 1;
        int v12 = ((0xE000000 & v2 ^ 0x6000000) <= 0x4000000 || !composer0.changed(function40)) && (v2 & 0x6000000) != 0x4000000 ? 0 : 1;
        Composition composition0 = composer0.rememberedValue();
        if((v10 | v11 | v12) != 0 || composition0 == composer$Companion0.getEmpty()) {
            Composition composition1 = vectorPainter0.getComposition$ui_release();
            if(composition1 == null || composition1.isDisposed()) {
                composition1 = CompositionKt.Composition(new VectorApplier(vectorPainter0.getVector$ui_release().getRoot()), compositionContext0);
            }
            composition0 = composition1;
            composition0.setContent(ComposableLambdaKt.composableLambdaInstance(0xCEDC53F7, true, new ua(v7, function40)));
            composer0.updateRememberedValue(composition0);
        }
        vectorPainter0.setComposition$ui_release(composition0);
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter0;
    }
}

