package com.kakao.tistory.presentation;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntSize;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest.Builder;
import coil.request.ImageRequest;
import com.kakao.kandinsky.delegate.ImageLibrary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u00052\b\u0010\u0006\u001A\u0004\u0018\u0001H\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\t\u001A\u0004\u0018\u00010\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/CoilImageLibrary;", "Lcom/kakao/kandinsky/delegate/ImageLibrary;", "()V", "AsyncImage", "", "T", "model", "size", "Landroidx/compose/ui/unit/IntSize;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "AsyncImage-v934gDM", "(Ljava/lang/Object;Landroidx/compose/ui/unit/IntSize;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKandinskyInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KandinskyInitializer.kt\ncom/kakao/tistory/presentation/CoilImageLibrary\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,133:1\n77#2:134\n*S KotlinDebug\n*F\n+ 1 KandinskyInitializer.kt\ncom/kakao/tistory/presentation/CoilImageLibrary\n*L\n103#1:134\n*E\n"})
public final class CoilImageLibrary implements ImageLibrary {
    public static final int $stable;

    @Override  // com.kakao.kandinsky.delegate.ImageLibrary
    @Composable
    public void AsyncImage-v934gDM(@Nullable Object object0, @Nullable IntSize intSize0, @Nullable String s, @NotNull Modifier modifier0, @NotNull Alignment alignment0, @NotNull ContentScale contentScale0, @Nullable Composer composer0, int v) {
        ImageRequest imageRequest0;
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        Intrinsics.checkNotNullParameter(contentScale0, "contentScale");
        Composer composer1 = composer0.startRestartGroup(-1898147460);
        int v1 = (v & 14) == 0 ? (composer1.changed(object0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(intSize0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(alignment0) ? 0x4000 : 0x2000);
        }
        if((v & 0x70000) == 0) {
            v1 |= (composer1.changed(contentScale0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898147460, v1, -1, "com.kakao.tistory.presentation.CoilImageLibrary.AsyncImage (KandinskyInitializer.kt:99)");
            }
            composer1.startReplaceGroup(-1530205333);
            if(intSize0 == null) {
                imageRequest0 = null;
            }
            else {
                long v2 = intSize0.unbox-impl();
                imageRequest0 = new Builder(((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext()))).data(object0).size(IntSize.getWidth-impl(v2), IntSize.getHeight-impl(v2)).build();
            }
            composer1.endReplaceGroup();
            SingletonAsyncImageKt.AsyncImage-gl8XCv8(imageRequest0, s, modifier0, null, null, alignment0, contentScale0, 0.0f, null, 0, false, null, composer1, 0x70000 & v1 << 3 | (v1 >> 3 & 0x380 | (v1 >> 3 & 0x70 | 8)) | v1 << 3 & 0x380000, 0, 0xF98);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(this, object0, intSize0, s, modifier0, alignment0, contentScale0, v));
        }
    }
}

