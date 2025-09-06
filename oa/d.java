package oa;

import com.kakao.kandinsky.core.filter.ViewFilterEngine;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public ViewFilterEngine o;
    public KDPhoto p;
    public Object q;
    public Object r;
    public final PreviewTextureLoader s;
    public int t;

    public d(PreviewTextureLoader previewTextureLoader0, Continuation continuation0) {
        this.s = previewTextureLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return PreviewTextureLoader.access$update(this.s, null, null, null, this);
    }
}

