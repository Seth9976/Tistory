package com.kakao.kandinsky.border;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.DpSize;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kandinsky.designsystem.common.ModifierKt;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t9.a;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A%\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BorderDecoration", "", "border", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "displayRect", "Landroidx/compose/ui/geometry/Rect;", "enabled", "", "(Lcom/kakao/kandinsky/core/kdphoto/Border;Landroidx/compose/ui/geometry/Rect;ZLandroidx/compose/runtime/Composer;I)V", "border_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBorderDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BorderDecoration.kt\ncom/kakao/kandinsky/border/BorderDecorationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,122:1\n183#2:123\n68#3:124\n71#4:125\n68#4,6:126\n74#4:160\n78#4:164\n78#5,6:132\n85#5,4:147\n89#5,2:157\n93#5:163\n368#6,9:138\n377#6:159\n378#6,2:161\n4032#7,6:151\n*S KotlinDebug\n*F\n+ 1 BorderDecoration.kt\ncom/kakao/kandinsky/border/BorderDecorationKt\n*L\n26#1:123\n26#1:124\n28#1:125\n28#1:126,6\n28#1:160\n28#1:164\n28#1:132,6\n28#1:147,4\n28#1:157,2\n28#1:163\n28#1:138,9\n28#1:159\n28#1:161,2\n28#1:151,6\n*E\n"})
public final class BorderDecorationKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BorderDecoration(@NotNull Border border0, @NotNull Rect rect0, boolean z, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(border0, "border");
        Intrinsics.checkNotNullParameter(rect0, "displayRect");
        Composer composer1 = composer0.startRestartGroup(0x424AC7F2);
        int v1 = (v & 14) == 0 ? (composer1.changed(border0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(rect0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x424AC7F2, v1, -1, "com.kakao.kandinsky.border.BorderDecoration (BorderDecoration.kt:21)");
            }
            if(Intrinsics.areEqual(border0, Border.Companion.getORIGIN())) {
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new a(border0, rect0, z, v, 0));
                }
                return;
            }
            long v2 = DpExtensionKt.toDpSize-Pq9zytI(rect0.getSize-NH-jbRc(), composer1, 0);
            float f = Math.min(DpSize.getWidth-D9Ej5fM(v2), DpSize.getHeight-D9Ej5fM(v2)) / 5.0f;
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = OffsetKt.offset-VpY3zN4(SizeKt.size-6HolHcs(modifier$Companion0, v2), DpExtensionKt.toDp(rect0.getLeft(), composer1, 0), DpExtensionKt.toDp(rect0.getTop(), composer1, 0));
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
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
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                androidx.room.a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Painter painter0 = PainterResources_androidKt.painterResource(border0.getIconLeftTop(), composer1, 0);
            Modifier modifier2 = SizeKt.size-VpY3zN4(modifier$Companion0, f, f);
            ImageKt.Image(painter0, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier2, alignment$Companion0.getTopStart()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            Painter painter1 = PainterResources_androidKt.painterResource(border0.getIconTop(), composer1, 0);
            Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, f), 0.0f, 1, null), f, 0.0f, 2, null);
            ImageKt.Image(painter1, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier3, alignment$Companion0.getTopCenter()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            Painter painter2 = PainterResources_androidKt.painterResource(border0.getIconRightTop(), composer1, 0);
            Modifier modifier4 = SizeKt.size-VpY3zN4(modifier$Companion0, f, f);
            ImageKt.Image(painter2, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier4, alignment$Companion0.getTopEnd()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            Painter painter3 = PainterResources_androidKt.painterResource(border0.getIconLeft(), composer1, 0);
            Modifier modifier5 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(modifier$Companion0, f), 0.0f, 1, null), 0.0f, f, 1, null);
            ImageKt.Image(painter3, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier5, alignment$Companion0.getCenterStart()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            Painter painter4 = PainterResources_androidKt.painterResource(border0.getIconRight(), composer1, 0);
            Modifier modifier6 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(modifier$Companion0, f), 0.0f, 1, null), 0.0f, f, 1, null);
            ImageKt.Image(painter4, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier6, alignment$Companion0.getCenterEnd()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            Painter painter5 = PainterResources_androidKt.painterResource(border0.getIconLeftBottom(), composer1, 0);
            Modifier modifier7 = SizeKt.size-VpY3zN4(modifier$Companion0, f, f);
            ImageKt.Image(painter5, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier7, alignment$Companion0.getBottomStart()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            Painter painter6 = PainterResources_androidKt.painterResource(border0.getIconBottom(), composer1, 0);
            Modifier modifier8 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, f), 0.0f, 1, null), f, 0.0f, 2, null);
            ImageKt.Image(painter6, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier8, alignment$Companion0.getBottomCenter()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            Painter painter7 = PainterResources_androidKt.painterResource(border0.getIconRightBottom(), composer1, 0);
            Modifier modifier9 = SizeKt.size-VpY3zN4(modifier$Companion0, f, f);
            ImageKt.Image(painter7, null, ModifierKt.enabled(BoxScopeInstance.INSTANCE.align(modifier9, alignment$Companion0.getBottomEnd()), z), null, ContentScale.Companion.getFillBounds(), 0.0f, null, composer1, 0x6038, 104);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new a(border0, rect0, z, v, 1));
        }
    }
}

