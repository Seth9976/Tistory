package jb;

import com.kakao.kphotopicker.PickerViewModel;
import com.kakao.kphotopicker.picker.Folder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public final PickerViewModel w;
    public final boolean x;

    public y(PickerViewModel pickerViewModel0, boolean z) {
        this.w = pickerViewModel0;
        this.x = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ArrayList arrayList0 = new ArrayList();
        Intrinsics.checkNotNull(((List)object0));
        Folder folder0 = Folder.Companion.getAllItemsFolder(((List)object0));
        arrayList0.add(folder0);
        arrayList0.addAll(((List)object0));
        this.w.getFolderItemList().setValue(arrayList0);
        PickerViewModel.access$onLoadFolders(this.w, this.x, folder0);
        return Unit.INSTANCE;
    }
}

