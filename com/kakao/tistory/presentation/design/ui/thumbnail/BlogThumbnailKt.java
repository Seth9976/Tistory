package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\u001AD\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000BH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"BlogThumbnail", "", "thumbnail", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "size", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "useRandomColor", "", "contentDescription", "", "BlogThumbnail-EUb7tLY", "(Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;FLandroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogThumbnail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogThumbnail.kt\ncom/kakao/tistory/presentation/design/ui/thumbnail/BlogThumbnailKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,75:1\n1223#2,6:76\n77#3:82\n*S KotlinDebug\n*F\n+ 1 BlogThumbnail.kt\ncom/kakao/tistory/presentation/design/ui/thumbnail/BlogThumbnailKt\n*L\n29#1:76,6\n36#1:82\n*E\n"})
public final class BlogThumbnailKt {
    @Composable
    public static final void BlogThumbnail-EUb7tLY(@Nullable ThumbnailUiState thumbnailUiState0, float f, @Nullable Modifier modifier0, boolean z, @Nullable String s, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        Modifier modifier1;
        Pair pair0;
        String s1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-2097436801);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(thumbnailUiState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            s1 = s;
        }
        else if((0xE000 & v) == 0) {
            s1 = s;
            v2 |= (composer1.changed(s1) ? 0x4000 : 0x2000);
        }
        else {
            s1 = s;
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            boolean z2 = false;
            boolean z3 = (v1 & 8) == 0 ? z : false;
            String s2 = (v1 & 16) == 0 ? s1 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2097436801, v2, -1, "com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnail (BlogThumbnail.kt:24)");
            }
            Object[] arr_object = {Boolean.valueOf(z3), thumbnailUiState0};
            Saver saver0 = SaverKt.Saver(b.a, c.a);
            composer1.startReplaceGroup(0x68D82FA9);
            if((v2 & 0x1C00) == 0x800) {
                z2 = true;
            }
            d d0 = composer1.rememberedValue();
            if(z2 || d0 == Composer.Companion.getEmpty()) {
                d0 = new d(z3);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceGroup();
            long v3 = ((Color)RememberSaveableKt.rememberSaveable(arr_object, saver0, null, d0, composer1, 72, 4)).unbox-impl();
            int v4 = z3 ? drawable.ico_blog_default_transparent : drawable.ic_img_blogimg_default_s;
            composer1.startReplaceGroup(1759006434);
            String s3 = thumbnailUiState0 == null ? null : thumbnailUiState0.getThumbnail-rCkNIVA(Dp.box-impl(f), composer1, v2 >> 3 & 14 | v2 << 3 & 0x70);
            composer1.endReplaceGroup();
            if(((Boolean)composer1.consume(SlotContainerKt.getLocalLoadingState())).booleanValue()) {
                pair0 = TuplesKt.to(null, Color.box-impl(v3));
            }
            else {
                pair0 = s3 == null || p.isBlank(s3) ? TuplesKt.to(v4, Color.box-impl(v3)) : TuplesKt.to(s3, Color.box-impl(0L));
            }
            ColorPainter colorPainter0 = new ColorPainter(v3, null);
            CommonImageKt.CommonImage(pair0.component1(), s2, BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.size-3ABfNKs(modifier1, f), BlogShape.INSTANCE), ((Color)pair0.component2()).unbox-impl(), null, 2, null), colorPainter0, null, null, composer1, v2 >> 9 & 0x70 | 0x1008, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z3;
            s1 = s2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(thumbnailUiState0, f, modifier1, z1, s1, v, v1));
        }
    }
}

