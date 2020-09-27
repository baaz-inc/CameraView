package com.otaliastudios.cameraview.frame;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(Build.VERSION_CODES.KITKAT)
public class ImageReaderFrameManager extends FrameManager<ImageReader> {

    public ImageReaderFrameManager(int poolSize) {
        super(poolSize, ImageReader.class);
    }

    @Override
    protected void onFrameDataReleased(@NonNull ImageReader data, boolean recycled) {
        // Don't close the Image reader because we are closing it in our implementation
//        try {
//            data.close();
//        } catch (Exception ignore) {}
    }

    @NonNull
    @Override
    protected ImageReader onCloneFrameData(@NonNull ImageReader data) {
        throw new RuntimeException("Cannot freeze() an Image Frame. " +
                "Please consider using the frame synchronously in your process() method, " +
                "which also gives better performance.");
    }
}
