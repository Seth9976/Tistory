package com.kakao.kphotopicker.picker.item;

import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.datepicker.t;
import com.kakao.kphotopicker.ItemClickListener;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.databinding.KphotopickerItemCameraPickerBinding;
import com.kakao.kphotopicker.widget.ContentDescriptionKt;
import hc.d;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.BehaviorSubject;
import j0.b2;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/kphotopicker/picker/item/CameraItemView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/kakao/kphotopicker/databinding/KphotopickerItemCameraPickerBinding;", "binding", "Lcom/kakao/kphotopicker/ItemClickListener;", "itemClickListener", "<init>", "(Lcom/kakao/kphotopicker/databinding/KphotopickerItemCameraPickerBinding;Lcom/kakao/kphotopicker/ItemClickListener;)V", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CameraItemView extends ViewHolder {
    public final BehaviorSubject c;
    public static final int d;

    public CameraItemView(@NotNull KphotopickerItemCameraPickerBinding kphotopickerItemCameraPickerBinding0, @Nullable ItemClickListener itemClickListener0) {
        Intrinsics.checkNotNullParameter(kphotopickerItemCameraPickerBinding0, "binding");
        super(kphotopickerItemCameraPickerBinding0.getRoot());
        BehaviorSubject behaviorSubject0 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubject0, "create(...)");
        this.c = behaviorSubject0;
        behaviorSubject0.throttleFirst(1L, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).subscribe(new d(new b2(6, itemClickListener0, this), 6));
        t t0 = new t(this, 19);
        this.itemView.setOnClickListener(t0);
        Intrinsics.checkNotNullExpressionValue(this.itemView, "itemView");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(Button.class);
        ContentDescriptionKt.applyAccessibilityInfo$default(this.itemView, kClass0, null, null, null, 14, null);
        Intrinsics.checkNotNullExpressionValue(this.itemView, "itemView");
        ContentDescriptionKt.setContentDescriptionWith(this.itemView, string.cd_picker_take_picture, new Object[0]);
    }
}

