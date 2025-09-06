package com.kakao.tistory.presentation.viewmodel;

import com.kakao.keditor.KeditorView;
import com.kakao.keditor.plugin.attrs.item.Uploadable.DefaultImpls;
import com.kakao.keditor.plugin.itemspec.file.FileItem;
import com.kakao.keditor.plugin.itemspec.video.VideoItem;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class k0 extends SuspendLambda implements Function2 {
    public List a;
    public IntRef b;
    public EditorViewModel c;
    public Iterator d;
    public int e;
    public int f;
    public Object g;
    public final EditorViewModel h;
    public final p0 i;

    public k0(EditorViewModel editorViewModel0, p0 p00, Continuation continuation0) {
        this.h = editorViewModel0;
        this.i = p00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new k0(this.h, this.i, continuation0);
        continuation1.g = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object6;
        Iterator iterator4;
        EditorViewModel editorViewModel1;
        Iterator iterator2;
        List list1;
        EditorViewModel editorViewModel0;
        int v1;
        CoroutineScope coroutineScope1;
        IntRef ref$IntRef0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.f) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.g;
                KeditorView keditorView0 = this.h.s;
                if(keditorView0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("keditor");
                    keditorView0 = null;
                }
                List list0 = keditorView0.localUploadableItems();
                int v = list0.size();
                ref$IntRef0 = new IntRef();
                if(v != 0) {
                    this.h.S.postValue(new Event(new Pair(Boxing.boxInt(0), Boxing.boxInt(v))));
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: list0) {
                    if(object2 instanceof FileItem) {
                        arrayList0.add(object2);
                    }
                }
                Iterator iterator1 = arrayList0.iterator();
                coroutineScope1 = coroutineScope0;
                v1 = v;
                editorViewModel0 = this.h;
                list1 = list0;
                iterator2 = iterator1;
                goto label_42;
            }
            case 1: {
                v1 = this.e;
                iterator2 = this.d;
                editorViewModel0 = this.c;
                ref$IntRef0 = this.b;
                list1 = this.a;
                coroutineScope1 = (CoroutineScope)this.g;
                ResultKt.throwOnFailure(object0);
                Object object3 = object0;
                while(true) {
                    if(!((Boolean)object3).booleanValue()) {
                        editorViewModel0.S.postValue(new Event(null));
                        return Unit.INSTANCE;
                    }
                    int v2 = ref$IntRef0.element + 1;
                    ref$IntRef0.element = v2;
                    editorViewModel0.S.postValue(new Event(new Pair(Boxing.boxInt(v2), Boxing.boxInt(v1))));
                label_42:
                    if(!iterator2.hasNext()) {
                        break;
                    }
                    Object object4 = iterator2.next();
                    this.g = coroutineScope1;
                    this.a = list1;
                    this.b = ref$IntRef0;
                    this.c = editorViewModel0;
                    this.d = iterator2;
                    this.e = v1;
                    this.f = 1;
                    object3 = EditorViewModel.access$uploadFile(editorViewModel0, editorViewModel0.getBlogName(), ((FileItem)object4), this);
                    if(object3 != object1) {
                        continue;
                    }
                    return object1;
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object5: list1) {
                    if(object5 instanceof ImageItem) {
                        arrayList1.add(object5);
                    }
                }
                editorViewModel1 = this.h;
                iterator4 = arrayList1.iterator();
                goto label_78;
            }
            case 2: {
                v1 = this.e;
                iterator4 = this.d;
                editorViewModel1 = this.c;
                ref$IntRef0 = this.b;
                list1 = this.a;
                coroutineScope1 = (CoroutineScope)this.g;
                ResultKt.throwOnFailure(object0);
                object6 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(!((Boolean)object6).booleanValue()) {
                editorViewModel1.S.postValue(new Event(null));
                return Unit.INSTANCE;
            }
            int v3 = ref$IntRef0.element + 1;
            ref$IntRef0.element = v3;
            editorViewModel1.S.postValue(new Event(new Pair(Boxing.boxInt(v3), Boxing.boxInt(v1))));
        label_78:
            if(!iterator4.hasNext()) {
                break;
            }
            Object object7 = iterator4.next();
            this.g = coroutineScope1;
            this.a = list1;
            this.b = ref$IntRef0;
            this.c = editorViewModel1;
            this.d = iterator4;
            this.e = v1;
            this.f = 2;
            object6 = EditorViewModel.access$uploadImage(editorViewModel1, editorViewModel1.getBlogName(), ((ImageItem)object7), this);
            if(object6 != object1) {
                continue;
            }
            return object1;
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object8: list1) {
            if(object8 instanceof VideoItem) {
                arrayList2.add(object8);
            }
        }
        EditorViewModel editorViewModel2 = this.h;
        Iterator iterator6 = arrayList2.iterator();
        if(iterator6.hasNext()) {
            Object object9 = iterator6.next();
            DefaultImpls.uploadFailed$default(((VideoItem)object9), null, 1, null);
            editorViewModel2.u.postValue(new Event(Boxing.boxInt(string.label_dialog_video_upload_fail_title)));
            return Unit.INSTANCE;
        }
        CoroutineScopeKt.ensureActive(coroutineScope1);
        this.h.S.postValue(new Event(null));
        this.i.invoke();
        return Unit.INSTANCE;
    }
}

