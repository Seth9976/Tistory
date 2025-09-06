package com.kakao.kandinsky.signature.ui;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.signature.R.string;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import te.a;
import va.h;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n+ 2 SavedSignatureBottomSheet.kt\ncom/kakao/kandinsky/signature/ui/SavedSignatureBottomSheetKt$SavedSignatureBottomSheet$3$2\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,569:1\n93#2,12:570\n107#2,8:588\n1223#3,6:582\n*S KotlinDebug\n*F\n+ 1 SavedSignatureBottomSheet.kt\ncom/kakao/kandinsky/signature/ui/SavedSignatureBottomSheetKt$SavedSignatureBottomSheet$3$2\n*L\n104#1:582,6\n*E\n"})
public final class SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.5 extends Lambda implements Function4 {
    public final SheetState A;
    public final Function1 B;
    public final List w;
    public final Function1 x;
    public final Function1 y;
    public final CoroutineScope z;

    public SavedSignatureBottomSheetKt.SavedSignatureBottomSheet.3.2.invoke..inlined.items.default.5(List list0, Function1 function10, Function1 function11, CoroutineScope coroutineScope0, SheetState sheetState0, Function1 function12) {
        this.w = list0;
        this.x = function10;
        this.y = function11;
        this.z = coroutineScope0;
        this.A = sheetState0;
        this.B = function12;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.invoke(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope0, int v, @Nullable Composer composer0, int v1) {
        int v3;
        int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
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
        Signature signature0 = (Signature)this.w.get(v);
        if(signature0 instanceof Image) {
            v3 = string.saved_signature_image_type;
        }
        else if(signature0 instanceof Text) {
            v3 = string.saved_signature_text_type;
        }
        else {
            throw new NoWhenBranchMatchedException();
        }
        String s = StringResources_androidKt.stringResource(v3, composer0, 0);
        a a0 = new a(this.y, signature0, this.z, this.A, this.B, 2);
        composer0.startReplaceGroup(0xBD2F6A0C);
        Function1 function10 = this.x;
        boolean z = composer0.changed(function10);
        boolean z1 = composer0.changed(signature0);
        p9.a a1 = composer0.rememberedValue();
        if(z || z1 || a1 == Composer.Companion.getEmpty()) {
            a1 = new p9.a(9, function10, signature0);
            composer0.updateRememberedValue(a1);
        }
        composer0.endReplaceGroup();
        SavedSignatureBottomSheetKt.access$SignatureContainer(s, a0, a1, ComposableLambdaKt.rememberComposableLambda(0x66D41664, true, new h(signature0), composer0, 54), composer0, 0xC00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

