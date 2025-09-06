package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.a;
import u1.c;
import u1.d;
import u1.e;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0085\u0001\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00052\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\u0016\u0010\u000F\u001A\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001A¦\u0001\u0010\u0014\u001A\u00020\u00012\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\b\b\u0002\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u00052\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u00052\b\b\u0002\u0010\u001D\u001A\u00020\u00052\b\b\u0002\u0010\u001E\u001A\u00020\u001F2\b\b\u0002\u0010 \u001A\u00020!2\b\b\u0002\u0010\"\u001A\u00020\u00052\b\b\u0002\u0010#\u001A\u00020\u00052\b\b\u0002\u0010$\u001A\u00020\u00052\b\b\u0002\u0010%\u001A\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006("}, d2 = {"Group", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n328#2,12:166\n254#2,11:178\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,12\n116#1:178,11\n*E\n"})
public final class VectorComposeKt {
    @Composable
    @VectorComposable
    public static final void Group(@Nullable String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @Nullable List list0, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        float f15;
        float f14;
        float f13;
        List list1;
        float f12;
        float f11;
        float f10;
        String s1;
        List list2;
        float f18;
        float f17;
        float f16;
        float f9;
        float f8;
        float f7;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xF3478136);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            f7 = f1;
        }
        else if((v & 0x180) == 0) {
            f7 = f1;
            v2 |= (composer1.changed(f7) ? 0x100 : 0x80);
        }
        else {
            f7 = f1;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            f8 = f2;
        }
        else if((v & 0xC00) == 0) {
            f8 = f2;
            v2 |= (composer1.changed(f8) ? 0x800 : 0x400);
        }
        else {
            f8 = f2;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            f9 = f3;
        }
        else if((v & 0x6000) == 0) {
            f9 = f3;
            v2 |= (composer1.changed(f9) ? 0x4000 : 0x2000);
        }
        else {
            f9 = f3;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changed(f4) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(f5) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(f6) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v2 |= ((v1 & 0x100) != 0 || !composer1.changedInstance(list0) ? 0x2000000 : 0x4000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v2) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                s1 = (v1 & 1) == 0 ? s : "";
                f18 = 0.0f;
                f10 = (v1 & 2) == 0 ? f : 0.0f;
                if((v1 & 4) != 0) {
                    f7 = 0.0f;
                }
                if((v1 & 8) != 0) {
                    f8 = 0.0f;
                }
                f16 = 1.0f;
                if((v1 & 16) != 0) {
                    f9 = 1.0f;
                }
                if((v1 & 0x20) == 0) {
                    f16 = f4;
                }
                f17 = (v1 & 0x40) == 0 ? f5 : 0.0f;
                if((v1 & 0x80) == 0) {
                    f18 = f6;
                }
                if((v1 & 0x100) == 0) {
                    list2 = list0;
                }
                else {
                    list2 = VectorKt.getEmptyPath();
                    v2 &= 0xF1FFFFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                s1 = s;
                f10 = f;
                f16 = f4;
                f17 = f5;
                f18 = f6;
                list2 = list0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF3478136, v2, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
            }
            if(!(composer1.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composer1.startNode();
            if(composer1.getInserting()) {
                composer1.createNode(a.z);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, s1, c.x);
            Updater.set-impl(composer1, f10, c.y);
            Updater.set-impl(composer1, f7, c.z);
            Updater.set-impl(composer1, f8, c.A);
            Updater.set-impl(composer1, f9, c.B);
            Updater.set-impl(composer1, f16, c.C);
            Updater.set-impl(composer1, f17, c.D);
            Updater.set-impl(composer1, f18, c.E);
            Updater.set-impl(composer1, list2, c.F);
            function20.invoke(composer1, ((int)(v2 >> 27 & 14)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f11 = f16;
            f12 = f17;
            f14 = f8;
            list1 = list2;
            f15 = f18;
            f13 = f7;
        }
        else {
            composer1.skipToGroupEnd();
            s1 = s;
            f10 = f;
            f11 = f4;
            f12 = f5;
            list1 = list0;
            f13 = f7;
            f14 = f8;
            f15 = f6;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(s1, f10, f13, f14, f9, f11, f12, f15, list1, function20, v, v1));
        }
    }

    @Composable
    @VectorComposable
    public static final void Path-9cdaXJ4(@NotNull List list0, int v, @Nullable String s, @Nullable Brush brush0, float f, @Nullable Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, @Nullable Composer composer0, int v3, int v4, int v5) {
        float f13;
        float f12;
        float f11;
        float f10;
        int v12;
        int v11;
        float f9;
        float f8;
        Brush brush3;
        float f7;
        Brush brush2;
        String s1;
        int v10;
        int v8;
        int v6;
        Composer composer1 = composer0.startRestartGroup(-1478270750);
        if((v5 & 1) == 0) {
            v6 = (v3 & 6) == 0 ? (composer1.changedInstance(list0) ? 4 : 2) | v3 : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v5 & 2) != 0) {
            v6 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v6 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v5 & 4) != 0) {
            v6 |= 0x180;
        }
        else if((v3 & 0x180) == 0) {
            v6 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        int v7 = 0x400;
        if((v5 & 8) != 0) {
            v6 |= 0xC00;
        }
        else if((v3 & 0xC00) == 0) {
            v6 |= (composer1.changed(brush0) ? 0x800 : 0x400);
        }
        if((v5 & 16) != 0) {
            v6 |= 0x6000;
        }
        else if((v3 & 0x6000) == 0) {
            v6 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v5 & 0x20) != 0) {
            v6 |= 0x30000;
        }
        else if((v3 & 0x30000) == 0) {
            v6 |= (composer1.changed(brush1) ? 0x20000 : 0x10000);
        }
        if((v5 & 0x40) != 0) {
            v6 |= 0x180000;
        }
        else if((v3 & 0x180000) == 0) {
            v6 |= (composer1.changed(f1) ? 0x100000 : 0x80000);
        }
        if((v5 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((v3 & 0xC00000) == 0) {
            v6 |= (composer1.changed(f2) ? 0x800000 : 0x400000);
        }
        if((v5 & 0x100) != 0) {
            v6 |= 0x6000000;
        }
        else if((v3 & 0x6000000) == 0) {
            v6 |= (composer1.changed(v1) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((v3 & 0x30000000) == 0) {
            v6 |= (composer1.changed(v2) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 0x400) == 0) {
            v8 = (v4 & 6) == 0 ? v4 | (composer1.changed(f3) ? 4 : 2) : v4;
        }
        else {
            v8 = v4 | 6;
        }
        if((v5 & 0x800) != 0) {
            v8 |= 0x30;
        }
        else if((v4 & 0x30) == 0) {
            v8 |= (composer1.changed(f4) ? 0x20 : 16);
        }
        int v9 = v8;
        if((v5 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v4 & 0x180) == 0) {
            v9 |= (composer1.changed(f5) ? 0x100 : 0x80);
        }
        if((v5 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v4 & 0xC00) == 0) {
            if(composer1.changed(f6)) {
                v7 = 0x800;
            }
            v9 |= v7;
        }
        if((v6 & 306783379) != 306783378 || (v9 & 0x493) != 1170 || !composer1.getSkipping()) {
            v10 = (v5 & 2) == 0 ? v : 0;
            String s2 = (v5 & 4) == 0 ? s : "";
            Brush brush4 = (v5 & 8) == 0 ? brush0 : null;
            float f14 = (v5 & 16) == 0 ? f : 1.0f;
            brush3 = (v5 & 0x20) == 0 ? brush1 : null;
            float f15 = (v5 & 0x40) == 0 ? f1 : 1.0f;
            f13 = 0.0f;
            float f16 = (v5 & 0x80) == 0 ? f2 : 0.0f;
            int v13 = (v5 & 0x100) == 0 ? v1 : 0;
            int v14 = (v5 & 0x200) == 0 ? v2 : 0;
            float f17 = (v5 & 0x400) == 0 ? f3 : 4.0f;
            float f18 = (v5 & 0x800) == 0 ? f4 : 0.0f;
            float f19 = (v5 & 0x1000) == 0 ? f5 : 1.0f;
            if((v5 & 0x2000) == 0) {
                f13 = f6;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1478270750, v6, v9, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
            }
            if(!(composer1.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composer1.startNode();
            if(composer1.getInserting()) {
                composer1.createNode(a.A);
            }
            else {
                composer1.useNode();
            }
            Updater.set-impl(composer1, s2, c.L);
            Updater.set-impl(composer1, list0, c.M);
            Updater.set-impl(composer1, PathFillType.box-impl(v10), c.N);
            Updater.set-impl(composer1, brush4, c.O);
            Updater.set-impl(composer1, f14, c.P);
            Updater.set-impl(composer1, brush3, c.Q);
            Updater.set-impl(composer1, f15, c.R);
            Updater.set-impl(composer1, f16, c.S);
            Updater.set-impl(composer1, StrokeJoin.box-impl(v14), c.T);
            Updater.set-impl(composer1, StrokeCap.box-impl(v13), c.G);
            Updater.set-impl(composer1, f17, c.H);
            Updater.set-impl(composer1, f18, c.I);
            Updater.set-impl(composer1, f19, c.J);
            Updater.set-impl(composer1, f13, c.K);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f10 = f17;
            s1 = s2;
            f9 = f16;
            f7 = f14;
            v12 = v14;
            f11 = f18;
            brush2 = brush4;
            f8 = f15;
            f12 = f19;
            v11 = v13;
        }
        else {
            composer1.skipToGroupEnd();
            v10 = v;
            s1 = s;
            brush2 = brush0;
            f7 = f;
            brush3 = brush1;
            f8 = f1;
            f9 = f2;
            v11 = v1;
            v12 = v2;
            f10 = f3;
            f11 = f4;
            f12 = f5;
            f13 = f6;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(list0, v10, s1, brush2, f7, brush3, f8, f9, v11, v12, f10, f11, f12, f13, v3, v4, v5));
        }
    }
}

