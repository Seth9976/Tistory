package sa;

import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.signature.contract.SignatureState.TextEditor;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final TextEditor w;

    public f(TextEditor signatureState$TextEditor0) {
        this.w = signatureState$TextEditor0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((TextData)object0), "textData");
        Logger.INSTANCE.log("texteditor confirm " + ((TextData)object0) + ", " + ((Boolean)object1).booleanValue());
        this.w.getOnChange().invoke(((TextData)object0), ((Boolean)object1));
        return Unit.INSTANCE;
    }
}

