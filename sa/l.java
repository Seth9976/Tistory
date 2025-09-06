package sa;

import aa.w;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import ce.e;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.signature.ComposableSingletons.SignatureScreenKt;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.signature.contract.SignatureState.Text;
import com.kakao.kandinsky.signature.contract.SignatureState;
import com.kakao.kandinsky.signature.ui.SignatureMenu;
import com.kakao.kandinsky.signature.ui.SignatureMenuKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class l extends Lambda implements Function2 {
    public final SignatureState w;
    public final State x;

    public l(SignatureState signatureState0, State state0) {
        this.w = signatureState0;
        this.x = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x643FD868, v, -1, "com.kakao.kandinsky.signature.SignatureScreen.<anonymous>.<anonymous> (SignatureScreen.kt:105)");
        }
        State state0 = this.x;
        Signature signature0 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getSelectedSignature();
        SignatureMenu signatureMenu0 = null;
        Image signature$Image0 = signature0 instanceof Image ? ((Image)signature0) : null;
        composer0.startReplaceGroup(607478069);
        if(signature$Image0 != null) {
            Function1 function10 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnChangeSignAlpha();
            ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(0.0f, 100.0f);
            KDSliderKt.KDSlider(null, false, signature$Image0.getAlpha(), function10, 100.0f, h.w, false, "%s", 0, closedFloatingPointRange0, composer0, 0xC36000, 323);
        }
        composer0.endReplaceGroup();
        SignatureState signatureState0 = this.w;
        if(signatureState0 instanceof Text) {
            signatureMenu0 = SignatureMenu.Text;
        }
        else if(signatureState0 instanceof com.kakao.kandinsky.signature.contract.SignatureState.Image) {
            signatureMenu0 = SignatureMenu.Image;
        }
        composer0.startReplaceGroup(607479197);
        boolean z = composer0.changed(state0);
        w w0 = composer0.rememberedValue();
        if(z || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(state0, 13);
            composer0.updateRememberedValue(w0);
        }
        composer0.endReplaceGroup();
        SignatureMenuKt.SignatureMenu(signatureMenu0, w0, composer0, 0);
        boolean z1 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).isSingleImage();
        composer0.startReplaceGroup(607480008);
        boolean z2 = composer0.changed(state0);
        i i0 = composer0.rememberedValue();
        if(z2 || i0 == Composer.Companion.getEmpty()) {
            i0 = new i(state0);
            composer0.updateRememberedValue(i0);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(607481395);
        boolean z3 = composer0.changed(state0);
        j j0 = composer0.rememberedValue();
        if(z3 || j0 == Composer.Companion.getEmpty()) {
            j0 = new j(state0);
            composer0.updateRememberedValue(j0);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(607480656);
        boolean z4 = composer0.changed(state0);
        k k0 = composer0.rememberedValue();
        if(z4 || k0 == Composer.Companion.getEmpty()) {
            k0 = new k(state0);
            composer0.updateRememberedValue(k0);
        }
        composer0.endReplaceGroup();
        FeatureBottomBarKt.CommonFeatureBottomBar(z1, i0, j0, k0, ComposableSingletons.SignatureScreenKt.INSTANCE.getLambda-1$signature_release(), composer0, 0x6000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

