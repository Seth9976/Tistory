package androidx.compose.material3.carousel;

import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.nq;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A%\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberCarouselState", "Landroidx/compose/material3/carousel/CarouselState;", "initialItem", "", "itemCount", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/carousel/CarouselState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCarouselState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1223#2,6:164\n1#3:170\n*S KotlinDebug\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselStateKt\n*L\n104#1:164,6\n*E\n"})
public final class CarouselStateKt {
    @ExperimentalMaterial3Api
    @Composable
    @NotNull
    public static final CarouselState rememberCarouselState(int v, @NotNull Function0 function00, @Nullable Composer composer0, int v1, int v2) {
        int v3 = 1;
        if((v2 & 1) != 0) {
            v = 0;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF30C7BCC, v1, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:102)");
        }
        Saver saver0 = CarouselState.Companion.getSaver();
        int v4 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v1 & 6) != 4 ? 0 : 1;
        if(((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(function00)) && (v1 & 0x30) != 0x20) {
            v3 = 0;
        }
        nq nq0 = composer0.rememberedValue();
        if((v4 | v3) != 0 || nq0 == Composer.Companion.getEmpty()) {
            nq0 = new nq(v, function00, 3);
            composer0.updateRememberedValue(nq0);
        }
        CarouselState carouselState0 = (CarouselState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, nq0, composer0, 0, 4);
        carouselState0.getItemCountState().setValue(function00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return carouselState0;
    }
}

