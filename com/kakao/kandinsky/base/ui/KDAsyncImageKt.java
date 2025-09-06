package com.kakao.kandinsky.base.ui;

import aa.q;
import android.content.res.Configuration;
import androidx.compose.material3.i3;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.kakao.kandinsky.delegate.ImageLibrary;
import com.kakao.kandinsky.delegate.ImageLibraryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001AO\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001A\u0004\u0018\u0001H\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\rH\u0007¢\u0006\u0002\u0010\u000E¨\u0006\u000F²\u0006\u0012\u0010\u0010\u001A\u0004\u0018\u00010\u0011\"\u0004\b\u0000\u0010\u0002X\u008A\u008E\u0002²\u0006\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0011\"\u0004\b\u0000\u0010\u0002X\u008A\u0084\u0002"}, d2 = {"AsyncImage", "", "T", "model", "resizeToViewSize", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Ljava/lang/Object;ZLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)V", "base_release", "viewSize", "Landroidx/compose/ui/unit/IntSize;", "requireSize"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKDAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDAsyncImage.kt\ncom/kakao/kandinsky/base/ui/KDAsyncImageKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,41:1\n77#2:42\n77#2:43\n77#2:57\n148#3:44\n1223#4,6:45\n1223#4,6:51\n1223#4,6:58\n81#5:64\n107#5,2:65\n81#5:67\n*S KotlinDebug\n*F\n+ 1 KDAsyncImage.kt\ncom/kakao/kandinsky/base/ui/KDAsyncImageKt\n*L\n23#1:42\n24#1:43\n31#1:57\n25#1:44\n28#1:45,6\n29#1:51,6\n35#1:58,6\n28#1:64\n28#1:65,2\n29#1:67\n*E\n"})
public final class KDAsyncImageKt {
    @Composable
    public static final void AsyncImage(@Nullable Object object0, boolean z, @Nullable String s, @Nullable Modifier modifier0, @Nullable Alignment alignment0, @Nullable ContentScale contentScale0, @Nullable Composer composer0, int v, int v1) {
        Alignment alignment1;
        ContentScale contentScale1;
        Modifier modifier1;
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xC3516410);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            z1 = z;
        }
        else if((v & 0x70) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        else {
            z1 = z;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.changed(alignment0) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(contentScale0) ? 0x20000 : 0x10000);
        }
        boolean z2 = true;
        if((v2 & 0x5B6DB) != 74898 || !composer1.getSkipping()) {
            boolean z3 = (v1 & 2) == 0 ? z1 : true;
            Modifier modifier2 = (v1 & 8) == 0 ? modifier0 : Modifier.Companion;
            Alignment alignment2 = (v1 & 16) == 0 ? alignment0 : Alignment.Companion.getCenter();
            ContentScale contentScale2 = (v1 & 0x20) == 0 ? contentScale0 : ContentScale.Companion.getFit();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC3516410, v2, -1, "com.kakao.kandinsky.base.ui.AsyncImage (KDAsyncImage.kt:21)");
            }
            composer1.startReplaceGroup(0x792841FA);
            Configuration configuration0 = (Configuration)composer1.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            long v3 = IntSizeKt.IntSize(density0.roundToPx-0680j_4(((float)configuration0.screenWidthDp)), density0.roundToPx-0680j_4(((float)configuration0.screenHeightDp)));
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(2032681642);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            IntSize intSize0 = (IntSize)mutableState0.getValue();
            composer1.startReplaceGroup(2032681699);
            if((v2 & 0x70) != 0x20) {
                z2 = false;
            }
            boolean z4 = composer1.changed(intSize0);
            MutableState mutableState1 = composer1.rememberedValue();
            if(z2 || z4 || mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default((z3 ? ((IntSize)mutableState0.getValue()) : IntSize.box-impl(v3)), null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            composer1.endReplaceGroup();
            Object object1 = composer1.consume(ImageLibraryKt.getLocalImageLibrary());
            if(((ImageLibrary)object1) != null) {
                IntSize intSize1 = (IntSize)mutableState1.getValue();
                composer1.startReplaceGroup(0x7928440C);
                q q0 = composer1.rememberedValue();
                if(q0 == composer$Companion0.getEmpty()) {
                    q0 = new q(mutableState0, 17);
                    composer1.updateRememberedValue(q0);
                }
                composer1.endReplaceGroup();
                ((ImageLibrary)object1).AsyncImage-v934gDM(object0, intSize1, s, OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, q0), alignment2, contentScale2, composer1, 0x200000 | v2 & 8 | v2 & 14 | v2 & 0x380 | 0xE000 & v2 | v2 & 0x70000);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z3;
            modifier1 = modifier2;
            alignment1 = alignment2;
            contentScale1 = contentScale2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            contentScale1 = contentScale0;
            alignment1 = alignment0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(object0, z1, s, modifier1, alignment1, contentScale1, v, v1, 6));
        }
    }

    public static final void access$AsyncImage$lambda$4(MutableState mutableState0, IntSize intSize0) {
        mutableState0.setValue(intSize0);
    }
}

