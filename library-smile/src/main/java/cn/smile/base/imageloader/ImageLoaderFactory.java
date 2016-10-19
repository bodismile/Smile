package cn.smile.base.imageloader;

/**图片加载工厂：内部集成了glide和uil两种图片加载方式
 * @author smile
 */
public class ImageLoaderFactory {

    private static volatile ILoader sInstance;

    private ImageLoaderFactory() {}

    public static ILoader getLoader() {
        if (sInstance == null) {
            synchronized (ImageLoaderFactory.class) {
                if (sInstance == null) {
//                    if (Utils.hasClass("com.bumptech.glide.Glide")) {
                        sInstance = new GlideImageLoader();
//                    }
//                    else if(Utils.hasClass("com.nostra13.universalimageloader.core.ImageLoader")){
//                        sInstance = new UILImageLoader();
//                    }
                }
            }
        }
        return sInstance;
    }
}
