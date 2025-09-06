package com.kakao.kandinsky.sticker.ui;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.sticker.contract.StickerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p9.a;
import ya.f;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 StickerList.kt\ncom/kakao/kandinsky/sticker/ui/StickerListKt$StickerList$4$1\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,569:1\n68#2,4:570\n72#2:580\n67#2:581\n80#2:582\n1223#3,6:574\n*S KotlinDebug\n*F\n+ 1 StickerList.kt\ncom/kakao/kandinsky/sticker/ui/StickerListKt$StickerList$4$1\n*L\n71#1:574,6\n*E\n"})
public final class StickerListKt.StickerList.4.1.invoke..inlined.items.default.5 extends Lambda implements Function4 {
    public final List w;
    public final float x;
    public final Function1 y;

    public StickerListKt.StickerList.4.1.invoke..inlined.items.default.5(List list0, float f, Function1 function10) {
        this.w = list0;
        this.x = f;
        this.y = function10;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.invoke(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope0, int v, @Nullable Composer composer0, int v1) {
        int v2 = (v1 & 6) == 0 ? v1 | (composer0.changed(lazyGridItemScope0) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x29B3C0FE, v2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
        }
        StickerItem stickerItem0 = (StickerItem)this.w.get(v);
        Modifier modifier0 = AspectRatioKt.aspectRatio$default(SizeKt.requiredSize-3ABfNKs(Modifier.Companion, this.x), 1.0f, false, 2, null);
        composer0.startReplaceGroup(0x3FD390AD);
        Function1 function10 = this.y;
        boolean z = composer0.changed(function10);
        boolean z1 = composer0.changed(stickerItem0);
        a a0 = composer0.rememberedValue();
        if(z || z1 || a0 == Composer.Companion.getEmpty()) {
            a0 = new a(17, function10, stickerItem0);
            composer0.updateRememberedValue(a0);
        }
        composer0.endReplaceGroup();
        KDButtonKt.KDButton(a0, modifier0, false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(0xBF0F87A7, true, new f(stickerItem0), composer0, 54), composer0, 0x6000000, 0xFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

