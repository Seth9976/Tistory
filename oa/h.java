package oa;

import aa.w;
import android.graphics.SurfaceTexture;
import android.util.Size;
import androidx.activity.c0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.room.a;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import com.kakao.kandinsky.preview.ui.PreviewTextureViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function3 {
    public final Object A;
    public final int w;
    public final long x;
    public final Object y;
    public final Object z;

    public h(long v, MutableFloatState mutableFloatState0, KDPhoto kDPhoto0, PreviewTextureLoader previewTextureLoader0) {
        this.w = 1;
        this.x = v;
        this.y = mutableFloatState0;
        this.z = kDPhoto0;
        this.A = previewTextureLoader0;
        super(3);
    }

    public h(Object object0, long v, Object object1, Object object2, int v1) {
        this.w = v1;
        this.z = object0;
        this.x = v;
        this.A = object1;
        this.y = object2;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        switch(this.w) {
            case 0: {
                Intrinsics.checkNotNullParameter(((SurfaceTexture)object0), "surface");
                PreviewTextureViewKt.access$PreviewTextureView$lambda$2(((MutableFloatState)this.y), ((float)IntSize.getWidth-impl(((KDPhoto)this.z).getBitmapSize-YbymL2g())) / ((float)IntSize.getWidth-impl(this.x)));
                ((PreviewTextureLoader)this.A).updateSurfaceInfo(((SurfaceTexture)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                return Unit.INSTANCE;
            }
            case 1: {
                Composer composer1 = (Composer)object1;
                int v2 = ((Number)object2).intValue();
                Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
                if((v2 & 14) == 0) {
                    v2 |= (composer1.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
                }
                if((v2 & 91) == 18 && composer1.getSkipping()) {
                    composer1.skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x75350DBA, v2, -1, "com.kakao.kandinsky.preview.ui.PreviewTextureView.<anonymous> (PreviewTextureView.kt:42)");
                }
                Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
                Size size0 = new Size(density0.roundToPx-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM()), density0.roundToPx-0680j_4(((BoxWithConstraintsScope)object0).getMaxHeight-D9Ej5fM()));
                long v3 = this.x;
                composer1.startMovableGroup(0x888C012, IntSize.box-impl(v3));
                PreviewTextureLoader previewTextureLoader0 = (PreviewTextureLoader)this.A;
                KDPhoto kDPhoto0 = (KDPhoto)this.z;
                if(SizeExtensionKt.isNotEmpty-ozmzZPI(v3)) {
                    composer1.startReplaceGroup(0x888C0C0);
                    boolean z1 = composer1.changed(((MutableFloatState)this.y));
                    boolean z2 = composer1.changed(kDPhoto0);
                    boolean z3 = composer1.changed(v3);
                    boolean z4 = composer1.changed(previewTextureLoader0);
                    h h0 = composer1.rememberedValue();
                    if((z3 | (z1 | z2) | z4) != 0 || h0 == Composer.Companion.getEmpty()) {
                        h0 = new h(((KDPhoto)this.z), this.x, ((PreviewTextureLoader)this.A), ((MutableFloatState)this.y), 0);
                        composer1.updateRememberedValue(h0);
                    }
                    composer1.endReplaceGroup();
                    composer1.startReplaceGroup(143180266);
                    boolean z5 = composer1.changed(previewTextureLoader0);
                    c0 c00 = composer1.rememberedValue();
                    if(z5 || c00 == Composer.Companion.getEmpty()) {
                        c00 = new c0(previewTextureLoader0, 13);
                        composer1.updateRememberedValue(c00);
                    }
                    composer1.endReplaceGroup();
                    PreviewTextureViewKt.access$TextureView-03bzQGs(this.x, h0, c00, composer1, 0);
                    composer1.startReplaceGroup(143180356);
                    boolean z6 = composer1.changed(previewTextureLoader0);
                    boolean z7 = composer1.changed(kDPhoto0);
                    i i0 = composer1.rememberedValue();
                    if(z6 || z7 || i0 == Composer.Companion.getEmpty()) {
                        i0 = new i(previewTextureLoader0, kDPhoto0, null);
                        composer1.updateRememberedValue(i0);
                    }
                    composer1.endReplaceGroup();
                    EffectsKt.LaunchedEffect(kDPhoto0, i0, composer1, 0x40);
                }
                composer1.endMovableGroup();
                EffectsKt.LaunchedEffect(kDPhoto0.getOriginalUri(), new j(size0, kDPhoto0, previewTextureLoader0, null), composer1, 0x40);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object2).intValue();
                if((v & 6) == 0) {
                    v |= (((Composer)object1).changed(((Modifier)object0)) ? 4 : 2);
                }
                if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-660524084, v, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
                }
                State state0 = (State)this.z;
                boolean z = ((Composer)object1).changed(state0);
                w w0 = ((Composer)object1).rememberedValue();
                if(z || w0 == Composer.Companion.getEmpty()) {
                    w0 = new w(state0, 16);
                    ((Composer)object1).updateRememberedValue(w0);
                }
                Modifier modifier0 = GraphicsLayerModifierKt.graphicsLayer(((Modifier)object0), w0);
                MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object1), 0);
                CompositionLocalMap compositionLocalMap0 = ((Composer)object1).getCurrentCompositionLocalMap();
                Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object1), modifier0);
                Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                if(((Composer)object1).getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                ((Composer)object1).startReusableNode();
                if(((Composer)object1).getInserting()) {
                    ((Composer)object1).createNode(function00);
                }
                else {
                    ((Composer)object1).useNode();
                }
                Composer composer0 = Updater.constructor-impl(((Composer)object1));
                Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
                    a.t(v1, composer0, v1, function20);
                }
                Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
                TextFieldImplKt.access$Decoration-3J-VO9M(this.x, ((TextStyle)this.A), ((Function2)this.y), ((Composer)object1), 0);
                ((Composer)object1).endNode();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

