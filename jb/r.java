package jb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.google.firebase.messaging.ServiceStarter;
import com.kakao.kphotopicker.PickerViewModel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class r implements Callable {
    public final int a;
    public final Object b;
    public final Parcelable c;

    public r(Object object0, Parcelable parcelable0, int v) {
        this.a = v;
        this.b = object0;
        this.c = parcelable0;
        super();
    }

    @Override
    public final Object call() {
        Parcelable parcelable0 = this.c;
        Object object0 = this.b;
        switch(this.a) {
            case 0: {
                Intrinsics.checkNotNullParameter(((PickerViewModel)object0), "this$0");
                Intrinsics.checkNotNullParameter(((Uri)parcelable0), "$it");
                return ((PickerViewModel)object0).H0.loadCameraVideo(((Uri)parcelable0));
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((PickerViewModel)object0), "this$0");
                return ((PickerViewModel)object0).H0.loadCameraPhoto(((Uri)parcelable0));
            }
            default: {
                return ServiceStarter.a().startMessagingService(((Context)object0), ((Intent)parcelable0));
            }
        }
    }
}

