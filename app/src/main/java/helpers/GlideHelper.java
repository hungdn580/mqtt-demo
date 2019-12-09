package helpers;

import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.frost.mqtttutorial.R;

/**
 * Created by tung on 7/22/17.
 */

public class GlideHelper {
    public static void loadUrl(@NonNull String url, @NonNull ImageView image) {

        DisplayMetrics metrics = image.getResources().getDisplayMetrics();
        final int displayWidth = metrics.widthPixels;
        final int displayHeight = metrics.heightPixels;
        Glide.with(image.getContext())
                .load(url)
                .asBitmap()
                .dontAnimate().error(R.drawable.ic_error_image)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(new BitmapImageViewTarget(image) {
                    @Override
                    public void getSize(final SizeReadyCallback cb) {
                        // We don't want to load very big images on devices with small screens.
                        // This will help Glide correctly choose images scale when reading them.
                        super.getSize(new SizeReadyCallback() {
                            @Override
                            public void onSizeReady(int width, int height) {
                                cb.onSizeReady(displayWidth / 2, displayHeight / 2);
                            }
                        });
                    }
                });
    }
    public static void loadUrlNewFeed(@NonNull String url, @NonNull ImageView image) {

//        DisplayMetrics metrics = image.getResources().getDisplayMetrics();
//        final int displayWidth = metrics.widthPixels;
//        final int displayHeight = metrics.heightPixels;
        Glide.with(image.getContext())
                .load(url)
                .asBitmap()
                .dontAnimate().error(R.drawable.ic_error_image)
                .placeholder(R.drawable.ic_error_image).diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(new BitmapImageViewTarget(image) {
//                    @Override
//                    public void getSize(final SizeReadyCallback cb) {
//                        // We don't want to load very big images on devices with small screens.
//                        // This will help Glide correctly choose images scale when reading them.
//                        super.getSize(new SizeReadyCallback() {
//                            @Override
//                            public void onSizeReady(int width, int height) {
//                                cb.onSizeReady(displayWidth / 2, displayHeight / 2);
//                            }
//                        });
//                    }
//                });
                .into(image);
    }
    public static void loadUrlAvatar(@NonNull String url, @NonNull ImageView image) {

//        DisplayMetrics metrics = image.getResources().getDisplayMetrics();
//        final int displayWidth = metrics.widthPixels;
//        final int displayHeight = metrics.heightPixels;
        Glide.with(image.getContext())
                .load(url)
                .asBitmap()
                .dontAnimate().error(R.drawable.ic_error_image)
                .placeholder(R.drawable.ic_error_image).diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(new BitmapImageViewTarget(image) {
//                    @Override
//                    public void getSize(final SizeReadyCallback cb) {
//                        // We don't want to load very big images on devices with small screens.
//                        // This will help Glide correctly choose images scale when reading them.
//                        super.getSize(new SizeReadyCallback() {
//                            @Override
//                            public void onSizeReady(int width, int height) {
//                                cb.onSizeReady(displayWidth / 2, displayHeight / 2);
//                            }
//                        });
//                    }
//                });
        .into(image);
    }

}

