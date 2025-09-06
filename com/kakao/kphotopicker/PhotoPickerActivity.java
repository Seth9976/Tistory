package com.kakao.kphotopicker;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.o0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.kakao.editortracker.EditorTracker;
import com.kakao.kphotopicker.camera.CameraBottomSheetDialogFragment;
import com.kakao.kphotopicker.camera.CameraBottomSheetViewModel;
import com.kakao.kphotopicker.loader.GalleryType;
import com.kakao.kphotopicker.util.MediaPermissionState;
import com.kakao.kphotopicker.util.PermissionUtil;
import java.io.File;
import java.util.List;
import jb.f;
import jb.g;
import jb.h;
import jb.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001F\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ/\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u00102\u000E\u0010\u0014\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001A"}, d2 = {"Lcom/kakao/kphotopicker/PhotoPickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroidx/fragment/app/Fragment;", "fragment", "", "addToBackStack", "replaceFragment", "(Landroidx/fragment/app/Fragment;Z)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onClickCameraIcon", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPhotoPickerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoPickerActivity.kt\ncom/kakao/kphotopicker/PhotoPickerActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n75#2,13:415\n75#2,13:428\n12504#3,2:441\n12504#3,2:443\n1#4:445\n*S KotlinDebug\n*F\n+ 1 PhotoPickerActivity.kt\ncom/kakao/kphotopicker/PhotoPickerActivity\n*L\n44#1:415,13\n45#1:428,13\n223#1:441,2\n231#1:443,2\n*E\n"})
public final class PhotoPickerActivity extends AppCompatActivity {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[GalleryType.values().length];
            try {
                arr_v[GalleryType.AllMedia.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GalleryType.VideoOnly.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[GalleryType.ImageOnly.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final ViewModelLazy A;
    public final Lazy B;
    public final ActivityResultLauncher C;
    public final ActivityResultLauncher D;
    public final ActivityResultLauncher E;
    public Uri F;
    public File G;
    public static final int H;
    public List y;
    public final ViewModelLazy z;

    public PhotoPickerActivity() {
        com.kakao.kphotopicker.PhotoPickerActivity.special..inlined.viewModels.default.1 photoPickerActivity$special$$inlined$viewModels$default$10 = new Function0() {
            public final ComponentActivity w;

            {
                this.w = componentActivity0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.w.getDefaultViewModelProviderFactory();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.z = new ViewModelLazy(Reflection.getOrCreateKotlinClass(CameraBottomSheetViewModel.class), new Function0() {
            public final ComponentActivity w;

            {
                this.w = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.w.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, photoPickerActivity$special$$inlined$viewModels$default$10, new Function0(this) {
            public final Function0 w;
            public final ComponentActivity x;

            {
                this.w = function00;
                this.x = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.w;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.x.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.x.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        e e0 = new e(this);
        this.A = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PickerViewModel.class), new Function0() {
            public final ComponentActivity w;

            {
                this.w = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.w.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, e0, new Function0(this) {
            public final Function0 w;
            public final ComponentActivity x;

            {
                this.w = function00;
                this.x = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.w;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.x.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.x.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.B = c.lazy(new f(this, 0));
        ActivityResultLauncher activityResultLauncher0 = this.registerForActivityResult(new StartActivityForResult(), new jb.c(this, 0));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncher0, "registerForActivityResult(...)");
        this.C = activityResultLauncher0;
        ActivityResultLauncher activityResultLauncher1 = this.registerForActivityResult(new StartActivityForResult(), new jb.c(this, 1));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncher1, "registerForActivityResult(...)");
        this.D = activityResultLauncher1;
        ActivityResultLauncher activityResultLauncher2 = this.registerForActivityResult(new StartActivityForResult(), new jb.c(this, 2));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncher2, "registerForActivityResult(...)");
        this.E = activityResultLauncher2;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
        public final class com.kakao.kphotopicker.PhotoPickerActivity.special..inlined.viewModels.default.4 extends Lambda implements Function0 {
            public final ComponentActivity w;

            public com.kakao.kphotopicker.PhotoPickerActivity.special..inlined.viewModels.default.4(ComponentActivity componentActivity0) {
                this.w = componentActivity0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.w.getDefaultViewModelProviderFactory();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    public static final EditorTracker access$getEditorTracker(PhotoPickerActivity photoPickerActivity0) {
        return (EditorTracker)photoPickerActivity0.B.getValue();
    }

    public static final Pair access$getImageBounds(PhotoPickerActivity photoPickerActivity0, String s) {
        photoPickerActivity0.getClass();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, bitmapFactory$Options0);
        return new Pair(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight);
    }

    public static final void access$showPermissionDialogForGallery(PhotoPickerActivity photoPickerActivity0) {
        photoPickerActivity0.getClass();
        int v = string.kphotopicker_permission_message_to_use_gallery;
        f f0 = new f(photoPickerActivity0, 4);
        f f1 = new f(photoPickerActivity0, 5);
        PermissionUtil.INSTANCE.showPermissionDialog(photoPickerActivity0, v, f0, f1);
    }

    public static final void access$showTakePicturePermissionDialog(PhotoPickerActivity photoPickerActivity0) {
        photoPickerActivity0.getClass();
        PermissionUtil.showPermissionDialog$default(PermissionUtil.INSTANCE, photoPickerActivity0, string.kphotopicker_permission_message_to_take_picture, null, null, 12, null);
    }

    public static final void access$showTakeVideoPermissionDialog(PhotoPickerActivity photoPickerActivity0) {
        photoPickerActivity0.getClass();
        PermissionUtil.showPermissionDialog$default(PermissionUtil.INSTANCE, photoPickerActivity0, string.kphotopicker_permission_message_to_take_video, null, null, 12, null);
    }

    public final Uri g(Uri uri0) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("title", "20250906_081142");
        contentValues0.put("relative_path", Environment.DIRECTORY_DCIM);
        Uri uri1 = this.getContentResolver().insert(uri0, contentValues0);
        this.F = uri1;
        return uri1;
    }

    public final PickerViewModel h() {
        return (PickerViewModel)this.A.getValue();
    }

    public final void i() {
        Uri uri1;
        f f0 = new f(this, 2);
        if(PermissionUtil.INSTANCE.requestPermission(this, new String[]{"android.permission.CAMERA"}, 0x840, f0)) {
            Intent intent0 = new Intent("android.media.action.IMAGE_CAPTURE");
            if(intent0.resolveActivity(this.getPackageManager()) != null) {
                if(Build.VERSION.SDK_INT >= 29) {
                    Uri uri0 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    Intrinsics.checkNotNullExpressionValue(uri0, "EXTERNAL_CONTENT_URI");
                    uri1 = this.g(uri0);
                }
                else {
                    File file0 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "20250906_081142.jpg");
                    this.G = file0;
                    uri1 = FileProvider.getUriForFile(this, "net.daum.android.tistoryapp.fileprovider", file0);
                    Intrinsics.checkNotNullExpressionValue(uri1, "getUriForFile(...)");
                }
                intent0.putExtra("output", uri1);
                this.C.launch(intent0);
            }
        }
    }

    public final void j() {
        f f0 = new f(this, 3);
        if(PermissionUtil.INSTANCE.requestPermission(this, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, 0x841, f0)) {
            Intent intent0 = new Intent("android.media.action.VIDEO_CAPTURE");
            if(Build.VERSION.SDK_INT >= 29) {
                Uri uri0 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(uri0, "EXTERNAL_CONTENT_URI");
                intent0.putExtra("output", this.g(uri0));
            }
            if(intent0.resolveActivity(this.getPackageManager()) != null) {
                this.D.launch(intent0);
            }
        }
    }

    public final void onClickCameraIcon() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.h().getConfig().getPickerType().ordinal()]) {
            case 1: {
                new CameraBottomSheetDialogFragment().show(this.getSupportFragmentManager(), "CAMERA");
                return;
            }
            case 2: {
                this.j();
                PickerViewModel.clickEvent$default(this.h(), "camera-video", null, 2, null);
                return;
            }
            case 3: {
                this.i();
                PickerViewModel.clickEvent$default(this.h(), "camera-image", null, 2, null);
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        this.supportRequestWindowFeature(1);
        super.onCreate(bundle0);
        this.getWindow().setFlags(0x400, 0x400);
        this.setContentView(layout.kphotopicker_activity_photo_picker);
        PickerViewModel pickerViewModel0 = this.h();
        pickerViewModel0.getRequestPhotoEditEvent().observe(this, new o0(new g(this), 1));
        pickerViewModel0.getRequestAttacheSelectedListEvent().observe(this, new o0(new h(this), 1));
        pickerViewModel0.getLoadEventWithVersion().observe(this, new o0(new i(this, 0), 1));
        pickerViewModel0.getClickEvent().observe(this, new o0(new i(this, 1), 1));
        CameraBottomSheetViewModel cameraBottomSheetViewModel0 = (CameraBottomSheetViewModel)this.z.getValue();
        cameraBottomSheetViewModel0.getOnClickPhoto().observe(this, new o0(new i(this, 2), 1));
        cameraBottomSheetViewModel0.getOnClickVideo().observe(this, new o0(new i(this, 3), 1));
        GalleryType galleryType0 = this.h().getGalleryType();
        f f0 = new f(this, 1);
        PermissionUtil.INSTANCE.requestMediaPermission(this, galleryType0, 0x83F, f0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int v, @NotNull String[] arr_s, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_s, "permissions");
        Intrinsics.checkNotNullParameter(arr_v, "grantResults");
        super.onRequestPermissionsResult(v, arr_s, arr_v);
        int v1 = 0;
        switch(v) {
            case 0x83F: {
                PermissionUtil permissionUtil0 = PermissionUtil.INSTANCE;
                MediaPermissionState mediaPermissionState0 = permissionUtil0.checkMediaPermissionState(arr_s, arr_v);
                if(mediaPermissionState0.isDenied()) {
                    permissionUtil0.showPermissionDialog(this, string.kphotopicker_permission_message_to_use_gallery, new f(this, 4), new f(this, 5));
                    return;
                }
                this.h().loadFolders();
                this.h().setMediaPermissionState(mediaPermissionState0);
                permissionUtil0.reRequestMediaPermissionWhenGranted$kphotopicker_release(this, mediaPermissionState0);
                return;
            }
            case 0x840: {
                while(v1 < arr_v.length) {
                    if(arr_v[v1] == -1) {
                        PermissionUtil.showPermissionDialog$default(PermissionUtil.INSTANCE, this, string.kphotopicker_permission_message_to_take_picture, null, null, 12, null);
                        return;
                    }
                    ++v1;
                }
                this.i();
                return;
            }
            case 0x841: {
                break;
            }
            default: {
                return;
            }
        }
        while(v1 < arr_v.length) {
            if(arr_v[v1] == -1) {
                PermissionUtil.showPermissionDialog$default(PermissionUtil.INSTANCE, this, string.kphotopicker_permission_message_to_take_video, null, null, 12, null);
                return;
            }
            ++v1;
        }
        this.j();
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        MediaPermissionState mediaPermissionState0 = PermissionUtil.INSTANCE.checkMediaPermissionState(this);
        if(mediaPermissionState0.isGranted()) {
            this.h().loadFolders();
            this.h().setMediaPermissionState(mediaPermissionState0);
        }
    }

    public final void replaceFragment(@NotNull Fragment fragment0, boolean z) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        FragmentTransaction fragmentTransaction0 = this.getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransaction0, "beginTransaction(...)");
        fragmentTransaction0.replace(id.content_view, fragment0, "");
        if(z) {
            fragmentTransaction0.addToBackStack("");
        }
        fragmentTransaction0.commit();
    }

    public static void replaceFragment$default(PhotoPickerActivity photoPickerActivity0, Fragment fragment0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        photoPickerActivity0.replaceFragment(fragment0, z);
    }
}

