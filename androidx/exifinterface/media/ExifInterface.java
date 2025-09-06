package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager.AssetInputStream;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import e4.b;
import e4.c;
import e4.d;
import e4.e;
import e4.f;
import e4.g;
import e4.h;
import e4.i;
import g.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.text.q;

public class ExifInterface {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExifStreamType {
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IfdType {
    }

    public static final byte[] A = null;
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    public static final byte[] B = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = null;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = null;
    public static final int[] BITS_PER_SAMPLE_RGB = null;
    public static final byte[] C = null;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 0xFFFF;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final byte[] D = null;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 0x884C;
    public static final int DATA_PACK_BITS_COMPRESSED = 0x8005;
    public static final int DATA_UNCOMPRESSED = 1;
    public static final byte[] E = null;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final byte[] F = null;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 0x20;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 0x40;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final byte[] G = null;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    public static final byte[] H = null;
    public static final byte[] I = null;
    public static final byte[] J = null;
    public static final byte[] K = null;
    public static final byte[] L = null;
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 0xFF;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    public static final byte[] M = null;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 0xFF;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    public static final byte[] N = null;
    public static final byte[] O = null;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    public static final byte[] P = null;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    public static final byte[] Q = null;
    public static final SimpleDateFormat R = null;
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    public static final SimpleDateFormat S = null;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String[] T = null;
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";
    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_OFFSET_TIME = "OffsetTime";
    public static final String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    @RestrictTo({Scope.LIBRARY})
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";
    public static final int[] U = null;
    public static final byte[] V = null;
    public static final e W = null;
    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;
    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final e[][] X = null;
    public static final e[] Y = null;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    public static final HashMap[] Z;
    public String a;
    public static final HashMap[] a0;
    public FileDescriptor b;
    public static final HashSet b0;
    public AssetManager.AssetInputStream c;
    public static final HashMap c0;
    public int d;
    public static final Charset d0;
    public final boolean e;
    public static final byte[] e0;
    public final HashMap[] f;
    public static final byte[] f0;
    public final HashSet g;
    public static final Pattern g0;
    public ByteOrder h;
    public static final Pattern h0;
    public boolean i;
    public static final Pattern i0;
    public boolean j;
    public static final Pattern j0;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public static final boolean v;
    public static final List w;
    public static final List x;
    public static final byte[] y;
    public static final byte[] z;

    static {
        ExifInterface.v = Log.isLoggable("ExifInterface", 3);
        ExifInterface.w = Arrays.asList(new Integer[]{1, 6, 3, 8});
        ExifInterface.x = Arrays.asList(new Integer[]{2, 7, 4, 5});
        ExifInterface.BITS_PER_SAMPLE_RGB = new int[]{8, 8, 8};
        ExifInterface.BITS_PER_SAMPLE_GREYSCALE_1 = new int[]{4};
        ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2 = new int[]{8};
        ExifInterface.y = new byte[]{-1, -40, -1};
        ExifInterface.z = new byte[]{102, 0x74, 0x79, 0x70};
        ExifInterface.A = new byte[]{109, 105, 102, 49};
        ExifInterface.B = new byte[]{104, 101, 105, 99};
        ExifInterface.C = new byte[]{0x4F, 76, 89, 77, 80, 0};
        ExifInterface.D = new byte[]{0x4F, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        ExifInterface.E = new byte[]{(byte)0x89, 80, 78, 71, 13, 10, 26, 10};
        ExifInterface.F = new byte[]{101, 88, 73, 102};
        ExifInterface.G = new byte[]{73, 72, 68, 82};
        ExifInterface.H = new byte[]{73, 69, 78, 68};
        ExifInterface.I = new byte[]{82, 73, 70, 70};
        ExifInterface.J = new byte[]{87, 69, 66, 80};
        ExifInterface.K = new byte[]{69, 88, 73, 70};
        ExifInterface.L = new byte[]{-99, 1, 42};
        ExifInterface.M = "VP8X".getBytes(Charset.defaultCharset());
        ExifInterface.N = "VP8L".getBytes(Charset.defaultCharset());
        ExifInterface.O = "VP8 ".getBytes(Charset.defaultCharset());
        ExifInterface.P = "ANIM".getBytes(Charset.defaultCharset());
        ExifInterface.Q = "ANMF".getBytes(Charset.defaultCharset());
        ExifInterface.T = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        ExifInterface.U = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        ExifInterface.V = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        e[] arr_e = {new e("NewSubfileType", 0xFE, 4), new e("SubfileType", 0xFF, 4), new e("ImageWidth", 0x100, 3, 4), new e("ImageLength", 0x101, 3, 4), new e("BitsPerSample", 0x102, 3), new e("Compression", 0x103, 3), new e("PhotometricInterpretation", 0x106, 3), new e("ImageDescription", 270, 2), new e("Make", 0x10F, 2), new e("Model", 0x110, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 0x13F, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 0x201, 4), new e("JPEGInterchangeFormatLength", 0x202, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 0x8298, 2), new e("ExifIFDPointer", 0x8769, 4), new e("GPSInfoIFDPointer", 0x8825, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e e0 = new e("ExposureTime", 0x829A, 5);
        e e1 = new e("FNumber", 0x829D, 5);
        e e2 = new e("ExposureProgram", 34850, 3);
        e e3 = new e("SpectralSensitivity", 0x8824, 2);
        e e4 = new e("PhotographicSensitivity", 0x8827, 3);
        e e5 = new e("OECF", 0x8828, 7);
        e e6 = new e("SensitivityType", 0x8830, 3);
        e e7 = new e("StandardOutputSensitivity", 0x8831, 4);
        e e8 = new e("RecommendedExposureIndex", 0x8832, 4);
        e e9 = new e("ISOSpeed", 0x8833, 4);
        e e10 = new e("ISOSpeedLatitudeyyy", 0x8834, 4);
        e e11 = new e("ISOSpeedLatitudezzz", 0x8835, 4);
        e e12 = new e("ExifVersion", 0x9000, 2);
        e e13 = new e("DateTimeOriginal", 0x9003, 2);
        e e14 = new e("DateTimeDigitized", 0x9004, 2);
        e e15 = new e("OffsetTime", 0x9010, 2);
        e e16 = new e("OffsetTimeOriginal", 0x9011, 2);
        e e17 = new e("OffsetTimeDigitized", 0x9012, 2);
        e e18 = new e("ComponentsConfiguration", 0x9101, 7);
        e e19 = new e("CompressedBitsPerPixel", 0x9102, 5);
        e e20 = new e("ShutterSpeedValue", 0x9201, 10);
        e e21 = new e("ApertureValue", 0x9202, 5);
        e e22 = new e("BrightnessValue", 0x9203, 10);
        e e23 = new e("ExposureBiasValue", 0x9204, 10);
        e e24 = new e("MaxApertureValue", 0x9205, 5);
        e e25 = new e("SubjectDistance", 0x9206, 5);
        e e26 = new e("MeteringMode", 0x9207, 3);
        e e27 = new e("LightSource", 0x9208, 3);
        e e28 = new e("Flash", 0x9209, 3);
        e e29 = new e("FocalLength", 0x920A, 5);
        e e30 = new e("SubjectArea", 0x9214, 3);
        e e31 = new e("MakerNote", 37500, 7);
        e e32 = new e("UserComment", 37510, 7);
        e e33 = new e("SubSecTime", 0x9290, 2);
        e e34 = new e("SubSecTimeOriginal", 0x9291, 2);
        e e35 = new e("SubSecTimeDigitized", 0x9292, 2);
        e e36 = new e("FlashpixVersion", 0xA000, 7);
        e e37 = new e("ColorSpace", 0xA001, 3);
        e e38 = new e("PixelXDimension", 0xA002, 3, 4);
        e e39 = new e("PixelYDimension", 0xA003, 3, 4);
        e e40 = new e("RelatedSoundFile", 0xA004, 2);
        e e41 = new e("InteroperabilityIFDPointer", 0xA005, 4);
        e e42 = new e("FlashEnergy", 0xA20B, 5);
        e e43 = new e("SpatialFrequencyResponse", 0xA20C, 7);
        e e44 = new e("FocalPlaneXResolution", 0xA20E, 5);
        e e45 = new e("FocalPlaneYResolution", 0xA20F, 5);
        e e46 = new e("FocalPlaneResolutionUnit", 0xA210, 3);
        e e47 = new e("SubjectLocation", 0xA214, 3);
        e e48 = new e("ExposureIndex", 0xA215, 5);
        e e49 = new e("SensingMethod", 0xA217, 3);
        e e50 = new e("FileSource", 0xA300, 7);
        e e51 = new e("SceneType", 0xA301, 7);
        e e52 = new e("CFAPattern", 0xA302, 7);
        e e53 = new e("CustomRendered", 0xA401, 3);
        e e54 = new e("ExposureMode", 0xA402, 3);
        e e55 = new e("WhiteBalance", 0xA403, 3);
        e e56 = new e("DigitalZoomRatio", 0xA404, 5);
        e e57 = new e("FocalLengthIn35mmFilm", 0xA405, 3);
        e e58 = new e("SceneCaptureType", 0xA406, 3);
        e e59 = new e("GainControl", 0xA407, 3);
        e e60 = new e("Contrast", 0xA408, 3);
        e e61 = new e("Saturation", 0xA409, 3);
        e e62 = new e("Sharpness", 0xA40A, 3);
        e e63 = new e("DeviceSettingDescription", 0xA40B, 7);
        e e64 = new e("SubjectDistanceRange", 0xA40C, 3);
        e e65 = new e("ImageUniqueID", 0xA420, 2);
        e e66 = new e("CameraOwnerName", 0xA430, 2);
        e e67 = new e("BodySerialNumber", 42033, 2);
        e e68 = new e("LensSpecification", 42034, 5);
        e e69 = new e("LensMake", 42035, 2);
        e e70 = new e("LensModel", 42036, 2);
        e e71 = new e("Gamma", 0xA500, 5);
        e e72 = new e("DNGVersion", 50706, 1);
        e e73 = new e("DefaultCropSize", 50720, 3, 4);
        e e74 = new e("GPSVersionID", 0, 1);
        e e75 = new e("GPSLatitudeRef", 1, 2);
        e e76 = new e("GPSLatitude", 2, 5, 10);
        e e77 = new e("GPSLongitudeRef", 3, 2);
        e e78 = new e("GPSLongitude", 4, 5, 10);
        e e79 = new e("GPSAltitudeRef", 5, 1);
        e e80 = new e("GPSAltitude", 6, 5);
        e e81 = new e("GPSTimeStamp", 7, 5);
        e e82 = new e("GPSSatellites", 8, 2);
        e e83 = new e("GPSStatus", 9, 2);
        e e84 = new e("GPSMeasureMode", 10, 2);
        e e85 = new e("GPSDOP", 11, 5);
        e e86 = new e("GPSSpeedRef", 12, 2);
        e e87 = new e("GPSSpeed", 13, 5);
        e e88 = new e("GPSTrackRef", 14, 2);
        e e89 = new e("GPSTrack", 15, 5);
        e e90 = new e("GPSImgDirectionRef", 16, 2);
        e e91 = new e("GPSImgDirection", 17, 5);
        e e92 = new e("GPSMapDatum", 18, 2);
        e e93 = new e("GPSDestLatitudeRef", 19, 2);
        e e94 = new e("GPSDestLatitude", 20, 5);
        e e95 = new e("GPSDestLongitudeRef", 21, 2);
        e e96 = new e("GPSDestLongitude", 22, 5);
        e e97 = new e("GPSDestBearingRef", 23, 2);
        e e98 = new e("GPSDestBearing", 24, 5);
        e e99 = new e("GPSDestDistanceRef", 25, 2);
        e e100 = new e("GPSDestDistance", 26, 5);
        e e101 = new e("GPSProcessingMethod", 27, 7);
        e e102 = new e("GPSAreaInformation", 28, 7);
        e e103 = new e("GPSDateStamp", 29, 2);
        e e104 = new e("GPSDifferential", 30, 3);
        e e105 = new e("GPSHPositioningError", 0x1F, 5);
        e e106 = new e("InteroperabilityIndex", 1, 2);
        e e107 = new e("NewSubfileType", 0xFE, 4);
        e e108 = new e("SubfileType", 0xFF, 4);
        e e109 = new e("ThumbnailImageWidth", 0x100, 3, 4);
        e e110 = new e("ThumbnailImageLength", 0x101, 3, 4);
        e e111 = new e("BitsPerSample", 0x102, 3);
        e e112 = new e("Compression", 0x103, 3);
        e e113 = new e("PhotometricInterpretation", 0x106, 3);
        e e114 = new e("ImageDescription", 270, 2);
        e e115 = new e("Make", 0x10F, 2);
        e e116 = new e("Model", 0x110, 2);
        e e117 = new e("StripOffsets", 273, 3, 4);
        e e118 = new e("ThumbnailOrientation", 274, 3);
        e e119 = new e("SamplesPerPixel", 277, 3);
        e e120 = new e("RowsPerStrip", 278, 3, 4);
        e e121 = new e("StripByteCounts", 279, 3, 4);
        e e122 = new e("XResolution", 282, 5);
        e e123 = new e("YResolution", 283, 5);
        e e124 = new e("PlanarConfiguration", 284, 3);
        e e125 = new e("ResolutionUnit", 296, 3);
        e e126 = new e("TransferFunction", 301, 3);
        e e127 = new e("Software", 305, 2);
        e e128 = new e("DateTime", 306, 2);
        e e129 = new e("Artist", 315, 2);
        e e130 = new e("WhitePoint", 318, 5);
        e e131 = new e("PrimaryChromaticities", 0x13F, 5);
        e e132 = new e("SubIFDPointer", 330, 4);
        e e133 = new e("JPEGInterchangeFormat", 0x201, 4);
        e e134 = new e("JPEGInterchangeFormatLength", 0x202, 4);
        e e135 = new e("YCbCrCoefficients", 529, 5);
        e e136 = new e("YCbCrSubSampling", 530, 3);
        e e137 = new e("YCbCrPositioning", 531, 3);
        e e138 = new e("ReferenceBlackWhite", 532, 5);
        e e139 = new e("Copyright", 0x8298, 2);
        e e140 = new e("ExifIFDPointer", 0x8769, 4);
        e e141 = new e("GPSInfoIFDPointer", 0x8825, 4);
        e e142 = new e("DNGVersion", 50706, 1);
        e e143 = new e("DefaultCropSize", 50720, 3, 4);
        ExifInterface.W = new e("StripOffsets", 273, 3);
        e e144 = new e("ThumbnailImage", 0x100, 7);
        e e145 = new e("CameraSettingsIFDPointer", 0x2020, 4);
        e e146 = new e("ImageProcessingIFDPointer", 0x2040, 4);
        e e147 = new e("PreviewImageStart", 0x101, 4);
        e e148 = new e("PreviewImageLength", 0x102, 4);
        e e149 = new e("AspectFrame", 4371, 3);
        e e150 = new e("ColorSpace", 55, 3);
        ExifInterface.X = new e[][]{arr_e, new e[]{e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, e23, e24, e25, e26, e27, e28, e29, e30, e31, e32, e33, e34, e35, e36, e37, e38, e39, e40, e41, e42, e43, e44, e45, e46, e47, e48, e49, e50, e51, e52, e53, e54, e55, e56, e57, e58, e59, e60, e61, e62, e63, e64, e65, e66, e67, e68, e69, e70, e71, e72, e73}, new e[]{e74, e75, e76, e77, e78, e79, e80, e81, e82, e83, e84, e85, e86, e87, e88, e89, e90, e91, e92, e93, e94, e95, e96, e97, e98, e99, e100, e101, e102, e103, e104, e105}, new e[]{e106}, new e[]{e107, e108, e109, e110, e111, e112, e113, e114, e115, e116, e117, e118, e119, e120, e121, e122, e123, e124, e125, e126, e127, e128, e129, e130, e131, e132, e133, e134, e135, e136, e137, e138, e139, e140, e141, e142, e143}, arr_e, new e[]{e144, e145, e146}, new e[]{e147, e148}, new e[]{e149}, new e[]{e150}};
        ExifInterface.Y = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 0x8769, 4), new e("GPSInfoIFDPointer", 0x8825, 4), new e("InteroperabilityIFDPointer", 0xA005, 4), new e("CameraSettingsIFDPointer", 0x2020, 1), new e("ImageProcessingIFDPointer", 0x2040, 1)};
        ExifInterface.Z = new HashMap[10];
        ExifInterface.a0 = new HashMap[10];
        ExifInterface.b0 = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
        ExifInterface.c0 = new HashMap();
        Charset charset0 = Charset.forName("US-ASCII");
        ExifInterface.d0 = charset0;
        ExifInterface.e0 = "Exif\u0000\u0000".getBytes(charset0);
        ExifInterface.f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset0);
        Locale locale0 = Locale.US;
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale0);
        ExifInterface.R = simpleDateFormat0;
        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale0);
        ExifInterface.S = simpleDateFormat1;
        simpleDateFormat1.setTimeZone(TimeZone.getTimeZone("UTC"));
        for(int v = 0; true; ++v) {
            e[][] arr2_e = ExifInterface.X;
            if(v >= arr2_e.length) {
                break;
            }
            ExifInterface.Z[v] = new HashMap();
            ExifInterface.a0[v] = new HashMap();
            e[] arr_e1 = arr2_e[v];
            for(int v1 = 0; v1 < arr_e1.length; ++v1) {
                e e151 = arr_e1[v1];
                ExifInterface.Z[v].put(e151.a, e151);
                ExifInterface.a0[v].put(e151.b, e151);
            }
        }
        ExifInterface.c0.put(ExifInterface.Y[0].a, 5);
        ExifInterface.c0.put(ExifInterface.Y[1].a, 1);
        ExifInterface.c0.put(ExifInterface.Y[2].a, 2);
        ExifInterface.c0.put(ExifInterface.Y[3].a, 3);
        ExifInterface.c0.put(ExifInterface.Y[4].a, 7);
        ExifInterface.c0.put(ExifInterface.Y[5].a, 8);
        ExifInterface.g0 = Pattern.compile(".*[1-9].*");
        ExifInterface.h0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        ExifInterface.i0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        ExifInterface.j0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public ExifInterface(@NonNull File file0) throws IOException {
        this.f = new HashMap[ExifInterface.X.length];
        this.g = new HashSet(ExifInterface.X.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(file0 == null) {
            throw new NullPointerException("file cannot be null");
        }
        this.q(file0.getAbsolutePath());
    }

    public ExifInterface(@NonNull FileDescriptor fileDescriptor0) throws IOException {
        Throwable throwable1;
        FileInputStream fileInputStream0;
        boolean z;
        this.f = new HashMap[ExifInterface.X.length];
        this.g = new HashSet(ExifInterface.X.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(fileDescriptor0 == null) {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
        this.c = null;
        this.a = null;
        if(ExifInterface.r(fileDescriptor0)) {
            try {
                this.b = fileDescriptor0;
                fileDescriptor0 = h.b(fileDescriptor0);
                z = true;
            }
            catch(Exception exception0) {
                throw new IOException("Failed to duplicate file descriptor", exception0);
            }
        }
        else {
            this.b = null;
            z = false;
        }
        try {
            fileInputStream0 = new FileInputStream(fileDescriptor0);
        }
        catch(Throwable throwable0) {
            fileInputStream0 = null;
            throwable1 = throwable0;
            goto label_25;
        }
        try {
            this.t(fileInputStream0);
            goto label_29;
        }
        catch(Throwable throwable1) {
        }
    label_25:
        a.k(fileInputStream0);
        if(z) {
            a.i(fileDescriptor0);
        }
        throw throwable1;
    label_29:
        a.k(fileInputStream0);
        if(z) {
            a.i(fileDescriptor0);
        }
    }

    public ExifInterface(@NonNull InputStream inputStream0) throws IOException {
        this(inputStream0, 0);
    }

    public ExifInterface(@NonNull InputStream inputStream0, int v) throws IOException {
        this.f = new HashMap[ExifInterface.X.length];
        this.g = new HashSet(ExifInterface.X.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(inputStream0 == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.a = null;
        if(v == 1) {
            byte[] arr_b = ExifInterface.e0;
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0, arr_b.length);
            bufferedInputStream0.mark(arr_b.length);
            byte[] arr_b1 = new byte[arr_b.length];
            bufferedInputStream0.read(arr_b1);
            bufferedInputStream0.reset();
            for(int v1 = 0; v1 < arr_b.length; ++v1) {
                if(arr_b1[v1] != arr_b[v1]) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
            }
            this.e = true;
            this.c = null;
            this.b = null;
            inputStream0 = bufferedInputStream0;
        }
        else if(inputStream0 instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream)inputStream0;
            this.b = null;
        }
        else if(!(inputStream0 instanceof FileInputStream) || !ExifInterface.r(((FileInputStream)inputStream0).getFD())) {
            this.c = null;
            this.b = null;
        }
        else {
            this.c = null;
            this.b = ((FileInputStream)inputStream0).getFD();
        }
        this.t(inputStream0);
    }

    public ExifInterface(@NonNull String s) throws IOException {
        this.f = new HashMap[ExifInterface.X.length];
        this.g = new HashSet(ExifInterface.X.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(s == null) {
            throw new NullPointerException("filename cannot be null");
        }
        this.q(s);
    }

    public final void A(String s) {
        for(int v = 0; v < ExifInterface.X.length; ++v) {
            this.f[v].remove(s);
        }
    }

    public final void B(int v, String s, String s1) {
        HashMap[] arr_hashMap = this.f;
        if(!arr_hashMap[v].isEmpty() && arr_hashMap[v].get(s) != null) {
            HashMap hashMap0 = arr_hashMap[v];
            hashMap0.put(s1, hashMap0.get(s));
            arr_hashMap[v].remove(s);
        }
    }

    public final void C(BufferedInputStream bufferedInputStream0, BufferedOutputStream bufferedOutputStream0) {
        if(ExifInterface.v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream0 + ", outputStream: " + bufferedOutputStream0 + ")");
        }
        b b0 = new b(bufferedInputStream0);
        c c0 = new c(bufferedOutputStream0, ByteOrder.BIG_ENDIAN);
        if(b0.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        c0.a(-1);
        if(b0.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        c0.a(-40);
        String s = this.getAttribute("Xmp");
        HashMap[] arr_hashMap = this.f;
        d d0 = s == null || !this.u ? null : ((d)arr_hashMap[0].remove("Xmp"));
        c0.a(-1);
        c0.a(0xFFFFFFE1);
        this.J(c0);
        if(d0 != null) {
            arr_hashMap[0].put("Xmp", d0);
        }
        byte[] arr_b = new byte[0x1000];
        while(b0.readByte() == -1) {
            int v = b0.readByte();
            switch(v) {
                case -39: 
                case -38: {
                    c0.a(-1);
                    c0.a(v);
                    a.p(b0, c0);
                    return;
                }
                case 0xFFFFFFE1: {
                    goto label_39;
                }
            }
            c0.a(-1);
            c0.a(v);
            int v1 = b0.readUnsignedShort();
            c0.e(v1);
            int v2 = v1 - 2;
            if(v2 < 0) {
                throw new IOException("Invalid length");
            }
            while(v2 > 0) {
                int v3 = b0.read(arr_b, 0, Math.min(v2, 0x1000));
                if(v3 < 0) {
                    break;
                }
                c0.write(arr_b, 0, v3);
                v2 -= v3;
            }
            continue;
        label_39:
            int v4 = b0.readUnsignedShort();
            int v5 = v4 - 2;
            if(v5 < 0) {
                throw new IOException("Invalid length");
            }
            byte[] arr_b1 = new byte[6];
            if(v5 >= 6) {
                b0.readFully(arr_b1);
                if(Arrays.equals(arr_b1, ExifInterface.e0)) {
                    b0.a(v4 - 8);
                    continue;
                }
            }
            c0.a(-1);
            c0.a(0xFFFFFFE1);
            c0.e(v4);
            if(v5 >= 6) {
                v5 = v4 - 8;
                c0.write(arr_b1);
            }
        label_54:
            if(v5 <= 0) {
                continue;
            }
            int v6 = b0.read(arr_b, 0, Math.min(v5, 0x1000));
            if(v6 < 0) {
                continue;
            }
            c0.write(arr_b, 0, v6);
            v5 -= v6;
            goto label_54;
        }
        throw new IOException("Invalid marker");
    }

    public final void D(BufferedInputStream bufferedInputStream0, BufferedOutputStream bufferedOutputStream0) {
        ByteArrayOutputStream byteArrayOutputStream0;
        if(ExifInterface.v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream0 + ", outputStream: " + bufferedOutputStream0 + ")");
        }
        b b0 = new b(bufferedInputStream0);
        ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
        c c0 = new c(bufferedOutputStream0, byteOrder0);
        byte[] arr_b = ExifInterface.E;
        a.o(b0, c0, arr_b.length);
        int v = this.p;
        if(v == 0) {
            int v1 = b0.readInt();
            c0.b(v1);
            a.o(b0, c0, v1 + 8);
        }
        else {
            a.o(b0, c0, v - arr_b.length - 8);
            b0.a(b0.readInt() + 8);
        }
        try {
            byteArrayOutputStream0 = new ByteArrayOutputStream();
            c c1 = new c(byteArrayOutputStream0, byteOrder0);
            this.J(c1);
            byte[] arr_b1 = ((ByteArrayOutputStream)c1.a).toByteArray();
            c0.write(arr_b1);
            CRC32 cRC320 = new CRC32();
            cRC320.update(arr_b1, 4, arr_b1.length - 4);
            c0.b(((int)cRC320.getValue()));
        }
        finally {
            a.k(byteArrayOutputStream0);
        }
        a.p(b0, c0);
    }

    public final void E(BufferedInputStream bufferedInputStream0, BufferedOutputStream bufferedOutputStream0) {
        byte[] arr_b15;
        c c2;
        boolean z3;
        int v12;
        int v11;
        int v10;
        ByteArrayOutputStream byteArrayOutputStream0;
        if(ExifInterface.v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream0 + ", outputStream: " + bufferedOutputStream0 + ")");
        }
        ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
        b b0 = new b(bufferedInputStream0, byteOrder0);
        c c0 = new c(bufferedOutputStream0, byteOrder0);
        byte[] arr_b = ExifInterface.I;
        a.o(b0, c0, arr_b.length);
        byte[] arr_b1 = ExifInterface.J;
        b0.a(arr_b1.length + 4);
        try {
            byteArrayOutputStream0 = new ByteArrayOutputStream();
            c c1 = new c(byteArrayOutputStream0, byteOrder0);
            int v1 = this.p;
            if(v1 == 0) {
                byte[] arr_b2 = new byte[4];
                b0.readFully(arr_b2);
                byte[] arr_b3 = ExifInterface.M;
                boolean z = Arrays.equals(arr_b2, arr_b3);
                byte[] arr_b4 = ExifInterface.O;
                byte[] arr_b5 = ExifInterface.N;
                boolean z1 = false;
                if(z) {
                    int v3 = b0.readInt();
                    byte[] arr_b6 = new byte[(v3 % 2 == 1 ? v3 + 1 : v3)];
                    b0.readFully(arr_b6);
                    byte b1 = (byte)(8 | arr_b6[0]);
                    arr_b6[0] = b1;
                    if((b1 >> 1 & 1) == 1) {
                        z1 = true;
                    }
                    c1.write(arr_b3);
                    c1.b(v3);
                    c1.write(arr_b6);
                    if(z1) {
                        byte[] arr_b8 = ExifInterface.P;
                        do {
                            byte[] arr_b9 = new byte[4];
                            b0.readFully(arr_b9);
                            int v5 = b0.readInt();
                            c1.write(arr_b9);
                            c1.b(v5);
                            if(v5 % 2 == 1) {
                                ++v5;
                            }
                            a.o(b0, c1, v5);
                        }
                        while(!Arrays.equals(arr_b9, arr_b8));
                        while(true) {
                            byte[] arr_b10 = new byte[4];
                            try {
                                b0.readFully(arr_b10);
                                int v6 = 1;
                                v6 = !Arrays.equals(arr_b10, ExifInterface.Q);
                            }
                            catch(EOFException unused_ex) {
                            }
                            if(v6 != 0) {
                                this.J(c1);
                                goto label_141;
                            }
                            int v7 = b0.readInt();
                            c1.write(arr_b10);
                            c1.b(v7);
                            if(v7 % 2 == 1) {
                                ++v7;
                            }
                            a.o(b0, c1, v7);
                        }
                    }
                    else {
                        do {
                            byte[] arr_b7 = new byte[4];
                            b0.readFully(arr_b7);
                            int v4 = b0.readInt();
                            c1.write(arr_b7);
                            c1.b(v4);
                            if(v4 % 2 == 1) {
                                ++v4;
                            }
                            a.o(b0, c1, v4);
                        }
                        while(!Arrays.equals(arr_b7, arr_b4) && (arr_b5 == null || !Arrays.equals(arr_b7, arr_b5)));
                        this.J(c1);
                        goto label_141;
                    }
                }
                else if(!Arrays.equals(arr_b2, arr_b4) && !Arrays.equals(arr_b2, arr_b5)) {
                label_141:
                    c2 = c0;
                    arr_b15 = arr_b1;
                }
                else {
                    int v8 = b0.readInt();
                    int v9 = v8 % 2 == 1 ? v8 + 1 : v8;
                    byte[] arr_b11 = new byte[3];
                    boolean z2 = Arrays.equals(arr_b2, arr_b4);
                    byte[] arr_b12 = ExifInterface.L;
                    if(z2) {
                        b0.readFully(arr_b11);
                        byte[] arr_b13 = new byte[3];
                        b0.readFully(arr_b13);
                        if(!Arrays.equals(arr_b12, arr_b13)) {
                            throw new IOException("Error checking VP8 signature");
                        }
                        v10 = b0.readInt();
                        v9 -= 10;
                        v11 = v10 << 18 >> 18;
                        v12 = v10 << 2 >> 18;
                        z3 = false;
                    }
                    else if(Arrays.equals(arr_b2, arr_b5)) {
                        if(b0.readByte() != 0x2F) {
                            throw new IOException("Error checking VP8L signature");
                        }
                        v10 = b0.readInt();
                        z3 = true;
                        v11 = (v10 & 0x3FFF) + 1;
                        v12 = ((v10 & 0xFFFC000) >>> 14) + 1;
                        if((v10 & 0x10000000) == 0) {
                            z3 = false;
                        }
                        v9 -= 5;
                    }
                    else {
                        v10 = 0;
                        v11 = 0;
                        z3 = false;
                        v12 = 0;
                    }
                    c1.write(arr_b3);
                    c1.b(10);
                    byte[] arr_b14 = new byte[10];
                    if(z3) {
                        c2 = c0;
                        arr_b14[0] = (byte)(arr_b14[0] | 16);
                    }
                    else {
                        c2 = c0;
                    }
                    arr_b15 = arr_b1;
                    arr_b14[0] = (byte)(arr_b14[0] | 8);
                    arr_b14[4] = (byte)(v11 - 1);
                    arr_b14[5] = (byte)(v11 - 1 >> 8);
                    arr_b14[6] = (byte)(v11 - 1 >> 16);
                    arr_b14[7] = (byte)(v12 - 1);
                    arr_b14[8] = (byte)(v12 - 1 >> 8);
                    arr_b14[9] = (byte)(v12 - 1 >> 16);
                    c1.write(arr_b14);
                    c1.write(arr_b2);
                    c1.b(v8);
                    if(Arrays.equals(arr_b2, arr_b4)) {
                        c1.write(arr_b11);
                        c1.write(arr_b12);
                        c1.b(v10);
                    }
                    else if(Arrays.equals(arr_b2, arr_b5)) {
                        c1.write(0x2F);
                        c1.b(v10);
                    }
                    a.o(b0, c1, v9);
                    this.J(c1);
                }
            }
            else {
                a.o(b0, c1, v1 - (arr_b.length + 4 + arr_b1.length) - 8);
                b0.a(4);
                int v2 = b0.readInt();
                if(v2 % 2 != 0) {
                    ++v2;
                }
                b0.a(v2);
                this.J(c1);
                goto label_141;
            }
            a.p(b0, c1);
            c2.b(byteArrayOutputStream0.size() + arr_b15.length);
            c2.write(arr_b15);
            byteArrayOutputStream0.writeTo(c2);
        }
        catch(Exception exception0) {
            throw new IOException("Failed to save WebP file", exception0);
        }
        finally {
            a.k(byteArrayOutputStream0);
        }
    }

    public final void F(b b0) {
        HashMap hashMap0 = this.f[4];
        d d0 = (d)hashMap0.get("Compression");
        if(d0 == null) {
            this.o = 6;
            this.p(b0, hashMap0);
        }
        else {
            int v = d0.h(this.h);
            this.o = v;
            switch(v) {
                case 1: {
                    break;
                }
                case 6: {
                    this.p(b0, hashMap0);
                    return;
                label_9:
                    if(v != 7) {
                        return;
                    }
                    break;
                }
                default: {
                    goto label_9;
                }
            }
            d d1 = (d)hashMap0.get("BitsPerSample");
            if(d1 == null) {
            label_76:
                if(ExifInterface.v) {
                    Log.d("ExifInterface", "Unsupported data type value");
                }
            }
            else {
                int[] arr_v = (int[])d1.j(this.h);
                int[] arr_v1 = ExifInterface.BITS_PER_SAMPLE_RGB;
                if(Arrays.equals(arr_v1, arr_v)) {
                label_21:
                    d d3 = (d)hashMap0.get("StripOffsets");
                    d d4 = (d)hashMap0.get("StripByteCounts");
                    if(d3 != null && d4 != null) {
                        long[] arr_v2 = a.n(d3.j(this.h));
                        long[] arr_v3 = a.n(d4.j(this.h));
                        if(arr_v2 == null || arr_v2.length == 0) {
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            return;
                        }
                        if(arr_v3 == null || arr_v3.length == 0) {
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        if(arr_v2.length != arr_v3.length) {
                            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                            return;
                        }
                        long v2 = 0L;
                        for(int v3 = 0; v3 < arr_v3.length; ++v3) {
                            v2 += arr_v3[v3];
                        }
                        byte[] arr_b = new byte[((int)v2)];
                        this.k = true;
                        this.j = true;
                        this.i = true;
                        int v5 = 0;
                        int v6 = 0;
                        for(int v4 = 0; v4 < arr_v2.length; ++v4) {
                            int v7 = (int)arr_v2[v4];
                            int v8 = (int)arr_v3[v4];
                            if(v4 < arr_v2.length - 1 && ((long)(v7 + v8)) != arr_v2[v4 + 1]) {
                                this.k = false;
                            }
                            int v9 = v7 - v5;
                            if(v9 < 0) {
                                Log.d("ExifInterface", "Invalid strip offset value");
                                return;
                            }
                            try {
                                b0.a(v9);
                            }
                            catch(EOFException unused_ex) {
                                Log.d("ExifInterface", "Failed to skip " + v9 + " bytes.");
                                return;
                            }
                            byte[] arr_b1 = new byte[v8];
                            try {
                                b0.readFully(arr_b1);
                            }
                            catch(EOFException unused_ex) {
                                Log.d("ExifInterface", "Failed to read " + v8 + " bytes.");
                                return;
                            }
                            v5 = v5 + v9 + v8;
                            System.arraycopy(arr_b1, 0, arr_b, v6, v8);
                            v6 += v8;
                        }
                        this.n = arr_b;
                        if(this.k) {
                            this.l = (int)arr_v2[0];
                            this.m = (int)v2;
                        }
                    }
                }
                else if(this.d == 3) {
                    d d2 = (d)hashMap0.get("PhotometricInterpretation");
                    if(d2 == null) {
                        goto label_76;
                    }
                    else {
                        int v1 = d2.h(this.h);
                        if((v1 != 1 || !Arrays.equals(arr_v, ExifInterface.BITS_PER_SAMPLE_GREYSCALE_2)) && (v1 != 6 || !Arrays.equals(arr_v, arr_v1))) {
                            goto label_76;
                        }
                        else {
                            goto label_21;
                        }
                    }
                }
                else {
                    goto label_76;
                }
            }
        }
    }

    public final void G(int v, int v1) {
        HashMap[] arr_hashMap = this.f;
        boolean z = ExifInterface.v;
        if(!arr_hashMap[v].isEmpty() && !arr_hashMap[v1].isEmpty()) {
            d d0 = (d)arr_hashMap[v].get("ImageLength");
            d d1 = (d)arr_hashMap[v].get("ImageWidth");
            d d2 = (d)arr_hashMap[v1].get("ImageLength");
            d d3 = (d)arr_hashMap[v1].get("ImageWidth");
            if(d0 != null && d1 != null) {
                if(d2 != null && d3 != null) {
                    int v2 = d0.h(this.h);
                    int v3 = d1.h(this.h);
                    if(v2 < d2.h(this.h) && v3 < d3.h(this.h)) {
                        HashMap hashMap0 = arr_hashMap[v];
                        arr_hashMap[v] = arr_hashMap[v1];
                        arr_hashMap[v1] = hashMap0;
                        return;
                    }
                }
                else if(z) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
            }
            else if(z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
            return;
        }
        if(z) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void H(g g0, int v) {
        d d6;
        d d5;
        HashMap[] arr_hashMap = this.f;
        d d0 = (d)arr_hashMap[v].get("DefaultCropSize");
        d d1 = (d)arr_hashMap[v].get("SensorTopBorder");
        d d2 = (d)arr_hashMap[v].get("SensorLeftBorder");
        d d3 = (d)arr_hashMap[v].get("SensorBottomBorder");
        d d4 = (d)arr_hashMap[v].get("SensorRightBorder");
        if(d0 != null) {
            if(d0.a == 5) {
                f[] arr_f = (f[])d0.j(this.h);
                if(arr_f != null && arr_f.length == 2) {
                    d5 = d.d(new f[]{arr_f[0]}, this.h);
                    d6 = d.d(new f[]{arr_f[1]}, this.h);
                    arr_hashMap[v].put("ImageWidth", d5);
                    arr_hashMap[v].put("ImageLength", d6);
                    return;
                }
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_f));
                return;
            }
            int[] arr_v = (int[])d0.j(this.h);
            if(arr_v != null && arr_v.length == 2) {
                d5 = d.e(arr_v[0], this.h);
                d6 = d.e(arr_v[1], this.h);
                arr_hashMap[v].put("ImageWidth", d5);
                arr_hashMap[v].put("ImageLength", d6);
                return;
            }
            Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_v));
            return;
        }
        if(d1 != null && d2 != null && d3 != null && d4 != null) {
            int v1 = d1.h(this.h);
            int v2 = d3.h(this.h);
            int v3 = d4.h(this.h);
            int v4 = d2.h(this.h);
            if(v2 > v1 && v3 > v4) {
                d d7 = d.e(v2 - v1, this.h);
                d d8 = d.e(v3 - v4, this.h);
                arr_hashMap[v].put("ImageLength", d7);
                arr_hashMap[v].put("ImageWidth", d8);
            }
        }
        else if(((d)arr_hashMap[v].get("ImageLength")) == null || ((d)arr_hashMap[v].get("ImageWidth")) == null) {
            d d9 = (d)arr_hashMap[v].get("JPEGInterchangeFormat");
            if(d9 != null && ((d)arr_hashMap[v].get("JPEGInterchangeFormatLength")) != null) {
                int v5 = d9.h(this.h);
                int v6 = d9.h(this.h);
                g0.b(((long)v5));
                byte[] arr_b = new byte[v6];
                g0.readFully(arr_b);
                this.f(new b(arr_b), v5, v);
            }
        }
    }

    public final void I() {
        this.G(0, 5);
        this.G(0, 4);
        this.G(5, 4);
        HashMap[] arr_hashMap = this.f;
        d d0 = (d)arr_hashMap[1].get("PixelXDimension");
        d d1 = (d)arr_hashMap[1].get("PixelYDimension");
        if(d0 != null && d1 != null) {
            arr_hashMap[0].put("ImageWidth", d0);
            arr_hashMap[0].put("ImageLength", d1);
        }
        if(arr_hashMap[4].isEmpty() && this.s(arr_hashMap[5])) {
            arr_hashMap[4] = arr_hashMap[5];
            arr_hashMap[5] = new HashMap();
        }
        if(!this.s(arr_hashMap[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        this.B(0, "ThumbnailOrientation", "Orientation");
        this.B(0, "ThumbnailImageLength", "ImageLength");
        this.B(0, "ThumbnailImageWidth", "ImageWidth");
        this.B(5, "ThumbnailOrientation", "Orientation");
        this.B(5, "ThumbnailImageLength", "ImageLength");
        this.B(5, "ThumbnailImageWidth", "ImageWidth");
        this.B(4, "Orientation", "ThumbnailOrientation");
        this.B(4, "ImageLength", "ThumbnailImageLength");
        this.B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void J(c c0) {
        int[] arr_v2;
        Object[] arr_object1;
        HashMap[] arr_hashMap;
        e[][] arr2_e = ExifInterface.X;
        int[] arr_v = new int[arr2_e.length];
        int[] arr_v1 = new int[arr2_e.length];
        e[] arr_e = ExifInterface.Y;
        for(int v = 0; v < arr_e.length; ++v) {
            this.A(arr_e[v].b);
        }
        if(this.i) {
            if(this.j) {
                this.A("StripOffsets");
                this.A("StripByteCounts");
            }
            else {
                this.A("JPEGInterchangeFormat");
                this.A("JPEGInterchangeFormatLength");
            }
        }
        for(int v1 = 0; true; ++v1) {
            arr_hashMap = this.f;
            if(v1 >= arr2_e.length) {
                break;
            }
            Object[] arr_object = arr_hashMap[v1].entrySet().toArray();
            int v2 = arr_object.length;
            int v3 = 0;
            while(v3 < v2) {
                Map.Entry map$Entry0 = (Map.Entry)arr_object[v3];
                if(map$Entry0.getValue() == null) {
                    arr_object1 = arr_object;
                    arr_hashMap[v1].remove(map$Entry0.getKey());
                }
                else {
                    arr_object1 = arr_object;
                }
                ++v3;
                arr_object = arr_object1;
            }
        }
        if(!arr_hashMap[1].isEmpty()) {
            arr_hashMap[0].put(arr_e[1].b, d.b(0L, this.h));
        }
        if(!arr_hashMap[2].isEmpty()) {
            arr_hashMap[0].put(arr_e[2].b, d.b(0L, this.h));
        }
        if(!arr_hashMap[3].isEmpty()) {
            arr_hashMap[1].put(arr_e[3].b, d.b(0L, this.h));
        }
        if(this.i) {
            if(this.j) {
                arr_hashMap[4].put("StripOffsets", d.e(0, this.h));
                arr_hashMap[4].put("StripByteCounts", d.e(this.m, this.h));
            }
            else {
                arr_hashMap[4].put("JPEGInterchangeFormat", d.b(0L, this.h));
                arr_hashMap[4].put("JPEGInterchangeFormatLength", d.b(this.m, this.h));
            }
        }
        for(int v4 = 0; true; ++v4) {
            arr_v2 = ExifInterface.U;
            if(v4 >= arr2_e.length) {
                break;
            }
            int v5 = 0;
            for(Object object0: arr_hashMap[v4].entrySet()) {
                d d0 = (d)((Map.Entry)object0).getValue();
                d0.getClass();
                int v6 = arr_v2[d0.a] * d0.b;
                if(v6 > 4) {
                    v5 += v6;
                }
            }
            arr_v1[v4] += v5;
        }
        int v7 = 8;
        for(int v8 = 0; v8 < arr2_e.length; ++v8) {
            if(!arr_hashMap[v8].isEmpty()) {
                arr_v[v8] = v7;
                v7 = arr_hashMap[v8].size() * 12 + 6 + arr_v1[v8] + v7;
            }
        }
        if(this.i) {
            if(this.j) {
                arr_hashMap[4].put("StripOffsets", d.e(v7, this.h));
            }
            else {
                arr_hashMap[4].put("JPEGInterchangeFormat", d.b(v7, this.h));
            }
            this.l = v7;
            v7 += this.m;
        }
        if(this.d == 4) {
            v7 += 8;
        }
        if(ExifInterface.v) {
            for(int v9 = 0; v9 < arr2_e.length; ++v9) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", v9, ((int)arr_v[v9]), arr_hashMap[v9].size(), ((int)arr_v1[v9]), v7));
            }
        }
        if(!arr_hashMap[1].isEmpty()) {
            arr_hashMap[0].put(arr_e[1].b, d.b(arr_v[1], this.h));
        }
        if(!arr_hashMap[2].isEmpty()) {
            arr_hashMap[0].put(arr_e[2].b, d.b(arr_v[2], this.h));
        }
        if(!arr_hashMap[3].isEmpty()) {
            arr_hashMap[1].put(arr_e[3].b, d.b(arr_v[3], this.h));
        }
        int v10 = this.d;
        if(v10 != 4) {
            switch(v10) {
                case 13: {
                    c0.b(v7);
                    c0.write(ExifInterface.F);
                    break;
                }
                case 14: {
                    c0.write(ExifInterface.K);
                    c0.b(v7);
                }
            }
        }
        else if(v7 <= 0xFFFF) {
            c0.e(v7);
            c0.write(ExifInterface.e0);
        }
        else {
            throw new IllegalStateException("Size of exif data (" + v7 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
        }
        c0.c(((short)(this.h == ByteOrder.BIG_ENDIAN ? 0x4D4D : 0x4949)));
        c0.b = this.h;
        c0.e(42);
        c0.d(8L);
        for(int v11 = 0; v11 < arr2_e.length; ++v11) {
            if(!arr_hashMap[v11].isEmpty()) {
                c0.e(arr_hashMap[v11].size());
                int v12 = arr_hashMap[v11].size() * 12 + (arr_v[v11] + 2) + 4;
                for(Object object1: arr_hashMap[v11].entrySet()) {
                    int v13 = ((e)ExifInterface.a0[v11].get(((Map.Entry)object1).getKey())).a;
                    d d1 = (d)((Map.Entry)object1).getValue();
                    d1.getClass();
                    int v14 = arr_v2[d1.a] * d1.b;
                    c0.e(v13);
                    c0.e(d1.a);
                    c0.b(d1.b);
                    if(v14 > 4) {
                        c0.d(((long)v12));
                        v12 += v14;
                    }
                    else {
                        c0.write(d1.d);
                        if(v14 < 4) {
                            while(v14 < 4) {
                                c0.a(0);
                                ++v14;
                            }
                        }
                    }
                }
                if(v11 != 0 || arr_hashMap[4].isEmpty()) {
                    c0.d(0L);
                }
                else {
                    c0.d(((long)arr_v[4]));
                }
                for(Object object2: arr_hashMap[v11].entrySet()) {
                    byte[] arr_b = ((d)((Map.Entry)object2).getValue()).d;
                    if(arr_b.length > 4) {
                        c0.write(arr_b, 0, arr_b.length);
                    }
                }
            }
        }
        if(this.i) {
            c0.write(this.getThumbnailBytes());
        }
        if(this.d == 14 && v7 % 2 == 1) {
            c0.a(0);
        }
        c0.b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String s = this.getAttribute("DateTimeOriginal");
        HashMap[] arr_hashMap = this.f;
        if(s != null && this.getAttribute("DateTime") == null) {
            arr_hashMap[0].put("DateTime", d.a(s));
        }
        if(this.getAttribute("ImageWidth") == null) {
            arr_hashMap[0].put("ImageWidth", d.b(0L, this.h));
        }
        if(this.getAttribute("ImageLength") == null) {
            arr_hashMap[0].put("ImageLength", d.b(0L, this.h));
        }
        if(this.getAttribute("Orientation") == null) {
            arr_hashMap[0].put("Orientation", d.b(0L, this.h));
        }
        if(this.getAttribute("LightSource") == null) {
            arr_hashMap[1].put("LightSource", d.b(0L, this.h));
        }
    }

    public static String b(double f) {
        double f1 = f - ((double)(((long)f)));
        return ((long)f) + "/1," + ((long)(f1 * 60.0)) + "/1," + Math.round((f1 - ((double)(((long)(f1 * 60.0)))) / 60.0) * 36000000000.0) + "/10000000";
    }

    public static double c(String s, String s1) {
        try {
            String[] arr_s = s.split(",", -1);
            String[] arr_s1 = arr_s[0].split("/", -1);
            double f = Double.parseDouble(arr_s1[0].trim());
            double f1 = Double.parseDouble(arr_s1[1].trim());
            String[] arr_s2 = arr_s[1].split("/", -1);
            double f2 = Double.parseDouble(arr_s2[0].trim());
            double f3 = Double.parseDouble(arr_s2[1].trim());
            String[] arr_s3 = arr_s[2].split("/", -1);
            double f4 = Double.parseDouble(arr_s3[0].trim()) / Double.parseDouble(arr_s3[1].trim()) / 3600.0 + (f2 / f3 / 60.0 + f / f1);
            if(!s1.equals("S") && !s1.equals("W")) {
                if(!s1.equals("N") && !s1.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return f4;
            }
            return -f4;
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException unused_ex) {
            throw new IllegalArgumentException();
        }
    }

    public final d d(String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        if("ISOSpeedRatings".equals(s)) {
            if(ExifInterface.v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            s = "PhotographicSensitivity";
        }
        for(int v = 0; v < ExifInterface.X.length; ++v) {
            d d0 = (d)this.f[v].get(s);
            if(d0 != null) {
                return d0;
            }
        }
        return null;
    }

    public final void e(g g0) {
        int v1;
        String s6;
        String s5;
        String s4;
        if(Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
        try {
            i.a(mediaMetadataRetriever0, new e4.a(g0));
            String s = mediaMetadataRetriever0.extractMetadata(33);
            String s1 = mediaMetadataRetriever0.extractMetadata(34);
            String s2 = mediaMetadataRetriever0.extractMetadata(26);
            String s3 = mediaMetadataRetriever0.extractMetadata(17);
            if("yes".equals(s2)) {
                s4 = mediaMetadataRetriever0.extractMetadata(29);
                s5 = mediaMetadataRetriever0.extractMetadata(30);
                s6 = mediaMetadataRetriever0.extractMetadata(0x1F);
            }
            else if("yes".equals(s3)) {
                s4 = mediaMetadataRetriever0.extractMetadata(18);
                s5 = mediaMetadataRetriever0.extractMetadata(19);
                s6 = mediaMetadataRetriever0.extractMetadata(24);
            }
            else {
                s4 = null;
                s5 = null;
                s6 = null;
            }
            HashMap[] arr_hashMap = this.f;
            if(s4 != null) {
                arr_hashMap[0].put("ImageWidth", d.e(Integer.parseInt(s4), this.h));
            }
            if(s5 != null) {
                arr_hashMap[0].put("ImageLength", d.e(Integer.parseInt(s5), this.h));
            }
            if(s6 != null) {
                switch(Integer.parseInt(s6)) {
                    case 90: {
                        v1 = 6;
                        break;
                    }
                    case 180: {
                        v1 = 3;
                        break;
                    }
                    case 270: {
                        v1 = 8;
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
                arr_hashMap[0].put("Orientation", d.e(v1, this.h));
            }
            if(s != null && s1 != null) {
                int v2 = Integer.parseInt(s);
                int v3 = Integer.parseInt(s1);
                if(v3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                g0.b(((long)v2));
                byte[] arr_b = new byte[6];
                g0.readFully(arr_b);
                if(!Arrays.equals(arr_b, ExifInterface.e0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] arr_b1 = new byte[v3 - 6];
                g0.readFully(arr_b1);
                this.p = v2 + 6;
                this.y(0, arr_b1);
            }
            if(ExifInterface.v) {
                Log.d("ExifInterface", "Heif meta: " + s4 + "x" + s5 + ", rotation " + s6);
            }
        }
        catch(RuntimeException unused_ex) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
        }
        finally {
            mediaMetadataRetriever0.release();
        }
    }

    public final void f(b b0, int v, int v1) {
        boolean z = ExifInterface.v;
        if(z) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + b0);
        }
        b0.c = ByteOrder.BIG_ENDIAN;
        int v2 = b0.readByte();
        if(v2 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(v2 & 0xFF));
        }
        if(b0.readByte() != -40) {
            throw new IOException("Invalid marker: ff");
        }
        int v3 = 2;
        while(true) {
            int v4 = b0.readByte();
            if(v4 != -1) {
                throw new IOException("Invalid marker:" + Integer.toHexString(v4 & 0xFF));
            }
            int v5 = b0.readByte();
            if(z) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(v5 & 0xFF));
            }
            if(v5 == -39 || v5 == -38) {
                b0.c = this.h;
                return;
            }
            int v6 = b0.readUnsignedShort();
            int v7 = v6 - 2;
            int v8 = v3 + 4;
            if(z) {
                Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(v5 & 0xFF) + " (length: " + v6 + ")");
            }
            if(v7 < 0) {
                throw new IOException("Invalid length");
            }
            HashMap[] arr_hashMap = this.f;
            switch(v5) {
                case 0xFFFFFFE1: {
                    byte[] arr_b = new byte[v7];
                    b0.readFully(arr_b);
                    byte[] arr_b1 = ExifInterface.e0;
                    if(arr_b1 == null || v7 < arr_b1.length) {
                    label_42:
                        byte[] arr_b3 = ExifInterface.f0;
                        if(arr_b3 != null && v7 >= arr_b3.length) {
                            int v10 = 0;
                            while(true) {
                                if(v10 < arr_b3.length) {
                                    if(arr_b[v10] == arr_b3[v10]) {
                                        ++v10;
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                int v11 = v8 + arr_b3.length;
                                byte[] arr_b4 = Arrays.copyOfRange(arr_b, arr_b3.length, v7);
                                if(this.getAttribute("Xmp") != null) {
                                    break;
                                }
                                arr_hashMap[0].put("Xmp", new d(((long)v11), arr_b4, 1, arr_b4.length));
                                this.u = true;
                                break;
                            }
                        }
                    }
                    else {
                        int v9 = 0;
                        while(v9 < arr_b1.length) {
                            if(arr_b[v9] != arr_b1[v9]) {
                                goto label_42;
                            }
                            ++v9;
                        }
                        byte[] arr_b2 = Arrays.copyOfRange(arr_b, arr_b1.length, v7);
                        this.p = v + v8 + arr_b1.length;
                        this.y(v1, arr_b2);
                        this.F(new b(arr_b2));
                    }
                    v8 += v7;
                    v7 = 0;
                    break;
                }
                case -2: {
                    byte[] arr_b5 = new byte[v7];
                    b0.readFully(arr_b5);
                    if(this.getAttribute("UserComment") == null) {
                        arr_hashMap[1].put("UserComment", d.a(new String(arr_b5, ExifInterface.d0)));
                    }
                    v7 = 0;
                    break;
                }
                default: {
                    if(v5 == 0xFFFFFFC0 || v5 == 0xFFFFFFC1 || v5 == -62 || v5 == -61 || (v5 == -59 || v5 == -58 || v5 == -57) || (v5 == -55 || v5 == -54 || v5 == -53) || (v5 == -51 || v5 == -50 || v5 == -49)) {
                        b0.a(1);
                        arr_hashMap[v1].put((v1 == 4 ? "ThumbnailImageLength" : "ImageLength"), d.b(b0.readUnsignedShort(), this.h));
                        arr_hashMap[v1].put((v1 == 4 ? "ThumbnailImageWidth" : "ImageWidth"), d.b(b0.readUnsignedShort(), this.h));
                        v7 = v6 - 7;
                    }
                }
            }
            if(v7 < 0) {
                break;
            }
            b0.a(v7);
            v3 = v8 + v7;
        }
        throw new IOException("Invalid length");
    }

    public void flipHorizontally() {
        int v = 1;
        switch(this.getAttributeInt("Orientation", 1)) {
            case 1: {
                v = 2;
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                v = 4;
                break;
            }
            case 4: {
                v = 3;
                break;
            }
            case 5: {
                v = 6;
                break;
            }
            case 6: {
                v = 5;
                break;
            }
            case 7: {
                v = 8;
                break;
            }
            case 8: {
                v = 7;
                break;
            }
            default: {
                v = 0;
            }
        }
        this.setAttribute("Orientation", Integer.toString(v));
    }

    public void flipVertically() {
        int v = 1;
        switch(this.getAttributeInt("Orientation", 1)) {
            case 1: {
                v = 4;
                break;
            }
            case 2: {
                v = 3;
                break;
            }
            case 3: {
                v = 2;
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                v = 8;
                break;
            }
            case 6: {
                v = 7;
                break;
            }
            case 7: {
                v = 6;
                break;
            }
            case 8: {
                v = 5;
                break;
            }
            default: {
                v = 0;
            }
        }
        this.setAttribute("Orientation", Integer.toString(v));
    }

    public final int g(BufferedInputStream bufferedInputStream0) {
        boolean z3;
        b b6;
        b b5;
        b b4;
        boolean z2;
        int v6;
        b b2;
        boolean z1;
        long v5;
        long v3;
        b b0;
        bufferedInputStream0.mark(5000);
        byte[] arr_b = new byte[5000];
        bufferedInputStream0.read(arr_b);
        bufferedInputStream0.reset();
        int v = 0;
        while(true) {
            byte[] arr_b1 = ExifInterface.y;
            if(v >= arr_b1.length) {
                break;
            }
            if(arr_b[v] != arr_b1[v]) {
                byte[] arr_b2 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                int v1 = 0;
                while(v1 < arr_b2.length) {
                    if(arr_b[v1] != arr_b2[v1]) {
                        try {
                            b0 = null;
                            b0 = new b(arr_b);
                            goto label_18;
                        }
                        catch(Exception exception0) {
                            goto label_48;
                        }
                        catch(Throwable throwable0) {
                        }
                        b b1 = null;
                        goto label_52;
                        try {
                        label_18:
                            long v2 = (long)b0.readInt();
                            byte[] arr_b3 = new byte[4];
                            b0.readFully(arr_b3);
                            if(Arrays.equals(arr_b3, ExifInterface.z)) {
                                if(Long.compare(v2, 1L) == 0) {
                                    v2 = b0.readLong();
                                    v3 = 16L;
                                    if(v2 >= 16L) {
                                        goto label_28;
                                    }
                                }
                                else {
                                    v3 = 8L;
                                label_28:
                                    if(v2 > 5000L) {
                                        v2 = 5000L;
                                    }
                                    long v4 = v2 - v3;
                                    if(v4 >= 8L) {
                                        byte[] arr_b4 = new byte[4];
                                        v5 = 0L;
                                        boolean z = false;
                                        z1 = false;
                                        while(true) {
                                        label_36:
                                            if(v5 >= v4 / 4L) {
                                                break;
                                            }
                                            try {
                                                b0.readFully(arr_b4);
                                                if(v5 != 1L) {
                                                    goto label_39;
                                                }
                                                ++v5;
                                                continue;
                                            }
                                            catch(EOFException unused_ex) {
                                                break;
                                            }
                                        label_39:
                                            if(Arrays.equals(arr_b4, ExifInterface.A)) {
                                                z = true;
                                            }
                                            else if(Arrays.equals(arr_b4, ExifInterface.B)) {
                                                goto label_55;
                                            }
                                            goto label_56;
                                        }
                                    }
                                }
                            }
                            goto label_61;
                        }
                        catch(Exception exception0) {
                            goto label_48;
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            try {
                                b1 = b0;
                                goto label_52;
                            }
                            catch(Exception exception0) {
                            }
                        label_48:
                            if(ExifInterface.v) {
                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", exception0);
                            }
                        }
                        catch(Throwable throwable0) {
                            b1 = b0;
                            goto label_52;
                        }
                        if(b0 == null) {
                            b2 = null;
                            b2 = new b(arr_b);
                            goto label_68;
                        label_52:
                            if(b1 != null) {
                                b1.close();
                            }
                            throw throwable0;
                        label_55:
                            z1 = true;
                        label_56:
                            if(z && z1) {
                                b0.close();
                                return 12;
                            }
                            ++v5;
                            goto label_36;
                        }
                    label_61:
                        b0.close();
                        try {
                            b2 = null;
                            b2 = new b(arr_b);
                            goto label_68;
                        }
                        catch(Exception unused_ex) {
                            goto label_73;
                        }
                        catch(Throwable throwable1) {
                        }
                        b b3 = null;
                        goto label_79;
                        try {
                        label_68:
                            ByteOrder byteOrder0 = ExifInterface.x(b2);
                            this.h = byteOrder0;
                            b2.c = byteOrder0;
                            v6 = b2.readShort();
                            goto label_82;
                        }
                        catch(Exception unused_ex) {
                        label_73:
                            if(b2 != null) {
                                b2.close();
                            }
                            z2 = false;
                            goto label_84;
                        }
                        catch(Throwable throwable1) {
                            b3 = b2;
                        }
                    label_79:
                        if(b3 != null) {
                            b3.close();
                        }
                        throw throwable1;
                    label_82:
                        z2 = v6 == 20306 || v6 == 21330;
                        b2.close();
                    label_84:
                        if(z2) {
                            return 7;
                        }
                        try {
                            b4 = new b(arr_b);
                        }
                        catch(Exception unused_ex) {
                            b5 = null;
                            goto label_99;
                        }
                        catch(Throwable throwable2) {
                            b6 = null;
                            goto label_105;
                        }
                        try {
                            ByteOrder byteOrder1 = ExifInterface.x(b4);
                            this.h = byteOrder1;
                            b4.c = byteOrder1;
                            if(b4.readShort() == 85) {
                                z3 = true;
                            }
                            else {
                                goto label_110;
                            }
                            goto label_111;
                        }
                        catch(Exception unused_ex) {
                            b5 = b4;
                        label_99:
                            if(b5 != null) {
                                b5.close();
                            }
                            z3 = false;
                            goto label_112;
                        }
                        catch(Throwable throwable2) {
                            b6 = b4;
                        }
                    label_105:
                        if(b6 != null) {
                            b6.close();
                        }
                        throw throwable2;
                    label_110:
                        z3 = false;
                    label_111:
                        b4.close();
                    label_112:
                        if(z3) {
                            return 10;
                        }
                        for(int v7 = 0; true; ++v7) {
                            boolean z4 = true;
                            byte[] arr_b5 = ExifInterface.E;
                            if(v7 >= arr_b5.length) {
                                break;
                            }
                            if(arr_b[v7] != arr_b5[v7]) {
                                z4 = false;
                                break;
                            }
                        }
                        if(z4) {
                            return 13;
                        }
                        for(int v8 = 0; true; ++v8) {
                            byte[] arr_b6 = ExifInterface.I;
                            if(v8 >= arr_b6.length) {
                                break;
                            }
                            if(arr_b[v8] != arr_b6[v8]) {
                                return 0;
                            }
                        }
                        for(int v9 = 0; true; ++v9) {
                            byte[] arr_b7 = ExifInterface.J;
                            if(v9 >= arr_b7.length) {
                                return 14;
                            }
                            if(arr_b[arr_b6.length + v9 + 4] != arr_b7[v9]) {
                                break;
                            }
                        }
                        return 0;
                    }
                    ++v1;
                }
                return 9;
            }
            ++v;
        }
        return 4;
    }

    public double getAltitude(double f) {
        double f1 = this.getAttributeDouble("GPSAltitude", -1.0);
        int v = -1;
        int v1 = this.getAttributeInt("GPSAltitudeRef", -1);
        if(f1 >= 0.0 && v1 >= 0) {
            if(v1 != 1) {
                v = 1;
            }
            return f1 * ((double)v);
        }
        return f;
    }

    @Nullable
    public String getAttribute(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        d d0 = this.d(s);
        if(d0 != null) {
            if(!ExifInterface.b0.contains(s)) {
                return d0.i(this.h);
            }
            if(s.equals("GPSTimeStamp")) {
                int v = d0.a;
                if(v != 5 && v != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + v);
                    return null;
                }
                f[] arr_f = (f[])d0.j(this.h);
                if(arr_f != null && arr_f.length == 3) {
                    return String.format("%02d:%02d:%02d", ((int)(((float)arr_f[0].a) / ((float)arr_f[0].b))), ((int)(((float)arr_f[1].a) / ((float)arr_f[1].b))), ((int)(((float)arr_f[2].a) / ((float)arr_f[2].b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(arr_f));
                return null;
            }
            try {
                return Double.toString(d0.g(this.h));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }

    @Nullable
    public byte[] getAttributeBytes(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        d d0 = this.d(s);
        return d0 == null ? null : d0.d;
    }

    public double getAttributeDouble(@NonNull String s, double f) {
        if(s != null) {
            d d0 = this.d(s);
            if(d0 == null) {
                return f;
            }
            try {
                return d0.g(this.h);
            }
            catch(NumberFormatException unused_ex) {
                return f;
            }
        }
        throw new NullPointerException("tag shouldn\'t be null");
    }

    public int getAttributeInt(@NonNull String s, int v) {
        if(s != null) {
            d d0 = this.d(s);
            if(d0 == null) {
                return v;
            }
            try {
                return d0.h(this.h);
            }
            catch(NumberFormatException unused_ex) {
                return v;
            }
        }
        throw new NullPointerException("tag shouldn\'t be null");
    }

    @Nullable
    public long[] getAttributeRange(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        if(this.t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d d0 = this.d(s);
        return d0 == null ? null : new long[]{d0.c, ((long)d0.d.length)};
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public Long getDateTime() {
        return ExifInterface.u(this.getAttribute("DateTime"), this.getAttribute("SubSecTime"), this.getAttribute("OffsetTime"));
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public Long getDateTimeDigitized() {
        return ExifInterface.u(this.getAttribute("DateTimeDigitized"), this.getAttribute("SubSecTimeDigitized"), this.getAttribute("OffsetTimeDigitized"));
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public Long getDateTimeOriginal() {
        return ExifInterface.u(this.getAttribute("DateTimeOriginal"), this.getAttribute("SubSecTimeOriginal"), this.getAttribute("OffsetTimeOriginal"));
    }

    @SuppressLint({"AutoBoxing"})
    @Nullable
    public Long getGpsDateTime() {
        String s = this.getAttribute("GPSDateStamp");
        String s1 = this.getAttribute("GPSTimeStamp");
        if(s != null && s1 != null && (ExifInterface.g0.matcher(s).matches() || ExifInterface.g0.matcher(s1).matches())) {
            String s2 = s + ' ' + s1;
            ParsePosition parsePosition0 = new ParsePosition(0);
            try {
                Date date0 = ExifInterface.R.parse(s2, parsePosition0);
                if(date0 == null) {
                    date0 = ExifInterface.S.parse(s2, parsePosition0);
                    return date0 == null ? null : date0.getTime();
                }
                return date0.getTime();
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return null;
    }

    @Deprecated
    public boolean getLatLong(float[] arr_f) {
        double[] arr_f1 = this.getLatLong();
        if(arr_f1 == null) {
            return false;
        }
        arr_f[0] = (float)arr_f1[0];
        arr_f[1] = (float)arr_f1[1];
        return true;
    }

    @Nullable
    public double[] getLatLong() {
        String s = this.getAttribute("GPSLatitude");
        String s1 = this.getAttribute("GPSLatitudeRef");
        String s2 = this.getAttribute("GPSLongitude");
        String s3 = this.getAttribute("GPSLongitudeRef");
        if(s != null && s1 != null && s2 != null && s3 != null) {
            try {
                return new double[]{ExifInterface.c(s, s1), ExifInterface.c(s2, s3)};
            }
            catch(IllegalArgumentException unused_ex) {
                StringBuilder stringBuilder0 = a5.b.w("latValue=", s, ", latRef=", s1, ", lngValue=");
                stringBuilder0.append(s2);
                stringBuilder0.append(", lngRef=");
                stringBuilder0.append(s3);
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + stringBuilder0.toString());
            }
        }
        return null;
    }

    public int getRotationDegrees() {
        switch(this.getAttributeInt("Orientation", 1)) {
            case 3: 
            case 4: {
                return 180;
            }
            case 6: 
            case 7: {
                return 90;
            }
            case 5: 
            case 8: {
                return 270;
            }
            default: {
                return 0;
            }
        }
    }

    @Nullable
    public byte[] getThumbnail() {
        return this.o == 6 || this.o == 7 ? this.getThumbnailBytes() : null;
    }

    @Nullable
    public Bitmap getThumbnailBitmap() {
        if(!this.i) {
            return null;
        }
        if(this.n == null) {
            this.n = this.getThumbnailBytes();
        }
        switch(this.o) {
            case 1: {
                int v1 = this.n.length / 3;
                int[] arr_v = new int[v1];
                for(int v = 0; v < v1; ++v) {
                    arr_v[v] = (this.n[v * 3] << 16) + (this.n[v * 3 + 1] << 8) + this.n[v * 3 + 2];
                }
                d d0 = (d)this.f[4].get("ThumbnailImageLength");
                d d1 = (d)this.f[4].get("ThumbnailImageWidth");
                if(d0 != null && d1 != null) {
                    int v2 = d0.h(this.h);
                    return Bitmap.createBitmap(arr_v, d1.h(this.h), v2, Bitmap.Config.ARGB_8888);
                }
                return null;
            }
            case 6: 
            case 7: {
                return BitmapFactory.decodeByteArray(this.n, 0, this.m);
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    public byte[] getThumbnailBytes() {
        byte[] arr_b1;
        Exception exception1;
        FileDescriptor fileDescriptor1;
        FileDescriptor fileDescriptor0;
        AssetManager.AssetInputStream assetManager$AssetInputStream0;
        Closeable closeable0 = null;
        if(!this.i) {
            return null;
        }
        byte[] arr_b = this.n;
        if(arr_b != null) {
            return arr_b;
        }
        try {
            assetManager$AssetInputStream0 = this.c;
            if(assetManager$AssetInputStream0 == null) {
                if(this.a != null) {
                    assetManager$AssetInputStream0 = new FileInputStream(this.a);
                    fileDescriptor1 = null;
                    goto label_35;
                }
                fileDescriptor0 = h.b(this.b);
                goto label_21;
            }
            goto label_32;
        }
        catch(Exception exception0) {
            assetManager$AssetInputStream0 = null;
            exception1 = exception0;
            fileDescriptor1 = null;
            goto label_56;
        }
        catch(Throwable throwable0) {
            fileDescriptor1 = null;
            goto label_64;
        }
        try {
        label_21:
            h.c(fileDescriptor0, 0L, OsConstants.SEEK_SET);
            fileDescriptor1 = fileDescriptor0;
            assetManager$AssetInputStream0 = new FileInputStream(fileDescriptor0);
            goto label_35;
        }
        catch(Exception exception2) {
            exception1 = exception2;
            fileDescriptor1 = fileDescriptor0;
            assetManager$AssetInputStream0 = null;
            goto label_56;
        }
        catch(Throwable throwable0) {
            goto label_64;
        }
        try {
        label_32:
            if(assetManager$AssetInputStream0.markSupported()) {
                assetManager$AssetInputStream0.reset();
                fileDescriptor1 = null;
                goto label_35;
            }
            goto label_47;
        }
        catch(Exception exception3) {
            goto label_54;
        }
        catch(Throwable throwable0) {
            goto label_50;
        }
        try {
        label_35:
            b b0 = new b(assetManager$AssetInputStream0);
            b0.a(this.l + this.p);
            arr_b1 = new byte[this.m];
            b0.readFully(arr_b1);
            this.n = arr_b1;
            goto label_43;
        }
        catch(Exception exception1) {
            goto label_56;
        label_43:
            a.k(assetManager$AssetInputStream0);
            if(fileDescriptor1 != null) {
                a.i(fileDescriptor1);
            }
            return arr_b1;
            try {
            label_47:
                Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                goto label_68;
            label_50:
                fileDescriptor1 = null;
                while(true) {
                    closeable0 = assetManager$AssetInputStream0;
                    goto label_64;
                label_54:
                    exception1 = exception3;
                    fileDescriptor1 = null;
                    break;
                }
            }
            catch(Exception exception3) {
                goto label_54;
            }
            catch(Throwable throwable0) {
                goto label_50;
            }
            try {
            label_56:
                Log.d("ExifInterface", "Encountered exception while getting thumbnail", exception1);
                goto label_60;
            }
            catch(Throwable throwable0) {
            }
            closeable0 = assetManager$AssetInputStream0;
            goto label_64;
        }
        catch(Throwable throwable0) {
            try {
                closeable0 = assetManager$AssetInputStream0;
                goto label_64;
            }
            catch(Exception exception3) {
                goto label_54;
            }
            catch(Throwable throwable0) {
                goto label_50;
            }
        }
    label_60:
        a.k(assetManager$AssetInputStream0);
        if(fileDescriptor1 != null) {
            a.i(fileDescriptor1);
        }
        return null;
    label_64:
        a.k(closeable0);
        if(fileDescriptor1 != null) {
            a.i(fileDescriptor1);
        }
        throw throwable0;
    label_68:
        a.k(assetManager$AssetInputStream0);
        return null;
    }

    @Nullable
    public long[] getThumbnailRange() {
        if(this.t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        return this.i && (!this.j || this.k) ? new long[]{((long)(this.l + this.p)), ((long)this.m)} : null;
    }

    public final void h(g g0) {
        this.k(g0);
        HashMap[] arr_hashMap = this.f;
        d d0 = (d)arr_hashMap[1].get("MakerNote");
        if(d0 != null) {
            g g1 = new g(d0.d);
            g1.c = this.h;
            byte[] arr_b = new byte[ExifInterface.C.length];
            g1.readFully(arr_b);
            g1.b(0L);
            byte[] arr_b1 = ExifInterface.D;
            byte[] arr_b2 = new byte[arr_b1.length];
            g1.readFully(arr_b2);
            if(Arrays.equals(arr_b, ExifInterface.C)) {
                g1.b(8L);
            }
            else if(Arrays.equals(arr_b2, arr_b1)) {
                g1.b(12L);
            }
            this.z(g1, 6);
            d d1 = (d)arr_hashMap[7].get("PreviewImageStart");
            d d2 = (d)arr_hashMap[7].get("PreviewImageLength");
            if(d1 != null && d2 != null) {
                arr_hashMap[5].put("JPEGInterchangeFormat", d1);
                arr_hashMap[5].put("JPEGInterchangeFormatLength", d2);
            }
            d d3 = (d)arr_hashMap[8].get("AspectFrame");
            if(d3 != null) {
                int[] arr_v = (int[])d3.j(this.h);
                if(arr_v == null || arr_v.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(arr_v));
                }
                else {
                    int v = arr_v[2];
                    int v1 = arr_v[0];
                    if(v > v1) {
                        int v2 = arr_v[3];
                        int v3 = arr_v[1];
                        if(v2 > v3) {
                            int v4 = v - v1 + 1;
                            int v5 = v2 - v3 + 1;
                            if(v4 < v5) {
                                int v6 = v4 + v5;
                                v5 = v6 - v5;
                                v4 = v6 - v5;
                            }
                            d d4 = d.e(v4, this.h);
                            d d5 = d.e(v5, this.h);
                            arr_hashMap[0].put("ImageWidth", d4);
                            arr_hashMap[0].put("ImageLength", d5);
                        }
                    }
                }
            }
        }
    }

    public boolean hasAttribute(@NonNull String s) {
        return this.d(s) != null;
    }

    public boolean hasThumbnail() {
        return this.i;
    }

    public final void i(b b0) {
        if(ExifInterface.v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + b0);
        }
        b0.c = ByteOrder.BIG_ENDIAN;
        b0.a(ExifInterface.E.length);
        int v = ExifInterface.E.length;
        try {
            while(true) {
                int v1 = b0.readInt();
                byte[] arr_b = new byte[4];
                b0.readFully(arr_b);
                if(v + 8 == 16 && !Arrays.equals(arr_b, ExifInterface.G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if(Arrays.equals(arr_b, ExifInterface.H)) {
                    break;
                }
                if(Arrays.equals(arr_b, ExifInterface.F)) {
                    byte[] arr_b1 = new byte[v1];
                    b0.readFully(arr_b1);
                    int v2 = b0.readInt();
                    CRC32 cRC320 = new CRC32();
                    cRC320.update(arr_b);
                    cRC320.update(arr_b1);
                    if(((int)cRC320.getValue()) != v2) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + v2 + ", calculated CRC value: " + cRC320.getValue());
                    }
                    this.p = v + 8;
                    this.y(0, arr_b1);
                    this.I();
                    this.F(new b(arr_b1));
                    return;
                }
                b0.a(v1 + 4);
                v = v + v1 + 12;
            }
        }
        catch(EOFException unused_ex) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }

    public boolean isFlipped() {
        switch(this.getAttributeInt("Orientation", 1)) {
            case 2: 
            case 4: 
            case 5: 
            case 7: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    // 去混淆评级： 低(21)
    public static boolean isSupportedMimeType(@NonNull String s) {
        if(s != null) {
            String s1 = s.toLowerCase(Locale.ROOT);
            s1.getClass();
            switch(s1) {
                case "image/heic": 
                case "image/heif": 
                case "image/jpeg": 
                case "image/png": 
                case "image/webp": 
                case "image/x-adobe-dng": 
                case "image/x-canon-cr2": 
                case "image/x-fuji-raf": 
                case "image/x-nikon-nef": 
                case "image/x-nikon-nrw": 
                case "image/x-olympus-orf": 
                case "image/x-panasonic-rw2": 
                case "image/x-pentax-pef": 
                case "image/x-samsung-srw": 
                case "image/x-sony-arw": {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        throw new NullPointerException("mimeType shouldn\'t be null");
    }

    public boolean isThumbnailCompressed() {
        return this.i ? this.o == 6 || this.o == 7 : false;
    }

    public final void j(b b0) {
        boolean z = ExifInterface.v;
        if(z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + b0);
        }
        b0.a(84);
        byte[] arr_b = new byte[4];
        byte[] arr_b1 = new byte[4];
        byte[] arr_b2 = new byte[4];
        b0.readFully(arr_b);
        b0.readFully(arr_b1);
        b0.readFully(arr_b2);
        int v = ByteBuffer.wrap(arr_b).getInt();
        int v1 = ByteBuffer.wrap(arr_b1).getInt();
        int v2 = ByteBuffer.wrap(arr_b2).getInt();
        byte[] arr_b3 = new byte[v1];
        b0.a(v - b0.b);
        b0.readFully(arr_b3);
        this.f(new b(arr_b3), v, 5);
        b0.a(v2 - b0.b);
        b0.c = ByteOrder.BIG_ENDIAN;
        int v3 = b0.readInt();
        if(z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + v3);
        }
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = b0.readUnsignedShort();
            int v6 = b0.readUnsignedShort();
            if(v5 == ExifInterface.W.a) {
                int v7 = b0.readShort();
                int v8 = b0.readShort();
                d d0 = d.e(v7, this.h);
                d d1 = d.e(v8, this.h);
                this.f[0].put("ImageLength", d0);
                this.f[0].put("ImageWidth", d1);
                if(z) {
                    Log.d("ExifInterface", "Updated to length: " + v7 + ", width: " + v8);
                }
                return;
            }
            b0.a(v6);
        }
    }

    public final void k(g g0) {
        this.v(g0);
        this.z(g0, 0);
        this.H(g0, 0);
        this.H(g0, 5);
        this.H(g0, 4);
        this.I();
        if(this.d == 8) {
            HashMap[] arr_hashMap = this.f;
            d d0 = (d)arr_hashMap[1].get("MakerNote");
            if(d0 != null) {
                g g1 = new g(d0.d);
                g1.c = this.h;
                g1.a(6);
                this.z(g1, 9);
                d d1 = (d)arr_hashMap[9].get("ColorSpace");
                if(d1 != null) {
                    arr_hashMap[1].put("ColorSpace", d1);
                }
            }
        }
    }

    public final void l(g g0) {
        if(ExifInterface.v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + g0);
        }
        this.k(g0);
        HashMap[] arr_hashMap = this.f;
        d d0 = (d)arr_hashMap[0].get("JpgFromRaw");
        if(d0 != null) {
            this.f(new b(d0.d), ((int)d0.c), 5);
        }
        d d1 = (d)arr_hashMap[0].get("ISO");
        if(d1 != null && ((d)arr_hashMap[1].get("PhotographicSensitivity")) == null) {
            arr_hashMap[1].put("PhotographicSensitivity", d1);
        }
    }

    public final void m(g g0) {
        g0.a(ExifInterface.e0.length);
        byte[] arr_b = new byte[g0.a.available()];
        g0.readFully(arr_b);
        this.p = ExifInterface.e0.length;
        this.y(0, arr_b);
    }

    public final void n(b b0) {
        if(ExifInterface.v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + b0);
        }
        b0.c = ByteOrder.LITTLE_ENDIAN;
        b0.a(ExifInterface.I.length);
        int v = b0.readInt();
        b0.a(ExifInterface.J.length);
        int v1 = ExifInterface.J.length + 8;
        try {
            while(true) {
                byte[] arr_b = new byte[4];
                b0.readFully(arr_b);
                int v2 = b0.readInt();
                if(Arrays.equals(ExifInterface.K, arr_b)) {
                    byte[] arr_b1 = new byte[v2];
                    b0.readFully(arr_b1);
                    this.p = v1 + 8;
                    this.y(0, arr_b1);
                    this.F(new b(arr_b1));
                    return;
                }
                if(v2 % 2 == 1) {
                    ++v2;
                }
                v1 = v1 + 8 + v2;
                if(v1 == v + 8) {
                    return;
                }
                if(v1 > v + 8) {
                    break;
                }
                b0.a(v2);
            }
            throw new IOException("Encountered WebP file with invalid chunk size");
        }
        catch(EOFException unused_ex) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }

    public static Pair o(String s) {
        if(s.contains(",")) {
            String[] arr_s = s.split(",", -1);
            Pair pair0 = ExifInterface.o(arr_s[0]);
            if(((int)(((Integer)pair0.first))) == 2) {
                return pair0;
            }
            for(int v = 1; v < arr_s.length; ++v) {
                Pair pair1 = ExifInterface.o(arr_s[v]);
                int v1 = ((Integer)pair1.first).equals(pair0.first) || ((Integer)pair1.second).equals(pair0.first) ? ((int)(((Integer)pair0.first))) : -1;
                int v2 = ((int)(((Integer)pair0.second))) == -1 || !((Integer)pair1.first).equals(pair0.second) && !((Integer)pair1.second).equals(pair0.second) ? -1 : ((int)(((Integer)pair0.second)));
                if(v1 == -1 && v2 == -1) {
                    return new Pair(2, -1);
                }
                if(v1 == -1) {
                    pair0 = new Pair(v2, -1);
                }
                else if(v2 == -1) {
                    pair0 = new Pair(v1, -1);
                }
            }
            return pair0;
        }
        if(s.contains("/")) {
            String[] arr_s1 = s.split("/", -1);
            if(arr_s1.length == 2) {
                try {
                    long v3 = (long)Double.parseDouble(arr_s1[0]);
                    long v4 = (long)Double.parseDouble(arr_s1[1]);
                    if(Long.compare(v3, 0L) >= 0 && v4 >= 0L) {
                        return Long.compare(v3, 0x7FFFFFFFL) > 0 || v4 > 0x7FFFFFFFL ? new Pair(5, -1) : new Pair(10, 5);
                    }
                    return new Pair(10, -1);
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            return new Pair(2, -1);
        }
        try {
            long v5 = Long.parseLong(s);
            int v6 = Long.compare(v5, 0L);
            if(v6 >= 0 && v5 <= 0xFFFFL) {
                return new Pair(3, 4);
            }
            return v6 >= 0 ? new Pair(4, -1) : new Pair(9, -1);
        }
        catch(NumberFormatException unused_ex) {
            try {
                Double.parseDouble(s);
                return new Pair(12, -1);
            }
            catch(NumberFormatException unused_ex) {
                return new Pair(2, -1);
            }
        }
    }

    public final void p(b b0, HashMap hashMap0) {
        d d0 = (d)hashMap0.get("JPEGInterchangeFormat");
        d d1 = (d)hashMap0.get("JPEGInterchangeFormatLength");
        if(d0 != null && d1 != null) {
            int v = d0.h(this.h);
            int v1 = d1.h(this.h);
            if(this.d == 7) {
                v += this.q;
            }
            if(v > 0 && v1 > 0) {
                this.i = true;
                if(this.a == null && this.c == null && this.b == null) {
                    byte[] arr_b = new byte[v1];
                    b0.a(v);
                    b0.readFully(arr_b);
                    this.n = arr_b;
                }
                this.l = v;
                this.m = v1;
            }
            if(ExifInterface.v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + v + ", length: " + v1);
            }
        }
    }

    public final void q(String s) {
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        if(s == null) {
            throw new NullPointerException("filename cannot be null");
        }
        try {
            fileInputStream0 = null;
            this.c = null;
            this.a = s;
            fileInputStream1 = new FileInputStream(s);
        }
        catch(Throwable throwable0) {
            a.k(fileInputStream0);
            throw throwable0;
        }
        try {
            this.b = ExifInterface.r(fileInputStream1.getFD()) ? fileInputStream1.getFD() : null;
            this.t(fileInputStream1);
        }
        catch(Throwable throwable0) {
            fileInputStream0 = fileInputStream1;
            a.k(fileInputStream0);
            throw throwable0;
        }
        a.k(fileInputStream1);
    }

    public static boolean r(FileDescriptor fileDescriptor0) {
        try {
            h.c(fileDescriptor0, 0L, OsConstants.SEEK_CUR);
            return true;
        }
        catch(Exception unused_ex) {
            if(ExifInterface.v) {
                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            }
            return false;
        }
    }

    public void resetOrientation() {
        this.setAttribute("Orientation", "1");
    }

    public void rotate(int v) {
        if(v % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int v1 = this.getAttributeInt("Orientation", 1);
        List list0 = ExifInterface.w;
        int v2 = 0;
        if(list0.contains(v1)) {
            int v3 = (v / 90 + list0.indexOf(v1)) % 4;
            if(v3 < 0) {
                v2 = 4;
            }
            v2 = (int)(((Integer)list0.get(v3 + v2)));
        }
        else {
            List list1 = ExifInterface.x;
            if(list1.contains(v1)) {
                int v4 = (v / 90 + list1.indexOf(v1)) % 4;
                if(v4 < 0) {
                    v2 = 4;
                }
                v2 = (int)(((Integer)list1.get(v4 + v2)));
            }
        }
        this.setAttribute("Orientation", Integer.toString(v2));
    }

    public final boolean s(HashMap hashMap0) {
        d d0 = (d)hashMap0.get("ImageLength");
        d d1 = (d)hashMap0.get("ImageWidth");
        return d0 != null && d1 != null && (d0.h(this.h) <= 0x200 && d1.h(this.h) <= 0x200);
    }

    public void saveAttributes() throws IOException {
        Closeable closeable1;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        FileOutputStream fileOutputStream0;
        File file0;
        if(this.d != 4 && this.d != 13 && this.d != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if(this.b == null && this.a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if(this.i && this.j && !this.k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int v = 1;
        this.t = true;
        this.n = this.getThumbnail();
        Closeable closeable0 = null;
        try {
            file0 = File.createTempFile("temp", "tmp");
            if(this.a == null) {
                h.c(this.b, 0L, OsConstants.SEEK_SET);
                fileInputStream0 = new FileInputStream(this.b);
            }
            else {
                fileInputStream0 = new FileInputStream(this.a);
            }
        }
        catch(Exception exception0) {
            fileOutputStream0 = null;
            throw new IOException("Failed to copy original file to temp file", exception0);
        }
        catch(Throwable throwable0) {
            fileOutputStream0 = null;
            a.k(closeable0);
            a.k(fileOutputStream0);
            throw throwable0;
        }
        try {
            fileOutputStream0 = null;
            fileOutputStream0 = new FileOutputStream(file0);
            a.p(fileInputStream0, fileOutputStream0);
            goto label_37;
        }
        catch(Exception exception0) {
            closeable0 = fileInputStream0;
            try {
                throw new IOException("Failed to copy original file to temp file", exception0);
            }
            catch(Throwable throwable0) {
            }
        }
        catch(Throwable throwable0) {
            closeable0 = fileInputStream0;
        }
        a.k(closeable0);
        a.k(fileOutputStream0);
        throw throwable0;
    label_37:
        a.k(fileInputStream0);
        a.k(fileOutputStream0);
        int v1 = 0;
        try {
            fileInputStream1 = new FileInputStream(file0);
            goto label_47;
        }
        catch(Exception exception1) {
        }
        catch(Throwable throwable1) {
            closeable1 = null;
            goto label_113;
        }
        FileOutputStream fileOutputStream1 = null;
        BufferedInputStream bufferedInputStream0 = null;
        closeable1 = null;
        goto label_82;
        try {
            try {
            label_47:
                if(this.a == null) {
                    h.c(this.b, 0L, OsConstants.SEEK_SET);
                    fileOutputStream1 = new FileOutputStream(this.b);
                }
                else {
                    fileOutputStream1 = new FileOutputStream(this.a);
                }
            }
            catch(Exception exception1) {
                goto label_78;
            }
            try {
                bufferedInputStream0 = null;
                bufferedInputStream0 = new BufferedInputStream(fileInputStream1);
                goto label_57;
            }
            catch(Exception exception1) {
            }
        }
        catch(Throwable throwable1) {
            closeable1 = null;
            goto label_113;
        }
        goto label_80;
        try {
        label_57:
            closeable1 = null;
            closeable1 = new BufferedOutputStream(fileOutputStream1);
            int v2 = this.d;
            switch(v2) {
                case 4: {
                    this.C(bufferedInputStream0, ((BufferedOutputStream)closeable1));
                    goto label_118;
                }
                case 13: {
                    this.D(bufferedInputStream0, ((BufferedOutputStream)closeable1));
                    goto label_118;
                }
                default: {
                    if(v2 == 14) {
                        this.E(bufferedInputStream0, ((BufferedOutputStream)closeable1));
                    }
                    goto label_118;
                }
            }
        }
        catch(Exception exception1) {
        }
        catch(Throwable throwable1) {
            closeable0 = bufferedInputStream0;
            goto label_113;
        }
        try {
            while(true) {
                closeable0 = fileInputStream1;
                break;
            label_78:
                fileOutputStream1 = null;
                bufferedInputStream0 = null;
            label_80:
                closeable1 = null;
            }
        }
        catch(Exception exception1) {
            goto label_78;
        }
        catch(Throwable throwable1) {
            closeable1 = null;
            goto label_113;
        }
        try {
        label_82:
            fileInputStream2 = new FileInputStream(file0);
        }
        catch(Exception exception2) {
            throw new IOException("Failed to save new file. Original file is stored in " + file0.getAbsolutePath(), exception2);
        }
        catch(Throwable throwable2) {
            v = 0;
            goto label_104;
        }
        try {
            if(this.a == null) {
                h.c(this.b, 0L, OsConstants.SEEK_SET);
                fileOutputStream2 = new FileOutputStream(this.b);
            }
            else {
                fileOutputStream2 = new FileOutputStream(this.a);
            }
            fileOutputStream1 = fileOutputStream2;
            a.p(fileInputStream2, fileOutputStream1);
            goto label_110;
        }
        catch(Exception exception2) {
            closeable0 = fileInputStream2;
        }
        catch(Throwable throwable2) {
            closeable0 = fileInputStream2;
            v = 0;
            goto label_104;
        }
        try {
            throw new IOException("Failed to save new file. Original file is stored in " + file0.getAbsolutePath(), exception2);
        }
        catch(Throwable throwable2) {
        }
        try {
        label_104:
            a.k(closeable0);
            a.k(fileOutputStream1);
            throw throwable2;
        }
        catch(Throwable throwable1) {
            v1 = v;
            closeable0 = bufferedInputStream0;
            goto label_113;
        }
        try {
        label_110:
            a.k(fileInputStream2);
            a.k(fileOutputStream1);
            throw new IOException("Failed to save new file", exception1);
        }
        catch(Throwable throwable1) {
            closeable0 = bufferedInputStream0;
        }
    label_113:
        a.k(closeable0);
        a.k(closeable1);
        if(v1 == 0) {
            file0.delete();
        }
        throw throwable1;
    label_118:
        a.k(bufferedInputStream0);
        a.k(closeable1);
        file0.delete();
        this.n = null;
    }

    public void setAltitude(double f) {
        this.setAttribute("GPSAltitude", new f(Math.abs(f)).toString());
        this.setAttribute("GPSAltitudeRef", (f >= 0.0 ? "0" : "1"));
    }

    public void setAttribute(@NonNull String s, @Nullable String s1) {
        d d0;
        boolean z3;
        String s2 = s1;
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        if(("DateTime".equals(s) || "DateTimeOriginal".equals(s) || "DateTimeDigitized".equals(s)) && s2 != null) {
            boolean z = ExifInterface.i0.matcher(s2).find();
            boolean z1 = ExifInterface.j0.matcher(s2).find();
            if(s1.length() != 19 || !z && !z1) {
                Log.w("ExifInterface", "Invalid value for " + s + " : " + s2);
                return;
            }
            else if(z1) {
                s2 = s2.replaceAll("-", ":");
            }
        }
        boolean z2 = ExifInterface.v;
        if("ISOSpeedRatings".equals(s)) {
            if(z2) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            s = "PhotographicSensitivity";
        }
        if(s2 != null && ExifInterface.b0.contains(s)) {
            if(s.equals("GPSTimeStamp")) {
                Matcher matcher0 = ExifInterface.h0.matcher(s2);
                if(!matcher0.find()) {
                    Log.w("ExifInterface", "Invalid value for " + s + " : " + s2);
                    return;
                }
                s2 = Integer.parseInt(matcher0.group(1)) + "/1," + Integer.parseInt(matcher0.group(2)) + "/1," + Integer.parseInt(matcher0.group(3)) + "/1";
            }
            else {
                try {
                    s2 = new f(Double.parseDouble(s2)).toString();
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("ExifInterface", "Invalid value for " + s + " : " + s2);
                    return;
                }
            }
        }
        int v = 0;
        while(v < ExifInterface.X.length) {
            if(v != 4 || this.i) {
                e e0 = (e)ExifInterface.a0[v].get(s);
                if(e0 != null) {
                    HashMap[] arr_hashMap = this.f;
                    if(s2 == null) {
                        arr_hashMap[v].remove(s);
                    }
                    else {
                        Pair pair0 = ExifInterface.o(s2);
                        int v1 = e0.c;
                        if(v1 == ((int)(((Integer)pair0.first))) || v1 == ((int)(((Integer)pair0.second)))) {
                        label_59:
                            int[] arr_v = ExifInterface.U;
                            switch(v1) {
                                case 1: {
                                    z3 = z2;
                                    HashMap hashMap0 = arr_hashMap[v];
                                    if(s2.length() != 1 || s2.charAt(0) < 0x30 || s2.charAt(0) > 49) {
                                        byte[] arr_b = s2.getBytes(ExifInterface.d0);
                                        d0 = new d(arr_b, 1, arr_b.length);
                                    }
                                    else {
                                        d0 = new d(new byte[]{((byte)(s2.charAt(0) - 0x30))}, 1, 1);
                                    }
                                    hashMap0.put(s, d0);
                                    goto label_166;
                                }
                                case 3: {
                                    z3 = z2;
                                    String[] arr_s1 = s2.split(",", -1);
                                    int[] arr_v1 = new int[arr_s1.length];
                                    for(int v3 = 0; v3 < arr_s1.length; ++v3) {
                                        arr_v1[v3] = Integer.parseInt(arr_s1[v3]);
                                    }
                                    arr_hashMap[v].put(s, d.f(arr_v1, this.h));
                                    goto label_166;
                                }
                                case 4: {
                                    z3 = z2;
                                    String[] arr_s2 = s2.split(",", -1);
                                    long[] arr_v2 = new long[arr_s2.length];
                                    for(int v4 = 0; v4 < arr_s2.length; ++v4) {
                                        arr_v2[v4] = Long.parseLong(arr_s2[v4]);
                                    }
                                    arr_hashMap[v].put(s, d.c(arr_v2, this.h));
                                    goto label_166;
                                }
                                case 5: {
                                    z3 = z2;
                                    String[] arr_s3 = s2.split(",", -1);
                                    f[] arr_f = new f[arr_s3.length];
                                    for(int v5 = 0; v5 < arr_s3.length; ++v5) {
                                        String[] arr_s4 = arr_s3[v5].split("/", -1);
                                        arr_f[v5] = new f(((long)Double.parseDouble(arr_s4[0])), ((long)Double.parseDouble(arr_s4[1])));
                                    }
                                    arr_hashMap[v].put(s, d.d(arr_f, this.h));
                                    goto label_166;
                                }
                                case 2: 
                                case 7: {
                                    z3 = z2;
                                    arr_hashMap[v].put(s, d.a(s2));
                                    goto label_166;
                                }
                                case 9: {
                                    z3 = z2;
                                    String[] arr_s5 = s2.split(",", -1);
                                    int[] arr_v3 = new int[arr_s5.length];
                                    for(int v6 = 0; v6 < arr_s5.length; ++v6) {
                                        arr_v3[v6] = Integer.parseInt(arr_s5[v6]);
                                    }
                                    HashMap hashMap1 = arr_hashMap[v];
                                    ByteOrder byteOrder0 = this.h;
                                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[arr_v[9] * arr_s5.length]);
                                    byteBuffer0.order(byteOrder0);
                                    for(int v7 = 0; v7 < arr_s5.length; ++v7) {
                                        byteBuffer0.putInt(arr_v3[v7]);
                                    }
                                    hashMap1.put(s, new d(byteBuffer0.array(), 9, arr_s5.length));
                                    goto label_166;
                                }
                                case 10: {
                                    String[] arr_s6 = s2.split(",", -1);
                                    f[] arr_f1 = new f[arr_s6.length];
                                    for(int v8 = 0; v8 < arr_s6.length; ++v8) {
                                        String[] arr_s7 = arr_s6[v8].split("/", -1);
                                        arr_f1[v8] = new f(((long)Double.parseDouble(arr_s7[0])), ((long)Double.parseDouble(arr_s7[1])));
                                    }
                                    z3 = z2;
                                    HashMap hashMap2 = arr_hashMap[v];
                                    ByteOrder byteOrder1 = this.h;
                                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(new byte[arr_v[10] * arr_s6.length]);
                                    byteBuffer1.order(byteOrder1);
                                    for(int v9 = 0; v9 < arr_s6.length; ++v9) {
                                        f f0 = arr_f1[v9];
                                        byteBuffer1.putInt(((int)f0.a));
                                        byteBuffer1.putInt(((int)f0.b));
                                    }
                                    hashMap2.put(s, new d(byteBuffer1.array(), 10, arr_s6.length));
                                    goto label_166;
                                }
                                case 12: {
                                    String[] arr_s8 = s2.split(",", -1);
                                    double[] arr_f2 = new double[arr_s8.length];
                                    for(int v10 = 0; v10 < arr_s8.length; ++v10) {
                                        arr_f2[v10] = Double.parseDouble(arr_s8[v10]);
                                    }
                                    HashMap hashMap3 = arr_hashMap[v];
                                    ByteOrder byteOrder2 = this.h;
                                    ByteBuffer byteBuffer2 = ByteBuffer.wrap(new byte[arr_v[12] * arr_s8.length]);
                                    byteBuffer2.order(byteOrder2);
                                    for(int v11 = 0; v11 < arr_s8.length; ++v11) {
                                        byteBuffer2.putDouble(arr_f2[v11]);
                                    }
                                    hashMap3.put(s, new d(byteBuffer2.array(), 12, arr_s8.length));
                                    break;
                                }
                                default: {
                                    if(z2) {
                                        Log.d("ExifInterface", "Data format isn\'t one of expected formats: " + v1);
                                    }
                                }
                            }
                        }
                        else {
                            int v2 = e0.d;
                            if(v2 != -1 && (v2 == ((int)(((Integer)pair0.first))) || v2 == ((int)(((Integer)pair0.second))))) {
                                v1 = v2;
                                goto label_59;
                            }
                            else if(v1 == 1 || v1 == 2 || v1 == 7) {
                                goto label_59;
                            }
                            else if(z2) {
                                StringBuilder stringBuilder0 = a5.b.v("Given tag (", s, ") value didn\'t match with one of expected formats: ");
                                String[] arr_s = ExifInterface.T;
                                stringBuilder0.append(arr_s[v1]);
                                String s3 = "";
                                stringBuilder0.append((v2 == -1 ? "" : ", " + arr_s[v2]));
                                stringBuilder0.append(" (guess: ");
                                stringBuilder0.append(arr_s[((int)(((Integer)pair0.first)))]);
                                if(((int)(((Integer)pair0.second))) != -1) {
                                    s3 = ", " + arr_s[((int)(((Integer)pair0.second)))];
                                }
                                stringBuilder0.append(s3);
                                stringBuilder0.append(")");
                                Log.d("ExifInterface", stringBuilder0.toString());
                            }
                        }
                    }
                }
            }
            z3 = z2;
        label_166:
            ++v;
            z2 = z3;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    public void setDateTime(@NonNull Long long0) {
        if(long0 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if(((long)long0) < 0L) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String s = Long.toString(((long)long0) % 1000L);
        for(int v = s.length(); v < 3; ++v) {
            s = "0" + s;
        }
        Date date0 = new Date(((long)long0));
        this.setAttribute("DateTime", ExifInterface.R.format(date0));
        this.setAttribute("SubSecTime", s);
    }

    public void setGpsInfo(Location location0) {
        if(location0 == null) {
            return;
        }
        this.setAttribute("GPSProcessingMethod", location0.getProvider());
        this.setLatLong(location0.getLatitude(), location0.getLongitude());
        this.setAltitude(location0.getAltitude());
        this.setAttribute("GPSSpeedRef", "K");
        this.setAttribute("GPSSpeed", new f(((double)(location0.getSpeed() * ((float)TimeUnit.HOURS.toSeconds(1L)) / 1000.0f))).toString());
        Date date0 = new Date(location0.getTime());
        String[] arr_s = ExifInterface.R.format(date0).split("\\s+", -1);
        this.setAttribute("GPSDateStamp", arr_s[0]);
        this.setAttribute("GPSTimeStamp", arr_s[1]);
    }

    public void setLatLong(double f, double f1) {
        if(Double.compare(f, -90.0) < 0 || f > 90.0 || Double.isNaN(f)) {
            throw new IllegalArgumentException("Latitude value " + f + " is not valid.");
        }
        if(f1 < -180.0 || f1 > 180.0 || Double.isNaN(f1)) {
            throw new IllegalArgumentException("Longitude value " + f1 + " is not valid.");
        }
        this.setAttribute("GPSLatitudeRef", (f >= 0.0 ? "N" : "S"));
        this.setAttribute("GPSLatitude", ExifInterface.b(Math.abs(f)));
        this.setAttribute("GPSLongitudeRef", (f1 >= 0.0 ? "E" : "W"));
        this.setAttribute("GPSLongitude", ExifInterface.b(Math.abs(f1)));
    }

    public final void t(InputStream inputStream0) {
        boolean z = ExifInterface.v;
        try {
            for(int v = 0; v < ExifInterface.X.length; ++v) {
                this.f[v] = new HashMap();
            }
            boolean z1 = this.e;
            if(!z1) {
                BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0, 5000);
                this.d = this.g(bufferedInputStream0);
                inputStream0 = bufferedInputStream0;
            }
            if(this.d == 4 || this.d == 9 || this.d == 13 || this.d == 14) {
                b b0 = new b(inputStream0);
                int v2 = this.d;
                switch(v2) {
                    case 4: {
                        this.f(b0, 0, 0);
                        break;
                    }
                    case 9: {
                        this.j(b0);
                        break;
                    }
                    case 13: {
                        this.i(b0);
                        break;
                    }
                    default: {
                        if(v2 == 14) {
                            this.n(b0);
                        }
                    }
                }
            }
            else {
                g g0 = new g(inputStream0);
                if(z1) {
                    this.m(g0);
                }
                else {
                    int v1 = this.d;
                    if(v1 == 12) {
                        this.e(g0);
                    }
                    else {
                        switch(v1) {
                            case 7: {
                                this.h(g0);
                                break;
                            }
                            case 10: {
                                this.l(g0);
                                break;
                            }
                            default: {
                                this.k(g0);
                            }
                        }
                    }
                }
                g0.b(((long)this.p));
                this.F(g0);
            }
        }
        catch(IOException | UnsupportedOperationException iOException0) {
            if(z) {
                try {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", iOException0);
                }
                catch(Throwable throwable0) {
                    goto label_48;
                }
            }
            this.a();
            if(z) {
                this.w();
                return;
            }
            return;
        }
        catch(Throwable throwable0) {
        label_48:
            this.a();
            if(z) {
                this.w();
            }
            throw throwable0;
        }
        this.a();
        if(z) {
            this.w();
        }
    }

    public static Long u(String s, String s1, String s2) {
        long v5;
        if(s != null && ExifInterface.g0.matcher(s).matches()) {
            ParsePosition parsePosition0 = new ParsePosition(0);
            try {
                Date date0 = ExifInterface.R.parse(s, parsePosition0);
                if(date0 == null) {
                    date0 = ExifInterface.S.parse(s, parsePosition0);
                    if(date0 == null) {
                        return null;
                    }
                }
                long v = date0.getTime();
                if(s2 != null) {
                    int v1 = 1;
                    String s3 = s2.substring(0, 1);
                    int v2 = Integer.parseInt(s2.substring(1, 3));
                    int v3 = Integer.parseInt(s2.substring(4, 6));
                    if(("+".equals(s3) || "-".equals(s3)) && (":".equals(s2.substring(3, 4)) && v2 <= 14)) {
                        if(!"-".equals(s3)) {
                            v1 = -1;
                        }
                        v += (long)((v2 * 60 + v3) * 60000 * v1);
                    }
                }
                if(s1 != null) {
                    try {
                        int v4 = Math.min(s1.length(), 3);
                        v5 = 0L;
                        v5 = Long.parseLong(s1.substring(0, v4));
                        while(v4 < 3) {
                            v5 *= 10L;
                            ++v4;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                    v += v5;
                }
                return v;
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return null;
    }

    public final void v(g g0) {
        ByteOrder byteOrder0 = ExifInterface.x(g0);
        this.h = byteOrder0;
        g0.c = byteOrder0;
        int v = g0.readUnsignedShort();
        if(this.d != 7 && this.d != 10 && v != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(v));
        }
        int v1 = g0.readInt();
        if(v1 < 8) {
            throw new IOException("Invalid first Ifd offset: " + v1);
        }
        if(v1 - 8 > 0) {
            g0.a(v1 - 8);
        }
    }

    public final void w() {
        for(int v = 0; true; ++v) {
            HashMap[] arr_hashMap = this.f;
            if(v >= arr_hashMap.length) {
                break;
            }
            StringBuilder stringBuilder0 = a5.b.s(v, "The size of tag group[", "]: ");
            stringBuilder0.append(arr_hashMap[v].size());
            Log.d("ExifInterface", stringBuilder0.toString());
            for(Object object0: arr_hashMap[v].entrySet()) {
                d d0 = (d)((Map.Entry)object0).getValue();
                Log.d("ExifInterface", "tagName: " + ((String)((Map.Entry)object0).getKey()) + ", tagType: " + d0.toString() + ", tagValue: \'" + d0.i(this.h) + "\'");
            }
        }
    }

    public static ByteOrder x(b b0) {
        int v = b0.readShort();
        boolean z = ExifInterface.v;
        switch(v) {
            case 0x4949: {
                if(z) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align II");
                }
                return ByteOrder.LITTLE_ENDIAN;
            }
            case 0x4D4D: {
                if(z) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            default: {
                throw new IOException("Invalid byte order: " + Integer.toHexString(v));
            }
        }
    }

    public final void y(int v, byte[] arr_b) {
        g g0 = new g(arr_b);
        this.v(g0);
        this.z(g0, v);
    }

    // This method was un-flattened
    public final void z(g g0, int v) {
        long v14;
        int v13;
        int v12;
        long v11;
        HashSet hashSet2;
        HashMap[] arr_hashMap1;
        HashSet hashSet1;
        int v7;
        HashSet hashSet0 = this.g;
        hashSet0.add(g0.b);
        int v1 = g0.readShort();
        boolean z = ExifInterface.v;
        if(z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + v1);
        }
        if(v1 <= 0) {
            return;
        }
        int v2 = 0;
        while(true) {
            HashMap[] arr_hashMap = this.f;
            if(v2 >= v1) {
                break;
            }
            int v3 = g0.readUnsignedShort();
            int v4 = g0.readUnsignedShort();
            int v5 = g0.readInt();
            long v6 = ((long)g0.b) + 4L;
            e e0 = (e)ExifInterface.Z[v].get(v3);
            if(z) {
                v7 = v2;
                hashSet1 = hashSet0;
                arr_hashMap1 = arr_hashMap;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", v, v3, (e0 == null ? null : e0.b), v4, v5));
            }
            else {
                hashSet1 = hashSet0;
                v7 = v2;
                arr_hashMap1 = arr_hashMap;
            }
            if(e0 == null) {
                if(z) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + v3);
                }
                g0.b(v6);
                hashSet2 = hashSet1;
            }
            else if(v4 > 0) {
                int[] arr_v = ExifInterface.U;
                if(v4 < arr_v.length) {
                    int v8 = e0.c;
                    if(v8 == 7 || v4 == 7 || v8 == v4 || (e0.d == v4 || (v8 == 4 || e0.d == 4) && v4 == 3 || (v8 == 9 || e0.d == 9) && v4 == 8 || (v8 == 12 || e0.d == 12) && v4 == 11)) {
                        if(v4 == 7) {
                            v4 = v8;
                        }
                        long v9 = ((long)arr_v[v4]) * ((long)v5);
                        if(v9 >= 0L && v9 <= 0x7FFFFFFFL) {
                            if(Long.compare(v9, 4L) > 0) {
                                int v10 = g0.readInt();
                                if(z) {
                                    v11 = v6;
                                    Log.d("ExifInterface", "seek to data offset: " + v10);
                                }
                                else {
                                    v11 = v6;
                                }
                                if(this.d != 7) {
                                label_71:
                                    v13 = v4;
                                    v12 = v5;
                                }
                                else if("MakerNote".equals(e0.b)) {
                                    this.q = v10;
                                    goto label_71;
                                }
                                else if(v == 6 && "ThumbnailImage".equals(e0.b)) {
                                    this.r = v10;
                                    this.s = v5;
                                    d d0 = d.e(6, this.h);
                                    v12 = v5;
                                    d d1 = d.b(this.r, this.h);
                                    v13 = v4;
                                    d d2 = d.b(this.s, this.h);
                                    arr_hashMap1[4].put("Compression", d0);
                                    arr_hashMap1[4].put("JPEGInterchangeFormat", d1);
                                    arr_hashMap1[4].put("JPEGInterchangeFormatLength", d2);
                                }
                                g0.b(((long)v10));
                            }
                            else {
                                v11 = v6;
                                v13 = v4;
                                v12 = v5;
                            }
                            Integer integer0 = (Integer)ExifInterface.c0.get(v3);
                            if(z) {
                                Log.d("ExifInterface", "nextIfdType: " + integer0 + " byteCount: " + v9);
                            }
                            if(integer0 == null) {
                                hashSet2 = hashSet1;
                                int v16 = g0.b + this.p;
                                byte[] arr_b = new byte[((int)v9)];
                                g0.readFully(arr_b);
                                d d3 = new d(((long)v16), arr_b, v13, v12);
                                arr_hashMap1[v].put(e0.b, d3);
                                String s = e0.b;
                                if("DNGVersion".equals(s)) {
                                    this.d = 3;
                                }
                                if(("Make".equals(s) || "Model".equals(s)) && d3.i(this.h).contains("PENTAX") || "Compression".equals(s) && d3.h(this.h) == 0xFFFF) {
                                    this.d = 8;
                                }
                                if(((long)g0.b) != v11) {
                                    g0.b(v11);
                                }
                            }
                            else {
                                switch(v13) {
                                    case 3: {
                                        v14 = (long)g0.readUnsignedShort();
                                        break;
                                    }
                                    case 4: {
                                        v14 = ((long)g0.readInt()) & 0xFFFFFFFFL;
                                        break;
                                    }
                                    case 8: {
                                        v14 = (long)g0.readShort();
                                        break;
                                    }
                                    case 9: 
                                    case 13: {
                                        v14 = (long)g0.readInt();
                                        break;
                                    }
                                    default: {
                                        v14 = -1L;
                                    }
                                }
                                if(z) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", v14, e0.b));
                                }
                                int v15 = g0.e;
                                if(Long.compare(v14, 0L) > 0 && (v15 == -1 || v14 < ((long)v15))) {
                                    hashSet2 = hashSet1;
                                    if(!hashSet2.contains(((int)v14))) {
                                        g0.b(v14);
                                        this.z(g0, ((int)integer0));
                                    }
                                    else if(z) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + integer0 + " (at " + v14 + ")");
                                    }
                                }
                                else {
                                    hashSet2 = hashSet1;
                                    if(z) {
                                        Log.d("ExifInterface", (v15 == -1 ? q.n(v14, "Skip jump into the IFD since its offset is invalid: ") : q.n(v14, "Skip jump into the IFD since its offset is invalid: ") + " (total length: " + v15 + ")"));
                                    }
                                }
                                g0.b(v11);
                            }
                        }
                        else {
                            if(z) {
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + v5);
                            }
                            goto label_125;
                        }
                    }
                    else {
                        if(z) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + ExifInterface.T[v4] + ") is unexpected for tag: " + e0.b);
                        }
                        g0.b(v6);
                        hashSet2 = hashSet1;
                    }
                }
                else {
                    goto label_123;
                }
            }
            else {
            label_123:
                if(z) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + v4);
                }
            label_125:
                g0.b(v6);
                hashSet2 = hashSet1;
            }
            v2 = (short)(v7 + 1);
            hashSet0 = hashSet2;
        }
        int v17 = g0.readInt();
        if(z) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", v17));
        }
        if(((long)v17) > 0L) {
            if(!hashSet0.contains(v17)) {
                g0.b(((long)v17));
                if(arr_hashMap[4].isEmpty()) {
                    this.z(g0, 4);
                    return;
                }
                if(arr_hashMap[5].isEmpty()) {
                    this.z(g0, 5);
                }
            }
            else if(z) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + v17);
            }
        }
        else if(z) {
            Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + v17);
        }
    }
}

