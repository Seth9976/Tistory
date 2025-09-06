package sa;

import com.kakao.kandinsky.signature.SignatureVieModel.handleIntent.4.invoke..inlined.map.1;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureEvent.ShowHistory;
import com.kakao.kandinsky.textedit.contract.FontData;
import com.kakao.kdtracker.KDTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function0 {
    public final List w;
    public final SignatureVieModel x;

    public a0(List list0, SignatureVieModel signatureVieModel0) {
        this.w = list0;
        this.x = signatureVieModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "history-tab", null, null, 12, null);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(this.w, 10));
        for(Object object0: this.w) {
            arrayList0.add(((FontData)object0).getResource());
        }
        ShowHistory signatureEvent$ShowHistory0 = new ShowHistory(new SignatureVieModel.handleIntent.4.invoke..inlined.map.1(this.x.L0.getAllFlow(), arrayList0));
        this.x.sendEvent(signatureEvent$ShowHistory0);
        return Unit.INSTANCE;
    }
}

