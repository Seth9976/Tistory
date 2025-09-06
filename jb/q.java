package jb;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.kphotopicker.PickerFragment;
import com.kakao.kphotopicker.util.MediaPermissionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final PickerFragment w;

    public q(PickerFragment pickerFragment0) {
        this.w = pickerFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        PickerFragment pickerFragment0 = this.w;
        RecyclerView recyclerView0 = PickerFragment.access$getBinding(pickerFragment0).kePickerPhotos;
        ConcatAdapter concatAdapter0 = ((MediaPermissionState)object0).isPartiallyGranted() ? new ConcatAdapter(new Adapter[]{pickerFragment0.h(), PickerFragment.access$getMediaPermissionActionAdapter(pickerFragment0)}) : pickerFragment0.h();
        recyclerView0.setAdapter(concatAdapter0);
        return Unit.INSTANCE;
    }
}

